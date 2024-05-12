package com.bytedance.android.live.decoration;

import X.InterfaceC06390Mx;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationListDialog;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationListFragmentSheet;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerAnchorWidget;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.List;

/* loaded from: classes.dex */
public interface IDecorationService extends InterfaceC06390Mx {
    void D(DataChannel dataChannel);

    LiveStickerDonationListFragmentSheet R60();

    DonationStickerAnchorWidget SF(Layer2PriorityManager layer2PriorityManager);

    DecorationWrapperWidget Sp0(RecyclableWidgetManager recyclableWidgetManager);

    LiveStickerDonationListDialog T40();

    LiveStickerPropsDialog W80();

    Class<? extends Event<List<RoomDecoration>>> bj0();

    Class<? extends Event<RoomSticker>> pm0();

    Class<? extends LiveRecyclableWidget> zo0();
}
