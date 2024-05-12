package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RFl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69241RFl extends Message<C69241RFl, RIY> {
    public static final ProtoAdapter<C69241RFl> ADAPTER = new C69196RDs();
    public String additional_content;
    public String extra;
    public Integer id;
    public String name;
    public List<C69252RFw> questions;
    public Integer type;

    public C69241RFl() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.questions = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69241RFl, RIY> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69241RFl, RIY> newBuilder2() {
        newBuilder2();
        return null;
    }
}
