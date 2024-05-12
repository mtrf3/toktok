package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* renamed from: X.4o5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120454o5 extends Message.Builder<BatchGetConversationParticipantsReadIndexRequestBody, C120454o5> {
    public List<String> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<Long> LJ = C63685Oz3.LJIIIIZZ();
    public String LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetConversationParticipantsReadIndexRequestBody build() {
        return new BatchGetConversationParticipantsReadIndexRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
