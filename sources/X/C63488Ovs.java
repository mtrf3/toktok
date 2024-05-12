package X;

import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63488Ovs extends Message.Builder<MessagesPerUserRequestBody, C63488Ovs> {
    public Long LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserRequestBody build() {
        return new MessagesPerUserRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
