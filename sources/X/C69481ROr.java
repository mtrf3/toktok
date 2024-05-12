package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.ROr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69481ROr extends Message<C69481ROr, C69482ROs> {
    public static final ProtoAdapter<C69481ROr> ADAPTER = new C69480ROq();
    public String original_comment_id;
    public String original_item_id;

    public C69481ROr() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69481ROr, C69482ROs> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69481ROr, C69482ROs> newBuilder2() {
        newBuilder2();
        return null;
    }
}
