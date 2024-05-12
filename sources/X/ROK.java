package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class ROK extends Message<ROK, ROL> {
    public static final ProtoAdapter<ROK> ADAPTER = new ROJ();
    public String aweme_id;
    public Boolean is_delete;
    public Boolean is_private;
    public Boolean is_prohibited;

    public ROK() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<ROK, ROL> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<ROK, ROL> newBuilder2() {
        newBuilder2();
        return null;
    }
}
