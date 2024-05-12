package X;

import Y.ACallableS89S0200000_12;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SW6 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C43I<? extends Integer>, C76800UCe> {
    public static final SW6 LJLIL = new SW6();

    public SW6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C43I<? extends Integer> c43i) {
        Music music;
        MusicReleaseInfo musicReleaseInfo;
        MatchedSoundInfo matchedSongInfo;
        String str;
        String str2;
        MatchedSoundInfo matchedSongInfo2;
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLILL = true;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            String str3 = "";
            if (selectSubscribe.X4(aweme)) {
                Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                String str4 = null;
                if (C53205KuP.LIZ()) {
                    SWI swi = SWI.LIZIZ;
                    int value = SWA.SHOW.getValue();
                    int value2 = SW7.TT_TO_DSP.getValue();
                    String aid = aweme2.getAid();
                    Music music2 = aweme2.getMusic();
                    if (music2 != null) {
                        str = music2.getIdStr();
                    } else {
                        str = null;
                    }
                    Music music3 = aweme2.getMusic();
                    if (music3 != null && (matchedSongInfo2 = music3.getMatchedSongInfo()) != null) {
                        str2 = matchedSongInfo2.getId();
                    } else {
                        str2 = null;
                    }
                    swi.LIZ.LJII(new ReportData(value, value2, aid, str, str2, new ExtraData(new TT2DspActionInfo(Integer.valueOf(swi.LJI(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic()).getValue()), Integer.valueOf(SWO.SMALL.ordinal())))));
                }
                if (C53208KuS.LIZ()) {
                    AbstractC73672Svk.LJJIIJZLJL(new ACallableS89S0200000_12(aweme2, selectSubscribe, 4)).LJJL(T16.LIZ()).LJJJJZ();
                } else {
                    VideoMusicTitleAssem.I4(aweme2, selectSubscribe);
                }
                SWI swi2 = SWI.LIZIZ;
                if (swi2.LJI(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic()) == DspPlatform.UNKNOWN) {
                    String aid2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    swi2.LIZ.LJIIZILJ(aid2);
                }
                Music music4 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic();
                if (music4 != null && (matchedSongInfo = music4.getMatchedSongInfo()) != null) {
                    str4 = matchedSongInfo.getId();
                }
                String aid3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                if (aid3 != null) {
                    str3 = aid3;
                }
                swi2.LIZ.LJIIJJI(str4, str3);
            } else if (selectSubscribe.Y4()) {
                MusicInfo B4 = selectSubscribe.B4();
                if (B4 != null) {
                    String aid4 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                    if (aid4 != null) {
                        str3 = aid4;
                    }
                    MusicDetailService.LJIJJ().LIZLLL(String.valueOf(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic().getId()), str3);
                    if (B4.isTtm()) {
                        SV7.LIZ.getClass();
                        if (SV7.LJFF(false)) {
                            SV6.LIZIZ(SVA.TIKTOK_MUSIC, C74221TAz.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), "item.aweme.aid"), EnumC72191SUx.BRAND_ICON);
                        }
                    }
                    IMusicDetailService LJIJJ = MusicDetailService.LJIJJ();
                    B4.getProduct();
                    String trackId = B4.getTrackId();
                    String clipId = B4.getClipId();
                    String requestId = B4.getRequestId();
                    java.util.Map<String, String> logExtraMap = B4.getLogExtraMap();
                    boolean isPgc = B4.isPgc();
                    o.LJIIIIZZ(LJIJJ, "getService(IMusicDetailService::class.java)");
                    LJIJJ.LJIILJJIL(trackId, clipId, str3, requestId, logExtraMap, isPgc);
                }
            } else {
                Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                o.LJIIIIZZ(aweme3, "item.aweme");
                if (selectSubscribe.a5(aweme3)) {
                    MusicDetailService.LJIJJ().LJI(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
                    selectSubscribe.J4(true);
                } else if (C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType) && (music = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic()) != null && (musicReleaseInfo = music.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
                    selectSubscribe.J4(false);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
