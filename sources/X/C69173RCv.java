package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RCv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69173RCv extends Message<C69173RCv, RKF> {
    public static final ProtoAdapter<C69173RCv> ADAPTER = new C69171RCt();
    public String album;
    public C69214REk audio_track;
    public String author;
    public Boolean author_deleted;
    public C69214REk cover_thumb;
    public Integer duration;
    public Integer end_time;
    public Long id;
    public String id_str;
    public Boolean is_author_artist;
    public Boolean is_del_video;
    public Boolean is_original;
    public Boolean is_video_self_see;
    public String mid;
    public String offline_desc;
    public String owner_handle;
    public String owner_id;
    public String owner_nickname;
    public C69214REk play_url;
    public Integer start_time;
    public Integer status;
    public C69214REk strong_beat_url;
    public String title;
    public List<String> unshelve_countries;

    public C69173RCv() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.unshelve_countries = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69173RCv, RKF> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69173RCv, RKF> newBuilder2() {
        newBuilder2();
        return null;
    }
}
