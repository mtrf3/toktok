package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37238EjS;
import X.C37490EnW;
import X.C37499Enf;
import X.X1D;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.m;
import com.google.gson.p;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class ManifestPlugin extends AbstractC37502Eni {
    public final AtomicReference<m> LIZIZ;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "manifest";
    }

    @Override // X.AbstractC37502Eni
    public final void LIZIZ() {
        Object obj;
        if (this.LIZ.LIZJ.version.length() > 0) {
            C37490EnW c37490EnW = this.LIZ.LJIILIIL;
            c37490EnW.getClass();
            try {
                obj = GsonUtils.LIZIZ().LIZJ(c37490EnW.LIZIZ.LJJIJ("manifest"), m.class);
            } catch (Throwable th) {
                C37238EjS.LIZLLL(4, "[PageStorage]Get page info error:", th);
                obj = null;
            }
            m mVar = (m) obj;
            if (mVar == null) {
                return;
            }
            try {
                if (mVar.LJJIJ("version").LJJIFFI().equals(this.LIZ.LIZJ.version)) {
                    mVar.LJJII("from", new p("cache"));
                    LJII(mVar);
                }
            } catch (Throwable th2) {
                C37238EjS.LIZLLL(4, "[Manifest] Get cached manifest version failed:", th2);
            }
        }
    }

    public ManifestPlugin(C37499Enf c37499Enf) {
        super(c37499Enf);
        this.LIZIZ = new AtomicReference<>(null);
    }

    public final void LJII(m mVar) {
        if (mVar == null) {
            return;
        }
        AtomicReference<m> atomicReference = this.LIZIZ;
        while (!atomicReference.compareAndSet(null, mVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[manifest] use manifest:");
        LIZ.append(mVar);
        C37238EjS.LJFF(X1D.LIZIZ(LIZ));
        this.LIZ.LJIIJJI("event-on-manifest-ready", mVar);
        AbstractC37502Eni LJFF = this.LIZ.LJFF("pia_props");
        if (LJFF instanceof PiaPropsPlugin) {
            ((PiaPropsPlugin) LJFF).LIZIZ.LJJII("getManifest", new p(mVar.toString()));
        }
    }

    @Override // X.AbstractC37502Eni
    public final void LJFF(String str, Object... objArr) {
        if ("event-on-manifest-in-html-ready".equals(str)) {
            Object obj = objArr[0];
            if (obj instanceof m) {
                if (this.LIZ.LIZJ.version.length() > 0) {
                    this.LIZ.LJIILIIL.LIZ(obj);
                }
                LJII((m) obj);
            }
        }
    }
}
