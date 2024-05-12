package Y;

import X.AbstractC40713FyP;
import X.AbstractC58982NCw;
import X.ActivityC45651qj;
import X.B7X;
import X.C17N;
import X.C1B3;
import X.C227898wz;
import X.C242549fW;
import X.C2VQ;
import X.C59753Ncj;
import X.C61295O3v;
import X.C61296O3w;
import X.C61298O3y;
import X.C61617OGf;
import X.C62105OYz;
import X.C68322mC;
import X.C76L;
import X.C78949Uyf;
import X.C78950Uyg;
import X.C99J;
import X.IWF;
import X.InterfaceC88472Yns;
import X.ND8;
import X.NMO;
import X.NMS;
import X.NQL;
import X.O44;
import X.O4O;
import X.OBC;
import X.OV6;
import X.X1D;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.forest.model.Request;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.web.intercept.forest.AdLandPageForestFetcher;
import kotlin.jvm.internal.AqS70S0400000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS14S0400000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        NMS nms;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        FrameLayout frameLayout = (FrameLayout) this.l0;
        T t = ((C68322mC) this.l1).element;
        if (t instanceof NMS) {
            nms = (NMS) t;
        } else {
            nms = null;
        }
        if (frameLayout.getVisibility() != 8) {
            frameLayout.setVisibility(8);
            if (nms != null) {
                nms.onHide();
            }
            IWF.LJJLIIIIJ().LIZIZ();
        }
        Fragment fragment = (Fragment) ((C68322mC) this.l1).element;
        if (fragment != null) {
            Activity activity = (Activity) this.l3;
            if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJJI(fragment);
                c1b3.LJI();
            }
        }
        ((C68322mC) this.l1).element = null;
        NMO nmo = (NMO) this.l2;
        if (nmo != null) {
            nmo.enable(false);
        }
    }

    public final void LIZ$1() {
        if (((ViewGroup) this.l0).getParent() != null) {
            AbstractC58982NCw abstractC58982NCw = (AbstractC58982NCw) this.l1;
            ViewGroup containerView = (ViewGroup) this.l0;
            View contentView = (View) this.l2;
            AnoleComponentAppearModel appearModel = (AnoleComponentAppearModel) this.l3;
            o.LJIIIZ(abstractC58982NCw, "<this>");
            o.LJIIIZ(containerView, "containerView");
            o.LJIIIZ(contentView, "contentView");
            o.LJIIIZ(appearModel, "appearModel");
            AnimatorSet LJJ = C78949Uyf.LJJ(abstractC58982NCw, containerView, contentView, appearModel.getAnimations(), false);
            if (LJJ != null) {
                LJJ.start();
                LJJ.addListener(new IDAListenerS78S0100000_10(abstractC58982NCw, 3));
            } else {
                LJJ = null;
            }
            abstractC58982NCw.LJLL = LJJ;
            return;
        }
        ((AbstractC58982NCw) this.l1).LJIIIZ();
    }

    public final void LIZ$2() {
        AbstractC58982NCw abstractC58982NCw = (AbstractC58982NCw) this.l0;
        if (abstractC58982NCw.LJLLI) {
            abstractC58982NCw.LJII();
            C242549fW.LIZ("show failed because isShowing");
            return;
        }
        boolean z = false;
        try {
        } catch (Throwable th) {
            ((ViewGroup) this.l1).setVisibility(8);
            ((AbstractC58982NCw) this.l0).LJ(String.valueOf(th.getMessage()));
            ((AbstractC58982NCw) this.l0).LJII();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("show fail, because exception, ");
            LIZ.append(th.getMessage());
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        }
        if (((ViewGroup) this.l1).getParent() != null) {
            ((AbstractC58982NCw) this.l0).LJII();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("containerView width: ");
            LIZ2.append(C17N.LJJJJI(((ViewGroup) this.l1).getWidth()));
            LIZ2.append(", height: ");
            LIZ2.append(C17N.LJJJJI(((ViewGroup) this.l1).getHeight()));
            C242549fW.LIZ(X1D.LIZIZ(LIZ2));
            ND8.LIZLLL((View) this.l2, (ViewGroup) this.l1, (AnoleComponentAppearModel) this.l3, (AbstractC58982NCw) this.l0);
            if (C78950Uyg.LIZJ((AnoleComponentAppearModel) this.l3)) {
                AbstractC58982NCw abstractC58982NCw2 = (AbstractC58982NCw) this.l0;
                ViewGroup containerView = (ViewGroup) this.l1;
                View contentView = (View) this.l2;
                AnoleComponentAppearModel appearModel = (AnoleComponentAppearModel) this.l3;
                o.LJIIIZ(abstractC58982NCw2, "<this>");
                o.LJIIIZ(containerView, "containerView");
                o.LJIIIZ(contentView, "contentView");
                o.LJIIIZ(appearModel, "appearModel");
                AnimatorSet LJJ = C78949Uyf.LJJ(abstractC58982NCw2, containerView, contentView, appearModel.getAnimations(), true);
                if (LJJ != null) {
                    contentView.setVisibility(0);
                    LJJ.start();
                } else {
                    LJJ = null;
                }
                abstractC58982NCw2.LJLL = LJJ;
            } else {
                ((View) this.l2).setVisibility(0);
            }
            ((AbstractC58982NCw) this.l0).LIZLLL((AnoleComponentAppearModel) this.l3);
            z = true;
            abstractC58982NCw.LJLLI = z;
            return;
        }
        throw new B7X("after post, containerView.parent = null");
    }

    public static final void run$0(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            aRunnableS14S0400000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            ((O44) aRunnableS14S0400000_10.l0).LIZ((O4O) aRunnableS14S0400000_10.l1, (C61296O3w) aRunnableS14S0400000_10.l2);
            C61296O3w c61296O3w = (C61296O3w) aRunnableS14S0400000_10.l2;
            if (!c61296O3w.LJIIIIZZ && !c61296O3w.LJII) {
                C61298O3y.LIZIZ.remove(((AbstractC40713FyP) aRunnableS14S0400000_10.l3).toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            C62105OYz c62105OYz = (C62105OYz) aRunnableS14S0400000_10.l0;
            TuxIconView tuxIconView = (TuxIconView) aRunnableS14S0400000_10.l1;
            c62105OYz.getClass();
            C62105OYz.LIZLLL(tuxIconView);
            ((TuxIconView) aRunnableS14S0400000_10.l1).animate().scaleX(1.06f).scaleY(1.06f).setDuration(150L).setInterpolator((Interpolator) aRunnableS14S0400000_10.l2).withEndAction((Runnable) aRunnableS14S0400000_10.l3).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$2(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            ((O44) aRunnableS14S0400000_10.l0).LIZ((O4O) ((C68322mC) aRunnableS14S0400000_10.l1).element, (C61296O3w) aRunnableS14S0400000_10.l2);
            C61296O3w c61296O3w = (C61296O3w) aRunnableS14S0400000_10.l2;
            if (!c61296O3w.LJIIIIZZ && !c61296O3w.LJII) {
                C61298O3y.LIZIZ.remove(((AbstractC40713FyP) aRunnableS14S0400000_10.l3).toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            MusicRecordService musicRecordService = (MusicRecordService) aRunnableS14S0400000_10.l3;
            if (musicRecordService.LJI) {
                musicRecordService.LIZJ((Activity) aRunnableS14S0400000_10.l0, (MusicModel) aRunnableS14S0400000_10.l1, (OV6) aRunnableS14S0400000_10.l2, Boolean.FALSE);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            ((AdLandPageForestFetcher) aRunnableS14S0400000_10.l0).fetchResource((Request) aRunnableS14S0400000_10.l1, (C61295O3v) aRunnableS14S0400000_10.l2);
            ((InterfaceC88472Yns) aRunnableS14S0400000_10.l3).invoke((C61295O3v) aRunnableS14S0400000_10.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            if (((OBC) aRunnableS14S0400000_10.l3).LIZ() != null && !(((OBC) aRunnableS14S0400000_10.l3).LIZIZ() instanceof OBC)) {
                ((OBC) aRunnableS14S0400000_10.l3).LIZIZ().openMiniApp((Context) aRunnableS14S0400000_10.l0, (MicroAppInfo) aRunnableS14S0400000_10.l1, (C227898wz) aRunnableS14S0400000_10.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            C2VQ.LIZIZ(new AqS70S0400000_10((C76L) aRunnableS14S0400000_10.l0, (C76L<Challenge>) aRunnableS14S0400000_10.l1, (C68322mC<SmartRoute>) aRunnableS14S0400000_10.l2, (C61617OGf) aRunnableS14S0400000_10.l3, (StringBuilder) 1), 0L);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            aRunnableS14S0400000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            aRunnableS14S0400000_10.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS14S0400000_10 aRunnableS14S0400000_10) {
        boolean LIZ;
        try {
            C59753Ncj LJIIJ = ((NQL) aRunnableS14S0400000_10.l3).LJIIJ((Context) aRunnableS14S0400000_10.l0, (View) aRunnableS14S0400000_10.l2, (Aweme) aRunnableS14S0400000_10.l1);
            if (LJIIJ != null) {
                LJIIJ.LIZ(C99J.CLICK);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS14S0400000_10(android.view.View r2, android.view.ViewGroup r3, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel r4, X.AbstractC58982NCw r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 7: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r2
            r0.l3 = r4
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r5
            r0.l2 = r2
            r0.l3 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS14S0400000_10.<init>(android.view.View, android.view.ViewGroup, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel, X.NCw, int):void");
    }

    public ARunnableS14S0400000_10(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj3;
        this.l0 = obj;
        this.l1 = obj4;
        this.l2 = obj2;
    }
}
