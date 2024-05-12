package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RHc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69284RHc extends Message<C69284RHc, RJS> {
    public static final ProtoAdapter<C69284RHc> ADAPTER = new C69285RHd();
    public String app_link;
    public String deep_link;
    public String download_link;
    public RNR store_link;

    public C69284RHc() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69284RHc, RJS> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69284RHc, RJS> newBuilder2() {
        newBuilder2();
        return null;
    }
}
