package X;

import com.squareup.wire.Message;

/* loaded from: classes12.dex */
public final class Q3O extends Message.Builder<C66507Q8h, Q3O> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C66507Q8h build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C66507Q8h(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "key", this.LJ, "value");
        throw null;
    }
}
