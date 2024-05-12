package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RMf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69417RMf extends Message<C69417RMf, C69418RMg> {
    public static final ProtoAdapter<C69417RMf> ADAPTER = new C69416RMe();
    public Boolean is_mute;
    public String mute_desc;

    public C69417RMf() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69417RMf, C69418RMg> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69417RMf, C69418RMg> newBuilder2() {
        newBuilder2();
        return null;
    }
}
