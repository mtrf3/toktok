package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFT extends Message<RFT, C69357RJx> {
    public static final ProtoAdapter<RFT> ADAPTER = new C69184RDg();
    public List<RH7> options;
    public String question;
    public Long ref_id;
    public Integer ref_type;
    public Long select_option_id;
    public Long vote_id;

    public RFT() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.options = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFT, C69357RJx> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFT, C69357RJx> newBuilder2() {
        newBuilder2();
        return null;
    }
}
