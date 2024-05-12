package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0V;
import X.P0W;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class ParticipantsPage extends Message<ParticipantsPage, P0W> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean has_more;

    @InterfaceC65349Pkn("participants")
    public final List<Participant> participants;
    public static final ProtoAdapter<ParticipantsPage> ADAPTER = new P0V();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_CURSOR = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ParticipantsPage, P0W> newBuilder2() {
        P0W p0w = new P0W();
        p0w.LIZLLL = C63685Oz3.LIZJ("participants", this.participants);
        p0w.LJ = this.has_more;
        p0w.LJFF = this.cursor;
        p0w.addUnknownFields(unknownFields());
        return p0w;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Participant> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        return DIX.LIZLLL(sb, 0, 2, "ParticipantsPage{", '}');
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l) {
        this(list, bool, l, C64537PUn.EMPTY);
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.participants = C63685Oz3.LJFF("participants", list);
        this.has_more = bool;
        this.cursor = l;
    }
}
