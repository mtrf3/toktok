package X;

import com.squareup.wire.Message;

/* renamed from: X.QVp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67113QVp extends Message.Builder<C67103QVf, C67113QVp> {
    public Integer LIZLLL;
    public EnumC68499QuV LJ;
    public String LJFF;
    public C64537PUn LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C67103QVf build() {
        Integer num = this.LIZLLL;
        if (num != null) {
            return new C67103QVf(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C63685Oz3.LJII(num, "business");
        throw null;
    }
}
