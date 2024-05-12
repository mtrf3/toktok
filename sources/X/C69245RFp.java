package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69245RFp extends Message<C69245RFp, RII> {
    public static final ProtoAdapter<C69245RFp> ADAPTER = new C69191RDn();
    public String challenge_id;
    public String group_id;
    public Integer label;
    public Integer pattern_type;
    public Integer rank;
    public String search_word;
    public String sentence;
    public Long value;
    public Integer vb_rank;
    public Long vb_rank_value;

    public C69245RFp() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69245RFp, RII> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69245RFp, RII> newBuilder2() {
        newBuilder2();
        return null;
    }
}
