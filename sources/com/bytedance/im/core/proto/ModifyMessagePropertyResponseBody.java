package com.bytedance.im.core.proto;

import X.C63716OzY;
import X.C63717OzZ;
import X.C64537PUn;
import X.DIX;
import X.EnumC63233Orl;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ModifyMessagePropertyResponseBody extends Message<ModifyMessagePropertyResponseBody, C63717OzZ> {
    public static final ProtoAdapter<ModifyMessagePropertyResponseBody> ADAPTER = new C63716OzY();
    public static final EnumC63233Orl DEFAULT_STATUS = EnumC63233Orl.MODIFY_PROPERTY_SUCCESS;
    public static final Long DEFAULT_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("status")
    public final EnumC63233Orl status;

    @InterfaceC65349Pkn("version")
    public final Long version;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ModifyMessagePropertyResponseBody, C63717OzZ> newBuilder2() {
        C63717OzZ c63717OzZ = new C63717OzZ();
        c63717OzZ.LIZLLL = this.status;
        c63717OzZ.LJ = this.version;
        c63717OzZ.addUnknownFields(unknownFields());
        return c63717OzZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        return DIX.LIZLLL(sb, 0, 2, "ModifyMessagePropertyResponseBody{", '}');
    }

    public ModifyMessagePropertyResponseBody(EnumC63233Orl enumC63233Orl, Long l) {
        this(enumC63233Orl, l, C64537PUn.EMPTY);
    }

    public ModifyMessagePropertyResponseBody(EnumC63233Orl enumC63233Orl, Long l, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.status = enumC63233Orl;
        this.version = l;
    }
}
