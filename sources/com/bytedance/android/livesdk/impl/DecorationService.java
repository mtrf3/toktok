package com.bytedance.android.livesdk.impl;

import X.BY1;
import X.C1A;
import android.os.Bundle;
import com.bytedance.android.live.decoration.IDecorationService;
import com.bytedance.android.live.decoration.RoomDonationDecorationsEvent;
import com.bytedance.android.live.decoration.RoomStickerDecorationsEvent;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
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
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class DecorationService implements IDecorationService {
    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final Class<? extends Event<List<RoomDecoration>>> bj0() {
        return RoomDonationDecorationsEvent.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final Class<? extends Event<RoomSticker>> pm0() {
        return RoomStickerDecorationsEvent.class;
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final Class<? extends LiveRecyclableWidget> zo0() {
        return DonationStickerAnchorWidget.class;
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final LiveStickerDonationListFragmentSheet R60() {
        LiveStickerDonationListFragmentSheet liveStickerDonationListFragmentSheet = new LiveStickerDonationListFragmentSheet();
        Bundle bundle = new Bundle();
        bundle.putString("event_page", "live_take_page");
        liveStickerDonationListFragmentSheet.setArguments(bundle);
        return liveStickerDonationListFragmentSheet;
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final LiveStickerDonationListDialog T40() {
        LiveStickerDonationListDialog liveStickerDonationListDialog = new LiveStickerDonationListDialog();
        Bundle bundle = new Bundle();
        bundle.putString("event_page", "live_take_page");
        liveStickerDonationListDialog.setArguments(bundle);
        return liveStickerDonationListDialog;
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final LiveStickerPropsDialog W80() {
        return new LiveStickerPropsDialog();
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final void D(DataChannel dataChannel) {
        C1A.LIZ.put(DecorationApi.class, new BY1());
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final DonationStickerAnchorWidget SF(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        return new DonationStickerAnchorWidget(layer2PriorityManager);
    }

    @Override // com.bytedance.android.live.decoration.IDecorationService
    public final DecorationWrapperWidget Sp0(RecyclableWidgetManager widgetManager) {
        o.LJIIIZ(widgetManager, "widgetManager");
        return new DecorationWrapperWidget();
    }
}
