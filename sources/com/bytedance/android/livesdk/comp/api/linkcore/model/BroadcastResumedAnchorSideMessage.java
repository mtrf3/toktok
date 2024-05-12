package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import X.U66;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class BroadcastResumedAnchorSideMessage extends F9E {
    public final U66 linker;
    public final List<String> rejectEnlargeLinkMicIdList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BroadcastResumedAnchorSideMessage copy$default(BroadcastResumedAnchorSideMessage broadcastResumedAnchorSideMessage, U66 u66, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            u66 = broadcastResumedAnchorSideMessage.linker;
        }
        if ((i & 2) != 0) {
            list = broadcastResumedAnchorSideMessage.rejectEnlargeLinkMicIdList;
        }
        return broadcastResumedAnchorSideMessage.copy(u66, list);
    }

    public final BroadcastResumedAnchorSideMessage copy(U66 linker, List<String> rejectEnlargeLinkMicIdList) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(rejectEnlargeLinkMicIdList, "rejectEnlargeLinkMicIdList");
        return new BroadcastResumedAnchorSideMessage(linker, rejectEnlargeLinkMicIdList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.linker, this.rejectEnlargeLinkMicIdList};
    }

    public final U66 getLinker() {
        return this.linker;
    }

    public final List<String> getRejectEnlargeLinkMicIdList() {
        return this.rejectEnlargeLinkMicIdList;
    }

    public BroadcastResumedAnchorSideMessage(U66 linker, List<String> rejectEnlargeLinkMicIdList) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(rejectEnlargeLinkMicIdList, "rejectEnlargeLinkMicIdList");
        this.linker = linker;
        this.rejectEnlargeLinkMicIdList = rejectEnlargeLinkMicIdList;
    }
}
