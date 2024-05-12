package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RDU extends Message<RDU, RJZ> {
    public static final ProtoAdapter<RDU> ADAPTER = new RD3();
    public Boolean audio_is_audible;
    public Boolean audio_is_listenable;
    public Boolean audio_is_podcast;
    public String background_color;
    public Integer follow_display;
    public Boolean is_podcast_preview;
    public List<String> podcast_episode_authors;
    public REV podcast_episode_cover_image;
    public Long podcast_episode_duration_milliseconds;
    public Long podcast_episode_id;
    public Boolean podcast_episode_is_branded_content;
    public REV podcast_episode_play_addr;
    public String podcast_episode_title;
    public String podcast_feed_title;

    public RDU() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.podcast_episode_authors = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RDU, RJZ> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RDU, RJZ> newBuilder2() {
        newBuilder2();
        return null;
    }
}
