package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGI extends Message<RGI, RI0> {
    public static final ProtoAdapter<RGI> ADAPTER = new REH();
    public REV button_icon_url;
    public String display;
    public String event_keyword;
    public Long event_keyword_id;
    public String event_tracking_param;
    public REV icon_url;
    public String schema;

    public RGI() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGI, RI0> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGI, RI0> newBuilder2() {
        newBuilder2();
        return null;
    }
}
