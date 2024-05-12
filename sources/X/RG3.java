package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RG3 extends Message<RG3, C69345RJl> {
    public static final ProtoAdapter<RG3> ADAPTER = new RDV();
    public RGC audio;
    public Integer long_video_type;
    public Double trailer_start_time;
    public C69159RCh video;
    public C69235RFf video_control;

    public RG3() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG3, C69345RJl> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG3, C69345RJl> newBuilder2() {
        newBuilder2();
        return null;
    }
}
