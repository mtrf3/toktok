package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C48756JBo;
import X.C51781KTx;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C78866UxK;
import X.C79004UzY;
import X.C87277YNd;
import X.EnumC221088m0;
import X.EnumC223268pW;
import X.HG3;
import X.InterfaceC252619vl;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.JAK;
import X.KR8;
import X.KU4;
import X.LFH;
import X.RBX;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS44S0100000_8;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TabletDefaultAutoScrollComponent extends BaseAutoScrollUIComponent implements IDefaultAutoScrollAbility, InterfaceC252619vl, InterfaceC55102Lju {
    public boolean LJLLI;
    public final C5H3 LJLLILLLL;
    public final C221138m5 LJLLJ;

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    public final String A3() {
        return "first_show_default_auto_scroll";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1883218582) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabletDefaultAutoScrollComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        this.LJLLI = true;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 386), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 6));
        }
        this.LJLLILLLL = c62822Ol8;
        this.LJLLJ = KR8.LJIIJJI(new AqS158S0100000_8(this, 387));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IDefaultAutoScrollAbility
    public final void dC() {
        if (LFH.LIZIZ.LIZLLL().LJII().LJIIJ()) {
            F3();
        }
    }

    public final EnumC223268pW H3() {
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        Fragment Ja;
        InterfaceC55235Lm3 LJFF;
        IAutoAScrollAbility iAutoAScrollAbility;
        EnumC223268pW dl;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ)) == null || (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) == null || (Ja = LJIL.Ja("For You")) == null || (LJFF = KR8.LJFF(Ja)) == null || (iAutoAScrollAbility = (IAutoAScrollAbility) C55096Ljo.LIZ(LJFF, IAutoAScrollAbility.class, null)) == null || (dl = iAutoAScrollAbility.dl()) == null) {
            return EnumC223268pW.AUTO_SCROLL_STATE_STOP;
        }
        return dl;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        HG3.LJIILL().removeUserChangeListener(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    public final boolean v3() {
        if (H3() != EnumC223268pW.AUTO_SCROLL_STATE_START) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IDefaultAutoScrollAbility
    public final void JH() {
        C3();
    }

    public final void I3(boolean z) {
        ActivityC45651qj LIZ;
        Aweme currentPlayAweme;
        long j;
        if (((RBX) HG3.LJIILL()).isLogin() && ((LIZ = C212428Vi.LIZ(this)) == null || !C79004UzY.LJJIJIIJI(LIZ))) {
            LFH lfh = LFH.LIZIZ;
            if (lfh.LIZLLL().LJII().LJIIJ()) {
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLLJ.getValue();
                if (iViewPagerComponentAbility != null && (currentPlayAweme = iViewPagerComponentAbility.getCurrentPlayAweme()) != null) {
                    if (currentPlayAweme.isLive() || C63081OpJ.LLIIII(currentPlayAweme)) {
                        getContainerView().setVisibility(8);
                        return;
                    }
                    if (this.LJLLI) {
                        if (E3() && getContainerView().getVisibility() != 0) {
                            lfh.LIZLLL().LJIILLIIL().LIZLLL().LJJIJ(true);
                        }
                        View containerView = getContainerView();
                        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 59);
                        if (z) {
                            j = 300;
                        } else {
                            j = 0;
                        }
                        containerView.postDelayed(aRunnableS44S0100000_8, j);
                        return;
                    }
                    if (getContainerView().getVisibility() == 0) {
                        return;
                    }
                    getContainerView().setVisibility(0);
                    return;
                }
                return;
            }
        }
        C3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.aao);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 182), findViewById);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLLJ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new C48756JBo(this));
        }
        LFH lfh = LFH.LIZIZ;
        lfh.LIZLLL().LJII().LJIILLIIL(C212428Vi.LIZ(this), this.LJLJJLL, this.LJLJL);
        ((RBX) HG3.LJIILL()).addUserChangeListener(this);
        if (!lfh.LIZLLL().LJII().LJIIJ()) {
            C3();
        }
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (i == 4 && user2 != null && user != null && !o.LJ(user2.getUid(), user.getUid())) {
            I3(false);
        }
    }
}
