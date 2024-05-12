package com.ss.android.ugc.aweme.tools.music;

import X.ActivityC45651qj;
import X.C149835uN;
import X.C1536161d;
import X.C36922EeM;
import X.C43985HOb;
import X.C52857Kon;
import X.C6D8;
import X.C77413UZt;
import X.C780334l;
import X.C7IG;
import X.C7IH;
import X.C82622Wbi;
import X.C84896XTo;
import X.HNO;
import X.HNP;
import X.HOH;
import X.HWE;
import X.I9Q;
import X.I9S;
import X.I9U;
import X.InterfaceC149485to;
import X.InterfaceC65784Pro;
import X.InterfaceC84897XTp;
import X.InterfaceC84907XTz;
import X.InterfaceC88472Yns;
import X.ProgressDialogC173686rk;
import X.V1K;
import X.X1D;
import X.XKX;
import X.XTS;
import X.XTV;
import X.XUM;
import X.XZI;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.ss.android.ugc.gamora.editor.music.stream.MusicStreamServiceImpl;
import com.ss.android.vesdk.VEUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS124S0300000_7;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS62S0201000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MusicServiceImpl implements IAnotherMusicService {
    public final IMusicService LIZ = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMusicService();

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJIJI() {
    }

    @Override // X.HNW
    public final void LJIJJLI() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean LJIILIIL() {
        return C1536161d.LIZJ("music");
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJIIZILJ() {
        C1536161d.LIZ("music");
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJJI() {
        XTV xtv = XTV.LJIIIZ;
        xtv.LJ = true;
        xtv.LJFF = 0;
        XKX.LIZLLL(C780334l.LJLIL, null, null, new XTS(0, xtv, null), 3);
    }

    @Override // X.HNW
    public final String getCacheDir() {
        String cacheDir = this.LIZ.getCacheDir();
        o.LJIIIIZZ(cacheDir, "proxy.cacheDir");
        return cacheDir;
    }

    @Override // X.HNW
    public final String getDownloadDir() {
        String downloadDir = this.LIZ.getDownloadDir();
        o.LJIIIIZZ(downloadDir, "proxy.downloadDir");
        return downloadDir;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean LIZ() {
        return MusicService.LJJLIIIJJI().LIZ();
    }

    @Override // X.HNW
    public final void LIZLLL() {
        MusicService.LJJLIIIJJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJ() {
        MusicService.LJJLIIIJJI().LJ();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final Class<?> LJFF() {
        Class<?> LJFF = MusicService.LJJLIIIJJI().LJFF();
        o.LJIIIIZZ(LJFF, "get().getService(com.ss.….chooseMusicActivityClass");
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJIIJ() {
        MusicService.LJJLIIIJJI().LJJI();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJIILJJIL() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJIL() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final String LIZIZ(String str) {
        XUM LIZ = MusicStreamServiceImpl.LIZIZ().LIZ();
        if (LIZ != null) {
            return LIZ.LIZIZ(str);
        }
        return null;
    }

    @Override // X.HNW
    public final String LIZJ(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        String LIZJ = MusicService.LJJLIIIJJI().LIZJ(musicModel);
        o.LJIIIIZZ(LIZJ, "get().getService(com.ss.…MusicFilePath(musicModel)");
        return LIZJ;
    }

    @Override // X.HNW
    public final void LJII(String str) {
        MusicService.LJJLIIIJJI().LJII(str);
    }

    @Override // X.HNW
    public final MusicModel LJIIIIZZ(AVMusic aVMusic) {
        if (aVMusic == null) {
            return null;
        }
        return I9S.LIZ(aVMusic);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final MusicWaveBean LJIIIZ(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean == null) {
            return null;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(aVMusicWaveBean.getMusicWavePointArray());
        return musicWaveBean;
    }

    @Override // X.HNW
    public final String LJIIJJI(AVMusic musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        String LIZJ = MusicService.LJJLIIIJJI().LIZJ(I9S.LIZ(musicModel));
        o.LJIIIIZZ(LIZJ, "get().getService(com.ss.….fromAVMusic(musicModel))");
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVMusicWaveBean LJIIL(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        if (serializable instanceof MusicWaveBean) {
            AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
            aVMusicWaveBean.setMusicWavePointArray(((MusicWaveBean) serializable).getMusicWavePointArray());
            return aVMusicWaveBean;
        }
        if (!(serializable instanceof AVMusicWaveBean)) {
            return null;
        }
        return (AVMusicWaveBean) serializable;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final MusicModel LJIILLIIL(AVMusic aVMusic) {
        if (aVMusic == null) {
            return null;
        }
        return I9S.LIZ(aVMusic);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVChallenge LJIJ(Challenge challenge) {
        if (challenge != null) {
            new HWE();
            return HWE.LIZ(challenge);
        }
        return null;
    }

    @Override // X.HNW
    public final String LJJ(AVMusic musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        String LJJ = MusicService.LJJLIIIJJI().LJJ(I9S.LIZ(musicModel));
        o.LJIIIIZZ(LJJ, "get().getService(com.ss.….fromAVMusic(musicModel))");
        return LJJ;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean LJJIFFI(String str) {
        XUM LIZ = MusicStreamServiceImpl.LIZIZ().LIZ();
        if (LIZ != null && LIZ.LIZJ(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJJII(Integer num) {
        MusicService.LJJLIIIJJI().LJIIIIZZ(0, num);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final C149835uN LJJIII(InterfaceC149485to interfaceC149485to) {
        return new C149835uN(interfaceC149485to);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVMusic LJJIIJZLJL(String musicId) {
        MusicModel musicModel;
        o.LJIIIZ(musicId, "musicId");
        new I9Q();
        Music LJIIL = MusicService.LJJLIIIJJI().LJIIL(musicId);
        if (LJIIL != null) {
            musicModel = LJIIL.convertToMusicModel();
        } else {
            musicModel = null;
        }
        return I9Q.LIZ(musicModel);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final int getMusicDuration(String str) {
        int LIZJ;
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str == null || str.length() == 0 || (num = HOH.LIZ.get(str)) == null || num.intValue() <= 0 || num.intValue() <= 0) {
            String LJI = HOH.LJI(str);
            if (LJI == null || LJI.length() == 0) {
                return -1;
            }
            int[] iArr = new int[10];
            int audioFileInfo = VEUtils.getAudioFileInfo(LJI, iArr);
            if (audioFileInfo == 0) {
                LIZJ = iArr[3];
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
                LIZ.append(audioFileInfo);
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
                LIZJ = HOH.LIZJ(LJI);
            }
            if (str != null) {
                HOH.LIZ.put(str, Integer.valueOf(LIZJ));
            }
            return LIZJ;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final UrlModel getMusicModelAudioTrack(Object obj) {
        return this.LIZ.getMusicModelAudioTrack(obj);
    }

    @Override // X.HNW
    public final String getRhythmMusicFilePath(String str) {
        String rhythmMusicFilePath = this.LIZ.getRhythmMusicFilePath(str);
        o.LJIIIIZZ(rhythmMusicFilePath, "proxy.getRhythmMusicFilePath(musicPath)");
        return rhythmMusicFilePath;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final boolean isMusicTypeLocal(int i) {
        return this.LIZ.isMusicTypeLocal(i);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final AVMusic transformMusicModel(MusicModel musicModel) {
        new I9Q();
        return I9Q.LIZ(musicModel);
    }

    @Override // X.HNW
    public final AVMusic transformNewAVMusic(String musicString) {
        o.LJIIIZ(musicString, "musicString");
        AVMusic transformNewAVMusic = this.LIZ.transformNewAVMusic(musicString);
        o.LJIIIIZZ(transformNewAVMusic, "proxy.transformNewAVMusic(musicString)");
        return transformNewAVMusic;
    }

    @Override // X.HNW
    public final boolean LJIJJ(AVMusic musicModel, Context ameActivity) {
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(ameActivity, "ameActivity");
        return this.LIZ.checkValidMusic(musicModel, ameActivity, false);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final VerticalMusicView LJJIIZ(C82622Wbi diContainer, XZI xzi) {
        o.LJIIIZ(diContainer, "diContainer");
        return new VerticalMusicView(diContainer, xzi);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final List<AVMusic> LJJIIZI(int i, String str) {
        int i2;
        MusicList LJJJJZ;
        if (((Boolean) C52857Kon.LIZ.getValue()).booleanValue()) {
            i2 = 1;
        } else {
            i2 = 20;
        }
        com.ss.android.ugc.aweme.music.service.IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
        ArrayList arrayList = null;
        if (LJJLIIIJJI == null || (LJJJJZ = LJJLIIIJJI.LJJJJZ(i2, i, str)) == null || C77413UZt.LJIILL(LJJJJZ.musicList)) {
            return null;
        }
        List<Music> list = LJJJJZ.musicList;
        BaseResponse.ServerTimeExtra serverTimeExtra = LJJJJZ.extra;
        if (list != null) {
            arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    MusicModel convertToMusicModel = music.convertToMusicModel();
                    if (serverTimeExtra != null) {
                        LogPbBean logPbBean = new LogPbBean();
                        logPbBean.setImprId(serverTimeExtra.logid);
                        convertToMusicModel.setLogPb(logPbBean);
                    }
                    arrayList.add(convertToMusicModel);
                }
            }
        }
        return I9S.LIZIZ(arrayList);
    }

    @Override // X.HNW
    public final void requestMusic(String musicId, InterfaceC84907XTz interfaceC84907XTz) {
        o.LJIIIZ(musicId, "musicId");
        this.LIZ.requestMusic(musicId, interfaceC84907XTz);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJJIIJ(ActivityC45651qj activity, V1K v1k, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        MusicService.LJJLIIIJJI().LJJJZ(v1k.LJI);
        C7IH c7ih = new C7IH(activity);
        AqS62S0201000_13 aqS62S0201000_13 = new AqS62S0201000_13(this, v1k, 0);
        I9U i9u = new I9U(this, interfaceC88472Yns, interfaceC65784Pro);
        AvoidOnResultFragment avoidOnResultFragment = c7ih.LIZ;
        if (avoidOnResultFragment != null) {
            List<C7IG> list = avoidOnResultFragment.LJLIL.get(110);
            if (list == null) {
                list = new ArrayList<>();
            }
            ListProtector.add(list, list.size(), i9u);
            avoidOnResultFragment.LJLIL.put(110, list);
            aqS62S0201000_13.invoke(avoidOnResultFragment);
            return;
        }
        o.LJIJI("mAvoidOnResultFragment");
        throw null;
    }

    @Override // X.HNW
    public final void LJIILL(Context context, AVMusic musicModel, int i, boolean z, InterfaceC84897XTp listener) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(listener, "listener");
        MusicService.LJJLIIIJJI().LJJJ(context, I9S.LIZ(musicModel), z, i, new C84896XTo(listener, musicModel));
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJJIJ(Context context, String musicId, boolean z, ProgressDialogC173686rk progressDialogC173686rk, HNP hnp) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(musicId, "musicId");
        MusicService.LJJLIIIJJI().LJJJLIIL(context, musicId, z, progressDialogC173686rk, new HNO(hnp));
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAnotherMusicService
    public final void LJI(ActivityC45651qj activity, NavigationScene navigationScene, V1K v1k, AqS138S0200000_7 aqS138S0200000_7, AqS157S0100000_7 aqS157S0100000_7, AqS157S0100000_7 aqS157S0100000_72) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(navigationScene, "navigationScene");
        AVExternalServiceImpl.LIZ().provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.INSTANCE, "open_choose_music_page");
        MusicService.LJJLIIIJJI().LJJJZ(v1k.LJI);
        if (C43985HOb.LIZ() && !C6D8.LIZLLL()) {
            com.ss.android.ugc.aweme.music.service.IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
            Bundle bundle = new Bundle();
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", v1k.LIZIZ);
            AVChallenge curChallenge = AVExternalServiceImpl.LIZ().publishService().getCurChallenge();
            if (curChallenge != null) {
                bundle.putString("challenge", curChallenge.cid);
            }
            Bundle bundle2 = v1k.LJ;
            if (bundle2 != null) {
                str = bundle2.getString("shoot_tab_name");
            } else {
                str = null;
            }
            bundle.putString("shoot_tab_name", str);
            bundle.putString("title", v1k.LIZ);
            bundle.putBoolean("is_mv_theme_music", v1k.LJIIIZ);
            MusicModel musicModel = v1k.LJIIZILJ;
            if (musicModel != null) {
                bundle.putSerializable("music_model", musicModel);
            }
            bundle.putBoolean("music_allow_clear", v1k.LIZJ);
            bundle.putBoolean("music_allow_cut", v1k.LJIIJJI);
            bundle.putBoolean("music_is_photomv", v1k.LIZLLL);
            bundle.putString("creation_id", v1k.LJI);
            bundle.putString("shoot_way", v1k.LJFF);
            bundle.putBoolean("long_video", v1k.LJIIJ);
            bundle.putBoolean("hide_local_music", v1k.LJIIIIZZ);
            bundle.putBoolean("extra_beat_music_sticker", v1k.LJII);
            bundle.putSerializable("reuse_original_sound_url", v1k.LJIILIIL);
            bundle.putString("reuse_original_sound_id", v1k.LJIIL);
            bundle.putInt("reuse_original_sound_length", v1k.LJIILJJIL);
            bundle.putBoolean("is_carousel", v1k.LJIJ);
            Bundle bundle3 = v1k.LJ;
            if (bundle3 != null) {
                bundle.putBundle("arguments", bundle3);
            }
            LJJLIIIJJI.LJJJJLL(activity, navigationScene, bundle, new AqS124S0300000_7(this, aqS138S0200000_7, aqS157S0100000_7, 0), aqS157S0100000_72);
            return;
        }
        LJJIIJ(activity, v1k, aqS138S0200000_7, aqS157S0100000_7);
    }
}
