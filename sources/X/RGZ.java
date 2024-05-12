package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGZ extends Message<RGZ, C69359RJz> {
    public static final ProtoAdapter<RGZ> ADAPTER = new REK();
    public REV icon_url;
    public String link;
    public String open_url;
    public String sticker_id;
    public Integer sticker_type;
    public String title;

    public RGZ() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGZ, C69359RJz> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGZ, C69359RJz> newBuilder2() {
        newBuilder2();
        return null;
    }
}
