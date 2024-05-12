package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69268RGm extends Message<C69268RGm, RJ3> {
    public static final ProtoAdapter<C69268RGm> ADAPTER = new RET();
    public String aweme_id;
    public REV cover;
    public REV dynamic_cover;
    public Long media_type;

    public C69268RGm() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69268RGm, RJ3> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69268RGm, RJ3> newBuilder2() {
        newBuilder2();
        return null;
    }
}
