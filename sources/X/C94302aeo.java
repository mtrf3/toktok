package X;

import Y.IDeS360S0100000_1;
import Y.IDeS363S0100000_42;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.apple.android.sdk.authentication.SDKUriHandlerActivity;
import com.apple.android.sdk.authentication.StartAuthenticationActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.e;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.spotify.sdk.android.auth.LoginActivity;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.AmazonMusicToken;
import com.ss.android.ugc.aweme.music.model.AppleMusicToken;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.SpotifyMusicToken;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.aeo */
/* loaded from: classes34.dex */
public final class C94302aeo implements LEA {
    public static final C94302aeo LJLIL;
    public static C93683aUp LJLILLLLZI;
    public static String LJLJI;
    public static DspPlatform LJLJJI;
    public static String LJLJJL;
    public static String LJLJJLL;
    public static DspAuthToken LJLJL;
    public static volatile String LJLJLJ;
    public static Long LJLJLLL;
    public static Long LJLL;
    public static boolean LJLLI;
    public static C9A8 LJLLILLLL;
    public static String LJLLJ;
    public static String LJLLL;
    public static String LJLLLL;
    public static String LJLLLLLL;
    public static String LJLZ;
    public static String LJZ;
    public static final C62822Ol8 LJZI;
    public static final HashMap<String, Boolean> LJZL;
    public static final HashSet<String> LL;
    public static final HashSet<String> LLD;

