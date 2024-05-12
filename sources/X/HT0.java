package X;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;
import com.google.gson.j;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HT0 extends HT1 implements XUC {
    public MusicDownloadPlayHelper LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public Boolean LJLL;

    @Override // X.XUC
    public final MusicModel LIZLLL() {
        return null;
    }

    @Override // X.XUC
    public final /* synthetic */ void LJJJJIZL(MusicModel musicModel, Exception exc) {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLLL(MusicModel musicModel, long j) {
    }

    @Override // X.XUC
    public final boolean LJJIIZI() {
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && interfaceC38263Ezz.getView() != null) {
            return true;
        }
        return false;
    }

    @Override // X.XUC
    public final Activity LJJIZ() {
        Context context;
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        return HT4.LIZ(context);
    }

    @Override // X.XUC
    public final void T3(MusicModel musicModel) {
        Activity LJJIZ = LJJIZ();
        if (LJJIZ == null || LJJIZ.isFinishing() || musicModel == null) {
            return;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        RecordPresetResource recordPresetResource = new RecordPresetResource(null, null, musicModel.getMusicId(), musicModel);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(LIZ);
        builder.shootWay(this.LJLJL);
        builder.recordPresetResource(recordPresetResource);
        builder.landingBack(this.LJLJLLL);
        AVExternalServiceImpl.LIZ().asyncService("HandleVideoCreationWithMusicMethodIDL", new IDLCallbackS0S0300000_7(LJJIZ, builder.build(), musicModel, 13));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", LIZ);
        c188727au.LJIIIZ("enter_from", this.LJLJJLL);
        c188727au.LJIIIZ("shoot_way", this.LJLJL);
        c188727au.LJIIIZ("enter_method", "click_music_publish");
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        c188727au.LJIIIZ("group_id", C78983UzD.LJJIJL());
        c188727au.LJIIIZ("content_source", "shoot");
        c188727au.LJIIIZ("shoot_entrance", this.LJLJLJ);
        if (o.LJ(this.LJLJL, "collection_music")) {
            c188727au.LJI("content_source", "shoot");
        }
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int i;
        long j;
        int i2;
        MusicDownloadPlayHelper musicDownloadPlayHelper;
        boolean z;
        HT3 ht3 = (HT3) xBaseParamModel;
        o.LJIIIZ(type, "type");
        j parse = GsonProtectorUtils.parse(new com.google.gson.o(), ht3.getMusic());
        if (parse == null) {
            return;
        }
        j LJJIJ = parse.LJIIZILJ().LJJIJ("index");
        if (LJJIJ != null) {
            i = LJJIJ.LJIILJJIL();
        } else {
            i = 0;
        }
        Music music = (Music) GsonProtectorUtils.fromJson(new Gson(), parse, Music.class);
        String idStr = music.getIdStr();
        o.LJIIIIZZ(idStr, "idStr");
        Long LJIJJLI = C79043V0l.LJIJJLI(idStr);
        if (LJIJJLI != null) {
            j = LJIJJLI.longValue();
        } else {
            j = 0;
        }
        music.setId(j);
        HT2 trackInfo = ht3.getTrackInfo();
        if (trackInfo != null) {
            this.LJLJJLL = trackInfo.getEnterFrom();
            this.LJLJL = trackInfo.getShootWay();
            this.LJLJLJ = trackInfo.getShootEntrance();
            Number landingBack = trackInfo.getLandingBack();
            if (landingBack != null && landingBack.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJLLL = z;
            this.LJLL = trackInfo.getCompletedEvent();
        }
        Activity LJJIZ = LJJIZ();
        if (LJJIZ == null) {
            return;
        }
        this.LJLJJL = new MusicDownloadPlayHelper(this, this.LJLJJLL);
        if (C2NU.LIZ.LIZIZ()) {
            MusicModel convertToMusicModel = music.convertToMusicModel();
            if (!MusicService.LJJLIIIJJI().LJJIL(convertToMusicModel, LJJIZ, true)) {
                return;
            }
            boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            if (MSAdaptionService.LJIIL().LJI(LJJIZ)) {
                C16880lQ.LLZILL(Toast.makeText(LJJIZ, LJJIZ.getString(R.string.f1i), 0));
                return;
            }
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.LJLJJL;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.LJLLL = i;
            }
            if (o.LJ(this.LJLJL, "collection_music") && (musicDownloadPlayHelper = this.LJLJJL) != null) {
                musicDownloadPlayHelper.LJLLILLLL = "music_collection";
                musicDownloadPlayHelper.LJLLJ = new MusicCategory("favorite_song", null, 2, null);
            }
            MusicDownloadPlayHelper musicDownloadPlayHelper3 = this.LJLJJL;
            if (musicDownloadPlayHelper3 == null) {
                return;
            }
            String str = this.LJLJL;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1490611900:
                        if (str.equals("collection_music")) {
                            i2 = 7;
                            break;
                        }
                        break;
                    case 181019695:
                        if (str.equals("profile_favorite_recommend")) {
                            i2 = 13;
                            break;
                        }
                        break;
                    case 197089977:
                        if (str.equals("music_chart_list")) {
                            i2 = 11;
                            break;
                        }
                        break;
                    case 1637984942:
                        if (str.equals("wwa_campaign_shoot")) {
                            i2 = 18;
                            break;
                        }
                        break;
                }
                musicDownloadPlayHelper3.LIZJ(convertToMusicModel, i2, true, false, downloadEffectOrMusicAfterEnterCamera);
                return;
            }
            i2 = -1;
            musicDownloadPlayHelper3.LIZJ(convertToMusicModel, i2, true, false, downloadEffectOrMusicAfterEnterCamera);
            return;
        }
        AnonymousClass114.LIZ(LJJIZ, R.string.img);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XUC
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        boolean z;
        Activity LJJIZ = LJJIZ();
        if (LJJIZ == null || LJJIZ.isFinishing() || str == null || str2 == null || musicModel == null) {
            return;
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(LIZ);
        builder.shootWay(this.LJLJL);
        builder.musicPath(str);
        builder.musicOrigin(str2);
        builder.landingBack(this.LJLJLLL);
        ProfileParametersModel profileParametersModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Boolean bool = this.LJLL;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        builder.initialInputModel(new CreativeInitialModel(profileParametersModel, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, new WWAModel(z), 8191, objArr == true ? 1 : 0));
        AVExternalServiceImpl.LIZ().asyncService("HandleVideoCreationWithMusicMethodIDL", new IDLCallbackS0S0300000_7(LJJIZ, builder.build(), musicModel, 12));
        if (o.LJ(this.LJLJL, "collection_music")) {
            HT5.LIZ = true;
            HT5.LIZJ(true);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", LIZ);
        c188727au.LJIIIZ("enter_from", this.LJLJJLL);
        c188727au.LJIIIZ("shoot_way", this.LJLJL);
        c188727au.LJIIIZ("enter_method", "click_music_publish");
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        c188727au.LJIIIZ("group_id", C78983UzD.LJJIJL());
        c188727au.LJIIIZ("shoot_entrance", this.LJLJLJ);
        if (o.LJ(this.LJLJL, "collection_music")) {
            c188727au.LJIIIZ("content_source", "shoot");
            c188727au.LIZLLL(HT5.LIZ(), "favorite_scene");
        }
        FMX.LJIIL("shoot", c188727au.LIZ);
    }
}
