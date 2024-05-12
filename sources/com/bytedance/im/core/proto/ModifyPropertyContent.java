package com.bytedance.im.core.proto;

import X.C63511OwF;
import X.C63512OwG;
import X.C64537PUn;
import X.DIX;
import X.EnumC63258OsA;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ModifyPropertyContent extends Message<ModifyPropertyContent, C63512OwG> {
    public static final ProtoAdapter<ModifyPropertyContent> ADAPTER = new C63511OwF();
    public static final EnumC63258OsA DEFAULT_OPERATION = EnumC63258OsA.ADD_PROPERTY_ITEM;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("idempotent_id")
    public final String idempotent_id;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("operation")
    public final EnumC63258OsA operation;

    @InterfaceC65349Pkn("value")
    public final String value;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ModifyPropertyContent, C63512OwG> newBuilder2() {
        C63512OwG c63512OwG = new C63512OwG();
        c63512OwG.LIZLLL = this.operation;
        c63512OwG.LJ = this.key;
        c63512OwG.LJFF = this.value;
        c63512OwG.LJI = this.idempotent_id;
        c63512OwG.addUnknownFields(unknownFields());
        return c63512OwG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        return DIX.LIZLLL(sb, 0, 2, "ModifyPropertyContent{", '}');
    }

    public ModifyPropertyContent(EnumC63258OsA enumC63258OsA, String str, String str2, String str3) {
        this(enumC63258OsA, str, str2, str3, C64537PUn.EMPTY);
    }

    public ModifyPropertyContent(EnumC63258OsA enumC63258OsA, String str, String str2, String str3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.operation = enumC63258OsA;
        this.key = str;
        this.value = str2;
        this.idempotent_id = str3;
    }
}
