package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Qup, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68519Qup {
    public final InterfaceC68532Qv2 LIZ = (InterfaceC68532Qv2) C77119UOl.LJIIL(C58725N2z.LIZ, InterfaceC68532Qv2.class);

    public final void LIZIZ(List<? extends BaseLoginMethod> loginMethods) {
        o.LJIIIZ(loginMethods, "loginMethods");
        List LLJILJILJ = ORZ.LLJILJILJ(loginMethods);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LLJILJILJ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) next;
            if (baseLoginMethod.isHistoryLogin() || o.LJ(baseLoginMethod.isHistoryOff(), Boolean.TRUE) || baseLoginMethod.m102isOneClickLogin()) {
                arrayList.add(next);
            }
        }
        this.LIZ.LIZ(GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), arrayList));
    }

    public static void LIZ(List list, BaseLoginMethod baseLoginMethod) {
        if (baseLoginMethod instanceof PhoneLoginMethod) {
            PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
            String nationalNumber = phoneLoginMethod.getPhoneNumber().getNationalNumber();
            if (nationalNumber == null || nationalNumber.length() == 0) {
                return;
            }
            if (!o.LJ(phoneLoginMethod.isFromReInstallNet(), Boolean.TRUE)) {
                try {
                    if (CastLongProtector.parseLong(phoneLoginMethod.getPhoneNumber().getNationalNumber()) <= 0) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }
        ((ArrayList) list).add(baseLoginMethod);
    }
}
