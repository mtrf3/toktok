package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;

/* renamed from: X.EQv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36413EQv implements ES5 {
    public final Context LIZIZ;
    public final UploadableMobileEffect LIZJ;
    public final String LIZLLL;
    public final Effect LJ;
    public final IB3 LJFF;
    public final File LJI;
    public boolean LJII;

    @Override // X.ES5
    public final UploadableMobileEffect LIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C36405EQn
            if (r0 == 0) goto L51
            r6 = r9
            X.EQn r6 = (X.C36405EQn) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L57
            X.C141335gf.LIZJ(r1)
        L20:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L2a:
            X.C141335gf.LIZJ(r1)
            X.IB3 r0 = r7.LJFF
            r3 = 0
            if (r0 == 0) goto L4d
            java.lang.String r2 = r0.LJLILLLLZI
        L34:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 0
            r1.inJustDecodeBounds = r0
            android.graphics.Bitmap r1 = X.C44694HgQ.LIZLLL(r2, r1)
            if (r1 == 0) goto L4f
            r6.LJLJI = r4
            r0 = 252(0xfc, float:3.53E-43)
            java.lang.Object r1 = X.C66432j9.LIZIZ(r1, r8, r3, r6, r0)
            if (r1 != r5) goto L20
            return r5
        L4d:
            r2 = r3
            goto L34
        L4f:
            r4 = 0
            goto L25
        L51:
            X.EQn r6 = new X.EQn
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36413EQv.LIZIZ(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r11, java.lang.String r12, X.InterfaceC67352kd<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36413EQv.LIZJ(java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    public C36413EQv(ActivityC45651qj activityC45651qj, UploadableMobileEffect uploadableMobileEffect, String str, Effect effect, IB3 ib3, File file) {
        this.LIZIZ = activityC45651qj;
        this.LIZJ = uploadableMobileEffect;
        this.LIZLLL = str;
        this.LJ = effect;
        this.LJFF = ib3;
        this.LJI = file;
    }
}
