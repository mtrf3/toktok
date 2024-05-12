package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37238EjS;
import X.C37413EmH;
import X.C37422EmQ;
import X.C37436Eme;
import X.C37437Emf;
import X.C37438Emg;
import X.C37440Emi;
import X.C37445Emn;
import X.C37499Enf;
import X.C37646Eq2;
import X.EnumC37419EmN;
import X.EnumC37644Eq0;
import X.InterfaceC37454Emw;
import X.InterfaceC37464En6;
import X.ORS;
import X.PVC;
import X.X1D;
import android.webkit.WebResourceResponse;
import com.bytedance.pia.core.PiaManifest;
import com.bytedance.pia.core.setting.Settings;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NsrPlugin extends AbstractC37502Eni {
    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "nsr";
    }

    @Override // X.AbstractC37502Eni
    public final void LIZIZ() {
    }

    @Override // X.AbstractC37502Eni
    public final InterfaceC37464En6 LIZLLL(InterfaceC37454Emw interfaceC37454Emw) {
        Object obj;
        C37436Eme c37436Eme;
        C37440Emi c37440Emi = C37440Emi.LIZIZ;
        String uri = interfaceC37454Emw.getUrl().toString();
        C37499Enf runtime = this.LIZ;
        o.LJFF(runtime, "runtime");
        c37440Emi.getClass();
        PiaManifest LIZ = C37422EmQ.LIZ(runtime, uri);
        if (LIZ != null && LIZ.LJFF) {
            runtime.LJII.LIZJ(EnumC37419EmN.NSR_HIT, 0);
            if (!C37413EmH.LIZ(Settings.LJIIIZ).isNsrV1Enabled) {
                runtime.LJII.LIZ(1007, "nsr_render");
            } else {
                C37445Emn c37445Emn = C37440Emi.LIZ;
                c37445Emn.LIZ();
                C37437Emf LIZ2 = C37438Emg.LIZ(uri);
                if (LIZ2 != null) {
                    Iterator it = ((HashMap) c37445Emn.LIZ).keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            C37437Emf c37437Emf = (C37437Emf) obj;
                            if (o.LJ(c37437Emf.LIZJ, LIZ2.LIZJ) && LIZ2.LIZLLL.containsAll(c37437Emf.LIZLLL)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C37437Emf c37437Emf2 = (C37437Emf) obj;
                    if (c37437Emf2 != null && (c37436Eme = (C37436Eme) ((HashMap) c37445Emn.LIZ).get(c37437Emf2)) != null) {
                        if (c37436Eme.LIZ) {
                            ((HashMap) c37445Emn.LIZ).remove(c37437Emf2);
                            ORS.LJJLIIJ(c37445Emn.LIZIZ, new AqS172S0100000_6(c37437Emf2, 91));
                        }
                        String str = c37436Eme.LIZIZ;
                        if (str != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("[NSR] Get NSR HTML (URL: ");
                            LIZ3.append(uri);
                            LIZ3.append(')');
                            C37238EjS.LJIIIIZZ(6, X1D.LIZIZ(LIZ3), null);
                            runtime.LJII.LIZJ(EnumC37419EmN.NSR_HIT, 1);
                            byte[] bytes = str.getBytes(PVC.LIZ);
                            o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                            WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(bytes));
                            EnumC37644Eq0 from = EnumC37644Eq0.Auto;
                            o.LJIIJ(from, "from");
                            return new C37646Eq2(webResourceResponse, from);
                        }
                    }
                }
                runtime.LJII.LIZ(1008, "nsr_render");
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NsrPlugin(C37499Enf runtime, PiaManifest manifest) {
        super(runtime);
        o.LJIIJ(runtime, "runtime");
        o.LJIIJ(manifest, "manifest");
    }
}
