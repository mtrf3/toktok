package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RPz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69515RPz extends Message<C69515RPz, RQ0> {
    public static final ProtoAdapter<C69515RPz> ADAPTER = new C69514RPy();
    public List<RCZ> awemes;
    public Integer has_more;
    public Integer status_code;
    public String status_msg;

    public C69515RPz() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.awemes = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69515RPz, RQ0> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69515RPz, RQ0> newBuilder2() {
        newBuilder2();
        return null;
    }
}
