package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V43 extends Message<V43, V33> {
    public static final ProtoAdapter<V43> ADAPTER = new V4H();
    public static final V3O DEFAULT_VIDEO_TYPE = V3O.Video;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C79135V3z cover;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 5)
    public final C63714OzW linkInfo;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Resolution#ADAPTER", tag = 6)
    public final C79143V4h resolution;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String video_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String video_model;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VideoType#ADAPTER", tag = 2)
    public final V3O video_type;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.video_id;
            int i7 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i8 = (hashCode + i) * 37;
            V3O v3o = this.video_type;
            if (v3o != null) {
                i2 = v3o.hashCode();
            } else {
                i2 = 0;
            }
            int i9 = (i8 + i2) * 37;
            C79135V3z c79135V3z = this.cover;
            if (c79135V3z != null) {
                i3 = c79135V3z.hashCode();
            } else {
                i3 = 0;
            }
            int i10 = (i9 + i3) * 37;
            String str2 = this.video_model;
            if (str2 != null) {
                i4 = str2.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i10 + i4) * 37;
            C63714OzW c63714OzW = this.linkInfo;
            if (c63714OzW != null) {
                i5 = c63714OzW.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 37;
            C79143V4h c79143V4h = this.resolution;
            if (c79143V4h != null) {
                i7 = c79143V4h.hashCode();
            }
            int i13 = i12 + i7;
            this.hashCode = i13;
            return i13;
        }
        return i6;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V43, V33> newBuilder2() {
        V33 v33 = new V33();
        v33.LIZLLL = this.video_id;
        v33.LJ = this.video_type;
        v33.LJFF = this.cover;
        v33.LJI = this.video_model;
        v33.LJII = this.linkInfo;
        v33.LJIIIIZZ = this.resolution;
        v33.addUnknownFields(unknownFields());
        return v33;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.video_id != null) {
            sb.append(", video_id=");
            sb.append(this.video_id);
        }
        if (this.video_type != null) {
            sb.append(", video_type=");
            sb.append(this.video_type);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.video_model != null) {
            sb.append(", video_model=");
            sb.append(this.video_model);
        }
        if (this.linkInfo != null) {
            sb.append(", linkInfo=");
            sb.append(this.linkInfo);
        }
        if (this.resolution != null) {
            sb.append(", resolution=");
            sb.append(this.resolution);
        }
        return DIX.LIZLLL(sb, 0, 2, "BaseVideo{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V43)) {
            return false;
        }
        V43 v43 = (V43) obj;
        if (unknownFields().equals(v43.unknownFields()) && C63685Oz3.LJ(this.video_id, v43.video_id) && C63685Oz3.LJ(this.video_type, v43.video_type) && C63685Oz3.LJ(this.cover, v43.cover) && C63685Oz3.LJ(this.video_model, v43.video_model) && C63685Oz3.LJ(this.linkInfo, v43.linkInfo) && C63685Oz3.LJ(this.resolution, v43.resolution)) {
            return true;
        }
        return false;
    }

    public V43(String str, V3O v3o, C79135V3z c79135V3z, String str2, C63714OzW c63714OzW, C79143V4h c79143V4h) {
        this(str, v3o, c79135V3z, str2, c63714OzW, c79143V4h, C64537PUn.EMPTY);
    }

    public V43(String str, V3O v3o, C79135V3z c79135V3z, String str2, C63714OzW c63714OzW, C79143V4h c79143V4h, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.video_id = str;
        this.video_type = v3o;
        this.cover = c79135V3z;
        this.video_model = str2;
        this.linkInfo = c63714OzW;
        this.resolution = c79143V4h;
    }
}
