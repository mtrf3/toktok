package X;

import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63486Ovq extends Message.Builder<MessagesPerUserInitV2RequestBody, C63486Ovq> {
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserInitV2RequestBody build() {
        return new MessagesPerUserInitV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
