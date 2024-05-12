package X;

import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.OvF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63449OvF extends Message.Builder<ClientACKRequestBody, C63449OvF> {
    public Long LIZLLL;
    public Integer LJ;
    public EnumC48299IxT LJFF;
    public String LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public EnumC63359Otn LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ClientACKRequestBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJIIIZ != null) {
            return new ClientACKRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "start_time_stamp", this.LJ, "cmd", this.LJIIIZ, "type");
        throw null;
    }
}
