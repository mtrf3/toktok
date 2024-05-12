package com.bytedance.pia.core.bridge.methods;

import X.C37364ElU;
import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37463En5;
import X.C37558Eoc;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.pia.core.bridge.methods.WorkerTerminate;

/* loaded from: classes7.dex */
public final class WorkerTerminate implements InterfaceC37405Em9<Params, Void> {
    public static final C37403Em7<Params, Void> LIZ = new C37403Em7<>("pia.internal.worker.terminate", EnumC37404Em8.Render, new InterfaceC37408EmC() { // from class: X.Em0
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new WorkerTerminate();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Params {

        @InterfaceC65349Pkn("worker")
        public String worker;
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        C37558Eoc c37558Eoc;
        Params params = (Params) obj;
        if (TextUtils.isEmpty(params.worker)) {
            C37364ElU.LIZ("Parameter 'worker' is required!", c37400Em4);
            return;
        }
        C37463En5 c37463En5 = c37449Emr.LIZIZ;
        Object obj2 = c37463En5.get(params.worker);
        if (!(obj2 instanceof C37558Eoc) || (c37558Eoc = (C37558Eoc) obj2) == null) {
            c37400Em4.accept(new C37394Ely(-10004));
            return;
        }
        c37558Eoc.LJI(null);
        c37463En5.remove(params.worker);
        c37399Em3.accept(null);
    }
}
