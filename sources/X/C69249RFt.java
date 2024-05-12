package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RFt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69249RFt extends Message<C69249RFt, RIN> {
    public static final ProtoAdapter<C69249RFt> ADAPTER = new C69195RDr();
    public String extra_info;
    public String hint_text;
    public REV icon_url;
    public String qrec_virtual_enable;
    public String scene;
    public List<RHU> words;

    public C69249RFt() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.words = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69249RFt, RIN> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69249RFt, RIN> newBuilder2() {
        newBuilder2();
        return null;
    }
}
