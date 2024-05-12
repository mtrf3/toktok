package X;

import Y.AfS42S0300000_3;
import Y.AfS52S0200000_3;
import Y.AfS53S0100000_1;
import Y.AgS123S0100000_6;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.experiments.UnLoginDiggExperiment2022;
import com.ss.android.ugc.aweme.service.AttributionService;
import com.ss.android.ugc.aweme.service.IAttributionService;
import com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService;
import com.ss.android.ugc.aweme.service.unlogindigg.UnLoginDiggService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS95S0300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fc2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39326Fc2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(Bundle bundle, InterfaceC88472Yns interfaceC88472Yns) {
        if (bundle == null) {
            C10K LJIIIIZZ = C10K.LJIIIIZZ(new Exception("Bundle is empty"));
            o.LJIIIIZZ(LJIIIIZZ, "forError(Exception(\"Bundle is empty\"))");
            interfaceC88472Yns.invoke(LJIIIIZZ);
        }
        AqS95S0300000_6 aqS95S0300000_6 = new AqS95S0300000_6((List) new ArrayList(), (List<InterfaceC40404FtQ>) interfaceC88472Yns, (InterfaceC88472Yns<? super C10K<Bundle>, C76800UCe>) bundle, (Bundle) 1);
        TwoStepAuthApi.LIZ.getClass();
        if (TwoStepAuthApi.LJ() && !TextUtils.isEmpty(TwoStepAuthApi.LIZJ)) {
            String str = TwoStepAuthApi.LIZJ;
            o.LJI(str);
            TwoStepAuthApi.LIZIZ().addAuthDevice(str, null, null);
            TwoStepAuthApi.LIZJ = null;
        }
        if (UnLoginDiggExperiment2022.LIZIZ()) {
            IUnLoginDiggService LJIIJ = UnLoginDiggService.LJIIJ();
            LIZ("like_sync_request", bundle, null);
            C73318Sq2 c73318Sq2 = new C73318Sq2();
            C78999UzT.LJFF(LJIIJ.LJFF().LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LJJII(new AfS42S0300000_3(LJIIJ, bundle, c73318Sq2, 1), new AfS52S0200000_3(c73318Sq2, bundle, 23)), c73318Sq2);
        }
        if (!((RBY) HG3.LJIILL()).isChildrenMode()) {
            UgCommonServiceImpl.LJIJ().LJII();
            C39288FbQ LIZIZ = C39284FbM.LIZIZ();
            IAttributionService LIZIZ2 = AttributionService.LIZIZ();
            C73318Sq2 c73318Sq22 = new C73318Sq2();
            C78999UzT.LJFF(LIZIZ2.LIZ(LIZIZ, true).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LJJII(new AfS53S0100000_1(c73318Sq22, 90), new AfS53S0100000_1(c73318Sq22, 91)), c73318Sq22);
        }
        C10K LIZJ = C10K.LIZJ(CallableC39327Fc3.LJLIL);
        o.LJIIIIZZ(LIZJ, "callInBackground {\n     …)\n            }\n        }");
        LIZJ.LJFF(new AgS123S0100000_6(bundle, 18)).LJ(new AgS123S0100000_6(aqS95S0300000_6, 19), C10K.LJIIIIZZ, null);
    }

    public static void LIZ(String str, Bundle bundle, Integer num) {
        String str2;
        String string;
        String str3 = "";
        if (bundle == null || (str2 = bundle.getString("enter_from")) == null) {
            str2 = "";
        }
        if (bundle != null && (string = bundle.getString("enter_method")) != null) {
            str3 = string;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("enter_method", str3);
        if (num != null) {
            num.intValue();
            c188727au.LJI("result", num.toString());
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
