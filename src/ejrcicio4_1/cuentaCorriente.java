package ejrcicio4_1;

public class cuentaCorriente {
        float sobregiro;

        public cuentaCorriente(float saldo, float tasa) {
            super(saldo, tasa);
            sobregiro = 0;
        }

        public void retirar(float cantidad) {
            float resultado = saldo - cantidad;
            if (resultado < 0) {
                sobregiro = sobregiro - resultado;
                saldo = 0;
            } else {
                super.retirar(cantidad);
            }
        }

        public void consignar(float cantidad) {
            if (sobregiro > 0) {
                if (cantidad <= sobregiro) {
                    sobregiro -= cantidad;
                } else {
                    super.consignar(cantidad - sobregiro);
                    sobregiro = 0;
                }
            } else {
                super.consignar(cantidad);
            }
        }

        public void extractoMensual() {
            super.extractoMensual();
            if (saldo < 0) {
                sobregiro = -saldo;
                saldo = 0;
            }
        }
    }


