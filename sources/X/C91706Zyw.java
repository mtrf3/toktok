package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavControllerViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS8S1000000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.Zyw, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C91706Zyw {
    public static final /* synthetic */ int LJJIIJZLJL = 0;
    public final Context LIZ;
    public final Activity LIZIZ;
    public C92143a5z LIZJ;
    public Bundle LIZLLL;
    public Parcelable[] LJ;
    public boolean LJFF;
    public final ORV<NavBackStackEntry> LJI;
    public final XLM LJII;
    public final java.util.Map<NavBackStackEntry, NavBackStackEntry> LJIIIIZZ;
    public final java.util.Map<NavBackStackEntry, AtomicInteger> LJIIIZ;
    public final java.util.Map<Integer, String> LJIIJ;
    public final java.util.Map<String, ORV<NavBackStackEntryState>> LJIIJJI;
    public LifecycleOwner LJIIL;
    public OnBackPressedDispatcher LJIILIIL;
    public NavControllerViewModel LJIILJJIL;
    public final CopyOnWriteArrayList<InterfaceC91704Zyu> LJIILL;
    public Lifecycle.State LJIILLIIL;
    public final LifecycleObserver LJIIZILJ;
    public final AbstractC008101l LJIJ;
    public boolean LJIJI;
    public final C91700Zyq LJIJJ;
    public final java.util.Map<AbstractC91695Zyl<? extends C91720ZzA>, C92140a5w> LJIJJLI;
    public InterfaceC88472Yns<? super NavBackStackEntry, C76800UCe> LJIL;
    public InterfaceC88472Yns<? super NavBackStackEntry, C76800UCe> LJJ;
    public final java.util.Map<NavBackStackEntry, Boolean> LJJI;
    public int LJJIFFI;
    public final List<NavBackStackEntry> LJJII;
    public final XLL LJJIII;
    public final C79883Bo LJJIIJ;

    public final boolean LIZIZ() {
        while (!this.LJI.isEmpty() && (this.LJI.last().LJLILLLLZI instanceof C92143a5z)) {
            LJIJ(this, this.LJI.last());
        }
        NavBackStackEntry LJIILJJIL = this.LJI.LJIILJJIL();
        if (LJIILJJIL != null) {
            ((ArrayList) this.LJJII).add(LJIILJJIL);
        }
        this.LJJIFFI++;
        LJIL();
        int i = this.LJJIFFI - 1;
        this.LJJIFFI = i;
        if (i == 0) {
            List LLJILJILJ = ORZ.LLJILJILJ(this.LJJII);
            ((ArrayList) this.LJJII).clear();
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                Iterator<InterfaceC91704Zyu> it2 = this.LJIILL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                this.LJJIII.LIZIZ(navBackStackEntry);
            }
            this.LJII.setValue(LJIJI());
        }
        if (LJIILJJIL != null) {
            return true;
        }
        return false;
    }

    public final C91720ZzA LJFF() {
        NavBackStackEntry LJIILJJIL = this.LJI.LJIILJJIL();
        if (LJIILJJIL == null) {
            return null;
        }
        return LJIILJJIL.LJLILLLLZI;
    }

    public final int LJI() {
        ORV<NavBackStackEntry> orv = this.LJI;
        int i = 0;
        if (!(orv instanceof Collection) || !orv.isEmpty()) {
            Iterator<NavBackStackEntry> it = orv.iterator();
            while (it.hasNext()) {
                if ((!(it.next().LJLILLLLZI instanceof C92143a5z)) && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        return i;
    }

    public final C92143a5z LJII() {
        C92143a5z c92143a5z = this.LIZJ;
        if (c92143a5z != null) {
            return c92143a5z;
        }
        "You must call setGraph() before calling getGraph()".toString();
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final Lifecycle.State LJIIIIZZ() {
        if (this.LJIIL == null) {
            return Lifecycle.State.CREATED;
        }
        return this.LJIILLIIL;
    }

    public final boolean LJIILJJIL() {
        if (this.LJI.isEmpty()) {
            return false;
        }
        C91720ZzA LJFF = LJFF();
        o.LJI(LJFF);
        if (!LJIILLIIL(LJFF.LJLJJLL, true, false) || !LIZIZ()) {
            return false;
        }
        return true;
    }

    public final List<NavBackStackEntry> LJIJI() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.LJIJJLI).values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((AbstractC91702Zys) it.next()).LJFF.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.LJLJLJ.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            ORS.LJJLIIIJILLIZJL(arrayList2, arrayList);
        }
        ORV<NavBackStackEntry> orv = this.LJI;
        ArrayList arrayList3 = new ArrayList();
        Iterator<NavBackStackEntry> it2 = orv.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry next = it2.next();
            NavBackStackEntry navBackStackEntry2 = next;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.LJLJLJ.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(next);
            }
        }
        ORS.LJJLIIIJILLIZJL(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((NavBackStackEntry) next2).LJLILLLLZI instanceof C92143a5z)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final void LJIL() {
        C91720ZzA c91720ZzA;
        C79863Bm c79863Bm;
        java.util.Set set;
        Boolean valueOf;
        AtomicInteger atomicInteger;
        List LLJILJILJ = ORZ.LLJILJILJ(this.LJI);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        if (arrayList.isEmpty()) {
            return;
        }
        C91720ZzA c91720ZzA2 = ((NavBackStackEntry) ORZ.LLFF(LLJILJILJ)).LJLILLLLZI;
        if (c91720ZzA2 instanceof InterfaceC91687Zyd) {
            Iterator it = ORZ.LLIILII(LLJILJILJ).iterator();
            while (it.hasNext()) {
                c91720ZzA = ((NavBackStackEntry) it.next()).LJLILLLLZI;
                if (!(c91720ZzA instanceof C92143a5z) && !(c91720ZzA instanceof InterfaceC91687Zyd)) {
                    break;
                }
            }
        }
        c91720ZzA = null;
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry : ORZ.LLIILII(LLJILJILJ)) {
            Lifecycle.State state = navBackStackEntry.LJLLI;
            C91720ZzA c91720ZzA3 = navBackStackEntry.LJLILLLLZI;
            if (c91720ZzA2 != null && c91720ZzA3.LJLJJLL == c91720ZzA2.LJLJJLL) {
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                if (state != state2) {
                    AbstractC91702Zys abstractC91702Zys = (AbstractC91702Zys) ((LinkedHashMap) this.LJIJJLI).get(this.LJIJJ.LIZIZ(c91720ZzA3.LJLIL));
                    if (abstractC91702Zys == null || (c79863Bm = abstractC91702Zys.LJFF) == null || (set = (java.util.Set) c79863Bm.getValue()) == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(set.contains(navBackStackEntry));
                    }
                    if (!o.LJ(valueOf, Boolean.TRUE) && ((atomicInteger = (AtomicInteger) ((LinkedHashMap) this.LJIIIZ).get(navBackStackEntry)) == null || atomicInteger.get() != 0)) {
                        hashMap.put(navBackStackEntry, state2);
                    } else {
                        hashMap.put(navBackStackEntry, Lifecycle.State.STARTED);
                    }
                }
                c91720ZzA2 = c91720ZzA2.LJLILLLLZI;
            } else if (c91720ZzA != null && c91720ZzA3.LJLJJLL == c91720ZzA.LJLJJLL) {
                if (state == Lifecycle.State.RESUMED) {
                    navBackStackEntry.LIZ(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.STARTED;
                    if (state != state3) {
                        hashMap.put(navBackStackEntry, state3);
                    }
                }
                c91720ZzA = c91720ZzA.LJLILLLLZI;
            } else {
                navBackStackEntry.LIZ(Lifecycle.State.CREATED);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it2.next();
            Lifecycle.State state4 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state4 != null) {
                navBackStackEntry2.LIZ(state4);
            } else {
                navBackStackEntry2.LIZIZ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (LJI() > 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ() {
        /*
            r3 = this;
            X.01l r2 = r3.LJIJ
            boolean r0 = r3.LJIJI
            if (r0 == 0) goto L10
            int r1 = r3.LJI()
            r0 = 1
            if (r1 <= r0) goto L10
        Ld:
            r2.LIZ = r0
            return
        L10:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91706Zyw.LJJ():void");
    }

    public final boolean LJIILIIL() {
        Intent intent;
        Bundle LLJJIJI;
        int[] intArray;
        Bundle bundle;
        if (LJI() == 1) {
            Activity activity = this.LIZIZ;
            if (activity == null || (intent = activity.getIntent()) == null) {
                LLJJIJI = null;
            } else {
                LLJJIJI = C16880lQ.LLJJIJI(intent);
            }
            if (LLJJIJI == null) {
                intArray = null;
            } else {
                intArray = LLJJIJI.getIntArray("android-support-nav:controller:deepLinkIds");
            }
            int i = 0;
            if (intArray != null) {
                if (this.LJFF) {
                    Activity activity2 = this.LIZIZ;
                    o.LJI(activity2);
                    Intent intent2 = activity2.getIntent();
                    Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent2);
                    o.LJI(LLJJIJI2);
                    int[] intArray2 = LLJJIJI2.getIntArray("android-support-nav:controller:deepLinkIds");
                    o.LJI(intArray2);
                    List LJLI = ORY.LJLI(intArray2);
                    ArrayList parcelableArrayList = LLJJIJI2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    int intValue = ((Number) ORS.LJJLL(LJLI)).intValue();
                    if (parcelableArrayList != null) {
                        ORS.LJJLL(parcelableArrayList);
                    }
                    ArrayList arrayList = (ArrayList) LJLI;
                    if (!arrayList.isEmpty()) {
                        C91720ZzA LIZLLL = LIZLLL(LJII(), intValue);
                        if (LIZLLL instanceof C92143a5z) {
                            C92143a5z c92143a5z = (C92143a5z) LIZLLL;
                            o.LJIIIZ(c92143a5z, "<this>");
                            intValue = ((C91720ZzA) OJ4.LJJJJLI(OJ6.LJJIZ(c92143a5z.LJIIZILJ(c92143a5z.LJLL, true), C92406aAE.LJLIL))).LJLJJLL;
                        }
                        C91720ZzA LJFF = LJFF();
                        if (LJFF != null && intValue == LJFF.LJLJJLL) {
                            C91714Zz4 c91714Zz4 = new C91714Zz4((C92145a61) this);
                            Bundle LJ = V3N.LJ(new OSZ("android-support-nav:controller:deepLinkIntent", intent2));
                            Bundle bundle2 = LLJJIJI2.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle2 != null) {
                                LJ.putAll(bundle2);
                            }
                            c91714Zz4.LIZIZ.putExtra("android-support-nav:controller:deepLinkExtras", LJ);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i >= 0) {
                                    int intValue2 = ((Number) next).intValue();
                                    if (parcelableArrayList == null) {
                                        bundle = null;
                                    } else {
                                        bundle = (Bundle) ListProtector.get(parcelableArrayList, i);
                                    }
                                    ((ArrayList) c91714Zz4.LIZLLL).add(new C91713Zz3(intValue2, bundle));
                                    if (c91714Zz4.LIZJ != null) {
                                        c91714Zz4.LIZJ();
                                    }
                                    i = i2;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                            c91714Zz4.LIZ().LJFF();
                            Activity activity3 = this.LIZIZ;
                            if (activity3 == null) {
                                return true;
                            }
                            activity3.finish();
                            return true;
                        }
                    }
                }
                return false;
            }
            C91720ZzA LJFF2 = LJFF();
            o.LJI(LJFF2);
            int i3 = LJFF2.LJLJJLL;
            for (C92143a5z c92143a5z2 = LJFF2.LJLILLLLZI; c92143a5z2 != null; c92143a5z2 = c92143a5z2.LJLILLLLZI) {
                if (c92143a5z2.LJLL != i3) {
                    Bundle bundle3 = new Bundle();
                    Activity activity4 = this.LIZIZ;
                    if (activity4 != null && activity4.getIntent() != null) {
                        Activity activity5 = this.LIZIZ;
                        o.LJI(activity5);
                        if (activity5.getIntent().getData() != null) {
                            Activity activity6 = this.LIZIZ;
                            o.LJI(activity6);
                            bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", activity6.getIntent());
                            C92143a5z c92143a5z3 = this.LIZJ;
                            o.LJI(c92143a5z3);
                            Activity activity7 = this.LIZIZ;
                            o.LJI(activity7);
                            Intent intent3 = activity7.getIntent();
                            o.LJIIIIZZ(intent3, "activity!!.intent");
                            C91719Zz9 LJIILJJIL = c92143a5z3.LJIILJJIL(new C91717Zz7(intent3));
                            if (LJIILJJIL != null) {
                                bundle3.putAll(LJIILJJIL.LJLIL.LJII(LJIILJJIL.LJLILLLLZI));
                            }
                        }
                    }
                    C91714Zz4 c91714Zz42 = new C91714Zz4((C92145a61) this);
                    int i4 = c92143a5z2.LJLJJLL;
                    ((ArrayList) c91714Zz42.LIZLLL).clear();
                    ((ArrayList) c91714Zz42.LIZLLL).add(new C91713Zz3(i4, null));
                    if (c91714Zz42.LIZJ != null) {
                        c91714Zz42.LIZJ();
                    }
                    c91714Zz42.LIZIZ.putExtra("android-support-nav:controller:deepLinkExtras", bundle3);
                    c91714Zz42.LIZ().LJFF();
                    Activity activity8 = this.LIZIZ;
                    if (activity8 == null) {
                        return true;
                    }
                    activity8.finish();
                    return true;
                }
                i3 = c92143a5z2.LJLJJLL;
            }
            return false;
        }
        return LJIILJJIL();
    }

    public C91706Zyw(Context context) {
        Object obj;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        Iterator it = OJ6.LJJIZ(context, C92398aA6.LJLIL).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.LIZIZ = (Activity) obj;
        this.LJI = new ORV<>();
        XLM LIZ = V8H.LIZ(C61878OQg.INSTANCE);
        this.LJII = LIZ;
        V1M.LIZLLL(LIZ);
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIIZ = new LinkedHashMap();
        this.LJIIJ = new LinkedHashMap();
        this.LJIIJJI = new LinkedHashMap();
        this.LJIILL = new CopyOnWriteArrayList<>();
        this.LJIILLIIL = Lifecycle.State.INITIALIZED;
        this.LJIIZILJ = new LifecycleEventObserver() { // from class: X.a97
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner noName_0, Lifecycle.Event event) {
                C91706Zyw this$0 = C91706Zyw.this;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(noName_0, "$noName_0");
                o.LJIIIZ(event, "event");
                Lifecycle.State targetState = event.getTargetState();
                o.LJIIIIZZ(targetState, "event.targetState");
                this$0.LJIILLIIL = targetState;
                if (this$0.LIZJ != null) {
                    Iterator<NavBackStackEntry> it2 = this$0.LJI.iterator();
                    while (it2.hasNext()) {
                        NavBackStackEntry next = it2.next();
                        next.getClass();
                        Lifecycle.State targetState2 = event.getTargetState();
                        o.LJIIIIZZ(targetState2, "event.targetState");
                        next.LJLJJI = targetState2;
                        next.LIZIZ();
                    }
                }
            }
        };
        this.LJIJ = new C92141a5x(this);
        this.LJIJI = true;
        C91700Zyq c91700Zyq = new C91700Zyq();
        this.LJIJJ = c91700Zyq;
        this.LJIJJLI = new LinkedHashMap();
        this.LJJI = new LinkedHashMap();
        c91700Zyq.LIZ(new C92144a60(c91700Zyq));
        c91700Zyq.LIZ(new C92124a5g(this.LIZ));
        this.LJJII = new ArrayList();
        C221108m2.LIZIZ(new IDqS422S0100000_31(this, 2));
        XLL LIZ2 = C79853Bl.LIZ(1, 0, XKI.DROP_OLDEST, 2);
        this.LJJIII = LIZ2;
        this.LJJIIJ = new C79883Bo(LIZ2);
    }

    public final C91720ZzA LIZJ(int i) {
        C91720ZzA c91720ZzA;
        C92143a5z c92143a5z = this.LIZJ;
        if (c92143a5z == null) {
            return null;
        }
        if (c92143a5z.LJLJJLL == i) {
            return c92143a5z;
        }
        NavBackStackEntry LJIILJJIL = this.LJI.LJIILJJIL();
        if (LJIILJJIL == null || (c91720ZzA = LJIILJJIL.LJLILLLLZI) == null) {
            c91720ZzA = this.LIZJ;
            o.LJI(c91720ZzA);
        }
        return LIZLLL(c91720ZzA, i);
    }

    public final NavBackStackEntry LJ(int i) {
        NavBackStackEntry navBackStackEntry;
        ORV<NavBackStackEntry> orv = this.LJI;
        ListIterator<NavBackStackEntry> listIterator = orv.listIterator(orv.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                navBackStackEntry = listIterator.previous();
                if (navBackStackEntry.LJLILLLLZI.LJLJJLL == i) {
                    break;
                }
            } else {
                navBackStackEntry = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No destination with ID ");
        LIZ.append(i);
        LIZ.append(" is on the NavController's back stack. The current destination is ");
        LIZ.append(LJFF());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final void LJIJJLI(NavBackStackEntry child) {
        AtomicInteger atomicInteger;
        Integer valueOf;
        o.LJIIIZ(child, "child");
        NavBackStackEntry remove = this.LJIIIIZZ.remove(child);
        if (remove == null || (atomicInteger = (AtomicInteger) ((LinkedHashMap) this.LJIIIZ).get(remove)) == null || (valueOf = Integer.valueOf(atomicInteger.decrementAndGet())) == null || valueOf.intValue() != 0) {
            return;
        }
        AbstractC91702Zys abstractC91702Zys = (AbstractC91702Zys) ((LinkedHashMap) this.LJIJJLI).get(this.LJIJJ.LIZIZ(remove.LJLILLLLZI.LJLIL));
        if (abstractC91702Zys != null) {
            abstractC91702Zys.LIZIZ(remove);
        }
        this.LJIIIZ.remove(remove);
    }

    public static C91720ZzA LIZLLL(C91720ZzA c91720ZzA, int i) {
        C92143a5z c92143a5z;
        if (c91720ZzA.LJLJJLL == i) {
            return c91720ZzA;
        }
        if (c91720ZzA instanceof C92143a5z) {
            c92143a5z = (C92143a5z) c91720ZzA;
        } else {
            c92143a5z = c91720ZzA.LJLILLLLZI;
            o.LJI(c92143a5z);
        }
        return c92143a5z.LJIIZILJ(i, true);
    }

    public static /* synthetic */ void LJIJ(C91706Zyw c91706Zyw, NavBackStackEntry navBackStackEntry) {
        c91706Zyw.LJIIZILJ(navBackStackEntry, false, new ORV<>());
    }

    public final void LJIIIZ(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.LJIIIIZZ.put(navBackStackEntry, navBackStackEntry2);
        if (((LinkedHashMap) this.LJIIIZ).get(navBackStackEntry2) == null) {
            this.LJIIIZ.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = ((LinkedHashMap) this.LJIIIZ).get(navBackStackEntry2);
        o.LJI(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void LJIIJJI(String route, InterfaceC88472Yns<? super C91684Zya, C76800UCe> builder) {
        o.LJIIIZ(route, "route");
        o.LJIIIZ(builder, "builder");
        LJIIL(this, route, C91686Zyc.LIZ(builder), 4);
    }

    public static void LJIILL(C92145a61 c92145a61, String route, boolean z) {
        c92145a61.getClass();
        o.LJIIIZ(route, "route");
        if (c92145a61.LJIILLIIL(C91718Zz8.LIZ(route).hashCode(), z, false)) {
            c92145a61.LIZIZ();
        }
    }

    public final boolean LJIILLIIL(int i, boolean z, boolean z2) {
        String str;
        String str2;
        if (this.LJI.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ORZ.LLIILII(this.LJI).iterator();
        while (it.hasNext()) {
            C91720ZzA c91720ZzA = ((NavBackStackEntry) it.next()).LJLILLLLZI;
            AbstractC91695Zyl LIZIZ = this.LJIJJ.LIZIZ(c91720ZzA.LJLIL);
            if (z || c91720ZzA.LJLJJLL != i) {
                arrayList.add(LIZIZ);
            }
            if (c91720ZzA.LJLJJLL == i) {
                C34K c34k = new C34K();
                ORV<NavBackStackEntryState> orv = new ORV<>();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        AbstractC91695Zyl abstractC91695Zyl = (AbstractC91695Zyl) it2.next();
                        C34K c34k2 = new C34K();
                        NavBackStackEntry last = this.LJI.last();
                        this.LJJ = new C92399aA7(c34k2, c34k, this, z2, orv);
                        abstractC91695Zyl.LJ(last, z2);
                        str = null;
                        this.LJJ = null;
                        if (!c34k2.element) {
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                if (z2) {
                    if (!z) {
                        C36971Ef9 c36971Ef9 = new C36971Ef9(new C36972EfA(OJ6.LJJIZ(c91720ZzA, C92400aA8.LJLIL), new IDqS418S0100000_31(this, 1)));
                        while (c36971Ef9.hasNext()) {
                            C91720ZzA c91720ZzA2 = (C91720ZzA) c36971Ef9.next();
                            java.util.Map<Integer, String> map = this.LJIIJ;
                            Integer valueOf = Integer.valueOf(c91720ZzA2.LJLJJLL);
                            NavBackStackEntryState LJIIIIZZ = orv.LJIIIIZZ();
                            if (LJIIIIZZ == null) {
                                str2 = str;
                            } else {
                                str2 = LJIIIIZZ.id;
                            }
                            map.put(valueOf, str2);
                        }
                    }
                    if (!orv.isEmpty()) {
                        NavBackStackEntryState first = orv.first();
                        C36971Ef9 c36971Ef92 = new C36971Ef9(new C36972EfA(OJ6.LJJIZ(LIZJ(first.destinationId), C92401aA9.LJLIL), new IDqS418S0100000_31(this, 2)));
                        while (c36971Ef92.hasNext()) {
                            this.LJIIJ.put(Integer.valueOf(((C91720ZzA) c36971Ef92.next()).LJLJJLL), first.id);
                        }
                        this.LJIIJJI.put(first.id, orv);
                    }
                }
                LJJ();
                return c34k.element;
            }
        }
        C91718Zz8.LIZIZ(i, this.LIZ);
        return false;
    }

    public final void LJIIZILJ(NavBackStackEntry navBackStackEntry, boolean z, ORV<NavBackStackEntryState> orv) {
        C79863Bm c79863Bm;
        java.util.Set set;
        NavControllerViewModel navControllerViewModel;
        NavBackStackEntry last = this.LJI.last();
        if (o.LJ(last, navBackStackEntry)) {
            this.LJI.removeLast();
            AbstractC91702Zys abstractC91702Zys = (AbstractC91702Zys) ((LinkedHashMap) this.LJIJJLI).get(this.LJIJJ.LIZIZ(last.LJLILLLLZI.LJLIL));
            boolean z2 = false;
            if ((abstractC91702Zys != null && (c79863Bm = abstractC91702Zys.LJFF) != null && (set = (java.util.Set) c79863Bm.getValue()) != null && set.contains(last)) || this.LJIIIZ.containsKey(last)) {
                z2 = true;
            }
            Lifecycle.State currentState = last.LJLJLJ.getCurrentState();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (currentState.isAtLeast(state)) {
                if (z) {
                    last.LIZ(state);
                    orv.addFirst(new NavBackStackEntryState(last));
                }
                if (!z2) {
                    last.LIZ(Lifecycle.State.DESTROYED);
                    LJIJJLI(last);
                } else {
                    last.LIZ(state);
                }
            }
            if (z || z2 || (navControllerViewModel = this.LJIILJJIL) == null) {
                return;
            }
            String backStackEntryId = last.LJLJJLL;
            o.LJIIIZ(backStackEntryId, "backStackEntryId");
            ViewModelStore remove = navControllerViewModel.LJLIL.remove(backStackEntryId);
            if (remove == null) {
                return;
            }
            remove.clear();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Attempted to pop ");
        LIZ.append(navBackStackEntry.LJLILLLLZI);
        LIZ.append(", which is not the top of the back stack (");
        LIZ.append(last.LJLILLLLZI);
        LIZ.append(')');
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public static void LJIIL(C91706Zyw c91706Zyw, String route, C91683ZyZ c91683ZyZ, int i) {
        if ((i & 2) != 0) {
            c91683ZyZ = null;
        }
        c91706Zyw.getClass();
        o.LJIIIZ(route, "route");
        android.net.Uri parse = UriProtector.parse(C91718Zz8.LIZ(route));
        o.LJFF(parse, "Uri.parse(this)");
        C91717Zz7 c91717Zz7 = new C91717Zz7(parse, null, null);
        C92143a5z c92143a5z = c91706Zyw.LIZJ;
        o.LJI(c92143a5z);
        C91719Zz9 LJIILJJIL = c92143a5z.LJIILJJIL(c91717Zz7);
        if (LJIILJJIL != null) {
            Bundle LJII = LJIILJJIL.LJLIL.LJII(LJIILJJIL.LJLILLLLZI);
            if (LJII == null) {
                LJII = new Bundle();
            }
            C91720ZzA c91720ZzA = LJIILJJIL.LJLIL;
            Intent intent = new Intent();
            intent.setDataAndType(parse, null);
            intent.setAction(null);
            LJII.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
            c91706Zyw.LJIIJ(c91720ZzA, LJII, c91683ZyZ, null);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Navigation destination that matches request ");
        LIZ.append(c91717Zz7);
        LIZ.append(" cannot be found in the navigation graph ");
        LIZ.append(c91706Zyw.LIZJ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d1, code lost:
    
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d2, code lost:
    
        r9.LJI.addAll(r3);
        r9.LJI.addLast(r12);
        r2 = ((java.util.ArrayList) X.ORZ.LLIIJI(r12, r3)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ea, code lost:
    
        if (r2.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ec, code lost:
    
        r1 = (androidx.navigation.NavBackStackEntry) r2.next();
        r0 = r1.LJLILLLLZI.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f6, code lost:
    
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f8, code lost:
    
        LJIIIZ(r1, LJ(r0.LJLJJLL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0202, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01af, code lost:
    
        r2 = r0.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00dc, code lost:
    
        r8 = ((androidx.navigation.NavBackStackEntry) r3.first()).LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r3 = new X.ORV();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if ((r10 instanceof X.C92143a5z) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        kotlin.jvm.internal.o.LJI(r1);
        r1 = r1.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r1 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        r7 = r13.listIterator(r13.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r7.hasPrevious() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r6 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6.LJLILLLLZI, r1) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r6 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r6 = X.C91677ZyT.LIZIZ(r9.LIZ, r1, r11, LJIIIIZZ(), r9.LJIILJJIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r3.addFirst(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if ((!r9.LJI.isEmpty()) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r9.LJI.last().LJLILLLLZI != r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0006, code lost:
    
        if ((r5 instanceof X.InterfaceC91687Zyd) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        LJIJ(r9, r9.LJI.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r1 != r10) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r3.isEmpty() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (LIZJ(r8.LJLJJLL) != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        r8 = r8.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        if (r8 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        r6 = r13.listIterator(r13.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r9.LJI.isEmpty() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        if (r6.hasPrevious() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        r1 = r6.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1.LJLILLLLZI, r8) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        if (r1 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c8, code lost:
    
        r1 = X.C91677ZyT.LIZIZ(r9.LIZ, r8, r8.LJII(r11), LJIIIIZZ(), r9.LJIILJJIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r3.addFirst(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e9, code lost:
    
        if (r3.isEmpty() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r5 = ((androidx.navigation.NavBackStackEntry) r3.last()).LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f1, code lost:
    
        if (r9.LJI.isEmpty() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if ((r9.LJI.last().LJLILLLLZI instanceof X.InterfaceC91687Zyd) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ff, code lost:
    
        if ((r9.LJI.last().LJLILLLLZI instanceof X.C92143a5z) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        if (((X.C92143a5z) r9.LJI.last().LJLILLLLZI).LJIIZILJ(r5.LJLJJLL, false) != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0115, code lost:
    
        LJIJ(r9, r9.LJI.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        r0 = r9.LJI.LJIIIIZZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0132, code lost:
    
        if (r0 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0134, code lost:
    
        r0 = (androidx.navigation.NavBackStackEntry) r3.LJIIIIZZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013a, code lost:
    
        if (r0 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0142, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, r9.LIZJ) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
    
        r4 = r13.listIterator(r13.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0150, code lost:
    
        if (r4.hasPrevious() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        r2 = r4.previous();
        r1 = r2.LJLILLLLZI;
        r0 = r9.LIZJ;
        kotlin.jvm.internal.o.LJI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0164, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0166, code lost:
    
        if (r2 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0168, code lost:
    
        r5 = r9.LIZ;
        r4 = r9.LIZJ;
        kotlin.jvm.internal.o.LJI(r4);
        r0 = r9.LIZJ;
        kotlin.jvm.internal.o.LJI(r0);
        r2 = X.C91677ZyT.LIZIZ(r5, r4, r0.LJII(r11), LJIIIIZZ(), r9.LJIILJJIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0182, code lost:
    
        r3.addFirst(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (LJIILLIIL(r9.LJI.last().LJLILLLLZI.LJLJJLL, true, false) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0185, code lost:
    
        r4 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018d, code lost:
    
        if (r4.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018f, code lost:
    
        r2 = (androidx.navigation.NavBackStackEntry) r4.next();
        r0 = ((java.util.LinkedHashMap) r9.LJIJJLI).get(r9.LJIJJ.LIZIZ(r2.LJLILLLLZI.LJLIL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a7, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a9, code lost:
    
        ((X.C92140a5w) r0).LJII(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b2, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("NavigatorBackStack for ");
        r1.append(r10.LJLIL);
        r1.append(" should already be created");
        r1 = X.X1D.LIZIZ(r1);
        r1.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C91720ZzA r10, android.os.Bundle r11, androidx.navigation.NavBackStackEntry r12, java.util.List<androidx.navigation.NavBackStackEntry> r13) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91706Zyw.LIZ(X.ZzA, android.os.Bundle, androidx.navigation.NavBackStackEntry, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[LOOP:1: B:33:0x0090->B:35:0x0096, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.C91720ZzA r21, android.os.Bundle r22, X.C91683ZyZ r23, X.InterfaceC91693Zyj r24) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91706Zyw.LJIIJ(X.ZzA, android.os.Bundle, X.ZyZ, X.Zyj):void");
    }

    public final boolean LJIJJ(int i, Bundle bundle, C91683ZyZ c91683ZyZ, InterfaceC91693Zyj interfaceC91693Zyj) {
        C91720ZzA c91720ZzA;
        NavBackStackEntry navBackStackEntry;
        C91720ZzA c91720ZzA2;
        String str;
        if (!this.LJIIJ.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str2 = (String) ((LinkedHashMap) this.LJIIJ).get(Integer.valueOf(i));
        ORS.LJJLIIJ(((LinkedHashMap) this.LJIIJ).values(), new IDqS8S1000000_31(str2, 0));
        ORV<NavBackStackEntryState> remove = this.LJIIJJI.remove(str2);
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry LJIILJJIL = this.LJI.LJIILJJIL();
        if (LJIILJJIL == null || (c91720ZzA = LJIILJJIL.LJLILLLLZI) == null) {
            c91720ZzA = LJII();
        }
        if (remove != null) {
            Iterator<NavBackStackEntryState> it = remove.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState next = it.next();
                C91720ZzA LIZLLL = LIZLLL(c91720ZzA, next.destinationId);
                if (LIZLLL != null) {
                    arrayList.add(next.LIZ(this.LIZ, LIZLLL, LJIIIIZZ(), this.LJIILJJIL));
                    c91720ZzA = LIZLLL;
                } else {
                    String LIZIZ = C91718Zz8.LIZIZ(next.destinationId, this.LIZ);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Restore State failed: destination ");
                    LIZ.append(LIZIZ);
                    LIZ.append(" cannot be found from the current destination ");
                    LIZ.append(c91720ZzA);
                    String LIZIZ2 = X1D.LIZIZ(LIZ);
                    LIZIZ2.toString();
                    throw new IllegalStateException(LIZIZ2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!(((NavBackStackEntry) next2).LJLILLLLZI instanceof C92143a5z)) {
                arrayList3.add(next2);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it3.next();
            List list = (List) ORZ.LLFII(arrayList2);
            if (list == null || (navBackStackEntry = (NavBackStackEntry) ORZ.LLFF(list)) == null || (c91720ZzA2 = navBackStackEntry.LJLILLLLZI) == null) {
                str = null;
            } else {
                str = c91720ZzA2.LJLIL;
            }
            if (o.LJ(str, navBackStackEntry2.LJLILLLLZI.LJLIL)) {
                list.add(navBackStackEntry2);
            } else {
                arrayList2.add(C47261Igj.LJJIJIL(navBackStackEntry2));
            }
        }
        C34K c34k = new C34K();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List<NavBackStackEntry> list2 = (List) it4.next();
            AbstractC91695Zyl LIZIZ3 = this.LJIJJ.LIZIZ(((NavBackStackEntry) ORZ.LJLLJ(list2)).LJLILLLLZI.LJLIL);
            this.LJIL = new C92402aAA(c34k, arrayList, new C76732zl(), this, bundle);
            LIZIZ3.LIZLLL(list2, c91683ZyZ, interfaceC91693Zyj);
            this.LJIL = null;
        }
        return c34k.element;
    }
}
