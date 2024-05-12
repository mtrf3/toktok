package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS1S0301000;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.04Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04Q {
    public static final C44021o6 LIZ;
    public static final C44021o6 LIZIZ;
    public static final C44031o7 LIZJ;
    public static final C44031o7 LIZLLL;
    public static final C44031o7 LJ;
    public static final C44031o7 LJFF;
    public static final C44031o7 LJI;

    static {
        C35831at c35831at = C35831at.LIZ;
        LIZ = C24410xZ.LIZIZ(c35831at, C45231q3.LJLIL);
        LIZIZ = C24410xZ.LIZIZ(c35831at, C45271q7.LJLIL);
        LIZJ = C24410xZ.LIZLLL(C45241q4.LJLIL);
        LIZLLL = C24410xZ.LIZLLL(C45251q5.LJLIL);
        LJ = C24410xZ.LIZLLL(C45261q6.LJLIL);
        LJFF = C24410xZ.LIZLLL(C45281q8.LJLIL);
        LJI = C24410xZ.LIZLLL(C45291q9.LJLIL);
    }

    public static final void LIZIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CompositionLocal ");
        LIZ2.append(str);
        LIZ2.append(" not present");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZIZ2.toString();
        throw new IllegalStateException(LIZIZ2);
    }

    public static final void LIZ(C45211q1 owner, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1396852028);
        final Context context = owner.getContext();
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJJJZ == c24490xh) {
            LJJJZ = C78966Uyw.LJJJI(context.getResources().getConfiguration(), C35831at.LIZ);
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
        LJIL.LJJIIJ(1157296644);
        boolean LJIJJ = LJIL.LJIJJ(interfaceC35811ar);
        Object LJJJZ2 = LJIL.LJJJZ();
        if (LJIJJ || LJJJZ2 == c24490xh) {
            LJJJZ2 = new IDqS416S0100000(interfaceC35811ar, (InterfaceC35811ar<Configuration>) 5);
            LJIL.LJLJLLL(LJJJZ2);
        }
        LJIL.LJJJJJ(false);
        owner.setConfigurationChangeObserver((InterfaceC88472Yns) LJJJZ2);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ3 = LJIL.LJJJZ();
        if (LJJJZ3 == c24490xh) {
            o.LJIIIIZZ(context, "context");
            LJJJZ3 = new C04N(context) { // from class: X.19p
            };
            LJIL.LJLJLLL(LJJJZ3);
        }
        LJIL.LJJJJJ(false);
        C284119p c284119p = (C284119p) LJJJZ3;
        AnonymousClass048 viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners != null) {
            o.LJIIIIZZ(context, "context");
            Configuration configuration = (Configuration) interfaceC35811ar.getValue();
            LJIL.LJJIIJ(-485908294);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ4 = LJIL.LJJJZ();
            if (LJJJZ4 == c24490xh) {
                LJJJZ4 = new C0OM();
                LJIL.LJLJLLL(LJJJZ4);
            }
            LJIL.LJJJJJ(false);
            final C0OM c0om = (C0OM) LJJJZ4;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ5 = LJIL.LJJJZ();
            Object obj = LJJJZ5;
            if (LJJJZ5 == c24490xh) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                LJIL.LJLJLLL(configuration2);
                obj = configuration2;
            }
            LJIL.LJJJJJ(false);
            final Configuration configuration3 = (Configuration) obj;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ6 = LJIL.LJJJZ();
            if (LJJJZ6 == c24490xh) {
                LJJJZ6 = new ComponentCallbacks2() { // from class: X.04U
                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        c0om.LIZ.clear();
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration4) {
                        o.LJIIIZ(configuration4, "configuration");
                        int updateFrom = configuration3.updateFrom(configuration4);
                        Iterator<Map.Entry<C0OL, WeakReference<C0OK>>> it = c0om.LIZ.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<C0OL, WeakReference<C0OK>> next = it.next();
                            o.LJIIIIZZ(next, "it.next()");
                            C0OK c0ok = next.getValue().get();
                            if (c0ok == null || Configuration.needNewResources(updateFrom, c0ok.LIZIZ)) {
                                it.remove();
                            }
                        }
                        configuration3.setTo(configuration4);
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i2) {
                        c0om.LIZ.clear();
                    }
                };
                LJIL.LJLJLLL(LJJJZ6);
            }
            LJIL.LJJJJJ(false);
            C24610xt.LIZIZ(c0om, new IDqS172S0200000(context, (C04U) LJJJZ6, 0), LJIL);
            LJIL.LJJJJJ(false);
            C44021o6 c44021o6 = LIZ;
            Object configuration4 = interfaceC35811ar.getValue();
            o.LJIIIIZZ(configuration4, "configuration");
            C44031o7 c44031o7 = LJI;
            owner.getView();
            C24410xZ.LIZ(new C24620xu[]{c44021o6.LIZIZ(configuration4), LIZJ.LIZIZ(context), LJ.LIZIZ(viewTreeOwners.LIZ), LJFF.LIZIZ(viewTreeOwners.LIZIZ), c44031o7.LIZIZ(owner), LIZLLL.LIZIZ(c0om)}, C1DJ.LJ(LJIL, 1471621628, new IDqS1S0301000(owner, (C45211q1) c284119p, (C284119p) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 0)), LJIL, 56);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new IDqS2S0201000(owner, (C45211q1) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 0);
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }
}
