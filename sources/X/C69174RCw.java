package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RCw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69174RCw extends Message<C69174RCw, RKI> {
    public static final ProtoAdapter<C69174RCw> ADAPTER = new C69168RCq();
    public List<C69246RFq> big_thumbs;
    public List<RGN> bit_rate;
    public Long cdn_url_expired;
    public C69214REk cover;
    public Integer duration;
    public C69214REk dynamic_cover;
    public Integer height;
    public Integer is_bytevc1;
    public Integer is_h265;
    public Integer is_long_video;
    public Boolean need_set_token;
    public C69214REk origin_cover;
    public C69214REk play_addr;
    public C69214REk play_addr_265;
    public C69214REk play_addr_bytevc1;
    public C69214REk play_addr_h264;
    public C69214REk play_addr_lowbr;
    public String ratio;
    public RLJ token_auth;
    public String video_model;
    public Integer width;

    public C69174RCw() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.bit_rate = C63685Oz3.LJIIIIZZ();
        this.big_thumbs = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69174RCw, RKI> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69174RCw, RKI> newBuilder2() {
        newBuilder2();
        return null;
    }
}
