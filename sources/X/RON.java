package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RON extends Message<RON, ROO> {
    public static final ProtoAdapter<RON> ADAPTER = new ROM();
    public Float horizontal;
    public List<Float> vertical;

    public RON() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.vertical = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RON, ROO> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RON, ROO> newBuilder2() {
        newBuilder2();
        return null;
    }
}
