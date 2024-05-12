package com.bytedance.pia.core.bridge.methods;

import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.bridge.methods.TracingGet;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.g;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class TracingGet implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.internal.tracing.get", EnumC37404Em8.All, new InterfaceC37408EmC() { // from class: X.EmD
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new TracingGet();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Params {

        @InterfaceC65349Pkn("resetBuffer")
        public boolean resetBuffer;
    }

    /* loaded from: classes7.dex */
    public static class Result {

        @InterfaceC65349Pkn("tracing")
        public final g tracing;

        public Result(g gVar) {
            this.tracing = gVar;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        Tracing tracing = c37449Emr.LIZIZ.LJIILL;
        boolean z = ((Params) obj).resetBuffer;
        tracing.getClass();
        g LJIILLIIL = GsonProtectorUtils.toJsonTree(GsonUtils.LIZIZ(), tracing.LIZ).LJIILLIIL();
        if (z) {
            ((ArrayList) tracing.LIZ).clear();
        }
        c37399Em3.accept(new Result(LJIILLIIL));
    }
}
