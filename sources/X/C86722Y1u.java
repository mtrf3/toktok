package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86722Y1u extends Y25<C86716Y1o> {
    @Override // X.Y25
    public final C86716Y1o LIZ() {
        return C86716Y1o.LIZIZ;
    }

    @Override // X.Y25
    public final EnumC79500VIa LIZIZ() {
        return EnumC79500VIa.DESCRIPTION;
    }

    @Override // X.Y25
    public final boolean LJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C2058886e.LIZ(aweme);
    }

    @Override // X.Y25
    public final boolean LJII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return Y01.LIZIZ.LJIILL(aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    @Override // X.Y25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r4, X.Y35 r5) {
        /*
            r3 = this;
            boolean r0 = r5.LIZJ
            if (r0 == 0) goto L2d
            boolean r0 = X.C2058886e.LIZ(r4)
            if (r0 == 0) goto L2d
            X.Y01 r2 = X.Y01.LIZIZ
            boolean r0 = r2.LJIILL(r4)
            if (r0 == 0) goto L2d
            X.Y1o r1 = X.C86716Y1o.LIZIZ
            java.lang.String r0 = r2.LJJIIZI()
            X.Y3s r0 = r1.LJ(r4, r0)
            X.Y2Y r0 = (X.Y2Y) r0
            if (r0 == 0) goto L2d
            java.lang.String r0 = r0.LJLILLLLZI
        L22:
            r5.LJ = r0
            r1 = 1
            if (r0 == 0) goto L2b
            r0 = 1
        L28:
            r5.LJFF = r0
            return r1
        L2b:
            r0 = 0
            goto L28
        L2d:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86722Y1u.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, X.Y35):boolean");
    }

    @Override // X.Y25
    public final void LJ(Aweme aweme, Y3Z y3z) {
        LJI(aweme);
    }

    @Override // X.Y25
    public final void LJFF(Aweme aweme, C86753Y2z c86753Y2z) {
        boolean z;
        if (C2058886e.LIZ(aweme) && LJII(aweme)) {
            z = true;
        } else {
            z = false;
        }
        c86753Y2z.LIZJ = z;
    }

    @Override // X.Y25
    public final void LIZJ(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, boolean z, boolean z2) {
        Y2L y2l;
        if (interfaceC86733Y2f == null) {
            return;
        }
        Y2V y2v = Y2V.DESCRIPTION;
        String descLanguage = aweme.getDescLanguage();
        String desc = aweme.getDesc();
        if (desc == null || desc.length() == 0) {
            y2l = Y2L.NOT_EXIST;
        } else if (!z) {
            y2l = Y2L.NOT_TRANSLATABLE;
        } else if (!z2) {
            y2l = Y2L.TRANSLATION_NOT_TRIGGERED;
        } else {
            y2l = Y2L.TO_BE_TRANSLATED;
        }
        interfaceC86733Y2f.LIZIZ(y2v, y2l, descLanguage, Integer.valueOf(aweme.getDesc().length()));
    }
}
