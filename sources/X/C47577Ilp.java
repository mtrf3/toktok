package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import org.json.JSONObject;

/* renamed from: X.Ilp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47577Ilp implements InterfaceC47580Ils {
    public final double[] LIZ = {0.54551238d, -0.03129748d, 0.19721764d, 0.24254935d, 0.01385684d, -1.56912212d, -0.40001913d, -0.57657028d, -0.63627456d, -0.13389704d, 0.0628909d, -0.13203807d, -0.08140563d, -0.09929551d, 0.10024534d, 0.31530643d};
    public String LIZIZ;
    public final double LIZJ;

    public C47577Ilp() {
        double optDouble;
        JSONObject LIZLLL = C47538IlC.LIZ.LIZLLL("net_quality");
        if (LIZLLL == null) {
            optDouble = 1.0d;
        } else {
            optDouble = LIZLLL.optDouble("link_function_offset", 1.0d);
        }
        this.LIZJ = optDouble;
        if (optDouble < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            this.LIZJ = 1.0d;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("link function offset: ");
        LIZ.append(this.LIZJ);
        C78253UnR.LJI("PortraitNetworkScore", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double LIZ(java.util.List<java.lang.Integer> r26, java.util.List<java.lang.Float> r27) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47577Ilp.LIZ(java.util.List, java.util.List):double");
    }
}
