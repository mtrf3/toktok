package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RKy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69384RKy extends Message<C69384RKy, C69385RKz> {
    public static final ProtoAdapter<C69384RKy> ADAPTER = new C69383RKx();
    public String auth;
    public List<String> hosts;
    public String token;
    public String tv_token;
    public String vid;

    public C69384RKy() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.hosts = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69384RKy, C69385RKz> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69384RKy, C69385RKz> newBuilder2() {
        newBuilder2();
        return null;
    }
}
