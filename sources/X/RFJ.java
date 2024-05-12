package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RFJ extends Message<RFJ, RIE> {
    public static final ProtoAdapter<RFJ> ADAPTER = new RDT();
    public String app_id;
    public String app_name;
    public RL7 card;
    public String description;
    public String icon;
    public Integer orientation;
    public String schema;
    public Integer state;
    public String summary;
    public String title;
    public Integer type;
    public String web_url;

    public RFJ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RFJ, RIE> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RFJ, RIE> newBuilder2() {
        newBuilder2();
        return null;
    }
}
