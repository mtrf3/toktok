package X;

import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;

/* renamed from: X.4o1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120414o1 extends Message.Builder<UpdateConversationParticipantRequestBody, C120414o1> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Integer LJII;
    public String LJIIIIZZ;
    public Boolean LJIIIZ;
    public java.util.Map<String, String> LJIIJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantRequestBody build() {
        return new UpdateConversationParticipantRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
