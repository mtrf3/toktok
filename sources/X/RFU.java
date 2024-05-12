package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RFU extends Message<RFU, RI2> {
    public static final ProtoAdapter<RFU> ADAPTER = new RE1();
    public REV button_bg;
    public String button_desc;
    public String description;
    public List<REV> icons;
    public String schema;
    public String schema_desc;
    public String title;

    public RFU() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.icons = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFU, RI2> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFU, RI2> newBuilder2() {
        newBuilder2();
        return null;
    }
}
