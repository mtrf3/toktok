package com.bytedance.im.core.proto;

import X.C278817o;
import X.C63547Owp;
import X.C63548Owq;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes11.dex */
public final class ReferencedMessageInfo extends AndroidMessage<ReferencedMessageInfo, C63547Owp> {
    public static final ProtoAdapter<ReferencedMessageInfo> ADAPTER;
    public static final Parcelable.Creator<ReferencedMessageInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX;
    public static final Long DEFAULT_ROOT_MESSAGE_ID;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("hint")
    public final String hint;

    @InterfaceC65349Pkn("referenced_message_id")
    public final Long referenced_message_id;

    @InterfaceC65349Pkn("root_message_conv_index")
    public final Long root_message_conv_index;

    @InterfaceC65349Pkn("root_message_id")
    public final Long root_message_id;

    static {
        C63548Owq c63548Owq = new C63548Owq();
        ADAPTER = c63548Owq;
        CREATOR = AndroidMessage.newCreator(c63548Owq);
        DEFAULT_REFERENCED_MESSAGE_ID = 0L;
        DEFAULT_ROOT_MESSAGE_ID = 0L;
        DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public C63547Owp newBuilder2() {
        C63547Owp c63547Owp = new C63547Owp();
        c63547Owp.LIZLLL = this.referenced_message_id;
        c63547Owp.LJ = this.hint;
        c63547Owp.LJFF = this.root_message_id;
        c63547Owp.LJI = this.root_message_conv_index;
        c63547Owp.addUnknownFields(unknownFields());
        return c63547Owp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", referenced_message_id=");
        LIZJ.append(this.referenced_message_id);
        LIZJ.append(", hint=");
        LIZJ.append(this.hint);
        if (this.root_message_id != null) {
            LIZJ.append(", root_message_id=");
            LIZJ.append(this.root_message_id);
        }
        if (this.root_message_conv_index != null) {
            LIZJ.append(", root_message_conv_index=");
            LIZJ.append(this.root_message_conv_index);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "ReferencedMessageInfo{", '}');
    }

    public ReferencedMessageInfo(Long l, String str, Long l2, Long l3) {
        this(l, str, l2, l3, C64537PUn.EMPTY);
    }

    public ReferencedMessageInfo(Long l, String str, Long l2, Long l3, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.referenced_message_id = l;
        this.hint = str;
        this.root_message_id = l2;
        this.root_message_conv_index = l3;
    }
}
