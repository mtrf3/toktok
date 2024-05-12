package X;

import Y.ACallableS89S0200000_12;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import java.util.HashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWH implements SXL {
    public final VideoMusicTitleRefactorAssem LIZ;
    public final LinearLayout LIZIZ;
    public final ImageView LIZJ;
    public final TuxIconView LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final InterfaceC88472Yns<VideoItemParams, Boolean> LJFF;

    @Override // X.SXL
    public final void LIZ(VideoItemParams item) {
        MatchedSoundInfo matchedSongInfo;
        String str;
        String str2;
        MatchedSoundInfo matchedSongInfo2;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        String str3 = null;
        if (C53205KuP.LIZ()) {
            SWI swi = SWI.LIZIZ;
            int value = SWA.SHOW.getValue();
            int value2 = SW7.TT_TO_DSP.getValue();
            String aid = aweme.getAid();
            Music music = aweme.getMusic();
            if (music != null) {
                str = music.getIdStr();
            } else {
                str = null;
            }
            Music music2 = aweme.getMusic();
            if (music2 != null && (matchedSongInfo2 = music2.getMatchedSongInfo()) != null) {
                str2 = matchedSongInfo2.getId();
            } else {
                str2 = null;
            }
            swi.LIZ.LJII(new ReportData(value, value2, aid, str, str2, new ExtraData(new TT2DspActionInfo(Integer.valueOf(swi.LJI(item.getAweme().getMusic()).getValue()), Integer.valueOf(SWO.SMALL.ordinal())))));
        }
        if (C53208KuS.LIZ()) {
            AbstractC73672Svk.LJJIIJZLJL(new ACallableS89S0200000_12(aweme, item, 6)).LJJL(T16.LIZ()).LJJJJZ();
        } else {
            LJ(aweme, item);
        }
        SWI swi2 = SWI.LIZIZ;
        String str4 = "";
        if (swi2.LJI(item.getAweme().getMusic()) == DspPlatform.UNKNOWN) {
            String aid2 = item.getAweme().getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            swi2.LIZ.LJIIZILJ(aid2);
        }
        Music music3 = item.getAweme().getMusic();
        if (music3 != null && (matchedSongInfo = music3.getMatchedSongInfo()) != null) {
            str3 = matchedSongInfo.getId();
        }
        String aid3 = item.getAweme().getAid();
        if (aid3 != null) {
            str4 = aid3;
        }
        swi2.LIZ.LJIIJJI(str3, str4);
    }

    @Override // X.SXL
    public final boolean LIZIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return this.LJFF.invoke(item).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    @Override // X.SXL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r18) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SWH.LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public static final void LJ(Aweme aweme, VideoItemParams videoItemParams) {
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", aweme.getAid());
        String str = videoItemParams.mEventType;
        if (str == null) {
            str = "'";
        }
        hashMap.put("enter_from", str);
        hashMap.put("music_id", aweme.getMusic().getMid());
        hashMap.put("music_volume", aweme.getMusicVolume());
        hashMap.put("button_name", SWI.LIZIZ.LJI(videoItemParams.getAweme().getMusic()).getEventName());
        hashMap.put("button_type", "small");
        FMX.LJIIL("show_tttodsp_music", hashMap);
    }

    @Override // X.SXL
    public final boolean LIZLLL(VideoItemParams item, double d) {
        o.LJIIIZ(item, "item");
        return true;
    }

    public SWH(VideoMusicTitleRefactorAssem musicTitleAssem, LinearLayout linearLayout, ImageView imageView, TuxIconView tuxIconView, AqS162S0100000_12 aqS162S0100000_12, AqS170S0100000_4 aqS170S0100000_4) {
        o.LJIIIZ(musicTitleAssem, "musicTitleAssem");
        this.LIZ = musicTitleAssem;
        this.LIZIZ = linearLayout;
        this.LIZJ = imageView;
        this.LIZLLL = tuxIconView;
        this.LJ = aqS162S0100000_12;
        this.LJFF = aqS170S0100000_4;
    }
}
