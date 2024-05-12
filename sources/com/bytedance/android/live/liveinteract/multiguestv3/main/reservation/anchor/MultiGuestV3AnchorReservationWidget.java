package com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor;

import X.C03880Dg;
import X.C0NB;
import X.C29306Beo;
import X.C65300Pk0;
import X.C74845TYz;
import X.InterfaceC55235Lm3;
import X.UC0;
import Y.IDDListenerS145S0100000_5;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.MultiGuestReservationDiffPkEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestV3AnchorReservationWidget extends BaseMultiGuestV3AnchorWidget {
    public final FrameLayout LJLIL;
    public C74845TYz LJLILLLLZI;
    public MultiLiveAsAnchorListDialogV2 LJLJI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, com.bytedance.android.live.liveinteract.api.LinkMicAnchorWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TZC
    public final boolean BG() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
        if (multiLiveAsAnchorListDialogV2 == null || !multiLiveAsAnchorListDialogV2.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // X.TZC
    public final InterfaceC55235Lm3 linkScope() {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            return UC0.LJJIL(frameLayout);
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C0NB.LIZIZ("MultiGuestV3AnchorReservationWidget", "onDestroy");
        C74845TYz c74845TYz = this.LJLILLLLZI;
        if (c74845TYz != null) {
            c74845TYz.detachView();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C29306Beo.LJJJJ(multiLiveAsAnchorListDialogV2);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        super.onCreate();
        C0NB.LIZIZ("MultiGuestV3AnchorReservationWidget", "onCreate");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            this.LJLILLLLZI = new C74845TYz(room, dataChannel2, this);
        }
        C74845TYz c74845TYz = this.LJLILLLLZI;
        if (c74845TYz != null) {
            c74845TYz.attachView((C74845TYz) this);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.mv0(MultiGuestReservationDiffPkEvent.class, this, new AqS179S0100000_13(this, 168));
        }
    }

    public MultiGuestV3AnchorReservationWidget(FrameLayout mAnchorContainer) {
        o.LJIIIZ(mAnchorContainer, "mAnchorContainer");
        this.LJLIL = mAnchorContainer;
    }

    @Override // X.TZC
    public final void onPlayerListChange(List<LinkPlayerInfo> list) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22;
        if (isViewValid() && (multiLiveAsAnchorListDialogV2 = this.LJLJI) != null && multiLiveAsAnchorListDialogV2.isShowing() && (multiLiveAsAnchorListDialogV22 = this.LJLJI) != null) {
            multiLiveAsAnchorListDialogV22.onPlayerListChange(list);
        }
    }

    @Override // X.InterfaceC32182Ck6
    public final void LJIL(String str, String str2) {
        C74845TYz c74845TYz = this.LJLILLLLZI;
        if (c74845TYz != null) {
            c74845TYz.LJJJJLL();
        }
    }

    @Override // X.TZC
    public final void tv(String str, String str2, List list) {
        C74845TYz c74845TYz;
        DataChannel dataChannel;
        if (isViewValid() && (c74845TYz = this.LJLILLLLZI) != null) {
            if (this.LJLJI == null) {
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                C74845TYz c74845TYz2 = this.LJLILLLLZI;
                if (c74845TYz2 != null) {
                    dataChannel = c74845TYz2.dataChannel;
                } else {
                    dataChannel = null;
                }
                this.LJLJI = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c74845TYz, 1);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
            if (multiLiveAsAnchorListDialogV2 != null) {
                multiLiveAsAnchorListDialogV2.LJLJI(str);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LJLJI;
            if (multiLiveAsAnchorListDialogV22 != null) {
                multiLiveAsAnchorListDialogV22.LLILLIZIL = str2;
                multiLiveAsAnchorListDialogV22.setOnDismissListener(new IDDListenerS145S0100000_5(this, 12));
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV23 = this.LJLJI;
            if (multiLiveAsAnchorListDialogV23 == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/anchor/MultiLiveAsAnchorListDialogV2", "show", multiLiveAsAnchorListDialogV23, new Object[0], "void", new C65300Pk0(false, "()V", "-9216480646776624569")).LIZ) {
                return;
            }
            multiLiveAsAnchorListDialogV23.show();
        }
    }
}
