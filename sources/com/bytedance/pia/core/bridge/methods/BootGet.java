package com.bytedance.pia.core.bridge.methods;

import X.AbstractC37502Eni;
import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37499Enf;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import com.bytedance.pia.core.bridge.methods.BootGet;
import com.bytedance.pia.core.plugins.BootPlugin;
import com.google.gson.g;

/* loaded from: classes7.dex */
public final class BootGet implements InterfaceC37405Em9<Void, Result> {
    public static final C37403Em7<Void, Result> LIZ = new C37403Em7<>("pia.internal.boot.get", EnumC37404Em8.All, new InterfaceC37408EmC() { // from class: X.Elz
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new BootGet();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Result {

        @InterfaceC65349Pkn("results")
        public g results;

        public Result(g gVar) {
            this.results = gVar;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        try {
            AbstractC37502Eni LJFF = ((C37499Enf) c37449Emr.LIZIZ).LJFF("boot");
            if (LJFF instanceof BootPlugin) {
                c37399Em3.accept(new Result(((BootPlugin) LJFF).LIZIZ));
                return;
            }
        } catch (Throwable th) {
            c37400Em4.accept(new C37394Ely(th.toString()));
        }
        c37400Em4.accept(new C37394Ely());
    }
}
