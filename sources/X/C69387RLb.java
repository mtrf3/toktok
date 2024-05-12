package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RLb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69387RLb extends Message<C69387RLb, C69388RLc> {
    public static final ProtoAdapter<C69387RLb> ADAPTER = new C69386RLa();
    public String content;
    public String related_tag;
    public String tag_name;

    public C69387RLb() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69387RLb, C69388RLc> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69387RLb, C69388RLc> newBuilder2() {
        newBuilder2();
        return null;
    }
}
