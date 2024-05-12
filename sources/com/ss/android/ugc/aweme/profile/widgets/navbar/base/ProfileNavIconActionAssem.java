package com.ss.android.ugc.aweme.profile.widgets.navbar.base;

import X.C234529Ii;
import X.C235889No;
import X.C61878OQg;
import X.C76800UCe;
import X.C9HI;
import X.InterfaceC88472Yns;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileNavIconActionAssem<AREA extends C9HI> extends ProfileNavActionAssem<AREA, C234529Ii> {
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
        updateAction(new AqS170S0100000_4((ProfileNavIconActionAssem) this, 718));
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

    public final void updateAction(InterfaceC88472Yns<? super C234529Ii, C76800UCe> updater) {
        o.LJIIIZ(updater, "updater");
        getService().ui(getActionType(), updater);
    }
}
