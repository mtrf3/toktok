package com.google.android.play.core.install;

import X.EPR;

/* loaded from: classes7.dex */
public final class a extends EPR {
    public final int LJLIL;

    @Override // X.EPR
    public int getErrorCode() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
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
            java.util.Map<java.lang.Integer, java.lang.String> r3 = X.C35418DvC.LIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L22
            java.util.Map<java.lang.Integer, java.lang.String> r1 = X.C35418DvC.LIZIZ
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L35
        L22:
            java.lang.String r1 = ""
        L24:
            r0 = 1
            r6[r0] = r1
            java.lang.String r0 = "Install Error(%d): %s"
            java.lang.String r0 = X.C16880lQ.LLLZ(r0, r6)
            r7.<init>(r0)
            if (r8 == 0) goto L6e
            r7.LJLIL = r8
            return
        L35:
            java.lang.Object r5 = r3.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r3 = r0.length()
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r2 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r3 + 103
            int r0 = r0 + r2
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L24
        L6e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.a.<init>(int):void");
    }
}
