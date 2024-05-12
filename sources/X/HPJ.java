package X;

import Y.IDeS403S0100000_7;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPJ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String[] strArr, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (strArr == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C04330Ez.LIZ(activity, str)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj, String[] strArr, InterfaceC88471Ynr interfaceC88471Ynr, HPI hpi, TokenCert tokenCert) {
        if (LIZ(strArr, activityC45651qj)) {
            ArrayList arrayList = new ArrayList(strArr.length);
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                arrayList.add(0);
            }
            hpi.LIZ(ORZ.LLJ(arrayList), strArr);
            return;
        }
        if (C78934UyQ.LJLIL.LJ().LJFF()) {
            C61099NyR.LIZIZ.LIZIZ(activityC45651qj, tokenCert).LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new IDeS403S0100000_7(new HPK(activityC45651qj, hpi, interfaceC88471Ynr), 7));
        } else {
            interfaceC88471Ynr.invoke(strArr, null);
        }
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj, String str, String str2, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        if (str != null) {
            c26227ARb.LJFF(str);
        }
        c26227ARb.LIZIZ(str2);
        c26227ARb.LJII = false;
        UC0.LIZJ(c26227ARb, new AqS137S0200000_6(activityC45651qj, (ActivityC45651qj) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 32));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(activityC45651qj, c26227ARb);
        autoDismissPermissionDialog.LJLJJI = new AqS168S0100000_2(interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 508);
        autoDismissPermissionDialog.LIZ();
    }
}
