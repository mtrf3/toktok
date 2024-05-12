package com.bytedance.android.livesdk.hashtag;

import X.B83;
import X.BCX;
import X.BZI;
import X.C28514BHa;
import X.C28518BHe;
import X.C28787BRn;
import X.C29044Baa;
import X.C29374Bfu;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastGameTagHasChangeChannel;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BroadcastHashTagWidget extends BaseHashTagWidget {
    public GameTag LJLJL;
    public Hashtag LJLJLJ;

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final boolean LJLZ() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void LJZI() {
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void LJZL() {
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastHashTagWidget(Layer2PriorityManager layer2PriorityManager) {
        super(layer2PriorityManager);
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0170, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r7.LIZJ()) == false) goto L45;
     */
    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ(androidx.fragment.app.FragmentManager r12) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget.LJZ(androidx.fragment.app.FragmentManager):void");
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void LL(Hashtag hashtag) {
        C28514BHa.LIZJ(hashtag);
    }

    public final void LLFFF(int i) {
        Long l;
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_native_gaming_toast_show");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(Integer.valueOf(i), "status");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "room_id");
        LiveMode liveMode = (LiveMode) this.dataChannel.kv0(BCX.class);
        if (liveMode != null) {
            int i2 = C28518BHe.LIZ[liveMode.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    str = "mobile_gaming";
                }
            } else {
                str = "obs";
            }
            LIZ.LJIJJ(str, "live_room_mode");
            LIZ.LJJIIJZLJL();
        }
        str = "";
        LIZ.LJIJJ(str, "live_room_mode");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.nv0(MicRoomDisableInteractionEvent.class, this, new AqS171S0100000_5(this, 383));
        dataChannel.ov0(this, BroadcastGameTagHasChangeChannel.class, new AqS171S0100000_5(this, 384));
    }
}
