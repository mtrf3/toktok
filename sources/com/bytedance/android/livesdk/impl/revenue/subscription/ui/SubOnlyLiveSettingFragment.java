package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.ActivityC45651qj;
import X.B83;
import X.BIM;
import X.BIN;
import X.BIO;
import X.BIR;
import X.BZI;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C28546BIg;
import X.C28787BRn;
import X.C28959BYd;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C3C5;
import X.C41071jL;
import X.C47121t6;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C73943T0h;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC28543BId;
import X.EnumC28545BIf;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.InterfaceC73984T1w;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS6S1100000_5;
import Y.IDCListenerS206S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubOnlyLiveSettingFragment extends BaseFragment implements InterfaceC73984T1w {
    public LiveIconView LJLIL;
    public LiveIconView LJLILLLLZI;
    public ViewGroup LJLJI;
    public C41071jL LJLJJI;
    public ViewGroup LJLJJL;
    public C41071jL LJLJJLL;
    public ViewGroup LJLJL;
    public C41071jL LJLJLJ;
    public ViewGroup LJLJLLL;
    public C41071jL LJLL;
    public ViewGroup LJLLI;
    public final BIR LJLLILLLL;
    public String LJLLJ;
    public GetSubInfoResponse LJLLL;
    public boolean LJLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLLLLL;
    public Integer LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;

    public SubOnlyLiveSettingFragment() {
        new LinkedHashMap();
        this.LJLLILLLL = new BIR();
        this.LJLLJ = "";
        this.LJLLLL = true;
        this.LJZ = C221108m2.LIZIZ(BIO.LJLIL);
        this.LJZI = C221108m2.LIZIZ(BIN.INSTANCE);
    }

    public final String vl() {
        return (String) this.LJZ.getValue();
    }

    public final void wl() {
        C41071jL c41071jL = this.LJLJJI;
        if (c41071jL != null && c41071jL.isChecked() && LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            ViewGroup viewGroup = this.LJLJLLL;
            if (viewGroup != null) {
                C29306Beo.LJJLJLI(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 == null) {
            return;
        }
        C29306Beo.LJI(viewGroup2);
    }

    public final void xl() {
        C41071jL c41071jL;
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup == null) {
            return;
        }
        C41071jL c41071jL2 = this.LJLJJI;
        int i = 0;
        if (c41071jL2 == null || !c41071jL2.isChecked() || (c41071jL = this.LJLJJLL) == null || !c41071jL.isChecked() || !LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    @Override // X.InterfaceC73984T1w
    public final boolean onBackPressed() {
        C73943T0h.LIZ().LIZIZ(new C28546BIg(EnumC28543BId.SUB_ONLY_LIVE_PAGE, EnumC28545BIf.CLOSE, (String) null, 12));
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Integer num = this.LJLZ;
        if (num != null) {
            int intValue = num.intValue();
            C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
            LIZIZ.LIZIZ.LJIIJ(true);
            LIZIZ.LJIIIIZZ(intValue);
            LIZIZ.LIZJ();
        }
        ((Handler) this.LJZI.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        boolean z;
        boolean z2;
        LiveSubOnlyConfig liveSubOnlyConfig;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (LiveIconView) view.findViewById(R.id.aeg);
        this.LJLILLLLZI = (LiveIconView) view.findViewById(R.id.d4s);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.kon);
        this.LJLJJI = (C41071jL) view.findViewById(R.id.kop);
        this.LJLJJL = (ViewGroup) view.findViewById(R.id.lld);
        this.LJLJJLL = (C41071jL) view.findViewById(R.id.lle);
        this.LJLJL = (ViewGroup) view.findViewById(R.id.kot);
        this.LJLJLJ = (C41071jL) view.findViewById(R.id.kou);
        this.LJLJLLL = (ViewGroup) view.findViewById(R.id.a11);
        this.LJLL = (C41071jL) view.findViewById(R.id.a12);
        this.LJLLI = (ViewGroup) view.findViewById(R.id.dao);
        C28959BYd.LIZIZ((C47121t6) view.findViewById(R.id.kof));
        BIR.LIZJ((ViewGroup) view.findViewById(R.id.glf));
        LiveIconView liveIconView = this.LJLIL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, BIM.LJLIL);
        }
        LiveIconView liveIconView2 = this.LJLILLLLZI;
        if (liveIconView2 != null) {
            C16880lQ.LJJII(liveIconView2, new ACListenerS25S0100000_5(this, 171));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Boolean bool = null;
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        } else {
            num = null;
        }
        this.LJLZ = num;
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LIZIZ.LJIIJ(true);
        LIZIZ.LJIIIIZZ(C15380j0.LIZIZ(R.color.zy));
        LIZIZ.LIZJ();
        GetSubInfoResponse getSubInfoResponse = this.LJLLL;
        int i = 0;
        if (getSubInfoResponse != null && (liveSubOnlyConfig = getSubInfoResponse.liveSubOnlyConfig) != null) {
            z = liveSubOnlyConfig.disabled;
        } else {
            z = false;
        }
        C41071jL c41071jL = this.LJLJJI;
        if (c41071jL != null) {
            if (!z && C29232Bdc.LIZIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c41071jL.setChecked(z2);
        }
        if (z) {
            DataChannelGlobal.LJLJJI.tv0(PreviewSubOnlyLiveSwitchChannel.class, Boolean.FALSE);
        }
        C41071jL c41071jL2 = this.LJLJJLL;
        if (c41071jL2 != null) {
            c41071jL2.setChecked(C29232Bdc.LIZJ());
        }
        C41071jL c41071jL3 = this.LJLJLJ;
        if (c41071jL3 != null) {
            c41071jL3.setChecked(!o.LJ(InterfaceC30442Bx8.U2.LIZ(), Boolean.FALSE));
        }
        C41071jL c41071jL4 = this.LJLL;
        if (c41071jL4 != null) {
            c41071jL4.setChecked(C29232Bdc.LIZ());
        }
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            C41071jL c41071jL5 = this.LJLJJI;
            if (c41071jL5 == null || !c41071jL5.isChecked()) {
                i = 8;
            }
            viewGroup.setVisibility(i);
        }
        if (!LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
            ViewGroup viewGroup2 = this.LJLJL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            this.LJLJL = null;
            this.LJLJLJ = null;
        }
        xl();
        C41071jL c41071jL6 = this.LJLJLJ;
        if (c41071jL6 != null) {
            c41071jL6.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 24));
        }
        wl();
        AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(this, 339);
        this.LJLLLL = !z;
        this.LJLLLLLL = aqS155S0100000_5;
        C41071jL c41071jL7 = this.LJLJJI;
        if (c41071jL7 != null) {
            c41071jL7.setOnTouchListener(new IDTListenerS115S0100000_5(this, 18));
        }
        C41071jL c41071jL8 = this.LJLJJI;
        if (c41071jL8 != null) {
            C16880lQ.LJJIIJZLJL(c41071jL8, new ACListenerS25S0100000_5(this, 324));
        }
        C41071jL c41071jL9 = this.LJLJJLL;
        if (c41071jL9 != null) {
            c41071jL9.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 22));
        }
        C41071jL c41071jL10 = this.LJLL;
        if (c41071jL10 != null) {
            C16880lQ.LJJIIJZLJL(c41071jL10, new ACListenerS25S0100000_5(this, 325));
        }
        C41071jL c41071jL11 = this.LJLL;
        if (c41071jL11 != null) {
            c41071jL11.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this, 23));
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_management_page_show");
        LIZ.LJIJJ(this.LJLLJ, "show_entrance");
        LIZ.LJIJJ(vl(), "anchor_id");
        GetSubInfoResponse getSubInfoResponse2 = this.LJLLL;
        if (getSubInfoResponse2 != null) {
            bool = Boolean.valueOf(getSubInfoResponse2.initialized);
        }
        LIZ.LJIJJ(Integer.valueOf(!C29306Beo.LJIL(bool) ? 1 : 0), "is_opt_in");
        LIZ.LJJIIJZLJL();
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && !o.LJ(InterfaceC30442Bx8.J3.LIZ(), Boolean.TRUE)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LiveSubscriptionAnchorUrlSetting.musicIntro());
            LIZ2.append("&anchor_id=");
            LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            LIZ2.append("&show_entrance=");
            LIZ2.append(this.LJLLJ);
            ((Handler) this.LJZI.getValue()).post(new ARunnableS6S1100000_5(this, X1D.LIZIZ(LIZ2), 3));
        }
        if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic()) {
            ViewGroup viewGroup3 = this.LJLLI;
            if (viewGroup3 != null) {
                C29306Beo.LJI(viewGroup3);
                return;
            }
            return;
        }
        ViewGroup viewGroup4 = this.LJLLI;
        if (viewGroup4 == null) {
            return;
        }
        C29306Beo.LJJLJLI(viewGroup4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5k, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
