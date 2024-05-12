package com.bytedance.im.core.proto;

import X.C63496Ow0;
import X.C63497Ow1;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ModifyMessagePropertyRequestBody extends Message<ModifyMessagePropertyRequestBody, C63496Ow0> {
    public static final ProtoAdapter<ModifyMessagePropertyRequestBody> ADAPTER = new C63497Ow1();
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("property_list")
    public final ModifyPropertyBody property_list;

    @InterfaceC65349Pkn("ticket")
    public final String ticket;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ModifyMessagePropertyRequestBody, C63496Ow0> newBuilder2() {
        C63496Ow0 c63496Ow0 = new C63496Ow0();
        c63496Ow0.LIZLLL = this.property_list;
        c63496Ow0.LJ = this.ticket;
        c63496Ow0.addUnknownFields(unknownFields());
        return c63496Ow0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.property_list != null) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        return DIX.LIZLLL(sb, 0, 2, "ModifyMessagePropertyRequestBody{", '}');
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str) {
        this(modifyPropertyBody, str, C64537PUn.EMPTY);
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.property_list = modifyPropertyBody;
        this.ticket = str;
    }
}
