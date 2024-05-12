package X;

import com.bytedance.android.livesdk.livesetting.other.LiveRevenueFeatureCollectService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1cI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36701cI implements InterfaceC20950rz {
    public static final C36701cI LIZ = new C36701cI();
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(C27X.LJLIL);

    @Override // X.InterfaceC20950rz
    public final void LIZ(String str, JSONObject jSONObject, int i, InterfaceC22840v2 interfaceC22840v2) {
        String str2;
        JSONObject jSONObject2 = jSONObject;
        InterfaceC22840v2 interfaceC22840v22 = interfaceC22840v2;
        C5H3 c5h3 = LIZIZ;
        if (((LiveRevenueFeatureCollectService) c5h3.getValue()).enable > 0) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("collect type == ", str, ", input data == ");
            if (jSONObject2 != null) {
                str2 = jSONObject2.toString();
            } else {
                str2 = null;
            }
            LIZIZ2.append(str2);
            C0NB.LIZIZ("LiveFeatureCollectService", X1D.LIZIZ(LIZIZ2));
            InterfaceC22790ux LJFF = C0IT.LJFF();
            String str3 = ((LiveRevenueFeatureCollectService) c5h3.getValue()).businessName;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            C22820v0 c22820v0 = new C22820v0(false, jSONObject2.putOpt("feature_collect_type", str));
            if (interfaceC22840v22 == null) {
                interfaceC22840v22 = new InterfaceC22840v2() { // from class: X.1cH
                    @Override // X.InterfaceC22840v2
                    public final void LJIILIIL(C22830v1 outputData) {
                        o.LJIIIZ(outputData, "outputData");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("task output data [isSuccess == ");
                        LIZ2.append(outputData.LIZ());
                        LIZ2.append(", code == ");
                        LIZ2.append(outputData.LIZ);
                        LIZ2.append(", data == ");
                        LIZ2.append(outputData.LIZIZ);
                        LIZ2.append(']');
                        C0NB.LIZIZ("LiveFeatureCollectService", X1D.LIZIZ(LIZ2));
                    }
                };
            }
            ((C29921Fk) LJFF).LIZJ(new C22810uz(str3, c22820v0, interfaceC22840v22, new C35201Zs(i, false, 0, 0L, 0L, 0L, 62), 8));
        }
    }
}
