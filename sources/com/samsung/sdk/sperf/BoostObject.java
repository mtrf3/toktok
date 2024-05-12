package com.samsung.sdk.sperf;

import X.C16880lQ;

/* loaded from: classes12.dex */
public class BoostObject {
    public static int[] priority;
    public int id;
    public int[] levels;
    public int[] timeouts;

    static {
        int[] iArr = new int[11];
        priority = iArr;
        iArr[0] = 1;
    }

    public BoostObject() {
        this.id = -1;
        this.levels = new int[11];
        this.timeouts = new int[11];
        int i = 0;
        do {
            this.levels[i] = 64532198;
            this.timeouts[i] = 64532198;
            i++;
        } while (i < 11);
    }

    public BoostObject(int[] iArr, int[] iArr2) {
        this.id = -1;
        this.levels = new int[iArr.length];
        this.timeouts = new int[iArr2.length];
        for (int i = 0; i < iArr.length; i++) {
            this.levels[i] = iArr[i];
        }
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.timeouts[i2] = iArr2[i2];
        }
    }

    public boolean combineBoostObject(BoostObject boostObject) {
        if (boostObject == null) {
            return false;
        }
        for (int i = 0; i < this.levels.length; i++) {
            try {
                int level = boostObject.getLevel(i);
                if (level != 64532198) {
                    int[] iArr = this.levels;
                    int i2 = iArr[i];
                    if (i2 != 64532198) {
                        int[] iArr2 = this.timeouts;
                        if (iArr2[i] != 64532198) {
                            int i3 = priority[i];
                            if (i3 == 0) {
                                if (i2 < level) {
                                    iArr[i] = level;
                                    iArr2[i] = boostObject.getTimeout(i);
                                }
                            } else if (i3 == 1) {
                                if (i2 > level) {
                                    iArr[i] = level;
                                    iArr2[i] = boostObject.getTimeout(i);
                                }
                            } else if (i3 == 2) {
                                iArr[i] = level;
                                iArr2[i] = boostObject.getTimeout(i);
                            }
                        }
                    }
                    iArr[i] = level;
                    this.timeouts[i] = boostObject.getTimeout(i);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
                SPerfUtil.log("Combine Boost Object has array out of bounds on type : " + i);
                return false;
            }
        }
        return true;
    }

    public BoostObject copyBoostObject() {
        return new BoostObject(this.levels, this.timeouts);
    }

    public int getID() {
        return this.id;
    }

    public int getLevel(int i) {
        if (i < 0 || i >= 11) {
            return 64532198;
        }
        return this.levels[i];
    }

    public int getTimeout(int i) {
        if (i < 0 || i >= 11) {
            return 64532198;
        }
        return this.timeouts[i];
    }

    public void setID(int i) {
        this.id = i;
    }

    public int update(int i, int i2, int i3) {
        if (i > 11 || i < 0) {
            return -1;
        }
        this.levels[i] = i2;
        this.timeouts[i] = i3;
        SPerfUtil.log("Update Boost - type : " + i + "   level : " + this.levels[i] + "   timeouts : " + this.timeouts[i]);
        return 0;
    }
}
