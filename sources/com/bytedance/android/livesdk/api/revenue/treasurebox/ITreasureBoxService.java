package com.bytedance.android.livesdk.api.revenue.treasurebox;

import X.InterfaceC06390Mx;
import com.bytedance.android.livesdk.impl.revenue.TreasureBoxRootWidget;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public interface ITreasureBoxService extends InterfaceC06390Mx {
    ActivityTreasureBoxWidget LI();

    Class<? extends LiveRecyclableWidget> Xf0();

    void Y7();

    void Zl0(DataChannel dataChannel, String str);

    Class<? extends LiveRecyclableWidget> qr0();

    TreasureBoxRootWidget sE();

    void sf0(DataChannel dataChannel, Long l, String str);

    boolean tg();
}
