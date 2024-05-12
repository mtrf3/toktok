package com.bytedance.im.core.proto;

import X.C64537PUn;
import X.C87559YXz;
import X.DIX;
import X.EnumC87555YXv;
import X.InterfaceC65349Pkn;
import X.YY0;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes17.dex */
public final class TokenInfo extends Message<TokenInfo, C87559YXz> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("app_id")
    public final Integer app_id;

    @InterfaceC65349Pkn("mark_id")
    public final Integer mark_id;

    @InterfaceC65349Pkn("timestamp")
    public final Long timestamp;

    @InterfaceC65349Pkn("type")
    public final EnumC87555YXv type;

    @InterfaceC65349Pkn("user_id")
    public final Long user_id;
    public static final ProtoAdapter<TokenInfo> ADAPTER = new YY0();
    public static final Integer DEFAULT_MARK_ID = 0;
    public static final EnumC87555YXv DEFAULT_TYPE = EnumC87555YXv.DEFAULT_TOKEN;
    public static final Integer DEFAULT_APP_ID = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_TIMESTAMP = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<TokenInfo, C87559YXz> newBuilder2() {
        C87559YXz c87559YXz = new C87559YXz();
        c87559YXz.LIZLLL = this.mark_id;
        c87559YXz.LJ = this.type;
        c87559YXz.LJFF = this.app_id;
        c87559YXz.LJI = this.user_id;
        c87559YXz.LJII = this.timestamp;
        c87559YXz.addUnknownFields(unknownFields());
        return c87559YXz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mark_id != null) {
            sb.append(", mark_id=");
            sb.append(this.mark_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        return DIX.LIZLLL(sb, 0, 2, "TokenInfo{", '}');
    }

    public TokenInfo(Integer num, EnumC87555YXv enumC87555YXv, Integer num2, Long l, Long l2) {
        this(num, enumC87555YXv, num2, l, l2, C64537PUn.EMPTY);
    }

    public TokenInfo(Integer num, EnumC87555YXv enumC87555YXv, Integer num2, Long l, Long l2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.mark_id = num;
        this.type = enumC87555YXv;
        this.app_id = num2;
        this.user_id = l;
        this.timestamp = l2;
    }
}
