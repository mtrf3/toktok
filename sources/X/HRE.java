package X;

import Y.IDeS403S0100000_7;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activity, HPI hpi, InterfaceC65784Pro interfaceC65784Pro, TokenCert cert) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cert, "cert");
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        HRF hrf = HRF.LJLIL;
        if (C78605Ut7.LIZJ(strArr)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(0);
            hpi.LIZ(ORZ.LLJ(arrayList), strArr);
        } else {
            if (C44172HVg.LJJI.LJ().LJFF()) {
                HVO.LIZJ(strArr, activity, "shoot_page");
                C61099NyR.LIZIZ.LIZIZ(activity, cert).LIZ((String[]) Arrays.copyOf(strArr, 1)).LIZJ(new IDeS403S0100000_7(new HRD(activity, hpi, interfaceC65784Pro, hrf), 5));
                return;
            }
            hrf.invoke(strArr, null);
        }
    }
}
