package com.BSF.Banking.model;

import java.util.List;

public class ChallengeResponse {
        private List<IVRactivateBen> nextChallenges;

        // Getters and setters
        public List<IVRactivateBen> getNextChallenges() {
            return nextChallenges;
        }

        public void setNextChallenges(List<IVRactivateBen> nextChallenges) {
            this.nextChallenges = nextChallenges;
        }

        @Override
        public String toString() {
            return "ChallengeResponse{" +
                    "nextChallenges=" + nextChallenges +
                    '}';
        }
    }

