package com.bytedance.im.core.proto;

import X.C278817o;
import X.C64537PUn;
import X.DIX;
import X.EnumC69903Rc3;
import X.InterfaceC65349Pkn;
import X.RTF;
import X.RTG;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class MuteBadgeCountInfo extends Message<MuteBadgeCountInfo, RTG> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("badge_count")
    public final Integer badge_count;

    @InterfaceC65349Pkn("message_type")
    public final EnumC69903Rc3 message_type;
    public static final ProtoAdapter<MuteBadgeCountInfo> ADAPTER = new RTF();
    public static final EnumC69903Rc3 DEFAULT_MESSAGE_TYPE = EnumC69903Rc3.TYPE_MENTION;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<MuteBadgeCountInfo, RTG> newBuilder2() {
        RTG rtg = new RTG();
        rtg.LIZLLL = this.message_type;
        rtg.LJ = this.badge_count;
        rtg.addUnknownFields(unknownFields());
        return rtg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", message_type=");
        LIZJ.append(this.message_type);
        LIZJ.append(", badge_count=");
        LIZJ.append(this.badge_count);
        return DIX.LIZLLL(LIZJ, 0, 2, "MuteBadgeCountInfo{", '}');
    }

    public MuteBadgeCountInfo(EnumC69903Rc3 enumC69903Rc3, Integer num) {
        this(enumC69903Rc3, num, C64537PUn.EMPTY);
    }

    public MuteBadgeCountInfo(EnumC69903Rc3 enumC69903Rc3, Integer num, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.message_type = enumC69903Rc3;
        this.badge_count = num;
    }
}
