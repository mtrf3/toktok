package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.AV1;
import X.C2068389v;
import X.C234529Ii;
import X.C47261Igj;
import X.C9HI;
import X.C9NB;
import X.C9NC;
import X.C9ND;
import X.C9NE;
import X.EnumC235349Lm;
import X.HG3;
import X.QD3;
import X.RBX;
import X.X1D;
import Y.ARunnableS15S0300000_4;
import Y.ARunnableS23S0200000_4;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class MineNavBarSuggestBAAssem extends ProfileNavIconActionAssem<EnumC235349Lm> {
    public final Keva LJLIL;
    public ARunnableS15S0300000_4 LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem
    public final List<EnumC235349Lm> configHideActionList() {
        return C47261Igj.LJJIJ(EnumC235349Lm.FindFriends);
    }

    public MineNavBarSuggestBAAssem() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BA_SUGGESTED_ACCOUNT");
        User curUser = HG3.LJIILL().getCurUser();
        if (curUser != null) {
            str = curUser.getUid();
        } else {
            str = null;
        }
        LIZ.append(str);
        this.LJLIL = Keva.getRepo(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        if (isFromMain() && AV1.LJIJJ(HG3.LJIILL().getCurUser())) {
            requestDisplayAction();
        } else {
            hideAction();
        }
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        View actionView = getActionView();
        if (actionView != null) {
            actionView.removeCallbacks(this.LJLILLLLZI);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235349Lm.SuggestBA;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C234529Ii c234529Ii) {
        C234529Ii navAction = c234529Ii;
        o.LJIIIZ(navAction, "navAction");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_briefcase_plus;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        navAction.LIZ(c2068389v);
        navAction.LIZIZ(new AqS154S0100000_4(this, 1063));
    }

    @QD3
    public final void onShowBASuggestBubbleEvent(C9ND event) {
        BizAccountInfo bizAccountInfo;
        o.LJIIIZ(event, "event");
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (isVisible() && !this.LJLIL.getBoolean("has_shown_tips", false) && curUser != null && (bizAccountInfo = curUser.getBizAccountInfo()) != null && bizAccountInfo.getSuggestedAccountsEntranceTipType() == 2) {
            ProfileNavActionAssem.showAlertBadge$default(this, false, 0, 2, null);
            View actionView = getActionView();
            if (actionView != null) {
                ARunnableS15S0300000_4 aRunnableS15S0300000_4 = new ARunnableS15S0300000_4(this, actionView, curUser, 6);
                this.LJLILLLLZI = aRunnableS15S0300000_4;
                actionView.postDelayed(aRunnableS15S0300000_4, 300L);
            }
            this.LJLIL.storeBoolean("has_shown_tips", true);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(C9NE event) {
        o.LJIIIZ(event, "event");
        User curUser = HG3.LJIILL().getCurUser();
        if (AV1.LJIJJ(curUser)) {
            requestDisplayAction();
        }
        View actionView = getActionView();
        if (actionView != null) {
            actionView.post(new ARunnableS23S0200000_4(this, curUser, 17));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(C9NB event) {
        o.LJIIIZ(event, "event");
        hideAction();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(C9NC event) {
        o.LJIIIZ(event, "event");
        hideAction();
    }
}
