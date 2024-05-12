package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63576OxI;
import X.C63577OxJ;
import X.C64537PUn;
import X.DIX;
import X.EnumC109604Rw;
import X.InterfaceC65349Pkn;
import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ReferenceInfo extends AndroidMessage<ReferenceInfo, C63577OxJ> {
    public static final ProtoAdapter<ReferenceInfo> ADAPTER;
    public static final Parcelable.Creator<ReferenceInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID;
    public static final EnumC109604Rw DEFAULT_REFERENCED_MESSAGE_STATUS;
    public static final Long DEFAULT_REF_MESSAGE_TYPE;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX;
    public static final Long DEFAULT_ROOT_MESSAGE_ID;
    public static final Long DEFAULT_SENDER;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("fallback_text")
    public final String fallback_text;

    @InterfaceC65349Pkn("hint")
    public final String hint;

    @InterfaceC65349Pkn("ref_message_type")
    public final Long ref_message_type;

    @InterfaceC65349Pkn("referenced_message_id")
    public final Long referenced_message_id;

    @InterfaceC65349Pkn("referenced_message_scene")
    public final String referenced_message_scene;

    @InterfaceC65349Pkn("referenced_message_status")
    public final EnumC109604Rw referenced_message_status;

    @InterfaceC65349Pkn("root_message_conv_index")
    public final Long root_message_conv_index;

    @InterfaceC65349Pkn("root_message_id")
    public final Long root_message_id;

    @InterfaceC65349Pkn("sender")
    public final Long sender;

    static {
        C63576OxI c63576OxI = new C63576OxI();
        ADAPTER = c63576OxI;
        CREATOR = AndroidMessage.newCreator(c63576OxI);
        DEFAULT_REFERENCED_MESSAGE_ID = 0L;
        DEFAULT_REF_MESSAGE_TYPE = 0L;
        DEFAULT_REFERENCED_MESSAGE_STATUS = EnumC109604Rw.AVAILABLE;
        DEFAULT_ROOT_MESSAGE_ID = 0L;
        DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
        DEFAULT_SENDER = 0L;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public C63577OxJ newBuilder2() {
        C63577OxJ c63577OxJ = new C63577OxJ();
        c63577OxJ.LIZLLL = this.referenced_message_id;
        c63577OxJ.LJ = this.hint;
        c63577OxJ.LJFF = this.ref_message_type;
        c63577OxJ.LJI = this.referenced_message_status;
        c63577OxJ.LJII = this.root_message_id;
        c63577OxJ.LJIIIIZZ = this.root_message_conv_index;
        c63577OxJ.LJIIIZ = this.sender;
        c63577OxJ.LJIIJ = this.referenced_message_scene;
        c63577OxJ.LJIIJJI = this.fallback_text;
        c63577OxJ.addUnknownFields(unknownFields());
        return c63577OxJ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", referenced_message_id=");
        LIZJ.append(this.referenced_message_id);
        LIZJ.append(", hint=");
        LIZJ.append(this.hint);
        LIZJ.append(", ref_message_type=");
        LIZJ.append(this.ref_message_type);
        LIZJ.append(", referenced_message_status=");
        LIZJ.append(this.referenced_message_status);
        if (this.root_message_id != null) {
            LIZJ.append(", root_message_id=");
            LIZJ.append(this.root_message_id);
        }
        if (this.root_message_conv_index != null) {
            LIZJ.append(", root_message_conv_index=");
            LIZJ.append(this.root_message_conv_index);
        }
        if (this.sender != null) {
            LIZJ.append(", sender=");
            LIZJ.append(this.sender);
        }
        if (this.referenced_message_scene != null) {
            LIZJ.append(", referenced_message_scene=");
            LIZJ.append(this.referenced_message_scene);
        }
        if (this.fallback_text != null) {
            LIZJ.append(", fallback_text=");
            LIZJ.append(this.fallback_text);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "ReferenceInfo{", '}');
    }

    public ReferenceInfo(Long l, String str, Long l2, EnumC109604Rw enumC109604Rw, Long l3, Long l4, Long l5, String str2, String str3) {
        this(l, str, l2, enumC109604Rw, l3, l4, l5, str2, str3, C64537PUn.EMPTY);
    }

    public ReferenceInfo(Long l, String str, Long l2, EnumC109604Rw enumC109604Rw, Long l3, Long l4, Long l5, String str2, String str3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.referenced_message_id = l;
        this.hint = str;
        this.ref_message_type = l2;
        this.referenced_message_status = enumC109604Rw;
        this.root_message_id = l3;
        this.root_message_conv_index = l4;
        this.sender = l5;
        this.referenced_message_scene = str2;
        this.fallback_text = str3;
    }
}
