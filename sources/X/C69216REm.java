package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.REm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69216REm extends Message<C69216REm, RIJ> {
    public static final ProtoAdapter<C69216REm> ADAPTER = new RD6();
    public String caption_format;
    public Long cla_subtitle_id;
    public Long complaint_id;
    public Long expire;
    public Boolean is_auto_generated;
    public Boolean is_original_caption;
    public String lang;
    public String language_code;
    public Long language_id;
    public Integer sub_id;
    public String sub_version;
    public Long translator_id;
    public String url;

    public C69216REm() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69216REm, RIJ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69216REm, RIJ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
