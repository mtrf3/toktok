package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RPI extends Message<RPI, RPJ> {
    public static final ProtoAdapter<RPI> ADAPTER = new RPH();
    public List<RCZ> awemes;
    public Integer has_more;
    public RPF log_pb;
    public Integer status_code;
    public String status_msg;

    public RPI() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.awemes = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RPI, RPJ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RPI, RPJ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
