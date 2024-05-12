package com.ss.android.ugc.aweme.detail.panel;

import X.ActivityC45651qj;
import X.C34B;
import X.C55293Lmz;
import X.C55311LnH;
import X.C55350Lnu;
import X.C56642Ke;
import X.C65777Prh;
import X.C80985VqP;
import X.LNH;
import X.M89;
import X.X1D;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.feed.platform.cell.im.safety.SafetyViewModel;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ReplyMessagePanel extends DetailFragmentPanel {
    public final Bundle LLJJJIL;
    public List<Aweme> LLJJJJ;
    public boolean LLJJJJJIL;
    public C80985VqP LLJJJJLIIL;
    public SafetyViewModel LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    public final boolean LLIIJLIL() {
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || this.activity.isDestroyed() || getFragment() == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJJLIIIJ() {
        if (!LLIIJLIL() && this.LLJJJJJIL) {
            this.mViewPager.setDisableScroll(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onDestroyView() {
        super.onDestroyView();
        C80985VqP c80985VqP = this.LLJJJJLIIL;
        if (c80985VqP != null) {
            c80985VqP.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        if (LLIIJLIL() || getCurrentAweme() == null) {
            return;
        }
        LLIIL(null);
    }

    public final void LLIIL(String str) {
        View view;
        Fragment fragment = getFragment();
        View view2 = null;
        if (fragment != null) {
            view = fragment.getView();
        } else {
            view = null;
        }
        if (view instanceof ViewGroup) {
            view2 = view;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJIIJJI(view2, getChildFragmentManager(), this.LLJJJIL, str, new C55350Lnu(this));
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (o.LJ(this.param.getEnterMethodValue(), "click_quoted_message") || o.LJ(this.param.getEnterMethodValue(), "click_feed_dm_reply_msg")) {
            this.LLJJJJJIL = true;
            this.enableSwipeGesture = true;
            Bundle bundle2 = this.LLJJJIL;
            if (bundle2 != null) {
                bundle2.putString("enter_method", this.param.getEnterMethodValue());
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter method: ");
        LIZ.append(this.param.getEnterMethodValue());
        LIZ.append(" aid: ");
        LIZ.append(this.param.getAid());
        LIZ.append(" playing aid:");
        LIZ.append(this.param.getChatRoomPlayingRealAid());
        C34B.LJI("ReplyMessagePanel", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onJsBroadCastEvent(C56642Ke c56642Ke) {
        String str;
        JSONObject jSONObject;
        if (c56642Ke != null && (jSONObject = c56642Ke.LJLIL) != null) {
            str = jSONObject.optString("eventName");
        } else {
            str = null;
        }
        if (o.LJ(str, "really_chat_report_submit")) {
            SafetyViewModel safetyViewModel = this.LLJJL;
            if (safetyViewModel != null && !safetyViewModel.LJLIL) {
                safetyViewModel.LJLIL = true;
            }
            Activity activity = this.activity;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void swipe(int i) {
        if (LLIIJLIL()) {
            return;
        }
        if (i != 1 && i != 2 && i != 4) {
            return;
        }
        Activity activity = this.activity;
        if (activity instanceof DetailActivity) {
            o.LJII(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.ui.DetailActivity");
            ((DetailActivity) activity).onBackPressed();
        } else {
            if (activity == null) {
                return;
            }
            activity.onBackPressed();
        }
    }

    public ReplyMessagePanel(Bundle bundle, M89 m89) {
        super(m89);
        this.LLJJJIL = bundle;
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        Object obj;
        this.LLJJJJ = C65777Prh.LIZIZ(list);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRefreshResult size: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "null";
        }
        LIZ.append(obj);
        LIZ.append(", hasMore:");
        LIZ.append(z);
        LIZ.append(", isFromQuoteMessage:");
        LIZ.append(this.LLJJJJJIL);
        C34B.LJI("ReplyMessagePanel", X1D.LIZIZ(LIZ));
        if (this.LLJJJJJIL) {
            super.J5(list, false);
        } else {
            super.J5(list, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        if (!this.LLJJJJJIL) {
            super.j0(list, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
        if (this.LLJJJJJIL) {
            super.jh(list, false);
        } else {
            super.jh(list, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        SafetyViewModel safetyViewModel;
        IRefreshAbility iRefreshAbility;
        super.onViewCreated(view, bundle);
        if (this.LLJJJJJIL && (iRefreshAbility = this.refreshAbility) != null) {
            iRefreshAbility.setEnabled(false);
        }
        Fragment fragment = getFragment();
        if (fragment == null) {
            safetyViewModel = null;
        } else {
            safetyViewModel = (SafetyViewModel) ViewModelProviders.of(fragment).get(SafetyViewModel.class);
        }
        this.LLJJL = safetyViewModel;
        ActivityC45651qj mo49getActivity = getFragment().mo49getActivity();
        if (mo49getActivity != null) {
            LNH.LIZ(mo49getActivity, mo49getActivity, new C55293Lmz(this));
        }
        this.mViewPager.LJI(new C55311LnH(this));
    }
}
