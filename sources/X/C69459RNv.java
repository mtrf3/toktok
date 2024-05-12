package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RNv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69459RNv extends Message<C69459RNv, C69460RNw> {
    public static final ProtoAdapter<C69459RNv> ADAPTER = new C69458RNu();
    public Integer user_now_status;

    public C69459RNv() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69459RNv, C69460RNw> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69459RNv, C69460RNw> newBuilder2() {
        newBuilder2();
        return null;
    }
}
