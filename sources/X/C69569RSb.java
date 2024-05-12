package X;

import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.squareup.wire.Message;

/* renamed from: X.RSb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69569RSb extends Message.Builder<ConversationCheckInfo, C69569RSb> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationCheckInfo build() {
        return new ConversationCheckInfo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
