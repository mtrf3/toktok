package X;

import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.squareup.wire.Message;

/* renamed from: X.P0e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63748P0e extends Message.Builder<MarkConversationReadNotify, C63748P0e> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkConversationReadNotify build() {
        return new MarkConversationReadNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
