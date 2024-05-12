package X;

import Y.AObserverS75S0100000_7;
import android.content.Intent;
import android.os.Handler;
import android.view.KeyEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommercePhotoSearchModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HTl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44125HTl extends AbstractC29891Fh<I4U> implements I4U, InterfaceC135635Tz, C5HC {
    public static final C44133HTt LLII;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public final WMH LJLIL;
    public final int LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final I4U LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final ShortVideoContextViewModel LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final ChooseMediaViewModel LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public InterfaceC45540Hu4 LJLLLL;
    public boolean LJLLLLLL;
    public C45903Hzv LJLZ;
    public final HTN LJZ;
    public ProgressDialogC43239Gy3 LJZI;
    public long LJZL;
    public long LL;
    public final C44131HTr LLD;
    public final Integer LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;
    public boolean LLFII;
    public final C5H3 LLFZ;
    public Runnable LLI;
    public InterfaceC92693kP LLIFFJFJJ;

    public static void LJJLIIIIJ(ProgressDialogC43239Gy3 progressDialogC43239Gy3) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy3, new Object[0], "void", new C65300Pk0(false, "()V", "3293162612041646813")).LIZ) {
            return;
        }
        progressDialogC43239Gy3.show();
    }

    static {
        TBT tbt = new TBT(C44125HTl.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt, new TBT(C44125HTl.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C44125HTl.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C44125HTl.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new TBT(C44125HTl.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0), new TBT(C44125HTl.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new TBT(C44125HTl.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new TBT(C44125HTl.class, "extendAlbumApiComponent", "getExtendAlbumApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ecom/search/ExtendAlbumApiComponent;", 0)};
        LLII = new C44133HTt();
    }

    private final InterfaceC45891Hzj LJJLIIIJJIZ() {
        return (InterfaceC45891Hzj) this.LJLJLJ.LIZ(this, LLIIII[3]);
    }

    private final HXE LJJLIIIJLLLLLLLZ() {
        return (HXE) this.LJLL.LIZ(this, LLIIII[4]);
    }

    private final TuxTextView LJJLJLI() {
        return (TuxTextView) this.LLFFF.getValue();
    }

    private final Handler LJJLL() {
        return (Handler) this.LLFZ.getValue();
    }

    private final void LJLJJL() {
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJLLLL;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.registerActivityOnKeyDownListener(this);
        }
        getCameraApiComponent().jL().LIZJ(I0E.EXTERIOR_PREVIEW_SCENE, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_ECOMMERCE_VIDEO_PREVIEW, EnumC158826Le.PAGE_INVISIBLE));
    }

    private final void LJLJJLL() {
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJLLLL;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this);
        }
        getCameraApiComponent().jL().LIZIZ(I0E.EXTERIOR_PREVIEW_SCENE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_ECOMMERCE, HX4.SHOOT));
    }

    private final void LJLLL() {
        Runnable runnable = this.LLI;
        if (runnable != null) {
            LJJLL().removeCallbacks(runnable);
        }
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLLILLLL.LIZ(this, LLIIII[6]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LLIIII[0]);
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLLI.LIZ(this, LLIIII[5]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJJLL.LIZ(this, LLIIII[1]);
    }

    public final void LJJLIIIJJI() {
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJZI;
        if (progressDialogC43239Gy3 != null) {
            V1B.LJLILLLLZI(progressDialogC43239Gy3);
        }
    }

    public final InterfaceC44139HTz LJJLIIJ() {
        return (InterfaceC44139HTz) this.LJLLL.LIZ(this, LLIIII[7]);
    }

    public final AbstractBinderC44127HTn LJJLJ() {
        return (AbstractBinderC44127HTn) this.LLFF.getValue();
    }

    public final void LJZI() {
        C45685HwP.LJFF.LIZJ(1, 8, 0, new C44138HTy(this));
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJL.LIZ(this, LLIIII[2]);
    }

    public final void LJLIIIL() {
        AbstractBinderC44127HTn LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.LJ();
        }
        C45903Hzv c45903Hzv = this.LJLZ;
        if (c45903Hzv != null) {
            C78897Uxp.LJJJJ(this.LJLIL).remove(c45903Hzv);
            LJLJJLL();
        }
        if (this.LJLLLLLL) {
            LJJLIIIJJIZ().c6();
            getCameraApiComponent().zZ().mWorkspace.LJLIL.LLLFZ();
        } else {
            getBottomTabApiComponent().showBottomTab(true);
            getPlanCUIApiComponent().Qt0(true);
        }
    }

    public final void LJLIIL() {
        InterfaceC92693kP Iv0;
        if (C78605Ut7.LIZLLL()) {
            LJZI();
        } else {
            Iv0 = this.LJLLJ.Iv0(this, new TBT() { // from class: X.HTu
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
                }
            }, new C73165SnZ(), new AqS173S0100000_7(this, 113));
            this.LLIFFJFJJ = Iv0;
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        Boolean bool;
        super.onCreate();
        Object obj = null;
        this.LJLLLL = (InterfaceC45540Hu4) getDiContainer().LJ(InterfaceC45540Hu4.class, null);
        Integer num = this.LLF;
        int type = HR3.PHOTO_SEARCH.getType();
        if (num != null && num.intValue() == type) {
            TuxTextView LJJLJLI = LJJLJLI();
            if (LJJLJLI != null) {
                LJJLJLI.setVisibility(0);
            }
            Keva repo = Keva.getRepo("ecom_photo_search");
            if (repo != null) {
                bool = Boolean.valueOf(repo.getBoolean("is_first_toast", true));
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                HashMap hashMap = (HashMap) HUC.LIZIZ.getValue();
                if (hashMap != null) {
                    obj = hashMap.get("first_time_tips_key");
                }
                if (o.LJ(obj, "picture_search_legal")) {
                    Keva repo2 = Keva.getRepo("ecom_photo_search");
                    if (repo2 != null) {
                        repo2.storeBoolean("is_first_toast", false);
                    }
                    TuxTextView LJJLJLI2 = LJJLJLI();
                    if (LJJLJLI2 != null) {
                        LJJLJLI2.setText(R.string.jm0);
                    }
                }
            }
            TuxTextView LJJLJLI3 = LJJLJLI();
            if (LJJLJLI3 != null) {
                LJJLJLI3.setText(R.string.jla);
            }
        }
        getRecordControlApi().zg(HU0.class, new C44126HTm(this));
        this.LJLLJ.Iv0(this, new TBT() { // from class: X.HTs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((ChooseMediaState) obj2).getGoNextMediaState();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 114));
        getCameraApiComponent().LLL().observe(this, new AObserverS75S0100000_7(this, 22));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I4U getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public final void LJLJLJ(String localUrl) {
        Integer num;
        String str;
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            num = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            num = null;
        }
        int type = HR3.ECOMMERCE_COMMENT.getType();
        if (num == null || num.intValue() != type) {
            int type2 = HR3.AIGC.getType();
            if (num == null || num.intValue() != type2) {
                AbstractBinderC44127HTn LJJLJ = LJJLJ();
                if (LJJLJ != null) {
                    LJJLJ.LIZJ(C78688UuS.LJIJJ(this), localUrl, null);
                    return;
                }
                return;
            }
            AbstractBinderC44127HTn LJJLJ2 = LJJLJ();
            if (LJJLJ2 == null) {
                return;
            }
            LJJLJ2.LIZJ(C78688UuS.LJIJJ(this), localUrl, new AqS173S0100000_7(this, 115));
            return;
        }
        ShortVideoContext shortVideoContext = getShortVideoContext();
        boolean z = this.LJLLLLLL;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("shoot_way", shortVideoContext.shootWay);
        c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
        c145995oB.LIZLLL("content_source", "shoot");
        String str2 = "video";
        if (z) {
            c145995oB.LIZLLL("content_type", "video");
        } else {
            c145995oB.LIZLLL("content_type", "photo");
        }
        RecordPageOptionalConfig recordPageOptionalConfig2 = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig2 != null) {
            str = recordPageOptionalConfig2.previousPage;
        } else {
            str = null;
        }
        c145995oB.LIZLLL("previous_page", str);
        FMX.LJIIL("video_shoot_next", c145995oB.LIZ);
        LJLZ("shoot");
        this.LJZ.LIZ();
        this.LJZL = System.currentTimeMillis();
        this.LLFII = false;
        if (this.LJLLLLLL) {
            LJJLI(localUrl, "video", HTE.RECORD_VIDEO_PROCESS_TIMEOUT, "shoot");
        } else {
            LJJLI(localUrl, "photo", HTE.RECORD_PHOTO_PROCESS_TIMEOUT, "shoot");
            str2 = "photo";
        }
        C44108HSu.LJ(this.LLF, HRG.START, EnumC44110HSw.COMPRESS_SAVE, str2, null, 0L, 0);
        HTN htn = this.LJZ;
        boolean z2 = this.LJLLLLLL;
        htn.getClass();
        o.LJIIIZ(localUrl, "localUrl");
        htn.LJIIL = System.currentTimeMillis();
        htn.LJIIIZ = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new HTT(z2, htn, localUrl, null), 3);
    }

    public final long LJLLILLLL(long j) {
        return j - this.LJZL;
    }

    public final void LJLZ(String str) {
        ProgressDialogC43239Gy3 LIZJ = C42034Gec.LIZJ(C78688UuS.LJIJJ(this), EnumC42288Gii.VISIBLE_AFTER_5S, new C44121HTh(this, str));
        this.LJZI = LIZJ;
        LIZJ.setMessage(C78688UuS.LJIJJ(this).getResources().getString(R.string.rjz));
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJZI;
        if (progressDialogC43239Gy3 != null) {
            LJJLIIIIJ(progressDialogC43239Gy3);
        }
    }

    @Override // X.I4U
    public void S20(String localUrl) {
        Integer num;
        o.LJIIIZ(localUrl, "localUrl");
        this.LJLJLLL.hv0(false);
        if (!C44687HgJ.LIZIZ(localUrl)) {
            return;
        }
        Integer num2 = this.LLF;
        int type = HR3.PHOTO_SEARCH.getType();
        if (num2 == null || num2.intValue() != type) {
            this.LJLLLLLL = ujb.o.LJJJJ(localUrl, ".mp4", true);
            RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null) {
                num = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
            } else {
                num = null;
            }
            HR3 hr3 = HR3.AIGC;
            int type2 = hr3.getType();
            if (num == null || num.intValue() != type2) {
                hr3 = HR3.ECOMMERCE_COMMENT;
            }
            RecordPageOptionalConfig recordPageOptionalConfig2 = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig2 != null && recordPageOptionalConfig2.showPreviewAfterRecord) {
                if (!this.LJLLLLLL) {
                    getBottomTabApiComponent().showBottomTab(false);
                    getPlanCUIApiComponent().Qt0(false);
                }
                C45903Hzv c45903Hzv = new C45903Hzv(this.LJLLLLLL, getPlanCUIApiComponent().Na0(), localUrl, hr3, this.LLD);
                this.LJLZ = c45903Hzv;
                C78897Uxp.LJJJJ(this.LJLIL).LJLJL = null;
                C78897Uxp.LJJJJ(this.LJLIL).LLJJJJ(c45903Hzv, null);
                LJLJJL();
                AbstractBinderC44127HTn LJJLJ = LJJLJ();
                if (LJJLJ != null) {
                    LJJLJ.LJFF();
                    return;
                }
                return;
            }
            LJLJLJ(localUrl);
            return;
        }
        if (!NetworkUtils.isNetworkAvailable(C78688UuS.LJIJJ(this))) {
            C26045AKb c26045AKb = new C26045AKb(C78688UuS.LJIJJ(this));
            c26045AKb.LJIIIIZZ(R.string.ha1);
            c26045AKb.LJIIJ();
            return;
        }
        LJJZZIII(this, localUrl, PageType.TAKE_PHOTO, null, null, 12, null);
    }

    @Override // X.C5HC
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        LJLIIIL();
        return true;
    }

    public C44125HTl(WMH parentScene, int i, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = i;
        this.LJLJI = diContainer;
        this.LJLJJI = this;
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC45891Hzj.class, null);
        this.LJLJLLL = (ShortVideoContextViewModel) C165706es.LJIIIIZZ(parentScene, null, null, 6).get(ShortVideoContextViewModel.class);
        this.LJLL = UCI.LJI(getDiContainer(), HXE.class, null);
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(parentScene), parentScene).LIZ(ChooseMediaViewModel.class);
        o.LJIIIIZZ(LIZ, "of(parentScene)\n        …diaViewModel::class.java)");
        this.LJLLJ = (ChooseMediaViewModel) LIZ;
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC44139HTz.class, null);
        this.LJZ = new HTN(C78688UuS.LJIJJ(this), getShortVideoContext(), new C44122HTi(this));
        C44131HTr c44131HTr = new C44131HTr();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        o.LJIIIZ(shortVideoContext, "<set-?>");
        c44131HTr.LIZ = shortVideoContext;
        c44131HTr.LIZJ = new C44130HTq(this);
        c44131HTr.LIZIZ = new C44128HTo(this);
        this.LLD = c44131HTr;
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        this.LLF = recordPageOptionalConfig != null ? Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType) : null;
        this.LLFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 230));
        this.LLFFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 231));
        this.LLFZ = C221108m2.LIZIZ(C44129HTp.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL(java.lang.String r22, X.C44124HTk r23, java.util.List<com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel> r24) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44125HTl.LJJLIIIJILLIZJL(java.lang.String, X.HTk, java.util.List):void");
    }

    public final void LJJLI(String str, String str2, HTE hte, String str3) {
        RunnableC44123HTj runnableC44123HTj = new RunnableC44123HTj(this, str, str2, hte, str3);
        this.LLI = runnableC44123HTj;
        LJJLL().postDelayed(runnableC44123HTj, 60000L);
    }

    public final void LJJZZI(String str, PageType pageType, MyMediaModel myMediaModel, String str2) {
        boolean z;
        String str3 = str;
        String str4 = str2;
        PageType pageType2 = PageType.ALBUM;
        if (pageType == pageType2) {
            ChooseMediaViewModel chooseMediaViewModel = this.LJLLJ;
            C150545vW c150545vW = new C150545vW(true);
            chooseMediaViewModel.getClass();
            chooseMediaViewModel.setState(new AqS173S0100000_7(c150545vW, 274));
        }
        Intent intent = new Intent();
        if (C44172HVg.LJJI.LJ().LIZIZ(C78688UuS.LJIJJ(this)) == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZLLL = C78605Ut7.LIZLLL();
        if (pageType == pageType2) {
            str3 = C44694HgQ.LJIIL(myMediaModel);
        }
        if (str4 == null) {
            str4 = "";
        }
        intent.putExtra("return_ecommerce_photo_search_model", new ReturnEcommercePhotoSearchModel(pageType, str3, LIZLLL, z, str4));
        AbstractBinderC44127HTn LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.LIZLLL(C78688UuS.LJIJJ(this), intent);
        }
    }

    public static /* synthetic */ void LJJZZIII(C44125HTl c44125HTl, String str, PageType pageType, MyMediaModel myMediaModel, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            myMediaModel = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        c44125HTl.LJJZZI(str, pageType, myMediaModel, str2);
    }
}
