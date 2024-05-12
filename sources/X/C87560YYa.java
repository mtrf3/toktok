package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.YYa, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87560YYa extends Message.Builder<ConversationCoreInfo, C87560YYa> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Integer LJIIJ;
    public String LJIIJJI;
    public java.util.Map<String, String> LJIIL = new LinkedHashMap();
    public Long LJIILIIL;
    public String LJIILJJIL;
    public EnumC63751P0h LJIILL;
    public Boolean LJIILLIIL;
    public Integer LJIIZILJ;
    public Integer LJIJ;
    public Long LJIJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationCoreInfo build() {
        return new ConversationCoreInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, buildUnknownFields());
    }
}
