package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hoa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45200Hoa extends AbstractC29891Fh<InterfaceC44718Hgo> implements InterfaceC44718Hgo, InterfaceC135635Tz, C0IA, InterfaceC45240HpE {
    public static final C45229Hp3 LJLJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public C45205Hof LJLJI;
    public InterfaceC45226Hp0 LJLJJI;
    public InterfaceC45227Hp1 LJLJJL;
    public List<AutoCutMediaModel> LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;

    static {
        TBT tbt = new TBT(C45200Hoa.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
        LJLJLLL = new C45229Hp3();
    }

    public InterfaceC44718Hgo LJJLIIIJILLIZJL() {
        return this;
    }

    private final void LJJLI() {
        String str = this.LJLJL;
        if (str != null) {
            C45087Hml.LIZLLL(str);
            this.LJLJL = null;
        }
        String str2 = this.LJLJLJ;
        if (str2 != null) {
            C45154Hnq.LIZJ.getClass();
            C45154Hnq.LIZ(str2);
            this.LJLJLJ = null;
        }
    }

    private final Activity LJJLIIIIJ() {
        return (Activity) this.LJLILLLLZI.LIZ(this, LJLL[0]);
    }

    @Override // X.InterfaceC44718Hgo
    public void LJJJLL() {
        InterfaceC45222How interfaceC45222How;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent exit");
        C45205Hof c45205Hof = this.LJLJI;
        if (c45205Hof != null) {
            interfaceC45222How = c45205Hof.LJI;
        } else {
            interfaceC45222How = null;
        }
        this.LJLJI = null;
        InterfaceC45226Hp0 interfaceC45226Hp0 = this.LJLJJI;
        if (interfaceC45226Hp0 != null) {
            interfaceC45226Hp0.cancel();
        }
        InterfaceC45227Hp1 interfaceC45227Hp1 = this.LJLJJL;
        if (interfaceC45227Hp1 != null) {
            interfaceC45227Hp1.LJJJLL();
        }
        if (interfaceC45222How != null) {
            interfaceC45222How.onExit();
        }
    }

    @Override // X.InterfaceC44718Hgo
    public void LLLZIL() {
        InterfaceC45227Hp1 interfaceC45227Hp1 = this.LJLJJL;
        if (interfaceC45227Hp1 != null) {
            interfaceC45227Hp1.LLLZIL();
        }
    }

    @Override // X.InterfaceC44718Hgo
    public void r80() {
        InterfaceC45222How interfaceC45222How;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent cancelAutoCut");
        C45205Hof c45205Hof = this.LJLJI;
        if (c45205Hof != null && (interfaceC45222How = c45205Hof.LJI) != null) {
            interfaceC45222How.onCancel();
        }
        LJJJLL();
    }

    @Override // X.InterfaceC44718Hgo
    public void retry() {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent retry = ");
        LIZ.append(this.LJLJI);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C45205Hof c45205Hof = this.LJLJI;
        if (c45205Hof != null) {
            InterfaceC45222How interfaceC45222How = c45205Hof.LJI;
            if (interfaceC45222How != null) {
                InterfaceC45226Hp0 interfaceC45226Hp0 = this.LJLJJI;
                if (interfaceC45226Hp0 != null) {
                    i = interfaceC45226Hp0.LIZ();
                } else {
                    i = -1;
                }
                interfaceC45222How.LIZIZ(i);
            }
            LJJLIIIJJI(c45205Hof.LIZ);
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
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C45200Hoa(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), Activity.class, null);
    }

    private final void LJJLIIIJJI(C45203Hod c45203Hod) {
        InterfaceC45226Hp0 interfaceC45226Hp0 = this.LJLJJI;
        if (interfaceC45226Hp0 != null) {
            interfaceC45226Hp0.LIZIZ(c45203Hod);
        }
    }

    @Override // X.InterfaceC44718Hgo
    public void pH(C45205Hof config) {
        InterfaceC45227Hp1 c45220Hou;
        InterfaceC45226Hp0 c45201Hob;
        List<AutoCutMediaModel> list;
        o.LJIIIZ(config, "config");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent startAutoCut: config = ");
        LIZ.append(config);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (!LJJLIIIIJ().isFinishing() && C45087Hml.LJJII()) {
            C24540xm.LIZ(R.string.dtf, LJJLIIIIJ(), 1026);
            return;
        }
        if (!config.LIZ()) {
            return;
        }
        LJJLI();
        if (!config.LJ && ((list = this.LJLJJLL) == null || !AnonymousClass636.LJIIJ(list, config.LIZ.LJII))) {
            LLLZIL();
            this.LJLJJLL = config.LIZ.LJII;
        }
        this.LJLJI = config;
        Activity LJJLIIIIJ = LJJLIIIIJ();
        C82622Wbi diContainer = getDiContainer();
        C44630HfO c44630HfO = new C44630HfO(new C45219Hot(this), new C45216Hoq(this));
        if (C44720Hgq.LIZIZ() && LJJLIIIIJ != null && !LJJLIIIIJ.isFinishing()) {
            c45220Hou = new C45254HpS(LJJLIIIIJ, config, c44630HfO);
        } else if (C45232Hp6.LIZ()) {
            c45220Hou = new C45237HpB(LJJLIIIIJ, this);
        } else {
            c45220Hou = new C45220Hou(diContainer, config);
        }
        this.LJLJJL = c45220Hou;
        Activity activity = LJJLIIIIJ();
        o.LJIIIZ(activity, "activity");
        AutoCutThemeData autoCutThemeData = config.LIZ.LJIIIIZZ;
        OSZ LJJIJIIJIL = C45087Hml.LJJIJIIJIL(autoCutThemeData);
        Object first = LJJIJIIJIL.getFirst();
        String str = (String) LJJIJIIJIL.getSecond();
        if (config.LIZJ && autoCutThemeData != null && first != null && C78685UuP.LJJJZ(str)) {
            c45201Hob = new C45202Hoc(activity);
        } else {
            c45201Hob = new C45201Hob(activity);
        }
        this.LJLJJI = c45201Hob;
        InterfaceC45222How interfaceC45222How = config.LJI;
        if (interfaceC45222How != null) {
            interfaceC45222How.LIZJ(config.LIZ.LJII);
        }
        C6QQ.LIZ(new AqS157S0100000_7(this, 63));
        C45203Hod c45203Hod = config.LIZ;
        c45203Hod.LJIILJJIL.clear();
        InterfaceC45222How interfaceC45222How2 = config.LJI;
        if (interfaceC45222How2 != null) {
            c45203Hod.LJIILJJIL.add(interfaceC45222How2);
        }
        InterfaceC45227Hp1 interfaceC45227Hp1 = this.LJLJJL;
        if (interfaceC45227Hp1 != null) {
            c45203Hod.LJIILJJIL.add(interfaceC45227Hp1);
        }
        LJJLIIIJJI(config.LIZ);
    }

    @Override // X.InterfaceC44718Hgo
    public void Zl(List<AutoCutMediaModel> mediaModelList, AutoCutThemeData autoCutThemeData, int i, boolean z, CreativeInfo creativeInfo, InterfaceC88471Ynr<? super List<AutoCutThemeData>, ? super String, C76800UCe> successCallback) {
        o.LJIIIZ(mediaModelList, "mediaModelList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(successCallback, "successCallback");
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent preRecommendMusic");
        C45161Hnx.LIZIZ(null);
        OSZ<String, String> LJJIJ = C45087Hml.LJJIJ(mediaModelList, i, creativeInfo, false, z, "source_preload_music", false, new C45207Hoh(this, successCallback, autoCutThemeData));
        this.LJLJL = LJJIJ.getFirst();
        this.LJLJLJ = LJJIJ.getSecond();
    }
}
