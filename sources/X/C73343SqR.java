package X;

import Y.ARunnableS6S1100100_6;
import android.app.Application;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SqR */
/* loaded from: classes13.dex */
public final class C73343SqR implements InterfaceC75414Tik, IFoundationAVService.IFetchResourcesListener, InterfaceC73364Sqm, InterfaceC73592SuS, InterfaceC48038ItG {
    public static boolean LJLIL;
    public static boolean LJLILLLLZI;
    public static boolean LJLJI;
    public static boolean LJLJJL;
    public static final C73343SqR LJLJJI = new C73343SqR();
    public static final C73343SqR LJLJJLL = new C73343SqR();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public void onFailed(Exception exc) {
    }

    public static void LIZIZ() {
        if (!LJLIL && ((Boolean) C47994IsY.LIZ.getValue()).booleanValue()) {
            C13870gZ.LIZ().checkInit();
            LJLIL = true;
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        EffectChannelResponseTemplate resp = (EffectChannelResponseTemplate) obj;
        o.LJIIIZ(resp, "resp");
        List<EffectCategoryResponse> categoryResponseList = resp.getCategoryResponseList();
        if (categoryResponseList != null && (!categoryResponseList.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(categoryResponseList, 10));
            for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                arrayList.addAll(totalEffects);
                arrayList2.add(new OSZ(effectCategoryResponse, totalEffects));
            }
            return new C73344SqS(arrayList, arrayList2);
        }
        return new C73344SqS(resp.getAllCategoryEffects(), C61878OQg.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        List requirement = C47261Igj.LJJIJIIJI(Arrays.copyOf(requirements, requirements.length));
        o.LJIIIZ(requirement, "requirement");
        ((ArrayList) C121024p0.LIZ).addAll(requirement);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75414Tik
    public void onSuccess(Object value) {
        o.LJIIIZ(value, "value");
    }

    public static void LJI(boolean z, boolean z2) {
        LJLILLLLZI = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(V2B.LJIIIIZZ(application, "monitor_data_switch"), "is_debug");
            if (z) {
                V2B.LJIILIIL(file);
            } else {
                if (!file.exists()) {
                    return;
                }
                C16880lQ.LLLZZIL(file);
            }
        }
    }

    public static void LJII(boolean z, boolean z2) {
        LJLJI = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(V2B.LJIIIIZZ(application, "monitor_data_switch"), "is_output_file");
            if (z) {
                V2B.LJIILIIL(file);
            } else {
                if (!file.exists()) {
                    return;
                }
                C16880lQ.LLLZZIL(file);
            }
        }
    }

    @Override // X.InterfaceC73364Sqm
    public void LIZ(Cert cert, String str) {
        String str2;
        C43750HFa c43750HFa = new C43750HFa();
        C43751HFb c43751HFb = c43750HFa.LJIIJ;
        if (c43751HFb != null) {
            if (cert != null) {
                str2 = cert.toString();
            } else {
                str2 = null;
            }
            c43751HFb.LIZJ = str2;
        }
        C43751HFb c43751HFb2 = c43750HFa.LIZIZ;
        if (c43751HFb2 != null) {
            c43751HFb2.LIZJ = str;
        }
        String LIZJ = PKW.LIZJ(new Throwable("IllegalUseSensitiveApi"));
        o.LJIIIIZZ(LIZJ, "getExceptionStack(Throwa…IllegalUseSensitiveApi\"))");
        PL4.LIZ(c43750HFa, LIZJ, "SensitiveApiManagement", "creative_tools_sensitive_api_error");
    }

    @Override // X.InterfaceC75414Tik
    public void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto permitApply, ");
        LIZ.append("tryRefuseApplyByArcIncompatibleInner");
        LIZ.append(", error = ");
        LIZ.append(error);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C1EW.LIZLLL(LIZ, str, LIZ, "MultiHostCrossRefuseManager");
    }

    public static final void LIZJ(long j, IEventMonitor iEventMonitor, String str) {
        C38995FSd.LIZIZ().execute(new ARunnableS6S1100100_6(j, iEventMonitor, str, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LJFF(C73345SqT c73345SqT, HashMap hashMap, int i) {
        if ((i & 8) != 0) {
            hashMap = null;
        }
        c73345SqT.LJIIL(null, null, null, hashMap);
    }
}
