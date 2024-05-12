package X;

import Y.AObjectS86S0100000_7;
import android.content.SharedPreferences;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HYO extends AbstractC29891Fh<HYS> implements HYS, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLIL;
    public final HYS LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final ShortVideoContext LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final C5H3 LJLLI;
    public boolean LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public final C5H3 LJLLL;

    static {
        TBT tbt = new TBT(HYO.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(HYO.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(HYO.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(HYO.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(HYO.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(HYO.class, "recordModeApiComponent", "getRecordModeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0, c65351Pkp)};
    }

    private final I37 LJJLI() {
        return (I37) this.LJLJLLL.LIZ(this, LJLLLL[4]);
    }

    private final WSC LJJLIIIIJ() {
        return (WSC) this.LJLLI.getValue();
    }

    private final HYQ LJJLIIIJILLIZJL() {
        return (HYQ) this.LJLL.LIZ(this, LJLLLL[5]);
    }

    private final WRP getFilterApiComponent() {
        return (WRP) this.LJLJL.LIZ(this, LJLLLL[2]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJJLL.LIZ(this, LJLLLL[1]);
    }

    private final C82127WLb r4() {
        return (C82127WLb) this.LJLLL.getValue();
    }

    public final void LJJZZIII() {
        String str;
        if (o.LJ(this.LJLJJI.enterFrom, "effect_qr_scan")) {
            return;
        }
        ShortVideoContext shortVideoContext = this.LJLJJI;
        if (shortVideoContext.shootMode == 15 || shortVideoContext.creativeModel.draftInfoModel.isDraft) {
            return;
        }
        long j = shortVideoContext.cameraComponentModel.mMaxDuration;
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putLong("max_duration", j);
        WX6.LIZ(edit);
        DuetContext duetContext = this.LJLJJI.cameraComponentModel.duetContext;
        String str2 = duetContext.duetVideoPath;
        String str3 = duetContext.duetAudioPath;
        SharedPreferences.Editor edit2 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit2.putString("duet_video_path", str2);
        edit2.putString("duet_audio_path", str3);
        WX6.LIZ(edit2);
        StitchParams stitchParams = this.LJLJJI.stitchContext.stitchParams;
        SharedPreferences.Editor edit3 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit3.putString("stitch_params", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), stitchParams));
        WX6.LIZ(edit3);
        if (C69162nY.LIZ()) {
            Keva.getRepo("publish").storeString("ame_drafts_2", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), this.LJLJJI.creativeModel.mobileEffectsModel2));
        } else {
            Keva.getRepo("publish").storeString("ame_drafts", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), this.LJLJJI.creativeModel.mobileEffectsModel));
        }
        boolean z = this.LJLJJI.cameraComponentModel.mUseBeautyFace;
        SharedPreferences.Editor edit4 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit4.putInt("face_beauty", z ? 1 : 0);
        WX6.LIZ(edit4);
        if (this.LJLJJI.LJJIIZ()) {
            SharedPreferences.Editor edit5 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
            edit5.putBoolean("shoutout_params", true);
            WX6.LIZ(edit5);
        }
        HB4.LJFF(this.LJLJJI.creativeInfo);
        SharedARModel sharedARModel = this.LJLJJI.sharedARModel;
        boolean LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (sharedARModel != null && LJJLIIIJLLLLLLLZ) {
            str = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), sharedARModel);
        } else {
            str = "";
        }
        SharedPreferences.Editor edit6 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit6.putString("shared_ar", str);
        WX6.LIZ(edit6);
        int i = this.LJLJJI.cameraComponentModel.mHardEncode;
        SharedPreferences.Editor edit7 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit7.putInt("hard_encode", i);
        WX6.LIZ(edit7);
        ShortVideoContext shortVideoContext2 = this.LJLJJI;
        HB4.LJII(shortVideoContext2.cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(shortVideoContext2.creativeModel.musicBuzModel), this.LJLJJI.cameraComponentModel.mMusicStart);
        HCA hca = this.LJLJJI.cameraComponentModel.mDurings;
        o.LJII(hca, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> }");
        SharedPreferences.Editor edit8 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit8.putString("segment_video", C79045V0n.LJIJI(hca));
        WX6.LIZ(edit8);
        C41025G8f.LIZ("normal").LIZLLL();
        ExtractFramesModel extractFramesModel = ((C43786HGk) getCameraApiComponent().Xq()).LIZ;
        SharedPreferences.Editor edit9 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit9.putString("shot_extract_frame", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), extractFramesModel));
        WX6.LIZ(edit9);
        String strArray = this.LJLJJI.cameraComponentModel.recordContext.filterLabels.toString();
        String strArray2 = this.LJLJJI.cameraComponentModel.recordContext.filterIds.toString();
        String strArray3 = this.LJLJJI.cameraComponentModel.recordContext.filterValues.toString();
        SharedPreferences.Editor edit10 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit10.putString("filter_labels", strArray);
        edit10.putString("filter_ids", strArray2);
        edit10.putString("filter_values", strArray3);
        WX6.LIZ(edit10);
        if (e1.LIZ(31744, "upload_metadata", true, false)) {
            ShortVideoContext shortVideoContext3 = this.LJLJJI;
            java.util.Map<String, Object> map = shortVideoContext3.cameraComponentModel.videoRecordMetadata;
            if (map == null) {
                shortVideoContext3.cameraComponentModel.videoRecordMetadata = C63942P7q.LIZ();
            } else {
                java.util.Map<String, Object> LIZ = C63942P7q.LIZ();
                o.LJIIIIZZ(LIZ, "buildEditorInfoJson()");
                map.putAll(LIZ);
            }
            java.util.Map<String, Object> map2 = this.LJLJJI.cameraComponentModel.videoRecordMetadata;
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            SharedPreferences.Editor edit11 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
            edit11.putString("video_record_metadata", C63872f1.LIZIZ(map2));
            WX6.LIZ(edit11);
        }
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJLLLL[0]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLJLJ.LIZ(this, LJLLLL[3]);
    }

    private final boolean LJJLIIIJLLLLLLLZ() {
        Effect effect;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            effect = C82398WVm.LIZJ(stickerApiComponent);
        } else {
            effect = null;
        }
        return C44329HaX.LIZ(effect);
    }

    private final void LJLIIL() {
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS86S0100000_7(this, 78));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS86S0100000_7(this, 79));
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS86S0100000_7(this, 80));
        getRecordControlApi().UG().LIZLLL(this, GHZ.LJLIL);
        getRecordControlApi().aL().LIZLLL(this, new AObjectS86S0100000_7(this, 81));
        C78999UzT.LJFF(getRecordControlApi().Pr0().LJJJLIIL(C41726GZe.LJLIL, C73982T1u.LJLIL), this.LJLLJ);
    }

    private final void LJLJJL() {
        LiveEvent<Boolean> sF;
        LiveEvent<T4S> CY;
        LiveEvent<Boolean> B2;
        HYQ LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null && (B2 = LJJLIIIJILLIZJL.B2()) != null) {
            B2.LIZLLL(this, new AObjectS86S0100000_7(this, 82));
        }
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (CY = stickerApiComponent.CY()) != null) {
            CY.LIZLLL(this, new AObjectS86S0100000_7(this, 83));
        }
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (sF = stickerApiComponent2.sF()) != null) {
            sF.LIZLLL(this.LJLJI, new AObjectS86S0100000_7(this, 84));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getFilterApiComponent().getFilterUpdateEvent().LIZLLL(this, new AObjectS86S0100000_7(this, 76));
        getCameraApiComponent().oX().LIZLLL(this, new AObjectS86S0100000_7(this, 77));
        LJLIIL();
        LJLJJL();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLLJ.LIZLLL();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ HYS getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public HYO(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLJJI = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), WRP.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), I37.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), HYQ.class, null);
        this.LJLLI = C269113v.LIZ(this, WSC.class);
        this.LJLLJ = new C73318Sq2();
        this.LJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 302));
    }

    private final void LJJLIIJ(Effect effect) {
        if (effect.getTags() != null) {
            WRP filterApiComponent = getFilterApiComponent();
            List<String> tags = effect.getTags();
            if (tags == null) {
                tags = new ArrayList<>();
            }
            filterApiComponent.setFilterDisable(!tags.contains("disable_beautify_filter"), "build_in");
        }
    }

    private final void LJJLJ(Effect effect) {
        if (HYV.LIZ()) {
            LJJLI().of(this.LJLJJI.cameraComponentModel.mUseBeautyFace, true);
        }
    }

    private final void LJJLJLI(Effect effect) {
        if (HYV.LIZ()) {
            LJJLI().of(this.LJLJJI.cameraComponentModel.mUseBeautyFace, true);
        }
    }

    private final void LJJZZI(Effect effect) {
        LJLJJLL(effect);
        int i = -1;
        if (effect != null && effect.getTypes().contains("StabilizationOff")) {
            if (r4().LIZ) {
                r4().LIZ = false;
                if (C82127WLb.LJ) {
                    i = 0;
                }
                getCameraApiComponent().Bc().LJII(i, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_SHAKE_FREE_PROP_HAVE_STICKER, null));
                getCameraApiComponent().s9(0);
                return;
            }
            return;
        }
        if (r4().LIZ) {
            return;
        }
        r4().LIZ = true;
        boolean z = C82127WLb.LJ;
        boolean z2 = C82127WLb.LJFF;
        if (z != z2) {
            i = z2 ? 1 : 0;
        }
        getCameraApiComponent().Bc().LJII(i, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_SHAKE_FREE_PROP_NOT_STICKER, null));
        getCameraApiComponent().s9(0);
    }

    private final void LJLJJLL(Effect effect) {
        boolean z;
        Boolean LIZ = getRecordControlApi().isRecording().LIZ();
        o.LJIIIIZZ(LIZ, "recordControlApi.isRecording.value");
        if (LIZ.booleanValue()) {
            return;
        }
        if (ID0.LJIJJLI(effect, "camera_front")) {
            if (getCameraApiComponent().getCameraFacing() != 1) {
                getCameraApiComponent().Bc().LJI(C82085WJl.LIZ(), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_PROP_FRONT, null), null);
            }
        } else if (ID0.LJIJJLI(effect, "camera_back")) {
            if (getCameraApiComponent().getCameraFacing() != 0) {
                getCameraApiComponent().Bc().LJI(C82085WJl.LIZIZ(), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_PROP_REAR, null), null);
            }
        } else if (ID0.LIZLLL(effect) && getCameraApiComponent().getCameraFacing() != 0) {
            getCameraApiComponent().Bc().LJI(C82085WJl.LIZIZ(), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_AR_PROP_REAR, null), null);
        }
        this.LJLLILLLL = true;
        InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
        if (effect != null && effect.getTypes() != null && effect.getTypes().contains("AR")) {
            z = true;
        } else {
            z = false;
        }
        cameraApiComponent.VG(!z);
    }

    public final void LJJLIIIJJI(T4S t4s) {
        if (t4s instanceof T4Q) {
            Effect effect = ((T4Q) t4s).LIZ;
            LJJZZI(effect);
            if (ID0.LIZLLL(effect)) {
                LJJLJLI(effect);
                return;
            } else if (effect.getTypes().contains("FaceReplace3D")) {
                LJJLIIJ(effect);
                return;
            } else {
                LJJLJ(effect);
                return;
            }
        }
        if (!(t4s instanceof T4R)) {
            return;
        }
        LJJZZI(null);
        LJJLJ(null);
    }

    public final void LJJLIIIJJIZ(boolean z) {
        if (z) {
            C78928UyK.LIZIZ(false, false, false, getCameraApiComponent());
            return;
        }
        ShortVideoContext shortVideoContext = this.LJLJJI;
        if (shortVideoContext.shootMode == 16) {
            if (shortVideoContext.creativeModel.recordEffectModel.isStoryRecording) {
                return;
            }
            C78928UyK.LIZIZ(true, false, false, getCameraApiComponent());
        } else {
            if (!o.LJ(getRecordControlApi().isRecording().LIZ(), Boolean.FALSE)) {
                return;
            }
            C78928UyK.LIZIZ(true, false, false, getCameraApiComponent());
        }
    }

    public final void LJJLL(C44262HYs c44262HYs) {
        if (o.LJ(c44262HYs.LJLILLLLZI.LJLIL, "live")) {
            WUF wuf = C44172HVg.LJIILLIIL;
            FilterBean filterBean = c44262HYs.LJLIL;
            int LJIJ = TMC.LJIJ(c44262HYs.LJLIL, c44262HYs.LJLILLLLZI.LJLILLLLZI.LJJJJIZL());
            wuf.getClass();
            C2U8.LIZ(new HYR(filterBean, LJIJ));
        }
    }
}
