package com.bytedance.android.live.wallet.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupData extends F9E {

    @InterfaceC65349Pkn("scenario_to_display")
    public final Map<String, Boolean> disPlayScenario;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.disPlayScenario};
    }

    public PopupData(Map<String, Boolean> disPlayScenario) {
        o.LJIIIZ(disPlayScenario, "disPlayScenario");
        this.disPlayScenario = disPlayScenario;
    }
}
