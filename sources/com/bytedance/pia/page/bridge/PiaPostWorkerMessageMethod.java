package com.bytedance.pia.page.bridge;

import X.AbstractC37502Eni;
import X.C37238EjS;
import X.C37364ElU;
import X.C37387Elr;
import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37442Emk;
import X.C37449Emr;
import X.C37463En5;
import X.C37499Enf;
import X.C37558Eoc;
import X.C37569Eon;
import X.C37692Eqm;
import X.C76800UCe;
import X.EnumC37404Em8;
import X.EnumC37570Eoo;
import X.InterfaceC37405Em9;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import X.YE1;
import com.bytedance.pia.core.plugins.PrefetchPlugin;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PiaPostWorkerMessageMethod implements InterfaceC37405Em9<Params, C76800UCe> {
    public static final C37403Em7<Params, C76800UCe> LIZ = new C37403Em7<>("pia.postWorkerMessage", EnumC37404Em8.Render, C37387Elr.LIZ);

    /* loaded from: classes7.dex */
    public static final class Params {

        @InterfaceC65349Pkn("data")
        public final String data;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Params) && o.LJ(this.data, ((Params) obj).data);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.data;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(data=");
            return JBR.LJFF(LIZ, this.data, ")", LIZ);
        }

        public Params(String str) {
            this.data = str;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        C37442Emk c37442Emk;
        C37558Eoc c37558Eoc;
        EnumC37570Eoo enumC37570Eoo;
        Params params = (Params) obj;
        o.LJIIJ(params, "params");
        if (params.data == null) {
            C37364ElU.LIZ("Parameter 'data' requested!", c37400Em4);
            return;
        }
        C37463En5 c37463En5 = c37449Emr.LIZIZ;
        if (c37463En5 != null) {
            AbstractC37502Eni LJFF = ((C37499Enf) c37463En5).LJFF("prefetch");
            if (!(LJFF instanceof PrefetchPlugin)) {
                LJFF = null;
            }
            PrefetchPlugin prefetchPlugin = (PrefetchPlugin) LJFF;
            if (prefetchPlugin != null && (c37442Emk = prefetchPlugin.LIZIZ) != null && (c37558Eoc = c37442Emk.LIZ) != null && (enumC37570Eoo = c37558Eoc.LJIJJ) != null) {
                int i = C37569Eon.LIZ[enumC37570Eoo.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            c37400Em4.accept(new C37394Ely("{\"state\":\"terminate\"}"));
                            return;
                        }
                    } else {
                        c37400Em4.accept(new C37394Ely("{\"state\":\"fetching\"}"));
                        return;
                    }
                } else {
                    String str = params.data;
                    if (c37558Eoc.LIZ()) {
                        c37558Eoc.LJIIL.postMessage(str);
                        StringBuilder LIZ2 = X1D.LIZ();
                        YE1.LIZLLL(LIZ2, c37558Eoc.LJI, "Post message to worker (Message: ", str, ")");
                        C37238EjS.LJFF(X1D.LIZIZ(LIZ2));
                    }
                    c37399Em3.accept(C76800UCe.LIZ);
                    return;
                }
            }
            c37400Em4.accept(new C37394Ely("{\"state\":\"unusable\"}"));
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.pia.core.runtime.PiaRuntime");
    }
}
