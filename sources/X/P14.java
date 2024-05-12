package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.Message;

/* loaded from: classes11.dex */
public final class P14 extends Message.Builder<NewMessageNotify, P14> {
    public String LIZLLL;
    public Integer LJ;
    public P15 LJFF;
    public MessageBody LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public Long LJIIL;
    public Long LJIILIIL;
    public Integer LJIILJJIL;
    public MsgTrace LJIILL;
    public ReferenceInfo LJIILLIIL;
    public Long LJIIZILJ;
    public Long LJIJ;
    public Long LJIJI;
    public MuteBadgeCountInfo LJIJJ;
    public String LJIJJLI;
    public Integer LJIL;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final NewMessageNotify build() {
        return new NewMessageNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, buildUnknownFields());
    }
}
