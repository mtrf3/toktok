package X;

import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.squareup.wire.Message;

/* renamed from: X.Ovh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63477Ovh extends Message.Builder<GetMessageByIdRequestBody, C63477Ovh> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageByIdRequestBody build() {
        return new GetMessageByIdRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
