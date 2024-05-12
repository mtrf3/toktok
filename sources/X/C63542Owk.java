package X;

import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Owk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63542Owk extends Message.Builder<SendMessageRequestBody, C63542Owk> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public Integer LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public Boolean LJIIL;
    public ReferencedMessageInfo LJIILIIL;
    public C64537PUn LJIILL;
    public String LJIILLIIL;
    public java.util.Map<String, String> LJII = new LinkedHashMap();
    public List<Long> LJIIJJI = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJIILJJIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendMessageRequestBody build() {
        return new SendMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, buildUnknownFields());
    }
}
