package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH5 extends Message<RH5, RJJ> {
    public static final ProtoAdapter<RH5> ADAPTER = new RFD();
    public String friend_type_str;
    public String rec_type;
    public Long recommend_type;
    public String relation_text_key;

    public RH5() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH5, RJJ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH5, RJJ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
