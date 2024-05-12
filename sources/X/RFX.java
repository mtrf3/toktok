package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFX extends Message<RFX, C69331RIx> {
    public static final ProtoAdapter<RFX> ADAPTER = new RE5();
    public String biz_type;
    public String body;
    public String button_text;
    public List<RHO> rec_reasons;
    public String sub_body;
    public String title;
    public String url;
    public String url_text;

    public RFX() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.rec_reasons = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFX, C69331RIx> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFX, C69331RIx> newBuilder2() {
        newBuilder2();
        return null;
    }
}
