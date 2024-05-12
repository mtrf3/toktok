package X;

import com.bytedance.im.core.proto.AckConversationApplyRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.4o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120464o6 extends Message.Builder<AckConversationApplyRequestBody, C120464o6> {
    public Long LIZLLL;
    public EnumC115774gX LJ;
    public java.util.Map<String, String> LJFF = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckConversationApplyRequestBody build() {
        return new AckConversationApplyRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
