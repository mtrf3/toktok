package X;

import com.squareup.wire.Message;

/* renamed from: X.V3l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79121V3l extends Message.Builder<V4Y, C79121V3l> {
    public Long LIZLLL;
    public String LJ;
    public C79135V3z LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final V4Y build() {
        return new V4Y(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
