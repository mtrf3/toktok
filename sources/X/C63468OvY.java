package X;

import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.OvY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63468OvY extends Message.Builder<DeleteMessageRequestBody, C63468OvY> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteMessageRequestBody build() {
        return new DeleteMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
