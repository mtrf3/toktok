package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.Callable;

/* renamed from: X.8r5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224238r5 {
    public static int LJFF;
    public static int LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public final C224198r1 LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final C224218r3 LIZLLL;
    public boolean LJ;

    public static int LJII() {
        C61447O9r c61447O9r = C57092Lx.LIZ;
        int i = c61447O9r.LIZJ;
        if (i == 0) {
            return LJI() - c61447O9r.LIZ;
        }
        return i;
    }

    public static int LJI() {
        if (Build.VERSION.SDK_INT >= 28 && C57092Lx.LIZ.LJI) {
            return LJI;
        }
        return LJIIIIZZ;
    }

    public C224238r5() {
        this.LIZ = new C224198r1();
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LJ = true;
        this.LIZLLL = null;
    }

    public C224238r5(C224218r3 c224218r3) {
        this.LIZ = new C224198r1();
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LJ = true;
        this.LIZLLL = c224218r3;
    }

    public static void LJFF(Context context) {
        if (context == null) {
            return;
        }
        if (LJI > 0 && LJFF > 0) {
            return;
        }
        if (C32044Chs.LJ()) {
            Display defaultDisplay = C45804HyK.LJIJJ(context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            LJIIIIZZ = displayMetrics.heightPixels;
            LJI = C32044Chs.LJII();
            LJFF = C32044Chs.LJIIIIZZ();
            return;
        }
        Display defaultDisplay2 = C45804HyK.LJIJJ(context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay2.getRealMetrics(displayMetrics2);
        int i = displayMetrics2.heightPixels;
        LJIIIIZZ = i;
        LJI = i + LJII;
        LJFF = displayMetrics2.widthPixels;
    }

    public static void LJIIIIZZ(Context context) {
        try {
            LJII = C63081OpJ.LJJJJLI(context);
            C61410O8g.LIZIZ(context);
            LJFF(context);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIILL(View view) {
        if (view == null) {
            return;
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        }
        if (view.getLayoutParams().width != -1 || view.getLayoutParams().height != -1) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    public static void LJIILLIIL(C80796VnM c80796VnM) {
        if (c80796VnM == null || c80796VnM.getWidth() == 0 || c80796VnM.getHeight() == 0 || LJI == 0 || LJFF == 0 || c80796VnM.getWidth() / c80796VnM.getHeight() == LJFF / LJI) {
            return;
        }
        LJFF = 0;
        LJI = 0;
        C57092Lx.LIZ.LIZJ = 0;
    }

    public static int LIZLLL(Context context, View view) {
        LJFF(context);
        int LJII2 = LJII();
        if (view != null && view.getHeight() > 0) {
            return view.getHeight();
        }
        return LJII2;
    }

    public static int LJ(Context context, View view) {
        LJFF(context);
        int i = LJFF;
        if (view != null && view.getWidth() > 0) {
            return view.getWidth();
        }
        return i;
    }

    public static void LJIIIZ(String str, Video video, ViewGroup viewGroup) {
        if (viewGroup != null && video != null) {
            LFH.LIZIZ.LIZLLL().LJIILLIIL().LJI().LJ(str, new C3G7(video.getWidth(), video.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    public final C223048pA LIZIZ(Context context, Aweme aweme, ViewGroup viewGroup) {
        if (aweme == null || aweme.getVideo() == null) {
            return new C223048pA(0, 0);
        }
        Video video = aweme.getVideo();
        C224198r1 c224198r1 = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video getWidth = ");
        LIZ.append(video.getWidth());
        LIZ.append("  getHeight = ");
        LIZ.append(video.getHeight());
        c224198r1.LIZIZ("FeedAllScreenHelper", null, X1D.LIZIZ(LIZ));
        C223048pA c223048pA = new C223048pA(video.getWidth(), video.getHeight());
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(0, 0));
        C57092Lx.LIZ.getClass();
        LJIILIIL(context, view, video.getWidth(), video.getHeight(), c223048pA, viewGroup);
        return c223048pA;
    }

    public final void LJIIL(Context context, Aweme aweme, View view, ViewGroup viewGroup) {
        if (aweme == null || aweme.getVideo() == null) {
            return;
        }
        Video video = aweme.getVideo();
        C57092Lx.LIZ.getClass();
        LJIILIIL(context, view, video.getWidth(), video.getHeight(), null, viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.view.View r27, int r28, int r29, X.C223048pA r30) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224238r5.LJIILJJIL(android.view.View, int, int, X.8pA):void");
    }

    public final void LIZ(Context context, Aweme aweme, View view, SmartImageView smartImageView, ViewGroup viewGroup) {
        if (aweme == null) {
            C36922EeM.LIZ(new NullPointerException("aweme is null"));
            return;
        }
        if (aweme.isVr()) {
            LJIILL(view);
            LJIILL(smartImageView);
            return;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return;
        }
        C61447O9r c61447O9r = C57092Lx.LIZ;
        c61447O9r.getClass();
        if (view != null) {
            LJIILIIL(context, view, video.getWidth(), video.getHeight(), null, viewGroup);
        }
        LJIILIIL(context, smartImageView, video.getWidth(), video.getHeight(), null, viewGroup);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sw:");
        LIZ.append(LJFF);
        LIZ.append("sh:");
        LIZ.append(LJI);
        LIZ.append("vph:");
        LIZ.append(c61447O9r.LIZJ);
        LIZ.append("vdw:");
        LIZ.append(video.getWidth());
        LIZ.append("vdh:");
        LIZ.append(video.getHeight());
        LIZ.append("rw:");
        LIZ.append(this.LIZJ);
        LIZ.append("rh:");
        LIZ.append(this.LIZIZ);
        C60392Yp.LIZIZ("LFeedView", X1D.LIZIZ(LIZ));
    }

    public final void LIZJ(View view, int i, int i2, int i3, int i4, C223048pA c223048pA) {
        Context context;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        int measuredWidth;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        C224298rB LIZIZ = C224248r6.LIZIZ(context);
        if (LIZIZ != null && (interfaceC65784Pro = LIZIZ.LJLIL) != null && interfaceC65784Pro.invoke().booleanValue()) {
            Object parent = view.getParent();
            if ((parent instanceof ViewGroup) && (measuredWidth = ((View) parent).getMeasuredWidth()) != 0) {
                i4 = measuredWidth;
            }
        }
        double d = i / i2;
        double d2 = i4 / i3;
        if ((C224308rC.LIZ && d < d2) || d > 0.625d || d2 > 0.625d || d < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i3 = i4;
            } else {
                i3 = (i2 * i4) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i4 = i3;
        } else {
            i4 = (i * i3) / i2;
        }
        LJIILJJIL(view, i3, i4, c223048pA);
    }

    public final void LJIIJ(View view, int i, int i2, int i3, int i4, C223048pA c223048pA) {
        double d = i / i2;
        double d2 = i4 / i3;
        if ((C224308rC.LIZ && d < d2) || d > 0.5625d || d2 > 0.5625d || d < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i3 = i4;
            } else {
                i3 = (i2 * i4) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i4 = i3;
        } else {
            i4 = (i * i3) / i2;
        }
        LJIILJJIL(view, i3, i4, c223048pA);
    }

    public final void LJIIJJI(View view, int i, int i2, int i3, int i4, C223048pA c223048pA) {
        if (i / i2 > 1.0d) {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i2 * i3) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i3 = i4;
        } else {
            i3 = (i * i4) / i2;
        }
        LJIILJJIL(view, i4, i3, c223048pA);
    }

    public final void LJIILIIL(Context context, View view, int i, int i2, C223048pA c223048pA, ViewGroup viewGroup) {
        LJFF(context);
        int LJII2 = LJII();
        InterfaceC224288rA LJI2 = LFH.LIZIZ.LIZLLL().LJIILLIIL().LJI();
        int LJ = LJ(context, viewGroup);
        int LIZLLL = LIZLLL(context, viewGroup);
        final double d = LJI / LJFF;
        final double d2 = i2 / i;
        final double d3 = LIZLLL / LJ;
        C10K.LIZJ(new Callable<Object>() { // from class: X.8r8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C224198r1 c224198r1 = C224238r5.this.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("screenScale = ");
                LIZ.append(d);
                LIZ.append(" videoScale = ");
                LIZ.append(d2);
                LIZ.append(" containerScale = ");
                LIZ.append(d3);
                c224198r1.LIZ(X1D.LIZIZ(LIZ), "FeedAllScreenHelper");
                return null;
            }
        });
        boolean z = true;
        if (!((Boolean) C224328rE.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        C3G7 c3g7 = new C3G7(i, i2, LJ, LIZLLL);
        if (LJI2 != null && LJI2.LIZ(c3g7)) {
            C3G7 LIZLLL2 = LJI2.LIZLLL(c3g7);
            LJIILJJIL(view, LIZLLL2.LJLJJI, LIZLLL2.LJLJI, c223048pA);
            if (view instanceof ImageView) {
                LJI2.LIZJ((ImageView) view);
                return;
            }
            return;
        }
        int i3 = LJFF;
        int i4 = LJI;
        double d4 = i3 / i4;
        if (d4 <= 0.5d) {
            if (z) {
                LJII2 = LIZLLL;
            } else {
                LJ = i3;
            }
            LIZJ(view, i, i2, LJII2, LJ, c223048pA);
            return;
        }
        if (d4 >= 0.6666666666666666d) {
            if (z) {
                i3 = LJ;
            } else {
                LIZLLL = i4;
            }
            LJIIJJI(view, i, i2, i3, LIZLLL, c223048pA);
            return;
        }
        if (z) {
            LJII2 = LIZLLL;
        } else {
            LJ = i3;
        }
        LJIIJ(view, i, i2, LJII2, LJ, c223048pA);
    }
}
