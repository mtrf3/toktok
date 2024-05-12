package X;

import X.C141335gf;
import X.C3C5;
import X.E32;
import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.pitaya.cep_engine.CepEngineManager;
import com.bytedance.pitaya.cep_engine.CepEngineResult;
import com.bytedance.pitaya.cep_engine.error.CepErrorCode;
import com.bytedance.pitaya.cep_engine.helper.BooleanProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.DictProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.FloatProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.IntProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.ListProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.ProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.StrProxyHelper;
import com.bytedance.pitaya.cep_engine.port.CepAsyncListener;
import com.bytedance.pitaya.cep_engine.port.CepBizFunc;
import com.bytedance.pitaya.cep_package.CepPackageManager;
import com.bytedance.pitaya.cep_package.CepSetupInfo;
import com.bytedance.pitaya.cep_package.port.CepPackageCallback;
import com.bytedance.pitaya.cep_package.port.CepPackageInfo;
import com.bytedance.pitaya.cep_package.port.CepSettingsCallback;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FQD implements FQE {
    public static final FQD LIZ = new FQD();

    @Override // X.FQE
    public final void LIZ() {
        C48591J5f.LIZIZ.shutdown();
    }

    @Override // X.FQE
    public final void LIZIZ() {
        C48591J5f.LIZIZ.startup();
    }

    @Override // X.FQE
    public final void LJFF() {
        FQH fqh = C48591J5f.LIZIZ;
        fqh.initialize();
        fqh.startup();
    }

    @Override // X.FQE
    public final boolean LJ() {
        SmartHARService.Companion.getClass();
        return J4P.LIZ.triggerSmartHarPredict(String.valueOf(EF7.LJIIIZ), true);
    }

    @Override // X.FQE
    public final void LJI() {
        SmartHARService.Companion.getClass();
        J4P.LIZ.checkAndInit();
    }

    @Override // X.FQE
    public final int LJII() {
        SmartHARService.Companion.getClass();
        return J4P.LIZ.getLastStatus();
    }

    @Override // X.FQE
    public final boolean LJIIIZ() {
        SmartHARService.Companion.getClass();
        return J4P.LIZ.enable();
    }

    @Override // X.FQE
    public final void LJIILJJIL() {
        FQJ fqj = FQJ.LIZ;
        FQJ.LIZIZ = null;
        SmartHARService.Companion.getClass();
        J4P.LIZ.removePredictListener(fqj);
    }

    @Override // X.FQE
    public final boolean LJIIJ(C36721cK c36721cK) {
        if (c36721cK == null) {
            return false;
        }
        FQF.LIZ = c36721cK;
        return FQF.LIZIZ.registerOHRServiceObserver(FQF.LIZJ);
    }

    @Override // X.FQE
    public final void LJIILIIL(FQK fqk) {
        FQJ fqj = FQJ.LIZ;
        if (fqk == null) {
            return;
        }
        FQJ.LIZIZ = fqk;
        SmartHARService.Companion.getClass();
        J4P.LIZ.addPredictListener(fqj);
    }

    @Override // X.FQE
    public final void feedMotionEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        C48591J5f.LIZIZ.feedMotionEvent(ev);
    }

    @Override // X.FQE
    public final void LJIIIIZZ(String functionName, final IDqS416S0100000 iDqS416S0100000) {
        o.LJIIIZ(functionName, "functionName");
        if (!E32.LIZIZ.get()) {
            return;
        }
        CepPackageManager cepPackageManager = E32.LIZ;
        CepBizFunc cepBizFunc = new CepBizFunc() { // from class: com.ss.android.ugc.aweme.live.strategy.LiveCepManager$registerGlobalFunction$1
            @Override // com.bytedance.pitaya.cep_engine.port.CepBizFunc
            public ProxyHelper apply(ListProxyHelper input) {
                o.LJIIIZ(input, "input");
                try {
                    Object apply = apply(input.getData());
                    if (apply == null) {
                        return new ProxyHelper();
                    }
                    if (apply instanceof Byte) {
                        return new IntProxyHelper(((Number) apply).byteValue());
                    }
                    if (apply instanceof Short) {
                        return new IntProxyHelper(((Number) apply).shortValue());
                    }
                    if (apply instanceof Integer) {
                        return new IntProxyHelper(((Number) apply).intValue());
                    }
                    if (apply instanceof Long) {
                        return new IntProxyHelper(((Number) apply).longValue());
                    }
                    if (apply instanceof Float) {
                        return new FloatProxyHelper(((Number) apply).floatValue());
                    }
                    if (apply instanceof Double) {
                        return new FloatProxyHelper(((Number) apply).doubleValue());
                    }
                    if (apply instanceof Boolean) {
                        return new BooleanProxyHelper(((Boolean) apply).booleanValue());
                    }
                    if (apply instanceof String) {
                        return new StrProxyHelper((String) apply);
                    }
                    if (apply instanceof JSONObject) {
                        return new DictProxyHelper((JSONObject) apply);
                    }
                    if (apply instanceof JSONArray) {
                        return new ListProxyHelper((JSONArray) apply);
                    }
                    return new ProxyHelper();
                } catch (Throwable unused) {
                    return new ProxyHelper();
                }
            }

            @Override // com.bytedance.pitaya.cep_engine.port.CepBizFunc
            public Object apply(JSONArray input) {
                o.LJIIIZ(input, "input");
                return iDqS416S0100000.invoke(input);
            }
        };
        cepPackageManager.getClass();
        CepEngineManager.INSTANCE.registerBizFunc("1728", functionName, cepBizFunc);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.live.strategy.LiveCepManager$downloadAllPkgs$1] */
    @Override // X.FQE
    public final void LJIIJJI(final AnonymousClass233 onSuccess, final AnonymousClass234 onFail) {
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFail, "onFail");
        if (!E32.LIZIZ.get()) {
            return;
        }
        CepPackageManager cepPackageManager = E32.LIZ;
        ?? r0 = new CepPackageCallback() { // from class: com.ss.android.ugc.aweme.live.strategy.LiveCepManager$downloadAllPkgs$1
            @Override // com.bytedance.pitaya.cep_package.port.CepPackageCallback
            public void onResult(boolean z, String str, CepPackageInfo cepPackageInfo) {
                if (z) {
                    onSuccess.invoke();
                } else {
                    onFail.invoke();
                }
            }
        };
        cepPackageManager.getClass();
        CepPackageManager.LIZ(r0);
    }

    @Override // X.FQE
    public final void LIZJ(String eventName, long j, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        E32.LIZ(eventName, j, jSONObject);
    }

    @Override // X.FQE
    public final int LIZLLL(String str, String str2, String str3, Context context) {
        CepPackageManager cepPackageManager = E32.LIZ;
        C36457ESn c36457ESn = new C36457ESn();
        c36457ESn.LIZ = "1728";
        c36457ESn.LIZIZ = str;
        c36457ESn.LIZJ = str2;
        c36457ESn.LIZLLL = str3;
        c36457ESn.LJFF = false;
        c36457ESn.LJ = new CepSettingsCallback() { // from class: com.ss.android.ugc.aweme.live.strategy.LiveCepManager$initCEP$code$1
            @Override // com.bytedance.pitaya.cep_package.port.CepSettingsCallback
            public JSONObject getSettings(String key) {
                Object LIZ2;
                o.LJIIIZ(key, "key");
                try {
                    JSONObject jSONObject = E32.LIZJ;
                    PitayaExperiment.LIZ.getClass();
                    LIZ2 = jSONObject.putOpt("content", PitayaExperiment.LIZJ);
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ2) != null) {
                    LIZ2 = new JSONObject();
                }
                return (JSONObject) LIZ2;
            }
        };
        CepSetupInfo cepSetupInfo = new CepSetupInfo(c36457ESn);
        cepPackageManager.getClass();
        CepErrorCode LIZJ = CepPackageManager.LIZJ(context, cepSetupInfo);
        if (LIZJ != null) {
            int code = LIZJ.getCode();
            if (code != -1) {
                E32.LIZIZ.set(true);
                return code;
            }
            return code;
        }
        return -1;
    }

    @Override // X.FQE
    public final void LJIIL(String str, String str2, final IDqS416S0100000 iDqS416S0100000, final IDqS420S0100000 iDqS420S0100000, final IDqS443S0100000 iDqS443S0100000) {
        if (!E32.LIZIZ.get()) {
            return;
        }
        CepPackageManager cepPackageManager = E32.LIZ;
        CepAsyncListener cepAsyncListener = new CepAsyncListener() { // from class: com.ss.android.ugc.aweme.live.strategy.LiveCepManager$registerCallback$1
            @Override // com.bytedance.pitaya.cep_engine.port.CepAsyncListener
            public void onFinish(CepEngineResult result) {
                o.LJIIIZ(result, "result");
                if (result.getSuccess()) {
                    iDqS416S0100000.invoke(result.getEvents());
                } else if (result.getError().length() == 0) {
                    iDqS420S0100000.invoke();
                } else {
                    iDqS443S0100000.invoke(result.getError(), result.getEvents());
                }
            }
        };
        cepPackageManager.getClass();
        CepEngineManager.INSTANCE.registerRuleListener(C00F.LIZIZ("1728", '$', str), str2, cepAsyncListener);
    }
}
