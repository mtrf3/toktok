package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RH1 extends Message<RH1, C69290RHi> {
    public static final ProtoAdapter<RH1> ADAPTER = new C69218REo();
    public Integer begin;
    public Integer end;
    public String link;
    public String query;

    public RH1() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RH1, C69290RHi> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RH1, C69290RHi> newBuilder2() {
        newBuilder2();
        return null;
    }
}
