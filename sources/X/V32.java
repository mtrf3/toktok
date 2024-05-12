package X;

import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes14.dex */
public final class V32 extends Message.Builder<C79135V3z, V32> {
    public String LIZLLL;
    public List<String> LJ = C63685Oz3.LJIIIIZZ();
    public String LJFF;
    public C79143V4h LJI;
    public String LJII;
    public EnumC79091V2h LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C79135V3z build() {
        return new C79135V3z(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
