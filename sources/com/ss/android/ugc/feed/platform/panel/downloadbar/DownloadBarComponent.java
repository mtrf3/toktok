package com.ss.android.ugc.feed.platform.panel.downloadbar;

import X.C188727au;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2LI;
import X.C2LJ;
import X.C2MA;
import X.C2NO;
import X.C35138Dqg;
import X.C44938HkM;
import X.C51781KTx;
import X.C55096Ljo;
import X.C57082Lw;
import X.C57092Lx;
import X.C5H3;
import X.C61447O9r;
import X.C62822Ol8;
import X.C62828OlE;
import X.C78540Us4;
import X.C79156V4u;
import X.EnumC221088m0;
import X.FAJ;
import X.FMX;
import X.InterfaceC55102Lju;
import X.InterfaceC55219Lln;
import X.InterfaceC55235Lm3;
import X.JAK;
import X.KU4;
import X.LEZ;
import X.LFH;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.ability.CustomCellAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DownloadBarComponent extends BasePanelUIComponent implements IDownloadBarAbility, C2NO, InterfaceC55102Lju {
    public C62828OlE LJLJJI;
    public ViewStub LJLJJL;
    public C2LI LJLJJLL;
    public AqS148S0200000_1 LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public final C5H3 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    public final void A3() {
        E3(false);
        int i = this.LJLL;
        if (i != 1 && i != 2) {
            if (i != 4 || this.LJLJJI == null) {
                return;
            }
            C62828OlE.LJI();
            return;
        }
        this.LJLJLLL = true;
    }

    @Override // X.C2NO
    public final void LJLIIIL() {
        E3(false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -934552109) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadBarComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        this.LJLL = -1;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 734), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 3));
        }
        this.LJLLI = c62822Ol8;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 735));
    }

    public final void C3() {
        Aweme aweme = C44938HkM.LJFF;
        if (aweme != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
            FMX.LJIIL("download_failure_window_show", c188727au.LIZ);
        }
    }

    public final IFeedPanelPlatformAbility v3() {
        return (IFeedPanelPlatformAbility) this.LJLLI.getValue();
    }

    public final IViewPagerComponentAbility x3() {
        return (IViewPagerComponentAbility) this.LJLLILLLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C62828OlE.LJLLILLLL.remove(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        Aweme aweme;
        super.onPause();
        IViewPagerComponentAbility x3 = x3();
        if (x3 != null) {
            aweme = x3.getCurrentAweme();
        } else {
            aweme = null;
        }
        us0(aweme);
    }

    @Override // X.C8W0
    public final void onResume() {
        Aweme aweme;
        super.onResume();
        IViewPagerComponentAbility x3 = x3();
        if (x3 != null) {
            aweme = x3.getCurrentAweme();
        } else {
            aweme = null;
        }
        us0(aweme);
    }

    public final void E3(boolean z) {
        C2MA c2ma;
        InterfaceC55235Lm3 LJFF;
        CustomCellAbility customCellAbility;
        C2MA c2ma2;
        InterfaceC55235Lm3 LJFF2;
        CustomCellAbility customCellAbility2;
        if (C35138Dqg.LIZIZ() && z) {
            FAJ.LJIIIIZZ(new ARunnableS37S0100000_1(this, 11));
        }
        C62828OlE c62828OlE = this.LJLJJI;
        if (c62828OlE != null) {
            int i = 0;
            if (z) {
                c62828OlE.setVisibility(0);
                c62828OlE.measure(0, 0);
                int measuredHeight = c62828OlE.getMeasuredHeight();
                C57092Lx.LIZ.getClass();
                int LIZ = C61447O9r.LIZ();
                if (this.LJLJJLL == null) {
                    LFH.LIZIZ.LIZLLL().LJIIZILJ();
                    this.LJLJJLL = LEZ.LIZ.LIZJ(LIZ, c62828OlE);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                C2LI c2li = this.LJLJJLL;
                if (c2li != null) {
                    i = c2li.LJJIFFI(LIZ);
                }
                layoutParams.bottomMargin = i;
                c62828OlE.setLayoutParams(layoutParams);
                c62828OlE.requestLayout();
                IViewPagerComponentAbility x3 = x3();
                if (x3 != null) {
                    c2ma2 = x3.getCurViewHolder();
                } else {
                    c2ma2 = null;
                }
                if (c2ma2 instanceof InterfaceC55219Lln) {
                    ((InterfaceC55219Lln) c2ma2).l6(measuredHeight, true);
                    return;
                } else {
                    if (c2ma2 == null || (LJFF2 = C79156V4u.LJFF(c2ma2)) == null || (customCellAbility2 = (CustomCellAbility) C55096Ljo.LIZ(LJFF2, CustomCellAbility.class, null)) == null) {
                        return;
                    }
                    customCellAbility2.l6(measuredHeight, true);
                    return;
                }
            }
            c62828OlE.setVisibility(8);
            IFeedPanelPlatformAbility v3 = v3();
            if (v3 != null && v3.shouldShowNewUserProgress()) {
                return;
            }
            IViewPagerComponentAbility x32 = x3();
            if (x32 != null) {
                c2ma = x32.getCurViewHolder();
            } else {
                c2ma = null;
            }
            if (c2ma instanceof InterfaceC55219Lln) {
                ((InterfaceC55219Lln) c2ma).l6(c62828OlE.getHeight(), false);
            } else {
                if (c2ma == null || (LJFF = C79156V4u.LJFF(c2ma)) == null || (customCellAbility = (CustomCellAbility) C55096Ljo.LIZ(LJFF, CustomCellAbility.class, null)) == null) {
                    return;
                }
                customCellAbility.l6(c62828OlE.getHeight(), false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F3(X.C45382HrW r11) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.downloadbar.DownloadBarComponent.F3(X.HrW):void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility
    public final void Ih(C2LJ c2lj) {
        this.LJLJJLL = c2lj;
    }

    @Override // X.C2NO
    public final void LJLIIL(boolean z) {
        if (z) {
            C57082Lw.LIZ.LIZJ("photo_click_try").postValue(C44938HkM.LJFF);
        } else {
            E3(false);
            C57082Lw.LIZ.LIZJ("video_click_retry").postValue(C44938HkM.LJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility
    public final void ON(boolean z) {
        if (z) {
            this.LJLJLJ = true;
            C62828OlE c62828OlE = this.LJLJJI;
            if (c62828OlE != null && c62828OlE.getVisibility() == 0) {
                A3();
                return;
            }
            return;
        }
        if (this.LJLJLLL) {
            E3(true);
        }
        this.LJLJLLL = false;
        this.LJLJLJ = false;
        AqS148S0200000_1 aqS148S0200000_1 = this.LJLJL;
        if (aqS148S0200000_1 != null) {
            aqS148S0200000_1.invoke();
        }
        this.LJLJL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme aweme;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C35138Dqg.LIZIZ()) {
            this.LJLJJL = (ViewStub) view.findViewById(R.id.cga);
        }
        if (this.LJLJJL == null) {
            C62828OlE c62828OlE = (C62828OlE) view.findViewById(R.id.cg_);
            this.LJLJJI = c62828OlE;
            if (c62828OlE != null) {
                c62828OlE.setVideoDownloadClickListener(this);
            }
        }
        C62828OlE.LJLLILLLL.add(this);
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null) {
            C57082Lw.LIZ.LIZIZ("video_download_status").observe(fragment, new AObserverS69S0100000_1(this, 12));
        }
        IViewPagerComponentAbility x3 = x3();
        if (x3 != null) {
            aweme = x3.getCurrentAweme();
        } else {
            aweme = null;
        }
        us0(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility
    public final void us0(Aweme aweme) {
        boolean z;
        if (aweme != null && C78540Us4.LJIILIIL(aweme)) {
            E3(false);
            return;
        }
        if (C44938HkM.LIZIZ()) {
            E3(true);
            C62828OlE c62828OlE = this.LJLJJI;
            if (c62828OlE == null) {
                return;
            }
            c62828OlE.LJIIJ(C62828OlE.LJLLL);
            return;
        }
        if (this.LJLJJI != null && C62828OlE.LJ(1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            E3(true);
            C62828OlE c62828OlE2 = this.LJLJJI;
            if (c62828OlE2 == null) {
                return;
            }
            C62828OlE.LIZLLL(c62828OlE2, c62828OlE2.getIsDownloadingPhoto(), c62828OlE2.getSuccessDownloadMediaNumber(), null, 12);
            return;
        }
        if (this.LJLJJI != null && C62828OlE.LJ(2) && C44938HkM.LJIIZILJ) {
            E3(true);
            C62828OlE c62828OlE3 = this.LJLJJI;
            if (c62828OlE3 == null) {
                return;
            }
            C62828OlE.LIZIZ(c62828OlE3, c62828OlE3.getIsDownloadingPhoto(), null, 14);
            if (c62828OlE3.getIsDownloadingPhoto()) {
                return;
            }
            C3();
            return;
        }
        E3(false);
    }
}
