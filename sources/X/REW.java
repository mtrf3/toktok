package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class REW extends Message<REW, RIH> {
    public static final ProtoAdapter<REW> ADAPTER = new RDP();
    public List<Long> add_yours_invitees;
    public Long from_item_id;
    public Boolean from_question;
    public Long shark_status;
    public String text;
    public Long topic_id;
    public List<RHA> user_avatars;
    public Long videos_count;
    public Boolean viewer_is_invited;

    public REW() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.user_avatars = C63685Oz3.LJIIIIZZ();
        this.add_yours_invitees = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REW, RIH> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REW, RIH> newBuilder2() {
        newBuilder2();
        return null;
    }
}
