package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztv, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91395Ztv implements C8RL {
    public final InterfaceC91296ZsK LJLIL;
    public final long LJLILLLLZI;
    public final DspUpsellRessoStruct LJLJI;
    public final C91301ZsP LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final Pair<Integer, Integer> LJLJL;
    public final UrlModel LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final Music LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public final Aweme LJLLLL;
    public final Pair<Integer, Integer> LJLLLLLL;
    public final MusicOwnerInfo LJLZ;
    public Integer LJZ;
    public final C91453Zur LJZI;
    public final boolean LJZL;

    public C91395Ztv(InterfaceC91296ZsK playable, long j, DspUpsellRessoStruct upsellResso, C91301ZsP eventData, String id, boolean z, Pair<Integer, Integer> musicDspStartAndEndTime, UrlModel avatarThumb, String str, String coverUrl, String trackId, Music music, String songName, String artistName, Aweme aweme, Pair<Integer, Integer> musicLyricStartAndEndTime, MusicOwnerInfo musicOwnerInfo, Integer num, C91453Zur refreshParams, boolean z2) {
        o.LJIIIZ(playable, "playable");
        o.LJIIIZ(upsellResso, "upsellResso");
        o.LJIIIZ(eventData, "eventData");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(musicDspStartAndEndTime, "musicDspStartAndEndTime");
        o.LJIIIZ(avatarThumb, "avatarThumb");
        o.LJIIIZ(coverUrl, "coverUrl");
        o.LJIIIZ(trackId, "trackId");
        o.LJIIIZ(songName, "songName");
        o.LJIIIZ(artistName, "artistName");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(musicLyricStartAndEndTime, "musicLyricStartAndEndTime");
        o.LJIIIZ(refreshParams, "refreshParams");
        this.LJLIL = playable;
        this.LJLILLLLZI = j;
        this.LJLJI = upsellResso;
        this.LJLJJI = eventData;
        this.LJLJJL = id;
        this.LJLJJLL = z;
        this.LJLJL = musicDspStartAndEndTime;
        this.LJLJLJ = avatarThumb;
        this.LJLJLLL = str;
        this.LJLL = coverUrl;
        this.LJLLI = trackId;
        this.LJLLILLLL = music;
        this.LJLLJ = songName;
        this.LJLLL = artistName;
        this.LJLLLL = aweme;
        this.LJLLLLLL = musicLyricStartAndEndTime;
        this.LJLZ = musicOwnerInfo;
        this.LJZ = num;
        this.LJZI = refreshParams;
        this.LJZL = z2;
    }
}
