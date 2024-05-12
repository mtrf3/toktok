package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public final class RUD extends Message.Builder<RUB, RUD> {
    public RU9 LIZLLL;
    public Long LJFF;
    public List<String> LJ = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RUB build() {
        return new RUB(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
