package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* loaded from: classes13.dex */
public final class RUB extends Message<RUB, RUD> {
    public static final ProtoAdapter<RUB> ADAPTER = new RUC();
    public static final Long DEFAULT_MIN_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> context_menu;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final java.util.Map<String, String> extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long min_version;

    @WireField(adapter = "com.bytedance.im.message.template.proto.TTL#ADAPTER", tag = 1)
    public final RU9 ttl;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            RU9 ru9 = this.ttl;
            int i3 = 0;
            if (ru9 != null) {
                i = ru9.hashCode();
            } else {
                i = 0;
            }
            int LIZ = C77339UWx.LIZ(this.context_menu, (hashCode + i) * 37, 37);
            Long l = this.min_version;
            if (l != null) {
                i3 = l.hashCode();
            }
            int hashCode2 = ((LIZ + i3) * 37) + this.extra.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RUB, RUD> newBuilder2() {
        RUD rud = new RUD();
        rud.LIZLLL = this.ttl;
        rud.LJ = C63685Oz3.LIZJ("context_menu", this.context_menu);
        rud.LJFF = this.min_version;
        rud.LJI = C63685Oz3.LIZLLL("extra", this.extra);
        rud.addUnknownFields(unknownFields());
        return rud;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ttl != null) {
            sb.append(", ttl=");
            sb.append(this.ttl);
        }
        if (!this.context_menu.isEmpty()) {
            sb.append(", context_menu=");
            sb.append(this.context_menu);
        }
        if (this.min_version != null) {
            sb.append(", min_version=");
            sb.append(this.min_version);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        return DIX.LIZLLL(sb, 0, 2, "BaseResp{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RUB)) {
            return false;
        }
        RUB rub = (RUB) obj;
        if (unknownFields().equals(rub.unknownFields()) && C63685Oz3.LJ(this.ttl, rub.ttl) && this.context_menu.equals(rub.context_menu) && C63685Oz3.LJ(this.min_version, rub.min_version) && this.extra.equals(rub.extra)) {
            return true;
        }
        return false;
    }

    public RUB(RU9 ru9, List<String> list, Long l, java.util.Map<String, String> map) {
        this(ru9, list, l, map, C64537PUn.EMPTY);
    }

    public RUB(RU9 ru9, List<String> list, Long l, java.util.Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.ttl = ru9;
        this.context_menu = C63685Oz3.LJFF("context_menu", list);
        this.min_version = l;
        this.extra = C63685Oz3.LJI("extra", map);
    }
}
