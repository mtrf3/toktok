package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGT extends Message<RGT, RI3> {
    public static final ProtoAdapter<RGT> ADAPTER = new RE2();
    public Long end_time;
    public Integer feed_show_time;
    public String live_info;
    public Long start_time;
    public Boolean topview_valid;

    public RGT() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGT, RI3> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGT, RI3> newBuilder2() {
        newBuilder2();
        return null;
    }
}
