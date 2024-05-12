package com.ss.android.ugc.aweme.music.app.auth.service;

import X.ASL;
import X.ActivityC45651qj;
import X.C2PV;
import X.C2PW;
import X.C51937KZx;
import X.C53205KuP;
import X.C53206KuQ;
import X.C61878OQg;
import X.C93922aYg;
import X.C94001aZx;
import X.C94302aeo;
import X.C9A8;
import X.DialogInterfaceOnDismissListenerC93575aT5;
import X.EF7;
import X.HG3;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.RBX;
import X.RBY;
import X.SU4;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SongVideoShownRecord;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetDialogFragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.service.IMusicAppAuthService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicAppAuthServiceImpl implements IMusicAppAuthService {
    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZJ() {
        if (C2PW.LIZ()) {
            Keva keva = C93922aYg.LIZ;
            if (!keva.getBoolean("reset_flag_spotify", false)) {
                keva.storeBoolean("reset_flag_spotify", true);
                C93922aYg.LJIIIZ(0);
                keva.erase("large_button_show_time");
                keva.erase("all_button_show_time_before_auth");
                keva.erase("all_button_show_time");
                keva.erase("saved_songs");
                keva.erase("song_video_show_record");
                C93922aYg.LJIILIIL = -1;
                C93922aYg.LJIILJJIL = new HashSet<>();
                C93922aYg.LJIILL = -1;
                C93922aYg.LJIILLIIL = new HashSet<>();
                C93922aYg.LJIIZILJ = -1;
                C93922aYg.LJIJ = new HashSet<>();
                C93922aYg.LJIJJLI = new HashSet<>();
                C93922aYg.LJIL = new HashMap<>();
                C93922aYg.LJJ = new HashSet<>();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJFF() {
        if ((!C2PV.LIZ() && !C2PW.LIZ()) || !((RBX) HG3.LJIILL()).isLogin() || ((RBY) HG3.LJIILL()).isChildrenMode() || CommerceMediaServiceImpl.LIZJ().LJIIZILJ()) {
            return false;
        }
        DspPlatform[] values = DspPlatform.values();
        ArrayList arrayList = new ArrayList();
        for (DspPlatform dspPlatform : values) {
            if (dspPlatform.getSupport()) {
                arrayList.add(dspPlatform);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C94302aeo.LJII((DspPlatform) next, EF7.LIZIZ())) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZ(String str) {
        if (!C93922aYg.LJIILJJIL.contains(str)) {
            C93922aYg.LJIILJJIL.add(str);
            if (!C53205KuP.LIZ()) {
                if (C93922aYg.LJIILIIL == -1) {
                    int i = C93922aYg.LIZ.getInt("large_button_show_time", 0);
                    C93922aYg.LJIILIIL = i;
                    C93922aYg.LJIILIIL = i;
                }
                int i2 = C93922aYg.LJIILIIL + 1;
                C93922aYg.LJIILIIL = i2;
                C93922aYg.LIZ.storeInt("large_button_show_time", i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LIZLLL(Music music) {
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        if (music == null || (tT2DSPSongInfos = music.getTT2DSPSongInfos()) == null || !C94302aeo.LJJIIJZLJL() || !C94302aeo.LJIILL(tT2DSPSongInfos) || !C94302aeo.LJFF(music, false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final DspPlatform LJI(Music music) {
        return C94302aeo.LJIIIIZZ(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJII(ReportData reportData) {
        C94001aZx.LIZ(reportData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final String LJIIIZ(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        return C93922aYg.LIZLLL(dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIZILJ(String str) {
        if (!C93922aYg.LJIILLIIL.contains(str)) {
            C93922aYg.LJIILLIIL.add(str);
            if (!C53205KuP.LIZ()) {
                if (C93922aYg.LJIILL == -1) {
                    int i = C93922aYg.LIZ.getInt("all_button_show_time_before_auth", 0);
                    C93922aYg.LJIILL = i;
                    C93922aYg.LJIILL = i;
                }
                int i2 = C93922aYg.LJIILL + 1;
                C93922aYg.LJIILL = i2;
                C93922aYg.LIZ.storeInt("all_button_show_time_before_auth", i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIJJI(String str, String str2) {
        if ((C51937KZx.LIZ() || C53205KuP.LIZ()) && str != null && str.length() != 0 && !C93922aYg.LJJ.contains(str2)) {
            C93922aYg.LJJ.add(str2);
            if (C93922aYg.LJIL == null) {
                C93922aYg.LJII();
            }
            HashMap<String, SongVideoShownRecord> hashMap = C93922aYg.LJIL;
            if (hashMap != null) {
                SongVideoShownRecord songVideoShownRecord = hashMap.get(str);
                if (songVideoShownRecord == null) {
                    hashMap.put(str, new SongVideoShownRecord(str, Long.valueOf(C93922aYg.LIZJ()), 1));
                } else {
                    Long l = songVideoShownRecord.lastShowTimestamp;
                    if (l != null) {
                        if (SU4.LIZLLL(l.longValue())) {
                            songVideoShownRecord.showTimes++;
                        } else {
                            songVideoShownRecord.showTimes = 1;
                        }
                    } else {
                        songVideoShownRecord.showTimes = 1;
                    }
                    songVideoShownRecord.lastShowTimestamp = Long.valueOf(C93922aYg.LIZJ());
                }
                if (C51937KZx.LIZ()) {
                    C93922aYg.LIZ.storeString("song_video_show_record", GsonProtectorUtils.toJson((Gson) C93922aYg.LIZIZ.getValue(), hashMap));
                }
            }
        }
        if (!C93922aYg.LJIJ.contains(str2)) {
            C93922aYg.LJIJ.add(str2);
            if (!C53205KuP.LIZ()) {
                if (C93922aYg.LJIIZILJ == -1) {
                    C93922aYg.LJIIZILJ = C93922aYg.LIZIZ();
                }
                C93922aYg.LJIIZILJ++;
                long j = C93922aYg.LJIJJ;
                if (j == -1) {
                    j = C93922aYg.LIZ.getLong("last_all_button_show_date", 0L);
                    C93922aYg.LJIJJ = j;
                }
                if (SU4.LIZLLL(j)) {
                    int i = C93922aYg.LJIJI + 1;
                    C93922aYg.LJIJI = i;
                    C93922aYg.LIZ.storeInt("all_button_show_time_per_day", i);
                } else {
                    C93922aYg.LJIIIZ(1);
                }
                C93922aYg.LIZ.storeInt("all_button_show_time", C93922aYg.LJIIZILJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJIIL(Music music, String str) {
        return C94302aeo.LJJIIZ(music, str, false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILIIL(DspAuthParam dspAuthParam, ActivityC45651qj activityC45651qj) {
        C94302aeo.LIZIZ(C94302aeo.LJLIL, dspAuthParam, activityC45651qj, false, false, 56);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJIILL(Music music, String str, boolean z) {
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        int i;
        if (music == null || (tT2DSPSongInfos = music.getTT2DSPSongInfos()) == null || !C94302aeo.LJJIIJZLJL() || C94302aeo.LJJIIZ(music, str, true)) {
            return false;
        }
        if (!C53205KuP.LIZ() && !ORZ.LJLJJI(str, C93922aYg.LJIJ)) {
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
            if (C94302aeo.LJIIIIZZ(music) == DspPlatform.UNKNOWN) {
                int i2 = C93922aYg.LJIILL;
                if (i2 == -1) {
                    i2 = C93922aYg.LIZ.getInt("all_button_show_time_before_auth", 0);
                    C93922aYg.LJIILL = i2;
                }
                int i3 = C53206KuQ.LIZJ().addToDspEntranceDisplaysBeforeAuth;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 >= i3) {
                    return false;
                }
            }
        }
        if (C94302aeo.LJIILIIL(music, str) || !C94302aeo.LJIILL(tT2DSPSongInfos) || !C94302aeo.LJFF(music, z)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIIIZZ(Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        C94302aeo.LJLIL.LJIILLIIL(intent, activityC45651qj, fragment, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILLIIL(int i, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        C94302aeo.LJLIL.LJIJ(i, intent, activityC45651qj, fragment, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJ(int i, int i2, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        C94302aeo.LJLIL.LJIIZILJ(intent, activityC45651qj, fragment, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIJ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String awemeId, String str4, String str5, String str6, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        C94302aeo.LJLIL.LJIJI(activityC45651qj, fragment, str, str2, str3, awemeId, str4, str5, str6, startAuthFlowStatus, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILJJIL(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String awemeId, String str4, String str5, String str6, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        C94302aeo.LJLIL.LJIJJLI(activityC45651qj, fragment, str, str2, str3, awemeId, str4, str5, str6, startAuthFlowStatus, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String str4, String awemeId, String str5, String str6, String str7, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        C94302aeo.LJIJJ(activityC45651qj, fragment, str, str2, str3, str4, awemeId, str5, str6, str7, startAuthFlowStatus, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIJ(String str, String enterFrom, String str2, String str3, String str4, String buttonType, FragmentManager fragmentManager, Fragment fragment, Music music, TT2DSPSongInfo tT2DSPSongInfo, boolean z, boolean z2) {
        List<TT2DSPSongInfo> list;
        String str5 = str2;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(buttonType, "buttonType");
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        if (str3 != null) {
            str6 = str3;
        }
        MusicDspSheetDialogFragment.LJLLJ.getClass();
        if (music != null) {
            list = music.getTT2DSPSongInfos();
        } else {
            list = null;
        }
        if (!z) {
            if (list == null) {
                return;
            }
        } else if (tT2DSPSongInfo == null) {
            return;
        }
        ASL asl = new ASL();
        MusicDspSheetDialogFragment musicDspSheetDialogFragment = new MusicDspSheetDialogFragment();
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        Bundle bundle = new Bundle();
        bundle.putString("meta_song_id", str);
        bundle.putString("enter_from", enterFrom);
        bundle.putString("video_id", str5);
        bundle.putString("id", str6);
        bundle.putString("music_volume", str4);
        bundle.putString("tt_to_dsp_button_type", buttonType);
        bundle.putBoolean("is_dsp_already_auth", z);
        bundle.putSerializable("tt_to_dsp_song_infos", new ArrayList(list));
        bundle.putSerializable("linked_dsp_song_info", tT2DSPSongInfo);
        bundle.putBoolean("is_dsp_auth_from_music_detail", z2);
        musicDspSheetDialogFragment.setArguments(bundle);
        musicDspSheetDialogFragment.LJLLI = fragment;
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = musicDspSheetDialogFragment;
        tuxSheet.LJLILLLLZI = new DialogInterfaceOnDismissListenerC93575aT5(z, fragment, str, enterFrom, str5, str6, str4, buttonType, z2);
        asl.LJI(0);
        asl.LJFF(4);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJZI = false;
        tuxSheet2.LJLLJ = true;
        tuxSheet2.show(fragmentManager, "MusicDspSheetDialogFragment");
    }
}
