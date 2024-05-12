package com.samsung.sdk.sperf;

/* loaded from: classes12.dex */
public class CustomParams {
    public static SPerfManager sPerfManager;
    public BoostObject boostObj;
    public boolean isBoostObjUpdated;

    public static int getBoostType(int i) {
        return (i == 8 || i == 9) ? 1 : 0;
    }

    public int add(int i, int i2, int i3) {
        synchronized (this) {
            if (this.boostObj == null) {
                this.boostObj = new BoostObject();
                this.isBoostObjUpdated = false;
            }
            if (sPerfManager == null) {
                SPerfManager createInstance = SPerfManager.createInstance(null);
                sPerfManager = createInstance;
                if (createInstance == null) {
                    return -1;
                }
            }
            int updateBoost = sPerfManager.updateBoost(i, i2, i3, this.boostObj);
            if (updateBoost >= 0) {
                this.isBoostObjUpdated = true;
            }
            return updateBoost;
        }
    }

    public BoostObject getBoostObject() {
        if (this.isBoostObjUpdated) {
            return this.boostObj;
        }
        return null;
    }
}
