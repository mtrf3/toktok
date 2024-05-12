package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RKX extends Message<RKX, RKY> {
    public static final ProtoAdapter<RKX> ADAPTER = new RKW();
    public Integer breathe_times;
    public String search_word;
    public Integer type;
    public String word;

    public RKX() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RKX, RKY> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RKX, RKY> newBuilder2() {
        newBuilder2();
        return null;
    }
}
