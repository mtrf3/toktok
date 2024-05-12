package X;

import Y.ACallableS89S0200000_12;
import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWG extends AbstractC65781Prl implements InterfaceC88471Ynr<AddToMusicDspButtonAssem, C43I<? extends Integer>, C76800UCe> {
    public static final SWG LJLIL = new SWG();

    public SWG() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddToMusicDspButtonAssem addToMusicDspButtonAssem, C43I<? extends Integer> c43i) {
        String str;
        MatchedSoundInfo matchedSongInfo;
        String str2;
        String str3;
        MatchedSoundInfo matchedSongInfo2;
        AddToMusicDspButtonAssem selectSubscribe = addToMusicDspButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && !selectSubscribe.LLIIIL) {
            PriorityAbility priorityAbility = (PriorityAbility) selectSubscribe.LLFII.getValue();
            String str4 = null;
            if (priorityAbility != null) {
                str = priorityAbility.LQ();
            } else {
                str = null;
            }
            if (o.LJ(str, "bottom_button_add_song_to_playlist") && !((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().isAd()) {
                SWI swi = SWI.LIZIZ;
                if (swi.LJIIL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic(), ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid())) {
                    selectSubscribe.getContainerView().setVisibility(0);
                    Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                    if (C53205KuP.LIZ()) {
                        int value = SWA.SHOW.getValue();
                        int value2 = SW7.TT_TO_DSP.getValue();
                        String aid = aweme.getAid();
                        Music music = aweme.getMusic();
                        if (music != null) {
                            str2 = music.getIdStr();
                        } else {
                            str2 = null;
                        }
                        Music music2 = aweme.getMusic();
                        if (music2 != null && (matchedSongInfo2 = music2.getMatchedSongInfo()) != null) {
                            str3 = matchedSongInfo2.getId();
                        } else {
                            str3 = null;
                        }
                        swi.LIZ.LJII(new ReportData(value, value2, aid, str2, str3, new ExtraData(new TT2DspActionInfo(Integer.valueOf(DspPlatform.UNKNOWN.getValue()), Integer.valueOf(SWO.BIG.ordinal())))));
                    }
                    if (C53208KuS.LIZ()) {
                        AbstractC73672Svk.LJJIIJZLJL(new ACallableS89S0200000_12(aweme, selectSubscribe, 5)).LJJL(T16.LIZ()).LJJJJZ();
                    } else {
                        AddToMusicDspButtonAssem.q4(aweme, selectSubscribe);
                    }
                    selectSubscribe.LLIIIL = true;
                    String aid2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                    String str5 = "";
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    swi.LIZ.LIZ(aid2);
                    Music music3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic();
                    if (music3 != null && (matchedSongInfo = music3.getMatchedSongInfo()) != null) {
                        str4 = matchedSongInfo.getId();
                    }
                    String aid3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                    if (aid3 == null) {
                        aid3 = "";
                    }
                    swi.LIZ.LJIIJJI(str4, aid3);
                    String aid4 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                    if (aid4 != null) {
                        str5 = aid4;
                    }
                    swi.LIZ.LJIIZILJ(str5);
                }
            }
            selectSubscribe.getContainerView().setVisibility(8);
        }
        return C76800UCe.LIZ;
    }
}
