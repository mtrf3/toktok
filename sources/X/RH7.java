package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH7 extends Message<RH7, C69351RJr> {
    public static final ProtoAdapter<RH7> ADAPTER = new C69225REv();
    public String option;
    public Long option_id;
    public String option_text;
    public Long vote_count;

    public RH7() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH7, C69351RJr> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH7, C69351RJr> newBuilder2() {
        newBuilder2();
        return null;
    }
}
