package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69263RGh extends Message<C69263RGh, C69333RIz> {
    public static final ProtoAdapter<C69263RGh> ADAPTER = new C69221REr();
    public Integer appear_time;
    public Integer continuous_show_count;
    public Integer interval_days;
    public Integer scenario;
    public Integer show_count_per_interval;
    public Integer silence_days;

    public C69263RGh() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69263RGh, C69333RIz> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69263RGh, C69333RIz> newBuilder2() {
        newBuilder2();
        return null;
    }
}
