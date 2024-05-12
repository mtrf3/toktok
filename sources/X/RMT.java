package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RMT extends Message<RMT, RMU> {
    public static final ProtoAdapter<RMT> ADAPTER = new RMS();
    public String notify_msg;
    public List<String> platforms;

    public RMT() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.platforms = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMT, RMU> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMT, RMU> newBuilder2() {
        newBuilder2();
        return null;
    }
}
