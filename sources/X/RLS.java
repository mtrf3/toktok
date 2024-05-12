package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RLS extends Message<RLS, RLT> {
    public static final ProtoAdapter<RLS> ADAPTER = new RLR();
    public String enter_text;
    public String process_text;
    public String trans_bg_text;

    public RLS() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLS, RLT> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLS, RLT> newBuilder2() {
        newBuilder2();
        return null;
    }
}
