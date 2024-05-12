package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGF extends Message<RGF, RJF> {
    public static final ProtoAdapter<RGF> ADAPTER = new C69198RDu();
    public String button_text;
    public String entrance;
    public C69284RHc link;
    public Integer product_status;
    public Boolean subscribed;
    public String subtitle;
    public String title;

    public RGF() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGF, RJF> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGF, RJF> newBuilder2() {
        newBuilder2();
        return null;
    }
}
