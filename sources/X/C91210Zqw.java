package X;

import android.os.SystemClock;
import android.util.Pair;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* renamed from: X.Zqw, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91210Zqw {
    public static final AtomicLong LIZIZ = new AtomicLong();
    public final EnumC91322Zsk LIZ;

    public C91210Zqw(EnumC91322Zsk scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
    }

    public static C91395Ztv LIZ(InterfaceC91296ZsK interfaceC91296ZsK, C91453Zur c91453Zur) {
        MusicOwnerInfo musicOwnerInfo;
        List<MusicOwnerInfo> musicOwnerInfos;
        if (interfaceC91296ZsK == null) {
            C91406Zu6 c91406Zu6 = new C91406Zu6(String.valueOf(SystemClock.elapsedRealtimeNanos()));
            long andIncrement = LIZIZ.getAndIncrement();
            DspUpsellRessoStruct dspUpsellRessoStruct = new DspUpsellRessoStruct();
            dspUpsellRessoStruct.setAppLink(YBK.LIZ().links.getAppLink());
            dspUpsellRessoStruct.setDeepLink(YBK.LIZ().links.getDeepLink());
            dspUpsellRessoStruct.setDownloadLink(YBK.LIZ().links.getDownloadLink());
            YBK.LIZ.getClass();
            dspUpsellRessoStruct.setStoreLink((TTMStoreLink) YBK.LIZLLL.getValue());
            return new C91395Ztv(c91406Zu6, andIncrement, dspUpsellRessoStruct, new C91301ZsP(), String.valueOf(SystemClock.elapsedRealtimeNanos()), false, new Pair(0, 0), new UrlModel(), "", "", "", null, "", "", new Aweme(), new Pair(0, 0), null, 0, c91453Zur, true);
        }
        long andIncrement2 = LIZIZ.getAndIncrement();
        DspUpsellRessoStruct LJII = interfaceC91296ZsK.LJII();
        C91301ZsP eventData = interfaceC91296ZsK.getEventData();
        String id = interfaceC91296ZsK.getId();
        boolean LJIILIIL = interfaceC91296ZsK.LJIILIIL();
        Pair<Integer, Integer> LJIILLIIL = interfaceC91296ZsK.LJIILLIIL();
        UrlModel avatarThumb = interfaceC91296ZsK.getAvatarThumb();
        String coverMainColor = interfaceC91296ZsK.LJIIIIZZ().getDspMusic().getCoverMainColor();
        String coverUrl = interfaceC91296ZsK.getCoverUrl();
        String LJIIL = interfaceC91296ZsK.LJIIL();
        Music music = interfaceC91296ZsK.LJIIIIZZ().getDspMusic().getMusic();
        String songName = interfaceC91296ZsK.getSongName();
        String artistName = interfaceC91296ZsK.getArtistName();
        Aweme aweme = interfaceC91296ZsK.LJIIIIZZ().getAweme();
        Pair<Integer, Integer> LJ = interfaceC91296ZsK.LJ();
        Music music2 = interfaceC91296ZsK.LJIIIIZZ().getDspMusic().getMusic();
        if (music2 != null && (musicOwnerInfos = music2.getMusicOwnerInfos()) != null) {
            musicOwnerInfo = (MusicOwnerInfo) ORZ.LJLLLL(musicOwnerInfos);
        } else {
            musicOwnerInfo = null;
        }
        return new C91395Ztv(interfaceC91296ZsK, andIncrement2, LJII, eventData, id, LJIILIIL, LJIILLIIL, avatarThumb, coverMainColor, coverUrl, LJIIL, music, songName, artistName, aweme, LJ, musicOwnerInfo, interfaceC91296ZsK.LJIILL(), c91453Zur, false);
    }
}
