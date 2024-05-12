package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdSlideBackInfoModel implements Serializable {

    @InterfaceC65349Pkn("button_strategy")
    public AdButtonReshowStrategyModel buttonStrategy;

    /* JADX WARN: Multi-variable type inference failed */
    public AdSlideBackInfoModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AdButtonReshowStrategyModel getButtonStrategy() {
        return this.buttonStrategy;
    }

    public AdSlideBackInfoModel(AdButtonReshowStrategyModel adButtonReshowStrategyModel) {
        this.buttonStrategy = adButtonReshowStrategyModel;
    }

    public final void setButtonStrategy(AdButtonReshowStrategyModel adButtonReshowStrategyModel) {
        this.buttonStrategy = adButtonReshowStrategyModel;
    }

    public /* synthetic */ AdSlideBackInfoModel(AdButtonReshowStrategyModel adButtonReshowStrategyModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : adButtonReshowStrategyModel);
    }
}
