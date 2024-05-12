package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C30869C9p;
import X.C38352F3k;
import X.C45116HnE;
import X.C56548MHg;
import X.C58096Mr6;
import X.C66591QBn;
import X.C6D8;
import X.C72834SiE;
import X.C84887XTf;
import X.C84906XTy;
import X.InterfaceC45118HnG;
import X.InterfaceC56551MHj;
import X.InterfaceC84898XTq;
import X.InterfaceC84899XTr;
import X.InterfaceC84907XTz;
import X.X1D;
import X.XPS;
import X.XVF;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance;
import com.ss.android.ugc.aweme.kids.component.music.KidsMusicEntrance;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.DraftMusicAdapter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public class MusicService implements IMusicService {
    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public UrlModel getMusicModelAudioTrack(Object obj) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public String getCacheDir() {
        XPS LIZLLL = XPS.LIZLLL();
        if (LIZLLL.LIZIZ == null) {
            LIZLLL.LJ();
        }
        return LIZLLL.LIZIZ.getPath();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public String getDownloadDir() {
        return XPS.LIZLLL().LIZ();
    }

    public static IMusicService createIMusicServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IMusicService.class, z);
        if (LIZ != null) {
            return (IMusicService) LIZ;
        }
        if (C58096Mr6.Q5 == null) {
            synchronized (IMusicService.class) {
                if (C58096Mr6.Q5 == null) {
                    C58096Mr6.Q5 = new MusicService();
                }
            }
        }
        return C58096Mr6.Q5;
    }

    public InterfaceC84898XTq createMusicChoicesPresenter(InterfaceC84899XTr interfaceC84899XTr) {
        final C45116HnE c45116HnE = new C45116HnE();
        c45116HnE.LJJ(new MusicListModel());
        c45116HnE.LJLILLLLZI = new InterfaceC45118HnG(interfaceC84899XTr) { // from class: com.ss.android.ugc.aweme.services.MusicService.2
            public final /* synthetic */ InterfaceC84899XTr val$view;

            @Override // X.InterfaceC45118HnG
            public void onGetMusicFailed(Exception exc, String str) {
            }

            @Override // X.InterfaceC45118HnG
            public void onGetMusicSuccess(MusicList musicList, String str) {
            }
        };
        return new InterfaceC84898XTq() { // from class: com.ss.android.ugc.aweme.services.MusicService.3
            public void onDestroy() {
                c45116HnE.LIZIZ();
            }

            public boolean sendRequest(Object... objArr) {
                return c45116HnE.LJIILL(objArr);
            }
        };
    }

    public AVMusic getMusicModelAVMusic(Object obj) {
        if (obj != null) {
            return AVExternalServiceImpl.LIZ().aVTransformModelService().transformMusicModel((MusicModel) obj);
        }
        return null;
    }

    public int getMusicModelDuration(Object obj) {
        return ((MusicModel) obj).getDuration();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public String getRhythmMusicFilePath(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C66591QBn.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C38352F3k.LIZJ(str));
        LIZ2.append(".json");
        LIZ.append(X1D.LIZIZ(LIZ2));
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public boolean isMusicTypeLocal(int i) {
        if (MusicModel.MusicType.LOCAL_SCAN.ordinal() == i || i == MusicModel.MusicType.VIDEO_EXTRACT.ordinal() || i == MusicModel.MusicType.SPEECH_MUSIC.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public AVMusic transformNewAVMusic(String str) {
        return DraftMusicAdapter.INSTANCE.transformNewAVMusic(str);
    }

    private Music createLocalMusic(MusicModel musicModel, String str) {
        musicModel.setLocalPath(str);
        Music convertToMusic = musicModel.convertToMusic();
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        convertToMusic.setPlayUrl(urlModel);
        return convertToMusic;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public void requestMusic(String str, final InterfaceC84907XTz interfaceC84907XTz) {
        C56548MHg c56548MHg = new C56548MHg();
        c56548MHg.LJLILLLLZI = new InterfaceC56551MHj() { // from class: com.ss.android.ugc.aweme.services.MusicService.1
            public void onLoadTerminatedUserPage() {
                if (interfaceC84907XTz != null) {
                    interfaceC84907XTz.LIZ(new RuntimeException("music should not be null"));
                }
            }

            @Override // X.InterfaceC56551MHj
            public void onLoadMusicDetailFail(Exception exc) {
                InterfaceC84907XTz interfaceC84907XTz2 = interfaceC84907XTz;
                if (interfaceC84907XTz2 != null) {
                    interfaceC84907XTz2.LIZ(exc);
                }
            }

            @Override // X.InterfaceC56551MHj
            public void onLoadMusicDetailSuccess(MusicDetail musicDetail) {
                AVMusic aVMusic;
                InterfaceC84907XTz interfaceC84907XTz2 = interfaceC84907XTz;
                if (interfaceC84907XTz2 != null) {
                    if (musicDetail.music != null) {
                        aVMusic = AVExternalServiceImpl.LIZ().aVTransformModelService().transformMusicModel(musicDetail.music.convertToMusicModel());
                    } else {
                        aVMusic = null;
                    }
                    interfaceC84907XTz2.LIZIZ(aVMusic);
                }
            }
        };
        c56548MHg.LJIILL(str, 0);
    }

    public void setMusicModelDuration(Object obj, int i) {
        ((MusicModel) obj).setDuration(i);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public boolean checkValidMusic(AVMusic aVMusic, Context context, boolean z) {
        if (aVMusic != null && (TextUtils.isEmpty(aVMusic.getPath()) || aVMusic.getMusicStatus() == 0)) {
            String offlineDesc = aVMusic.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(R.string.iia);
            }
            if (z) {
                C30869C9p.LIZIZ(context, offlineDesc);
            }
            return false;
        }
        return true;
    }

    public Pair<AVMusic, String> parseOnActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "path");
            MusicModel musicModel = (MusicModel) intent.getSerializableExtra("music_model");
            if (musicModel != null) {
                if (musicModel.isLocalMusic()) {
                    return Pair.create(AVExternalServiceImpl.LIZ().aVTransformModelService().transformMusicModel(createLocalMusic(musicModel, LLJJIJIIJIL).convertToMusicModel()), LLJJIJIIJIL);
                }
                return Pair.create(AVExternalServiceImpl.LIZ().aVTransformModelService().transformMusicModel(musicModel), LLJJIJIIJIL);
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IMusicService
    public void openChooseMusicPage(Fragment fragment, int i, String str, int i2, MusicModel musicModel, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, String str4, int i3, UrlModel urlModel, String str5, String str6, boolean z7) {
        IKidsMusicEntrance iKidsMusicEntrance;
        if (C6D8.LIZLLL()) {
            Object LIZ = C58096Mr6.LIZ(IKidsMusicEntrance.class, false);
            if (LIZ != null) {
                iKidsMusicEntrance = (IKidsMusicEntrance) LIZ;
            } else {
                if (C58096Mr6.H1 == null) {
                    synchronized (IKidsMusicEntrance.class) {
                        if (C58096Mr6.H1 == null) {
                            C58096Mr6.H1 = new KidsMusicEntrance();
                        }
                    }
                }
                iKidsMusicEntrance = C58096Mr6.H1;
            }
            iKidsMusicEntrance.LIZ(fragment, i, str, i2, musicModel, z, z2, bundle, str2, str3, z3, z4);
            return;
        }
        if (C84887XTf.LIZ()) {
            C72834SiE.LIZ();
        }
        C84906XTy c84906XTy = new C84906XTy(str, i2, musicModel, z, z2, bundle, str2, str3, z3, z4, z5, z6, str4, urlModel, i3, str5, str6, z7);
        if (i2 == 2) {
            XVF.LJIILLIIL("video_shoot_page");
        } else {
            XVF.LJIILLIIL("video_edit_page");
        }
        XVF.LJII = str5;
        XVF.LJIIIIZZ = str6;
        String string = fragment.getString(R.string.cqe);
        if (CommerceMediaServiceImpl.LIZJ().LIZ()) {
            string = fragment.getString(R.string.ig6);
        }
        c84906XTy.LIZ = string;
        SmartRoute buildRoute = SmartRouter.buildRoute(fragment.getContext(), "//choosemusic/home");
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        AVChallenge curChallenge = AVExternalServiceImpl.LIZ().publishService().getCurChallenge();
        if (curChallenge != null) {
            buildRoute.withParam("challenge", curChallenge.cid);
        }
        if (musicModel != null) {
            buildRoute.withParam("music_model", musicModel);
        }
        buildRoute.withParam("title", c84906XTy.LIZ);
        buildRoute.withParam("music_allow_clear", z);
        buildRoute.withParam("music_allow_cut", z6);
        buildRoute.withParam("music_is_photomv", z2);
        buildRoute.withParam("creation_id", str3);
        buildRoute.withParam("shoot_way", str2);
        buildRoute.withParam("hide_local_music", z4);
        buildRoute.withParam("extra_beat_music_sticker", z3);
        buildRoute.withParam("from_location", str5);
        buildRoute.withParam("type", str6);
        buildRoute.withParam("long_video", z5);
        buildRoute.withParam("reuse_original_sound_url", urlModel);
        buildRoute.withParam("reuse_original_sound_id", str4);
        buildRoute.withParam("reuse_original_sound_length", i3);
        buildRoute.withParam("is_mv_theme_music", z7);
        if (bundle != null) {
            buildRoute.withParam("arguments", bundle);
        }
        C16880lQ.LJII(fragment, buildRoute.buildIntent(), i);
    }
}
