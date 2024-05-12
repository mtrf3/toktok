package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizJoinDirectResponseData extends F9E {

    @InterfaceC65349Pkn("anchor_new_fix_mic_num")
    public int fixMicNumAction;

    @InterfaceC65349Pkn("anchor_new_layout")
    public int layoutTypeAction;

    @InterfaceC65349Pkn("link_type_permission")
    public long linkTypePermission;

    @InterfaceC65349Pkn("reply_im_msg_id")
    public long replyImMsgId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BizJoinDirectResponseData() {
        /*
            r9 = this;
            r1 = 0
            r5 = 0
            r7 = 15
            r8 = 0
            r0 = r9
            r3 = r1
            r6 = r5
            r0.<init>(r1, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponseData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.replyImMsgId), Long.valueOf(this.linkTypePermission), Integer.valueOf(this.layoutTypeAction), Integer.valueOf(this.fixMicNumAction)};
    }

    public BizJoinDirectResponseData(long j, long j2, int i, int i2) {
        this.replyImMsgId = j;
        this.linkTypePermission = j2;
        this.layoutTypeAction = i;
        this.fixMicNumAction = i2;
    }

    public /* synthetic */ BizJoinDirectResponseData(long j, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) == 0 ? j2 : 0L, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
