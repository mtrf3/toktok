package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;

/* renamed from: X.OzW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63714OzW extends Message<C63714OzW, C63713OzV> {
    public static final ProtoAdapter<C63714OzW> ADAPTER = new C63712OzU();
    public static final EnumC62835OlL DEFAULT_ACTION_TYPE = EnumC62835OlL.DeepLink;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkType#ADAPTER", tag = 2)
    public final EnumC62835OlL action_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> url_list;

    public int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 == 0) {
            int LIZ = C77339UWx.LIZ(this.url_list, unknownFields().hashCode() * 37, 37);
            EnumC62835OlL enumC62835OlL = this.action_type;
            int i3 = 0;
            if (enumC62835OlL != null) {
                i = enumC62835OlL.hashCode();
            } else {
                i = 0;
            }
            int i4 = (LIZ + i) * 37;
            String str = this.name;
            if (str != null) {
                i3 = str.hashCode();
            }
            int i5 = i4 + i3;
            this.hashCode = i5;
            return i5;
        }
        return i2;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C63714OzW, C63713OzV> newBuilder2() {
        C63713OzV c63713OzV = new C63713OzV();
        c63713OzV.LIZLLL = C63685Oz3.LIZJ("url_list", this.url_list);
        c63713OzV.LJ = this.action_type;
        c63713OzV.LJFF = this.name;
        c63713OzV.addUnknownFields(unknownFields());
        return c63713OzV;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        return DIX.LIZLLL(sb, 0, 2, "LinkInfo{", '}');
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C63714OzW)) {
            return false;
        }
        C63714OzW c63714OzW = (C63714OzW) obj;
        if (unknownFields().equals(c63714OzW.unknownFields()) && this.url_list.equals(c63714OzW.url_list) && C63685Oz3.LJ(this.action_type, c63714OzW.action_type) && C63685Oz3.LJ(this.name, c63714OzW.name)) {
            return true;
        }
        return false;
    }

    public C63714OzW(List<String> list, EnumC62835OlL enumC62835OlL, String str) {
        this(list, enumC62835OlL, str, C64537PUn.EMPTY);
    }

    public C63714OzW(List<String> list, EnumC62835OlL enumC62835OlL, String str, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.url_list = C63685Oz3.LJFF("url_list", list);
        this.action_type = enumC62835OlL;
        this.name = str;
    }
}
