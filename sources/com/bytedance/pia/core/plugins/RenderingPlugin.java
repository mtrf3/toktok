package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.BQ6;
import X.C37394Ely;
import X.C37478EnK;
import X.C37479EnL;
import X.C37480EnM;
import X.C37499Enf;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.m;
import java.util.Map;

/* loaded from: classes7.dex */
public class RenderingPlugin extends AbstractC37502Eni {
    public final Map<String, ?> LIZIZ;
    public final BQ6<Map<String, ?>> LIZJ;
    public final BQ6<C37394Ely> LIZLLL;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "rendering";
    }

    public RenderingPlugin(C37499Enf c37499Enf, C37479EnL c37479EnL) {
        super(c37499Enf);
        this.LIZIZ = c37479EnL.LIZ;
        this.LIZJ = c37479EnL.LIZIZ;
        this.LIZLLL = c37479EnL.LIZJ;
    }

    @Override // X.AbstractC37502Eni
    public final void LJFF(String str, Object... objArr) {
        if ("event-on-manifest-error".equals(str) || "event-on-html-error".equals(str)) {
            this.LIZLLL.accept(new C37394Ely("Request manifest error!"));
            return;
        }
        if ("event-on-manifest-ready".equals(str)) {
            Object obj = objArr[0];
            if (!(obj instanceof m)) {
                return;
            }
            try {
                m mVar = (m) obj;
                if (!mVar.LJJIJLIJ("rendering")) {
                    this.LIZLLL.accept(new C37394Ely("'rendering' is required!"));
                    return;
                }
                m LJIIZILJ = mVar.LJJIJ("rendering").LJIIZILJ();
                if (this.LIZIZ != null) {
                    LJIIZILJ.LJJII("params", GsonUtils.LIZIZ().LJIJJLI(this.LIZIZ));
                }
                this.LIZ.LJIJI.LIZIZ(new C37478EnK(this), new C37480EnM(this), LJIIZILJ, "pia.internal.worker.runTask");
            } catch (Throwable th) {
                this.LIZLLL.accept(new C37394Ely(th.toString()));
            }
        }
    }
}
