package X;

import Y.ACallableS56S0300000_7;
import Y.ACallableS6S1000000_7;
import Y.AObjectS17S0310000_7;
import Y.AObjectS86S0100000_7;
import Y.ARunnableS0S2000000_6;
import Y.AfS59S0100000_7;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.beauty.MBeautyStateInfo;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfoCopy;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.audio.IAudioGlitchService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.UniqueLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.audioservice.service.audioglitch.AudioGlitchService;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HXi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44226HXi extends AbstractC29891Fh<HYU> implements HYU, InterfaceC135635Tz {
    public static final HY9 LL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public final C82622Wbi LJLIL;
    public final HYU LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final ShortVideoContext LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final C73318Sq2 LJLLILLLL;
    public C44229HXl LJLLJ;
    public C44232HXo LJLLL;
    public long LJLLLL;
    public IAudioGlitchService LJLLLLLL;
    public long LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final CountDownTimerC44230HXm LJZL;

    static {
        TBT tbt = new TBT(C44226HXi.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLD = new InterfaceC74236TBo[]{tbt, new TBT(C44226HXi.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new TBT(C44226HXi.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C44226HXi.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new TBT(C44226HXi.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new TBT(C44226HXi.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(C44226HXi.class, "stickerMobHelper", "getStickerMobHelper()Lcom/ss/android/ugc/aweme/sticker/mob/IStickerMob;", 0)};
        LL = new HY9();
    }

    public static void LJJLIIIIJ(A90 a90) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a90, new Object[0], "void", new C65300Pk0(false, "()V", "-2512957081985791660")).LIZ) {
            return;
        }
        a90.show();
    }

    private final float LJJLJ(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0.0f;
        }
        float f = 1000;
        return ((((float) j) * 8) / f) / (((float) j2) / f);
    }

    private final String LJJZZIII(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "countdown" : "press" : "click";
    }

    public final boolean LJLLILLLL(int i) {
        return i == 71;
    }

    private final InterfaceC74343TFr LJLJJL() {
        return (InterfaceC74343TFr) this.LJLLI.LIZ(this, LLD[6]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LJLJJI.LIZ(this, LLD[0]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJL.LIZ(this, LLD[2]);
    }

    public final I37 LJJLIIIJJIZ() {
        return (I37) this.LJLJLLL.LIZ(this, LLD[4]);
    }

    public final A90 LJJLL() {
        return (A90) this.LJZI.getValue();
    }

    public final boolean LJJZZI() {
        return ((Boolean) this.LJZ.getValue()).booleanValue();
    }

    public final void LLJI() {
        FaceStickerBean faceStickerBean;
        String id;
        String LIZIZ;
        FaceStickerBean faceStickerBean2;
        I0N stickerApiComponent = getStickerApiComponent();
        Integer num = null;
        if (stickerApiComponent != null) {
            faceStickerBean = stickerApiComponent.Z5();
        } else {
            faceStickerBean = null;
        }
        FilterBean LIZ = getFilterApiComponent().getCurSelectedFilter().LIZ();
        String str = "";
        if (faceStickerBean == null) {
            id = "";
        } else {
            id = faceStickerBean.getId();
        }
        if (LIZ == null) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ.getId());
            LIZ2.append("");
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        InterfaceC83624Wrs e8 = getCameraApiComponent().e8();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LJLJJL.LJI());
        c145995oB.LJI("shoot_way", this.LJLJJL.shootWay);
        c145995oB.LJI("prop_list", id);
        c145995oB.LJI("filter_id_list", LIZIZ);
        c145995oB.LIZ(e8.getFPS(), "fps");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C44228HXk.LIZJ());
        LIZ3.append("");
        c145995oB.LJI("beautify_used", X1D.LIZIZ(LIZ3));
        c145995oB.LJI("beautify_info", C44228HXk.LIZ);
        FMX.LJIIL("video_shoot_page_end", c145995oB.LIZ);
        ShortVideoContext shortVideoContext = this.LJLJJL;
        InterfaceC83865Wvl mediaController = e8.getMediaController();
        InterfaceC83727WtX effectController = e8.getEffectController();
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null) {
            faceStickerBean2 = stickerApiComponent2.Z5();
        } else {
            faceStickerBean2 = null;
        }
        FilterBean LIZ4 = getFilterApiComponent().getCurSelectedFilter().LIZ();
        if (LIZ4 != null) {
            num = Integer.valueOf(LIZ4.getId());
        }
        ComposerBeautyBuriedInfo LJJLIIIJILLIZJL = LJJLIIIJILLIZJL(LJJLIIIJJIZ().f7().r7());
        MBeautyStateInfo LJJLIIIJJI = LJJLIIIJJI(LJJLIIIJJIZ().f7().m7());
        int cameraFacing = getCameraApiComponent().getCameraFacing();
        String LIZLLL = I9T.LIZLLL(this.LJLJJL.creativeModel.musicBuzModel);
        if (LIZLLL != null) {
            str = LIZLLL;
        }
        C43912HLg.LIZIZ(shortVideoContext, mediaController, effectController, faceStickerBean2, num, LJJLIIIJILLIZJL, LJJLIIIJJI, cameraFacing, "exit_record_page", str, this.LJLZ, C44234HXq.LJLIL);
        C42562Gn8.LIZIZ.LIZ(this.LJLJJL.LJI());
    }

    public final void LLJJIJI() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LJLJJL.LJI());
        c145995oB.LJI("shoot_way", this.LJLJJL.shootWay);
        c145995oB.LJI("content_type", "video");
        c145995oB.LJI("prop_list", RecordScene.getStickerIdsByModel(this.LJLJJL.cameraComponentModel.mDurings));
        c145995oB.LJI("filter_id_list", this.LJLJJL.cameraComponentModel.recordContext.filterIds.toString());
        c145995oB.LIZ(getCameraApiComponent().e8().getFPS(), "fps");
        c145995oB.LJ("reshoot", this.LJLJJL.cameraComponentModel.isRetakeMode);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C44228HXk.LIZJ());
        LIZ.append("");
        c145995oB.LJI("beautify_used", X1D.LIZIZ(LIZ));
        c145995oB.LJI("beautify_info", C44228HXk.LIZ);
        FMX.LJIIL("video_record_end", c145995oB.LIZ);
    }

    public final WRQ getCameraApiComponent() {
        return (WRQ) this.LJLJJLL.LIZ(this, LLD[1]);
    }

    public final WRP getFilterApiComponent() {
        return (WRP) this.LJLJLJ.LIZ(this, LLD[3]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLL.LIZ(this, LLD[5]);
    }

    private final I27 LJJLIIIJLLLLLLLZ() {
        return getRecordAdapterApi().cE().LIZ();
    }

    private final void LJLJLJ() {
        A90 LJJLL = LJJLL();
        if (LJJLL != null) {
            LJJLL.LIZLLL(0.0f);
            LJJLIIIIJ(LJJLL);
        }
        this.LJZL.start();
    }

    private final void LJLZ() {
        LJJLIIIJJIZ().Hg0().LIZLLL(this, new AObjectS86S0100000_7(this, 87));
    }

    private final void LJZI() {
        if (HC7.LIZ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("prop_type_name", "beauty_filter");
            c145995oB.LJI("shoot_way", this.LJLJJL.shootWay);
            c145995oB.LJI("creation_id", this.LJLJJL.LJI());
            C10K.LIZJ(new ACallableS56S0300000_7(new C43910HLe(getDiContainer(), getCameraApiComponent()), c145995oB, new AqS157S0100000_7(c145995oB, 306), 14));
        }
    }

    private final void LLIFFJFJJ() {
        this.LJLLLLLL = AudioGlitchService.LIZ();
        boolean LJJJI = this.LJLJJL.LJJJI();
        VERecorder LJ = getCameraApiComponent().rX().LJ();
        VEAudioCapture LJFF = getCameraApiComponent().e8().t9().getAudioController().LJFF();
        getRecordControlApi().w90().LIZLLL(this, new AObjectS17S0310000_7(this, LJFF, LJJJI, LJ, 0));
        getRecordControlApi().aL().LIZLLL(this, new AObjectS17S0310000_7(this, LJFF, LJJJI, LJ, 1));
        getRecordControlApi().kX().LIZLLL(this, new AObjectS86S0100000_7(this, 88));
        getRecordControlApi().cr().LIZLLL(this, new AObjectS86S0100000_7(this, 89));
        getRecordControlApi().Ra0().LIZLLL(this, new AObjectS86S0100000_7(this, 90));
        getCameraApiComponent().kw().LIZLLL(this, new AObjectS86S0100000_7(this, 91));
        getRecordControlApi().Fh0().LIZLLL(this, new AObjectS86S0100000_7(this, 92));
        C78999UzT.LJFF(getRecordControlApi().NX().LJJJLIIL(new AfS59S0100000_7(this, 11), C73982T1u.LJLIL), this.LJLLILLLL);
    }

    private final void LLIIIL() {
        TEZ LLLLL;
        InterfaceC74393THp LJJJJLL;
        InterfaceC74528TMu LJIJJLI;
        C73426Srm LIZLLL;
        TEZ LLLLL2;
        InterfaceC74301TEb LJIIIIZZ;
        MutableLiveData LJII;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (LLLLL2 = stickerApiComponent.LLLLL()) != null && (LJIIIIZZ = LLLLL2.LJIIIIZZ()) != null && (LJII = LJIIIIZZ.LJII()) != null) {
            LJII.observe(this, new AObjectS86S0100000_7(this, 93));
        }
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (LLLLL = stickerApiComponent2.LLLLL()) != null && (LJJJJLL = LLLLL.LJJJJLL()) != null && (LJIJJLI = LJJJJLL.LJIJJLI()) != null && (LIZLLL = LJIJJLI.LIZLLL()) != null) {
            C78999UzT.LJFF(LIZLLL.LJJIFFI(new C44235HXr(this)).LJJJLIIL(new AfS59S0100000_7(this, 12), C73982T1u.LJLIL), this.LJLLILLLL);
        }
    }

    private final void LLILZLL() {
        AbstractC73672Svk<OSZ<Effect, C44243HXz>> ua0;
        LiveEvent<T4S> CY;
        LiveEvent<HY8> aZ;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (aZ = stickerApiComponent.aZ()) != null) {
            aZ.LIZLLL(this, new AObjectS86S0100000_7(this, 94));
        }
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (CY = stickerApiComponent2.CY()) != null) {
            CY.LIZLLL(this, new AObjectS86S0100000_7(this, 95));
        }
        I0N stickerApiComponent3 = getStickerApiComponent();
        if (stickerApiComponent3 != null && (ua0 = stickerApiComponent3.ua0()) != null) {
            C78999UzT.LJFF(ua0.LJJJLIIL(new AfS59S0100000_7(this, 13), C73982T1u.LJLIL), this.LJLLILLLL);
        }
    }

    private final void LLJJ() {
        getCameraApiComponent().e8().LLLZI(new IAP((InterfaceC81640W2i) getDiContainer().LJIIIIZZ(null, InterfaceC81640W2i.class), this, EnumC45994I3i.NORMAL, new C44227HXj(this)));
    }

    private final C6UV getInfiniStickerApi() {
        return getRecordAdapterApi().hQ().LIZ();
    }

    public final void LLJJIJIL() {
        FaceStickerBean faceStickerBean;
        Object obj;
        String str;
        String str2;
        Object obj2;
        String LLJLIL;
        String str3;
        Integer num;
        String str4;
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        CreativeInfo creativeInfo = this.LJLJJL.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        String LJIIIIZZ = C164746dK.LJIIIIZZ(LIZIZ, creativeInfo, 6);
        String LJI = this.LJLJJL.LJI();
        if (LJIIIIZZ != null && LJIIIIZZ.length() != 0) {
            GUL.LIZ.execute(new ARunnableS0S2000000_6(LJIIIIZZ, LJI, 0));
        }
        InterfaceC83624Wrs e8 = getCameraApiComponent().e8();
        ComposerBeautyBuriedInfo LJJLIIIJILLIZJL = LJJLIIIJILLIZJL(LJJLIIIJJIZ().f7().r7());
        MBeautyStateInfo LJJLIIIJJI = LJJLIIIJJI(LJJLIIIJJIZ().f7().m7());
        long j = 1000;
        long endFrameTimeUS = e8.getEndFrameTimeUS() / j;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            faceStickerBean = stickerApiComponent.Z5();
        } else {
            faceStickerBean = null;
        }
        String str5 = "";
        if (HY1.LIZ != null && HY1.LIZIZ != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", this.LJLJJL.LIZLLL().getCreationId());
            c145995oB.LJI("content_type", this.LJLJJL.LIZLLL().getContentType());
            c145995oB.LJI("content_source", this.LJLJJL.LIZLLL().getContentSource());
            c145995oB.LIZ(this.LJLJJL.shootMode, "record_mode");
            Integer num2 = HY1.LIZ;
            o.LJI(num2);
            c145995oB.LIZ(num2.intValue(), "record_block_tms");
            Integer num3 = HY1.LIZIZ;
            o.LJI(num3);
            c145995oB.LIZ(num3.intValue(), "record_block_duration");
            c145995oB.LIZIZ(e8.getEndFrameTimeUS() / j, "record_duration");
            c145995oB.LIZ(C44228HXk.LJIIIIZZ(LJJLIIIJILLIZJL), "is_composer");
            c145995oB.LIZ(C44228HXk.LIZJ(), "beautify_used");
            c145995oB.LJI("beautify_info", C44228HXk.LJII(LJJLIIIJILLIZJL));
            FilterBean LIZ = getFilterApiComponent().getCurSelectedFilter().LIZ();
            if (LIZ != null) {
                num = Integer.valueOf(LIZ.getId());
            } else {
                num = null;
            }
            c145995oB.LJI("filter_id", LLJLLIL(num));
            if (faceStickerBean == null || (str4 = Long.valueOf(faceStickerBean.getStickerId()).toString()) == null) {
                str4 = "";
            }
            c145995oB.LJI("prop_id", str4);
            c145995oB.LIZ(LJJLIIIJJIZ().d3(), "eyes");
            c145995oB.LIZ(LJJLIIIJJIZ().B1(), "smooth");
            FMX.LJIIL("video_record_block", c145995oB.LIZ);
            HY1.LIZ = null;
            HY1.LIZIZ = null;
        }
        String[] P8 = e8.getMediaController().P8();
        if (P8 == null || P8.length == 0) {
            obj = "";
        } else {
            obj = Float.valueOf(LJJLJ(LJJLJLI(P8[P8.length - 1]), endFrameTimeUS));
        }
        FilterBean LIZ2 = getFilterApiComponent().getCurSelectedFilter().LIZ();
        C145995oB c145995oB2 = new C145995oB();
        c145995oB2.LIZIZ(this.LJLJJL.cameraComponentModel.LIZLLL(), "source_duration");
        c145995oB2.LJI("creation_id", this.LJLJJL.LJI());
        c145995oB2.LJI("shoot_way", this.LJLJJL.shootWay);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this.LJLJJL.cameraComponentModel.mVideoWidth);
        LIZ3.append('*');
        LIZ3.append(this.LJLJJL.cameraComponentModel.mVideoHeight);
        c145995oB2.LJI("resolution", X1D.LIZIZ(LIZ3));
        if (faceStickerBean == null || (str = faceStickerBean.getId()) == null) {
            str = "";
        }
        c145995oB2.LJI("effect_id", str);
        if (faceStickerBean == null || (str2 = faceStickerBean.getRecId()) == null) {
            str2 = "";
        }
        c145995oB2.LJI("effect_rec_id", str2);
        if (faceStickerBean == null) {
            obj2 = "";
        } else {
            obj2 = Long.valueOf(faceStickerBean.getStickerId());
        }
        c145995oB2.LIZJ(obj2, "effect_sticker_id");
        if (LIZ2 == null) {
            LLJLIL = "";
        } else {
            LLJLIL = LLJLIL(LIZ2.getId());
        }
        c145995oB2.LJI("filter_id", LLJLIL);
        c145995oB2.LIZ(C44228HXk.LIZIZ(LJJLIIIJILLIZJL, LJJLIIIJJI), "beauty_status");
        c145995oB2.LIZ(e8.getMediaController().C8(), "lag_count");
        c145995oB2.LIZ(e8.getMediaController().H8(), "lag_max");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(e8.getMediaController().Y8());
        LIZ4.append("");
        c145995oB2.LJI("fps", X1D.LIZIZ(LIZ4));
        c145995oB2.LIZ(e8.getMediaController().K8(), "serious_lag_count");
        c145995oB2.LIZJ(obj, "file_bitrate");
        c145995oB2.LJI("bitrate", String.valueOf(C44739Hh9.LJI(false)));
        c145995oB2.LIZ(e8.getMediaController().V8(), "lag_total_duration");
        c145995oB2.LIZIZ(endFrameTimeUS, "duration");
        c145995oB2.LIZIZ(endFrameTimeUS, "creation_duration");
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(e8.getMediaController().e9());
        LIZ5.append("");
        c145995oB2.LJI("write_fps", X1D.LIZIZ(LIZ5));
        c145995oB2.LIZ(e8.getMediaController().U8(), "frame_total");
        c145995oB2.LIZJ(Float.valueOf(e8.getMediaController().F8()), "n_camera_frame_interval");
        c145995oB2.LIZJ(Float.valueOf(e8.getMediaController().Z8()), "n_preview_frame_interval");
        c145995oB2.LIZJ(Float.valueOf(e8.getMediaController().W8()), "n_record_frame_interval");
        c145995oB2.LJI("camera", C78880UxY.LJJIJIIJI(getCameraApiComponent().getCameraFacing()));
        c145995oB2.LIZ(C44228HXk.LIZJ(), "beautify_used");
        c145995oB2.LJI("beautify_info", C44228HXk.LJII(LJJLIIIJILLIZJL));
        c145995oB2.LIZ(C44228HXk.LJIIIIZZ(LJJLIIIJILLIZJL), "is_composer");
        if (faceStickerBean == null || (str3 = faceStickerBean.getResourceID()) == null) {
            str3 = "";
        }
        c145995oB2.LJI("resource_id", str3);
        String LIZLLL = I9T.LIZLLL(this.LJLJJL.creativeModel.musicBuzModel);
        if (LIZLLL != null) {
            str5 = LIZLLL;
        }
        c145995oB2.LJI("music_id", str5);
        C78939UyV.LIZLLL(c145995oB2, e8.getEffectController());
        C44989HlB.LIZ(c145995oB2);
        java.util.Map<String, String> map = c145995oB2.LIZ;
        o.LJIIIIZZ(map, "eventMapBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_video_record", map);
        G8G.LIZ.LIZJ("tool_performance_video_record", new AqS157S0100000_7(e8, 305));
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLIFFJFJJ();
        LLJJ();
        getCameraApiComponent().AJ().LIZIZ(this, new AObjectS86S0100000_7(this, 96));
        getCameraApiComponent().eX().LIZLLL(this, new AObjectS86S0100000_7(this, 86));
        getCameraApiComponent().rX().getCameraController().LJII(new HY2(this));
        Bundle LIZ = C44231HXn.LIZ(this.LJLJI, getDiContainer());
        long j = 0;
        if (LIZ != null) {
            j = LIZ.getLong("extra_start_record_time", 0L);
        }
        this.LJLLL = new C44232HXo(j);
        LJLZ();
        LLILZLL();
        LLIIIL();
        if (LIZ != null && LIZ.getBoolean("show_preloading_dialog", false) && C78605Ut7.LJFF("android.permission.CAMERA")) {
            LJLJLJ();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLLILLLL.LIZLLL();
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        VERecorder LJ = getCameraApiComponent().rX().LJ();
        VEAudioCapture LJFF = getCameraApiComponent().e8().t9().getAudioController().LJFF();
        IAudioGlitchService iAudioGlitchService = this.LJLLLLLL;
        if (iAudioGlitchService != null) {
            iAudioGlitchService.enableRecordGlitchInShootScene(LJFF, false);
        }
        IAudioGlitchService iAudioGlitchService2 = this.LJLLLLLL;
        if (iAudioGlitchService2 != null) {
            iAudioGlitchService2.enablePlayGlitchInShootScene(LJ, false);
        }
    }

    @Override // X.HYU
    public long dx() {
        return this.LJLZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ HYU getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C44226HXi(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LJLJJL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), WRP.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), I37.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), InterfaceC74343TFr.class, null);
        this.LJLLILLLL = new C73318Sq2();
        this.LJZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 308));
        this.LJZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 303));
        this.LJZL = new CountDownTimerC44230HXm(this);
    }

    private final String LJJLIIJ(int i) {
        ShortVideoContext shortVideoContext = this.LJLJJL;
        int i2 = shortVideoContext.shootMode;
        if (i2 == 8 || i2 == 18 || i2 == 10 || i2 == 11 || i2 == 14 || i2 == 15) {
            return "video";
        }
        return shortVideoContext.LIZLLL().getContentType();
    }

    private final long LJJLJLI(String str) {
        if (str == null || str.length() <= 0) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile() || file.length() <= 0) {
            return 0L;
        }
        return file.length();
    }

    private final String LJLIIL(int i) {
        int i2 = this.LJLJJL.shootMode;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 8) {
                    return "video";
                }
                if (i2 != 18) {
                    if (i2 != 10) {
                        if (i2 != 11) {
                            if (i2 != 14) {
                                if (i2 == 15) {
                                    return "video";
                                }
                                return "";
                            }
                            return "video_180";
                        }
                        return "video_60";
                    }
                    return "video_15";
                }
                return "video_600";
            }
            return "press";
        }
        return "click";
    }

    private final void LLIILZL(C145995oB c145995oB) {
        Long l;
        String str;
        FaceStickerBean Z5;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (Z5 = stickerApiComponent.Z5()) != null) {
            l = Long.valueOf(Z5.getStickerId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        ShortVideoContext shortVideoContext = this.LJLJJL;
        if (shortVideoContext.stickersFromDraftVideos != null && ujb.o.LJJJJIZL(shortVideoContext.shootWay, "draft_again", false) && !TextUtils.isEmpty(valueOf)) {
            int indexOf = TextUtils.indexOf(this.LJLJJL.stickersFromDraftVideos, valueOf);
            if (indexOf != -1) {
                if (indexOf != 0) {
                    str = "other";
                } else {
                    str = "first";
                }
            } else {
                str = "not_drafts";
            }
            c145995oB.LIZLLL("prop_from", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void LLILZIL(C145995oB c145995oB) {
        FaceStickerBean Z5;
        C44236HXs c44236HXs;
        TEZ LLLLL;
        InterfaceC74301TEb LJIIIIZZ;
        UniqueLiveData LJFF;
        HY3 hy3;
        I0N stickerApiComponent;
        TEZ LLLLL2;
        TEZ LLLLL3;
        InterfaceC74301TEb LJIIIIZZ2;
        MutableLiveData LJII;
        I0N stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 == null || (Z5 = stickerApiComponent2.Z5()) == null) {
            return;
        }
        I0N stickerApiComponent3 = getStickerApiComponent();
        if (stickerApiComponent3 != null && (LLLLL3 = stickerApiComponent3.LLLLL()) != null && (LJIIIIZZ2 = LLLLL3.LJIIIIZZ()) != null && (LJII = LJIIIIZZ2.LJII()) != null) {
            c44236HXs = (C44236HXs) LJII.getValue();
        } else {
            c44236HXs = null;
        }
        if (c44236HXs == null && (stickerApiComponent = getStickerApiComponent()) != null && (LLLLL2 = stickerApiComponent.LLLLL()) != null) {
            LLLLL2.LJI();
            c145995oB.LIZLLL("prop_impr_position", "");
        }
        I0N stickerApiComponent4 = getStickerApiComponent();
        if (stickerApiComponent4 == null || (LLLLL = stickerApiComponent4.LLLLL()) == null || (LJIIIIZZ = LLLLL.LJIIIIZZ()) == null || (LJFF = LJIIIIZZ.LJFF()) == null || (hy3 = (HY3) LJFF.getValue()) == null || c44236HXs == null || c44236HXs.LJLJJI || o.LJ(Z5, FaceStickerBean.NONE)) {
            return;
        }
        int i = hy3.LJLIL;
        if (i >= 0) {
            c145995oB.LIZLLL("prop_tab_order", String.valueOf(i));
        }
        int i2 = c44236HXs.LJLJI + 1;
        if (i2 < 0) {
            return;
        }
        c145995oB.LIZLLL("prop_impr_position", String.valueOf(i2));
    }

    public final ComposerBeautyBuriedInfo LJJLIIIJILLIZJL(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy) {
        ComposerBeautyBuriedInfo out = (ComposerBeautyBuriedInfo) C78880UxY.LJJIIZI(C78880UxY.LJLILLLLZI(composerBeautyBuriedInfoCopy), ComposerBeautyBuriedInfo.class);
        o.LJIIIIZZ(out, "out");
        return out;
    }

    public final MBeautyStateInfo LJJLIIIJJI(MBeautyStateInfoCopy mBeautyStateInfoCopy) {
        MBeautyStateInfo out = (MBeautyStateInfo) C78880UxY.LJJIIZI(C78880UxY.LJLILLLLZI(mBeautyStateInfoCopy), MBeautyStateInfo.class);
        o.LJIIIIZZ(out, "out");
        return out;
    }

    public final void LJLJJLL(T4S t4s) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        String str6;
        Boolean bool;
        AVChallenge aVChallenge;
        AVChallenge aVChallenge2;
        I27 LJJLIIIJLLLLLLLZ;
        AVMusic currentMusic;
        A90 LJJLL = LJJLL();
        if (LJJLL != null) {
            V1B.LJLILLLLZI(LJJLL);
        }
        this.LJLLLL = System.currentTimeMillis();
        Effect LIZ = t4s.LIZ();
        if (LIZ != null) {
            str = LIZ.getEffectId();
        } else {
            str = null;
        }
        C44422Hc2.LIZ("sticker_id", str);
        if (LIZ != null) {
            str2 = LIZ.getResourceId();
        } else {
            str2 = null;
        }
        C44422Hc2.LIZ("resource_id", str2);
        if (LIZ != null) {
            str3 = LIZ.getEffectId();
        } else {
            str3 = null;
        }
        C46104I7o.LJJJI(str3, 5);
        if (LIZ != null) {
            str4 = LIZ.getResourceId();
        } else {
            str4 = null;
        }
        C46104I7o.LJJJI(str4, 6);
        if (LIZ != null) {
            str5 = LIZ.getEffectId();
        } else {
            str5 = null;
        }
        C46104I7o.LJJJI(str5, 7);
        if (LIZ != null && LIZ.isBusiness() && C77413UZt.LJIILL(this.LJLJJL.cameraComponentModel.mDurings) && ((LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ()) == null || (currentMusic = LJJLIIIJLLLLLLLZ.getCurrentMusic()) == null || !currentMusic.isCommerceMusic())) {
            I9T.LJI(null, false, this.LJLJJL.creativeModel.musicBuzModel);
            I27 LJJLIIIJLLLLLLLZ2 = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ2 != null) {
                LJJLIIIJLLLLLLLZ2.handleCancelMusicResultEvent();
            }
            I27 LJJLIIIJLLLLLLLZ3 = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ3 != null) {
                LJJLIIIJLLLLLLLZ3.changeHasMusic(null);
            }
        }
        if (t4s instanceof T4R) {
            C41660GWq.LIZ = false;
            this.LJLJJL.creativeModel.commerceModel.setShowedCommerceTransformButton(false);
            this.LJLJJL.creativeModel.commerceModel.setShowedCommerceTransformBottomButton(false);
        } else {
            if (LIZ != null && LIZ.isBusiness()) {
                z = true;
            } else {
                z = false;
            }
            C41660GWq.LIZ = z;
        }
        if (LIZ != null && LIZ.getEffectType() != 1) {
            boolean z3 = t4s instanceof T4Q;
            if (z3 && ORY.LJJIJIIJIL(((T4Q) t4s).LIZJ, new EnumC44267HYx[]{EnumC44267HYx.MANUAL_SET, EnumC44267HYx.UI_CLICK})) {
                z2 = true;
            } else {
                z2 = false;
            }
            CommerceToolsStickerServiceImpl.LJIIL().LJIIJJI(this.LJLJJL, LIZ, z3, z2);
            ICommerceToolsStickerService LJIIL = CommerceToolsStickerServiceImpl.LJIIL();
            ShortVideoContext shortVideoContext = this.LJLJJL;
            List<AVChallenge> list = C41658GWo.LIZLLL().LIZ;
            if (list != null && (aVChallenge2 = (AVChallenge) ORZ.LJLLLL(list)) != null) {
                str6 = aVChallenge2.cid;
            } else {
                str6 = null;
            }
            String effectId = LIZ.getEffectId();
            if (effectId == null) {
                effectId = "";
            }
            List<AVChallenge> list2 = C41658GWo.LIZLLL().LIZ;
            if (list2 != null && (aVChallenge = (AVChallenge) ORZ.LJLLLL(list2)) != null) {
                bool = Boolean.valueOf(aVChallenge.isCommerce);
            } else {
                bool = null;
            }
            LJIIL.LJI(shortVideoContext, z2, str6, effectId, bool);
        }
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            stickerApiComponent.uc0(false);
        }
        if (HYC.LIZ) {
            ((C83113Wjd) getDiContainer().LJ(C83113Wjd.class, null)).Gf0();
        }
    }

    public final void LJLLL(C45314HqQ c45314HqQ) {
        if (C43846HIs.LIZ(this.LJLJJL) || this.LJLJJL.LJJIJIIJI()) {
            int i = c45314HqQ.LJLIL;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LJJLI(this.LJLJJL, "off");
                return;
            }
            LJJLI(this.LJLJJL, "on");
        }
    }

    public final void LLFFF(Effect effect) {
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ("enter_from", "video_shoot_page");
        String str = this.LJLJJL.shootWay;
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("shoot_way", str);
        oszArr[2] = new OSZ("creation_id", this.LJLJJL.LJI());
        oszArr[3] = new OSZ("content_source", this.LJLJJL.LIZLLL().getContentSource());
        oszArr[4] = new OSZ("content_type", this.LJLJJL.LIZLLL().getContentType());
        oszArr[5] = new OSZ("tab_name", FaceStickerBean.sCurPropSource);
        oszArr[6] = new OSZ("prop_id", effect.getEffectId());
        GXR.LIZ("light_warn_notice_show", C113554cx.LJJJLZIJ(oszArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0877  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJI(X.C44237HXt r26) {
        /*
            Method dump skipped, instructions count: 2614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44226HXi.LLJJI(X.HXt):void");
    }

    public final void LLJJJIL(int i) {
        C43045Guv.LIZLLL(new HYP(i, getCameraApiComponent().LLFZ(), this), 0L);
    }

    public final String LLJLIL(int i) {
        if (i == 0) {
            return "-1";
        }
        return String.valueOf(i);
    }

    public final String LLJLLIL(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 0) {
                return "-1";
            }
            String num2 = num.toString();
            if (num2 != null) {
                return num2;
            }
        }
        return "";
    }

    private final void LJJLI(ShortVideoContext shortVideoContext, String str) {
        String str2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "video");
        c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("to_status", str);
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("shoot_entrance", shortVideoContext.shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (shortVideoContext.mIsFromDraft) {
            str2 = "click_draft";
        } else {
            str2 = "";
        }
        c145995oB.LJI("enter_method", str2);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(shortVideoContext.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", shortVideoContext.newDraftId);
        }
        if (shortVideoContext.creativeModel.reuseSoundAndEffectModel.isFromReuseMusic()) {
            c145995oB.LIZLLL("music_selected_from", "previous_video_reuse");
        }
        if (shortVideoContext.creativeModel.reuseSoundAndEffectModel.isMusicFromDiscoveryPage()) {
            c145995oB.LIZLLL("music_selected_from", "prop_panel_discovery");
        }
        FMX.LJIIL("mute_microphone", c145995oB.LIZ);
    }

    private final void LLJJIII(int i, String str) {
        C43045Guv.LIZLLL(new AqS157S0100000_7(this, 304), 0L);
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("resource_name", str);
        LJJIIZI.LJIIL(i, "3d_sticker_show_rate", c6bk.LJ());
        C145995oB LIZIZ = GFJ.LIZIZ(i, "status");
        LIZIZ.LJI("resource_name", str);
        GXR.LIZ("3d_sticker_show_rate", LIZIZ.LIZ);
        this.LJLLLL = 0L;
    }

    public final void LLF(String str, long j) {
        CameraComponentModel zZ = getCameraApiComponent().zZ();
        C6BK c6bk = new C6BK();
        c6bk.LIZLLL("error_type", str);
        c6bk.LIZJ(Long.valueOf(j), "error_duration");
        c6bk.LIZIZ(Integer.valueOf(zZ.mDurings.size()), "segment_count");
        File y = zZ.mWorkspace.y();
        o.LJIIIIZZ(y, "cameraComponentModel.mWorkspace.recordingDirectory");
        if (y.isDirectory()) {
            c6bk.LIZLLL("file_path", C78857UxB.LJJJJ(y.list()));
        }
        C60903NvH.LJIIJJI().LJJIIZI().LJIJ("aweme_draft_edit_error", c6bk.LJ());
    }

    private final void LLIIZ(Effect effect, int i, boolean z) {
        C44232HXo c44232HXo;
        I0N stickerApiComponent;
        TEZ LLLLL;
        Effect LLJJIJIIJIL;
        int i2;
        int i3;
        int i4;
        if (i == 17 && (c44232HXo = this.LJLLL) != null && (stickerApiComponent = getStickerApiComponent()) != null && (LLLLL = stickerApiComponent.LLLLL()) != null && (LLJJIJIIJIL = LLLLL.LLJJIJIIJIL()) != null && effect != null && ujb.o.LJJJJIZL(LLJJIJIIJIL.getEffect_id(), effect.getEffect_id(), true)) {
            HYA V9 = getCameraApiComponent().e8().getEffectController().V9();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZIZ(System.currentTimeMillis() - c44232HXo.LIZ, "duration");
            c145995oB.LIZ(!z ? 1 : 0, "status");
            c145995oB.LJI("prop_id", effect.getEffect_id());
            c145995oB.LJI("shoot_way", this.LJLJJL.shootWay);
            if (V9 != null) {
                i2 = V9.LIZ;
            } else {
                i2 = 0;
            }
            c145995oB.LIZ(i2, "lag_count");
            if (V9 != null) {
                i3 = V9.LIZIZ;
            } else {
                i3 = 0;
            }
            c145995oB.LIZ(i3, "lag_total_duration");
            if (V9 != null) {
                i4 = V9.LIZJ;
            } else {
                i4 = 0;
            }
            c145995oB.LIZ(i4, "sticker_duration");
            if (ujb.o.LJJJJIZL(this.LJLJJL.shootWay, "direct_shoot", false)) {
                c145995oB.LIZLLL("type", "plus");
            }
            GXR.LIZ("tool_performance_prop_reuse_apply_time", c145995oB.LIZ);
            this.LJLLL = null;
        }
    }

    private final void LLJ(Effect effect, int i, boolean z, int i2) {
        C44229HXl c44229HXl;
        Effect effect2;
        int i3;
        int i4;
        if (i == 17 && (c44229HXl = this.LJLLJ) != null && (effect2 = c44229HXl.LIZ) != null && effect != null && ujb.o.LJJJJIZL(effect2.getEffect_id(), effect.getEffect_id(), true)) {
            HYA V9 = getCameraApiComponent().e8().getEffectController().V9();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZIZ(SystemClock.elapsedRealtime() - c44229HXl.LIZIZ, "duration");
            c145995oB.LIZ(c44229HXl.LIZJ, "hit_cache");
            c145995oB.LIZ(1 ^ (c44229HXl.LJ ? 1 : 0), "status");
            c145995oB.LIZ(c44229HXl.LIZLLL ? 1 : 0, "is_auto_download");
            c145995oB.LJI("prop_id", c44229HXl.LIZ.getEffect_id());
            int i5 = 0;
            if (V9 != null) {
                i3 = V9.LIZ;
            } else {
                i3 = 0;
            }
            c145995oB.LIZ(i3, "lag_count");
            if (V9 != null) {
                i4 = V9.LIZIZ;
            } else {
                i4 = 0;
            }
            c145995oB.LIZ(i4, "lag_total_duration");
            if (V9 != null) {
                i5 = V9.LIZJ;
            }
            c145995oB.LIZ(i5, "sticker_duration");
            c145995oB.LIZ(this.LJLJJL.isCarouselOpen ? 1 : 0, "is_from_carousel");
            c145995oB.LJ("prop_apply_status", z);
            c145995oB.LIZ(i2, "prop_apply_status_code");
            c145995oB.LJI("prop_type_name", "effect");
            if (HC7.LIZ()) {
                C10K.LIZJ(new ACallableS56S0300000_7(new C43910HLe(getDiContainer(), getCameraApiComponent()), c145995oB, new AqS157S0100000_7(c145995oB, 307), 15));
            } else {
                GXR.LIZ("tool_performance_prop_apply_total", c145995oB.LIZ);
            }
            this.LJLLJ = null;
        }
    }

    private final void LLIZ(Effect effect, int i, int i2, int i3, String str) {
        String str2;
        String str3;
        if (i != 17) {
            return;
        }
        if (i2 == 9) {
            if (i3 == 3) {
                if (effect != null && (str3 = effect.getEffectId()) != null) {
                    InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("sticker_id: ");
                    LIZ.append(str3);
                    LJJIIZI.LJ(X1D.LIZIZ(LIZ));
                } else {
                    str3 = "";
                }
                long currentTimeMillis = System.currentTimeMillis() - this.LJLLLL;
                InterfaceC170656mr LJJIIZI2 = C60903NvH.LJIIJJI().LJJIIZI();
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("duration", Long.valueOf(currentTimeMillis));
                LJJIIZI2.LJIJ("type_av_sticker_show_time", c6bk.LJ());
                InterfaceC74343TFr LJLJJL = LJLJJL();
                if (LJLJJL != null) {
                    LJLJJL.LJII(currentTimeMillis, str3);
                }
                C60903NvH.LJIIJJI().LJJIIZI().LJIIL(0, "3d_sticker_show_rate", null);
                GXR.LIZ("3d_sticker_show_rate", GFJ.LIZIZ(0, "status").LIZ);
                this.LJLLLL = 0L;
                return;
            }
            return;
        }
        if (i2 == 4) {
            if (effect != null) {
                str2 = effect.getUnzipPath();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C10K.LIZIZ(new ACallableS6S1000000_7(str2, 2), C38995FSd.LIZLLL(), null);
            }
        } else if (i2 == 3 || i2 == 9 || i2 == 10) {
            return;
        }
        LLJJIII(i2, str);
    }

    public final void LLJJL(Effect effect, int i, int i2, int i3, String str) {
        String str2;
        InterfaceC44306HaA LJFF = Z9N.LIZIZ.LJFF();
        String str3 = null;
        if (effect != null) {
            str2 = effect.getEffectId();
            str3 = effect.getOriginal_effect_id();
        } else {
            str2 = null;
        }
        LJFF.LJIILJJIL(str2, str3);
        if (i == 17) {
            LLIZ(effect, i, i2, i3, str);
            if (i2 == 9) {
                if (i3 == 3) {
                    LLJ(effect, i, true, i3);
                    LLIIZ(effect, i, true);
                    this.LJZL.cancel();
                }
            } else if (i2 == 10) {
                LJZI();
            } else if (i2 == 4) {
                LLJ(effect, i, false, i3);
            }
        }
        A90 LJJLL = LJJLL();
        if (LJJLL != null) {
            V1B.LJLILLLLZI(LJJLL);
        }
    }

    public static /* synthetic */ void LLILL(C44226HXi c44226HXi, Effect effect, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c44226HXi.LLIIZ(effect, i, z);
    }
}
