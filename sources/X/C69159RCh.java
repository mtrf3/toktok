package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RCh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69159RCh extends Message<C69159RCh, RJL> {
    public static final ProtoAdapter<C69159RCh> ADAPTER = new C69158RCg();
    public Double CoverTsp;
    public List<RED> big_thumbs;
    public List<C69230RFa> bit_rate;
    public List<RH0> bit_rate_audio;
    public REV caption_download_addr;
    public Long cdn_url_expired;
    public C69181RDd cla_info;
    public REV cover;
    public Boolean cover_is_custom;
    public REV download_addr;
    public REV download_suffix_logo_addr;
    public Integer duration;
    public REV dynamic_cover;
    public C69262RGg fake_landscape_video_info;
    public String format;
    public Boolean has_download_suffix_logo_addr;
    public Boolean has_watermark;
    public Integer height;
    public Integer is_bytevc1;
    public Integer is_long_video;
    public String meta;
    public String misc_download_addrs;
    public Boolean need_set_token;
    public REV new_download_addr;
    public REV origin_cover;
    public C69278RGw pillar_box_video_info;
    public REV play_addr;
    public REV play_addr_265;
    public REV play_addr_bytevc1;
    public REV play_addr_h264;
    public REV play_addr_lowbr;
    public String ratio;
    public Integer source_HDR_type;
    public C69384RKy token_auth;
    public REV ui_alike_download_addr;
    public String video_model;
    public Integer width;

    public C69159RCh() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.bit_rate = C63685Oz3.LJIIIIZZ();
        this.big_thumbs = C63685Oz3.LJIIIIZZ();
        this.bit_rate_audio = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69159RCh, RJL> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69159RCh, RJL> newBuilder2() {
        newBuilder2();
        return null;
    }
}
