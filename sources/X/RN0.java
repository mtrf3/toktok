package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RN0 extends Message<RN0, RN1> {
    public static final ProtoAdapter<RN0> ADAPTER = new C69437RMz();
    public Integer is_visible;
    public Integer share_story_post_type;

    public RN0() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RN0, RN1> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RN0, RN1> newBuilder2() {
        newBuilder2();
        return null;
    }
}
