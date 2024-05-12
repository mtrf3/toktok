package com.bytedance.bdturing.verify;

import X.C66885QMv;
import X.DialogC66909QNt;
import X.InterfaceC66884QMu;
import X.QNF;
import X.QNG;
import X.QNH;
import X.QNS;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RiskControlService implements QNG {
    public DialogC66909QNt mDialogShowing;

    @Override // X.QNG
    public boolean isProcess(int i) {
        return i == 1 || i == 2 || i == 3 || i == 5 || i == 12;
    }

    public final void dismissVerifyDialog() {
        try {
            DialogC66909QNt dialogC66909QNt = this.mDialogShowing;
            if (dialogC66909QNt != null && dialogC66909QNt.isShowing()) {
                DialogC66909QNt dialogC66909QNt2 = this.mDialogShowing;
                if (dialogC66909QNt2 != null) {
                    dialogC66909QNt2.dismiss();
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.QNG
    public boolean execute(QNH request, QNS callback) {
        boolean z;
        o.LJIIJ(request, "request");
        o.LJIIJ(callback, "callback");
        DialogC66909QNt dialogC66909QNt = this.mDialogShowing;
        if (dialogC66909QNt != null && dialogC66909QNt.isShowing()) {
            callback.onFail(998);
            return true;
        }
        C66885QMv c66885QMv = C66885QMv.LJIIIIZZ;
        QNF qnf = new QNF(this, request, callback);
        boolean z2 = false;
        if (C66885QMv.LIZIZ.optLong("available_time") > System.currentTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            qnf.LIZ(200, 0L, null);
        } else {
            synchronized (c66885QMv) {
                List<InterfaceC66884QMu> list = C66885QMv.LJFF;
                if (((LinkedList) list).size() == 0) {
                    z2 = true;
                }
                ((LinkedList) list).add(qnf);
                if (z2) {
                    C66885QMv.LJI(0L);
                }
            }
        }
        return true;
    }
}
