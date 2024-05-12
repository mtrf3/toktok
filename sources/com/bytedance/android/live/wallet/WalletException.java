package com.bytedance.android.live.wallet;

import X.C0TL;
import X.C276516r;
import X.C29401Dk;
import X.C77489Ub7;
import X.C77492UbA;
import X.C77518Uba;
import X.C77607Ud1;
import X.InterfaceC77501UbJ;
import X.UI4;
import X.UI8;
import X.UIJ;
import X.UIK;
import android.content.Context;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes14.dex */
public final class WalletException implements IWalletException {
    public static final WalletException LJLIL = new WalletException();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    public final Boolean LJ(Throwable th) {
        CustomErrorExtra customErrorExtra;
        boolean z;
        if ((th instanceof C29401Dk) && (customErrorExtra = CustomErrorExtra.getCustomErrorExtra((Exception) th)) != null) {
            if (customErrorExtra.getPromptType() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    public final Boolean LIZLLL(CustomErrorExtra customErrorExtra, int i) {
        boolean z;
        HashSet<Integer> hashSet = UIJ.LIZIZ;
        if (hashSet.isEmpty()) {
            hashSet.add(4005266);
            hashSet.add(4005267);
        }
        if (hashSet.contains(Integer.valueOf(i)) || (customErrorExtra != null && customErrorExtra.isContinuable())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final UI4 LIZ(Context context, Throwable th, Runnable runnable, Runnable runnable2, int i, int i2, boolean z, String str) {
        int i3;
        Exception exc;
        InterfaceC77501UbJ LIZ;
        if (th instanceof C29401Dk) {
            i3 = ((C276516r) th).getErrorCode();
        } else if (th instanceof C0TL) {
            i3 = ((C0TL) th).statusCode;
        } else {
            i3 = -1;
        }
        UI8 ui8 = new UI8();
        ui8.LIZIZ = i3;
        ui8.LJIIJJI = i;
        ui8.LJIIL = i2;
        ui8.LJIILIIL = false;
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        ui8.LIZLLL = exc;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("gift_enter_from", str);
        ui8.LJIIIIZZ = linkedHashMap;
        ui8.LJIIJ = new UIK(runnable2, runnable);
        if (z) {
            C77518Uba c77518Uba = new C77518Uba();
            c77518Uba.LIZ = ui8.LIZLLL;
            c77518Uba.LJ = ui8;
            LIZ = C77607Ud1.LIZ().LIZ(context, "recharge_pay_fail", c77518Uba);
        } else {
            C77489Ub7 LIZ2 = C77492UbA.LIZ(ui8);
            LIZ2.LIZJ = runnable2;
            LIZ2.LIZLLL = runnable;
            LIZ = C77607Ud1.LIZ().LIZ(context, "exchange_fail_block", LIZ2);
        }
        return new UI4(LIZ.LIZ(), LIZ.LIZIZ());
    }
}
