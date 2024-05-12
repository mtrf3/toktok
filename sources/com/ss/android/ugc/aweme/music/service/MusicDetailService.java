package com.ss.android.ugc.aweme.music.service;

import X.AKT;
import X.ASL;
import X.ActivityC45651qj;
import X.C00F;
import X.C16880lQ;
import X.C208158Ex;
import X.C221108m2;
import X.C25685A6f;
import X.C2VQ;
import X.C45243HpH;
import X.C47959Irz;
import X.C48841JEv;
import X.C55096Ljo;
import X.C55230Lly;
import X.C58096Mr6;
import X.C58677N1d;
import X.C60996Nwm;
import X.C62822Ol8;
import X.C73969T1h;
import X.C76800UCe;
import X.C78939UyV;
import X.C7MY;
import X.EF7;
import X.FMX;
import X.HH1;
import X.InterfaceC48038ItG;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.ORY;
import X.SU0;
import X.SU4;
import X.SU9;
import X.SVF;
import X.SVH;
import X.T16;
import Y.AfS21S1000000_8;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.ui.brand.TTMSheetDialogFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.ab.NewReleaseMusicConfigModel;
import com.ss.android.ugc.aweme.music.model.DspImageUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.TTMBrand;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.ss.android.ugc.aweme.music.model.TTMLink;
import com.ss.android.ugc.aweme.music.model.TTMMusicInfo;
import com.ss.android.ugc.aweme.music.model.TTMTrack;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.music.v2.assem.ShootContainerProviderAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS50S1000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicDetailService implements IMusicDetailService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58677N1d.LJLIL);

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIIZILJ() {
    }

    public static IMusicDetailService LJIJJ() {
        Object LIZ = C58096Mr6.LIZ(IMusicDetailService.class, false);
        if (LIZ != null) {
            return (IMusicDetailService) LIZ;
        }
        if (C58096Mr6.g3 == null) {
            synchronized (IMusicDetailService.class) {
                if (C58096Mr6.g3 == null) {
                    C58096Mr6.g3 = new MusicDetailService();
                }
            }
        }
        return C58096Mr6.g3;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final int LJIIL() {
        return ((NewReleaseMusicConfigModel) SU0.LIZIZ.getValue()).getFeedRecordAnimationStartTimes();
    }

    public final Keva LJIJJLI() {
        return (Keva) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LIZJ(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        SVF.LJ(SVF.LJIIJ, musicId, new AqS50S1000000_12(musicId, 5));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJI(Aweme aweme) {
        if (aweme != null) {
            C2VQ.LIZ(new AqS159S0200000_12(this, aweme, 33));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final MusicDetailFragment LJIIIIZZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            MusicDetailFragment musicDetailFragment = new MusicDetailFragment();
            musicDetailFragment.setArguments(LLJJIJI);
            return musicDetailFragment;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final boolean LJIIJ(Aweme aweme) {
        Music music;
        MusicReleaseInfo musicReleaseInfo;
        String[] strArr;
        Keva LJIJJLI;
        IUserService createIUserServicebyMonsterPlugin;
        User currentUser;
        if ((C00F.LIZ(31744, 0, "show_music_new_release_tag", true) != 1 && ((createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false)) == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getShowArtistPlaylist() != 1)) || aweme.getMusic() == null || (music = aweme.getMusic()) == null || (musicReleaseInfo = music.getMusicReleaseInfo()) == null || !musicReleaseInfo.isNewReleaseSong()) {
            return false;
        }
        int feedMusicTitleShowTimes = ((NewReleaseMusicConfigModel) SU0.LIZIZ.getValue()).getFeedMusicTitleShowTimes();
        Keva LJIJJLI2 = LJIJJLI();
        long j = -1;
        if (LJIJJLI2 != null) {
            j = LJIJJLI2.getLong("feed_music_title_show_day", -1L);
        }
        if (!SU4.LIZLLL(j) || (LJIJJLI = LJIJJLI()) == null || (strArr = LJIJJLI.getStringArray("feed_music_title_show_times", new String[0])) == null) {
            strArr = new String[0];
        }
        if (feedMusicTitleShowTimes >= 0 && strArr.length >= feedMusicTitleShowTimes && !ORY.LJJIJIIJIL(aweme.getAid(), strArr)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIILL(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        SVF.LJ(SVF.LJIIJJI, musicId, new AqS50S1000000_12(musicId, 4));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final MusicInfo LJIJI(Aweme aweme) {
        TTMInfo ttmInfo;
        TTMMusicInfo tTMMusicInfo;
        Integer product;
        TTMTrack track;
        long j;
        String str;
        TTMLink link;
        TTMTrack track2;
        String id;
        long j2;
        String str2;
        String str3;
        String str4;
        boolean z;
        TTMBrand brand;
        TTMBrand brand2;
        Map<String, String> map = null;
        if (aweme == null || (ttmInfo = aweme.getTtmInfo()) == null) {
            return null;
        }
        Music music = aweme.getMusic();
        if (music != null) {
            tTMMusicInfo = music.getTtmInfo();
        } else {
            tTMMusicInfo = null;
        }
        TTMBrand brand3 = ttmInfo.getBrand();
        if (brand3 == null || !brand3.isInExp() || (product = ttmInfo.getProduct()) == null || product.intValue() == 0) {
            return null;
        }
        if ((!ttmInfo.isTtm() || (((brand = ttmInfo.getBrand()) != null && brand.getSubscribed()) || ((brand2 = ttmInfo.getBrand()) != null && brand2.isOn()))) && tTMMusicInfo != null && (track = tTMMusicInfo.getTrack()) != null) {
            String name = track.getName();
            String str5 = "";
            if (name == null) {
                name = "";
            }
            String artistName = track.getArtistName();
            if (artistName == null) {
                artistName = "";
            }
            DspImageUrlModel dspImageUrlMode = DspImageUrlModel.Companion.toDspImageUrlMode(C78939UyV.LJ(track.getCoverMedium()));
            Long duration = track.getDuration();
            if (duration != null) {
                j = duration.longValue();
            } else {
                j = -1;
            }
            TTMBrand brand4 = ttmInfo.getBrand();
            if (brand4 == null || (str = brand4.getEntrance()) == null) {
                str = "";
            }
            TTMBrand brand5 = ttmInfo.getBrand();
            if (brand5 != null && (link = brand5.getLink()) != null && (track2 = tTMMusicInfo.getTrack()) != null && (id = track2.getId()) != null) {
                Music music2 = aweme.getMusic();
                if (music2 != null) {
                    j2 = music2.getId();
                } else {
                    j2 = 0;
                }
                String valueOf = String.valueOf(j2);
                String requestId = aweme.getRequestId();
                if (requestId == null) {
                    requestId = "";
                }
                String aid = aweme.getAid();
                if (aid != null) {
                    str5 = aid;
                }
                Integer product2 = ttmInfo.getProduct();
                TTMBrand brand6 = ttmInfo.getBrand();
                if (brand6 != null) {
                    str2 = brand6.getTitle();
                } else {
                    str2 = null;
                }
                TTMBrand brand7 = ttmInfo.getBrand();
                if (brand7 != null) {
                    str3 = brand7.getSubtitle();
                } else {
                    str3 = null;
                }
                TTMBrand brand8 = ttmInfo.getBrand();
                if (brand8 != null) {
                    str4 = brand8.getButtonText();
                } else {
                    str4 = null;
                }
                Music music3 = aweme.getMusic();
                if (music3 != null) {
                    map = music3.getLogExtraMap();
                }
                Music music4 = aweme.getMusic();
                if (music4 != null) {
                    z = music4.isPgc();
                } else {
                    z = false;
                }
                return new MusicInfo(name, artistName, dspImageUrlMode, j, str, link, null, id, valueOf, requestId, str5, product2, str2, str3, str4, map, z, 64, null);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LIZIZ(Fragment fragment, InterfaceC88472Yns<? super AKT, C76800UCe> interfaceC88472Yns) {
        int LIZJ;
        int LIZIZ;
        ShootContainerProviderAbility shootContainerProviderAbility;
        o.LJIIIZ(fragment, "fragment");
        View view = null;
        if ((fragment instanceof MusicDetailFragment) && (shootContainerProviderAbility = (ShootContainerProviderAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), ShootContainerProviderAbility.class, null)) != null) {
            view = shootContainerProviderAbility.vd0();
        }
        int LIZJ2 = C60996Nwm.LIZJ(fragment.getContext());
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        boolean z = true;
        int i = iArr[1];
        if (i > 0) {
            LIZJ = LIZJ2 - i;
        } else {
            LIZJ = C47959Irz.LIZJ(62, C7MY.LIZIZ(32));
        }
        if (view == null || view.getVisibility() != 0) {
            z = false;
        }
        if (z) {
            LIZIZ = C47959Irz.LIZJ(4, LIZJ);
        } else {
            LIZIZ = C7MY.LIZIZ(36);
        }
        AKT akt = new AKT(fragment);
        akt.LJ(R.style.ux);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLILLLLZI = 4;
        c208158Ex.LJLJL = LIZIZ;
        interfaceC88472Yns.invoke(akt);
        akt.LJII();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LIZLLL(String musicId, String str) {
        o.LJIIIZ(musicId, "musicId");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = SVF.LJ;
        Boolean bool = concurrentHashMap.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            return;
        }
        concurrentHashMap.put(str, bool2);
        SVF.LIZJ(musicId, SVH.DSP_ACTION_SHOW).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new InterfaceC48038ItG() { // from class: X.2aS
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                BaseResponse it = (BaseResponse) obj;
                o.LJIIIZ(it, "it");
                if (it.status_code == 0) {
                    return C76800UCe.LIZ;
                }
                throw new RuntimeException("server error");
            }
        }).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9EF
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new AfS21S1000000_8(str, 4));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJ(String musicId, String str) {
        o.LJIIIZ(musicId, "musicId");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = SVF.LJFF;
        Boolean bool = concurrentHashMap.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            return;
        }
        concurrentHashMap.put(str, bool2);
        SVF.LIZJ(musicId, SVH.DSP_ACTION_CLICK).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(C48841JEv.LJLJJI).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9EE
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new AfS21S1000000_8(str, 3));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIILIIL(LifecycleOwner owner, ActivityC45651qj activityC45651qj, MusicModel musicModel, String str, String str2) {
        o.LJIIIZ(owner, "owner");
        MusicRecordService musicRecordService = new MusicRecordService();
        Boolean bool = Boolean.TRUE;
        musicRecordService.startRecord(owner, activityC45651qj, musicModel, "", "", null, 0, true, "", 2, "single_song", "single_song", str, bool, "feature_video_page", Boolean.FALSE, bool, str2, "feature_video_page", null);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIJ(FragmentManager fragmentManager, MusicInfo musicInfo, String str, String str2, String str3) {
        ASL asl = new ASL();
        TTMSheetDialogFragment tTMSheetDialogFragment = new TTMSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("arg_music_info", musicInfo);
        bundle.putString("arg_enter_from", str);
        bundle.putString("arg_enter_method", str2);
        bundle.putString("arg_upsell_reason", str3);
        tTMSheetDialogFragment.setArguments(bundle);
        asl.LIZ.LJLLILLLL = tTMSheetDialogFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLJ = true;
        tuxSheet.show(fragmentManager, "TTMusicBrand");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIILJJIL(String str, String str2, String str3, String str4, Map map, boolean z) {
        String str5;
        HH1.LIZ(str, "musicId", str2, "songId", str4, "requestId");
        HashMap LIZ = C45243HpH.LIZ("button_name", "brand_icon", "group_id", str3);
        LIZ.put("music_from", "ttm");
        LIZ.put("music_id", str);
        LIZ.put("song_id", str2);
        LIZ.put("request_id", str4);
        if (map != null) {
            LIZ.putAll(map);
        }
        if (C25685A6f.LIZ(EF7.LIZIZ())) {
            str5 = "other_app";
        } else {
            str5 = "brand_pop_up";
        }
        LIZ.put("show_type", str5);
        SU9.LIZ(LIZ, z);
        FMX.LJIIL("show_copyright_music", LIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJIILLIIL(String str, String str2, String str3, String str4, Map map, boolean z) {
        String str5;
        HH1.LIZ(str, "musicId", str2, "songId", str4, "requestId");
        HashMap LIZ = C45243HpH.LIZ("button_name", "brand_icon", "group_id", str3);
        LIZ.put("music_from", "ttm");
        LIZ.put("music_id", str);
        LIZ.put("song_id", str2);
        LIZ.put("request_id", str4);
        if (map != null) {
            LIZ.putAll(map);
        }
        if (C25685A6f.LIZ(EF7.LIZIZ())) {
            str5 = "other_app";
        } else {
            str5 = "brand_pop_up";
        }
        LIZ.put("show_type", str5);
        SU9.LIZ(LIZ, z);
        FMX.LJIIL("click_copyright_music", LIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicDetailService
    public final void LJFF(LifecycleOwner owner, Activity activity, MusicModel musicModel, String str, String str2, int i, boolean z, String str3, String str4, boolean z2, String str5, String str6) {
        o.LJIIIZ(owner, "owner");
        new MusicRecordService().startRecord(owner, activity, musicModel, str, str2, null, i, z, "", 2, "single_song", "single_song", str3, Boolean.TRUE, str4, Boolean.valueOf(z2), Boolean.FALSE, str5, str6, null);
    }
}
