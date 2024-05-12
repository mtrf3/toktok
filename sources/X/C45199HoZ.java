package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS124S0300000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS2S2400000_7;
import kotlin.jvm.internal.AqS5S1301000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HoZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45199HoZ extends AbstractC29891Fh<InterfaceC44718Hgo> implements InterfaceC44718Hgo, InterfaceC135635Tz, C0IA, InterfaceC45240HpE {
    public static final C45228Hp2 LLF;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C82622Wbi LJLIL;
    public final C5H3 LJLILLLLZI;
    public C45254HpS LJLJI;
    public final C5H3 LJLJJI;
    public AutoCutProgressConfig.AutoCutStepProgressConfig LJLJJL;
    public AutoCutProgressConfig.AutoCutStepProgressConfig LJLJJLL;
    public AutoCutProgressConfig.AutoCutStepProgressConfig LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public C45205Hof LJLJLLL;
    public C45091Hmp LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public C44716Hgm LJLLL;
    public boolean LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public int LJZI;
    public int LJZL;
    public List<AutoCutMediaModel> LL;
    public int LLD;

    static {
        TBT tbt = new TBT(C45199HoZ.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65352Pkq.LIZ.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt};
        LLF = new C45228Hp2();
    }

    private final void LJJLIIIJJIZ() {
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LJLLLL = false;
    }

    private final void LJJLIIIJLLLLLLLZ() {
        this.LJLLLLLL = 0.0f;
        this.LJZ = 0.0f;
        this.LJLZ = 0.0f;
    }

    public static void LJJLIIJ(AlertDialogC45239HpD alertDialogC45239HpD) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/autocut/util/AutoCutLoadingDialog", "show", alertDialogC45239HpD, new Object[0], "void", new C65300Pk0(false, "()V", "-1930996531865960115")).LIZ) {
            return;
        }
        alertDialogC45239HpD.show();
    }

    public InterfaceC44718Hgo LJLJJLL() {
        return this;
    }

    private final void LJJLIIIJILLIZJL() {
        String str = this.LJLLILLLL;
        if (str != null) {
            C45154Hnq.LIZJ.getClass();
            C45154Hnq.LIZ(str);
            this.LJLLILLLL = null;
        }
    }

    private final void LJJLIIIJJI() {
        String str = this.LJLLI;
        if (str != null) {
            C45087Hml.LIZLLL(str);
        }
        String str2 = this.LJLLJ;
        if (str2 != null) {
            C45087Hml.LIZLLL(str2);
        }
        LJJLIIIJILLIZJL();
    }

    @Override // X.InterfaceC44718Hgo
    public void LJJJLL() {
        InterfaceC45222How interfaceC45222How;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent exit");
        C45205Hof c45205Hof = this.LJLJLLL;
        if (c45205Hof != null) {
            interfaceC45222How = c45205Hof.LJI;
        } else {
            interfaceC45222How = null;
        }
        this.LJLJLLL = null;
        LJJLIIIJJI();
        LJJLIIIJJIZ();
        C6QQ.LIZ(new AqS154S0200000_7(this, interfaceC45222How, 11));
    }

    public final int LJJLIIIIJ() {
        return (int) C45087Hml.LIZIZ(new C45091Hmp(this.LJLLLLLL, this.LJZ, this.LJLZ), this.LJLL);
    }

    public final Activity LJLJJL() {
        return (Activity) this.LJLJLJ.LIZ(this, LLFF[0]);
    }

    public final InterfaceC45213Hon LJLJLJ() {
        return (InterfaceC45213Hon) this.LJLILLLLZI.getValue();
    }

    public final AlertDialogC45239HpD LJLLILLLL() {
        return (AlertDialogC45239HpD) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC44718Hgo
    public void r80() {
        InterfaceC45222How interfaceC45222How;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent cancelAutoCut");
        C45205Hof c45205Hof = this.LJLJLLL;
        if (c45205Hof != null && (interfaceC45222How = c45205Hof.LJI) != null) {
            interfaceC45222How.onCancel();
        }
        LJJJLL();
    }

    private final void LLILZLL() {
        AlertDialogC45239HpD LJLLILLLL = LJLLILLLL();
        if (LJLLILLLL != null) {
            LJJLIIJ(LJLLILLLL);
        }
    }

    public final void LJJLL() {
        AlertDialogC45239HpD LJLLILLLL = LJLLILLLL();
        if (LJLLILLLL != null) {
            V1B.LJLILLLLZI(LJLLILLLL);
        }
    }

    @Override // X.InterfaceC44718Hgo
    public void LLLZIL() {
        InterfaceC45213Hon LJLJLJ = LJLJLJ();
        if (LJLJLJ != null) {
            LJLJLJ.LLLZIL();
        }
        C45254HpS c45254HpS = this.LJLJI;
        if (c45254HpS != null) {
            c45254HpS.LLLZIL();
        }
    }

    @Override // X.InterfaceC44718Hgo
    public void retry() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent retry = ");
        LIZ.append(this.LJLJLLL);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C45205Hof c45205Hof = this.LJLJLLL;
        if (c45205Hof != null) {
            InterfaceC45222How interfaceC45222How = c45205Hof.LJI;
            if (interfaceC45222How != null) {
                interfaceC45222How.LIZIZ(this.LJZI);
            }
            LLFFF(c45205Hof);
        }
    }

    @Override // X.InterfaceC45240HpE
    public void LIZIZ() {
        r80();
    }

    @Override // X.InterfaceC45240HpE
    public void LJIIJJI() {
        retry();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC44718Hgo getApiComponent() {
        LJLJJLL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C45199HoZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 57));
        this.LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 59));
        if (e1.LIZ(31744, "autocut_progress_setting_config", true, false)) {
            AutoCutProgressConfig.AutoCutStepSetting mainProcess = AutoCutProgressConfig.LIZ().getMainProcess();
            this.LJLJJL = mainProcess.getReqMusicListConfig();
            this.LJLJJLL = mainProcess.getDownloadConfig();
            this.LJLJL = mainProcess.getReqNLEConfig();
        }
        this.LJLJLJ = UCI.LJI(getDiContainer(), Activity.class, null);
        this.LJLL = new C45091Hmp(0);
        this.LJZI = -1;
    }

    private final C45091Hmp LJJLI(C45205Hof c45205Hof) {
        int i;
        C45203Hod c45203Hod = c45205Hof.LIZ;
        int i2 = 0;
        if (c45203Hod.LIZ) {
            if (c45203Hod.LIZJ || c45203Hod.LIZIZ) {
                AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LJLJJL;
                if (autoCutStepProgressConfig != null) {
                    i = autoCutStepProgressConfig.getProgress();
                } else {
                    i = 60;
                }
            } else {
                i = 100;
            }
        } else {
            i = 0;
        }
        C45203Hod c45203Hod2 = c45205Hof.LIZ;
        if (c45203Hod2.LIZJ) {
            if (c45203Hod2.LIZIZ) {
                AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LJLJJLL;
                i2 = autoCutStepProgressConfig2 != null ? autoCutStepProgressConfig2.getProgress() : (100 - i) / 2;
            } else if (!c45203Hod2.LIZIZ) {
                i2 = 100 - i;
            }
        }
        return new C45091Hmp(i, (100 - i) - i2, i2);
    }

    private final void LLFFF(C45205Hof c45205Hof) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent realStartAutoCut: config = ");
        LIZ.append(c45205Hof);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C45203Hod c45203Hod = c45205Hof.LIZ;
        if (c45203Hod.LIZ || c45203Hod.LIZIZ) {
            C45161Hnx.LIZIZ(null);
        }
        LJJLIIIJJI();
        LJJLIIIJJIZ();
        LJJLIIIJLLLLLLLZ();
        C45203Hod c45203Hod2 = c45205Hof.LIZ;
        this.LJLLL = new C44716Hgm(c45203Hod2.LJI, c45203Hod2.LJFF, 0, null, null, null, 0L, null, null, null, null, 8188);
        C45203Hod c45203Hod3 = c45205Hof.LIZ;
        this.LJLLLL = !c45203Hod3.LIZ;
        AutoCutThemeData autoCutThemeData = c45203Hod3.LJIIIIZZ;
        OSZ LJJIJIIJIL = C45087Hml.LJJIJIIJIL(autoCutThemeData);
        AVMusic aVMusic = (AVMusic) LJJIJIIJIL.getFirst();
        String str2 = (String) LJJIJIIJIL.getSecond();
        if (c45205Hof.LIZJ && autoCutThemeData != null && aVMusic != null && C78685UuP.LJJJZ(str2)) {
            LLIFFJFJJ(c45205Hof, autoCutThemeData, aVMusic, str2);
            return;
        }
        AutoCutThemeData autoCutThemeData2 = c45205Hof.LIZ.LJIIIZ;
        OSZ LJJIJIIJIL2 = C45087Hml.LJJIJIIJIL(autoCutThemeData2);
        AVMusic aVMusic2 = (AVMusic) LJJIJIIJIL2.getFirst();
        String str3 = (String) LJJIJIIJIL2.getSecond();
        C6QQ.LIZ(new AqS154S0200000_7(this, c45205Hof, 13));
        C45203Hod c45203Hod4 = c45205Hof.LIZ;
        if (c45203Hod4.LIZ) {
            LLIIZ(c45203Hod4.LJII, c45203Hod4.LIZLLL, c45203Hod4.LJIIL, c45203Hod4.LJIIJJI, true, c45205Hof.LJI, new AqS2S2400000_7(autoCutThemeData, c45205Hof, this, str2, aVMusic2, str3, 0));
            return;
        }
        if (autoCutThemeData2 != null && autoCutThemeData2.templateType == EnumC43998HOo.CUT_SAME.getValue()) {
            C44716Hgm c44716Hgm = this.LJLLL;
            if (c44716Hgm != null) {
                c44716Hgm.LIZJ = autoCutThemeData2.templateType;
                c44716Hgm.LJIIIZ = autoCutThemeData2.templateId;
                c44716Hgm.LJIIJJI = autoCutThemeData2.templateGroupId;
            }
            C45203Hod c45203Hod5 = c45205Hof.LIZ;
            c45203Hod5.LIZJ = false;
            if (c45203Hod5.LIZIZ) {
                String str4 = autoCutThemeData2.templateId;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                int i = autoCutThemeData2.templateType;
                String str6 = autoCutThemeData2.templateUrl;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = autoCutThemeData2.templateData;
                EnumC45070HmU enumC45070HmU = EnumC45070HmU.TEMPLATE_CC;
                List<AutoCutMediaModel> list = c45203Hod5.LJII;
                java.util.Set<String> set = autoCutThemeData2.preloadUrsSet;
                CreativeInfo creativeInfo = c45203Hod5.LJIIL;
                InterfaceC45222How interfaceC45222How = c45205Hof.LJI;
                String str8 = autoCutThemeData2.templateGroupId;
                if (str8 != null) {
                    str5 = str8;
                }
                LLIIIL("", "", str4, str5, i, str6, str7, enumC45070HmU, list, set, creativeInfo, interfaceC45222How);
                return;
            }
            return;
        }
        if (str3 != null && str3.length() > 0) {
            C45203Hod c45203Hod6 = c45205Hof.LIZ;
            if (c45203Hod6.LIZIZ) {
                String str9 = c45203Hod6.LJIIJ;
                int value = EnumC43998HOo.ALGORITHM_TEMPLATE.getValue();
                EnumC45070HmU enumC45070HmU2 = EnumC45070HmU.TEMPLATE_MUSIC;
                C45203Hod c45203Hod7 = c45205Hof.LIZ;
                str = str3;
                LLIILZL(this, str9, str3, "", "", value, "", "", enumC45070HmU2, c45203Hod7.LJII, null, c45203Hod7.LJIIL, c45205Hof.LJI, 512, null);
            } else {
                str = str3;
            }
            if (c45205Hof.LIZ.LIZJ) {
                if (aVMusic2 != null) {
                    LJJZZI(aVMusic2, c45205Hof.LJI);
                } else {
                    LJLIIL(str, c45205Hof.LJI);
                }
            }
        }
    }

    public final void LLF(InterfaceC45222How interfaceC45222How) {
        C45205Hof c45205Hof;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent processSuccessResult: ");
        LIZ.append(this.LJLLL);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C44716Hgm c44716Hgm = this.LJLLL;
        if (c44716Hgm != null && (c45205Hof = this.LJLJLLL) != null && LJZI(c45205Hof, c44716Hgm)) {
            if (interfaceC45222How != null) {
                interfaceC45222How.LJIIZILJ(c44716Hgm.LIZ());
            }
            LJJLIIIJJIZ();
            C6QQ.LIZ(new AqS154S0200000_7(this, c44716Hgm, 12));
        }
    }

    @Override // X.InterfaceC44718Hgo
    public void pH(C45205Hof config) {
        List<AutoCutMediaModel> list;
        o.LJIIIZ(config, "config");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent startAutoCut: config = ");
        LIZ.append(config);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (!LJLJJL().isFinishing() && C45087Hml.LJJII()) {
            C24540xm.LIZ(R.string.dtf, LJLJJL(), 1026);
            return;
        }
        if (!config.LIZ()) {
            return;
        }
        if (!config.LJ && ((list = this.LL) == null || !AnonymousClass636.LJIIJ(list, config.LIZ.LJII))) {
            LLLZIL();
            this.LL = config.LIZ.LJII;
        }
        this.LJLJLLL = config;
        this.LJLL = LJJLI(config);
        InterfaceC45222How interfaceC45222How = config.LJI;
        if (interfaceC45222How != null) {
            interfaceC45222How.LIZJ(config.LIZ.LJII);
        }
        LLILZLL();
        AlertDialogC45239HpD LJLLILLLL = LJLLILLLL();
        if (LJLLILLLL != null) {
            LJLLILLLL.LIZIZ();
        }
        InterfaceC45213Hon LJLJLJ = LJLJLJ();
        if (LJLJLJ != null) {
            LJLJLJ.Sr0(config);
        }
        if (C44720Hgq.LIZIZ()) {
            this.LJLJI = new C45254HpS(LJLJJL(), config, new C44630HfO(new C45218Hos(this), new C45215Hop(this)));
        }
        C45254HpS c45254HpS = this.LJLJI;
        if (c45254HpS != null) {
            c45254HpS.LJI();
        }
        LLFFF(config);
    }

    private final EnumC45211Hol LJJLJ(int i, UnorderedMapStrStr unorderedMapStrStr) {
        Object obj;
        if (C47261Igj.LJJIJIIJI(Integer.valueOf(SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue()), Integer.valueOf(SmartMovieErrorCode.MUSIC_REQUEST_FAILURE.swigValue()), Integer.valueOf(SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue()), Integer.valueOf(SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue())).contains(Integer.valueOf(i))) {
            if (!C48203Ivv.LJ(C5L7.LIZ())) {
                return EnumC45211Hol.ERROR_PROCESS_INTERNET;
            }
            if (unorderedMapStrStr != null) {
                obj = unorderedMapStrStr.get("weak_net");
            } else {
                obj = null;
            }
            if (o.LJ("weak_net", obj)) {
                return EnumC45211Hol.ERROR_PROCESS_INTERNET_WEAK;
            }
        }
        return EnumC45211Hol.ERROR_PROCESS_GENERAL;
    }

    private final boolean LJZI(C45205Hof c45205Hof, C44716Hgm c44716Hgm) {
        if ((!this.LJLLLL && c45205Hof.LIZ.LIZ) || !c44716Hgm.LIZJ()) {
            return false;
        }
        C45203Hod c45203Hod = c45205Hof.LIZ;
        if (!c44716Hgm.LIZIZ(c45203Hod.LIZJ, c45203Hod.LIZIZ)) {
            return false;
        }
        return true;
    }

    public final void LJJZZI(AVMusic aVMusic, InterfaceC45222How interfaceC45222How) {
        long j;
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent start downloadMusic: musicId = ");
        LIZ.append(aVMusic.getMusicId());
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C44716Hgm c44716Hgm = this.LJLLL;
        if (c44716Hgm != null) {
            c44716Hgm.LJ = aVMusic;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LJLJJLL;
        if (autoCutStepProgressConfig != null) {
            j = autoCutStepProgressConfig.getUpdateInterval();
        } else {
            j = 20;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LJLJJLL;
        if (autoCutStepProgressConfig2 != null) {
            num = Integer.valueOf(autoCutStepProgressConfig2.getUpdateCount());
        } else {
            num = null;
        }
        LJJZZIII(j, num, new AqS173S0100000_7(this, 39));
        C78934UyQ.LJLIL.getMusicService().LJIILL(LJLJJL(), aVMusic, 0, false, new C45208Hoi(this, interfaceC45222How, aVMusic));
    }

    public final void LJLIIL(String str, InterfaceC45222How interfaceC45222How) {
        if (interfaceC45222How != null) {
            interfaceC45222How.LJIIIIZZ(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent start fetchAndDownloadMusic: musicId = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C78934UyQ.LJLIL.getMusicService().requestMusic(str, new C45214Hoo(this, interfaceC45222How));
    }

    private final void LJJZZIII(long j, Integer num, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C68832n1(num, this, j, interfaceC88472Yns, null), 3);
    }

    private final void LJLLL(int i, Integer num, String str, UnorderedMapStrStr unorderedMapStrStr) {
        InterfaceC45222How interfaceC45222How;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent handleFailure: errorCode = ");
        LIZ.append(i);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LJZI = i;
        EnumC45211Hol LJJLJ = LJJLJ(i, unorderedMapStrStr);
        C45205Hof c45205Hof = this.LJLJLLL;
        if (c45205Hof != null && (interfaceC45222How = c45205Hof.LJI) != null) {
            interfaceC45222How.LJIILL(i, num, str, LJJLJ);
        }
        LJJLIIIJJI();
        LJJLIIIJJIZ();
        C6QQ.LIZ(new AqS5S1301000_7(LJJLJ, this, i, num, str, 0));
    }

    private final void LLIFFJFJJ(C45205Hof c45205Hof, AutoCutThemeData autoCutThemeData, AVMusic aVMusic, String str) {
        C45199HoZ c45199HoZ = this;
        C6QQ.LIZ(new AqS154S0200000_7(c45199HoZ, c45205Hof, 14));
        C45203Hod c45203Hod = c45205Hof.LIZ;
        if (c45203Hod.LIZ) {
            List<AutoCutMediaModel> list = c45203Hod.LJII;
            int i = c45203Hod.LIZLLL;
            CreativeInfo creativeInfo = c45203Hod.LJIIL;
            boolean z = c45203Hod.LJIIJJI;
            InterfaceC45222How interfaceC45222How = c45205Hof.LJI;
            AqS124S0300000_7 aqS124S0300000_7 = new AqS124S0300000_7(autoCutThemeData, c45205Hof, c45199HoZ, 1);
            c45199HoZ = c45199HoZ;
            c45199HoZ.LLIIZ(list, i, creativeInfo, z, false, interfaceC45222How, aqS124S0300000_7);
        }
        C45203Hod c45203Hod2 = c45205Hof.LIZ;
        if (c45203Hod2.LIZIZ) {
            String str2 = c45203Hod2.LJIIJ;
            int value = EnumC43998HOo.ALGORITHM_TEMPLATE.getValue();
            EnumC45070HmU enumC45070HmU = EnumC45070HmU.TEMPLATE_MUSIC;
            C45203Hod c45203Hod3 = c45205Hof.LIZ;
            LLIILZL(c45199HoZ, str2, str, "", "", value, "", "", enumC45070HmU, c45203Hod3.LJII, null, c45203Hod3.LJIIL, c45205Hof.LJI, 512, null);
        }
        if (c45205Hof.LIZ.LIZJ) {
            c45199HoZ.LJJZZI(aVMusic, c45205Hof.LJI);
        }
    }

    public static /* synthetic */ EnumC45211Hol LJJLJLI(C45199HoZ c45199HoZ, int i, UnorderedMapStrStr unorderedMapStrStr, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            unorderedMapStrStr = null;
        }
        return c45199HoZ.LJJLJ(i, unorderedMapStrStr);
    }

    public final void LLILZIL(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, InterfaceC45222How interfaceC45222How) {
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent requestRecommendedMusicList: ");
        LIZ.append(f);
        LIZ.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (musicRequestCallbackInfoType == null) {
            i2 = -1;
        } else {
            i2 = C45224Hoy.LIZ[musicRequestCallbackInfoType.ordinal()];
        }
        switch (i2) {
            case 1:
                if (interfaceC45222How != null) {
                    interfaceC45222How.LJIIJ("before_extract");
                    interfaceC45222How.LJFF("after_extract");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append(" BEFORE_EXTRACTOR");
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
                return;
            case 2:
                if (interfaceC45222How != null) {
                    interfaceC45222How.LJIIJ("after_extract");
                    interfaceC45222How.LJFF("zip_generate");
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ);
                LIZ3.append(" AFTER_EXTRACTOR");
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ3));
                return;
            case 3:
                if (interfaceC45222How != null) {
                    interfaceC45222How.LJIIJ("zip_generate");
                }
                if (C45093Hmr.LIZ()) {
                    if (interfaceC45222How != null) {
                        interfaceC45222How.LJFF("music_request_success");
                    }
                } else if (interfaceC45222How != null) {
                    interfaceC45222How.LJFF("zip_upload_tos");
                }
                StringBuilder LIZJ = b1.LIZJ(LIZIZ, " ZIP_GENERATE_SUCCESS, path = ");
                if (str == null) {
                    str = "";
                }
                C45243HpH.LIZIZ(LIZJ, str, LIZJ);
                return;
            case 4:
                if (interfaceC45222How != null) {
                    interfaceC45222How.LJIIJ("zip_upload_tos");
                    interfaceC45222How.LJFF("music_request_success");
                }
                StringBuilder LIZJ2 = b1.LIZJ(LIZIZ, " ZIP_UPLOAD_TOS_SUCCESS, tosPath = ");
                if (str == null) {
                    str = "";
                }
                C45243HpH.LIZIZ(LIZJ2, str, LIZJ2);
                return;
            case 5:
                if (interfaceC45222How != null) {
                    interfaceC45222How.LJIIJ("music_request_success");
                }
                StringBuilder LIZJ3 = b1.LIZJ(LIZIZ, " RESPONSE_SUCCESS, result = ");
                if (str == null) {
                    str = "";
                }
                C45243HpH.LIZIZ(LIZJ3, str, LIZJ3);
                return;
            case 6:
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZIZ);
                LIZ4.append(" REQUEST_ERROR, code = ");
                LIZ4.append(i);
                LIZ4.append(", msg = ");
                if (str == null) {
                    str = "";
                }
                C45243HpH.LIZIZ(LIZ4, str, LIZ4);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC44718Hgo
    public void Zl(List<AutoCutMediaModel> mediaModelList, AutoCutThemeData autoCutThemeData, int i, boolean z, CreativeInfo creativeInfo, InterfaceC88471Ynr<? super List<AutoCutThemeData>, ? super String, C76800UCe> successCallback) {
        o.LJIIIZ(mediaModelList, "mediaModelList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(successCallback, "successCallback");
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent preRecommendMusic");
        C45161Hnx.LIZIZ(null);
        OSZ<String, String> LJJIJ = C45087Hml.LJJIJ(mediaModelList, i, creativeInfo, false, z, "source_preload_music", false, new C45206Hog(this, successCallback, autoCutThemeData));
        this.LJLLI = LJJIJ.getFirst();
        this.LJLLILLLL = LJJIJ.getSecond();
    }

    public static /* synthetic */ void LJLZ(C45199HoZ c45199HoZ, int i, Integer num, String str, UnorderedMapStrStr unorderedMapStrStr, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            unorderedMapStrStr = null;
        }
        c45199HoZ.LJLLL(i, num, str, unorderedMapStrStr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r2 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLIIZ(java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel> r14, int r15, com.ss.android.ugc.aweme.creative.CreativeInfo r16, boolean r17, boolean r18, X.InterfaceC45222How r19, X.InterfaceC88471Ynr<? super java.util.List<com.ss.android.ugc.aweme.cutsame.CutsameDataItem>, ? super java.lang.String, X.C76800UCe> r20) {
        /*
            r13 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "AutoCutComponent start requestRecommendedMusicList: mediaModelList = "
            r1.append(r0)
            r5 = r14
            r1.append(r5)
            java.lang.String r0 = ", musicCount = "
            r1.append(r0)
            r6 = r15
            r1.append(r6)
            java.lang.String r0 = ", creativeInfo = "
            r1.append(r0)
            r7 = r16
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C45049Hm9.LIZIZ(r0)
            com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig$AutoCutStepProgressConfig r0 = r13.LJLJJL
            if (r0 == 0) goto L8f
            long r0 = r0.getUpdateInterval()
        L2f:
            com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig$AutoCutStepProgressConfig r2 = r13.LJLJJL
            if (r2 == 0) goto L8d
            int r2 = r2.getUpdateCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
        L3b:
            kotlin.jvm.internal.AqS173S0100000_7 r3 = new kotlin.jvm.internal.AqS173S0100000_7
            r2 = 41
            r3.<init>(r13, r2)
            r13.LJJZZIII(r0, r4, r3)
            r3 = r19
            if (r3 == 0) goto L51
            r3.LJII()
            java.lang.String r0 = "before_extract"
            r3.LJFF(r0)
        L51:
            X.Hof r2 = r13.LJLJLLL
            r1 = 1
            if (r2 == 0) goto L87
            X.Hod r0 = r2.LIZ
            if (r0 == 0) goto L87
            boolean r0 = r0.LJIILIIL
            if (r0 != r1) goto L87
            r8 = 1
        L5f:
            X.Hod r0 = r2.LIZ
            if (r0 == 0) goto L8b
            boolean r9 = r0.LJ
        L65:
            java.lang.String r10 = "source_auto_cut"
            X.Hoe r12 = new X.Hoe
            r0 = r20
            r1 = r17
            r12.<init>(r1, r3, r13, r0)
            r11 = r18
            X.OSZ r1 = X.C45087Hml.LJJIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r1.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            r13.LJLLI = r0
            java.lang.Object r0 = r1.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            r13.LJLLILLLL = r0
            return
        L87:
            r8 = 0
            if (r2 == 0) goto L8b
            goto L5f
        L8b:
            r9 = 1
            goto L65
        L8d:
            r4 = 0
            goto L3b
        L8f:
            r0 = 40
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45199HoZ.LLIIZ(java.util.List, int, com.ss.android.ugc.aweme.creative.CreativeInfo, boolean, boolean, X.How, X.Ynr):void");
    }

    public static /* synthetic */ void LLILL(C45199HoZ c45199HoZ, List list, int i, CreativeInfo creativeInfo, boolean z, boolean z2, InterfaceC45222How interfaceC45222How, InterfaceC88471Ynr interfaceC88471Ynr, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        c45199HoZ.LLIIZ(list, i, creativeInfo, z, z2, interfaceC45222How, interfaceC88471Ynr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r41 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIL(java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, X.EnumC45070HmU r37, java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel> r38, java.util.Set<java.lang.String> r39, com.ss.android.ugc.aweme.creative.CreativeInfo r40, X.InterfaceC45222How r41) {
        /*
            r29 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "AutoCutComponent start requestNLEModel: mediaList: "
            r1.append(r0)
            r3 = 0
            X.Hn7 r6 = X.C45109Hn7.LJLIL
            r7 = 31
            r11 = r38
            r2 = r11
            r4 = r3
            r5 = r3
            java.lang.String r0 = X.ORZ.LLD(r2, r3, r4, r5, r6, r7)
            X.C45243HpH.LIZIZ(r1, r0, r1)
            r3 = r29
            com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig$AutoCutStepProgressConfig r0 = r3.LJLJL
            if (r0 == 0) goto Lbf
            long r4 = r0.getUpdateInterval()
        L24:
            com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig$AutoCutStepProgressConfig r0 = r3.LJLJL
            if (r0 == 0) goto Lbc
            int r0 = r0.getUpdateCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L30:
            kotlin.jvm.internal.AqS173S0100000_7 r1 = new kotlin.jvm.internal.AqS173S0100000_7
            r0 = 40
            r1.<init>(r3, r0)
            r3.LJJZZIII(r4, r2, r1)
            r4 = r34
            r26 = r33
            r7 = r32
            r6 = r31
            r5 = r30
            r2 = r41
            r9 = r36
            if (r2 == 0) goto L59
            r21 = r2
            r22 = r4
            r23 = r6
            r24 = r5
            r25 = r7
            r27 = r9
            r21.LJIILIIL(r22, r23, r24, r25, r26, r27)
        L59:
            X.HmU r0 = X.EnumC45070HmU.TEMPLATE_CC
            r10 = r37
            if (r10 == r0) goto Lb9
            if (r2 == 0) goto L6b
            java.lang.String r0 = "compress"
            r2.LJFF(r0)
        L66:
            java.lang.String r0 = "nlemodel_request_success"
            r2.LJFF(r0)
        L6b:
            r3.LJJLIIIJILLIZJL()
            boolean r0 = X.C133625Mg.LIZ()
            r1 = 1
            if (r0 == 0) goto Lb7
            X.HOo r0 = X.EnumC43998HOo.CUT_SAME
            int r0 = r0.getValue()
            if (r4 == r0) goto Lb7
            r15 = 1
        L7e:
            X.Hof r0 = r3.LJLJLLL
            if (r0 == 0) goto Lb5
            X.Hod r0 = r0.LIZ
            if (r0 == 0) goto Lb5
            boolean r0 = r0.LJIILIIL
            if (r0 != r1) goto Lb5
            r14 = 1
        L8b:
            java.lang.String r17 = "source_auto_cut"
            java.util.List r28 = X.C47261Igj.LJJIJ(r2)
            X.HoR r18 = new X.HoR
            r19 = r15
            r20 = r2
            r21 = r3
            r22 = r10
            r23 = r6
            r24 = r5
            r25 = r7
            r27 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r8 = r35
            r13 = r40
            r12 = r39
            r16 = r4
            java.lang.String r0 = X.C45087Hml.LJJIJIIJI(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.LJLLJ = r0
            return
        Lb5:
            r14 = 0
            goto L8b
        Lb7:
            r15 = 0
            goto L7e
        Lb9:
            if (r2 == 0) goto L6b
            goto L66
        Lbc:
            r2 = 0
            goto L30
        Lbf:
            r4 = 20
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45199HoZ.LLIIIL(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, X.HmU, java.util.List, java.util.Set, com.ss.android.ugc.aweme.creative.CreativeInfo, X.How):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LLIILZL(C45199HoZ c45199HoZ, String str, String str2, String str3, String str4, int i, String str5, String str6, EnumC45070HmU enumC45070HmU, List list, java.util.Set set, CreativeInfo creativeInfo, InterfaceC45222How interfaceC45222How, int i2, Object obj) {
        if ((i2 & 512) != 0) {
            set = null;
        }
        c45199HoZ.LLIIIL(str, str2, str3, str4, i, str5, str6, enumC45070HmU, list, set, creativeInfo, interfaceC45222How);
    }
}
