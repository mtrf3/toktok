package com.bytedance.im.core.proto;

import X.C63659Oyd;
import X.C63660Oye;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.EnumC63665Oyj;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ClientMetric extends Message<ClientMetric, C63659Oyd> {
    public static final ProtoAdapter<ClientMetric> ADAPTER = new C63660Oye();
    public static final EnumC63665Oyj DEFAULT_METRIC_TYPE = EnumC63665Oyj.COUNTER;
    public static final Long DEFAULT_V = 0L;
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("k")
    public final String k;

    @InterfaceC65349Pkn("metric_type")
    public final EnumC63665Oyj metric_type;

    @InterfaceC65349Pkn("tags")
    public final Map<String, String> tags;

    @InterfaceC65349Pkn("v")
    public final Long v;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ClientMetric, C63659Oyd> newBuilder2() {
        C63659Oyd c63659Oyd = new C63659Oyd();
        c63659Oyd.LIZLLL = this.metric_type;
        c63659Oyd.LJ = this.k;
        c63659Oyd.LJFF = this.v;
        c63659Oyd.LJI = C63685Oz3.LIZLLL("tags", this.tags);
        c63659Oyd.addUnknownFields(unknownFields());
        return c63659Oyd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.metric_type != null) {
            sb.append(", metric_type=");
            sb.append(this.metric_type);
        }
        if (this.k != null) {
            sb.append(", k=");
            sb.append(this.k);
        }
        if (this.v != null) {
            sb.append(", v=");
            sb.append(this.v);
        }
        Map<String, String> map = this.tags;
        if (map != null && !map.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        return DIX.LIZLLL(sb, 0, 2, "ClientMetric{", '}');
    }

    public ClientMetric(EnumC63665Oyj enumC63665Oyj, String str, Long l, Map<String, String> map) {
        this(enumC63665Oyj, str, l, map, C64537PUn.EMPTY);
    }

    public ClientMetric(EnumC63665Oyj enumC63665Oyj, String str, Long l, Map<String, String> map, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.metric_type = enumC63665Oyj;
        this.k = str;
        this.v = l;
        this.tags = C63685Oz3.LJI("tags", map);
    }
}
