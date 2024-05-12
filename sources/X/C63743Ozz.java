package X;

import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.Message;

/* renamed from: X.Ozz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63743Ozz extends Message.Builder<MessageCheckInfoV2, C63743Ozz> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageCheckInfoV2 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new MessageCheckInfoV2(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "msg_id", this.LJ, "index_in_conv");
        throw null;
    }
}
