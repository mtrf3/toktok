package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PollMessage extends CR6 {

    @InterfaceC65349Pkn("end_content")
    public PollEndContent endContent;

    @InterfaceC65349Pkn("message_type")
    public long messageType;

    @InterfaceC65349Pkn("poll_id")
    public long pollId;

    @InterfaceC65349Pkn("poll_kind")
    public Integer pollKind;

    @InterfaceC65349Pkn("start_content")
    public PollStartContent startContent;

    @InterfaceC65349Pkn("update_votes_content")
    public PollUpdateVotesContent updateContent;

    public PollMessage() {
        this.type = EnumC31509CYf.LIVE_POLL_MESSAGE;
        this.pollKind = 0;
    }
}
