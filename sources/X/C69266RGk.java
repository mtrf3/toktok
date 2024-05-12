package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69266RGk extends Message<C69266RGk, RKE> {
    public static final ProtoAdapter<C69266RGk> ADAPTER = new C69226REw();
    public Integer long_video_type;
    public Double trailer_start_time;
    public C69174RCw video;

    public C69266RGk() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69266RGk, RKE> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69266RGk, RKE> newBuilder2() {
        newBuilder2();
        return null;
    }
}
