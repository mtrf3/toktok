package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JlP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50099JlP extends AbstractC60800Ntc {
    public final /* synthetic */ DynamicPatch LJLIL;
    public final /* synthetic */ C50098JlO LJLILLLLZI;
    public final /* synthetic */ JTC LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        C50340JpI c50340JpI;
        JTD jtd;
        o.LJIIIZ(view, "view");
        InterfaceC50104JlU interfaceC50104JlU = this.LJLILLLLZI.LJLLJ;
        if (interfaceC50104JlU != null) {
            interfaceC50104JlU.LIZ();
        }
        JTS jts = this.LJLILLLLZI.LJLIL;
        if (C50346JpO.LIZIZ()) {
            c50340JpI = new C50339JpH(view);
        } else {
            c50340JpI = new C50340JpI(view);
        }
        jts.LJIILLIIL = c50340JpI;
        VNS vns = (VNS) view.LIZJ();
        this.LJLILLLLZI.LJLIL.LIZLLL = vns;
        C50336JpE c50336JpE = C50336JpE.LJI;
        String str = this.LJLIL.schema;
        o.LJIIIIZZ(str, "dynamicPatch.schema");
        c50336JpE.getClass();
        C50336JpE.LJ(str);
        if (vns != null) {
            vns.onEnterForeground();
        }
        this.LJLILLLLZI.LJIIIZ();
        JTS jts2 = this.LJLILLLLZI.LJLIL;
        if (jts2.LJIJ && !jts2.LJIJI) {
            JSONObject jSONObject = new JSONObject();
            C50340JpI c50340JpI2 = jts2.LJIILLIIL;
            if (c50340JpI2 != null) {
                c50340JpI2.LIZ("cardShow", jSONObject);
            }
            this.LJLILLLLZI.LJLIL.LJIJI = true;
        }
        F2N f2n = F2O.LIZ;
        String containerId = view.getHybridContext().containerId;
        f2n.getClass();
        o.LJIIIZ(containerId, "containerId");
        F3T f3t = (F3T) ((ConcurrentHashMap) F2O.LIZJ.getValue()).get(containerId);
        if (f3t != null) {
            JTV jtv = (JTV) this.LJLILLLLZI.LJLIL.LJIIL.getValue();
            jtv.getClass();
            Iterator it = ((ArrayList) jtv.LIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC49368JZc) it.next()).LIZIZ(f3t);
            }
        }
        this.LJLILLLLZI.LJLIL.LIZJ = view.getHybridContext().containerId;
        JTS jts3 = this.LJLILLLLZI.LJLIL;
        JTX jtx = jts3.LJIILIIL;
        if (jtx != null) {
            Integer num = jts3.LJI;
            if (num != null) {
                num.intValue();
            }
            jtx.LJLLLL(this.LJLILLLLZI.LJLIL);
        }
        JTC jtc = this.LJLJI;
        if (jtc != null && (jtd = jtc.LIZ) != null && jtd.LIZ != null) {
            C50098JlO.LJII(this.LJLILLLLZI.LJLIL.LIZ, false, false);
            JTC jtc2 = this.LJLJI;
            if (jtc2 != null && o.LJ(jtc2.LIZJ, Boolean.TRUE)) {
                return;
            }
            C50098JlO c50098JlO = this.LJLILLLLZI;
            c50098JlO.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new K1L(c50098JlO, view, null), 3);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
        JTS jts = this.LJLILLLLZI.LJLIL;
        jts.LJIJ = true;
        if (jts.LJIILLIIL != null && !jts.LJIJI) {
            jts.LIZ("cardShow", new JSONObject());
            this.LJLILLLLZI.LJLIL.LJIJI = true;
        }
    }

    public C50099JlP(DynamicPatch dynamicPatch, C50098JlO c50098JlO, JTC jtc) {
        this.LJLIL = dynamicPatch;
        this.LJLILLLLZI = c50098JlO;
        this.LJLJI = jtc;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        String str2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        InterfaceC50104JlU interfaceC50104JlU = this.LJLILLLLZI.LJLLJ;
        if (interfaceC50104JlU != null) {
            interfaceC50104JlU.LIZJ(new Throwable(str));
        }
        C50098JlO c50098JlO = this.LJLILLLLZI;
        if (c50098JlO.LJLJLLL != null) {
            JTS bulletContext = c50098JlO.LJLIL;
            if (str == null) {
                str = "";
            }
            int i = c50098JlO.LJLJJL;
            int i2 = c50098JlO.LJLL;
            o.LJIIIZ(bulletContext, "bulletContext");
            DynamicPatch dynamicPatch = bulletContext.LJII;
            if (dynamicPatch != null) {
                str2 = dynamicPatch.schema;
            } else {
                str2 = null;
            }
            int LIZ = C50101JlR.LIZ(str2);
            C50102JlS c50102JlS = new C50102JlS();
            c50102JlS.LJIIZILJ("type", "load_failed");
            c50102JlS.LJIIZILJ("schema", str2);
            c50102JlS.LJIIZILJ("rank", String.valueOf(bulletContext.LJI));
            c50102JlS.LJIIZILJ("error", str);
            int i3 = 1;
            if (i != 1) {
                i3 = 0;
            }
            c50102JlS.LJIIZILJ("is_built_in", String.valueOf(i3));
            c50102JlS.LJIL(i2);
            c50102JlS.LJIIZILJ("load_stage", String.valueOf(LIZ));
            c50102JlS.LJIILIIL();
            C50101JlR.LIZIZ(str2);
        }
    }
}
