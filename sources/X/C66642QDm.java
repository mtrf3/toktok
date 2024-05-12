package X;

import com.squareup.wire.Message;

/* renamed from: X.QDm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66642QDm extends Message.Builder<C66640QDk, C66642QDm> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C66640QDk build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C66640QDk(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "key", this.LJ, "value");
        throw null;
    }
}
