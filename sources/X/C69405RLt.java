package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RLt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69405RLt extends Message<C69405RLt, C69406RLu> {
    public static final ProtoAdapter<C69405RLt> ADAPTER = new C69404RLs();
    public String language;
    public String uri;
    public REV url;

    public C69405RLt() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69405RLt, C69406RLu> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69405RLt, C69406RLu> newBuilder2() {
        newBuilder2();
        return null;
    }
}
