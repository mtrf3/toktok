package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4Y extends Message<V4Y, C79121V3l> {
    public static final ProtoAdapter<V4Y> ADAPTER = new C79140V4e();
    public static final Long DEFAULT_USER_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C79135V3z avatar_thumb;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String nick_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;

    public int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.user_id;
            int i4 = 0;
            if (l != null) {
                i = l.hashCode();
            } else {
                i = 0;
            }
            int i5 = (hashCode + i) * 37;
            String str = this.nick_name;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 37;
            C79135V3z c79135V3z = this.avatar_thumb;
            if (c79135V3z != null) {
                i4 = c79135V3z.hashCode();
            }
            int i7 = i6 + i4;
            this.hashCode = i7;
            return i7;
        }
        return i3;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V4Y, C79121V3l> newBuilder2() {
        C79121V3l c79121V3l = new C79121V3l();
        c79121V3l.LIZLLL = this.user_id;
        c79121V3l.LJ = this.nick_name;
        c79121V3l.LJFF = this.avatar_thumb;
        c79121V3l.addUnknownFields(unknownFields());
        return c79121V3l;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.nick_name != null) {
            sb.append(", nick_name=");
            sb.append(this.nick_name);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=");
            sb.append(this.avatar_thumb);
        }
        return DIX.LIZLLL(sb, 0, 2, "UserInfo{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4Y)) {
            return false;
        }
        V4Y v4y = (V4Y) obj;
        if (unknownFields().equals(v4y.unknownFields()) && C63685Oz3.LJ(this.user_id, v4y.user_id) && C63685Oz3.LJ(this.nick_name, v4y.nick_name) && C63685Oz3.LJ(this.avatar_thumb, v4y.avatar_thumb)) {
            return true;
        }
        return false;
    }

    public V4Y(Long l, String str, C79135V3z c79135V3z) {
        this(l, str, c79135V3z, C64537PUn.EMPTY);
    }

    public V4Y(Long l, String str, C79135V3z c79135V3z, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.user_id = l;
        this.nick_name = str;
        this.avatar_thumb = c79135V3z;
    }
}
