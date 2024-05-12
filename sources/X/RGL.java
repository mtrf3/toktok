package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGL extends Message<RGL, RJP> {
    public static final ProtoAdapter<RGL> ADAPTER = new RE8();
    public Long end_time;
    public Boolean is_subscribed;
    public Long subscribe_count;
    public String text_already_ended;
    public String text_already_subscribed;
    public String text_to_be_subscribed;
    public String title;

    public RGL() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGL, RJP> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGL, RJP> newBuilder2() {
        newBuilder2();
        return null;
    }
}
