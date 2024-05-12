package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69275RGt extends Message<C69275RGt, RIK> {
    public static final ProtoAdapter<C69275RGt> ADAPTER = new RF6();
    public Long collect_vv;
    public Long current_episode;
    public Long has_updated_episode;
    public Long play_vv;
    public Long updated_to_episode;

    public C69275RGt() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69275RGt, RIK> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69275RGt, RIK> newBuilder2() {
        newBuilder2();
        return null;
    }
}
