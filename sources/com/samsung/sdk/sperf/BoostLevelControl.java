package com.samsung.sdk.sperf;

import X.C64;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class BoostLevelControl {
    public static int boostResourceCount;
    public static BoostResource[] boostResources = new BoostResource[11];
    public static BoostLevelControl instance;
    public static boolean isBoostLevelIntialized;
    public HashMap<Integer, BoostObject> scenarioBoostObjectMap = new HashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ea, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01eb, code lost:
    
        r6 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BoostLevelControl(com.samsung.sdk.sperf.SessionControl r19) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.sdk.sperf.BoostLevelControl.<init>(com.samsung.sdk.sperf.SessionControl):void");
    }

    public static BoostLevelControl createInstance(SessionControl sessionControl) {
        if (instance == null) {
            instance = new BoostLevelControl(sessionControl);
            if (!isBoostLevelIntialized || boostResourceCount <= 0) {
                instance = null;
            }
        }
        return instance;
    }

    public static BoostResource getBoostResource(int i) {
        if (i < 0 || i >= 11) {
            return null;
        }
        return boostResources[i];
    }

    public static int getRealBoostLevel(int i, int i2) {
        if (instance != null && i2 >= 0 && i2 < 11) {
            return boostResources[i2].getRealBoostLevel(i);
        }
        return -1;
    }

    public static int getRealBoostLevel(BoostObject boostObject, int i) {
        if (instance != null && i >= 0 && i < 11) {
            return boostResources[i].getRealBoostLevel(boostObject.getLevel(i));
        }
        return -1;
    }

    private void initScenarioBoostObject() {
        BoostObject boostObject = new BoostObject();
        boostObject.update(0, 2, 64532198);
        boostObject.update(6, 1, 64532198);
        this.scenarioBoostObjectMap.put(64, boostObject);
        BoostObject boostObject2 = new BoostObject();
        boostObject2.update(2, 2, 64532198);
        this.scenarioBoostObjectMap.put(128, boostObject2);
        BoostObject boostObject3 = new BoostObject();
        boostObject3.update(4, 2, 64532198);
        this.scenarioBoostObjectMap.put(256, boostObject3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r3 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.samsung.sdk.sperf.BoostObject getBoostObjectByScenario(int r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            r2 = 64
            r3 = r4
        L4:
            r0 = r2 & r6
            if (r0 != r2) goto L27
            java.util.HashMap<java.lang.Integer, com.samsung.sdk.sperf.BoostObject> r1 = r5.scenarioBoostObjectMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            com.samsung.sdk.sperf.BoostObject r0 = (com.samsung.sdk.sperf.BoostObject) r0
            if (r0 == 0) goto L24
            if (r3 != 0) goto L1d
            com.samsung.sdk.sperf.BoostObject r3 = new com.samsung.sdk.sperf.BoostObject
            r3.<init>()
        L1d:
            boolean r0 = r3.combineBoostObject(r0)
            if (r0 != 0) goto L27
            return r4
        L24:
            if (r3 == 0) goto L27
            goto L1d
        L27:
            int r2 = r2 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r2 > r0) goto L2e
            goto L4
        L2e:
            if (r3 != 0) goto L31
            return r4
        L31:
            r2 = 0
        L32:
            int r1 = r3.getLevel(r2)
            r0 = 64532198(0x3d8aee6, float:1.2735494E-36)
            if (r1 == r0) goto L3e
            r3.update(r2, r1, r7)
        L3e:
            int r2 = r2 + 1
            r0 = 11
            if (r2 >= r0) goto L45
            goto L32
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.sdk.sperf.BoostLevelControl.getBoostObjectByScenario(int, int):com.samsung.sdk.sperf.BoostObject");
    }

    public int updateBoost(int i, int i2, int i3, BoostObject boostObject) {
        BoostResource boostResource;
        StringBuilder sb;
        if (i >= 0) {
            BoostResource[] boostResourceArr = boostResources;
            if (i >= boostResourceArr.length || boostObject == null || (boostResource = boostResourceArr[i]) == null) {
                return -1;
            }
            int adjustLevel = boostResource.adjustLevel(i2);
            int adjustTimeout = boostResources[i].adjustTimeout(i3);
            if (adjustLevel != i2) {
                sb = new StringBuilder("Requested Boost Level is not available : ");
                sb.append(i2);
            } else {
                if (adjustTimeout == i3) {
                    return boostObject.update(i, adjustLevel, adjustTimeout);
                }
                sb = new StringBuilder("Requested Boost timeout is not available : ");
                sb.append(i3);
            }
            SPerfUtil.log(sb.toString());
            return -1;
        }
        return -1;
    }

    public static int setBoostResource(int i, int[] iArr, int i2) {
        if (i < 0 || i >= 11 || boostResources[i] != null) {
            return -1;
        }
        SPerfUtil.log(C64.LIZIZ("====setBoostResource==== type : ", i));
        boostResourceCount++;
        boostResources[i] = new BoostResource(iArr, i2);
        return boostResourceCount;
    }
}
