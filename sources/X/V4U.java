package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4U extends Message<V4U, C79119V3j> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C79135V3z cover;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long digg_count;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 4)
    public final C79135V3z fallback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long item_id;
    public static final ProtoAdapter<V4U> ADAPTER = new C79139V4d();
    public static final Long DEFAULT_ITEM_ID = 0L;
    public static final Long DEFAULT_DIGG_COUNT = 0L;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.item_id;
            int i5 = 0;
            if (l != null) {
                i = l.hashCode();
            } else {
                i = 0;
            }
            int i6 = (hashCode + i) * 37;
            Long l2 = this.digg_count;
            if (l2 != null) {
                i2 = l2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 37;
            C79135V3z c79135V3z = this.cover;
            if (c79135V3z != null) {
                i3 = c79135V3z.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 37;
            C79135V3z c79135V3z2 = this.fallback;
            if (c79135V3z2 != null) {
                i5 = c79135V3z2.hashCode();
            }
            int i9 = i8 + i5;
            this.hashCode = i9;
            return i9;
        }
        return i4;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V4U, C79119V3j> newBuilder2() {
        C79119V3j c79119V3j = new C79119V3j();
        c79119V3j.LIZLLL = this.item_id;
        c79119V3j.LJ = this.digg_count;
        c79119V3j.LJFF = this.cover;
        c79119V3j.LJI = this.fallback;
        c79119V3j.addUnknownFields(unknownFields());
        return c79119V3j;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.item_id != null) {
            sb.append(", item_id=");
            sb.append(this.item_id);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        return DIX.LIZLLL(sb, 0, 2, "Item{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4U)) {
            return false;
        }
        V4U v4u = (V4U) obj;
        if (unknownFields().equals(v4u.unknownFields()) && C63685Oz3.LJ(this.item_id, v4u.item_id) && C63685Oz3.LJ(this.digg_count, v4u.digg_count) && C63685Oz3.LJ(this.cover, v4u.cover) && C63685Oz3.LJ(this.fallback, v4u.fallback)) {
            return true;
        }
        return false;
    }

    public V4U(Long l, Long l2, C79135V3z c79135V3z, C79135V3z c79135V3z2) {
        this(l, l2, c79135V3z, c79135V3z2, C64537PUn.EMPTY);
    }

    public V4U(Long l, Long l2, C79135V3z c79135V3z, C79135V3z c79135V3z2, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.item_id = l;
        this.digg_count = l2;
        this.cover = c79135V3z;
        this.fallback = c79135V3z2;
    }
}
