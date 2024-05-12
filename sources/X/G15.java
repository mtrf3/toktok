package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.journey.events.NujFlowEngineNextEvent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G15 {
    public final InterfaceC40766FzG LIZ;
    public volatile boolean LIZJ;
    public volatile int LIZIZ = -1;
    public final CopyOnWriteArraySet<G1H> LIZLLL = new CopyOnWriteArraySet<>();
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C36115EFj.LJLIL);

    public final void LIZIZ() {
        G2J g2j;
        C35656Dz2 c35656Dz2;
        G2J g2j2;
        G2J g2j3;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("next, stepIndex:");
        LIZ.append(this.LIZIZ);
        LIZ.append(", step: ");
        LIZ.append(ORZ.LJLLLLLL(this.LIZIZ, this.LIZ.LIZ()));
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        NujFlowEngineNextEvent nujFlowEngineNextEvent = new NujFlowEngineNextEvent();
        nujFlowEngineNextEvent.LIZLLL(Integer.valueOf(this.LIZJ ? 1 : 0), "is_complete");
        String step = String.valueOf(this.LIZIZ);
        o.LJIIIZ(step, "step");
        nujFlowEngineNextEvent.LIZLLL(step, "step");
        nujFlowEngineNextEvent.LJFF();
        if (this.LIZJ) {
            return;
        }
        if (this.LIZIZ >= this.LIZ.LIZ().size() - 1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("next, complete nujScene steps size:");
            LIZ2.append(this.LIZ.LIZ().size());
            C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
            this.LIZJ = true;
            LIZJ(G1S.LJLIL);
            return;
        }
        if (this.LIZIZ < -1) {
            LIZJ(G1I.LJLIL);
            return;
        }
        this.LIZIZ++;
        if (this.LIZIZ == 0) {
            LIZJ(G1M.LJLIL);
        }
        EnumC40761FzB type = ((G1A) ListProtector.get(this.LIZ.LIZ(), this.LIZIZ)).type();
        G2I LIZ3 = G2E.LIZ(type);
        G2J g2j4 = null;
        if (LIZ3 != null) {
            g2j = LIZ3.LJLILLLLZI;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        G1A g1a = (G1A) ListProtector.get(this.LIZ.LIZ(), this.LIZIZ);
        EnumC40761FzB componentType = g1a.type();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("handleCurrentStep step:");
        LIZ4.append(this.LIZIZ);
        LIZ4.append(", componentType:");
        LIZ4.append(componentType);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ4));
        Iterator it = ((CopyOnWriteArrayList) this.LJ.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                G1V g1v = (G1V) it.next();
                if (g1v.LIZIZ(this, componentType)) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("handleCurrentStep intercepted by ");
                    LIZ5.append(g1v.LIZ());
                    C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ5));
                    LIZIZ();
                    break;
                }
            } else {
                G04 LIZ6 = g1a.LIZ(this.LIZ.context(), this);
                if (!(LIZ6 instanceof G04) || LIZ6 == null) {
                    LIZJ(G1N.LJLIL);
                    LIZIZ();
                } else {
                    G0D context = this.LIZ.context();
                    context.getClass();
                    o.LJIIIZ(componentType, "componentType");
                    if (!((java.util.Map) context.LJLJI).containsKey(componentType)) {
                        c35656Dz2 = null;
                    } else {
                        c35656Dz2 = (C35656Dz2) ((java.util.Map) context.LJLJI).get(componentType);
                    }
                    if (!LIZ6.LIZIZ(c35656Dz2)) {
                        LIZIZ();
                    } else {
                        if (c35656Dz2 != null && (str = c35656Dz2.LIZ) != null) {
                            FH5.LIZIZ().getClass();
                            FH5.LIZ(str);
                            G2H g2h = G2H.HYBRID_AB_EXPOSE;
                            C188727au c188727au = new C188727au();
                            c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "duration_since_launch");
                            c188727au.LJIIIZ("vid", str);
                            java.util.Map<String, String> map = c188727au.LIZ;
                            o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
                            C36222EJm.LIZIZ(g2h, map);
                        }
                        G2I LIZ7 = G2E.LIZ(componentType);
                        if (LIZ7 != null) {
                            g2j2 = LIZ7.LJLIL;
                        } else {
                            g2j2 = null;
                        }
                        G2E.LIZJ(g2j2);
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append("component :");
                        LIZ8.append(LIZ6.type());
                        LIZ8.append(" start execute");
                        C40741Fyr.LIZ(X1D.LIZIZ(LIZ8));
                        LIZJ(new AqS172S0100000_6(LIZ6, (G04<C35656Dz2>) 118));
                        LIZ6.LIZ(this.LIZ.context(), c35656Dz2, new AqS110S0300000_6(LIZ6, (G04<C35656Dz2>) new C34K(), (C34K) this, (G15) 9));
                        G2I LIZ9 = G2E.LIZ(componentType);
                        if (LIZ9 != null) {
                            g2j3 = LIZ9.LJLIL;
                        } else {
                            g2j3 = null;
                        }
                        G2E.LIZIZ(g2j3);
                        C35604DyC.LIZ.post(new ARunnableS42S0100000_6(this, 146));
                    }
                }
            }
        }
        G2I LIZ10 = G2E.LIZ(type);
        if (LIZ10 != null) {
            g2j4 = LIZ10.LJLILLLLZI;
        }
        G2E.LIZIZ(g2j4);
        if (type == EnumC40761FzB.JOURNEY_LOGIN_ID || type == EnumC40761FzB.JOURNEY_AGE_GATE_ID) {
            G2E.LIZLLL(type);
        }
    }

    public G15(AbstractC40767FzH abstractC40767FzH) {
        this.LIZ = abstractC40767FzH;
    }

    public final void LIZ(G1V g1v) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addInterceptor interceptor:");
        LIZ.append(g1v.LIZ());
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        ((CopyOnWriteArrayList) this.LJ.getValue()).add(g1v);
    }

    public final void LIZJ(InterfaceC88472Yns<? super G1H, C76800UCe> interfaceC88472Yns) {
        C35604DyC.LIZ(new ARunnableS25S0200000_6(interfaceC88472Yns, this, 62));
    }

    public final void LIZLLL(G1H flowListener) {
        o.LJIIIZ(flowListener, "flowListener");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerListener flowListener:");
        LIZ.append(flowListener);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        this.LIZLLL.add(flowListener);
    }
}
