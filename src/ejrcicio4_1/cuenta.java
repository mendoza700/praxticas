package ejrcicio4_1;

public class cuenta {
        protected float saldo;
        protected int numeroConsignaciones = 0;
        protected int numeroRetiros = 0;
        protected float tasaAnual;
        protected float comisionMensual = 0;

        public cuenta(float saldo, float tasaAnual) {
            this.saldo = saldo;
            this.tasaAnual = tasaAnual;
        }

        public void consignar(float cantidad) {
            saldo += cantidad;
            numeroConsignaciones++;
        }

        public void retirar(float cantidad) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                numeroRetiros++;
            } else {
                System.out.println("La cantidad a retirar excede el saldo actual.");
            }
        }

        public void calcularInteres() {
            float tasaMensual = tasaAnual / 12;
            float interesMensual = saldo * tasaMensual;
            saldo += interesMensual;
        }

        public void extractoMensual() {
            saldo -= comisionMensual;
            calcularInteres();
        }
    }



