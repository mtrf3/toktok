package X;

import com.bytedance.im.core.proto.GetRecentMessageReqBody;
import com.squareup.wire.Message;

/* renamed from: X.OvW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63466OvW extends Message.Builder<GetRecentMessageReqBody, C63466OvW> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetRecentMessageReqBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new GetRecentMessageReqBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "conversation_version", this.LJ, "source");
        throw null;
    }
}
