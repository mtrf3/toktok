package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGX extends Message<RGX, RIM> {
    public static final ProtoAdapter<RGX> ADAPTER = new RE7();
    public String content;
    public Long id;
    public Long item_id;
    public REV user_avatar;
    public Long user_id;
    public String username;

    public RGX() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGX, RIM> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGX, RIM> newBuilder2() {
        newBuilder2();
        return null;
    }
}
