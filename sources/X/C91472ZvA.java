package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAvatar;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicPerformer;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvA, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91472ZvA implements InterfaceC91296ZsK {
    public final DspStruct LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final DspStruct LJFF;
    public final C91301ZsP LJI;
    public final String LJII;
    public final UrlModel LJIIIIZZ;
    public int LJIIIZ;
    public final String LJIIJ;

    @Override // X.InterfaceC91296ZsK
    public final void LIZJ(C91465Zv3 c91465Zv3) {
    }

    @Override // X.InterfaceC91296ZsK
    public final boolean LIZLLL() {
        if (this.LIZ.getMediaType() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC91296ZsK
    public final Pair<Integer, Integer> LJ() {
        return this.LIZ.getMusicDspLyricStartAndEndTime();
    }

    @Override // X.InterfaceC91296ZsK
    public final String LJFF() {
        String str;
        String str2;
        UrlModel coverLarge;
        List<String> urlList;
        String str3;
        UrlModel coverMedium;
        List<String> urlList2;
        UrlModel coverThumb;
        List<String> urlList3;
        Music music = this.LIZ.getDspMusic().getMusic();
        String str4 = "";
        if (music == null || (coverThumb = music.getCoverThumb()) == null || (urlList3 = coverThumb.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList3)) == null) {
            str = "";
        }
        Music music2 = this.LIZ.getDspMusic().getMusic();
        if (music2 == null || (coverMedium = music2.getCoverMedium()) == null || (urlList2 = coverMedium.getUrlList()) == null || (str2 = (String) ORZ.LJLLLL(urlList2)) == null) {
            str2 = "";
        }
        Music music3 = this.LIZ.getDspMusic().getMusic();
        if (music3 != null && (coverLarge = music3.getCoverLarge()) != null && (urlList = coverLarge.getUrlList()) != null && (str3 = (String) ORZ.LJLLLL(urlList)) != null) {
            str4 = str3;
        }
        if (str4.length() > 0) {
            return str4;
        }
        if (str2.length() <= 0) {
            return str;
        }
        return str2;
    }

    @Override // X.InterfaceC91296ZsK
    public final DspUpsellRessoStruct LJII() {
        return this.LIZ.getDspExtra().getUpsellResso();
    }

    @Override // X.InterfaceC91296ZsK
    public final String LJIIL() {
        return C91226ZrC.LIZ(this.LIZ.getDspMusic());
    }

    @Override // X.InterfaceC91296ZsK
    public final boolean LJIILIIL() {
        return this.LIZ.getDspMusic().getChorusOnly();
    }

    @Override // X.InterfaceC91296ZsK
    public final String LJIILJJIL() {
        UrlModel playUrl;
        List<String> urlList;
        String str;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            Music music = this.LIZ.getDspMusic().getMusic();
            if (music == null || (playUrl = music.getPlayUrl()) == null || (urlList = playUrl.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null) {
                return "";
            }
            return str;
        }
        return str2;
    }

    @Override // X.InterfaceC91296ZsK
    public final Integer LJIILL() {
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        Music music = this.LIZ.getDspMusic().getMusic();
        if (music != null && (musicOwnerInfos = music.getMusicOwnerInfos()) != null && (musicOwnerInfo = (MusicOwnerInfo) ORZ.LJLLLL(musicOwnerInfos)) != null) {
            return musicOwnerInfo.getFollowStatus();
        }
        return null;
    }

    @Override // X.InterfaceC91296ZsK
    public final Pair<Integer, Integer> LJIILLIIL() {
        return this.LIZ.getMusicDspStartAndEndTime();
    }

    @Override // X.InterfaceC91296ZsK
    public final String getArtistName() {
        String fullClipAuthor;
        MatchedSoundInfo matchedSongInfo;
        List<MusicPerformer> performers;
        MusicPerformer musicPerformer;
        String name;
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        String nickName;
        Music music = this.LIZ.getDspMusic().getMusic();
        if (music == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) ORZ.LJLLLL(musicOwnerInfos)) == null || (nickName = musicOwnerInfo.getNickName()) == null) {
            Music music2 = this.LIZ.getDspMusic().getMusic();
            if (music2 == null || (matchedSongInfo = music2.getMatchedSongInfo()) == null || (performers = matchedSongInfo.getPerformers()) == null || (musicPerformer = (MusicPerformer) ORZ.LJLLLL(performers)) == null || (name = musicPerformer.getName()) == null) {
                com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo = this.LIZ.getDspMusic().getMusicDspInfo();
                if (musicDspInfo == null || (fullClipAuthor = musicDspInfo.getFullClipAuthor()) == null) {
                    return "";
                }
                return fullClipAuthor;
            }
            return name;
        }
        return nickName;
    }

    @Override // X.InterfaceC91296ZsK
    public final UrlModel getAvatarThumb() {
        MatchedSoundInfo matchedSongInfo;
        List<MusicPerformer> performers;
        MusicPerformer musicPerformer;
        MusicAvatar avatar;
        UrlModel thumb;
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        UrlModel avatar2;
        DspMusicStruct dspMusic = this.LIZ.getDspMusic();
        Music music = dspMusic.getMusic();
        if (music == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) ORZ.LJLLLL(musicOwnerInfos)) == null || (avatar2 = musicOwnerInfo.getAvatar()) == null) {
            Music music2 = dspMusic.getMusic();
            if (music2 == null || (matchedSongInfo = music2.getMatchedSongInfo()) == null || (performers = matchedSongInfo.getPerformers()) == null || (musicPerformer = (MusicPerformer) ORZ.LJLLLL(performers)) == null || (avatar = musicPerformer.getAvatar()) == null || (thumb = avatar.getThumb()) == null) {
                return new UrlModel();
            }
            return thumb;
        }
        return avatar2;
    }

    @Override // X.InterfaceC91296ZsK
    public final int getDuration() {
        Music music;
        Float valueOf;
        MusicHighPrecisionDuration durationHighPrecision;
        Music music2 = this.LIZ.getDspMusic().getMusic();
        if ((music2 != null && (durationHighPrecision = music2.getDurationHighPrecision()) != null && (valueOf = durationHighPrecision.getDurationPrecision()) != null) || ((music = this.LIZ.getDspMusic().getMusic()) != null && (valueOf = Float.valueOf(music.getDuration())) != null)) {
            return (int) (valueOf.floatValue() * 1000);
        }
        return 0;
    }

    @Override // X.InterfaceC91296ZsK
    public final int getMediaType() {
        return this.LIZ.getMediaType();
    }

    @Override // X.InterfaceC91296ZsK
    public final String getSongName() {
        String fullClipTitle;
        com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo = this.LIZ.getDspMusic().getMusicDspInfo();
        if (musicDspInfo == null || (fullClipTitle = musicDspInfo.getFullClipTitle()) == null) {
            return "";
        }
        return fullClipTitle;
    }

    @Override // X.InterfaceC91296ZsK
    public final int w4() {
        com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo = this.LIZ.getDspMusic().getMusicDspInfo();
        if (musicDspInfo != null) {
            return musicDspInfo.getCollectStatus();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r2 = -1;
     */
    @Override // X.InterfaceC91296ZsK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC91298ZsM LIZ() {
        /*
            r10 = this;
            boolean r0 = r10.LIZLLL()
            if (r0 == 0) goto L16
            X.Zv7 r1 = new X.Zv7
            com.ss.android.ugc.aweme.dsp.common.model.DspStruct r0 = r10.LIZ
            com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct r0 = r0.getDspMusic()
            com.ss.android.ugc.aweme.dsp.common.model.MusicPlayInfo r0 = r0.getPlayInfo()
            r1.<init>(r0)
            return r1
        L16:
            com.ss.android.ugc.aweme.dsp.common.model.DspStruct r0 = r10.LIZ
            com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct r0 = r0.getDspMusic()
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            r1 = 0
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getPlayUrl()
            if (r0 == 0) goto L53
            java.util.List r9 = r0.getUrlList()
        L2d:
            java.lang.String r6 = ""
            if (r9 == 0) goto L39
            java.lang.Object r8 = X.ORZ.LJLLLL(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L3a
        L39:
            r8 = r6
        L3a:
            r10.LIZIZ = r8
            r5 = 0
            if (r9 == 0) goto L51
            int r0 = r9.size()
        L43:
            r4 = 1
            r3 = 60
            if (r0 <= r4) goto Le5
            com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig r0 = X.YBK.LIZ()
            boolean r0 = r0.enableRetryPlay
            if (r0 == 0) goto Le5
            goto L55
        L51:
            r0 = 0
            goto L43
        L53:
            r9 = r1
            goto L2d
        L55:
            java.lang.String r0 = "\\/([a-fA-F0-9]+)(\\/video)"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Exception -> Lac
            java.util.regex.Matcher r2 = r0.matcher(r8)     // Catch: java.lang.Exception -> Lac
            boolean r0 = r2.find()     // Catch: java.lang.Exception -> Lac
            java.lang.String r7 = "matcher.group()"
            if (r0 == 0) goto L84
            java.lang.String r2 = r2.group()     // Catch: java.lang.Exception -> Lac
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r7)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "/video"
            java.lang.String r2 = ujb.o.LJJJJZ(r2, r0, r6, r5)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "/"
            java.lang.String r2 = ujb.o.LJJJJZ(r2, r0, r6, r5)     // Catch: java.lang.Exception -> Lac
            r0 = 16
            X.C17N.LJIIJ(r0)     // Catch: java.lang.Exception -> Lac
            int r2 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r2, r0)     // Catch: java.lang.Exception -> Lac
            goto Lad
        L84:
            java.lang.String r0 = "(VExpiration=)(.*?)&"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Exception -> Lac
            java.util.regex.Matcher r2 = r0.matcher(r8)     // Catch: java.lang.Exception -> Lac
            boolean r0 = r2.find()     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto Lac
            java.lang.String r2 = r2.group()     // Catch: java.lang.Exception -> Lac
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r7)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "VExpiration="
            java.lang.String r2 = ujb.o.LJJJJZ(r2, r0, r6, r5)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "&"
            java.lang.String r0 = ujb.o.LJJJJZ(r2, r0, r6, r5)     // Catch: java.lang.Exception -> Lac
            int r2 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> Lac
            goto Lad
        Lac:
            r2 = -1
        Lad:
            int r0 = X.C1E4.LJIIZILJ()
            if (r4 > r2) goto Ld3
            if (r2 >= r0) goto Ld3
            if (r9 == 0) goto Ld1
            java.lang.Object r0 = X.ORZ.LLFII(r9)
            java.lang.String r0 = (java.lang.String) r0
        Lbd:
            r10.LIZIZ = r0
            X.Zv6 r2 = new X.Zv6
            if (r9 == 0) goto Lc9
            java.lang.Object r1 = X.ORZ.LLFII(r9)
            java.lang.String r1 = (java.lang.String) r1
        Lc9:
            java.lang.String r0 = X.C91149Zpx.LIZ(r10)
            r2.<init>(r1, r0, r3)
            goto Lee
        Ld1:
            r0 = r1
            goto Lbd
        Ld3:
            X.Zv6 r2 = new X.Zv6
            if (r9 == 0) goto Ldd
            java.lang.Object r1 = X.ORZ.LJLLLL(r9)
            java.lang.String r1 = (java.lang.String) r1
        Ldd:
            java.lang.String r0 = X.C91149Zpx.LIZ(r10)
            r2.<init>(r1, r0, r3)
            goto Lee
        Le5:
            X.Zv6 r2 = new X.Zv6
            java.lang.String r0 = X.C91149Zpx.LIZ(r10)
            r2.<init>(r8, r0, r3)
        Lee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91472ZvA.LIZ():X.ZsM");
    }

    @Override // X.InterfaceC91296ZsK
    public final String LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC91296ZsK
    public final DspStruct LJIIIIZZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC91296ZsK
    public final int LJIIIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC91296ZsK
    public final boolean LJIIJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC91296ZsK
    public final UrlModel LJIIZILJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC91296ZsK
    public final String getAlbumName() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC91296ZsK
    public final String getCoverUrl() {
        return this.LJII;
    }

    @Override // X.InterfaceC91296ZsK
    public final C91301ZsP getEventData() {
        return this.LJI;
    }

    @Override // X.InterfaceC91296ZsK
    public final String getId() {
        return this.LIZLLL;
    }

    public C91472ZvA(DspStruct dspInfo) {
        UrlModel coverMedium;
        UrlModel coverLarge;
        List<String> urlList;
        String str;
        String fullClipId;
        o.LJIIIZ(dspInfo, "dspInfo");
        this.LIZ = dspInfo;
        this.LIZLLL = dspInfo.getMediaId();
        com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo = dspInfo.getDspMusic().getMusicDspInfo();
        this.LJ = (musicDspInfo == null || (fullClipId = musicDspInfo.getFullClipId()) == null) ? "" : fullClipId;
        this.LJFF = dspInfo;
        this.LJI = new C91301ZsP();
        Music music = dspInfo.getDspMusic().getMusic();
        this.LJII = (music == null || (coverLarge = music.getCoverLarge()) == null || (urlList = coverLarge.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null) ? "" : str;
        Music music2 = dspInfo.getDspMusic().getMusic();
        this.LJIIIIZZ = (music2 == null || (coverMedium = music2.getCoverMedium()) == null) ? new UrlModel() : coverMedium;
        this.LJIIIZ = -1;
        this.LJIIJ = "";
    }

    @Override // X.InterfaceC91296ZsK
    public final void LJI(Integer num) {
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        Music music = this.LIZ.getDspMusic().getMusic();
        if (music == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) ORZ.LJLLLL(musicOwnerInfos)) == null) {
            return;
        }
        musicOwnerInfo.setFollowStatus(num);
    }

    @Override // X.InterfaceC91296ZsK
    public final void LJIIJJI(int i) {
        com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo = this.LIZ.getDspMusic().getMusicDspInfo();
        if (musicDspInfo == null) {
            return;
        }
        musicDspInfo.setCollectStatus(i);
    }

    @Override // X.InterfaceC91296ZsK
    public final void LJIJ(int i) {
        this.LJIIIZ = i;
    }
}
