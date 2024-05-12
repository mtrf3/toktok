package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.OzN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63705OzN extends Message.Builder<SendMessageResponseBody, C63705OzN> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;
    public String LJI;
    public Long LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJ;
    public String LJIIJJI;
    public ConversationInfoV2 LJIIL;
    public C4YY LJIILIIL;
    public EnumC1045048g LJIILJJIL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendMessageResponseBody build() {
        return new SendMessageResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
    }
}
