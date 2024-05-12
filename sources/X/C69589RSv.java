package X;

import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.Message;

/* renamed from: X.RSv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69589RSv extends Message.Builder<SecUidPair, C69589RSv> {
    public Long LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SecUidPair build() {
        return new SecUidPair(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
