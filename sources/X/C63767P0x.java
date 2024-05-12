package X;

import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.TokenInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.P0x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63767P0x extends Message.Builder<Request, C63767P0x> {
    public Integer LIZLLL;
    public Long LJ;
    public String LJFF;
    public String LJI;
    public P10 LJII;
    public Integer LJIIIIZZ;
    public String LJIIIZ;
    public RequestBody LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public java.util.Map<String, String> LJIIZILJ = new LinkedHashMap();
    public Integer LJIJ;
    public TokenInfo LJIJI;
    public EnumC63768P0y LJIJJ;
    public MsgTrace LJIJJLI;
    public Integer LJIL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Request build() {
        return new Request(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, buildUnknownFields());
    }
}
