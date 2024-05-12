package X;

import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.OyX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63653OyX extends Message.Builder<Response, C63653OyX> {
    public Integer LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public Integer LJII;
    public ResponseBody LJIIIIZZ;
    public String LJIIIZ;
    public java.util.Map<String, String> LJIIJ = new LinkedHashMap();
    public Long LJIIJJI;
    public Long LJIIL;
    public Long LJIILIIL;
    public Integer LJIILJJIL;
    public Long LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Response build() {
        return new Response(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
    }
}
