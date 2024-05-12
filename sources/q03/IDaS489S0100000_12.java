package q03;

import X.C212428Vi;
import X.C27609AsX;
import X.C51029K0z;
import X.C53205KuP;
import X.C73044Slc;
import X.C73046Sle;
import X.C73062Slu;
import X.C73063Slv;
import X.C98T;
import X.FMX;
import X.IPW;
import X.IPX;
import X.IPZ;
import X.IQ9;
import X.InterfaceC73048Slg;
import X.InterfaceC73050Sli;
import X.InterfaceC73072Sm4;
import X.KeyEventCallbackC73065Slx;
import X.SW7;
import X.SWA;
import X.SWI;
import X.SWO;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IPlayerProgressAbility;
import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDaS489S0100000_12 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZ$13(this, view);
                return;
            case 14:
                LIZ$14(this, view);
                return;
            case 15:
                LIZ$15(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS489S0100000_12(AddToMusicDspButtonAssem addToMusicDspButtonAssem, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = addToMusicDspButtonAssem;
    }

    public static final void LIZ$0(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null) {
            C27609AsX middleAction = ((C73063Slv) iDaS489S0100000_12.l0).getMiddleAction();
            if (middleAction != null) {
                middleAction.LJLILLLLZI.onClick(view);
                return;
            }
            InterfaceC73072Sm4 onPlayerActionBarListener = ((C73063Slv) iDaS489S0100000_12.l0).getOnPlayerActionBarListener();
            if (onPlayerActionBarListener == null) {
                return;
            }
            onPlayerActionBarListener.LJFF();
        }
    }

    public static final void LIZ$1(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null && view.getAlpha() >= 1.0E-5d) {
            ChallengeDetailFragment challengeDetailFragment = (ChallengeDetailFragment) iDaS489S0100000_12.l0;
            Context requireContext = challengeDetailFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            challengeDetailFragment.Dl(requireContext);
        }
    }

    public static final void LIZ$10(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        InterfaceC73072Sm4 onPlayerActionBarListener;
        if (view != null && ((C73063Slv) iDaS489S0100000_12.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C73063Slv) iDaS489S0100000_12.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LJII();
        }
    }

    public static final void LIZ$11(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        InterfaceC73072Sm4 onPlayerActionBarListener;
        if (view != null && (onPlayerActionBarListener = ((C73063Slv) iDaS489S0100000_12.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LIZLLL();
        }
    }

    public static final void LIZ$12(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null && ((C73062Slu) iDaS489S0100000_12.l0).getVideoSize$player_release() != null) {
            KeyEventCallbackC73065Slx.LIZIZ();
        }
    }

    public static final void LIZ$13(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null) {
            if (IPZ.LIZ == IPX.PLAYER_START) {
                ((C73062Slu) iDaS489S0100000_12.l0).LJIIL();
                return;
            }
            InterfaceC73050Sli playerLogListener$player_release = ((C73062Slu) iDaS489S0100000_12.l0).getPlayerLogListener$player_release();
            if (playerLogListener$player_release != null) {
                playerLogListener$player_release.LIZ();
            }
            ((C73062Slu) iDaS489S0100000_12.l0).LJIILIIL(0.0f);
        }
    }

    public static final void LIZ$14(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null && view.getAlpha() >= 1.0E-5d) {
            TTSVoiceDetailsFragment tTSVoiceDetailsFragment = (TTSVoiceDetailsFragment) iDaS489S0100000_12.l0;
            Context requireContext = tTSVoiceDetailsFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            tTSVoiceDetailsFragment.Al(requireContext);
        }
    }

    public static final void LIZ$15(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null) {
            TTSVoiceDetailsFragment tTSVoiceDetailsFragment = (TTSVoiceDetailsFragment) iDaS489S0100000_12.l0;
            Context requireContext = tTSVoiceDetailsFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            tTSVoiceDetailsFragment.Al(requireContext);
        }
    }

    public static final void LIZ$2(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null) {
            ChallengeDetailFragment challengeDetailFragment = (ChallengeDetailFragment) iDaS489S0100000_12.l0;
            Context requireContext = challengeDetailFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            challengeDetailFragment.Dl(requireContext);
        }
    }

    public static final void LIZ$3(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        String str;
        FragmentManager childFragmentManager;
        MatchedSoundInfo matchedSongInfo;
        LiveData<Integer> u;
        Integer value;
        String str2;
        String str3;
        MatchedSoundInfo matchedSongInfo2;
        if (view != null) {
            AddToMusicDspButtonAssem addToMusicDspButtonAssem = (AddToMusicDspButtonAssem) iDaS489S0100000_12.l0;
            addToMusicDspButtonAssem.getClass();
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).getAweme();
            String str4 = null;
            if (C53205KuP.LIZ()) {
                SWI swi = SWI.LIZIZ;
                int value2 = SWA.CLICK.getValue();
                int value3 = SW7.TT_TO_DSP.getValue();
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
                swi.LIZ.LJII(new ReportData(value2, value3, aid, str2, str3, new ExtraData(new TT2DspActionInfo(Integer.valueOf(DspPlatform.UNKNOWN.getValue()), Integer.valueOf(SWO.BIG.ordinal())))));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("group_id", aweme.getAid());
            String str5 = ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).mEventType;
            if (str5 == null) {
                str5 = "'";
            }
            hashMap.put("enter_from", str5);
            hashMap.put("music_id", aweme.getMusic().getMid());
            hashMap.put("music_volume", aweme.getMusicVolume());
            hashMap.put("button_name", "null");
            hashMap.put("button_type", "big");
            IPlayerProgressAbility iPlayerProgressAbility = (IPlayerProgressAbility) addToMusicDspButtonAssem.LLIIIILZ.getValue();
            if (iPlayerProgressAbility != null && (u = iPlayerProgressAbility.u()) != null && (value = u.getValue()) != null) {
                str = String.valueOf(value);
            } else {
                str = "";
            }
            hashMap.put("click_at_duration", str);
            FMX.LJIIL("click_tttodsp_music", hashMap);
            Fragment LIZLLL = C212428Vi.LIZLLL(addToMusicDspButtonAssem);
            if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
                SWI swi2 = SWI.LIZIZ;
                Music music3 = ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).getAweme().getMusic();
                if (music3 != null && (matchedSongInfo = music3.getMatchedSongInfo()) != null) {
                    str4 = matchedSongInfo.getId();
                }
                swi2.LJIJ(str4, "homepage_hot", ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).getAweme().getMusic().getIdStr(), ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).getAweme().getMusicVolume(), "big", childFragmentManager, C212428Vi.LIZLLL(addToMusicDspButtonAssem), ((VideoItemParams) C51029K0z.LJIILLIIL(addToMusicDspButtonAssem)).getAweme().getMusic(), null, false, false);
            }
        }
    }

    public static final void LIZ$4(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        InterfaceC73048Slg onPlayerActionBarListener;
        if (view != null && ((C73046Sle) iDaS489S0100000_12.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C73046Sle) iDaS489S0100000_12.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LIZ();
        }
    }

    public static final void LIZ$5(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        InterfaceC73048Slg onPlayerActionBarListener;
        if (view != null && ((C73046Sle) iDaS489S0100000_12.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C73046Sle) iDaS489S0100000_12.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LJFF();
        }
    }

    public static final void LIZ$6(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        InterfaceC73048Slg onPlayerActionBarListener;
        if (view != null && (onPlayerActionBarListener = ((C73046Sle) iDaS489S0100000_12.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LIZLLL();
        }
    }

    public static final void LIZ$7(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        if (view != null && ((C73044Slc) iDaS489S0100000_12.l0).getVideoSize() != null) {
            KeyEventCallbackC73065Slx.LIZIZ();
        }
    }

    public static final void LIZ$8(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        IPW ipw;
        if (view != null) {
            IQ9 player = ((C73044Slc) iDaS489S0100000_12.l0).getPlayer();
            if (player != null) {
                ipw = player.LJIILL;
            } else {
                ipw = null;
            }
            if (ipw == IPW.PLAYER_START) {
                IQ9 iq9 = ((C73044Slc) iDaS489S0100000_12.l0).LJLJJL;
                if (iq9 != null) {
                    iq9.pause();
                    return;
                }
                return;
            }
            InterfaceC73050Sli playerLogListener = ((C73044Slc) iDaS489S0100000_12.l0).getPlayerLogListener();
            if (playerLogListener != null) {
                playerLogListener.LIZ();
            }
            ((C73044Slc) iDaS489S0100000_12.l0).LJIIIIZZ(0.0f);
        }
    }

    public static final void LIZ$9(IDaS489S0100000_12 iDaS489S0100000_12, View view) {
        InterfaceC73072Sm4 onPlayerActionBarListener;
        if (view != null && ((C73063Slv) iDaS489S0100000_12.l0).getNeedShowMask() && (onPlayerActionBarListener = ((C73063Slv) iDaS489S0100000_12.l0).getOnPlayerActionBarListener()) != null) {
            onPlayerActionBarListener.LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS489S0100000_12(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
