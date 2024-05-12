package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGV extends Message<RGV, C69292RHk> {
    public static final ProtoAdapter<RGV> ADAPTER = new REF();
    public Long commerce_sticker_id;
    public REV icon_url;
    public String letters;
    public String open_url;
    public String web_url;
    public String web_url_title;

    public RGV() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGV, C69292RHk> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGV, C69292RHk> newBuilder2() {
        newBuilder2();
        return null;
    }
}
