package com.ss.android.ugc.feed.platform.panel.homeviewpager;

import X.C17N;
import X.C19N;
import X.C221108m2;
import X.C26338AVi;
import X.C29701Eo;
import X.C2K0;
import X.C32151Nz;
import X.C55953Lxd;
import X.C5D8;
import X.C62822Ol8;
import X.InterfaceC55102Lju;
import X.LS8;
import X.LZL;
import X.LZN;
import X.LZO;
import X.LZR;
import X.M78;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EdgeSlideGuideAssem extends UISlotAssem implements EdgeSlideGuideAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public C29701Eo LJLLL;
    public View LJLLLL;
    public C5D8 LJLLLLLL;
    public View LJLZ;
    public TuxTextView LJZ;
    public TuxIconView LJZI;
    public int LJZL;
    public int LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public ObjectAnimator LLFII;
    public final AnimatorSet LLFZ;
    public final AnimatorSet LLI;
    public final AnimatorSet LLIFFJFJJ;
    public final AnimatorSet LLII;
    public boolean LLIIII;
    public LZN LLIIIILZ;
    public M78 LLIIIJ;
    public LZR LLIIIL;
    public final C62822Ol8 LLIIIZ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1637548447) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.af8;
    }

    public EdgeSlideGuideAssem() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 729));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 730));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 732));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 731));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 728));
        this.LJZL = -1;
        this.LLFZ = new AnimatorSet();
        this.LLI = new AnimatorSet();
        this.LLIFFJFJJ = new AnimatorSet();
        this.LLII = new AnimatorSet();
        this.LLIIIZ = C221108m2.LIZIZ(LS8.LJLIL);
    }

    public final LZO I3() {
        return (LZO) this.LJLJLLL.getValue();
    }

    public final void H3() {
        View containerView = getContainerView();
        if (containerView != null) {
            C17N.LJJIIJZLJL(containerView);
        }
        C29701Eo c29701Eo = this.LJLLL;
        if (c29701Eo != null) {
            C17N.LJJIIJZLJL(c29701Eo);
        }
        TuxTextView tuxTextView = this.LJZ;
        if (tuxTextView != null) {
            C17N.LJJIIJZLJL(tuxTextView);
        }
        View view = this.LJLZ;
        if (view != null) {
            C17N.LJJIIJZLJL(view);
        }
        M78 m78 = this.LLIIIJ;
        if (m78 != null) {
            m78.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        LZR lzr = this.LLIIIL;
        if (lzr != null) {
            ((IPipFeedService) this.LLIIIZ.getValue()).LJIILLIIL(lzr);
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        C29701Eo c29701Eo = this.LJLLL;
        if (c29701Eo != null) {
            c29701Eo.pauseAnimation();
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C29701Eo c29701Eo = this.LJLLL;
        if (c29701Eo != null) {
            c29701Eo.resumeAnimation();
        }
    }

    public final boolean K3(int i) {
        String str;
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LJLL.getValue();
        if (homePageViewPagerAbility != null) {
            str = homePageViewPagerAbility.zb0(i);
        } else {
            str = null;
        }
        return o.LJ(str, "NOTIFICATION");
    }

    public final boolean L3(int i) {
        String str;
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LJLL.getValue();
        if (homePageViewPagerAbility != null) {
            str = homePageViewPagerAbility.zb0(i);
        } else {
            str = null;
        }
        return o.LJ(str, "page_feed");
    }

    public final boolean M3(int i) {
        String str;
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LJLL.getValue();
        if (homePageViewPagerAbility != null) {
            str = homePageViewPagerAbility.zb0(i);
        } else {
            str = null;
        }
        return o.LJ(str, "page_profile");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N3(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.LLIIII
            if (r0 != r6) goto L5
            return
        L5:
            r5.LLIIII = r6
            r4 = 1
            r3 = 0
            java.lang.String r1 = "containerView.context"
            if (r6 == 0) goto L3b
            android.view.View r0 = r5.getContainerView()
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            boolean r0 = X.C26338AVi.LIZJ(r0)
            if (r0 != 0) goto L4d
            r2 = 1
        L1f:
            android.view.View r0 = r5.x3()
            r0.setLayoutDirection(r4)
        L26:
            com.bytedance.tux.icon.TuxIconView r1 = r5.LJZI
            if (r1 == 0) goto L31
            if (r2 == 0) goto L38
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L2e:
            r1.setRotation(r0)
        L31:
            X.5D8 r0 = r5.LJLLLLLL
            if (r0 == 0) goto L37
            r0.LIZJ = r2
        L37:
            return
        L38:
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L2e
        L3b:
            android.view.View r0 = r5.getContainerView()
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            boolean r2 = X.C26338AVi.LIZJ(r0)
            if (r2 == 0) goto L4e
            goto L1f
        L4d:
            r2 = 0
        L4e:
            android.view.View r0 = r5.x3()
            r0.setLayoutDirection(r3)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem.N3(boolean):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        float f;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        ObjectAnimator objectAnimator5;
        C5D8 c5d8;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLIIII = false;
        View findViewById = getContainerView().findViewById(R.id.nio);
        ObjectAnimator objectAnimator6 = null;
        if (findViewById != null) {
            Integer LIZIZ = C19N.LIZIZ(findViewById, "context", R.attr.db);
            if (LIZIZ != null) {
                int intValue = LIZIZ.intValue();
                float LJIIZILJ = C32151Nz.LJIIZILJ(3000);
                float LJIIZILJ2 = C32151Nz.LJIIZILJ(76);
                Context context = getContainerView().getContext();
                o.LJIIIIZZ(context, "containerView.context");
                c5d8 = new C5D8(intValue, LJIIZILJ, LJIIZILJ2, C26338AVi.LIZJ(context));
                this.LJLLLLLL = c5d8;
            } else {
                c5d8 = null;
            }
            findViewById.setBackground(c5d8);
        } else {
            findViewById = null;
        }
        this.LJLLLL = findViewById;
        TuxIconView tuxIconView = (TuxIconView) getContainerView().findViewById(R.id.a7v);
        Context context2 = tuxIconView.getContext();
        o.LJIIIIZZ(context2, "context");
        if (C26338AVi.LIZJ(context2)) {
            f = -90.0f;
        } else {
            f = 90.0f;
        }
        tuxIconView.setRotation(f);
        this.LJZI = tuxIconView;
        View view2 = this.LJLLLL;
        if (view2 != null) {
            view2.setLayerType(1, null);
        }
        this.LJZ = (TuxTextView) getContainerView().findViewById(R.id.e1a);
        View view3 = this.LJLLLL;
        if (view3 != null) {
            objectAnimator = ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
        } else {
            objectAnimator = null;
        }
        TuxTextView tuxTextView = this.LJZ;
        if (tuxTextView != null) {
            objectAnimator2 = ObjectAnimator.ofFloat(tuxTextView, "alpha", 0.0f, 1.0f);
        } else {
            objectAnimator2 = null;
        }
        TuxIconView tuxIconView2 = this.LJZI;
        if (tuxIconView2 != null) {
            objectAnimator3 = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 0.0f, 1.0f);
        } else {
            objectAnimator3 = null;
        }
        this.LLFZ.playTogether(objectAnimator, objectAnimator2, objectAnimator3);
        this.LLFZ.setDuration(300L);
        this.LLFZ.setInterpolator(C55953Lxd.LJI());
        View view4 = this.LJLLLL;
        if (view4 != null) {
            objectAnimator4 = ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f);
        } else {
            objectAnimator4 = null;
        }
        TuxTextView tuxTextView2 = this.LJZ;
        if (tuxTextView2 != null) {
            objectAnimator5 = ObjectAnimator.ofFloat(tuxTextView2, "alpha", 1.0f, 0.0f);
        } else {
            objectAnimator5 = null;
        }
        TuxIconView tuxIconView3 = this.LJZI;
        if (tuxIconView3 != null) {
            objectAnimator6 = ObjectAnimator.ofFloat(tuxIconView3, "alpha", 1.0f, 0.0f);
        }
        this.LLI.playTogether(objectAnimator4, objectAnimator5, objectAnimator6);
        this.LLI.setDuration(250L);
        this.LLI.setInterpolator(C55953Lxd.LJIIIIZZ());
        this.LLIFFJFJJ.playTogether(objectAnimator, objectAnimator3);
        this.LLIFFJFJJ.setDuration(300L);
        this.LLIFFJFJJ.setInterpolator(C55953Lxd.LJI());
        this.LLII.playTogether(objectAnimator4, objectAnimator6);
        this.LLII.setDuration(250L);
        this.LLII.setInterpolator(C55953Lxd.LJIIIIZZ());
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LJLL.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.ii(new LZL(this));
        }
    }
}
