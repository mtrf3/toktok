package com.google.android.play.core.assetpacks;

import X.EPR;

/* loaded from: classes7.dex */
public final class a extends EPR {
    public final int LJLIL;

    @Override // X.EPR
    public int getErrorCode() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r8) {
        /*
            r7 = this;
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r6[r1] = r0
            java.util.Map<java.lang.Integer, java.lang.String> r2 = X.C35483DwF.LIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L2b
            java.lang.String r1 = ""
        L1a:
            r0 = 1
            r6[r0] = r1
            java.lang.String r0 = "Asset Pack Download Error(%d): %s"
            java.lang.String r0 = X.C16880lQ.LLLZ(r0, r6)
            r7.<init>(r0)
            if (r8 == 0) goto L68
            r7.LJLIL = r8
            return
        L2b:
            java.lang.Object r5 = r2.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map<java.lang.Integer, java.lang.String> r0 = X.C35483DwF.LIZIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r4 = r0.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r3 = r0.length()
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r2 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r3 + 113
            int r0 = r0 + r2
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L1a
        L68:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.a.<init>(int):void");
    }
}
