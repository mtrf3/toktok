package X;

import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.squareup.wire.Message;

/* loaded from: classes13.dex */
public final class RTG extends Message.Builder<MuteBadgeCountInfo, RTG> {
    public EnumC69903Rc3 LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MuteBadgeCountInfo build() {
        EnumC69903Rc3 enumC69903Rc3 = this.LIZLLL;
        if (enumC69903Rc3 != null && this.LJ != null) {
            return new MuteBadgeCountInfo(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C63685Oz3.LJII(enumC69903Rc3, "message_type", this.LJ, "badge_count");
        throw null;
    }
}
