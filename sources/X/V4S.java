package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V4S extends Message<V4S, C79144V4i> {
    public static final ProtoAdapter<V4S> ADAPTER = new V4T();
    public static final C64537PUn DEFAULT_EXTRA_CONTENT = C64537PUn.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 100)
    public final java.util.Map<String, C79135V3z> business_image_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 102)
    public final java.util.Map<String, C79129V3t> business_user_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 101)
    public final java.util.Map<String, V43> business_video_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Button#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final java.util.Map<String, C79141V4f> button_map;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 200)
    public final C64537PUn extra_content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = 7)
    public final V4Q fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final java.util.Map<String, C79135V3z> image_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final java.util.Map<String, C63714OzW> link_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 8)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 201)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 202)
    public final RUB resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final java.util.Map<String, RUF> text_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final java.util.Map<String, C79129V3t> user_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final java.util.Map<String, V43> video_map;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = (this.user_map.hashCode() + ((this.video_map.hashCode() + ((this.button_map.hashCode() + ((this.link_map.hashCode() + ((this.image_map.hashCode() + ((this.text_map.hashCode() + (unknownFields().hashCode() * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37;
            V4Q v4q = this.fallback_info;
            int i6 = 0;
            if (v4q != null) {
                i = v4q.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i2 = v4l.hashCode();
            } else {
                i2 = 0;
            }
            int hashCode2 = (this.business_user_map.hashCode() + ((this.business_video_map.hashCode() + ((this.business_image_map.hashCode() + ((i7 + i2) * 37)) * 37)) * 37)) * 37;
            C64537PUn c64537PUn = this.extra_content;
            if (c64537PUn != null) {
                i3 = c64537PUn.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (hashCode2 + i3) * 37;
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i4 = ru2.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i6 = rub.hashCode();
            }
            int i10 = i9 + i6;
            this.hashCode = i10;
            return i10;
        }
        return i5;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V4S, C79144V4i> newBuilder2() {
        C79144V4i c79144V4i = new C79144V4i();
        c79144V4i.LIZLLL = C63685Oz3.LIZLLL("text_map", this.text_map);
        c79144V4i.LJ = C63685Oz3.LIZLLL("image_map", this.image_map);
        c79144V4i.LJFF = C63685Oz3.LIZLLL("link_map", this.link_map);
        c79144V4i.LJI = C63685Oz3.LIZLLL("button_map", this.button_map);
        c79144V4i.LJII = C63685Oz3.LIZLLL("video_map", this.video_map);
        c79144V4i.LJIIIIZZ = C63685Oz3.LIZLLL("user_map", this.user_map);
        c79144V4i.LJIIIZ = this.fallback_info;
        c79144V4i.LJIIJ = this.preview_hint;
        c79144V4i.LJIIJJI = C63685Oz3.LIZLLL("business_image_map", this.business_image_map);
        c79144V4i.LJIIL = C63685Oz3.LIZLLL("business_video_map", this.business_video_map);
        c79144V4i.LJIILIIL = C63685Oz3.LIZLLL("business_user_map", this.business_user_map);
        c79144V4i.LJIILJJIL = this.extra_content;
        c79144V4i.LJIILL = this.req_base;
        c79144V4i.LJIILLIIL = this.resp_base;
        c79144V4i.addUnknownFields(unknownFields());
        return c79144V4i;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.text_map.isEmpty()) {
            sb.append(", text_map=");
            sb.append(this.text_map);
        }
        if (!this.image_map.isEmpty()) {
            sb.append(", image_map=");
            sb.append(this.image_map);
        }
        if (!this.link_map.isEmpty()) {
            sb.append(", link_map=");
            sb.append(this.link_map);
        }
        if (!this.button_map.isEmpty()) {
            sb.append(", button_map=");
            sb.append(this.button_map);
        }
        if (!this.video_map.isEmpty()) {
            sb.append(", video_map=");
            sb.append(this.video_map);
        }
        if (!this.user_map.isEmpty()) {
            sb.append(", user_map=");
            sb.append(this.user_map);
        }
        if (this.fallback_info != null) {
            sb.append(", fallback_info=");
            sb.append(this.fallback_info);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (!this.business_image_map.isEmpty()) {
            sb.append(", business_image_map=");
            sb.append(this.business_image_map);
        }
        if (!this.business_video_map.isEmpty()) {
            sb.append(", business_video_map=");
            sb.append(this.business_video_map);
        }
        if (!this.business_user_map.isEmpty()) {
            sb.append(", business_user_map=");
            sb.append(this.business_user_map);
        }
        if (this.extra_content != null) {
            sb.append(", extra_content=");
            sb.append(this.extra_content);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "CommonMsgCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V4S)) {
            return false;
        }
        V4S v4s = (V4S) obj;
        if (unknownFields().equals(v4s.unknownFields()) && this.text_map.equals(v4s.text_map) && this.image_map.equals(v4s.image_map) && this.link_map.equals(v4s.link_map) && this.button_map.equals(v4s.button_map) && this.video_map.equals(v4s.video_map) && this.user_map.equals(v4s.user_map) && C63685Oz3.LJ(this.fallback_info, v4s.fallback_info) && C63685Oz3.LJ(this.preview_hint, v4s.preview_hint) && this.business_image_map.equals(v4s.business_image_map) && this.business_video_map.equals(v4s.business_video_map) && this.business_user_map.equals(v4s.business_user_map) && C63685Oz3.LJ(this.extra_content, v4s.extra_content) && C63685Oz3.LJ(this.req_base, v4s.req_base) && C63685Oz3.LJ(this.resp_base, v4s.resp_base)) {
            return true;
        }
        return false;
    }

    public V4S(java.util.Map<String, RUF> map, java.util.Map<String, C79135V3z> map2, java.util.Map<String, C63714OzW> map3, java.util.Map<String, C79141V4f> map4, java.util.Map<String, V43> map5, java.util.Map<String, C79129V3t> map6, V4Q v4q, V4L v4l, java.util.Map<String, C79135V3z> map7, java.util.Map<String, V43> map8, java.util.Map<String, C79129V3t> map9, C64537PUn c64537PUn, RU2 ru2, RUB rub) {
        this(map, map2, map3, map4, map5, map6, v4q, v4l, map7, map8, map9, c64537PUn, ru2, rub, C64537PUn.EMPTY);
    }

    public V4S(java.util.Map<String, RUF> map, java.util.Map<String, C79135V3z> map2, java.util.Map<String, C63714OzW> map3, java.util.Map<String, C79141V4f> map4, java.util.Map<String, V43> map5, java.util.Map<String, C79129V3t> map6, V4Q v4q, V4L v4l, java.util.Map<String, C79135V3z> map7, java.util.Map<String, V43> map8, java.util.Map<String, C79129V3t> map9, C64537PUn c64537PUn, RU2 ru2, RUB rub, C64537PUn c64537PUn2) {
        super(ADAPTER, c64537PUn2);
        this.text_map = C63685Oz3.LJI("text_map", map);
        this.image_map = C63685Oz3.LJI("image_map", map2);
        this.link_map = C63685Oz3.LJI("link_map", map3);
        this.button_map = C63685Oz3.LJI("button_map", map4);
        this.video_map = C63685Oz3.LJI("video_map", map5);
        this.user_map = C63685Oz3.LJI("user_map", map6);
        this.fallback_info = v4q;
        this.preview_hint = v4l;
        this.business_image_map = C63685Oz3.LJI("business_image_map", map7);
        this.business_video_map = C63685Oz3.LJI("business_video_map", map8);
        this.business_user_map = C63685Oz3.LJI("business_user_map", map9);
        this.extra_content = c64537PUn;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
