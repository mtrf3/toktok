package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RLz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69411RLz extends Message<C69411RLz, RM3> {
    public static final ProtoAdapter<C69411RLz> ADAPTER = new C69410RLy();
    public String place_holder;
    public String text;
    public String url;

    public C69411RLz() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69411RLz, RM3> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69411RLz, RM3> newBuilder2() {
        newBuilder2();
        return null;
    }
}
