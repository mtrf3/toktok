package kotlin.jvm.internal;

import X.AR4;
import X.ARH;
import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C17N;
import X.C26227ARb;
import X.C37356ElM;
import X.C37692Eqm;
import X.C43I;
import X.C44384HbQ;
import X.C46104I7o;
import X.C46108I7s;
import X.C4LX;
import X.C65352Pkq;
import X.C76800UCe;
import X.C77123UOp;
import X.C78540Us4;
import X.C79236V7w;
import X.C85057XZt;
import X.C85136XbA;
import X.C85144XbI;
import X.C85149XbN;
import X.C85360Xem;
import X.C85427Xfr;
import X.C86226Xsk;
import X.C86894Y8k;
import X.C86895Y8l;
import X.EnumC85151XbP;
import X.EnumC86061Xq5;
import X.HG3;
import X.InterfaceC38263Ezz;
import X.InterfaceC65784Pro;
import X.InterfaceC85424Xfo;
import X.InterfaceC85426Xfq;
import X.InterfaceC88472Yns;
import X.MBA;
import X.OPZ;
import X.PNN;
import X.UC0;
import X.Y4F;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import android.os.Process;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public class AqS119S0300000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(AR4 it) {
        o.LJIIIZ(it, "it");
        HG3.LJIIL();
        HG3.LJLJL.LJIIL().openTwoStepVerificationManageActivity((ActivityC45651qj) this.l0, ((C85057XZt) this.l1).LJFF);
        ((TwoStepVerificationService) this.l2).fireETForPopupAction((C85057XZt) this.l1, false);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        aqS119S0300000_15.invoke$0((AR4) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        Activity activity;
        Object LLILL;
        float f;
        float f2;
        Float valueOf;
        Activity LIZLLL;
        Intent LJJLIIIJILLIZJL;
        float floatValue = ((Number) obj).floatValue();
        CompletionBlock completionBlock = (CompletionBlock) aqS119S0300000_15.l1;
        XBaseModel LJIILJJIL = C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC85424Xfo.class));
        InterfaceC85424Xfo interfaceC85424Xfo = (InterfaceC85424Xfo) LJIILJJIL;
        InterfaceC38263Ezz interfaceC38263Ezz = ((PNN) aqS119S0300000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        InterfaceC85426Xfq interfaceC85426Xfq = (InterfaceC85426Xfq) aqS119S0300000_15.l2;
        if (activity != null && (LLILL = C16880lQ.LLILL(activity, "activity")) != null) {
            ActivityManager activityManager = (ActivityManager) LLILL;
            C85427Xfr c85427Xfr = new C85427Xfr();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            Boolean memoryAll = interfaceC85426Xfq.getMemoryAll();
            Boolean bool = Boolean.TRUE;
            if (o.LJ(memoryAll, bool)) {
                f = ((float) memoryInfo.totalMem) / 1048576.0f;
            } else {
                f = -2.0f;
            }
            c85427Xfr.LIZ = f;
            if (o.LJ(interfaceC85426Xfq.getMemoryRest(), bool)) {
                f2 = ((float) memoryInfo.availMem) / 1048576.0f;
            } else {
                f2 = -2.0f;
            }
            c85427Xfr.LIZJ = f2;
            float f3 = -1.0f;
            if (o.LJ(interfaceC85426Xfq.getMemoryUse(), bool)) {
                Debug.MemoryInfo[] LLJJL = C16880lQ.LLJJL(activityManager, new int[]{Process.myPid()});
                o.LJFF(LLJJL, "activityManager.getProce…ArrayOf(Process.myPid()))");
                if (LLJJL.length == 0) {
                    c85427Xfr.LIZIZ = -1.0f;
                } else {
                    Debug.MemoryInfo memoryInfo2 = LLJJL[0];
                    c85427Xfr.LIZIZ = (memoryInfo2.dalvikPss + memoryInfo2.nativePss) / 1024.0f;
                }
            } else {
                c85427Xfr.LIZIZ = -2.0f;
            }
            if (o.LJ(interfaceC85426Xfq.getMemoryLimit(), bool)) {
                c85427Xfr.LIZLLL = activityManager.getLargeMemoryClass();
            } else {
                c85427Xfr.LIZLLL = -2.0f;
            }
            interfaceC85424Xfo.setMemoryAll(Float.valueOf(c85427Xfr.LIZ));
            interfaceC85424Xfo.setMemoryUse(Float.valueOf(c85427Xfr.LIZIZ));
            interfaceC85424Xfo.setMemoryRest(Float.valueOf(c85427Xfr.LIZJ));
            interfaceC85424Xfo.setMemoryLimit(Float.valueOf(c85427Xfr.LIZLLL));
            interfaceC85424Xfo.setCpuUsage(Float.valueOf(floatValue));
            if (o.LJ(((InterfaceC85426Xfq) aqS119S0300000_15.l2).getTemperature(), bool)) {
                InterfaceC38263Ezz interfaceC38263Ezz2 = ((PNN) aqS119S0300000_15.l0).LJLIL;
                if (interfaceC38263Ezz2 != null && (LIZLLL = interfaceC38263Ezz2.LIZLLL()) != null && (LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, LIZLLL, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null) {
                    f3 = LJJLIIIJILLIZJL.getIntExtra("temperature", 0) / 10.0f;
                }
                valueOf = Float.valueOf(f3);
            } else {
                valueOf = Float.valueOf(-2.0f);
            }
            interfaceC85424Xfo.setTemperature(valueOf);
            completionBlock.onSuccess((XBaseResultModel) LJIILJJIL, "");
            return C76800UCe.LIZ;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.app.ActivityManager");
    }

    public static final Object invoke$10(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) aqS119S0300000_15.l0).getString(R.string.t8w);
        o.LJIIIIZZ(string, "ctx.getString(R.string.t…e_turnOff2svModal_offBtn)");
        actionGroup.LJII(string, new AqS146S0200000_15((TwoStepVerificationActivityAssem) aqS119S0300000_15.l1, (EnumC85151XbP) aqS119S0300000_15.l2, 79));
        String string2 = ((Context) aqS119S0300000_15.l0).getString(R.string.t97);
        o.LJIIIIZZ(string2, "ctx.getString(R.string.t…_trustedDevice_cancelBtn)");
        actionGroup.LJIIIZ(string2, null);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI = true;
        String string = ((Context) aqS119S0300000_15.l0).getString(R.string.t8_);
        o.LJIIIIZZ(string, "ctx.getString(R.string.t…age_emailModal_updateBtn)");
        actionGroup.LJII(string, new AqS146S0200000_15((TwoStepVerificationActivityAssem) aqS119S0300000_15.l1, (C85136XbA) aqS119S0300000_15.l2, 81));
        actionGroup.LJIIIIZZ(R.string.rmt, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS119S0300000_15 aqS119S0300000_15, Object it) {
        EnumC85151XbP enumC85151XbP;
        o.LJIIIZ(it, "it");
        C85144XbI.LJJIIZ(((TwoStepVerificationActivityAssem) aqS119S0300000_15.l0).LJLLLLLL.getVerifyTypeFromMethod(((C85136XbA) aqS119S0300000_15.l1).LIZJ), ((TwoStepVerificationActivityAssem) aqS119S0300000_15.l0).getEnterFrom());
        C85136XbA c85136XbA = ((C85149XbN) aqS119S0300000_15.l2).LIZ;
        if (c85136XbA != null) {
            enumC85151XbP = c85136XbA.LIZJ;
        } else {
            enumC85151XbP = null;
        }
        if (enumC85151XbP == EnumC85151XbP.TOTP) {
            TwoStepVerificationActivityAssem twoStepVerificationActivityAssem = (TwoStepVerificationActivityAssem) aqS119S0300000_15.l0;
            C85136XbA c85136XbA2 = (C85136XbA) aqS119S0300000_15.l1;
            Context context = twoStepVerificationActivityAssem.getContext();
            if (context != null) {
                C26227ARb c26227ARb = new C26227ARb(context);
                c26227ARb.LJFF(context.getString(R.string.she));
                c26227ARb.LIZIZ(context.getString(R.string.shd));
                UC0.LIZJ(c26227ARb, new AqS119S0300000_15(context, twoStepVerificationActivityAssem, c85136XbA2, 11));
                c26227ARb.LJI().LIZLLL();
            }
        } else {
            ((TwoStepVerificationActivityAssem) aqS119S0300000_15.l0).A3().Fv0(((C85136XbA) aqS119S0300000_15.l1).LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        List<PNSAgeConfirmOption> options = ((PNSDialogModel) aqS119S0300000_15.l0).getOptions();
        if (options != null) {
            TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment = (TTKAgeGateRegistrationFragment) aqS119S0300000_15.l1;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS119S0300000_15.l2;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : options) {
                if (pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.DISMISS.getType()) {
                    buttonGroup.LJFF(pNSAgeConfirmOption.getOptionContent(), new AqS179S0100000_13(tTKAgeGateRegistrationFragment, 662));
                } else {
                    buttonGroup.LJFF(pNSAgeConfirmOption.getOptionContent(), new AqS172S0100000_6(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 145));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C85360Xem((AVPublishContentType) aqS119S0300000_15.l0, (ExtensionMisc) aqS119S0300000_15.l1, (PoiData) aqS119S0300000_15.l2, AVPublishPageScene.MAIN);
        hierarchyData.LIZIZ = "PoiPublishExtensionData";
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        User user;
        Integer valueOf;
        C43I c43i = (C43I) obj;
        Y4F y4f = null;
        if (c43i != null && (user = (User) c43i.LIZ) != null && (valueOf = Integer.valueOf(user.visibleVideosCount)) != null && valueOf.intValue() != 0) {
            View view = (View) aqS119S0300000_15.l0;
            C86895Y8l c86895Y8l = (C86895Y8l) aqS119S0300000_15.l1;
            C79236V7w c79236V7w = (C79236V7w) aqS119S0300000_15.l2;
            String videoNumber = C77123UOp.LJJIIJ(valueOf.intValue());
            if (view instanceof Y4F) {
                y4f = (Y4F) view;
            }
            if (y4f != null) {
                o.LJIIIIZZ(videoNumber, "videoNumber");
                y4f.setVideoNumber(videoNumber);
            }
            C86894Y8k c86894Y8k = c86895Y8l.LIZIZ;
            if (c86894Y8k != null) {
                String string = c86894Y8k.getContext().getString(R.string.rfp);
                o.LJIIIIZZ(string, "context.getString(R.stri…v_profile_tab_text_posts)");
                int LIZIZ = C86894Y8k.LIZIZ(string);
                o.LJIIIIZZ(videoNumber, "videoNumber");
                c86894Y8k.LJLJJI.put(Integer.valueOf(c79236V7w.LIZ), Integer.valueOf(C86894Y8k.LIZIZ(videoNumber) + LIZIZ + ((int) C44384HbQ.LJJJLL(30))));
                c86894Y8k.LJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS119S0300000_15.l0;
        Object obj2 = aqS119S0300000_15.l1;
        MBA mba = (MBA) aqS119S0300000_15.l2;
        C46108I7s LIZLLL = C46104I7o.LIZLLL(interfaceC88472Yns, obj2, null);
        if (LIZLLL != null) {
            C78540Us4.LJIIJ(mba, LIZLLL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS119S0300000_15 aqS119S0300000_15, Object it) {
        o.LJIIIZ(it, "it");
        ((Map) aqS119S0300000_15.l0).put("is_confirm", "1");
        OPZ.LJ("age_edit_confirm_popup_result", (Map) aqS119S0300000_15.l0, ((AgeGateFragment) aqS119S0300000_15.l1).Ol());
        ((InterfaceC65784Pro) aqS119S0300000_15.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS119S0300000_15 aqS119S0300000_15, Object it) {
        o.LJIIIZ(it, "it");
        ((Map) aqS119S0300000_15.l0).put("type", String.valueOf((Integer) aqS119S0300000_15.l1));
        ((Map) aqS119S0300000_15.l0).put("result", "dismiss");
        OPZ.LJ("age_gate_popup_show", (Map) aqS119S0300000_15.l0, ((AgeGateFragment) aqS119S0300000_15.l2).Ol());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        List<PNSAgeConfirmOption> options = ((PNSDialogModel) aqS119S0300000_15.l0).getOptions();
        if (options != null) {
            AgeGateFragment ageGateFragment = (AgeGateFragment) aqS119S0300000_15.l1;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS119S0300000_15.l2;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : options) {
                if (pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.DISMISS.getType()) {
                    buttonGroup.LJFF(pNSAgeConfirmOption.getOptionContent(), new AqS176S0100000_10(ageGateFragment, 176));
                } else {
                    buttonGroup.LJFF(pNSAgeConfirmOption.getOptionContent(), new AqS172S0100000_6(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 94));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        List<String> compressFilePath = (List) obj;
        o.LJIIIZ(compressFilePath, "compressFilePath");
        C86226Xsk c86226Xsk = (C86226Xsk) aqS119S0300000_15.l0;
        if (c86226Xsk.LJIIIIZZ == 2) {
            Activity activity = (Activity) aqS119S0300000_15.l1;
            List<String> list = (List) aqS119S0300000_15.l2;
            c86226Xsk.LIZ(activity, list, compressFilePath, list);
        } else {
            c86226Xsk.LIZ((Activity) aqS119S0300000_15.l1, (List) aqS119S0300000_15.l2, compressFilePath, compressFilePath);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS119S0300000_15 aqS119S0300000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) aqS119S0300000_15.l0).getString(R.string.t8q);
        o.LJIIIIZZ(string, "ctx.getString(R.string.t…veMethodModal_confirmBtn)");
        actionGroup.LJII(string, new AqS146S0200000_15((TwoStepVerificationActivityAssem) aqS119S0300000_15.l1, (EnumC85151XbP) aqS119S0300000_15.l2, 75));
        String string2 = ((Context) aqS119S0300000_15.l0).getString(R.string.t97);
        o.LJIIIIZZ(string2, "ctx.getString(R.string.t…_trustedDevice_cancelBtn)");
        actionGroup.LJIIIZ(string2, null);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS119S0300000_15(ActivityC45651qj activityC45651qj, C85057XZt c85057XZt, TwoStepVerificationService twoStepVerificationService, int i) {
        super(1);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c85057XZt;
        this.l2 = twoStepVerificationService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS119S0300000_15(PNN pnn, C37356ElM c37356ElM, InterfaceC85426Xfq interfaceC85426Xfq, int i) {
        super(1);
        this.$t = i;
        this.l0 = pnn;
        this.l1 = c37356ElM;
        this.l2 = interfaceC85426Xfq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS119S0300000_15(C86226Xsk c86226Xsk, C86226Xsk c86226Xsk2, Activity activity, List<String> list) {
        super(1);
        this.$t = list;
        this.l0 = c86226Xsk;
        this.l1 = c86226Xsk2;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS119S0300000_15(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2, Object obj, MBA mba) {
        super(1);
        this.$t = mba;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS119S0300000_15(Context context, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C85136XbA c85136XbA, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = twoStepVerificationActivityAssem;
        this.l2 = c85136XbA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS119S0300000_15(Context context, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, EnumC85151XbP enumC85151XbP, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = twoStepVerificationActivityAssem;
        this.l2 = enumC85151XbP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS119S0300000_15(View view, C86895Y8l c86895Y8l, C79236V7w c79236V7w, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = c86895Y8l;
        this.l2 = c79236V7w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS119S0300000_15(TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C85136XbA c85136XbA, C85149XbN c85149XbN, int i) {
        super(1);
        this.$t = i;
        this.l0 = twoStepVerificationActivityAssem;
        this.l1 = c85136XbA;
        this.l2 = c85149XbN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS119S0300000_15(PNSDialogModel pNSDialogModel, PNSDialogModel pNSDialogModel2, TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = pNSDialogModel;
        this.l1 = pNSDialogModel2;
        this.l2 = tTKAgeGateRegistrationFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS119S0300000_15(PNSDialogModel pNSDialogModel, PNSDialogModel pNSDialogModel2, AgeGateFragment ageGateFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = pNSDialogModel;
        this.l1 = pNSDialogModel2;
        this.l2 = ageGateFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS119S0300000_15(AVPublishContentType aVPublishContentType, ExtensionMisc extensionMisc, PoiData poiData, int i) {
        super(1);
        this.$t = i;
        this.l0 = aVPublishContentType;
        this.l1 = extensionMisc;
        this.l2 = poiData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS119S0300000_15(Map map, Map<String, String> map2, AgeGateFragment ageGateFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = ageGateFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS119S0300000_15(Map map, Map<String, String> map2, Integer num, AgeGateFragment ageGateFragment) {
        super(1);
        this.$t = ageGateFragment;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = num;
    }
}
