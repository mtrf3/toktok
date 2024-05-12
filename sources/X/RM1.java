package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RM1 extends Message<RM1, RM2> {
    public static final ProtoAdapter<RM1> ADAPTER = new RM0();
    public List<C69411RLz> links;
    public String text;

    public RM1() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.links = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RM1, RM2> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RM1, RM2> newBuilder2() {
        newBuilder2();
        return null;
    }
}
