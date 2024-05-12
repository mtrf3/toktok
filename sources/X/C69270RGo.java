package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69270RGo extends Message<C69270RGo, C69347RJn> {
    public static final ProtoAdapter<C69270RGo> ADAPTER = new REU();
    public String artist_name;
    public REV cover_medium;
    public Long duration;
    public String id;
    public String name;

    public C69270RGo() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69270RGo, C69347RJn> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69270RGo, C69347RJn> newBuilder2() {
        newBuilder2();
        return null;
    }
}
