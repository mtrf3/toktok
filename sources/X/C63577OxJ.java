package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.Message;

/* renamed from: X.OxJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63577OxJ extends Message.Builder<ReferenceInfo, C63577OxJ> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public EnumC109604Rw LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ReferenceInfo build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new ReferenceInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C63685Oz3.LJII(l, "referenced_message_id", this.LJ, "hint", this.LJFF, "ref_message_type", this.LJI, "referenced_message_status");
        throw null;
    }
}
