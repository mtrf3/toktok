package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69278RGw extends Message<C69278RGw, RJ8> {
    public static final ProtoAdapter<C69278RGw> ADAPTER = new C69222REs();
    public Float bottom;
    public Float left;
    public Float right;
    public Float top;
    public String version;

    public C69278RGw() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69278RGw, RJ8> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69278RGw, RJ8> newBuilder2() {
        newBuilder2();
        return null;
    }
}
