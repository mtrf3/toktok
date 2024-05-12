package X;

import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.HnP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45127HnP extends AbstractC65781Prl implements InterfaceC88474Ynu<Integer, Integer, String, String, C76800UCe> {
    public final /* synthetic */ NLEModelRequestCallback LJLIL;
    public final /* synthetic */ C45125HnN LJLILLLLZI;
    public final /* synthetic */ NLEModelRequestParams LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45127HnP(NLEModelRequestCallback nLEModelRequestCallback, NLEModelRequestParams nLEModelRequestParams, C45125HnN c45125HnN) {
        super(4);
        this.LJLIL = nLEModelRequestCallback;
        this.LJLILLLLZI = c45125HnN;
        this.LJLJI = nLEModelRequestParams;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, String str, String str2) {
        String str3;
        String str4;
        String str5;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        String errorMsg = str;
        String str6 = str2;
        o.LJIIIZ(errorMsg, "errorMsg");
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        if (e1.LIZ(31744, "autocut_success_rate_optimize_enable", true, false) && intValue == 5000 && (intValue2 == -199 || intValue2 == -106)) {
            unorderedMapStrStr.put("weak_net", "weak_net");
        }
        NLEModelRequestCallback nLEModelRequestCallback = this.LJLIL;
        if (nLEModelRequestCallback != null) {
            nLEModelRequestCallback.onFailure(SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue(), errorMsg, unorderedMapStrStr);
        }
        InterfaceC45141Hnd interfaceC45141Hnd = this.LJLILLLLZI.LIZLLL;
        if (interfaceC45141Hnd != null) {
            NLEModelRequestParams nLEModelRequestParams = this.LJLJI;
            String str7 = null;
            if (nLEModelRequestParams != null) {
                str3 = SmartMovieJniJNI.NLEModelRequestParams_getRecConfig(nLEModelRequestParams.LIZ, nLEModelRequestParams);
            } else {
                str3 = null;
            }
            NLEModelRequestParams nLEModelRequestParams2 = this.LJLJI;
            if (nLEModelRequestParams2 != null) {
                str4 = SmartMovieJniJNI.NLEModelRequestParams_getRecKey(nLEModelRequestParams2.LIZ, nLEModelRequestParams2);
            } else {
                str4 = null;
            }
            NLEModelRequestParams nLEModelRequestParams3 = this.LJLJI;
            if (nLEModelRequestParams3 != null) {
                str5 = (String) nLEModelRequestParams3.LIZ().get("autocut_template_type");
            } else {
                str5 = null;
            }
            NLEModelRequestParams nLEModelRequestParams4 = this.LJLJI;
            if (nLEModelRequestParams4 != null) {
                str7 = (String) nLEModelRequestParams4.LIZ().get("source");
            }
            C45142Hne.LIZIZ(interfaceC45141Hnd, false, intValue, intValue2, errorMsg, str3, str4, str6, null, null, null, str5, str7, 896);
        }
        return C76800UCe.LIZ;
    }
}
