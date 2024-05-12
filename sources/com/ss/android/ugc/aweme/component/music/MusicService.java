package com.ss.android.ugc.aweme.component.music;

import X.ActivityC45651qj;
import X.C00F;
import X.C00S;
import X.C0M6;
import X.C10I;
import X.C10K;
import X.C165706es;
import X.C16880lQ;
import X.C1A7;
import X.C36296EMi;
import X.C37619Epb;
import X.C39745Fin;
import X.C42663Gol;
import X.C45814HyU;
import X.C50891JyB;
import X.C56433MCv;
import X.C56464MEa;
import X.C56543MHb;
import X.C58096Mr6;
import X.C59859NeR;
import X.C64551PVb;
import X.C64552PVc;
import X.C64553PVd;
import X.C6D8;
import X.C72115SRz;
import X.C72834SiE;
import X.C79004UzY;
import X.C79409VEn;
import X.C84868XSm;
import X.C84884XTc;
import X.C84887XTf;
import X.C84889XTh;
import X.C84890XTi;
import X.C84892XTk;
import X.C84893XTl;
import X.C84917XUj;
import X.C87238YLq;
import X.EF7;
import X.InterfaceC84870XSo;
import X.InterfaceC84903XTv;
import X.KJK;
import X.KUN;
import X.M5G;
import X.PUP;
import X.PVP;
import X.ProgressDialogC173686rk;
import X.TPS;
import X.TPW;
import X.WGE;
import X.WGG;
import X.WM7;
import X.X1D;
import X.XPS;
import X.XU0;
import X.XU2;
import X.XUG;
import X.XVC;
import X.XVD;
import X.XVG;
import X.XVM;
import X.XW8;
import X.XWC;
import X.XZ6;
import X.XZD;
import Y.ACallableS0S1410000_15;
import Y.ACallableS118S0100000_15;
import Y.ACallableS45S0201000_9;
import Y.AObserverS82S0100000_14;
import Y.AObserverS83S0100000_15;
import Y.AgS131S0100000_15;
import Y.AgS49S0000000_15;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCoverInfo;
import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.AIMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.e1;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS124S0300000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class MusicService implements IMusicService {
    public int LIZ = 2;
    public C84868XSm LIZIZ;
    public InterfaceC84903XTv LIZJ;

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIJJ() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIIJZLJL() {
        this.LIZ = 3;
    }

    public static IMusicService LJJLIIIJJI() {
        Object LIZ = C58096Mr6.LIZ(IMusicService.class, false);
        if (LIZ != null) {
            return (IMusicService) LIZ;
        }
        if (C58096Mr6.i == null) {
            synchronized (IMusicService.class) {
                if (C58096Mr6.i == null) {
                    C58096Mr6.i = new MusicService();
                }
            }
        }
        return C58096Mr6.i;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LIZIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LJ("music_play_retry_count_videocache", 18);
        } catch (Throwable unused) {
            return 18;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LIZLLL() {
        C84868XSm c84868XSm = this.LIZIZ;
        if (c84868XSm != null) {
            c84868XSm.release();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJ() {
        ((TPS) TPS.LJLJJI.getValue()).LJLJI.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final XU2 LJI() {
        return new XU2("SoundEffectFragment");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJIIIZ() {
        if (C00F.LIZ(31744, 0, "enable_check_trimmed_sound_clip_duration", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K LJIILJJIL() {
        return ChooseMusicApi.LIZ.getFavoriteRecommendedMusic(0, 10, 1);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJIIZILJ() {
        return C00F.LIZ(31744, 0, "enable_sound_remix_on_editorpro", true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJIJ() {
        int LIZ = C00F.LIZ(31744, 0, "recommend_music_count_in_profile", true);
        if (LIZ > 50) {
            return 50;
        }
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJIJI() {
        Integer num = C84892XTk.LIZ;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJI() {
        C84889XTh.LIZIZ.clear();
        C84889XTh.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIJIIJI() {
        C56543MHb.LIZ.getClass();
        C56543MHb.LIZJ.LJIIIIZZ(-1);
        ((C0M6) C56543MHb.LIZLLL.getValue()).LJIIIIZZ(-1);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJJIJIIJIL() {
        return C00F.LIZ(31744, 0, "enable_sound_remix_on_editing_page", true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJJJIZL() {
        if (e1.LIZ(31744, "studio_editor_pro_enhance_favorites_page_with_recommendation", true, false) && !CommerceMediaServiceImpl.LIZJ().LJIIZILJ() && !CommerceMediaServiceImpl.LIZJ().LJIIIZ() && !C6D8.LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final CutMusicPanel LJJJJJ() {
        return new CutMusicPanel();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJJJJLI() {
        return C00F.LIZ(31744, 0, "editing_page_sound_remix_panel_status", true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJJLIIIJ() {
        return C00F.LIZ(31744, 0, "editing_page_sound_remix_entrance", true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void initService() {
        C36296EMi.LJ(new C84890XTi());
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LIZ() {
        return C59859NeR.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIIJ() {
        KUN LJIILIIL = C1A7.LJIILIIL();
        LJIILIIL.LJ("cold_start_times", LJIILIIL.LIZ(0, "cold_start_times") + 1);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final List LJJII() {
        return Collections.emptyList();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJI() {
        C1A7.LJIILIIL().LJI("has_receive_new_coupon", true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJJLL() {
        return C56464MEa.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Map<String, Class<?>> LJJLIIIJILLIZJL() {
        return Collections.emptyMap();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Class<?> LJFF() {
        return ChooseMusicActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int LJIJJLI() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIFFI() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final InterfaceC84903XTv LJJJIL() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String LIZJ(MusicModel musicModel) {
        if (musicModel.isPlayUrlValid()) {
            if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO && musicModel.getReuseAudioPlayUrl() != null) {
                return XPS.LIZLLL().LIZJ((String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0));
            }
            return XPS.LIZLLL().LIZJ((String) ListProtector.get(musicModel.getUrl().getUrlList(), 0));
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            return C00S.LIZIZ(EF7.LIZIZ(), UriProtector.parse(musicModel.getLocalPath()));
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJII(String str) {
        if (this.LIZIZ != null && str != null && !str.isEmpty()) {
            this.LIZIZ.LIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Music LJIIL(String str) {
        try {
            Music music = MusicApi.LIZIZ(str).music;
            if (music != null) {
                return music;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String LJJ(MusicModel musicModel) {
        if (musicModel.isPlayUrlValid()) {
            if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
                return XPS.LIZLLL().LIZIZ((String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0));
            }
            return XPS.LIZLLL().LIZIZ((String) ListProtector.get(musicModel.getUrl().getUrlList(), 0));
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final AIMusicDownloadPlayHelper LJJIIZ(XZD xzd) {
        return new AIMusicDownloadPlayHelper(xzd);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final MusicModel LJJIIZI(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                return C45814HyU.LIZ(file);
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String LJJIJLIJ(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C16880lQ.LLLZI(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C16880lQ.LLLZI(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String LJJJJZI(String str) {
        String nickName = AccountService.LJIJ().LJFF().getNickName();
        StringBuilder LIZJ = b1.LIZJ(str, " - ");
        LIZJ.append(EF7.LIZIZ().getString(R.string.rhv, nickName));
        return X1D.LIZIZ(LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJLZIJ(XZ6 xz6) {
        this.LIZJ = xz6;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJZ(String str) {
        C84889XTh.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final List<String> LJJL(String str) {
        if (C72115SRz.LIZ == null) {
            String LIZIZ = C50891JyB.LIZIZ("third_music_icon_info", "");
            if (!TextUtils.isEmpty(LIZIZ)) {
                try {
                    C72115SRz.LIZ = (ThirdMusicCoverItem) new Gson().LJI(LIZIZ, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    C72115SRz.LIZIZ(LIZIZ);
                }
            }
        }
        ThirdMusicCoverItem thirdMusicCoverItem = C72115SRz.LIZ;
        if (thirdMusicCoverItem != null) {
            List<MusicCoverInfo> list = thirdMusicCoverItem.musicCoverInfoList;
            if (!C79004UzY.LJJIFFI(list)) {
                for (MusicCoverInfo musicCoverInfo : list) {
                    if (musicCoverInfo != null && TextUtils.equals(musicCoverInfo.partnerName, str)) {
                        return musicCoverInfo.coverUrlList;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final AVMusicDownloadPlayHelper LJJLIIIIJ(XUG xug) {
        return new AVMusicDownloadPlayHelper(xug);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final long getMusicDuration(String str) {
        return XU0.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIIIIZZ(Integer num, Integer num2) {
        ((TPS) TPS.LJLJJI.getValue()).LLLLZ(new C37619Epb(num.intValue(), 0, num2, null, false), TPW.LIZ).LJJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K LJIIJJI(int i, int i2) {
        return ChooseMusicApi.LJI(i, 12, "", i2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K<SuggestMusicList> LJIILIIL(String str, String str2) {
        return ChooseMusicApi.LIZ.getCommerceHotMusicList(str2, str).LIZLLL(new AgS49S0000000_15(0));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K<BaseResponse> collectMusic(final String str, final int i) {
        return ChooseMusicApi.LIZ.collectMusic(str, i).LJFF(new C10I() { // from class: X.XTg
            @Override // X.C10I
            public final Object then(C10K c10k) {
                Collection<C84891XTj> values;
                String musicId = str;
                int i2 = i;
                if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
                    o.LJIIIZ(musicId, "musicId");
                    if (C84889XTh.LIZ != null && (values = C84889XTh.LIZIZ.values()) != null) {
                        Iterator<C84891XTj> it = values.iterator();
                        while (it.hasNext()) {
                            Object obj = it.next().LJLILLLLZI;
                            if (obj instanceof MusicPickResponse) {
                                List<Music> list = ((MusicPickResponse) obj).musicList;
                                o.LJIIIIZZ(list, "data.musicList");
                                for (Music music : list) {
                                    if (o.LJ(music.getIdStr(), musicId)) {
                                        music.setCollectStatus(i2);
                                    }
                                }
                            }
                        }
                    }
                }
                return c10k;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K<String> getAutoCutNLEModel(String str, String str2) {
        return MusicApi.LIZ.getAutoCutNLEModel(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C84917XUj LJIILL(int i, Context context, List list) {
        return new C84917XUj(i, context, list);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIILLIIL(Context context, C56433MCv c56433MCv, MusicModel musicModel) {
        new C84868XSm(context, "trending_inflow_page", false, false, false).LIZLLL(musicModel, c56433MCv, false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJIL(ActivityC45651qj activityC45651qj, M5G m5g, String str) {
        C10K.LIZJ(new ACallableS0S1410000_15(this, str, activityC45651qj, m5g, 0));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJIJL(String str, int i, WGG wgg) {
        WGE.LIZ(str, i, wgg);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJIL(MusicModel musicModel, Context context, boolean z) {
        return XU0.LIZ(musicModel, context, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJJ(XVD xvd, Boolean bool, Boolean bool2) {
        XVC.LIZLLL(xvd, bool.booleanValue(), bool2.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJJL(XVD xvd, Float f, Boolean bool) {
        XVC.LIZJ(xvd, f.floatValue(), bool.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final MusicList LJJJJZ(int i, int i2, String str) {
        if (CommerceMediaServiceImpl.LIZJ().LIZ() || CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            return MusicApi.LIZ.fetchCommerceStickPointMusicList(0, i, i2, str).get();
        }
        MusicList musicList = MusicApi.LIZ.fetchStickPointMusicList(0, i, i2, str).get();
        KJK.LIZIZ("Beat", musicList.musicList, null);
        KJK.LIZ("sync_music", musicList.musicList);
        return musicList;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJLI(Fragment fragment, MusicModel musicModel, XVG xvg) {
        o.LJIIIZ(fragment, "fragment");
        if (fragment.mo49getActivity() == null) {
            return;
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel = (ChooseMusicCutViewModel) C165706es.LJ(fragment).get(ChooseMusicCutViewModel.class);
        chooseMusicCutViewModel.hv0().postValue(musicModel);
        chooseMusicCutViewModel.gv0().postValue(xvg);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean LJJIJ(MusicModel musicModel, Context context, boolean z, boolean z2) {
        return XU0.LIZ(musicModel, context, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJ(Context context, MusicModel musicModel, boolean z, int i, InterfaceC84870XSo interfaceC84870XSo) {
        if (musicModel != null) {
            o.LJIIIZ(context, "context");
            C84868XSm c84868XSm = new C84868XSm(context, false, true, z, 16);
            c84868XSm.LIZ.LJ = i;
            c84868XSm.LIZLLL(musicModel, interfaceC84870XSo, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K LJJJJI(long j, int i, int i2, int i3, boolean z) {
        return ChooseMusicApi.LIZ(i, "", z, null, i2, j, i3).LIZLLL(new AgS49S0000000_15(4));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJJLL(ActivityC45651qj activityC45651qj, Object obj, Bundle bundle, AqS124S0300000_7 aqS124S0300000_7, AqS157S0100000_7 aqS157S0100000_7) {
        ViewModelProvider of;
        LifecycleOwner lifecycleOwner;
        WM7 currentScene;
        String string = activityC45651qj.getString(R.string.cqe);
        if (CommerceMediaServiceImpl.LIZJ().LIZ()) {
            string = activityC45651qj.getString(R.string.ig6);
        }
        bundle.putString("title", string);
        if (C84887XTf.LIZ()) {
            C72834SiE.LIZ();
        }
        NavigationScene navigationScene = (NavigationScene) obj;
        o.LJIIIZ(navigationScene, "navigationScene");
        XW8 xw8 = new XW8();
        xw8.mArguments = bundle;
        xw8.disableSupportRestore();
        ICreativeSAAService LIZ = SAAService.LIZ();
        if (LIZ != null && (currentScene = LIZ.getCurrentScene(activityC45651qj)) != null) {
            of = C165706es.LJIIIIZZ(currentScene, null, null, 6);
        } else {
            of = ViewModelProviders.of(activityC45651qj);
            o.LJIIIIZZ(of, "of(activity)");
        }
        ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) of.get(ChooseMusicWithSceneViewModel.class);
        MutableLiveData<XWC> iv0 = chooseMusicWithSceneViewModel.iv0();
        MutableLiveData<XWC> hv0 = chooseMusicWithSceneViewModel.hv0();
        MutableLiveData<C79409VEn> gv0 = chooseMusicWithSceneViewModel.gv0();
        XVM xvm = new XVM(gv0, aqS124S0300000_7, chooseMusicWithSceneViewModel, iv0, activityC45651qj, hv0);
        C42663Gol c42663Gol = new C42663Gol();
        c42663Gol.LIZJ = new C87238YLq(new AqS165S0100000_15(chooseMusicWithSceneViewModel, 742), new AqS165S0100000_15(chooseMusicWithSceneViewModel, 743));
        c42663Gol.LIZ = true;
        navigationScene.LLJJJJ(xw8, c42663Gol.LIZ());
        AqS118S0300000_14 aqS118S0300000_14 = new AqS118S0300000_14(gv0, activityC45651qj, aqS124S0300000_7, 2);
        ((LiveData) chooseMusicWithSceneViewModel.LJLJJL.getValue()).setValue(new C84893XTl(xvm, aqS118S0300000_14));
        ICreativeSAAService LIZ2 = SAAService.LIZ();
        if (LIZ2 == null || (lifecycleOwner = LIZ2.getCurrentScene(activityC45651qj)) == null) {
            lifecycleOwner = activityC45651qj;
        }
        iv0.observe(lifecycleOwner, new AObserverS83S0100000_15(aqS157S0100000_7, 79));
        hv0.observe(lifecycleOwner, new AObserverS83S0100000_15(xvm, 80));
        gv0.observe(lifecycleOwner, new AObserverS82S0100000_14(aqS118S0300000_14, 54));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void LJJJLIIL(Context context, String str, boolean z, ProgressDialogC173686rk progressDialogC173686rk, M5G m5g) {
        C10K.LIZJ(new ACallableS0S1410000_15(this, str, context, z, progressDialogC173686rk, m5g, 1));
    }

    public final void LJJLIIIJJIZ(Context context, Music music, boolean z, ProgressDialog progressDialog, M5G m5g) {
        if (music != null) {
            try {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                if (convertToMusicModel != null) {
                    o.LJIIIZ(context, "context");
                    boolean z2 = false;
                    C84868XSm c84868XSm = new C84868XSm(context, z, z2, z2, 28);
                    this.LIZIZ = c84868XSm;
                    c84868XSm.LIZLLL(convertToMusicModel, new C84884XTc(this, progressDialog, m5g, music), true);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                if (m5g != null) {
                    C10K.LIZIZ(new ACallableS45S0201000_9(0, m5g, e, 1), C10K.LJIIIIZZ, null);
                    return;
                }
                return;
            }
        }
        if (m5g != null) {
            C10K.LIZIZ(new ACallableS118S0100000_15(m5g, 16), C10K.LJIIIIZZ, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K LJJJJJL(String str, int i, boolean z, int i2, int i3, String str2) {
        return ChooseMusicApi.LIZ(i, str, z, str2, i2, 0L, i3).LIZLLL(new AgS49S0000000_15(3));
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K LJJIII(String str, String str2, int i, String str3, int i2, String str4, int i3) {
        return MusicApi.LIZ.getAutoCutMusicList(str, str2, i, str3, i2, str4, i3);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K<String> LJJIZ(String str, String str2, int i, String str3, int i2, String str4, String str5, int i3) {
        return MusicApi.LIZ.getAutoCutMusicListByNewPath(str, str2, i, str3, i2, str4, str5, i3);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K LJJIJIL(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase(Locale.getDefault()));
        String name = file.getName();
        C64552PVc c64552PVc = new C64552PVc();
        c64552PVc.LIZJ(C64551PVb.LJFF);
        c64552PVc.LIZ(C64553PVd.LIZIZ("zipBinary", name, new PUP(C39745Fin.LIZJ(mimeTypeFromExtension), file)));
        c64552PVc.LIZ(C64553PVd.LIZIZ("rec_config", null, PVP.LIZJ(null, str4)));
        return MusicApi.LIZ.getAutoCutMusicList(c64552PVc.LIZIZ(), str2, i, str3, i2, i3, str5, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi$API] */
    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final C10K LJJIIJ(int i, int i2, int i3, int i4, int i5, long j, String str, String str2, String str3, String str4) {
        int i6;
        ?? r19;
        Integer num;
        if (i4 == 1 && str4 != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        ICommerceMediaService LIZJ = CommerceMediaServiceImpl.LIZJ();
        if (LIZJ != null) {
            r19 = LIZJ.LJ();
        } else {
            r19 = 0;
        }
        ?? r4 = ChooseMusicApi.LIZ;
        Integer valueOf = Integer.valueOf(i3);
        Integer valueOf2 = Integer.valueOf(i6);
        Integer valueOf3 = Integer.valueOf(i5);
        if (C00F.LIZ(31744, 0, "studio_recommend_music_remove_duplicate", true) == 2) {
            num = 0;
        } else {
            num = null;
        }
        return r4.getRecommendMusicListFromAI(i2, i, "shoot_page", str, "1", str2, str3, j, str4, valueOf, valueOf2, valueOf3, num, r19).LIZLLL(new AgS131S0100000_15(this, 17));
    }
}
