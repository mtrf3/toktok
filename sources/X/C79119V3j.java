package X;

import com.squareup.wire.Message;

/* renamed from: X.V3j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79119V3j extends Message.Builder<V4U, C79119V3j> {
    public Long LIZLLL;
    public Long LJ;
    public C79135V3z LJFF;
    public C79135V3z LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final V4U build() {
        return new V4U(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
