package com.tiktok.ttm;

import X.PTH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes12.dex */
public final class TTMParamData {
    public static boolean DEBUG;
    public final Object inputData;
    public final int type;

    public static TTMParamData newEmptyListData() {
        return new TTMParamData((Collection<Object>) new ArrayList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int GetArraySize() {
        /*
            r3 = this;
            X.PTH r2 = X.PTH.LIZ()
            int r1 = r3.type     // Catch: java.lang.Throwable -> L21
            r0 = 1
            if (r1 != r0) goto L1a
            java.lang.Object r0 = r3.inputData     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto Le
            goto L1a
        Le:
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L21
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L19
            java.lang.System.nanoTime()
        L19:
            return r0
        L1a:
            if (r2 == 0) goto L1f
            java.lang.System.nanoTime()
        L1f:
            r0 = 0
            return r0
        L21:
            r0 = move-exception
            if (r2 == 0) goto L27
            java.lang.System.nanoTime()
        L27:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.ttm.TTMParamData.GetArraySize():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        return -1.0d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double GetDoubleValue() {
        /*
            r3 = this;
            X.PTH r2 = X.PTH.LIZ()
            int r1 = r3.type     // Catch: java.lang.Throwable -> L22
            r0 = 2
            if (r1 != r0) goto L1a
            java.lang.Object r0 = r3.inputData     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto Le
            goto L1a
        Le:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L22
            double r0 = r0.doubleValue()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L19
            java.lang.System.nanoTime()
        L19:
            return r0
        L1a:
            if (r2 == 0) goto L1f
            java.lang.System.nanoTime()
        L1f:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r0
        L22:
            r0 = move-exception
            if (r2 == 0) goto L28
            java.lang.System.nanoTime()
        L28:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.ttm.TTMParamData.GetDoubleValue():double");
    }

    public int GetIntValue() {
        PTH LIZ = PTH.LIZ();
        try {
            if (this.type != 2) {
            }
            Object obj = this.inputData;
            if (obj instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (LIZ != null) {
                    System.nanoTime();
                }
                return booleanValue ? 1 : 0;
            }
            int intValue = ((Number) obj).intValue();
            if (LIZ != null) {
                System.nanoTime();
            }
            return intValue;
        } finally {
            if (LIZ != null) {
                System.nanoTime();
            }
        }
    }

    public String GetStringValue() {
        PTH LIZ = PTH.LIZ();
        try {
            if (this.type != 2) {
            }
            String str = (String) this.inputData;
            if (LIZ != null) {
                System.nanoTime();
            }
            return str;
        } finally {
            if (LIZ != null) {
                System.nanoTime();
            }
        }
    }

    public TTMParamData(Object obj) {
        this.inputData = obj;
        this.type = 2;
    }

    public static TTMParamData generateByData(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return new TTMParamData((Map<String, Object>) obj);
        }
        if (obj instanceof Collection) {
            return new TTMParamData((Collection<Object>) obj);
        }
        if (obj.getClass().isArray()) {
            return new TTMParamData((Collection<Object>) Arrays.asList((Object[]) obj));
        }
        return new TTMParamData(obj);
    }

    public void AddArrayItem(TTMParamData tTMParamData) {
        PTH LIZ = PTH.LIZ();
        try {
            if (this.type != 1) {
                if (LIZ != null) {
                    return;
                } else {
                    return;
                }
            }
            ((Collection) this.inputData).add(tTMParamData.inputData);
            if (LIZ != null) {
                System.nanoTime();
            }
        } finally {
            if (LIZ != null) {
                System.nanoTime();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        java.lang.System.nanoTime();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tiktok.ttm.TTMParamData GetArrayItem(int r7) {
        /*
            r6 = this;
            X.PTH r5 = X.PTH.LIZ()
            int r1 = r6.type     // Catch: java.lang.Throwable -> L38
            r0 = 1
            r4 = 0
            if (r1 != r0) goto L32
            java.lang.Object r0 = r6.inputData     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto Lf
            goto L32
        Lf:
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L38
            r2 = 0
        L16:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L28
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L38
            int r0 = r2 + 1
            if (r2 != r7) goto L25
            goto L27
        L25:
            r2 = r0
            goto L16
        L27:
            r4 = r1
        L28:
            com.tiktok.ttm.TTMParamData r0 = generateByData(r4)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L31
            java.lang.System.nanoTime()
        L31:
            return r0
        L32:
            if (r5 == 0) goto L37
            java.lang.System.nanoTime()
        L37:
            return r4
        L38:
            r0 = move-exception
            if (r5 == 0) goto L3e
            java.lang.System.nanoTime()
        L3e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.ttm.TTMParamData.GetArrayItem(int):com.tiktok.ttm.TTMParamData");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tiktok.ttm.TTMParamData GetObjectItem(java.lang.String r3) {
        /*
            r2 = this;
            X.PTH r1 = X.PTH.LIZ()
            int r0 = r2.type     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r2.inputData     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto Ld
            goto L1d
        Ld:
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L24
            com.tiktok.ttm.TTMParamData r0 = generateByData(r0)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1c
            java.lang.System.nanoTime()
        L1c:
            return r0
        L1d:
            if (r1 == 0) goto L22
            java.lang.System.nanoTime()
        L22:
            r0 = 0
            return r0
        L24:
            r0 = move-exception
            if (r1 == 0) goto L2a
            java.lang.System.nanoTime()
        L2a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.ttm.TTMParamData.GetObjectItem(java.lang.String):com.tiktok.ttm.TTMParamData");
    }

    public void removeData(String str) {
        PTH LIZ = PTH.LIZ();
        try {
            if (this.type != 0) {
                if (LIZ != null) {
                    return;
                } else {
                    return;
                }
            }
            ((Map) this.inputData).remove(str);
            if (LIZ != null) {
                System.nanoTime();
            }
        } finally {
            if (LIZ != null) {
                System.nanoTime();
            }
        }
    }

    public TTMParamData(Collection<Object> collection) {
        this.inputData = collection;
        this.type = 1;
    }

    public TTMParamData(Map<String, Object> map) {
        this.inputData = map;
    }

    public void mergeDataAsSubData(String str, TTMParamData tTMParamData) {
        PTH LIZ = PTH.LIZ();
        try {
            if (this.type != 0) {
                if (LIZ != null) {
                    return;
                } else {
                    return;
                }
            }
            ((Map) this.inputData).put(str, tTMParamData.inputData);
            if (LIZ != null) {
                System.nanoTime();
            }
        } finally {
            if (LIZ != null) {
                System.nanoTime();
            }
        }
    }
}
