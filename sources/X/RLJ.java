package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RLJ extends Message<RLJ, RLK> {
    public static final ProtoAdapter<RLJ> ADAPTER = new RLI();
    public String auth;
    public List<String> hosts;
    public String token;
    public String tv_token;
    public String vid;

    public RLJ() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.hosts = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RLJ, RLK> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RLJ, RLK> newBuilder2() {
        newBuilder2();
        return null;
    }
}