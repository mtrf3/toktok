package com.bytedance.im.core.proto;

import X.C63744P0a;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import X.P0Z;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class Config extends Message<Config, C63744P0a> {
    public static final ProtoAdapter<Config> ADAPTER = new P0Z();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("conf_name")
    public final String conf_name;

    @InterfaceC65349Pkn("conf_value")
    public final String conf_value;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<Config, C63744P0a> newBuilder2() {
        C63744P0a c63744P0a = new C63744P0a();
        c63744P0a.LIZLLL = this.conf_name;
        c63744P0a.LJ = this.conf_value;
        c63744P0a.addUnknownFields(unknownFields());
        return c63744P0a;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conf_name != null) {
            sb.append(", conf_name=");
            sb.append(this.conf_name);
        }
        if (this.conf_value != null) {
            sb.append(", conf_value=");
            sb.append(this.conf_value);
        }
        return DIX.LIZLLL(sb, 0, 2, "Config{", '}');
    }

    public Config(String str, String str2) {
        this(str, str2, C64537PUn.EMPTY);
    }

    public Config(String str, String str2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.conf_name = str;
        this.conf_value = str2;
    }
}
