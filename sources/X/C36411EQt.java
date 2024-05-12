package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;

/* renamed from: X.EQt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36411EQt implements ES5 {
    public final UploadableMobileEffect LIZIZ;
    public final XN6 LIZJ;
    public final String LIZLLL;
    public boolean LJ;

    @Override // X.ES5
    public final UploadableMobileEffect LIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r12, X.InterfaceC67352kd<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C36410EQs
            if (r0 == 0) goto Lbe
            r4 = r13
            X.EQs r4 = (X.C36410EQs) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbe
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r5 = 0
            r9 = 1
            r6 = 3
            r10 = 2
            if (r0 == 0) goto L2a
            if (r0 == r9) goto La3
            if (r0 == r10) goto L99
            if (r0 != r6) goto Lc5
            X.C141335gf.LIZJ(r1)
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2a:
            X.C141335gf.LIZJ(r1)
            X.XN6 r1 = r11.LIZJ
            if (r1 == 0) goto L77
            java.lang.String r0 = r11.LIZLLL
            java.lang.String[] r2 = X.C79234V7u.LJIIJ(r1, r0)
        L37:
            r1 = 0
            if (r2 == 0) goto L3d
            int r0 = r2.length
            if (r0 != 0) goto L75
        L3d:
            r0 = 1
        L3e:
            java.lang.String r8 = "Exporting icon to path="
            java.lang.String r7 = "DiyProp"
            if (r0 != 0) goto L79
            r2 = r2[r1]
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Exporting icon from path="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C15280iq.LIZIZ(r7, r0)
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r8)
            r0.append(r12)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            X.C15280iq.LIZIZ(r7, r0)
            r4.LJLIL = r12
            r4.LJLJJI = r9
            java.lang.Object r1 = X.C66432j9.LIZ(r2, r4)
            if (r1 != r3) goto Laa
            return r3
        L75:
            r0 = 0
            goto L3e
        L77:
            r2 = r5
            goto L37
        L79:
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r8)
            r0.append(r12)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            X.C15280iq.LIZIZ(r7, r0)
            r4.LJLIL = r12
            r4.LJLJJI = r10
            r1 = 720(0x2d0, float:1.009E-42)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Object r1 = X.C84005Wy1.LIZ(r1, r0, r4)
            if (r1 != r3) goto La0
            return r3
        L99:
            java.lang.Object r12 = r4.LJLIL
            java.lang.String r12 = (java.lang.String) r12
            X.C141335gf.LIZJ(r1)
        La0:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto Lac
        La3:
            java.lang.Object r12 = r4.LJLIL
            java.lang.String r12 = (java.lang.String) r12
            X.C141335gf.LIZJ(r1)
        Laa:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        Lac:
            if (r1 != 0) goto Lb1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lb1:
            r4.LJLIL = r5
            r4.LJLJJI = r6
            r0 = 252(0xfc, float:3.53E-43)
            java.lang.Object r0 = X.C66432j9.LIZIZ(r1, r12, r5, r4, r0)
            if (r0 != r3) goto L27
            return r3
        Lbe:
            X.EQs r4 = new X.EQs
            r4.<init>(r11, r13)
            goto L12
        Lc5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36411EQt.LIZIZ(java.lang.String, X.2kd):java.lang.Object");
    }

    public C36411EQt(UploadableMobileEffect uploadableMobileEffect, XN6 xn6, String str) {
        this.LIZIZ = uploadableMobileEffect;
        this.LIZJ = xn6;
        this.LIZLLL = str;
    }
}
