package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGY extends Message<RGY, C69353RJt> {
    public static final ProtoAdapter<RGY> ADAPTER = new RE9();
    public String author_name;
    public String effect_id;
    public Long end_time;
    public String resource_id;
    public Long start_time;
    public Integer type;

    public RGY() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGY, C69353RJt> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGY, C69353RJt> newBuilder2() {
        newBuilder2();
        return null;
    }
}
