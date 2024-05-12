package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.ROl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69475ROl extends Message<C69475ROl, C69476ROm> {
    public static final ProtoAdapter<C69475ROl> ADAPTER = new C69474ROk();
    public Integer compeleted_task_cnt;
    public Integer total_task_cnt;

    public C69475ROl() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69475ROl, C69476ROm> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69475ROl, C69476ROm> newBuilder2() {
        newBuilder2();
        return null;
    }
}
