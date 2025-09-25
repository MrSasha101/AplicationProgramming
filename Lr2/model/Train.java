package model;

    public class Train {
        private String destination;
        private int trainNumber;
        private String departureTime;
        private int generalSeats;
        private int coupeSeats;
        private int reservedSeats;
        private int luxSeats;

        public Train(String destination, int trainNumber, String departureTime,
                     int generalSeats, int coupeSeats, int reservedSeats, int luxSeats) {
            this.destination = destination;
            this.trainNumber = trainNumber;
            this.departureTime = departureTime;
            this.generalSeats = generalSeats;
            this.coupeSeats = coupeSeats;
            this.reservedSeats = reservedSeats;
            this.luxSeats = luxSeats;
        }
        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public int getTrainNumber() {
            return trainNumber;
        }

        public void setTrainNumber(int trainNumber) {
            this.trainNumber = trainNumber;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }

        public int getGeneralSeats() {
            return generalSeats;
        }

        public void setGeneralSeats(int generalSeats) {
            this.generalSeats = generalSeats;
        }

        public int getCoupeSeats() {
            return coupeSeats;
        }

        public void setCoupeSeats(int coupeSeats) {
            this.coupeSeats = coupeSeats;
        }

        public int getReservedSeats() {
            return reservedSeats;
        }

        public void setReservedSeats(int reservedSeats) {
            this.reservedSeats = reservedSeats;
        }

        public int getLuxSeats() {
            return luxSeats;
        }

        public void setLuxSeats(int luxSeats) {
            this.luxSeats = luxSeats;
        }

        @Override
        public String toString() {
            return "Train №" + trainNumber +
                    " → " + destination +
                    ", departure: " + departureTime +
                    ", seats [general=" + generalSeats +
                    ", coupe=" + coupeSeats +
                    ", reserved=" + reservedSeats +
                    ", lux=" + luxSeats + "]";
        }
    }
