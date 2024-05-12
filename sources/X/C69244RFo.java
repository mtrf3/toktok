package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RFo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69244RFo extends Message<C69244RFo, C69303RHv> {
    public static final ProtoAdapter<C69244RFo> ADAPTER = new C69178RDa();
    public Integer comment;
    public Double comment_median_time;
    public Double comment_pro;
    public Double comment_thres;
    public Integer model_v2;
    public String predict_config;
    public Integer profile;
    public Double profile_median_time;
    public Double profile_pro;
    public Double profile_thres;

    public C69244RFo() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69244RFo, C69303RHv> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69244RFo, C69303RHv> newBuilder2() {
        newBuilder2();
        return null;
    }
}
