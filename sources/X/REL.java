package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class REL extends Message<REL, RK3> {
    public static final ProtoAdapter<REL> ADAPTER = new RD7();
    public Long bandwidth;
    public Long bitrate;
    public String codec_type;
    public String definition;
    public String encoded_type;
    public String file_hash;
    public String file_id;
    public String format;
    public Long fps;
    public Long height;
    public String logo_type;
    public String media_type;
    public String quality;
    public String quality_desc;
    public Long size;
    public String sub_info;
    public C69393RLh url_list;
    public Long width;

    public REL() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REL, RK3> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REL, RK3> newBuilder2() {
        newBuilder2();
        return null;
    }
}
