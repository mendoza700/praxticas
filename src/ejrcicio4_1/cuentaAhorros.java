package ejrcicio4_1;

import ejrcicio4_1.cuenta;

public class cuentaAhorros  extends cuenta {
        private boolean activa;

        public cuentaAhorros(float saldo, float tasa) {
            super(saldo, tasa);
            activa = saldo >= 10000;
        }

        public void retirar(float cantidad) {
            if (activa) {
                super.retirar(cantidad);
            }
        }

        public void consignar(float cantidad) {
            if (activa) {
                super.consignar(cantidad);
            }
        }

        public void extractoMensual() {
            if (numeroRetiros > 4) {
                comisionMensual += (numeroRetiros - 4) * 1000;
            }
            super.extractoMensual();
            activa = saldo >= 10000;
        }

        public void imprimir() {
            System.out.println("Saldo = $" + saldo);
            System.out.println("Comisión mensual = $" + comisionMensual);
            System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
            System.out.println();
        }
    }