    static {
        C94302aeo c94302aeo = new C94302aeo();
        LJLIL = c94302aeo;
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c94302aeo);
        LJLJJI = DspPlatform.UNKNOWN;
        LJLJJL = "";
        LJLJJLL = "";
        LJLJLJ = "";
        LJLLJ = "";
        LJLLL = "";
        LJLLLL = "";
        LJLLLLLL = "";
        LJLZ = "";
        LJZ = "";
        LJZI = C221108m2.LIZIZ(C94678aks.LJLIL);
        LJZL = new HashMap<>();
        LL = new HashSet<>();
        LLD = new HashSet<>();
    }

    public static final InterfaceC214228aw<InterfaceC94324afA> LJIIJ() {
        return (InterfaceC214228aw) LJZI.getValue();
    }

    public final InterfaceC65462ha<List<TT2DSPPlatformInfo>> LJI() {
        Object LJIIZILJ;
        ArrayList arrayList = (ArrayList) C93920aYe.LIZ;
        if (!arrayList.isEmpty()) {
            LJIIZILJ = new IDeS360S0100000_1(arrayList, 10);
        } else {
            LJIIZILJ = V1M.LJIIZILJ(C78613UtF.LIZJ, new IDeS363S0100000_42(LJIIJ().getOperator().LJJI(), 2));
        }
        return new IDeS363S0100000_42(LJIIZILJ, 1);
    }

    public static DspPlatform LJ() {
        if (o.LJ(((RBX) HG3.LJIILL()).getCurSecUserId(), LJLJI)) {
            return LJLJJI;
        }
        return DspPlatform.UNKNOWN;
    }

    public static boolean LJJIIJZLJL() {
        if (C187437Xf.LIZ() != 0 && ((RBX) HG3.LJIILL()).isLogin() && !((RBY) HG3.LJIILL()).isChildrenMode() && !CommerceMediaServiceImpl.LIZJ().LJIIZILJ()) {
            return true;
        }
        return false;
    }

    public static String LIZLLL(DspAuthToken dspAuthToken) {
        String value = "";
        if (dspAuthToken == null) {
            return "";
        }
        e eVar = new e();
        eVar.LJIIL = false;
        try {
            value = eVar.LIZ().LJIILL(dspAuthToken);
        } catch (Throwable unused) {
        }
        o.LJIIIIZZ(value, "value");
        return value;
    }

    public static DspPlatform LJIIIIZZ(Music music) {
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        TT2DSPSongInfo tT2DSPSongInfo;
        Integer dspPlatform;
        DspPlatform dspPlatform2 = C93920aYe.LIZIZ;
        if (dspPlatform2 == null) {
            if (music != null && (tT2DSPSongInfos = music.getTT2DSPSongInfos()) != null) {
                Iterator<TT2DSPSongInfo> it = tT2DSPSongInfos.iterator();
                while (true) {
                    if (it.hasNext()) {
                        tT2DSPSongInfo = it.next();
                        if (o.LJ(tT2DSPSongInfo.getPlatformSelectedByUser(), Boolean.TRUE)) {
                            break;
                        }
                    } else {
                        tT2DSPSongInfo = null;
                        break;
                    }
                }
                TT2DSPSongInfo tT2DSPSongInfo2 = tT2DSPSongInfo;
                if (tT2DSPSongInfo2 != null && (dspPlatform = tT2DSPSongInfo2.getDspPlatform()) != null) {
                    DspPlatform from = DspPlatform.Companion.from(Integer.valueOf(dspPlatform.intValue()));
                    if (from != null) {
                        return from;
                    }
                }
            }
            return LJ();
        }
        return dspPlatform2;
    }

    public static boolean LJIILJJIL(DspPlatform dspPlatform) {
        int i = C93870aXq.LIZIZ[dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return C93922aYg.LJIIIIZZ(DspPlatform.SPOTIFY);
            }
            return C93922aYg.LJIIIIZZ(DspPlatform.AMAZON_MUSIC);
        }
        return C93922aYg.LJIIIIZZ(DspPlatform.APPLE_MUSIC);
    }

    public static boolean LJIILL(List list) {
        AppleMusicToken appleMusicToken;
        String developToken;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TT2DSPSongInfo tT2DSPSongInfo = (TT2DSPSongInfo) it.next();
            if (C78685UuP.LJJJZ(tT2DSPSongInfo.getSongId())) {
                Integer dspPlatform = tT2DSPSongInfo.getDspPlatform();
                DspAuthToken token = tT2DSPSongInfo.getToken();
                Context LIZIZ = EF7.LIZIZ();
                DspPlatform.Companion companion = DspPlatform.Companion;
                DspPlatform from = companion.from(dspPlatform);
                int[] iArr = C93870aXq.LIZIZ;
                int i = iArr[from.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                continue;
                            }
                        } else if (!DspPlatform.SPOTIFY.getSupport()) {
                            continue;
                        }
                    } else {
                        try {
                            if (C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), LIZIZ) != 0) {
                                continue;
                            }
                        } catch (Exception unused) {
                            continue;
                        }
                    }
                } else if (token != null && (appleMusicToken = token.getAppleMusicToken()) != null && (developToken = appleMusicToken.getDevelopToken()) != null && developToken.length() != 0) {
                }
                Context LIZIZ2 = EF7.LIZIZ();
                DspPlatform from2 = companion.from(tT2DSPSongInfo.getDspPlatform());
                int i2 = iArr[from2.ordinal()];
                if ((i2 != 1 && i2 != 2 && i2 != 3) || ((o.LJ(tT2DSPSongInfo.getPlatformSelectedByUser(), Boolean.TRUE) && C93922aYg.LIZLLL(from2).length() > 0) || LJII(from2, LIZIZ2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJIIJJI(DspAuthParam dspAuthParam) {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        String str;
        AppleMusicToken appleMusicToken;
        TT2DSPSongInfo tT2DSPSongInfo = dspAuthParam.dspSongInfo;
        if (tT2DSPSongInfo == null || (fragment = dspAuthParam.fragment) == null || (mo49getActivity = fragment.mo49getActivity()) == null) {
            return;
        }
        int i = C93870aXq.LIZIZ[dspAuthParam.dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJIJJLI(mo49getActivity, dspAuthParam.fragment, tT2DSPSongInfo.getSongId(), dspAuthParam.metaSongId, dspAuthParam.enterFrom, dspAuthParam.awemeId, dspAuthParam.musicId, dspAuthParam.musicVolume, dspAuthParam.buttonType, C9A8.ENTER_FROM_LINKED_PLATFORM, dspAuthParam.isFromMusicDetail);
                return;
            }
            LJIJI(mo49getActivity, dspAuthParam.fragment, tT2DSPSongInfo.getSongId(), dspAuthParam.metaSongId, dspAuthParam.enterFrom, dspAuthParam.awemeId, dspAuthParam.musicId, dspAuthParam.musicVolume, dspAuthParam.buttonType, C9A8.ENTER_FROM_LINKED_PLATFORM, dspAuthParam.isFromMusicDetail);
            return;
        }
        Fragment fragment2 = dspAuthParam.fragment;
        DspAuthToken token = tT2DSPSongInfo.getToken();
        if (token != null && (appleMusicToken = token.getAppleMusicToken()) != null) {
            str = appleMusicToken.getDevelopToken();
        } else {
            str = null;
        }
        LJIJJ(mo49getActivity, fragment2, str, tT2DSPSongInfo.getSongId(), dspAuthParam.metaSongId, dspAuthParam.enterFrom, dspAuthParam.awemeId, dspAuthParam.musicId, dspAuthParam.musicVolume, dspAuthParam.buttonType, C9A8.ENTER_FROM_LINKED_PLATFORM, dspAuthParam.isFromMusicDetail);
    }

    public static boolean LJFF(Music music, boolean z) {
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        TT2DSPSongInfo tT2DSPSongInfo;
        String songId;
        DspAuthToken LJIIIZ;
        if (music == null || (tT2DSPSongInfos = music.getTT2DSPSongInfos()) == null) {
            return false;
        }
        DspPlatform LJIIIIZZ = LJIIIIZZ(music);
        if (LJIIIIZZ == DspPlatform.UNKNOWN) {
            return !tT2DSPSongInfos.isEmpty();
        }
        Iterator<TT2DSPSongInfo> it = tT2DSPSongInfos.iterator();
        while (true) {
            if (it.hasNext()) {
                tT2DSPSongInfo = it.next();
                Integer dspPlatform = tT2DSPSongInfo.getDspPlatform();
                int value = LJIIIIZZ.getValue();
                if (dspPlatform != null && dspPlatform.intValue() == value) {
                    break;
                }
            } else {
                tT2DSPSongInfo = null;
                break;
            }
        }
        TT2DSPSongInfo tT2DSPSongInfo2 = tT2DSPSongInfo;
        if (tT2DSPSongInfo2 == null || (songId = tT2DSPSongInfo2.getSongId()) == null || songId.length() == 0 || songId == null) {
            return false;
        }
        o.LJIIIZ(LJIIIIZZ, "<this>");
        if (C93956aZE.LIZ[LJIIIIZZ.ordinal()] != 2 || (LJIIIZ = LJIIIZ(LJIIIIZZ, tT2DSPSongInfo2.getToken())) == null || LL.contains(songId)) {
            return true;
        }
        HashMap<String, Boolean> hashMap = LJZL;
        if (hashMap.containsKey(songId)) {
            Boolean bool = hashMap.get(songId);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            return bool.booleanValue();
        }
        String LIZLLL = LIZLLL(LJIIIZ);
        if (LIZLLL.length() == 0) {
            return false;
        }
        C64962gm LIZ = C48841JEv.LIZ(C79146V4k.LJIILIIL());
        String str = "";
        if (C93921aYf.LIZ[LJIIIIZZ.ordinal()] == 1) {
            Keva keva = C93922aYg.LIZ;
            String realRegion = keva.getString("apple_music_account_region", "");
            if (realRegion.length() == 0) {
                String LJ = C93922aYg.LJ("apple_music_account_region_%s");
                if (LJ.length() != 0) {
                    str = keva.getString(LJ, "");
                    keva.storeString("apple_music_account_region", str);
                    keva.erase(LJ);
                }
                realRegion = str;
            }
            String str2 = C93922aYg.LJFF;
            if (str2.length() == 0) {
                o.LJIIIIZZ(realRegion, "realRegion");
                C93922aYg.LJFF = realRegion;
            } else {
                realRegion = str2;
            }
            str = realRegion;
        }
        XKX.LIZLLL(LIZ, null, null, new C94884aoC(LJIIIIZZ, songId, LIZLLL, str, z, null), 3);
        return false;
    }

    public static boolean LJII(DspPlatform dspPlatform, Context context) {
        int i = C93870aXq.LIZIZ[dspPlatform.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                String[] strArr = {"", ".debug", ".canary", ".partners"};
                int i2 = 0;
                do {
                    String str = strArr[i2];
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("com.spotify.music");
                        LIZ.append(str);
                        C16880lQ.LLLLLLZ(packageManager, X1D.LIZIZ(LIZ), 0);
                        return true;
                    } catch (PackageManager.NameNotFoundException unused) {
                        i2++;
                    }
                } while (i2 < 4);
                return false;
            }
            try {
                C16880lQ.LLLLLLZ(context.getPackageManager(), "com.amazon.mp3", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        } else {
            try {
                if (C16880lQ.LLLLLLZ(context.getPackageManager(), "com.apple.android.music", 0).versionCode >= 680) {
                }
                z = false;
            } catch (PackageManager.NameNotFoundException unused3) {
                return false;
            }
        }
        return z;
    }

    public static DspAuthToken LJIIIZ(DspPlatform dspPlatform, DspAuthToken dspAuthToken) {
        AppleMusicToken appleMusicToken;
        String developToken;
        String userToken;
        AmazonMusicToken amazonMusicToken;
        String userToken2;
        DspAuthToken dspAuthToken2;
        SpotifyMusicToken spotifyMusicToken;
        String userToken3;
        DspAuthToken dspAuthToken3;
        int i = C93870aXq.LIZIZ[dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                String LIZLLL = C93922aYg.LIZLLL(DspPlatform.SPOTIFY);
                if (C78685UuP.LJJJZ(LIZLLL)) {
                    dspAuthToken3 = new DspAuthToken(null, null, new SpotifyMusicToken(LIZLLL));
                } else {
                    if (dspAuthToken == null || (spotifyMusicToken = dspAuthToken.getSpotifyMusicToken()) == null || (userToken3 = spotifyMusicToken.getUserToken()) == null) {
                        return null;
                    }
                    dspAuthToken3 = new DspAuthToken(null, null, new SpotifyMusicToken(userToken3));
                }
                return dspAuthToken3;
            }
            String LIZLLL2 = C93922aYg.LIZLLL(DspPlatform.AMAZON_MUSIC);
            if (C78685UuP.LJJJZ(LIZLLL2)) {
                dspAuthToken2 = new DspAuthToken(null, new AmazonMusicToken(LIZLLL2), null);
            } else {
                if (dspAuthToken == null || (amazonMusicToken = dspAuthToken.getAmazonMusicToken()) == null || (userToken2 = amazonMusicToken.getUserToken()) == null) {
                    return null;
                }
                dspAuthToken2 = new DspAuthToken(null, new AmazonMusicToken(userToken2), null);
            }
            return dspAuthToken2;
        }
        if (dspAuthToken == null || (appleMusicToken = dspAuthToken.getAppleMusicToken()) == null || (developToken = appleMusicToken.getDevelopToken()) == null) {
            return null;
        }
        String LIZLLL3 = C93922aYg.LIZLLL(DspPlatform.APPLE_MUSIC);
        if (C78685UuP.LJJJZ(LIZLLL3)) {
            return new DspAuthToken(new AppleMusicToken(developToken, LIZLLL3), null, null);
        }
        AppleMusicToken appleMusicToken2 = dspAuthToken.getAppleMusicToken();
        if (appleMusicToken2 == null || (userToken = appleMusicToken2.getUserToken()) == null) {
            return null;
        }
        return new DspAuthToken(new AppleMusicToken(developToken, userToken), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILIIL(com.ss.android.ugc.aweme.music.model.Music r4, java.lang.String r5) {
        /*
            boolean r0 = X.C51937KZx.LIZ()
            r3 = 0
            if (r0 != 0) goto Ld
            boolean r0 = X.C53205KuP.LIZ()
            if (r0 == 0) goto L42
        Ld:
            java.util.HashSet<java.lang.String> r0 = X.C93922aYg.LJIJ
            boolean r0 = X.ORZ.LJLJJI(r5, r0)
            if (r0 != 0) goto L42
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r4.getMatchedSongInfo()
            if (r0 == 0) goto L6b
            java.lang.String r1 = r0.getId()
        L1f:
            java.util.HashSet<java.lang.String> r0 = X.C93922aYg.LJIJJLI
            if (r0 != 0) goto L26
            X.C93922aYg.LJI()
        L26:
            java.util.HashSet<java.lang.String> r0 = X.C93922aYg.LJIJJLI
            if (r0 == 0) goto L30
            boolean r0 = X.ORZ.LJLJJI(r1, r0)
            if (r0 != 0) goto L41
        L30:
            if (r1 == 0) goto L38
            int r0 = r1.length()
            if (r0 != 0) goto L43
        L38:
            r1 = 0
        L39:
            com.ss.android.ugc.aweme.music.experiment.AddMusicToDspButtonConfig r0 = X.C53206KuQ.LIZJ()
            int r0 = r0.sameSongVideoDisplaysPerDay
            if (r1 < r0) goto L42
        L41:
            r3 = 1
        L42:
            return r3
        L43:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongVideoShownRecord> r0 = X.C93922aYg.LJIL
            if (r0 != 0) goto L4a
            X.C93922aYg.LJII()
        L4a:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongVideoShownRecord> r0 = X.C93922aYg.LJIL
            if (r0 == 0) goto L38
            java.lang.Object r2 = r0.get(r1)
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongVideoShownRecord r2 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongVideoShownRecord) r2
            if (r2 != 0) goto L57
            goto L38
        L57:
            java.lang.Long r0 = r2.lastShowTimestamp
            if (r0 == 0) goto L38
            long r0 = r0.longValue()
            boolean r0 = X.SU4.LIZLLL(r0)
            if (r0 == 0) goto L68
            int r1 = r2.showTimes
            goto L39
        L68:
            r2.showTimes = r3
            goto L38
        L6b:
            r1 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94302aeo.LJIILIIL(com.ss.android.ugc.aweme.music.model.Music, java.lang.String):boolean");
    }

    public static boolean LJJIIZ(Music music, String str, boolean z) {
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        int i;
        int i2;
        TT2DSPSongInfo tT2DSPSongInfo;
        if (music == null || (tT2DSPSongInfos = music.getTT2DSPSongInfos()) == null) {
            return false;
        }
        if ((!z && !LJJIIJZLJL()) || LJIIIIZZ(music) != DspPlatform.UNKNOWN) {
            return false;
        }
        if (C53205KuP.LIZ() && (tT2DSPSongInfo = (TT2DSPSongInfo) ORZ.LJLLLL(tT2DSPSongInfos)) != null) {
            Integer buttonType = tT2DSPSongInfo.getButtonType();
            int ordinal = SWO.SMALL.ordinal();
            if (buttonType != null && buttonType.intValue() == ordinal) {
                return false;
            }
        }
        if (!C53205KuP.LIZ() && !ORZ.LJLJJI(str, C93922aYg.LJIILJJIL)) {
            if (!C53206KuQ.LIZ(C93922aYg.LIZIZ())) {
                return false;
            }
            long j = C93922aYg.LJIJJ;
            if (j == -1) {
                j = C93922aYg.LIZ.getLong("last_all_button_show_date", 0L);
                C93922aYg.LJIJJ = j;
            }
            if (SU4.LIZLLL(j)) {
                i = C93922aYg.LJIJI;
                if (i == -1) {
                    i = C93922aYg.LIZ.getInt("all_button_show_time_per_day", 0);
                    C93922aYg.LJIJI = i;
                }
            } else {
                i = 0;
            }
            if (!C53206KuQ.LIZIZ(i)) {
                return false;
            }
            int i3 = C93922aYg.LJIILIIL;
            if (i3 == -1) {
                i3 = C93922aYg.LIZ.getInt("large_button_show_time", 0);
                C93922aYg.LJIILIIL = i3;
            }
            if (C2PW.LIZ()) {
                i2 = C53206KuQ.LIZJ().addToDspLargeButtonDisplaysBeforeAuthOpt;
            } else {
                i2 = C53206KuQ.LIZJ().addToDspLargeButtonDisplaysBeforeAuth;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 >= i2) {
                return false;
            }
        }
        if (LJIILIIL(music, str) || !LJIILL(tT2DSPSongInfos)) {
            return false;
        }
        return true;
    }

    public final void LJIIL(DspAuthParam dspAuthParam, C57300MeG c57300MeG, boolean z) {
        C38306F1q c38306F1q;
        TT2DSPSongInfo tT2DSPSongInfo;
        ActivityC45651qj mo49getActivity;
        AppleMusicToken appleMusicToken;
        Throwable e = c57300MeG.getE();
        String str = null;
        if (!(e instanceof C38333F2r) || (c38306F1q = (C38306F1q) e) == null) {
            return;
        }
        int errorCode = c38306F1q.getErrorCode();
        if (errorCode != 3007021 && errorCode != 3007044) {
            return;
        }
        C93922aYg.LIZ(dspAuthParam.dspPlatform);
        DspPlatform dspPlatform = dspAuthParam.dspPlatform;
        o.LJIIIZ(dspPlatform, "dspPlatform");
        if (C93921aYf.LIZ[dspPlatform.ordinal()] == 1) {
            C93922aYg.LJFF = "";
            String LJ = C93922aYg.LJ("apple_music_account_region_%s");
            Keva keva = C93922aYg.LIZ;
            keva.erase(LJ);
            keva.erase("apple_music_account_region");
        }
        Fragment fragment = dspAuthParam.fragment;
        if (fragment == null || (tT2DSPSongInfo = dspAuthParam.dspSongInfo) == null || (mo49getActivity = fragment.mo49getActivity()) == null || !C48203Ivv.LJ(mo49getActivity) || !z) {
            return;
        }
        int i = C93870aXq.LIZIZ[dspAuthParam.dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJIJJLI(mo49getActivity, fragment, tT2DSPSongInfo.getSongId(), dspAuthParam.metaSongId, dspAuthParam.enterFrom, dspAuthParam.awemeId, dspAuthParam.musicId, dspAuthParam.musicVolume, dspAuthParam.buttonType, C9A8.ENTER_FROM_LINKED_PLATFORM, dspAuthParam.isFromMusicDetail);
                return;
            }
            LJIJI(mo49getActivity, fragment, tT2DSPSongInfo.getSongId(), dspAuthParam.metaSongId, dspAuthParam.enterFrom, dspAuthParam.awemeId, dspAuthParam.musicId, dspAuthParam.musicVolume, dspAuthParam.buttonType, C9A8.ENTER_FROM_LINKED_PLATFORM, dspAuthParam.isFromMusicDetail);
            return;
        }
        DspAuthToken token = tT2DSPSongInfo.getToken();
        if (token != null && (appleMusicToken = token.getAppleMusicToken()) != null) {
            str = appleMusicToken.getDevelopToken();
        }
        LJIJJ(mo49getActivity, fragment, str, tT2DSPSongInfo.getSongId(), dspAuthParam.metaSongId, dspAuthParam.enterFrom, dspAuthParam.awemeId, dspAuthParam.musicId, dspAuthParam.musicVolume, dspAuthParam.buttonType, C9A8.ENTER_FROM_LINKED_PLATFORM, dspAuthParam.isFromMusicDetail);
    }

    public final InterfaceC65462ha<Boolean> LJJ(DspPlatform dspPlatform, DspAuthToken dspAuthToken, Activity activity) {
        String str;
        if (activity == null) {
            return new IDeS360S0100000_1(Boolean.FALSE, 10);
        }
        int i = C93870aXq.LIZIZ[dspPlatform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new IDeS360S0100000_1(Boolean.TRUE, 10);
                }
                return V1M.LJIIZILJ(C78613UtF.LIZJ, new C94299ael(LJIIJ().getOperator().LJJLIIIJJIZ(DspPlatform.SPOTIFY.getValue(), C87639YaR.LIZ().spotifyClientId, C93922aYg.LJFF(dspPlatform)), dspPlatform, activity));
            }
            return V1M.LJIIZILJ(C78613UtF.LIZJ, new C94298aek(LJIIJ().getOperator().LJLZ(C93922aYg.LJFF(dspPlatform), C87639YaR.LIZ().amazonClientId, C87639YaR.LIZ().amazonClientSecret), dspPlatform, activity));
        }
        InterfaceC94324afA operator = LJIIJ().getOperator();
        AppleMusicToken appleMusicToken = dspAuthToken.getAppleMusicToken();
        if (appleMusicToken == null || (str = appleMusicToken.getDevelopToken()) == null) {
            str = "";
        }
        return V1M.LJIIZILJ(C78613UtF.LIZJ, new C94297aej(operator.LJIIJJI(str, C93922aYg.LIZLLL(dspPlatform)), dspPlatform, activity));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(android.content.Intent r25, X.ActivityC45651qj r26, androidx.fragment.app.Fragment r27, X.InterfaceC65784Pro r28) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94302aeo.LJIILLIIL(android.content.Intent, X.1qj, androidx.fragment.app.Fragment, X.Pro):void");
    }

    public final void LJIIZILJ(Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        C93681aUn c93681aUn;
        Long l;
        Long l2;
        o.LJIIIZ(fragment, "fragment");
        if (activityC45651qj == null) {
            return;
        }
        Long l3 = null;
        String str = "link";
        if (intent == null) {
            DspPlatform dspPlatform = DspPlatform.APPLE_MUSIC;
            Long l4 = LJLJLLL;
            LJLJLLL = null;
            if (l4 != null) {
                l3 = Long.valueOf(SystemClock.elapsedRealtime() - l4.longValue());
            }
            Boolean bool = Boolean.FALSE;
            if (LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                str = "";
            }
            LJJIII(this, CardStruct.IStatusCode.DEFAULT, "miss_data", dspPlatform, l3, bool, true, str, LJLLLL, LJZ);
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIIZZ(R.string.dtj);
            c26045AKb.LJIIJ();
            return;
        }
        if (LJLILLLLZI == null) {
            return;
        }
        if (intent.hasExtra("music_user_token")) {
            c93681aUn = new C93681aUn(C16880lQ.LLJJIJIIJIL(intent, "music_user_token"));
        } else if (intent.hasExtra("music_user_token_error")) {
            c93681aUn = new C93681aUn(EnumC93680aUm.getErrorFromValue(intent.getIntExtra("music_user_token_error", EnumC93680aUm.UNKNOWN.getErrorCode())));
        } else {
            c93681aUn = new C93681aUn(EnumC93680aUm.UNKNOWN);
        }
        if (!c93681aUn.LIZIZ) {
            C9A8 c9a8 = LJLLILLLL;
            C9A8 c9a82 = C9A8.ENTER_FROM_SETTINGS;
            if (c9a8 != c9a82) {
                DspPlatform dspPlatform2 = DspPlatform.APPLE_MUSIC;
                Long l5 = LJLJLLL;
                LJLJLLL = null;
                if (l5 != null) {
                    l2 = Long.valueOf(SystemClock.elapsedRealtime() - l5.longValue());
                } else {
                    l2 = null;
                }
                LJJIII(this, "1", "", dspPlatform2, l2, Boolean.TRUE, true, "", LJLLLL, LJZ);
            } else {
                Long l6 = LJLJLLL;
                LJLJLLL = null;
                if (l6 != null) {
                    l = Long.valueOf(SystemClock.elapsedRealtime() - l6.longValue());
                } else {
                    l = null;
                }
                LJLL = l;
            }
            String musicUserToken = c93681aUn.LIZ;
            LJLJI = ((RBX) HG3.LJIILL()).getCurSecUserId();
            DspPlatform dspPlatform3 = DspPlatform.APPLE_MUSIC;
            LJLJJI = dspPlatform3;
            o.LJIIIIZZ(musicUserToken, "musicUserToken");
            C93922aYg.LJIIJJI(musicUserToken, dspPlatform3);
            C93922aYg.LJIIJ(dspPlatform3);
            LJLJL = new DspAuthToken(new AppleMusicToken(LJLJJLL, musicUserToken), null, null);
            LL.add(LJLJJL);
            if (LJLLILLLL != c9a82 && C53205KuP.LIZ()) {
                int value = SWA.AUTH.getValue();
                int value2 = SW7.TT_TO_DSP.getValue();
                Integer valueOf = Integer.valueOf(dspPlatform3.getValue());
                SWN swn = SWO.Companion;
                String str2 = LJZ;
                swn.getClass();
                C94001aZx.LIZ(new ReportData(value, value2, null, null, null, new ExtraData(new TT2DspActionInfo(valueOf, Integer.valueOf(SWN.LIZ(str2).ordinal()))), 28, null));
            }
            C9A8 c9a83 = LJLLILLLL;
            if (c9a83 == null) {
                return;
            }
            int i = C93870aXq.LIZ[c9a83.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                        return;
                    }
                    return;
                }
                if (C51937KZx.LIZ() || C53205KuP.LIZ()) {
                    C93922aYg.LJIIIZ(0);
                }
                LIZIZ(this, new DspAuthParam(dspPlatform3, fragment, null, LJLLL, LJLLLL, LJLLJ, LJLLLLLL, LJLZ, LJZ, LJLLI), activityC45651qj, true, false, 56);
                return;
            }
            if (C51937KZx.LIZ() || C53205KuP.LIZ()) {
                C93922aYg.LJIIIZ(0);
            }
            C2U8.LIZ(new C8UI());
            ASQ.LJ(fragment, ASX.LIZ);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error getting token: ");
        LIZ.append(c93681aUn);
        LIZ.append(".error");
        X1D.LIZIZ(LIZ);
        String valueOf2 = String.valueOf(c93681aUn.LIZJ.getErrorCode());
        DspPlatform dspPlatform4 = DspPlatform.APPLE_MUSIC;
        Long l7 = LJLJLLL;
        LJLJLLL = null;
        if (l7 != null) {
            l3 = Long.valueOf(SystemClock.elapsedRealtime() - l7.longValue());
        }
        Boolean bool2 = Boolean.FALSE;
        if (LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
            str = "";
        }
        LJJIII(this, CardStruct.IStatusCode.DEFAULT, valueOf2, dspPlatform4, l3, bool2, true, str, LJLLLL, LJZ);
        if (c93681aUn.LIZJ != EnumC93680aUm.USER_CANCELLED) {
            C26045AKb c26045AKb2 = new C26045AKb(activityC45651qj);
            c26045AKb2.LJIIIIZZ(R.string.dtj);
            c26045AKb2.LJIIJ();
        }
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        ((ArrayList) C93920aYe.LIZ).clear();
        C93920aYe.LIZIZ = null;
        LJLILLLLZI = null;
        LJLJI = null;
        LJLJJI = DspPlatform.UNKNOWN;
        LJLJJL = "";
        LJLJJLL = "";
        LJLJL = null;
        LJLJLJ = "";
        LJLJLLL = null;
        LJLL = null;
        LJLLILLLL = null;
        LJLLL = "";
        LJLLJ = "";
        LJLLLL = "";
        LJLLLLLL = "";
        LJLZ = "";
        LJZ = "";
        LJZL.clear();
        LL.clear();
        LLD.clear();
    }

    public static void LJIL(DspPlatform dspPlatform, DspAuthToken dspAuthToken, Activity activity, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        if (activity == null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C79146V4k.LJIILIIL()), null, null, new C94864ans(dspPlatform, dspAuthToken, activity, interfaceC65784Pro, interfaceC65784Pro2, null), 3);
    }

    public static void LJJIJ(Activity activity, DspPlatform platform, EnumC93896aYG action, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(action, "action");
        if (activity == null) {
            return;
        }
        if (!C48203Ivv.LJ(activity)) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(null);
            }
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C79146V4k.LJIILIIL()), null, null, new C94873ao1(platform, action, C93922aYg.LJFF(DspPlatform.SPOTIFY), interfaceC65784Pro, interfaceC88472Yns, null), 3);
        }
    }

    public final void LJIJ(int i, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        AuthorizationResponse LIZ;
        Bundle LJJLIIIIJ;
        o.LJIIIZ(fragment, "fragment");
        if (activityC45651qj == null) {
            return;
        }
        Long l = null;
        String str = "link";
        if (intent == null) {
            DspPlatform dspPlatform = DspPlatform.SPOTIFY;
            Long l2 = LJLJLLL;
            LJLJLLL = null;
            if (l2 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
            }
            Boolean bool = Boolean.FALSE;
            if (LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                str = "";
            }
            LJJIII(this, CardStruct.IStatusCode.DEFAULT, "miss_data", dspPlatform, l, bool, true, str, LJLLLL, LJZ);
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIIZZ(R.string.dtj);
            c26045AKb.LJIIJ();
            return;
        }
        if (i != -1 || (LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "EXTRA_AUTH_RESPONSE")) == null || LJJLIIIIJ.getParcelable("response") == null) {
            C93551aSh c93551aSh = new C93551aSh();
            c93551aSh.LIZ = EnumC93552aSi.EMPTY;
            LIZ = c93551aSh.LIZ();
        } else {
            Bundle LJJLIIIIJ2 = C16880lQ.LJJLIIIIJ(intent, "EXTRA_AUTH_RESPONSE");
            if (LJJLIIIIJ2 == null) {
                LIZ = null;
            } else {
                LIZ = (AuthorizationResponse) LJJLIIIIJ2.getParcelable("response");
            }
        }
        o.LJIIIIZZ(LIZ, "getResponse(resultCode, data)");
        EnumC93552aSi enumC93552aSi = LIZ.mType;
        if (enumC93552aSi == EnumC93552aSi.EMPTY) {
            String str2 = LIZ.mError;
            if (str2 == null) {
                str2 = "";
            }
            DspPlatform dspPlatform2 = DspPlatform.SPOTIFY;
            Long l3 = LJLJLLL;
            LJLJLLL = null;
            if (l3 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l3.longValue());
            }
            Boolean bool2 = Boolean.FALSE;
            if (LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                str = "";
            }
            LJJIII(this, CardStruct.IStatusCode.DEFAULT, str2, dspPlatform2, l, bool2, true, str, LJLLLL, LJZ);
            return;
        }
        if (enumC93552aSi == EnumC93552aSi.ERROR) {
            String str3 = LIZ.mError;
            if (str3 == null) {
                str3 = "";
            }
            DspPlatform dspPlatform3 = DspPlatform.SPOTIFY;
            Long l4 = LJLJLLL;
            LJLJLLL = null;
            if (l4 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l4.longValue());
            }
            Boolean bool3 = Boolean.FALSE;
            if (LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                str = "";
            }
            LJJIII(this, CardStruct.IStatusCode.DEFAULT, str3, dspPlatform3, l, bool3, true, str, LJLLLL, LJZ);
            String str4 = LIZ.mError;
            if (str4 == null || !s.LJJJLZIJ(str4, "AUTHENTICATION_DENIED_BY_USER", false)) {
                C26045AKb c26045AKb2 = new C26045AKb(activityC45651qj);
                c26045AKb2.LJIIIIZZ(R.string.dtj);
                c26045AKb2.LJIIJ();
                return;
            }
            return;
        }
        if (enumC93552aSi != EnumC93552aSi.CODE) {
            String str5 = LIZ.mError;
            if (str5 == null) {
                str5 = "";
            }
            DspPlatform dspPlatform4 = DspPlatform.SPOTIFY;
            Long l5 = LJLJLLL;
            LJLJLLL = null;
            if (l5 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l5.longValue());
            }
            Boolean bool4 = Boolean.FALSE;
            if (LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                str = "";
            }
            LJJIII(this, CardStruct.IStatusCode.DEFAULT, str5, dspPlatform4, l, bool4, true, str, LJLLLL, LJZ);
            C26045AKb c26045AKb3 = new C26045AKb(activityC45651qj);
            c26045AKb3.LJIIIIZZ(R.string.dtj);
            c26045AKb3.LJIIJ();
            return;
        }
        String str6 = LIZ.mCode;
        if (str6 == null || str6.length() == 0) {
            DspPlatform dspPlatform5 = DspPlatform.SPOTIFY;
            Long l6 = LJLJLLL;
            LJLJLLL = null;
            if (l6 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l6.longValue());
            }
            Boolean bool5 = Boolean.FALSE;
            if (LJLLILLLL != C9A8.ENTER_FROM_SETTINGS) {
                str = "";
            }
            LJJIII(this, CardStruct.IStatusCode.DEFAULT, "miss_auth_code", dspPlatform5, l, bool5, true, str, LJLLLL, LJZ);
            C26045AKb c26045AKb4 = new C26045AKb(activityC45651qj);
            c26045AKb4.LJIIIIZZ(R.string.dtj);
            c26045AKb4.LJIIJ();
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C79146V4k.LJIILIIL()), null, null, new C94881ao9(LIZ, fragment, activityC45651qj, interfaceC65784Pro, null), 3);
    }

    public static void LIZ(DspAuthParam authParam, Activity activity, boolean z, boolean z2, boolean z3, long j) {
        boolean z4;
        int value;
        Integer dspPlatform;
        String str;
        DspAuthToken dspAuthToken;
        String str2;
        o.LJIIIZ(authParam, "authParam");
        Fragment fragment = authParam.fragment;
        if (activity == null || fragment == null) {
            return;
        }
        String str3 = authParam.metaSongId;
        if (str3 == null) {
            str3 = "";
        }
        LJLLL = str3;
        LJLLLL = authParam.enterFrom;
        LJLLJ = authParam.awemeId;
        LJLLLLLL = authParam.musicId;
        LJLZ = authParam.musicVolume;
        LJZ = authParam.buttonType;
        if (!C48203Ivv.LJ(activity)) {
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIIZZ(R.string.bal);
            c26045AKb.LJIIJ();
            return;
        }
        TT2DSPSongInfo tT2DSPSongInfo = authParam.dspSongInfo;
        DspPlatform dspPlatform2 = authParam.dspPlatform;
        DspPlatform dspPlatform3 = DspPlatform.UNKNOWN;
        boolean z5 = false;
        if (dspPlatform2 != dspPlatform3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && dspPlatform2 != null) {
            value = dspPlatform2.getValue();
        } else if (tT2DSPSongInfo != null && (dspPlatform = tT2DSPSongInfo.getDspPlatform()) != null) {
            value = dspPlatform.intValue();
        } else if (LJ() == dspPlatform3) {
            return;
        } else {
            value = LJ().getValue();
        }
        DspPlatform from = DspPlatform.Companion.from(Integer.valueOf(value));
        if (tT2DSPSongInfo == null || (str = tT2DSPSongInfo.getSongId()) == null) {
            str = LJLJJL;
        }
        if (str.length() == 0) {
            if (z && !z3) {
                C26045AKb c26045AKb2 = new C26045AKb(activity);
                c26045AKb2.LJIIIZ(activity.getString(R.string.bad, from.getTitle()));
                c26045AKb2.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb2.LJII(R.attr.e8);
                c26045AKb2.LJIIJ();
                LJJIJ(activity, from, EnumC93896aYG.SELECT, null, null);
                return;
            }
            return;
        }
        DspAuthParam copy$default = DspAuthParam.copy$default(authParam, from, null, null, null, null, null, null, null, null, false, 1022, null);
        if (tT2DSPSongInfo == null || (dspAuthToken = tT2DSPSongInfo.getToken()) == null) {
            dspAuthToken = LJLJL;
        }
        DspAuthToken LJIIIZ = LJIIIZ(from, dspAuthToken);
        if (LJIIIZ == null) {
            if (z && !z3) {
                LJJIIZI(fragment, copy$default, str, z, z2, null);
                return;
            }
            return;
        }
        if (LJIILJJIL(from)) {
            LJIL(from, LJIIIZ, activity, new C94672akm(copy$default, activity, z, z3, j), new IDqS423S0100000_42(copy$default, 130));
            return;
        }
        String LIZLLL = LIZLLL(LJIIIZ);
        if (LIZLLL.length() == 0) {
            return;
        }
        if (z) {
            C93920aYe.LIZIZ = from;
            C2U8.LIZ(new C8UR(true));
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        String str4 = copy$default.metaSongId;
        if (C93922aYg.LJIJJLI == null) {
            C93922aYg.LJI();
        }
        HashSet<String> hashSet = C93922aYg.LJIJJLI;
        if (hashSet != null) {
            z5 = ORZ.LJLJJI(str4, hashSet);
        }
        XKX.LIZLLL(C48841JEv.LIZ(C79146V4k.LJIILIIL()), null, null, new C94859ann(value, j, activity, fragment, copy$default, LJIIIZ, from, str, LIZLLL, str2, null, z3, z, z2, z5), 3);
    }

    public static /* synthetic */ void LIZIZ(C94302aeo c94302aeo, DspAuthParam dspAuthParam, Activity activity, boolean z, boolean z2, int i) {
        long j;
        boolean z3 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        c94302aeo.getClass();
        LIZ(dspAuthParam, activity, z, false, z3, j);
    }

    public static void LJJIIZI(Fragment fragment, DspAuthParam dspAuthParam, String str, boolean z, boolean z2, DspAuthToken dspAuthToken) {
        TT2DSPSongInfo tT2DSPSongInfo = new TT2DSPSongInfo(Integer.valueOf(dspAuthParam.dspPlatform.getValue()), str, Boolean.TRUE, dspAuthToken, null, 16, null);
        if (dspAuthParam.isFromMusicDetail) {
            IMusicDetailService LJIJJ = MusicDetailService.LJIJJ();
            if (LJIJJ != null) {
                LJIJJ.LIZIZ(fragment, new C94680aku(tT2DSPSongInfo, fragment, dspAuthParam, str, z, z2));
                return;
            }
            return;
        }
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        if (LJJIJLIJ == null) {
            return;
        }
        LJJIJLIJ.LIZIZ(fragment, new C94681akv(tT2DSPSongInfo, fragment, dspAuthParam, str, z, z2));
    }

    public static void LIZJ(DspAuthParam authParam, String playlistTitle, Activity activity, boolean z, long j, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        Integer dspPlatform;
        o.LJIIIZ(authParam, "authParam");
        o.LJIIIZ(playlistTitle, "playlistTitle");
        if (activity == null) {
            return;
        }
        String str = authParam.metaSongId;
        if (str == null) {
            str = "";
        }
        LJLLL = str;
        LJLLLL = authParam.enterFrom;
        LJLLJ = authParam.awemeId;
        LJLLLLLL = authParam.musicId;
        LJLZ = authParam.musicVolume;
        LJZ = authParam.buttonType;
        if (!C48203Ivv.LJ(activity)) {
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIIZZ(R.string.bal);
            c26045AKb.LJIIJ();
            return;
        }
        TT2DSPSongInfo tT2DSPSongInfo = authParam.dspSongInfo;
        if (tT2DSPSongInfo != null && (dspPlatform = tT2DSPSongInfo.getDspPlatform()) != null) {
            int intValue = dspPlatform.intValue();
            String songId = tT2DSPSongInfo.getSongId();
            if (songId == null) {
                return;
            }
            DspPlatform from = DspPlatform.Companion.from(Integer.valueOf(intValue));
            DspAuthParam copy$default = DspAuthParam.copy$default(authParam, from, null, null, null, null, null, null, null, null, false, 1022, null);
            if (LJIILJJIL(from)) {
                DspAuthToken LJIIIZ = LJIIIZ(from, tT2DSPSongInfo.getToken());
                if (LJIIIZ == null) {
                    return;
                }
                LJIL(from, LJIIIZ, activity, new C94673akn(copy$default, playlistTitle, activity, j, interfaceC65784Pro, interfaceC65784Pro2), new IDqS423S0100000_42(copy$default, 131));
                return;
            }
            String LIZLLL = LIZLLL(LJIIIZ(from, tT2DSPSongInfo.getToken()));
            if (LIZLLL.length() == 0) {
                return;
            }
            XKX.LIZLLL(C48841JEv.LIZ(C79146V4k.LJIILIIL()), null, null, new C94862anq(intValue, LIZLLL, songId, playlistTitle, j, from, z, interfaceC65784Pro, activity, interfaceC65784Pro2, null), 3);
        }
    }

    public static void LJJI(String str, String str2, String str3, DspPlatform dspPlatform, boolean z, long j, String time) {
        String str4;
        o.LJIIIZ(dspPlatform, "dspPlatform");
        o.LJIIIZ(time, "time");
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", LJLLJ);
        hashMap.put("status", str);
        hashMap.put("add_tttodsp_type", str3);
        hashMap.put("time", time);
        hashMap.put("error_code", str2);
        hashMap.put("enter_from", LJLLLL);
        hashMap.put("music_id", LJLLLLLL);
        hashMap.put("music_volume", LJLZ);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_refresh_token", str4);
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("button_name", dspPlatform.getEventName());
        hashMap.put("button_type", LJZ);
        FMX.LJIIL("add_tttodsp_status", hashMap);
    }

    public static void LJJIIJ(DspAuthParam authParam, DspPlaylist dspPlaylist, Activity activity, boolean z, long j, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        Integer dspPlatform;
        String id;
        DspPlatform from;
        DspAuthToken LJIIIZ;
        o.LJIIIZ(authParam, "authParam");
        o.LJIIIZ(dspPlaylist, "dspPlaylist");
        if (activity == null) {
            return;
        }
        String str = authParam.metaSongId;
        if (str == null) {
            str = "";
        }
        LJLLL = str;
        LJLLLL = authParam.enterFrom;
        LJLLJ = authParam.awemeId;
        LJLLLLLL = authParam.musicId;
        LJLZ = authParam.musicVolume;
        LJZ = authParam.buttonType;
        if (!C48203Ivv.LJ(activity)) {
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIIZZ(R.string.bam);
            c26045AKb.LJIIJ();
            return;
        }
        TT2DSPSongInfo tT2DSPSongInfo = authParam.dspSongInfo;
        if (tT2DSPSongInfo != null && (dspPlatform = tT2DSPSongInfo.getDspPlatform()) != null) {
            int intValue = dspPlatform.intValue();
            String songId = tT2DSPSongInfo.getSongId();
            if (songId == null || (id = dspPlaylist.getId()) == null || (LJIIIZ = LJIIIZ((from = DspPlatform.Companion.from(Integer.valueOf(intValue))), tT2DSPSongInfo.getToken())) == null) {
                return;
            }
            String LIZLLL = LIZLLL(LJIIIZ);
            if (LIZLLL.length() == 0) {
                return;
            }
            DspAuthParam copy$default = DspAuthParam.copy$default(authParam, from, null, null, null, null, null, null, null, null, false, 1022, null);
            if (LJIILJJIL(from)) {
                LJIL(from, LJIIIZ, activity, new C94679akt(copy$default, dspPlaylist, activity, j, interfaceC65784Pro, interfaceC65784Pro2), new IDqS423S0100000_42(copy$default, 132));
            } else {
                XKX.LIZLLL(C48841JEv.LIZ(C79146V4k.LJIILIIL()), null, null, new C94870any(intValue, songId, id, LIZLLL, from, z, j, interfaceC65784Pro, activity, dspPlaylist, interfaceC65784Pro2, null), 3);
            }
        }
    }

    public static void LJJII(String str, String errorCode, DspPlatform dspPlatform, Long l, Boolean bool, boolean z, String str2, String str3, String str4, String isRefreshTokenEmpty) {
        String str5;
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(dspPlatform, "dspPlatform");
        o.LJIIIZ(isRefreshTokenEmpty, "isRefreshTokenEmpty");
        HashMap hashMap = new HashMap();
        hashMap.put("status", str);
        hashMap.put("error_code", errorCode);
        hashMap.put("group_id", LJLLJ);
        hashMap.put("enter_from", str3);
        hashMap.put("music_id", LJLLLLLL);
        hashMap.put("music_volume", LJLZ);
        hashMap.put("button_name", dspPlatform.getEventName());
        hashMap.put("button_type", str4);
        String str6 = "";
        if (l == null || (str5 = l.toString()) == null) {
            str5 = "";
        }
        hashMap.put("duration", str5);
        String str7 = "1";
        if (z) {
            if (o.LJ(bool, Boolean.TRUE)) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
        }
        hashMap.put("authorize_status", str6);
        if (!z) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_authorize", str7);
        hashMap.put("link_type", str2);
        hashMap.put("is_refreshtoken_empty", isRefreshTokenEmpty);
        FMX.LJIIL("authorize_tttodsp_status", hashMap);
    }

    public static /* synthetic */ void LJJIII(C94302aeo c94302aeo, String str, String str2, DspPlatform dspPlatform, Long l, Boolean bool, boolean z, String str3, String str4, String str5) {
        c94302aeo.getClass();
        LJJII(str, str2, dspPlatform, l, bool, z, str3, str4, str5, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.ActivityC45651qj r12, androidx.fragment.app.Fragment r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, X.C9A8 r21, boolean r22) {
        /*
            r11 = this;
            java.lang.String r0 = "enterFrom"
            r9 = r16
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "awemeId"
            r4 = r17
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "musicId"
            r3 = r18
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "buttonType"
            r10 = r20
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r1 = "startAuthFlowStatus"
            r0 = r21
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            r5 = r12
            if (r5 == 0) goto L29
            r6 = r13
            if (r6 != 0) goto L2a
        L29:
            return
        L2a:
            boolean r1 = X.C48203Ivv.LJ(r5)
            if (r1 != 0) goto L3f
            X.AKb r1 = new X.AKb
            r1.<init>(r5)
            r0 = 2131823255(0x7f110a97, float:1.9279305E38)
            r1.LJIIIIZZ(r0)
            r1.LJIIJ()
            return
        L3f:
            r2 = 1
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Exception -> L4b
            int r1 = X.C16880lQ.LLLLLZIL(r1, r5)     // Catch: java.lang.Exception -> L4b
            if (r1 != 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            java.lang.String r8 = ""
            if (r2 != 0) goto L73
            X.AKb r2 = new X.AKb
            r2.<init>(r5)
            r1 = 2131826766(0x7f11184e, float:1.9286426E38)
            r2.LJIIIIZZ(r1)
            r2.LJIIJ()
            java.lang.String r2 = "0"
            java.lang.String r3 = "miss_gms"
            com.ss.android.ugc.aweme.music.model.DspPlatform r4 = com.ss.android.ugc.aweme.music.model.DspPlatform.AMAZON_MUSIC
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            X.9A8 r1 = X.C9A8.ENTER_FROM_SETTINGS
            if (r0 != r1) goto L6d
            java.lang.String r8 = "link"
        L6d:
            r7 = 1
            r1 = r11
            LJJIII(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L73:
            if (r15 != 0) goto L76
            r15 = r8
        L76:
            X.C94302aeo.LJLLL = r15
            X.C94302aeo.LJLLLL = r9
            X.C94302aeo.LJLLJ = r4
            X.C94302aeo.LJLLLLLL = r3
            if (r19 != 0) goto L82
            r19 = r8
        L82:
            X.C94302aeo.LJLZ = r19
            X.C94302aeo.LJZ = r10
            X.C94302aeo.LJLLILLLL = r0
            X.C94302aeo.LJLLI = r22
            if (r14 != 0) goto Lb3
        L8c:
            X.C94302aeo.LJLJJL = r8
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            X.C94302aeo.LJLJLLL = r1
            com.ss.android.ugc.aweme.music.experiment.ThreePartyAppClientInfoConfig r1 = X.C87639YaR.LIZ()
            java.lang.String r4 = r1.amazonClientId
            com.ss.android.ugc.aweme.music.experiment.ThreePartyAppClientInfoConfig r1 = X.C87639YaR.LIZ()
            java.lang.String r3 = r1.amazonAuthRedirectUri
            X.aXs r2 = new X.aXs
            r7 = r0
            r8 = r9
            r9 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "openAmazonMusicAuthPage"
            X.C82544WaS.LIZIZ(r2, r0)
            goto L29
        Lb3:
            r8 = r14
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94302aeo.LJIJI(X.1qj, androidx.fragment.app.Fragment, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.9A8, boolean):void");
    }

    public final void LJIJJLI(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String enterFrom, String awemeId, String musicId, String str3, String buttonType, C9A8 startAuthFlowStatus, boolean z) {
        String str4;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(buttonType, "buttonType");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        if (activityC45651qj == null || fragment == null) {
            return;
        }
        if (!C48203Ivv.LJ(activityC45651qj)) {
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIIZZ(R.string.bal);
            c26045AKb.LJIIJ();
            return;
        }
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        LJLLL = str2;
        LJLLLL = enterFrom;
        LJLLJ = awemeId;
        LJLLLLLL = musicId;
        if (str3 == null) {
            str3 = "";
        }
        LJLZ = str3;
        LJZ = buttonType;
        LJLLILLLL = startAuthFlowStatus;
        LJLLI = z;
        if (str == null) {
            str = "";
        }
        LJLJJL = str;
        LJLJLLL = Long.valueOf(SystemClock.elapsedRealtime());
        C93550aSg c93550aSg = new C93550aSg(C87639YaR.LIZ().spotifyClientId, EnumC93552aSi.CODE);
        ArrayList arrayList = new ArrayList();
        int i = C87639YaR.LIZ().spotifyAuthScopes;
        int i2 = 1;
        int i3 = 32;
        while (true) {
            int i4 = i3 - 1;
            if (i3 > 0) {
                if ((i2 & i) > 0 && (str4 = C93904aYO.LIZ.get(Integer.valueOf(i2))) != null) {
                    arrayList.add(str4);
                }
                i2 <<= 1;
                i3 = i4;
            } else {
                c93550aSg.LIZLLL = (String[]) arrayList.toArray(new String[0]);
                AuthorizationRequest authorizationRequest = new AuthorizationRequest(c93550aSg.LIZ, c93550aSg.LIZIZ, c93550aSg.LIZJ, c93550aSg.LIZLLL, c93550aSg.LJ);
                Bundle bundle = new Bundle();
                bundle.putParcelable("request", authorizationRequest);
                Intent intent = new Intent(activityC45651qj, (Class<?>) LoginActivity.class);
                intent.putExtra("EXTRA_AUTH_REQUEST", bundle);
                intent.addFlags(67108864);
                try {
                    C16880lQ.LJII(fragment, intent, 3458);
                    return;
                } catch (Exception unused) {
                    C26045AKb c26045AKb2 = new C26045AKb(activityC45651qj);
                    c26045AKb2.LJIIIIZZ(R.string.dtj);
                    c26045AKb2.LJIIJ();
                    DspPlatform dspPlatform = DspPlatform.SPOTIFY;
                    Boolean bool = Boolean.FALSE;
                    if (startAuthFlowStatus == C9A8.ENTER_FROM_SETTINGS) {
                        str5 = "link";
                    }
                    LJJIII(this, CardStruct.IStatusCode.DEFAULT, "unknown_exception", dspPlatform, null, bool, true, str5, enterFrom, buttonType);
                    return;
                }
            }
        }
    }

    public static void LJIJJ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String enterFrom, String awemeId, String musicId, String str4, String buttonType, C9A8 startAuthFlowStatus, boolean z) {
        Intent intent;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(buttonType, "buttonType");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        if (activityC45651qj == null || fragment == null) {
            return;
        }
        if (!C48203Ivv.LJ(activityC45651qj)) {
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIIZZ(R.string.bal);
            c26045AKb.LJIIJ();
            return;
        }
        if (str == null) {
            return;
        }
        if (str3 == null) {
            str3 = "";
        }
        LJLLL = str3;
        LJLLLL = enterFrom;
        LJLLJ = awemeId;
        LJLLLLLL = musicId;
        if (str4 == null) {
            str4 = "";
        }
        LJLZ = str4;
        LJZ = buttonType;
        LJLLILLLL = startAuthFlowStatus;
        LJLLI = z;
        LJLJJLL = str;
        if (str2 == null) {
            str2 = "";
        }
        LJLJJL = str2;
        LJLJLLL = Long.valueOf(SystemClock.elapsedRealtime());
        HashMap hashMap = new HashMap();
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("music_to_dsp_apple_music_affiliate_token", "1000lMFY");
        o.LJIIIIZZ(LJI, "getInstance().getStringV…okenSettings::class.java)");
        hashMap.put("at", LJI);
        if (LJLILLLLZI == null) {
            LJLILLLLZI = new C93683aUp(activityC45651qj);
        }
        C93683aUp c93683aUp = LJLILLLLZI;
        if (c93683aUp == null) {
            return;
        }
        String str5 = LJLJJLL;
        Context context = c93683aUp.LIZ;
        C93679aUl c93679aUl = new C93679aUl(context, str5);
        c93679aUl.LIZ = false;
        c93679aUl.LIZIZ = activityC45651qj.getString(R.string.b_t);
        if (!hashMap.isEmpty()) {
            c93679aUl.LIZJ = hashMap;
        }
        Bundle bundle = new Bundle();
        bundle.putString("developer_token", str5);
        if (c93679aUl.LIZ) {
            intent = new Intent(context, (Class<?>) SDKUriHandlerActivity.class);
        } else {
            intent = new Intent(context, (Class<?>) StartAuthenticationActivity.class);
            if (!TextUtils.isEmpty(c93679aUl.LIZIZ)) {
                bundle.putString("custom_prompt_text", c93679aUl.LIZIZ);
            }
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("contextual_upsell_id", null);
        }
        HashMap hashMap2 = c93679aUl.LIZJ;
        if (hashMap2 != null) {
            bundle.putSerializable("custom_params", hashMap2);
        }
        intent.putExtras(bundle);
        C16880lQ.LJII(fragment, intent, 3456);
    }
}
