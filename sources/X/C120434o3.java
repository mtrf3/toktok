package X;

import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120434o3 extends Message.Builder<ConversationRemoveParticipantsRequestBody, C120434o3> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public List<Long> LJI = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRemoveParticipantsRequestBody build() {
        return new ConversationRemoveParticipantsRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
