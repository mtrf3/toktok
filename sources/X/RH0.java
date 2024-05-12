package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH0 extends Message<RH0, C69352RJs> {
    public static final ProtoAdapter<RH0> ADAPTER = new C69211REh();
    public String audio_extra;
    public REL audio_meta;
    public Long audio_quality;

    public RH0() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH0, C69352RJs> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH0, C69352RJs> newBuilder2() {
        newBuilder2();
        return null;
    }
}
