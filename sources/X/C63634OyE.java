package X;

import com.bytedance.im.core.proto.AckMessage;
import com.squareup.wire.Message;

/* renamed from: X.OyE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63634OyE extends Message.Builder<AckMessage, C63634OyE> {
    public String LIZLLL;
    public Boolean LJ;
    public EnumC63179Oqt LJFF;
    public String LJI;
    public Integer LJII;
    public EnumC63506OwA LJIIIIZZ;
    public EnumC63642OyM LJIIIZ;
    public Boolean LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckMessage build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new AckMessage(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C63685Oz3.LJII(str, "server_msg_id", this.LJ, "is_ws", this.LJFF, "msg_type", this.LJI, WM7.SCENE_SERVICE);
        throw null;
    }
}
