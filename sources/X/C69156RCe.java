package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RCe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69156RCe extends Message<C69156RCe, RJC> {
    public static final ProtoAdapter<C69156RCe> ADAPTER = new C69155RCd();
    public String album;
    public List<REY> artists;
    public REV audio_track;
    public String author;
    public Boolean author_deleted;
    public List<RHN> author_position;
    public REV avatar_large;
    public REV avatar_medium;
    public REV avatar_thumb;
    public Integer billboard_rank;
    public Long binded_challenge_id;
    public C69160RCi bodydance_challenge;
    public REV bodydance_challenge_id;
    public REV bodydance_url;
    public C69484ROu category_cover_info;
    public C69160RCi challenge;
    public Integer collect_stat;
    public REV cover_hd;
    public REV cover_large;
    public REV cover_medium;
    public REV cover_thumb;
    public Integer duration;
    public RH3 duration_high_precision;
    public REV effects_data;
    public Integer end_time;
    public List<RHJ> external_song_info;
    public String extra;
    public Long id;
    public String id_str;
    public Boolean is_author_artist;
    public Boolean is_commerce_music;
    public Boolean is_del_video;
    public Boolean is_only_owner_use;
    public Boolean is_original;
    public Boolean is_pgc;
    public Boolean is_restricted;
    public Boolean is_shooting_allow;
    public Boolean is_video_not_recommend;
    public Boolean is_video_self_see;
    public String log_extra;
    public Integer lyric_type;
    public String lyric_url;
    public C69273RGr matched_pgc_sound;
    public RFG matched_song;
    public String mid;
    public Integer music_billboard_type;
    public RP0 music_billboard_weekly_info;
    public RMH music_release_info;
    public Boolean mute_share;
    public String offline_desc;
    public String owner_handle;
    public String owner_id;
    public String owner_nickname;
    public REV play_url;
    public List<RHN> position;
    public Boolean prevent_download;
    public Integer prevent_item_download_status;
    public Double preview_end_time;
    public Double preview_start_time;
    public Long recommend_status;
    public Boolean redirect;
    public String schema_url;
    public String sec_uid;
    public C69199RDv share_info;
    public Integer source_platform;
    public Integer start_time;
    public Integer status;
    public REV strong_beat_url;
    public String title;
    public List<RGU> tt_to_dsp_song_infos;
    public C69349RJp ttm_music_info;
    public List<String> unshelve_countries;
    public String use_count_desc;
    public Integer user_count;

    public C69156RCe() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.position = C63685Oz3.LJIIIIZZ();
        this.author_position = C63685Oz3.LJIIIIZZ();
        this.unshelve_countries = C63685Oz3.LJIIIIZZ();
        this.external_song_info = C63685Oz3.LJIIIIZZ();
        this.artists = C63685Oz3.LJIIIIZZ();
        this.tt_to_dsp_song_infos = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69156RCe, RJC> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69156RCe, RJC> newBuilder2() {
        newBuilder2();
        return null;
    }
}
