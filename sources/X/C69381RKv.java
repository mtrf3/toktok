package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RKv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69381RKv extends Message<C69381RKv, C69382RKw> {
    public static final ProtoAdapter<C69381RKv> ADAPTER = new C69380RKu();
    public Long expired_at;
    public Integer now_creation_type;
    public Integer now_post_camera_type;

    public C69381RKv() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69381RKv, C69382RKw> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69381RKv, C69382RKw> newBuilder2() {
        newBuilder2();
        return null;
    }
}
