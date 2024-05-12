package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.OxL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63579OxL extends Message.Builder<MessageBody, C63579OxL> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;
    public Long LJIIL;
    public Long LJIILIIL;
    public Integer LJIILJJIL;
    public Long LJIILL;
    public String LJIILLIIL;
    public Long LJIJI;
    public ReferenceInfo LJIJJ;
    public Long LJIJJLI;
    public C64537PUn LJIL;
    public String LJJ;
    public EnumC96123pw LJJI;
    public java.util.Map<String, String> LJIIJJI = new LinkedHashMap();
    public java.util.Map<String, PropertyItemList> LJIIZILJ = new LinkedHashMap();
    public java.util.Map<String, String> LJIJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageBody build() {
        return new MessageBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, buildUnknownFields());
    }
}
