package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.C15490jB;
import X.C15620jO;
import X.C32533Cpl;
import X.C47061t0;
import X.CCK;
import X.CFX;
import X.CN1;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class GiftStartPollWidget extends LiveRecyclableWidget {
    public CCK LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dkd;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        ImageModel imageModel;
        Gift gift;
        Gift gift2;
        Gift gift3;
        Gift gift4;
        Gift gift5;
        Gift gift6;
        this.LJLIL = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        View findViewById = this.contentView.findViewById(R.id.dub);
        findViewById.setOutlineProvider(new C32533Cpl());
        findViewById.setClipToOutline(true);
        View findViewById2 = this.contentView.findViewById(R.id.duc);
        View findViewById3 = this.contentView.findViewById(R.id.dud);
        C15490jB.LJ(findViewById, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_gift_poll_widget.png");
        C15490jB.LJ(findViewById2, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_icon_gift_poll_coin.png");
        C15490jB.LJ(findViewById3, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_icon_gift_poll_coin.png");
        if (this.LJLIL != null) {
            C47061t0 c47061t0 = (C47061t0) this.contentView.findViewById(R.id.hw_);
            C47061t0 c47061t02 = (C47061t0) this.contentView.findViewById(R.id.hwf);
            TextView textView = (TextView) this.contentView.findViewById(R.id.hw9);
            CCK cck = this.LJLIL;
            ImageModel imageModel2 = null;
            if (cck != null && (gift6 = cck.LJLIL) != null) {
                str = gift6.name;
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = (TextView) this.contentView.findViewById(R.id.hwe);
            CCK cck2 = this.LJLIL;
            if (cck2 != null && (gift5 = cck2.LJLILLLLZI) != null) {
                str2 = gift5.name;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            TextView textView3 = (TextView) this.contentView.findViewById(R.id.fp4);
            CCK cck3 = this.LJLIL;
            if (cck3 != null && (gift4 = cck3.LJLIL) != null) {
                num = Integer.valueOf(gift4.diamondCount);
            } else {
                num = null;
            }
            textView3.setText(String.valueOf(num));
            TextView textView4 = (TextView) this.contentView.findViewById(R.id.j2v);
            CCK cck4 = this.LJLIL;
            if (cck4 != null && (gift3 = cck4.LJLILLLLZI) != null) {
                num2 = Integer.valueOf(gift3.diamondCount);
            } else {
                num2 = null;
            }
            textView4.setText(String.valueOf(num2));
            CCK cck5 = this.LJLIL;
            if (cck5 != null && (gift2 = cck5.LJLIL) != null) {
                imageModel = gift2.icon;
            } else {
                imageModel = null;
            }
            C15620jO.LIZIZ(imageModel, c47061t0);
            CCK cck6 = this.LJLIL;
            if (cck6 != null && (gift = cck6.LJLILLLLZI) != null) {
                imageModel2 = gift.icon;
            }
            C15620jO.LIZIZ(imageModel2, c47061t02);
        }
    }
}
