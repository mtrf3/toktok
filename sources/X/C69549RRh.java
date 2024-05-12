package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.RRh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69549RRh extends Message.Builder<BatchUpdateConversationParticipantRequestBody, C69549RRh> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJII;
    public List<Long> LJI = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJIIIIZZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    public final BatchUpdateConversationParticipantRequestBody build() {
        return new BatchUpdateConversationParticipantRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
