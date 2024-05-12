package X;

import Y.ACallableS36S1200000_7;
import Y.AfS46S0300000_7;
import Y.IDuS319S0100000_7;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.INLEModelNetworkDelegate;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import defpackage.e1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HnN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45125HnN extends INLEModelNetworkDelegate {
    public final C5WP LIZ;
    public final java.util.Map<String, InterfaceC92693kP> LIZIZ;
    public final C62822Ol8 LIZJ;
    public InterfaceC45141Hnd LIZLLL;

    public C45125HnN(C5WP epModelCache) {
        o.LJIIIZ(epModelCache, "epModelCache");
        this.LIZ = epModelCache;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = C221108m2.LIZIZ(C45129HnR.LJLIL);
    }

    @Override // com.bytedance.ies.smartmovie.jni.INLEModelNetworkDelegate
    public final void cancel(String str) {
        C76800UCe c76800UCe;
        if (str == null) {
            return;
        }
        try {
            InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((LinkedHashMap) this.LIZIZ).get(str);
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        this.LIZIZ.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final com.bytedance.ies.nle.editor_jni.NLEModel r15, final X.InterfaceC88471Ynr<? super com.bytedance.ies.nle.editor_jni.NLEModel, ? super java.lang.Long, X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45125HnN.LIZ(com.bytedance.ies.nle.editor_jni.NLEModel, X.Ynr):void");
    }

    @Override // com.bytedance.ies.smartmovie.jni.INLEModelNetworkDelegate
    public final void request(NLEModelRequestParams nLEModelRequestParams, NLEModelRequestCallback nLEModelRequestCallback) {
        String NLEModelRequestParams_getExecId;
        String NLEModelRequestParams_getTemplateJSON;
        String str;
        String str2;
        String str3;
        if (nLEModelRequestParams != null) {
            SmartMovieJniJNI.NLEModelRequestParams_setReturnNLEConfig(nLEModelRequestParams.LIZ, nLEModelRequestParams, true);
            if (nLEModelRequestParams != null) {
                SmartMovieJniJNI.NLEModelRequestParams_setReturnMovieConfig(nLEModelRequestParams.LIZ, nLEModelRequestParams, e1.LIZ(31744, "studio_enable_autocut_return_algorithm_config", true, false));
            }
        }
        InterfaceC45141Hnd interfaceC45141Hnd = this.LIZLLL;
        if (interfaceC45141Hnd != null) {
            interfaceC45141Hnd.LJ();
        }
        String str4 = null;
        if (!C48203Ivv.LJ(C5L7.LIZ())) {
            if (nLEModelRequestCallback != null) {
                nLEModelRequestCallback.onFailure(SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue(), "Local Network NoAvailable", new UnorderedMapStrStr());
            }
            InterfaceC45141Hnd interfaceC45141Hnd2 = this.LIZLLL;
            if (interfaceC45141Hnd2 != null) {
                if (nLEModelRequestParams != null) {
                    str = SmartMovieJniJNI.NLEModelRequestParams_getRecConfig(nLEModelRequestParams.LIZ, nLEModelRequestParams);
                    str2 = SmartMovieJniJNI.NLEModelRequestParams_getRecKey(nLEModelRequestParams.LIZ, nLEModelRequestParams);
                } else {
                    str = null;
                    str2 = null;
                }
                if (nLEModelRequestParams != null) {
                    str3 = (String) nLEModelRequestParams.LIZ().get("autocut_template_type");
                    str4 = (String) nLEModelRequestParams.LIZ().get("source");
                } else {
                    str3 = null;
                }
                C45142Hne.LIZIZ(interfaceC45141Hnd2, false, 1000, 0, "Local Network NoAvailable", str, str2, null, "", null, null, str3, str4, 836);
                return;
            }
            return;
        }
        if (nLEModelRequestParams != null && (NLEModelRequestParams_getTemplateJSON = SmartMovieJniJNI.NLEModelRequestParams_getTemplateJSON(nLEModelRequestParams.LIZ, nLEModelRequestParams)) != null && NLEModelRequestParams_getTemplateJSON.length() > 0) {
            C10K.LIZJ(new ACallableS36S1200000_7(this, NLEModelRequestParams_getTemplateJSON, nLEModelRequestCallback, 1));
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "autocut param#templateJson is not empty, return");
            return;
        }
        InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJIIJ(new IDuS319S0100000_7(nLEModelRequestParams, 2)).LJJL(T16.LIZ()).LJJJLIIL(new AfS46S0300000_7(nLEModelRequestCallback, nLEModelRequestParams, this, 3), new AfS46S0300000_7(nLEModelRequestCallback, nLEModelRequestParams, this, 4));
        if (nLEModelRequestParams != null && (NLEModelRequestParams_getExecId = SmartMovieJniJNI.NLEModelRequestParams_getExecId(nLEModelRequestParams.LIZ, nLEModelRequestParams)) != null) {
            this.LIZIZ.put(NLEModelRequestParams_getExecId, LJJJLIIL);
        }
    }
}
