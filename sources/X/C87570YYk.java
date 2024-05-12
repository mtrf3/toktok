package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody;
import com.squareup.wire.Message;

/* renamed from: X.YYk, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87570YYk extends Message.Builder<UpsertConversationSettingExtInfoResponseBody, C87570YYk> {
    public ConversationSettingInfo LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpsertConversationSettingExtInfoResponseBody build() {
        return new UpsertConversationSettingExtInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
