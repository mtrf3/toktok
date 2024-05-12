package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RM8 extends Message<RM8, RM9> {
    public static final ProtoAdapter<RM8> ADAPTER = new RM7();
    public String extra;
    public String id;
    public Integer provider;
    public String rtmp_pull_url;
    public String rtmp_push_url;
    public Long sid;

    public RM8() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RM8, RM9> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RM8, RM9> newBuilder2() {
        newBuilder2();
        return null;
    }
}
