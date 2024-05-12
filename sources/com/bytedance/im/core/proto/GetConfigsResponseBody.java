package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63745P0b;
import X.C63746P0c;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes11.dex */
public final class GetConfigsResponseBody extends Message<GetConfigsResponseBody, C63746P0c> {
    public static final ProtoAdapter<GetConfigsResponseBody> ADAPTER = new C63745P0b();
    public static final Integer DEFAULT_VERSION = 0;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("configs")
    public final List<Config> configs;

    @InterfaceC65349Pkn("version")
    public final Integer version;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<GetConfigsResponseBody, C63746P0c> newBuilder2() {
        C63746P0c c63746P0c = new C63746P0c();
        c63746P0c.LIZLLL = this.version;
        c63746P0c.LJ = C63685Oz3.LIZJ("configs", this.configs);
        c63746P0c.addUnknownFields(unknownFields());
        return c63746P0c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        List<Config> list = this.configs;
        if (list != null && !list.isEmpty()) {
            sb.append(", configs=");
            sb.append(this.configs);
        }
        return DIX.LIZLLL(sb, 0, 2, "GetConfigsResponseBody{", '}');
    }

    public GetConfigsResponseBody(Integer num, List<Config> list) {
        this(num, list, C64537PUn.EMPTY);
    }

    public GetConfigsResponseBody(Integer num, List<Config> list, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.version = num;
        this.configs = C63685Oz3.LJFF("configs", list);
    }
}
