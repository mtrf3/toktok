package X;

import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RUX extends Message.Builder<RUV, RUX> {
    public RUF LIZLLL;
    public List<RUF> LJ = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RUV build() {
        return new RUV(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
