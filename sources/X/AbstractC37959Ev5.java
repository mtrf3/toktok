package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ev5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37959Ev5 extends AbstractC37899Eu7 implements InterfaceC37916EuO {
    public final InterfaceC37958Ev4 LIZIZ;
    public final String LIZJ;
    public final InterfaceExecutorC37917EuP LIZLLL;

    public abstract C37955Ev1 LJIIJ(String str);

    public abstract String LJIIJJI(C37955Ev1 c37955Ev1, C37911EuJ c37911EuJ);

    public abstract String LJIIL();

    public abstract void LJIILJJIL(String str, JSONObject jSONObject);

    @Override // X.AbstractC37899Eu7
    public void LJIIIIZZ() {
        InterfaceC37958Ev4 interfaceC37958Ev4 = this.LIZ.LIZLLL;
        if (interfaceC37958Ev4 != null) {
            interfaceC37958Ev4.LJ(this, LJIIL());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC37959Ev5(C37904EuC context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LIZIZ = context.LIZLLL;
        this.LIZJ = "WebJSBridge";
        InterfaceExecutorC37917EuP interfaceExecutorC37917EuP = C37905EuD.LJIIJ;
        this.LIZLLL = interfaceExecutorC37917EuP == null ? new C37976EvM() : interfaceExecutorC37917EuP;
    }

    public static void LJIILIIL(AbstractC37959Ev5 abstractC37959Ev5, String detail) {
        abstractC37959Ev5.getClass();
        o.LJIIJ(detail, "detail");
        InterfaceC37958Ev4 interfaceC37958Ev4 = abstractC37959Ev5.LIZIZ;
        if (interfaceC37958Ev4 != null) {
            interfaceC37958Ev4.LJII(null, detail);
        }
    }

    @Override // X.InterfaceC37916EuO
    public final void LJI(C37911EuJ c37911EuJ, C37955Ev1 c37955Ev1) {
        String str = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBridgeResult,result:");
        LIZ.append(c37911EuJ);
        LIZ.append(",call:");
        LIZ.append(c37955Ev1);
        C37887Etv.LIZ(str, X1D.LIZIZ(LIZ));
        if (c37955Ev1 == null) {
            String str2 = this.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onBridgeResult,result:");
            LIZ2.append(c37911EuJ);
            LIZ2.append(",call:");
            LIZ2.append(c37955Ev1);
            C37887Etv.LIZIZ(str2, X1D.LIZIZ(LIZ2));
            return;
        }
        try {
            C37904EuC c37904EuC = this.LIZ;
            c37904EuC.LIZJ.LIZIZ(c37911EuJ, c37955Ev1, c37904EuC);
            long currentTimeMillis = System.currentTimeMillis();
            String detail = LJIIJJI(c37955Ev1, c37911EuJ);
            long currentTimeMillis2 = System.currentTimeMillis();
            c37955Ev1.LJJII = currentTimeMillis;
            c37955Ev1.LJJIII = currentTimeMillis2;
            this.LIZ.LIZJ.LIZJ(c37955Ev1, c37911EuJ);
            C37972EvI c37972EvI = new C37972EvI(this, c37955Ev1);
            o.LJIIJ(detail, "detail");
            InterfaceC37958Ev4 interfaceC37958Ev4 = this.LIZIZ;
            if (interfaceC37958Ev4 != null) {
                interfaceC37958Ev4.LJII(c37972EvI, detail);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.AbstractC37899Eu7
    public final void LJIIIZ(Object obj, String event) {
        Object obj2;
        o.LJIIJ(event, "event");
        this.LIZ.LIZJ.LJI(obj, event);
        if (!(obj instanceof JSONObject)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        LJIILJJIL(event, (JSONObject) obj2);
        this.LIZ.LIZJ.LJFF(obj, event);
    }
}
