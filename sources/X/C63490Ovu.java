package X;

import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63490Ovu extends Message.Builder<DeleteStrangerMessageRequestBody, C63490Ovu> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteStrangerMessageRequestBody build() {
        return new DeleteStrangerMessageRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
