package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageSampleType {

    @InterfaceC65349Pkn("p2p_ratio")
    public LiveMessageSampleRatio p2pRatio;

    @InterfaceC65349Pkn("room_ratio")
    public LiveMessageSampleRatio roomRatio;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveMessageSampleType() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final LiveMessageSampleRatio getP2pRatio() {
        return this.p2pRatio;
    }

    public final LiveMessageSampleRatio getRoomRatio() {
        return this.roomRatio;
    }

    public final void setP2pRatio(LiveMessageSampleRatio liveMessageSampleRatio) {
        o.LJIIIZ(liveMessageSampleRatio, "<set-?>");
        this.p2pRatio = liveMessageSampleRatio;
    }

    public final void setRoomRatio(LiveMessageSampleRatio liveMessageSampleRatio) {
        o.LJIIIZ(liveMessageSampleRatio, "<set-?>");
        this.roomRatio = liveMessageSampleRatio;
    }

    public LiveMessageSampleType(LiveMessageSampleRatio roomRatio, LiveMessageSampleRatio p2pRatio) {
        o.LJIIIZ(roomRatio, "roomRatio");
        o.LJIIIZ(p2pRatio, "p2pRatio");
        this.roomRatio = roomRatio;
        this.p2pRatio = p2pRatio;
    }

    public /* synthetic */ LiveMessageSampleType(LiveMessageSampleRatio liveMessageSampleRatio, LiveMessageSampleRatio liveMessageSampleRatio2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LiveMessageSampleRatio(0L, 0L, 0L, 0L, 15, null) : liveMessageSampleRatio, (i & 2) != 0 ? new LiveMessageSampleRatio(0L, 0L, 0L, 0L, 15, null) : liveMessageSampleRatio2);
    }
}
