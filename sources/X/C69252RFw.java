package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RFw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69252RFw extends Message<C69252RFw, RJV> {
    public static final ProtoAdapter<C69252RFw> ADAPTER = new C69203RDz();
    public String id;
    public List<C69241RFl> options;
    public String subtitle;
    public String title;
    public Integer type;

    public C69252RFw() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.options = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69252RFw, RJV> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69252RFw, RJV> newBuilder2() {
        newBuilder2();
        return null;
    }
}
