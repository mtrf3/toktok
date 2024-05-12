package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RNd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69441RNd extends Message<C69441RNd, C69442RNe> {
    public static final ProtoAdapter<C69441RNd> ADAPTER = new C69440RNc();
    public String developer_token;
    public String user_token;

    public C69441RNd() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69441RNd, C69442RNe> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69441RNd, C69442RNe> newBuilder2() {
        newBuilder2();
        return null;
    }
}
