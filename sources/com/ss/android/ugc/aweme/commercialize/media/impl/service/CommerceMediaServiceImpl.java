package com.ss.android.ugc.aweme.commercialize.media.impl.service;

import X.ActivityC45651qj;
import X.C19N;
import X.C43264GyS;
import X.C44416Hbw;
import X.C58096Mr6;
import X.H92;
import X.H94;
import X.H95;
import X.H97;
import X.H98;
import X.H99;
import X.HDF;
import X.HDG;
import X.HDH;
import X.HKA;
import X.InterfaceC44205HWn;
import X.InterfaceC44417Hbx;
import X.NAD;
import X.NH7;
import X.XWJ;
import X.XX1;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.api.setting.CommercialMusicExperimentModel;
import com.ss.android.ugc.aweme.commercialize.media.api.viewmodel.CommerceMediaViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.CommerceSoundPageHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.banner.CommerceMusicBannerTargetPageHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.csptab.CommerceMusicTabHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.playlist.CommerceMusicPlaylistHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.search.CommerceSearchMusicHandler;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceMediaServiceImpl implements ICommerceMediaService {
    public static ICommerceMediaService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceMediaService.class, false);
        if (LIZ != null) {
            return (ICommerceMediaService) LIZ;
        }
        if (C58096Mr6.LLLLLLLZIL == null) {
            synchronized (ICommerceMediaService.class) {
                if (C58096Mr6.LLLLLLLZIL == null) {
                    C58096Mr6.LLLLLLLZIL = new CommerceMediaServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLLLLZIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LIZIZ() {
        return C19N.LJ("enable_music_legal_optimize", false);
    }

    public CommerceMediaServiceImpl() {
        H92 h92 = H92.LJLIL;
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 73);
        h92.getClass();
        H92.LJLLLLLL = aqS157S0100000_7;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LIZ() {
        return C44416Hbw.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJ() {
        InterfaceC44417Hbx LIZ;
        User currentUser;
        InterfaceC44417Hbx LIZ2 = NH7.LIZ();
        boolean z = true;
        if (LIZ2 != null && LIZ2.isChildrenMode()) {
            return false;
        }
        H92.LJLIL.getClass();
        if (!TextUtils.equals((String) H92.LJLLLL.LIZ(H92.LJLILLLLZI[11]), "change_ban_music") || (LIZ = NH7.LIZ()) == null || (currentUser = LIZ.getCurrentUser()) == null || currentUser.getAccountType() != 3 || !((Boolean) HDH.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIIIZ() {
        if (C44416Hbw.LJFF()) {
            H92 h92 = H92.LJLIL;
            if (!h92.getInCommercialSoundPage()) {
                h92.setInCommercialSoundPage(true);
            }
        }
        return H92.LJLIL.getInCommercialSoundPage();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIILIIL() {
        InterfaceC44417Hbx LIZ;
        InterfaceC44417Hbx LIZ2 = NH7.LIZ();
        if ((LIZ2 != null && LIZ2.isChildrenMode()) || (LIZ = NH7.LIZ()) == null || LIZ.getCurrentUser() == null || C44416Hbw.LJFF()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final CommercialMusicExperimentModel LJIILJJIL() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        CommercialMusicExperimentModel commercialMusicExperimentModel = HDF.LIZ;
        CommercialMusicExperimentModel commercialMusicExperimentModel2 = (CommercialMusicExperimentModel) LIZLLL.LJIIIIZZ("commerce_commercial_music_config", CommercialMusicExperimentModel.class, commercialMusicExperimentModel);
        if (commercialMusicExperimentModel2 == null) {
            return commercialMusicExperimentModel;
        }
        return commercialMusicExperimentModel2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIIZILJ() {
        return C44416Hbw.LIZLLL();
    }

    public static CommerceMediaViewModel LJIJJ(Fragment fragment) {
        return (CommerceMediaViewModel) ViewModelProviders.of(fragment).get(CommerceMediaViewModel.class);
    }

    public static CommerceMediaViewModel LJIJJLI(ActivityC45651qj activityC45651qj) {
        return (CommerceMediaViewModel) ViewModelProviders.of(activityC45651qj).get(CommerceMediaViewModel.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LIZLLL(Music music) {
        if (music == null) {
            return false;
        }
        return !music.isCommercialMusic();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final XX1 LJFF(ActivityC45651qj lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        CommerceMusicPlaylistHandler commerceMusicPlaylistHandler = LJIJJLI(lifecycleOwner).LJLILLLLZI;
        if (commerceMusicPlaylistHandler == null) {
            CommerceMusicPlaylistHandler commerceMusicPlaylistHandler2 = new CommerceMusicPlaylistHandler();
            lifecycleOwner.getLifecycle().addObserver(commerceMusicPlaylistHandler2);
            LJIJJLI(lifecycleOwner).LJLILLLLZI = commerceMusicPlaylistHandler2;
            return commerceMusicPlaylistHandler2;
        }
        return commerceMusicPlaylistHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final HDG LJI(Fragment lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        CommerceMusicTabHandler commerceMusicTabHandler = LJIJJ(lifecycleOwner).LJLJJL;
        if (commerceMusicTabHandler == null) {
            CommerceMusicTabHandler commerceMusicTabHandler2 = new CommerceMusicTabHandler();
            lifecycleOwner.getLifecycle().addObserver(commerceMusicTabHandler2);
            LJIJJ(lifecycleOwner).LJLJJL = commerceMusicTabHandler2;
            return commerceMusicTabHandler2;
        }
        return commerceMusicTabHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final void LJII(C43264GyS c43264GyS) {
        NH7.LIZ.LIZIZ(c43264GyS);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final HKA LJIIJJI(Fragment lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        CommerceSearchMusicHandler commerceSearchMusicHandler = LJIJJ(lifecycleOwner).LJLJJI;
        if (commerceSearchMusicHandler == null) {
            CommerceSearchMusicHandler commerceSearchMusicHandler2 = new CommerceSearchMusicHandler();
            lifecycleOwner.getLifecycle().addObserver(commerceSearchMusicHandler2);
            LJIJJ(lifecycleOwner).LJLJJI = commerceSearchMusicHandler2;
            return commerceSearchMusicHandler2;
        }
        return commerceSearchMusicHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final XWJ LJIIL(Fragment lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        CommerceSoundPageHandler commerceSoundPageHandler = LJIJJ(lifecycleOwner).LJLIL;
        if (commerceSoundPageHandler == null) {
            CommerceSoundPageHandler commerceSoundPageHandler2 = new CommerceSoundPageHandler();
            lifecycleOwner.getLifecycle().addObserver(commerceSoundPageHandler2);
            LJIJJ(lifecycleOwner).LJLIL = commerceSoundPageHandler2;
            return commerceSoundPageHandler2;
        }
        return commerceSoundPageHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final InterfaceC44205HWn LJIILL(ActivityC45651qj lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        CommerceMusicBannerTargetPageHandler commerceMusicBannerTargetPageHandler = LJIJJLI(lifecycleOwner).LJLJI;
        if (commerceMusicBannerTargetPageHandler == null) {
            CommerceMusicBannerTargetPageHandler commerceMusicBannerTargetPageHandler2 = new CommerceMusicBannerTargetPageHandler();
            lifecycleOwner.getLifecycle().addObserver(commerceMusicBannerTargetPageHandler2);
            LJIJJLI(lifecycleOwner).LJLJI = commerceMusicBannerTargetPageHandler2;
            return commerceMusicBannerTargetPageHandler2;
        }
        return commerceMusicBannerTargetPageHandler;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIILLIIL(Music music) {
        if (!C44416Hbw.LIZLLL() || music == null || !(!music.isCommercialMusic())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final boolean LJIJ(Music music) {
        if (music != null && (music.isCommercialMusic() || music.isOriginalSound())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final NAD LJIJI(Fragment fragment) {
        return new NAD();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final MusicModel.FromSection LJIIJ(MusicModel musicModel, boolean z) {
        return LJIIIIZZ(musicModel, z, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    public final MusicModel.FromSection LJIIIIZZ(MusicModel musicModel, boolean z, boolean z2) {
        if (musicModel == null) {
            return MusicModel.FromSection.NO_MUSIC;
        }
        if (!H92.LJLIL.getInCommercialSoundPage()) {
            return MusicModel.FromSection.OTHER;
        }
        H97 LIZJ = H92.LIZJ();
        if (LIZJ instanceof H94) {
            if (((H94) LIZJ).LIZJ != null || o.LJ(H92.LIZIZ(), Banner.BannerSchemaType.AI_RECOMMEND_PLAYLIST.mobValue)) {
                return MusicModel.FromSection.CSP_BANNER;
            }
            if (z) {
                return MusicModel.FromSection.CSP_RECOMMENDED;
            }
            if (z2) {
                return MusicModel.FromSection.CSP_VIEW_ALL_UNFOLDED_PLAYLIST;
            }
            return MusicModel.FromSection.CSP_PLAYLISTS;
        }
        if (LIZJ instanceof H95) {
            if (((H95) LIZJ).LIZ) {
                return MusicModel.FromSection.FAVORITE;
            }
            if (z) {
                return MusicModel.FromSection.CSP_RECOMMENDED;
            }
            return MusicModel.FromSection.CSP_UNFOLDED_PLAYLISTS;
        }
        if (LIZJ instanceof H98) {
            if (((H98) LIZJ).LIZ != null) {
                return MusicModel.FromSection.CSP_BANNER;
            }
            return MusicModel.FromSection.OTHER;
        }
        if (LIZJ instanceof H99) {
            return MusicModel.FromSection.SEARCH;
        }
        return MusicModel.FromSection.OTHER;
    }
}
