package X;

import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class P1A extends Message.Builder<ConversationApplyInfo, P1A> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public EnumC115774gX LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public String LJIIJJI;
    public Long LJIIL;
    public String LJIILIIL;
    public java.util.Map<String, String> LJIILJJIL = new LinkedHashMap();
    public String LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationApplyInfo build() {
        return new ConversationApplyInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
    }
}
