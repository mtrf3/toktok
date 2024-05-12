package X;

import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes17.dex */
public final class YYY extends Message.Builder<ConversationAddParticipantsResponseBody, YYY> {
    public Integer LJFF;
    public String LJI;
    public Long LJII;
    public String LJIIIIZZ;
    public List<Long> LIZLLL = C63685Oz3.LJIIIIZZ();
    public List<Long> LJ = C63685Oz3.LJIIIIZZ();
    public List<SecUidPair> LJIIIZ = C63685Oz3.LJIIIIZZ();
    public List<SecUidPair> LJIIJ = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJIIJJI = new LinkedHashMap();
    public java.util.Map<String, String> LJIIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationAddParticipantsResponseBody build() {
        return new ConversationAddParticipantsResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
