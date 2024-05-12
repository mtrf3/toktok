package X;

import com.google.android.play.core.assetpacks.h0;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment$PreloadCommentMLModel;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Uzg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79012Uzg implements RTU, InterfaceC153055zZ, WG5, InterfaceC14130gz {
    public static boolean LJLILLLLZI = false;
    public static SmartPreloadCommentV2Experiment$PreloadCommentMLModel LJLJI = null;
    public static int LJLJJI = 0;
    public static int LJLJJLL = 3;
    public static final int[] LJLIL = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
    public static final C79012Uzg LJLJJL = new C79012Uzg();

    public static SmartPreloadCommentV2Experiment$PreloadCommentMLModel LIZJ() {
        if (!LJLILLLLZI) {
            SmartPreloadCommentV2Experiment$PreloadCommentMLModel smartPreloadCommentV2Experiment$PreloadCommentMLModel = (SmartPreloadCommentV2Experiment$PreloadCommentMLModel) i0.LJ(false, "smart_feed_preload_comment_ml", 31744, SmartPreloadCommentV2Experiment$PreloadCommentMLModel.class, null);
            LJLJI = smartPreloadCommentV2Experiment$PreloadCommentMLModel;
            if (smartPreloadCommentV2Experiment$PreloadCommentMLModel != null) {
                LJLJJI = smartPreloadCommentV2Experiment$PreloadCommentMLModel.groupId;
            }
            LJLILLLLZI = true;
        }
        return LJLJI;
    }

    @Override // X.InterfaceC153055zZ
    public Object a() {
        return new h0();
    }

    public static boolean LIZLLL() {
        if (LIZJ() == null) {
            return false;
        }
        if (LIZJ().groupId != 5 && LJLJJI != 6) {
            return false;
        }
        return true;
    }

    public static void LJFF(InterfaceC65784Pro block) {
        o.LJIIIZ(block, "block");
        new C47513Ikn(block).start();
    }

    public static C79008Uzc LJ(int i, C79008Uzc c79008Uzc) {
        C79008Uzc c79008Uzc2 = new C79008Uzc();
        int i2 = c79008Uzc.LJLILLLLZI;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || c79008Uzc.LIZLLL(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                c79008Uzc2.LIZIZ(i8, i);
            } else if (i8 == 0) {
                c79008Uzc2.LIZIZ(i5 | 1, i);
            } else {
                c79008Uzc2.LIZIZ(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return c79008Uzc2;
    }

    @Override // X.RTU
    public Object apply(Object imagePath, Object musicPath) {
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(musicPath, "musicPath");
        return new OSZ(imagePath, musicPath);
    }

    public static void LIZ(C79007Uzb c79007Uzb, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    c79007Uzb.LIZIZ(i5, i4);
                    c79007Uzb.LIZIZ(i5, i6);
                    c79007Uzb.LIZIZ(i4, i5);
                    c79007Uzb.LIZIZ(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        c79007Uzb.LIZIZ(i7, i7);
        int i8 = i7 + 1;
        c79007Uzb.LIZIZ(i8, i7);
        c79007Uzb.LIZIZ(i7, i8);
        int i9 = i + i2;
        c79007Uzb.LIZIZ(i9, i7);
        c79007Uzb.LIZIZ(i9, i8);
        c79007Uzb.LIZIZ(i9, i9 - 1);
    }

    public static C79008Uzc LIZIZ(C79008Uzc c79008Uzc, int i, int i2) {
        C79022Uzq c79022Uzq;
        int i3;
        int i4 = c79008Uzc.LJLILLLLZI / i2;
        if (i2 != 4) {
            if (i2 != 6) {
                if (i2 != 8) {
                    if (i2 != 10) {
                        if (i2 == 12) {
                            c79022Uzq = C79022Uzq.LJI;
                        } else {
                            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
                        }
                    } else {
                        c79022Uzq = C79022Uzq.LJII;
                    }
                } else {
                    c79022Uzq = C79022Uzq.LJIIJJI;
                }
            } else {
                c79022Uzq = C79022Uzq.LJIIIIZZ;
            }
        } else {
            c79022Uzq = C79022Uzq.LJIIIZ;
        }
        C79023Uzr c79023Uzr = new C79023Uzr(c79022Uzq);
        int i5 = i / i2;
        int[] iArr = new int[i5];
        int i6 = c79008Uzc.LJLILLLLZI / i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            int i9 = 0;
            do {
                if (c79008Uzc.LIZLLL((i7 * i2) + i8)) {
                    i3 = 1 << ((i2 - i8) - 1);
                } else {
                    i3 = 0;
                }
                i9 |= i3;
                i8++;
            } while (i8 < i2);
            iArr[i7] = i9;
        }
        c79023Uzr.LIZ(i5 - i4, iArr);
        C79008Uzc c79008Uzc2 = new C79008Uzc();
        c79008Uzc2.LIZIZ(0, i % i2);
        for (int i10 = 0; i10 < i5; i10++) {
            c79008Uzc2.LIZIZ(iArr[i10], i2);
        }
        return c79008Uzc2;
    }
}
