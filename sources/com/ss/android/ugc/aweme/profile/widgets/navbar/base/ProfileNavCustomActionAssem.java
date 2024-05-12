package com.ss.android.ugc.aweme.profile.widgets.navbar.base;

import X.C235889No;
import X.C235929Ns;
import X.C61878OQg;
import X.C9HI;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileNavCustomActionAssem<AREA extends C9HI> extends ProfileNavActionAssem<AREA, C235929Ns> {
    public abstract View initCustomAction();

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public void initNavAction(C235929Ns navAction) {
        o.LJIIIZ(navAction, "navAction");
    }

    public final void hideAction() {
        getService().S6(getActionType());
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        C235889No navActionData = getNavActionData();
        if (navActionData != null) {
            navActionData.LJLIL.put(getActionType(), configHideActionList());
            navActionData.LJLILLLLZI.put(getActionType(), configHiddenByOthersActionList());
        }
        replaceAction(initCustomAction());
    }

    public final void requestDisplayAction() {
        getService().A5(getActionType());
    }

    public List<AREA> configHiddenByOthersActionList() {
        return C61878OQg.INSTANCE;
    }

    public List<AREA> configHideActionList() {
        return C61878OQg.INSTANCE;
    }

    public final void replaceAction(View view) {
        if (view == null) {
            return;
        }
        getService().uj(getActionType(), view);
    }
}
