package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.squareup.wire.Message;

/* renamed from: X.OzR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63709OzR extends Message.Builder<ConversationCheckInfoV2, C63709OzR> {
    public Long LIZLLL;
    public String LJ;
    public EnumC63506OwA LJFF;
    public Boolean LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationCheckInfoV2 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJFF != null) {
            return new ConversationCheckInfoV2(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "conv_short_id", this.LJFF, "conv_type");
        throw null;
    }
}
