package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.YYi, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87568YYi extends Message.Builder<SetConversationSettingInfoResponseBody, C87568YYi> {
    public ConversationSettingInfo LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationSettingInfoResponseBody build() {
        return new SetConversationSettingInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
