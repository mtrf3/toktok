package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.experiment.SlidingGestureHintConfig;
import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LS1 implements LZP {
    public final /* synthetic */ EdgeSlideGuideAssem LIZIZ;

    public static final Keva LJIIIZ() {
        LZP.LIZ.getClass();
        Keva repo = Keva.getRepo("tab_move_slide_guide");
        o.LJIIIIZZ(repo, "getRepo(ISlideOperator.KEVA_REPO_NAME_ATB)");
        return repo;
    }

    @Override // X.LZP
    public final boolean LIZJ() {
        EdgeSlideGuideAssem edgeSlideGuideAssem = this.LIZIZ;
        if (edgeSlideGuideAssem.L3(edgeSlideGuideAssem.LJZL)) {
            EdgeSlideGuideAssem edgeSlideGuideAssem2 = this.LIZIZ;
            if (!edgeSlideGuideAssem2.M3(edgeSlideGuideAssem2.LL)) {
                EdgeSlideGuideAssem edgeSlideGuideAssem3 = this.LIZIZ;
                if (edgeSlideGuideAssem3.K3(edgeSlideGuideAssem3.LL)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.LZP
    public final int LJ() {
        Integer num = ((SlidingGestureHintConfig) LS4.LIZIZ.getValue()).hintShowCount;
        if (num != null) {
            return num.intValue();
        }
        return 2;
    }

    @Override // X.LZP
    public final int LJII() {
        boolean z;
        SlidePageItem LJI;
        int i;
        EdgeSlideGuideAssem edgeSlideGuideAssem = this.LIZIZ;
        boolean z2 = false;
        if (edgeSlideGuideAssem.M3(edgeSlideGuideAssem.LL) && C53297Kvt.LIZ() && C53765L8f.LJI() != null && (LJI = C53765L8f.LJI()) != null && (((i = LJI.scope) == 1 || i == 2) && o.LJ(LJI.landingPage, "USER"))) {
            z = true;
        } else {
            z = false;
            EdgeSlideGuideAssem edgeSlideGuideAssem2 = this.LIZIZ;
            if (edgeSlideGuideAssem2.K3(edgeSlideGuideAssem2.LL)) {
                z2 = true;
            }
        }
        return LJIIIIZZ(!z, z2);
    }

    @Override // X.LZP
    public final void LIZ() {
        LJIIIZ().storeBoolean("has_shown_first_guide", true);
    }

    @Override // X.LZP
    public final boolean LIZIZ() {
        return LJIIIZ().getBoolean("has_shown_first_guide", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // X.LZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.experiment.SlidePage r0 = X.C53765L8f.LJII()
            r3 = 0
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.experiment.SlidePageItem r2 = r0.right
            if (r2 == 0) goto L28
            java.lang.String r1 = r2.landingPage
        Ld:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r1 = 0
            if (r0 == 0) goto L1c
            r0 = 1
        L17:
            int r0 = r4.LJIIIIZZ(r0, r1)
            return r0
        L1c:
            if (r2 == 0) goto L20
            java.lang.String r3 = r2.landingPage
        L20:
            java.lang.String r0 = "USER"
            kotlin.jvm.internal.o.LJ(r3, r0)
            r0 = 0
            goto L17
        L27:
            r2 = r3
        L28:
            r1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LS1.LIZLLL():int");
    }

    @Override // X.LZP
    public final int LJFF() {
        return LJIIIZ().getInt("text_guide_show_count", 0);
    }

    public LS1(EdgeSlideGuideAssem edgeSlideGuideAssem) {
        this.LIZIZ = edgeSlideGuideAssem;
    }

    @Override // X.LZP
    public final void LJI(int i) {
        LJIIIZ().storeInt("text_guide_show_count", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        return com.zhiliaoapp.musically.R.string.ryj;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIIIZZ(boolean r2, boolean r3) {
        /*
            r1 = this;
            com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem r0 = r1.LIZIZ
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L27
            boolean r0 = X.C26338AVi.LIZJ(r0)
        Lc:
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L16
            if (r0 != 0) goto L19
        L12:
            r0 = 2131846269(0x7f11647d, float:1.9325982E38)
        L15:
            return r0
        L16:
            if (r0 == 0) goto L19
            goto L12
        L19:
            r0 = 2131846268(0x7f11647c, float:1.932598E38)
            goto L15
        L1d:
            if (r0 == 0) goto L23
            r0 = 2131846271(0x7f11647f, float:1.9325986E38)
            goto L15
        L23:
            r0 = 2131846270(0x7f11647e, float:1.9325984E38)
            goto L15
        L27:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LS1.LJIIIIZZ(boolean, boolean):int");
    }
}
