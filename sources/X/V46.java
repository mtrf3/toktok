package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;

/* loaded from: classes14.dex */
public final class V46 extends Message<V46, C79114V3e> {
    public static final ProtoAdapter<V46> ADAPTER = new V4P();
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.DynamicInfo#ADAPTER", tag = 1)
    public final V44 dynamic_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = 10)
    public final V4Q fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public final V4L preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 201)
    public final RU2 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 202)
    public final RUB resp_base;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V44 v44 = this.dynamic_info;
            int i6 = 0;
            if (v44 != null) {
                i = v44.hashCode();
            } else {
                i = 0;
            }
            int i7 = (hashCode + i) * 37;
            V4Q v4q = this.fallback_info;
            if (v4q != null) {
                i2 = v4q.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 37;
            V4L v4l = this.preview_hint;
            if (v4l != null) {
                i3 = v4l.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 37;
            RU2 ru2 = this.req_base;
            if (ru2 != null) {
                i4 = ru2.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 37;
            RUB rub = this.resp_base;
            if (rub != null) {
                i6 = rub.hashCode();
            }
            int i11 = i10 + i6;
            this.hashCode = i11;
            return i11;
        }
        return i5;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<V46, C79114V3e> newBuilder2() {
        C79114V3e c79114V3e = new C79114V3e();
        c79114V3e.LIZLLL = this.dynamic_info;
        c79114V3e.LJ = this.fallback_info;
        c79114V3e.LJFF = this.preview_hint;
        c79114V3e.LJI = this.req_base;
        c79114V3e.LJII = this.resp_base;
        c79114V3e.addUnknownFields(unknownFields());
        return c79114V3e;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.dynamic_info != null) {
            sb.append(", dynamic_info=");
            sb.append(this.dynamic_info);
        }
        if (this.fallback_info != null) {
            sb.append(", fallback_info=");
            sb.append(this.fallback_info);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        return DIX.LIZLLL(sb, 0, 2, "DynamicCard{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V46)) {
            return false;
        }
        V46 v46 = (V46) obj;
        if (unknownFields().equals(v46.unknownFields()) && C63685Oz3.LJ(this.dynamic_info, v46.dynamic_info) && C63685Oz3.LJ(this.fallback_info, v46.fallback_info) && C63685Oz3.LJ(this.preview_hint, v46.preview_hint) && C63685Oz3.LJ(this.req_base, v46.req_base) && C63685Oz3.LJ(this.resp_base, v46.resp_base)) {
            return true;
        }
        return false;
    }

    public V46(V44 v44, V4Q v4q, V4L v4l, RU2 ru2, RUB rub) {
        this(v44, v4q, v4l, ru2, rub, C64537PUn.EMPTY);
    }

    public V46(V44 v44, V4Q v4q, V4L v4l, RU2 ru2, RUB rub, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.dynamic_info = v44;
        this.fallback_info = v4q;
        this.preview_hint = v4l;
        this.req_base = ru2;
        this.resp_base = rub;
    }
}
