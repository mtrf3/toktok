package X;

import com.bytedance.helios.api.consumer.OperateHistory;
import com.bytedance.ruler.base.models.RuleModel;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.AqS8S2300000_11;
import ujb.o;

/* renamed from: X.Pu5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65925Pu5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PYQ pyq, C39522FfC c39522FfC, m mVar, OperateHistory operateHistory, String str) {
        RuleModel ruleModel = c39522FfC.LIZJ;
        if (ruleModel != null) {
            j LJJIJ = mVar.LJJIJ("is_report");
            if (LJJIJ == null || LJJIJ.LJFF()) {
                pyq.LJJJJL().LJZI.LJLILLLLZI = true;
            }
            String str2 = ruleModel.key;
            if (str2 != null && !o.LJJJJJL(str2)) {
                pyq.LJJJJL().LJLLILLLL.add(str2);
            }
            if (!pyq.LJJJJL().LJLLLLLL.contains(ruleModel)) {
                pyq.LJJJJL().LJLLLLLL.add(ruleModel);
                C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS8S2300000_11(str2, ruleModel, pyq, operateHistory, str, 1), 0, null, 12);
            }
        }
    }
}
