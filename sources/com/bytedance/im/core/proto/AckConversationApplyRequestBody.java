package com.bytedance.im.core.proto;

import X.C120464o6;
import X.C63685Oz3;
import X.C63732Ozo;
import X.C64537PUn;
import X.C89451Z8t;
import X.DIX;
import X.EnumC115774gX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class AckConversationApplyRequestBody extends Message<AckConversationApplyRequestBody, C120464o6> {
    public static final ProtoAdapter<AckConversationApplyRequestBody> ADAPTER;
    public static final Long DEFAULT_APPLY_ID;
    public static final EnumC115774gX DEFAULT_APPLY_STATUS;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("apply_id")
    public final Long apply_id;

    @InterfaceC65349Pkn("apply_status")
    public final EnumC115774gX apply_status;

    @InterfaceC65349Pkn("bizExt")
    public final Map<String, String> bizExt;

    static {
        C63732Ozo c63732Ozo = new C63732Ozo();
        ADAPTER = c63732Ozo;
        DEFAULT_APPLY_ID = 0L;
        DEFAULT_APPLY_STATUS = EnumC115774gX.APPLYING;
        C89451Z8t.LJ.put(2025, c63732Ozo);
    }

    public static void registerAdapter() {
        C89451Z8t.LJ.put(2025, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<AckConversationApplyRequestBody, C120464o6> newBuilder2() {
        C120464o6 c120464o6 = new C120464o6();
        c120464o6.LIZLLL = this.apply_id;
        c120464o6.LJ = this.apply_status;
        c120464o6.LJFF = C63685Oz3.LIZLLL("bizExt", this.bizExt);
        c120464o6.addUnknownFields(unknownFields());
        return c120464o6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.apply_id != null) {
            sb.append(", apply_id=");
            sb.append(this.apply_id);
        }
        if (this.apply_status != null) {
            sb.append(", apply_status=");
            sb.append(this.apply_status);
        }
        Map<String, String> map = this.bizExt;
        if (map != null && !map.isEmpty()) {
            sb.append(", bizExt=");
            sb.append(this.bizExt);
        }
        return DIX.LIZLLL(sb, 0, 2, "AckConversationApplyRequestBody{", '}');
    }

    public AckConversationApplyRequestBody(Long l, EnumC115774gX enumC115774gX, Map<String, String> map) {
        this(l, enumC115774gX, map, C64537PUn.EMPTY);
    }

    public AckConversationApplyRequestBody(Long l, EnumC115774gX enumC115774gX, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.apply_id = l;
        this.apply_status = enumC115774gX;
        this.bizExt = C63685Oz3.LJI("bizExt", map);
    }
}
