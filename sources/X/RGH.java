package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGH extends Message<RGH, C69304RHw> {
    public static final ProtoAdapter<RGH> ADAPTER = new REG();
    public REV button_icon_url;
    public String display;
    public String event_keyword;
    public Long event_keyword_id;
    public String event_tracking_param;
    public REV icon_url;
    public String schema;

    public RGH() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGH, C69304RHw> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGH, C69304RHw> newBuilder2() {
        newBuilder2();
        return null;
    }
}
