package X;

import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0U extends Message.Builder<SendMessageP2PRequestBody, P0U> {
    public EnumC63735Ozr LIZLLL;
    public String LJ;
    public Integer LJFF;
    public Long LJI;
    public Integer LJIIIZ;
    public String LJIIJ;
    public String LJIIL;
    public List<Long> LJII = C63685Oz3.LJIIIIZZ();
    public List<Long> LJIIIIZZ = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJIIJJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendMessageP2PRequestBody build() {
        return new SendMessageP2PRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
