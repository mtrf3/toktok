package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoHighLightBingLiveData {

    @InterfaceC65349Pkn("bot_card_bing_item_view")
    public final View bingItemView;

    @InterfaceC65349Pkn("bot_card_item_view")
    public final View botCardItemView;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoHighLightBingLiveData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TakoHighLightBingLiveData copy$default(TakoHighLightBingLiveData takoHighLightBingLiveData, View view, View view2, int i, Object obj) {
        if ((i & 1) != 0) {
            view = takoHighLightBingLiveData.botCardItemView;
        }
        if ((i & 2) != 0) {
            view2 = takoHighLightBingLiveData.bingItemView;
        }
        return takoHighLightBingLiveData.copy(view, view2);
    }

    public final TakoHighLightBingLiveData copy(View view, View view2) {
        return new TakoHighLightBingLiveData(view, view2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoHighLightBingLiveData)) {
            return false;
        }
        TakoHighLightBingLiveData takoHighLightBingLiveData = (TakoHighLightBingLiveData) obj;
        return o.LJ(this.botCardItemView, takoHighLightBingLiveData.botCardItemView) && o.LJ(this.bingItemView, takoHighLightBingLiveData.bingItemView);
    }

    public int hashCode() {
        View view = this.botCardItemView;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        View view2 = this.bingItemView;
        return hashCode + (view2 != null ? view2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoHighLightBingLiveData(botCardItemView=");
        LIZ.append(this.botCardItemView);
        LIZ.append(", bingItemView=");
        LIZ.append(this.bingItemView);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final View getBingItemView() {
        return this.bingItemView;
    }

    public final View getBotCardItemView() {
        return this.botCardItemView;
    }

    public TakoHighLightBingLiveData(View view, View view2) {
        this.botCardItemView = view;
        this.bingItemView = view2;
    }

    public /* synthetic */ TakoHighLightBingLiveData(View view, View view2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : view, (i & 2) != 0 ? null : view2);
    }
}
