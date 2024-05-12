package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* renamed from: X.V3t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79129V3t extends Message<C79129V3t, V36> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 4)
    public final C79135V3z avatar;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final RUF description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer follower_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean is_verify;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 5)
    public final C63714OzW link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final RUF nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long user_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 6)
    public final RUF username;
    public static final ProtoAdapter<C79129V3t> ADAPTER = new V4F();
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_FOLLOWER_COUNT = 0;
    public static final Boolean DEFAULT_IS_VERIFY = Boolean.FALSE;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.user_id;
            int i9 = 0;
            if (l != null) {
                i = l.hashCode();
            } else {
                i = 0;
            }
            int i10 = (hashCode + i) * 37;
            RUF ruf = this.nickname;
            if (ruf != null) {
                i2 = ruf.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i10 + i2) * 37;
            RUF ruf2 = this.description;
            if (ruf2 != null) {
                i3 = ruf2.hashCode();
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 37;
            C79135V3z c79135V3z = this.avatar;
            if (c79135V3z != null) {
                i4 = c79135V3z.hashCode();
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 37;
            C63714OzW c63714OzW = this.link_info;
            if (c63714OzW != null) {
                i5 = c63714OzW.hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 37;
            RUF ruf3 = this.username;
            if (ruf3 != null) {
                i6 = ruf3.hashCode();
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 37;
            Integer num = this.follower_count;
            if (num != null) {
                i7 = num.hashCode();
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 37;
            Boolean bool = this.is_verify;
            if (bool != null) {
                i9 = bool.hashCode();
            }
            int i17 = i16 + i9;
            this.hashCode = i17;
            return i17;
        }
        return i8;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C79129V3t, V36> newBuilder2() {
        V36 v36 = new V36();
        v36.LIZLLL = this.user_id;
        v36.LJ = this.nickname;
        v36.LJFF = this.description;
        v36.LJI = this.avatar;
        v36.LJII = this.link_info;
        v36.LJIIIIZZ = this.username;
        v36.LJIIIZ = this.follower_count;
        v36.LJIIJ = this.is_verify;
        v36.addUnknownFields(unknownFields());
        return v36;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.username != null) {
            sb.append(", username=");
            sb.append(this.username);
        }
        if (this.follower_count != null) {
            sb.append(", follower_count=");
            sb.append(this.follower_count);
        }
        if (this.is_verify != null) {
            sb.append(", is_verify=");
            sb.append(this.is_verify);
        }
        return DIX.LIZLLL(sb, 0, 2, "BaseUser{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79129V3t)) {
            return false;
        }
        C79129V3t c79129V3t = (C79129V3t) obj;
        if (unknownFields().equals(c79129V3t.unknownFields()) && C63685Oz3.LJ(this.user_id, c79129V3t.user_id) && C63685Oz3.LJ(this.nickname, c79129V3t.nickname) && C63685Oz3.LJ(this.description, c79129V3t.description) && C63685Oz3.LJ(this.avatar, c79129V3t.avatar) && C63685Oz3.LJ(this.link_info, c79129V3t.link_info) && C63685Oz3.LJ(this.username, c79129V3t.username) && C63685Oz3.LJ(this.follower_count, c79129V3t.follower_count) && C63685Oz3.LJ(this.is_verify, c79129V3t.is_verify)) {
            return true;
        }
        return false;
    }

    public C79129V3t(Long l, RUF ruf, RUF ruf2, C79135V3z c79135V3z, C63714OzW c63714OzW, RUF ruf3, Integer num, Boolean bool) {
        this(l, ruf, ruf2, c79135V3z, c63714OzW, ruf3, num, bool, C64537PUn.EMPTY);
    }

    public C79129V3t(Long l, RUF ruf, RUF ruf2, C79135V3z c79135V3z, C63714OzW c63714OzW, RUF ruf3, Integer num, Boolean bool, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.user_id = l;
        this.nickname = ruf;
        this.description = ruf2;
        this.avatar = c79135V3z;
        this.link_info = c63714OzW;
        this.username = ruf3;
        this.follower_count = num;
        this.is_verify = bool;
    }
}
