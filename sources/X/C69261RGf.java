package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69261RGf extends Message<C69261RGf, C69320RIm> {
    public static final ProtoAdapter<C69261RGf> ADAPTER = new C69209REf();
    public Integer digg_count;
    public Integer music_count;
    public REV music_cover_url;
    public REV music_qrcode_url;
    public Integer music_used_count;

    public C69261RGf() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69261RGf, C69320RIm> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69261RGf, C69320RIm> newBuilder2() {
        newBuilder2();
        return null;
    }
}
