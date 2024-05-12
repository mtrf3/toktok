package X;

import com.bytedance.im.core.proto.ClientMetric;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.Oyd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63659Oyd extends Message.Builder<ClientMetric, C63659Oyd> {
    public EnumC63665Oyj LIZLLL;
    public String LJ;
    public Long LJFF;
    public java.util.Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ClientMetric build() {
        return new ClientMetric(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
