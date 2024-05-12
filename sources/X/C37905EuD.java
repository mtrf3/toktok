package X;

import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EuD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37905EuD {
    public static InterfaceC38157EyH LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static C70657RoD LJIIIIZZ;
    public static C37979EvP LJIIIZ;
    public static InterfaceExecutorC37917EuP LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL = true;
    public static boolean LJIILIIL = true;
    public static final ArrayList<String> LJIILJJIL = new ArrayList<>();
    public static final ArrayList<String> LJIILL = new ArrayList<>();
    public final C37932Eue LIZ = new C37932Eue();
    public final C37860EtU LIZIZ = new C37860EtU();
    public final List<OSZ<String, JSONObject>> LIZJ = new ArrayList();
    public final String LIZLLL = "BDXBridge";
    public final C37922EuU LJ = new C37922EuU();

    public final void LJ() {
        EnumC37907EuF enumC37907EuF;
        C37903EuB c37903EuB;
        String str;
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                int i = C37845EtF.LIZ[this.LIZ.LIZ.LJIIJJI.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            enumC37907EuF = EnumC37907EuF.Other;
                        } else {
                            enumC37907EuF = EnumC37907EuF.Worker;
                        }
                    } else {
                        enumC37907EuF = EnumC37907EuF.Web;
                    }
                } else {
                    enumC37907EuF = EnumC37907EuF.Lynx;
                }
                C37904EuC c37904EuC = this.LIZ.LIZ;
                if (c37904EuC != null && (c37903EuB = c37904EuC.LIZ) != null) {
                    C37955Ev1 c37955Ev1 = new C37955Ev1(this.LIZ.LIZ);
                    String str2 = (String) osz.getFirst();
                    o.LJIIJ(str2, "<set-?>");
                    c37955Ev1.LIZLLL = str2;
                    c37955Ev1.LJI = osz.getSecond();
                    c37955Ev1.LJIIIIZZ = "DEFAULT";
                    c37955Ev1.LIZIZ(enumC37907EuF);
                    InterfaceC37958Ev4 interfaceC37958Ev4 = this.LIZ.LIZ.LIZLLL;
                    if (interfaceC37958Ev4 == null || (str = interfaceC37958Ev4.getUrl()) == null) {
                        str = "";
                    }
                    c37955Ev1.LJ = str;
                    C37908EuG c37908EuG = new C37908EuG(osz, this);
                    C37904EuC c37904EuC2 = this.LIZ.LIZ;
                    if (c37904EuC2 != null) {
                        c37903EuB.LIZ(c37955Ev1, c37908EuG, c37904EuC2, null);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            } else {
                C37855EtP c37855EtP = this.LIZ.LIZ.LJIIIZ;
                C37832Et2 c37832Et2 = c37855EtP.LIZIZ;
                Iterator<Map.Entry<EnumC37844EtE, ConcurrentHashMap<String, InterfaceC37666EqM>>> it2 = c37832Et2.LIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    Iterator<Map.Entry<String, InterfaceC37666EqM>> it3 = it2.next().getValue().entrySet().iterator();
                    while (it3.hasNext()) {
                        it3.next().getValue().release();
                    }
                }
                c37832Et2.LIZ.clear();
                c37855EtP.LIZLLL = true;
                C37856EtQ c37856EtQ = this.LIZ.LIZ.LJIIJ;
                if (c37856EtQ != null) {
                    c37856EtQ.LIZJ.clear();
                }
                this.LIZ.LIZ.LJIIL.LJFF.put("release", "true");
                this.LIZIZ.LIZ.clear();
                Iterator it4 = C5UN.LJJLJLI(C37912EuK.LIZ).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (o.LJ(((OSZ) next).getSecond(), this)) {
                        obj = next;
                        break;
                    }
                }
                OSZ osz2 = (OSZ) obj;
                if (osz2 != null) {
                    C37912EuK.LIZ.remove(osz2.getFirst());
                }
                C37912EuK.LIZ.values();
                String str3 = this.LJ.LIZLLL;
                if (str3 != null) {
                    C36551EWd.LIZ.remove(str3);
                    return;
                }
                return;
            }
        }
    }

    public final void LIZ(InterfaceC37882Etq filter) {
        o.LJIIJ(filter, "filter");
        C37932Eue c37932Eue = this.LIZ;
        c37932Eue.getClass();
        C37913EuL c37913EuL = c37932Eue.LIZ.LIZIZ;
        c37913EuL.getClass();
        C37881Etp c37881Etp = c37913EuL.LIZIZ;
        if (!(c37881Etp instanceof C37881Etp) || c37881Etp == null) {
            return;
        }
        ((ArrayList) c37881Etp.LIZ).add(filter);
    }

    public static void LIZJ(C37905EuD c37905EuD, Class clazz) {
        C37856EtQ c37856EtQ;
        EnumC37844EtE scope = EnumC37844EtE.ALL;
        c37905EuD.getClass();
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(scope, "scope");
        if (c37905EuD.LIZ.LIZ.LIZ() != null && (c37856EtQ = c37905EuD.LIZ.LIZ.LJIIJ) != null) {
            c37856EtQ.LIZIZ.LIZIZ(clazz, scope);
        }
    }

    public final void LIZLLL(String str, InterfaceC37862EtW strategy) {
        o.LJIIJ(strategy, "strategy");
        C37860EtU c37860EtU = this.LIZIZ;
        c37860EtU.getClass();
        c37860EtU.LIZ.put(str, strategy);
        this.LIZ.LIZ.LJIIL.LJFF.put("registerDownGradeStrategy", str);
    }

    public final void LJFF(String event, JSONObject jSONObject) {
        Object LIZ;
        o.LJIIJ(event, "event");
        C37932Eue c37932Eue = this.LIZ;
        c37932Eue.getClass();
        Iterator<InterfaceC37980EvQ> it = c37932Eue.LIZ.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZJ(event);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
        }
        Iterator it2 = ((ArrayList) c37932Eue.LIZ.LJII).iterator();
        while (it2.hasNext()) {
            ((AbstractC37899Eu7) it2.next()).LJIIIZ(jSONObject, event);
        }
    }

    public final void LIZIZ(View view, String str, boolean z) {
        int i;
        o.LJIIJ(view, "view");
        if (z) {
            i = 27;
        } else {
            i = 17;
        }
        ConcurrentHashMap<Integer, C37905EuD> concurrentHashMap = C37912EuK.LIZ;
        concurrentHashMap.put(Integer.valueOf(view.hashCode()), this);
        concurrentHashMap.values();
        Iterator<InterfaceC37921EuT> it = C37912EuK.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().onInit();
        }
        C37932Eue c37932Eue = this.LIZ;
        Integer valueOf = Integer.valueOf(i);
        c37932Eue.getClass();
        if (view instanceof VNS) {
            C37904EuC c37904EuC = c37932Eue.LIZ;
            c37904EuC.LJ = (VNS) view;
            EnumC37844EtE enumC37844EtE = EnumC37844EtE.LYNX;
            o.LJIIJ(enumC37844EtE, "<set-?>");
            c37904EuC.LJIIJJI = enumC37844EtE;
            C37904EuC c37904EuC2 = c37932Eue.LIZ;
            ((ArrayList) c37904EuC2.LJII).add(new C37935Euh(c37904EuC2));
        } else if (view instanceof WebView) {
            c37932Eue.LIZ.LIZLLL = new C37900Eu8((WebView) view);
            C37904EuC c37904EuC3 = c37932Eue.LIZ;
            EnumC37844EtE enumC37844EtE2 = EnumC37844EtE.WEB;
            c37904EuC3.getClass();
            o.LJIIJ(enumC37844EtE2, "<set-?>");
            c37904EuC3.LJIIJJI = enumC37844EtE2;
            if (valueOf != null) {
                valueOf.intValue();
                int intValue = valueOf.intValue();
                if ((intValue & 1) == 1) {
                    C37904EuC c37904EuC4 = c37932Eue.LIZ;
                    ((ArrayList) c37904EuC4.LJII).add(new C37967EvD(c37904EuC4));
                }
                if ((intValue & 8) == 8) {
                    C37904EuC c37904EuC5 = c37932Eue.LIZ;
                    ((ArrayList) c37904EuC5.LJII).add(new C37957Ev3(c37904EuC5));
                }
                if ((intValue & 2) == 2) {
                    C37904EuC c37904EuC6 = c37932Eue.LIZ;
                    ((ArrayList) c37904EuC6.LJII).add(new C37968EvE(c37904EuC6));
                }
                if ((intValue & 4) == 4) {
                    C37904EuC c37904EuC7 = c37932Eue.LIZ;
                    ((ArrayList) c37904EuC7.LJII).add(new C37966EvC(c37904EuC7));
                }
            }
        }
        Iterator it2 = ((ArrayList) c37932Eue.LIZ.LJII).iterator();
        while (it2.hasNext()) {
            ((AbstractC37899Eu7) it2.next()).LJIIIIZZ();
        }
        c37932Eue.LIZ.LJI = str;
        this.LJ.LJI(C37904EuC.class, this.LIZ.LIZ);
        C37922EuU c37922EuU = this.LJ;
        c37922EuU.LIZLLL = str;
        if (c37922EuU.LIZIZ == null) {
            c37922EuU.LIZIZ = new WeakReference<>(view);
        }
        C37922EuU c37922EuU2 = this.LJ;
        c37922EuU2.getClass();
        WeakReference<C37905EuD> weakReference = c37922EuU2.LJFF;
        if (weakReference == null || weakReference.get() == null) {
            c37922EuU2.LJFF = new WeakReference<>(this);
        }
        C37922EuU c37922EuU3 = this.LJ;
        C37915EuN c37915EuN = new C37915EuN(this);
        c37922EuU3.getClass();
        if (c37922EuU3.LJ == null) {
            c37922EuU3.LJ = c37915EuN;
        }
        this.LJ.LJFF(InterfaceC31922Cfu.class, new C78596Usy());
        this.LJ.LJFF(InterfaceC37930Euc.class, new C37918EuQ(str));
        C37855EtP c37855EtP = this.LIZ.LIZ.LJIIIZ;
        C37922EuU context = this.LJ;
        c37855EtP.getClass();
        o.LJIIJ(context, "context");
        c37855EtP.LIZ = context;
        C37832Et2 c37832Et2 = c37855EtP.LIZIZ;
        c37832Et2.getClass();
        ((C37829Esz) c37832Et2.LIZIZ.getValue()).LIZIZ = context;
        C37860EtU downGradeManager = this.LIZIZ;
        o.LJIIJ(downGradeManager, "downGradeManager");
        c37855EtP.LIZJ = downGradeManager;
        C37903EuB c37903EuB = this.LIZ.LIZ.LIZ;
        if (c37903EuB != null) {
            c37903EuB.LIZ = c37855EtP;
        }
    }
}
