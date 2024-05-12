package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.UIPanelComponent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.e1;
import java.util.Arrays;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wdz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82763Wdz extends UIPanelComponent<I8W, AbstractC56012Ht<C82750Wdm, C82746Wdi>, C82750Wdm, C82746Wdi> implements InterfaceC135635Tz, I8W {
    public static final C82794WeU LLF;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final WMH LJLJLJ;
    public final C82622Wbi LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public boolean LJLLLLLL;
    public final Keva LJLZ;
    public final Keva LJZ;
    public final C29901Fi<C76800UCe> LJZI;
    public final InterfaceC65784Pro<C82750Wdm> LJZL;
    public final InterfaceC65784Pro<C82746Wdi> LL;
    public final InterfaceC65784Pro<C82743Wdf> LLD;

    static {
        TBT tbt = new TBT(C82763Wdz.class, "planCUiApiComponent", "getPlanCUiApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, new TBT(C82763Wdz.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C82763Wdz.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new TBT(C82763Wdz.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0), new TBT(C82763Wdz.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(C82763Wdz.class, "recordBottomTabApi", "getRecordBottomTabApi()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};
        LLF = new C82794WeU();
    }

    private final void LLILL() {
        String[] strArr;
        boolean LJFF = C78605Ut7.LJFF("android.permission.CAMERA");
        boolean LJFF2 = C78605Ut7.LJFF("android.permission.RECORD_AUDIO");
        this.LJLLLLLL = true;
        Activity activity = this.LJLJLJ.mActivity;
        if (!(activity instanceof ActivityC45651qj) || activity == null) {
            return;
        }
        C82766We2 c82766We2 = new C82766We2(this, LJFF, LJFF2);
        if (C53210KuU.LIZ() && Keva.getRepo("show_permission_statement_repo").getBoolean("show_permission_page", false)) {
            strArr = new String[]{"android.permission.CAMERA"};
        } else {
            strArr = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        }
        C61099NyR.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-tools_request_camera_audio_permission_optimize_enter_record")).LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(c82766We2);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLLI.LIZ(this, LLFF[1]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LJLLILLLL.LIZ(this, LLFF[2]);
    }

    @Override // X.I8W
    public void Dd0() {
        LJJZZI(C82780WeG.LJLIL);
    }

    public final void LJZI() {
        OHI ohi = OHI.LIZ;
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        ohi.getClass();
        OHI.LJIIIIZZ(LJIJJ, "android.permission.CAMERA");
    }

    public final void LLF() {
        Activity activity = this.LJLJLJ.mActivity;
        if ((activity instanceof ActivityC45651qj) && activity != null) {
            activity.finish();
        }
    }

    public final InterfaceC45999I3n LLFFF() {
        return (InterfaceC45999I3n) this.LJLL.LIZ(this, LLFF[0]);
    }

    public final InterfaceC45979I2t LLIFFJFJJ() {
        return (InterfaceC45979I2t) this.LJLLLL.LIZ(this, LLFF[5]);
    }

    public final void LLIILZL() {
        ActivityC45651qj activityC45651qj;
        GXR.LIZ("click_request_camera_permission", new C145995oB().LIZ);
        Activity activity = this.LJLJLJ.mActivity;
        if (!(activity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) activity) == null) {
            return;
        }
        OHI.LIZ.getClass();
        C61099NyR.LIZIZ.LIZIZ(activityC45651qj, TokenCert.Companion.with("bpea-tools_request_camera_permission_optimize")).LIZ("android.permission.CAMERA").LIZJ(new C82764We0(OHI.LJI(activityC45651qj, "android.permission.CAMERA"), activityC45651qj, this));
    }

    public final void LLIIZ() {
        ActivityC45651qj activityC45651qj;
        GXR.LIZ("click_request_mic_permission", new C145995oB().LIZ);
        Activity activity = this.LJLJLJ.mActivity;
        if (!(activity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) activity) == null) {
            return;
        }
        OHI.LIZ.getClass();
        C61099NyR.LIZIZ.LIZIZ(activityC45651qj, TokenCert.Companion.with("bpea-tools_request_audio_permission_optimize")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new C82765We1(OHI.LJI(activityC45651qj, "android.permission.RECORD_AUDIO"), activityC45651qj, this));
    }

    @Override // X.I8W
    public void bz() {
        boolean LJFF = C78605Ut7.LJFF("android.permission.CAMERA");
        boolean LJFF2 = C78605Ut7.LJFF("android.permission.RECORD_AUDIO");
        if (LJFF && LJFF2) {
            return;
        }
        show();
        if (LJFF) {
            if (C53210KuU.LIZ()) {
                LLILZLL();
                return;
            }
            LJJZZI(C82784WeK.LJLIL);
        } else if (LJFF2) {
            LJJZZI(C82785WeL.LJLIL);
        } else {
            LJJZZI(C82786WeM.LJLIL);
        }
        LJJZZI(C82772We8.LJLIL);
    }

    @Override // X.I8W
    public C0IB<Boolean> fN() {
        return LJJLIIIJILLIZJL(new TBT() { // from class: X.WeN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C82750Wdm) obj).LJFF);
            }
        });
    }

    @Override // X.I8W
    public C0IB<C08630Vn<Boolean>> fs() {
        return LJJLIIIJILLIZJL(new TBT() { // from class: X.Wdp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82750Wdm) obj).LJ;
            }
        });
    }

    public final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LJLLJ.LIZ(this, LLFF[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLLL.LIZ(this, LLFF[4]);
    }

    @Override // X.I8W
    public C0IB<Boolean> iz() {
        return LJJLIIIJILLIZJL(new TBT() { // from class: X.Wdy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C82750Wdm) obj).LIZJ);
            }
        });
    }

    public final void openAlbum() {
        this.LJZI.LJII(C76800UCe.LIZ);
    }

    @Override // X.I8W
    public C0IB<Boolean> x80() {
        return LJJLIIIJILLIZJL(new TBT() { // from class: X.Wdo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C82750Wdm) obj).LJI);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r9 != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean LJLZ() {
        /*
            r11 = this;
            long r3 = java.lang.System.currentTimeMillis()
            com.bytedance.keva.Keva r0 = r11.LJZ
            java.lang.String r8 = "first_click_shoot_without_mic_key"
            r1 = 0
            long r9 = r0.getLong(r8, r1)
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.C78605Ut7.LJFF(r0)
            r7 = 1
            if (r0 == 0) goto L35
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = X.C78605Ut7.LJFF(r0)
            if (r0 != 0) goto L35
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2e
            long r5 = r3 - r9
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
            r0 = 0
            return r0
        L2e:
            if (r0 == 0) goto L35
        L30:
            com.bytedance.keva.Keva r0 = r11.LJZ
            r0.storeLong(r8, r3)
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82763Wdz.LJLZ():boolean");
    }

    private final void LLIIIL() {
        if (!C78605Ut7.LIZJ(C45804HyK.LJIL()) && !TextUtils.equals(getShortVideoContext().shootWay, "mv_page")) {
            if (C44256HYm.LJIILL(getShortVideoContext()) && C44256HYm.LJIILLIIL(getShortVideoContext())) {
                return;
            }
            LLILZIL(false, false);
            if (!C78605Ut7.LIZJ(C45804HyK.LJIL()) && !V16.LJJJZ(getShortVideoContext())) {
                LLILL();
            } else {
                hide();
                LJJZZI(new AqS180S0100000_14(this, 171));
            }
        }
    }

    public final void LLILZLL() {
        getCameraApiComponent().rX().LJ().LIZIZ.enableAudio(false);
        this.LJZ.storeLong("first_click_shoot_without_mic_key", System.currentTimeMillis());
        hide();
        LJJZZI(C82771We7.LJLIL);
    }

    public final int getBottomMargin() {
        return getSplitShootApiComponent().getBottomMargin();
    }

    @Override // com.bytedance.als.ui.UIPanelComponent
    public void hide() {
        super.hide();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJII();
        GXR.LIZ("permission_page_hide", new C145995oB().LIZ);
    }

    @Override // com.bytedance.als.ui.UIPanelComponent, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLIIIL();
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        boolean z;
        super.onStart();
        boolean LJFF = C78605Ut7.LJFF("android.permission.RECORD_AUDIO");
        boolean LJFF2 = C78605Ut7.LJFF("android.permission.CAMERA");
        boolean couldShowToolbar = LLIFFJFJJ().couldShowToolbar();
        boolean equals = TextUtils.equals(LLIFFJFJJ().getCurrentBottomTag(), "record_mode_live");
        boolean z2 = false;
        if (LJFF || (e1.LIZ(31744, "camera_and_mic_auth_all_in_one", true, false) && !equals)) {
            z = true;
        } else {
            z = false;
        }
        if (LJFF2 && z) {
            LJJZZI(new AqS18S0010000_14(couldShowToolbar, 21));
            hide();
            return;
        }
        if (!LJFF) {
            if (!LJFF2) {
                LJJZZI(C82781WeH.LJLIL);
                return;
            }
            InterfaceC82325WSr nowsSwitcherApi = getNowsSwitcherApi();
            if (nowsSwitcherApi != null && nowsSwitcherApi.j40()) {
                z2 = true;
            }
            if (TextUtils.equals(LLIFFJFJJ().getCurrentBottomTag(), "record_mode_live")) {
                LJJZZI(C82782WeI.LJLIL);
                return;
            } else if (C53210KuU.LIZ() && z2) {
                LLILZLL();
                return;
            } else {
                LJJZZI(new AqS18S0010000_14(z2, 22));
                return;
            }
        }
        if (!LJFF2) {
            LJJZZI(C82783WeJ.LJLIL);
        }
    }

    @Override // com.bytedance.als.ui.UIPanelComponent
    public void show() {
        super.show();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJII();
        GXR.LIZ("permission_page_show", new C145995oB().LIZ);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82750Wdm> LJJLIIIJJI() {
        return this.LJZL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82746Wdi> LJJLIIIJJIZ() {
        return this.LL;
    }

    @Override // com.bytedance.als.ui.UIPanelComponent
    public InterfaceC65784Pro<AbstractC56012Ht<C82750Wdm, C82746Wdi>> LJLJJLL() {
        return this.LLD;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
    }

    @Override // X.I8W
    public /* bridge */ /* synthetic */ LiveEvent ts() {
        return this.LJZI;
    }

    @Override // X.I8W
    public void MR(boolean z) {
        boolean LJFF = C78605Ut7.LJFF("android.permission.RECORD_AUDIO");
        boolean LJFF2 = C78605Ut7.LJFF("android.permission.CAMERA");
        if (LJFF2) {
            if (LJFF) {
                hide();
                return;
            }
        } else if (LJFF) {
            LJJZZI(new AqS18S0010000_14(z, 18));
            return;
        } else if (!LJFF2) {
            LJJZZI(new AqS18S0010000_14(z, 20));
            return;
        }
        LJJZZI(new AqS18S0010000_14(z, 19));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82763Wdz(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJLJ = parentScene;
        this.LJLJLLL = diContainer;
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), I3K.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLZ = Keva.getRepo("show_permission_statement_repo");
        this.LJZ = Keva.getRepo("show_permission_statement_repo");
        this.LJZI = new C29901Fi<>();
        this.LJZL = new AqS164S0100000_14(this, 166);
        this.LL = new AqS164S0100000_14(this, 167);
        this.LLD = new AqS164S0100000_14(this, 168);
    }

    private final void LLILZIL(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        if (C53210KuU.LIZ() && !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((C78605Ut7.LJFF("android.permission.RECORD_AUDIO") || z3) && C78605Ut7.LJFF("android.permission.CAMERA")) {
            LJJZZI(new C82767We3(z2, z));
            hide();
            return;
        }
        if (LJLZ() || z) {
            show();
            if (TextUtils.equals(getShortVideoContext().shootWay, "duet") || TextUtils.equals(getShortVideoContext().shootWay, "stitch")) {
                z4 = false;
            }
            LJJZZI(new AqS18S0010000_14(z4, 17));
            return;
        }
        hide();
        getCameraApiComponent().rX().LJ().LIZIZ.enableAudio(false);
        LJJZZI(C82770We6.LJLIL);
    }

    @Override // X.I8W
    public void Rb0(boolean z, boolean z2) {
        LLILZIL(z, z2);
    }

    @Override // X.I8W
    public void Fs(boolean z, boolean z2, boolean z3) {
        InterfaceC82325WSr nowsSwitcherApi = getNowsSwitcherApi();
        if (nowsSwitcherApi != null) {
            nowsSwitcherApi.j40();
        }
        LJJZZI(new C82768We4(z3, z2, z));
    }

    @Override // X.I8W
    public void NI(boolean z, boolean z2, boolean z3) {
        hide();
        InterfaceC82325WSr nowsSwitcherApi = getNowsSwitcherApi();
        boolean z4 = false;
        if (nowsSwitcherApi != null && nowsSwitcherApi.j40()) {
            z4 = true;
        }
        LJJZZI(new C82769We5(z4, z, z3, z2));
    }
}
