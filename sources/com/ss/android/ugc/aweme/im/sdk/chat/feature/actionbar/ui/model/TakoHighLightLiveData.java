package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.model;

import X.InterfaceC65349Pkn;
import X.OSZ;
import X.X1D;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoHighLightLiveData {

    @InterfaceC65349Pkn("bot_card_item_view")
    public final View botCardItemView;

    @InterfaceC65349Pkn("horizontal_margin")
    public final OSZ<Integer, Integer> horizontalMargin;

    @InterfaceC65349Pkn("video_position")
    public final int videoPosition;

    @InterfaceC65349Pkn("video_recycler_view")
    public final RecyclerView videoRecyclerView;

    @InterfaceC65349Pkn("visible_item")
    public final View visibleItem;

    @InterfaceC65349Pkn("visible_position")
    public final Integer visiblePosition;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TakoHighLightLiveData copy$default(TakoHighLightLiveData takoHighLightLiveData, View view, RecyclerView recyclerView, int i, View view2, Integer num, OSZ osz, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            view = takoHighLightLiveData.botCardItemView;
        }
        if ((i2 & 2) != 0) {
            recyclerView = takoHighLightLiveData.videoRecyclerView;
        }
        if ((i2 & 4) != 0) {
            i = takoHighLightLiveData.videoPosition;
        }
        if ((i2 & 8) != 0) {
            view2 = takoHighLightLiveData.visibleItem;
        }
        if ((i2 & 16) != 0) {
            num = takoHighLightLiveData.visiblePosition;
        }
        if ((i2 & 32) != 0) {
            osz = takoHighLightLiveData.horizontalMargin;
        }
        return takoHighLightLiveData.copy(view, recyclerView, i, view2, num, osz);
    }

    public final TakoHighLightLiveData copy(View view, RecyclerView recyclerView, int i, View view2, Integer num, OSZ<Integer, Integer> horizontalMargin) {
        o.LJIIIZ(horizontalMargin, "horizontalMargin");
        return new TakoHighLightLiveData(view, recyclerView, i, view2, num, horizontalMargin);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoHighLightLiveData)) {
            return false;
        }
        TakoHighLightLiveData takoHighLightLiveData = (TakoHighLightLiveData) obj;
        return o.LJ(this.botCardItemView, takoHighLightLiveData.botCardItemView) && o.LJ(this.videoRecyclerView, takoHighLightLiveData.videoRecyclerView) && this.videoPosition == takoHighLightLiveData.videoPosition && o.LJ(this.visibleItem, takoHighLightLiveData.visibleItem) && o.LJ(this.visiblePosition, takoHighLightLiveData.visiblePosition) && o.LJ(this.horizontalMargin, takoHighLightLiveData.horizontalMargin);
    }

    public int hashCode() {
        View view = this.botCardItemView;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        RecyclerView recyclerView = this.videoRecyclerView;
        int hashCode2 = (((hashCode + (recyclerView == null ? 0 : recyclerView.hashCode())) * 31) + this.videoPosition) * 31;
        View view2 = this.visibleItem;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        Integer num = this.visiblePosition;
        return this.horizontalMargin.hashCode() + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoHighLightLiveData(botCardItemView=");
        LIZ.append(this.botCardItemView);
        LIZ.append(", videoRecyclerView=");
        LIZ.append(this.videoRecyclerView);
        LIZ.append(", videoPosition=");
        LIZ.append(this.videoPosition);
        LIZ.append(", visibleItem=");
        LIZ.append(this.visibleItem);
        LIZ.append(", visiblePosition=");
        LIZ.append(this.visiblePosition);
        LIZ.append(", horizontalMargin=");
        LIZ.append(this.horizontalMargin);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final View getBotCardItemView() {
        return this.botCardItemView;
    }

    public final OSZ<Integer, Integer> getHorizontalMargin() {
        return this.horizontalMargin;
    }

    public final int getVideoPosition() {
        return this.videoPosition;
    }

    public final RecyclerView getVideoRecyclerView() {
        return this.videoRecyclerView;
    }

    public final View getVisibleItem() {
        return this.visibleItem;
    }

    public final Integer getVisiblePosition() {
        return this.visiblePosition;
    }

    public TakoHighLightLiveData(View view, RecyclerView recyclerView, int i, View view2, Integer num, OSZ<Integer, Integer> horizontalMargin) {
        o.LJIIIZ(horizontalMargin, "horizontalMargin");
        this.botCardItemView = view;
        this.videoRecyclerView = recyclerView;
        this.videoPosition = i;
        this.visibleItem = view2;
        this.visiblePosition = num;
        this.horizontalMargin = horizontalMargin;
    }

    public /* synthetic */ TakoHighLightLiveData(View view, RecyclerView recyclerView, int i, View view2, Integer num, OSZ osz, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : view, (i2 & 2) == 0 ? recyclerView : null, i, view2, num, osz);
    }
}
