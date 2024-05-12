package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.OzP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63707OzP extends Message.Builder<ConversationSettingInfo, C63707OzP> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public Integer LJIIJ;
    public java.util.Map<String, String> LJIIJJI = new LinkedHashMap();
    public Long LJIIL;
    public Integer LJIILIIL;
    public Long LJIILJJIL;
    public Long LJIILL;
    public Long LJIILLIIL;
    public Long LJIIZILJ;
    public Integer LJIJ;
    public Integer LJIJI;
    public EnumC96103pu LJIJJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationSettingInfo build() {
        return new ConversationSettingInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, buildUnknownFields());
    }
}
