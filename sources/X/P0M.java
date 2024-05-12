package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class P0M extends Message.Builder<StrangerConversation, P0M> {
    public Long LIZLLL;
    public Integer LJ;
    public MessageBody LJFF;
    public String LJI;
    public Integer LJIIIIZZ;
    public List<Participant> LJII = C63685Oz3.LJIIIIZZ();
    public java.util.Map<String, String> LJIIIZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final StrangerConversation build() {
        return new StrangerConversation(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
