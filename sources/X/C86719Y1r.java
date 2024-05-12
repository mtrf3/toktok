package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86719Y1r extends Y25<C86713Y1l> {
    @Override // X.Y25
    public final C86713Y1l LIZ() {
        return C86713Y1l.LIZIZ;
    }

    @Override // X.Y25
    public final EnumC79500VIa LIZIZ() {
        return EnumC79500VIa.CAPTION;
    }

    @Override // X.Y25
    public final boolean LJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return Y04.LIZIZ(aweme);
    }

    @Override // X.Y25
    public final boolean LJII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return Y01.LIZIZ.LJJIIJZLJL(aweme);
    }

    @Override // X.Y25
    public final void LJ(Aweme aweme, Y3Z y3z) {
        int i;
        CaptionItemModel LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme);
        if (LJIIIIZZ != null) {
            i = LJIIIIZZ.getSubId();
        } else {
            i = 0;
        }
        y3z.LIZIZ = new C84540XFw(i, null, false, false);
    }

    @Override // X.Y25
    public final void LJFF(Aweme aweme, C86753Y2z c86753Y2z) {
        int i;
        if (LJII(aweme)) {
            C69402nw LJ = C86713Y1l.LIZIZ.LJ(aweme, Y01.LIZIZ.LJJIIZI());
            if (LJ != null) {
                c86753Y2z.LJ = new C84540XFw(LJ.LJLIL, LJ.LJLILLLLZI, LJII(aweme), LJ.LJLJJI);
                return;
            }
            return;
        }
        CaptionItemModel LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme);
        if (LJIIIIZZ != null) {
            i = LJIIIIZZ.getSubId();
        } else {
            i = 0;
        }
        c86753Y2z.LJ = new C84540XFw(i, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r1 == true) goto L18;
     */
    @Override // X.Y25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r7, X.InterfaceC86733Y2f r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            if (r8 != 0) goto L3
            return
        L3:
            X.Y01 r0 = X.Y01.LIZIZ
            java.lang.String r0 = r0.LJJIIZI()
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r5 = X.Y04.LIZJ(r7, r0)
            X.Y2V r2 = X.Y2V.OFFLINE_CAPTIONS
            if (r5 != 0) goto L61
            X.Y2L r1 = X.Y2L.NOT_EXIST
        L13:
            r4 = 0
            if (r5 == 0) goto L5f
            java.lang.String r0 = r5.getLanguageCode()
        L1a:
            r8.LIZIZ(r2, r1, r0, r4)
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r3 = X.C86670Xzu.LJIIIIZZ(r7)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r7.getVideo()
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.CaptionLanguage r0 = r0.getOriginalCaptionLanguage()
            if (r0 == 0) goto L5d
            boolean r1 = r0.getCanTranslateRealtime()
            r0 = 1
            if (r1 != r0) goto L5d
        L3a:
            X.Y2V r2 = X.Y2V.RT_CAPTIONS
            if (r3 == 0) goto L40
            if (r0 != 0) goto L4e
        L40:
            X.Y2L r1 = X.Y2L.NOT_EXIST
            if (r3 == 0) goto L4c
        L44:
            java.lang.String r0 = r3.getLanguageCode()
        L48:
            r8.LIZIZ(r2, r1, r0, r4)
            return
        L4c:
            r0 = r4
            goto L48
        L4e:
            if (r9 != 0) goto L53
            X.Y2L r1 = X.Y2L.NOT_TRANSLATABLE
            goto L44
        L53:
            if (r10 == 0) goto L57
            if (r5 == 0) goto L5a
        L57:
            X.Y2L r1 = X.Y2L.TRANSLATION_NOT_TRIGGERED
            goto L44
        L5a:
            X.Y2L r1 = X.Y2L.TO_BE_TRANSLATED
            goto L44
        L5d:
            r0 = 0
            goto L3a
        L5f:
            r0 = r4
            goto L1a
        L61:
            if (r9 != 0) goto L66
            X.Y2L r1 = X.Y2L.NOT_TRANSLATABLE
            goto L13
        L66:
            if (r10 != 0) goto L6b
            X.Y2L r1 = X.Y2L.TRANSLATION_NOT_TRIGGERED
            goto L13
        L6b:
            X.Y2L r1 = X.Y2L.TO_BE_TRANSLATED
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86719Y1r.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, X.Y2f, boolean, boolean):void");
    }
}
