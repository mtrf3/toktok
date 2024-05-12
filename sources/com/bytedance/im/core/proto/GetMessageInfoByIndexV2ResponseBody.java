package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P17;
import X.P18;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class GetMessageInfoByIndexV2ResponseBody extends Message<GetMessageInfoByIndexV2ResponseBody, P18> {
    public static final ProtoAdapter<GetMessageInfoByIndexV2ResponseBody> ADAPTER = new P17();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("infos")
    public final Map<Long, MessageInfo> infos;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetMessageInfoByIndexV2ResponseBody, P18> newBuilder2() {
        P18 p18 = new P18();
        p18.LIZLLL = C63685Oz3.LIZLLL("infos", this.infos);
        p18.addUnknownFields(unknownFields());
        return p18;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<Long, MessageInfo> map = this.infos;
        if (map != null && !map.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetMessageInfoByIndexV2ResponseBody{", '}');
    }

    public GetMessageInfoByIndexV2ResponseBody(Map<Long, MessageInfo> map) {
        this(map, C64537PUn.EMPTY);
    }

    public GetMessageInfoByIndexV2ResponseBody(Map<Long, MessageInfo> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.infos = C63685Oz3.LJI("infos", map);
    }
}
