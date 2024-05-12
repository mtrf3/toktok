package X;

import com.squareup.wire.Message;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import java.util.LinkedHashMap;

/* loaded from: classes16.dex */
public final class YNX extends Message.Builder<SdkUplinkPacket, YNX> {
    public Long LIZLLL = 0L;
    public Long LJ = 0L;
    public String LJII = "";
    public C64537PUn LJIIIIZZ = C64537PUn.EMPTY;
    public Integer LJIIIZ = 0;
    public String LJIIJ = "";
    public Integer LJIIJJI = 0;
    public java.util.Map<String, String> LJFF = new LinkedHashMap();
    public java.util.Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SdkUplinkPacket build() {
        return new SdkUplinkPacket(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
