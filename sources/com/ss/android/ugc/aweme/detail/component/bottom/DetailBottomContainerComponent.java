package com.ss.android.ugc.aweme.detail.component.bottom;

import X.ActivityC45651qj;
import X.C201667vm;
import X.C212428Vi;
import X.C220858ld;
import X.C221108m2;
import X.C27740Aue;
import X.C2K0;
import X.C55624LsK;
import X.C57092Lx;
import X.C61447O9r;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC55102Lju;
import X.M89;
import X.QD3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class DetailBottomContainerComponent extends BasePanelComponent implements DetailBottomAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 87));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 85));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 86));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 88));
    public View LJLJJL;
    public RelativeLayout LJLJJLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -252390251) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomAbility
    public final void h2() {
        View view = this.LJLJJL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i = C61447O9r.LJIILJJIL;
            C57092Lx.LIZ.getClass();
            int LIZ = C61447O9r.LIZ();
            if (i == 0) {
                i = LIZ;
            }
            layoutParams2.height = i;
            view.setLayoutParams(layoutParams2);
        }
        IDetailBottomProtocol iDetailBottomProtocol = (IDetailBottomProtocol) this.LJLIL.getValue();
        if (iDetailBottomProtocol != null) {
            iDetailBottomProtocol.h1();
        }
    }

    public final void v3() {
        Aweme aweme;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJI.getValue();
        if (iFeedPanelPlatformAbility != null) {
            aweme = iFeedPanelPlatformAbility.getCurrentAweme();
        } else {
            aweme = null;
        }
        if (C220858ld.LJIIIIZZ(aweme)) {
            C27740Aue.LJIIIZ(4, this.LJLJJL);
        } else {
            C27740Aue.LJIIIZ(0, this.LJLJJL);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomAbility
    public final void Uk0() {
        Fragment LIZLLL;
        ViewGroup viewGroup;
        M89 m89 = getPanelContext().LIZJ;
        if (m89 != null && m89.isPlaylistCleanMode()) {
            return;
        }
        IDetailBottomProtocol iDetailBottomProtocol = (IDetailBottomProtocol) this.LJLIL.getValue();
        if (iDetailBottomProtocol != null) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ == null || LIZ.isFinishing() || (LIZLLL = C212428Vi.LIZLLL(this)) == null) {
                return;
            }
            View view = LIZLLL.getView();
            View view2 = null;
            if (view != null) {
                view2 = view.findViewById(R.id.aoo);
            }
            if (!(view2 instanceof ViewGroup) || (viewGroup = (ViewGroup) view2) == null) {
                View view3 = LIZLLL.getView();
                if (!(view3 instanceof ViewGroup) || (viewGroup = (ViewGroup) view3) == null) {
                    return;
                }
            }
            if (this.LJLJJLL != null) {
                return;
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.LJLJJLL = relativeLayout;
            this.LJLJJL = iDetailBottomProtocol.K2(relativeLayout);
            viewGroup.addView(this.LJLJJLL, new ViewGroup.LayoutParams(-1, -1));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            RelativeLayout relativeLayout2 = this.LJLJJLL;
            if (relativeLayout2 != null) {
                relativeLayout2.addView(this.LJLJJL, layoutParams);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        DetailBottomLegacyAbility detailBottomLegacyAbility = (DetailBottomLegacyAbility) this.LJLILLLLZI.getValue();
        if (detailBottomLegacyAbility != null) {
            detailBottomLegacyAbility.q1();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        v3();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new C55624LsK(this));
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        v3();
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomAbility
    public final void n1() {
        v3();
    }

    @QD3
    public void onCancelVideoCoverMaskEvent(C201667vm c201667vm) {
        C27740Aue.LJIIIZ(0, this.LJLJJL);
    }
}
