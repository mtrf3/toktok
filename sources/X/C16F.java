package X;

/* renamed from: X.16F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16F {
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C16I LIZ(X.C018205i r7, int r8, java.util.ArrayList<X.C16I> r9, X.C16I r10) {
        /*
            if (r8 != 0) goto Lb2
            int r3 = r7.horizontalGroup
        L4:
            r6 = -1
            r5 = 0
            if (r3 == r6) goto L6f
            if (r10 == 0) goto Le
            int r0 = r10.LIZIZ
            if (r3 == r0) goto L6c
        Le:
            r2 = 0
        Lf:
            int r0 = r9.size()
            if (r2 >= r0) goto L6f
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r2)
            X.16I r1 = (X.C16I) r1
            int r0 = r1.LIZIZ
            if (r0 != r3) goto L69
            if (r10 == 0) goto L27
            r10.LIZLLL(r8, r1)
            r9.remove(r10)
        L27:
            r10 = r1
        L28:
            boolean r0 = r10.LIZ(r7)
            if (r0 == 0) goto L54
            boolean r0 = r7 instanceof X.C1AC
            if (r0 == 0) goto L3f
            r0 = r7
            X.1AC r0 = (X.C1AC) r0
            X.05f r1 = r0.LIZLLL
            int r0 = r0.LJ
            if (r0 != 0) goto L3c
            r5 = 1
        L3c:
            r1.LIZJ(r5, r10, r9)
        L3f:
            if (r8 != 0) goto L55
            int r0 = r10.LIZIZ
            r7.horizontalGroup = r0
            X.05f r0 = r7.mLeft
            r0.LIZJ(r8, r10, r9)
            X.05f r0 = r7.mRight
            r0.LIZJ(r8, r10, r9)
        L4f:
            X.05f r0 = r7.mCenter
            r0.LIZJ(r8, r10, r9)
        L54:
            return r10
        L55:
            int r0 = r10.LIZIZ
            r7.verticalGroup = r0
            X.05f r0 = r7.mTop
            r0.LIZJ(r8, r10, r9)
            X.05f r0 = r7.mBaseline
            r0.LIZJ(r8, r10, r9)
            X.05f r0 = r7.mBottom
            r0.LIZJ(r8, r10, r9)
            goto L4f
        L69:
            int r2 = r2 + 1
            goto Lf
        L6c:
            if (r3 == r6) goto L6f
            return r10
        L6f:
            r4 = 1
            if (r10 != 0) goto L28
            boolean r0 = r7 instanceof X.C1AD
            if (r0 == 0) goto Lac
            r3 = r7
            X.1AD r3 = (X.C1AD) r3
            r1 = 0
        L7a:
            int r0 = r3.LIZIZ
            if (r1 >= r0) goto Lac
            X.05i[] r0 = r3.LIZ
            r0 = r0[r1]
            if (r8 != 0) goto La2
            int r2 = r0.horizontalGroup
            if (r2 == r6) goto La9
        L88:
            if (r2 == r6) goto Lac
            r1 = 0
        L8b:
            int r0 = r9.size()
            if (r1 >= r0) goto Lac
            java.lang.Object r10 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r1)
            X.16I r10 = (X.C16I) r10
            int r0 = r10.LIZIZ
            if (r0 != r2) goto L9f
        L9b:
            r9.add(r10)
            goto L28
        L9f:
            int r1 = r1 + 1
            goto L8b
        La2:
            if (r8 != r4) goto La9
            int r2 = r0.verticalGroup
            if (r2 == r6) goto La9
            goto L88
        La9:
            int r1 = r1 + 1
            goto L7a
        Lac:
            X.16I r10 = new X.16I
            r10.<init>(r8)
            goto L9b
        Lb2:
            int r3 = r7.verticalGroup
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16F.LIZ(X.05i, int, java.util.ArrayList, X.16I):X.16I");
    }

    public static boolean LIZIZ(EnumC018105h enumC018105h, EnumC018105h enumC018105h2, EnumC018105h enumC018105h3, EnumC018105h enumC018105h4) {
        boolean z;
        boolean z2;
        EnumC018105h enumC018105h5;
        EnumC018105h enumC018105h6;
        EnumC018105h enumC018105h7 = EnumC018105h.FIXED;
        if (enumC018105h3 == enumC018105h7 || enumC018105h3 == (enumC018105h6 = EnumC018105h.WRAP_CONTENT) || (enumC018105h3 == EnumC018105h.MATCH_PARENT && enumC018105h != enumC018105h6)) {
            z = true;
        } else {
            z = false;
        }
        if (enumC018105h4 == enumC018105h7 || enumC018105h4 == (enumC018105h5 = EnumC018105h.WRAP_CONTENT) || (enumC018105h4 == EnumC018105h.MATCH_PARENT && enumC018105h2 != enumC018105h5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }
}
