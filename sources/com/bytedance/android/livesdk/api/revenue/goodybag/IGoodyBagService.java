package com.bytedance.android.livesdk.api.revenue.goodybag;

import X.BRB;
import X.InterfaceC06390Mx;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public interface IGoodyBagService extends InterfaceC06390Mx {
    boolean Ce(String str);

    Class<? extends LiveRecyclableWidget> SG();

    void Tm0(DataChannel dataChannel, String str);

    boolean V60(DataChannel dataChannel);

    BRB eQ();

    GoodyBagWidget qh0();
}
