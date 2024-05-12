package X;

import com.bytedance.im.core.proto.GetCmdMessageReqBody;
import com.squareup.wire.Message;

/* renamed from: X.OvU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63464OvU extends Message.Builder<GetCmdMessageReqBody, C63464OvU> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetCmdMessageReqBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new GetCmdMessageReqBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "cmd_index", this.LJ, "source");
        throw null;
    }
}
