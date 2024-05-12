package com.bytedance.pia.core.bridge.methods;

import X.C37364ElU;
import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37463En5;
import X.C37558Eoc;
import X.C37697Eqr;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import com.bytedance.pia.core.bridge.methods.WorkerPostMessage;
import com.google.gson.j;
import com.google.gson.m;

/* loaded from: classes7.dex */
public final class WorkerPostMessage implements InterfaceC37405Em9<Params, Void> {
    public static final C37403Em7<Params, Void> LIZ = new C37403Em7<>("pia.internal.worker.postMessage", EnumC37404Em8.Render, new InterfaceC37408EmC() { // from class: X.Em1
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new WorkerPostMessage();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Params {

        @InterfaceC65349Pkn("message")
        public j message;

        @InterfaceC65349Pkn("worker")
        public String worker;
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        C37558Eoc c37558Eoc;
        Params params = (Params) obj;
        j jVar = params.message;
        if (jVar == null || !(jVar instanceof m)) {
            C37364ElU.LIZ("Parameter 'message' is required!", c37400Em4);
            return;
        }
        C37463En5 c37463En5 = c37449Emr.LIZIZ;
        Object obj2 = c37463En5.get(params.worker);
        if (!(obj2 instanceof C37558Eoc) || (c37558Eoc = (C37558Eoc) obj2) == null || !c37558Eoc.LIZ()) {
            c37400Em4.accept(new C37394Ely(-10004));
            c37463En5.remove(params.worker);
        } else {
            c37558Eoc.LJ.sendWorkerMessage(C37697Eqr.LIZIZ(params.message.LJIIZILJ()));
            c37399Em3.accept(null);
        }
    }
}
