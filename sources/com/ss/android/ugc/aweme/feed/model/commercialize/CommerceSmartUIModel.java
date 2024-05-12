package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class CommerceSmartUIModel implements Serializable {

    @InterfaceC65349Pkn("playtime_ml")
    public CommerceSmartUIPlayTime playTime;

    @InterfaceC65349Pkn("commerce_ml_ui_strategy")
    public CommerceSmartUIStrategyConfig uiStrategy;

    public final CommerceSmartUIPlayTime getPlayTime() {
        return this.playTime;
    }

    public final CommerceSmartUIStrategyConfig getUiStrategy() {
        return this.uiStrategy;
    }

    public final void setPlayTime(CommerceSmartUIPlayTime commerceSmartUIPlayTime) {
        this.playTime = commerceSmartUIPlayTime;
    }

    public final void setUiStrategy(CommerceSmartUIStrategyConfig commerceSmartUIStrategyConfig) {
        this.uiStrategy = commerceSmartUIStrategyConfig;
    }
}
