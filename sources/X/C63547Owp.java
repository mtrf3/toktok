package X;

import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.squareup.wire.Message;

/* renamed from: X.Owp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63547Owp extends Message.Builder<ReferencedMessageInfo, C63547Owp> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ReferencedMessageInfo build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new ReferencedMessageInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "referenced_message_id", this.LJ, "hint");
        throw null;
    }
}
