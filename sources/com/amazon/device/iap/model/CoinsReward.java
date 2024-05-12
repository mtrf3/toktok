package com.amazon.device.iap.model;

/* loaded from: classes.dex */
public final class CoinsReward {
    public final int amount;

    public int getAmount() {
        return this.amount;
    }

    public CoinsReward(int i) {
        this.amount = i;
    }

    public static final CoinsReward from(int i) {
        if (i > 0) {
            return new CoinsReward(i);
        }
        return null;
    }
}
