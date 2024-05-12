package X;

import com.bytedance.im.core.proto.AckMessageRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.OyF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63635OyF extends Message.Builder<AckMessageRequestBody, C63635OyF> {
    public Long LIZLLL;
    public String LJ;
    public EnumC63506OwA LJFF;
    public EnumC63179Oqt LJI;
    public EnumC63641OyL LJII;
    public EnumC63625Oy5 LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckMessageRequestBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new AckMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "start_timestamp", this.LJ, "id");
        throw null;
    }
}
