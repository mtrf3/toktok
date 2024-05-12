package X;

import Y.IDRunnableS85S0100000;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0nM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18080nM {
    public static String LIZIZ;
    public static C18090nN LIZJ;
    public static C18090nN LIZLLL;
    public static C18090nN LJ;
    public static final C18080nM LIZ = new C18080nM();
    public static final ConcurrentHashMap<String, C18090nN> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C18090nN> LJI = new ConcurrentHashMap<>();
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(AnonymousClass232.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(AnonymousClass231.LJLIL);
    public static final ArrayList<InterfaceC17990nD> LJIIIZ = new ArrayList<>();

    public static CopyOnWriteArrayList LJ() {
        return (CopyOnWriteArrayList) LJII.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0201, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C12450eH r9) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18080nM.LIZIZ(X.0eH):void");
    }

    public static void LIZJ(C18090nN c18090nN) {
        C18090nN c18090nN2;
        HashMap<String, HashSet<C18090nN>> hashMap;
        if (c18090nN.LJIL && c18090nN.LJIILL == EnumC18130nR.SAVEINSTANCESTATE) {
            return;
        }
        Iterator<Map.Entry<String, HashSet<C18090nN>>> it = c18090nN.LJIJI.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<C18090nN> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ListProtector.get(s.LJLJJL(it2.next().LIZ(), new String[]{"."}, 0, 6), 1);
            }
        }
        ListProtector.get(s.LJLJJL(c18090nN.LIZ(), new String[]{"."}, 0, 6), 1);
        Iterator<Map.Entry<String, HashSet<C18090nN>>> it3 = c18090nN.LJIJI.entrySet().iterator();
        while (it3.hasNext()) {
            Iterator<C18090nN> it4 = it3.next().getValue().iterator();
            while (it4.hasNext()) {
                C18090nN next = it4.next();
                LJFF.remove(next.LIZ);
                LIZ.getClass();
                LJIIIZ(next);
            }
        }
        if (c18090nN.LJJI && (c18090nN2 = c18090nN.LJIIZILJ) != null && (hashMap = c18090nN2.LJIJI) != null) {
            hashMap.remove(c18090nN.LIZ);
        }
        LJFF.remove(c18090nN.LIZ);
        LJIIIZ(c18090nN);
    }

    public static C18090nN LJFF(String id) {
        o.LJIIIZ(id, "id");
        return LJFF.get(id);
    }

    public static String LJI(String parentCode) {
        o.LJIIIZ(parentCode, "parentCode");
        for (Map.Entry<String, C18090nN> entry : LJFF.entrySet()) {
            if (o.LJ(entry.getValue().LIZIZ(), parentCode)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static void LJII(C18090nN c18090nN) {
        WeakReference<Fragment> weakReference;
        Fragment fragment;
        View view;
        Activity activity;
        Window window;
        View decorView;
        if (c18090nN.LJIL) {
            WeakReference<Activity> weakReference2 = c18090nN.LJJ;
            if (weakReference2 != null && (activity = weakReference2.get()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setTag(-1843987113, c18090nN);
            }
        } else if (c18090nN.LJJI && (weakReference = c18090nN.LJJIFFI) != null && (fragment = weakReference.get()) != null && (view = fragment.getView()) != null) {
            view.setTag(-1843987113, c18090nN);
        }
        c18090nN.LJJIJLIJ = null;
        c18090nN.LJIILJJIL = 1;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append('.');
        LIZ2.append(c18090nN.LIZIZ());
        LIZ2.append(".c0.d0");
        c18090nN.LJII = X1D.LIZIZ(LIZ2);
        C18090nN c18090nN2 = LIZJ;
        if (c18090nN2 != null) {
            if (c18090nN2.LJIJJLI) {
                c18090nN.LJIILIIL = c18090nN2.LJIILIIL;
            } else {
                c18090nN.LJIILIIL = c18090nN2.LIZ();
            }
        }
    }

    public static void LJIIIIZZ(C18090nN c18090nN) {
        LJFF.put(c18090nN.LIZ, c18090nN);
        Iterator it = LJ().iterator();
        while (it.hasNext()) {
            ((InterfaceC18060nK) it.next()).LIZ(C12460eI.LJIILIIL(c18090nN));
        }
    }

    public static void LJIIIZ(C18090nN c18090nN) {
        Iterator it = LJ().iterator();
        while (it.hasNext()) {
            ((InterfaceC18060nK) it.next()).LIZIZ(C12460eI.LJIILIIL(c18090nN));
        }
    }

    public static void LJIIJ(C18090nN c18090nN) {
        EnumC18130nR enumC18130nR = EnumC18130nR.INVISIBLE;
        c18090nN.getClass();
        o.LJIIIZ(enumC18130nR, "<set-?>");
        c18090nN.LJIILL = enumC18130nR;
        if (c18090nN.LJJIJ != 0) {
            c18090nN.LJJIJIIJI = SystemClock.elapsedRealtime() - c18090nN.LJJIJ;
        }
        if (c18090nN.LJIJJLI || !c18090nN.LJJIJL) {
            c18090nN.LJJIJ = 0L;
            return;
        }
        java.util.Map<String, String> LJ2 = c18090nN.LJ();
        C19500pe.LIZ(LJ2);
        C38995FSd.LIZLLL().submit(new IDRunnableS85S0100000(LJ2, 93));
        String pageId = c18090nN.LIZ;
        o.LJIIIZ(pageId, "pageId");
        for (Map.Entry entry : C13930gf.LJ(C13930gf.LJII()).entrySet()) {
            if (o.LJ(((C15210ij) entry.getValue()).LJIIIIZZ, pageId) && ((C15210ij) entry.getValue()).LJFF) {
                ((C15210ij) entry.getValue()).LJIIJ = true;
                ((C15210ij) entry.getValue()).LJIIIZ = true;
            }
        }
        C13930gf.LIZLLL(false);
        Iterator it = LJ().iterator();
        while (it.hasNext()) {
            ((InterfaceC18060nK) it.next()).LIZLLL(C12460eI.LJIILIIL(c18090nN));
        }
        c18090nN.LJJIJ = 0L;
        HashSet<C18090nN> hashSet = c18090nN.LJIJI.get(c18090nN.LIZ);
        if (hashSet != null) {
            Iterator<C18090nN> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C18090nN next = it2.next();
                LIZ.getClass();
                LJIIJ(next);
            }
        }
    }

    public static void LIZ(C18090nN c18090nN, C18090nN c18090nN2) {
        String str;
        String str2;
        LJIIJJI(c18090nN, c18090nN2);
        java.util.Map<String, String> LJ2 = c18090nN.LJ();
        C19500pe.LIZ(LJ2);
        try {
            if (C19550pj.LIZ == null) {
                C19550pj.LIZ = new Gson();
            }
            Gson gson = C19550pj.LIZ;
            if (gson != null) {
                str = gson.LJIILL(LJ2);
            } else {
                str = null;
            }
        } catch (Exception unused) {
            str = "";
        }
        if (str != null && str.length() != 0) {
            ((Keva) C19500pe.LJFF.getValue()).storeString("btm_current_cache_page", str);
        }
        if (c18090nN.LJJI && c18090nN2 != null && c18090nN2.LJIJJLI && (str2 = c18090nN2.LJII) != null) {
            int LJJI = C47261Igj.LJJI(C19500pe.LIZ);
            while (true) {
                if (-1 >= LJJI) {
                    break;
                }
                ORV<String> orv = C19500pe.LIZ;
                if (o.LJ(orv.get(LJJI), str2)) {
                    orv.remove(LJJI);
                    break;
                }
                LJJI--;
            }
        }
        String str3 = c18090nN.LJII;
        if (str3 != null) {
            ORV<String> orv2 = C19500pe.LIZ;
            orv2.addLast(str3);
            if (orv2.size() > 30) {
                orv2.removeFirst();
            }
        }
        if (!C19630pr.LIZ.contains(c18090nN.LIZIZ())) {
            return;
        }
        C38995FSd.LIZLLL().submit(new IDRunnableS85S0100000(C113554cx.LJJLIIIIJ(new OSZ("btm", c18090nN.LIZ()), new OSZ("is_cold_start_first_launch", String.valueOf(C19500pe.LJ))), 95));
    }

    public static C18090nN LIZLLL(View view, InterfaceC34451Wv interfaceC34451Wv) {
        o.LJIIIZ(view, "view");
        if (interfaceC34451Wv != null) {
            return LJI.get(interfaceC34451Wv.LLZIL());
        }
        C18090nN c18090nN = (C18090nN) view.getTag(-1843987113);
        if (c18090nN == null) {
            Object parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                View view2 = (View) parent;
                c18090nN = (C18090nN) view2.getTag(-1843987113);
                if (c18090nN == null) {
                    parent = view2.getParent();
                } else {
                    view.setTag(-1843987113, c18090nN);
                    break;
                }
            }
        }
        return c18090nN;
    }

    public static void LJIIJJI(C18090nN c18090nN, C18090nN c18090nN2) {
        String str = null;
        if (c18090nN2 == null) {
            C18090nN c18090nN3 = LJ;
            if (c18090nN3 != null) {
                str = c18090nN3.LJII;
            }
            c18090nN.LJIIIIZZ = str;
            return;
        }
        if (c18090nN2.LJIIIZ == null) {
            if (c18090nN.LJJI && c18090nN2.LJIJJLI) {
                LJIIJJI(c18090nN, c18090nN2.LJIILLIIL);
                return;
            } else {
                c18090nN.LJIIIIZZ = c18090nN2.LJII;
                return;
            }
        }
        while (true) {
            if (c18090nN2.LJIIIZ != null) {
                c18090nN2 = c18090nN2.LJIIIZ;
                if (c18090nN2 == null) {
                    break;
                }
            } else if (c18090nN2 != null) {
                str = c18090nN2.LJII;
            }
        }
        c18090nN.LJIIIIZZ = str;
    }

    public static void LJIIL(C18090nN c18090nN, C18090nN c18090nN2) {
        C18090nN c18090nN3;
        if (c18090nN != null && (!c18090nN2.LJJII || c18090nN2.LJJIII)) {
            LIZ.getClass();
            LJIIJ(c18090nN);
        }
        EnumC18130nR enumC18130nR = EnumC18130nR.VISIBLE;
        c18090nN2.getClass();
        o.LJIIIZ(enumC18130nR, "<set-?>");
        c18090nN2.LJIILL = enumC18130nR;
        LIZJ = c18090nN2;
        c18090nN2.LJJIJ = SystemClock.elapsedRealtime();
        if (c18090nN2.LJJI && (c18090nN3 = c18090nN2.LJIIZILJ) != null && c18090nN3.LJIJJLI) {
            c18090nN3.LJIJ = c18090nN2;
        }
        HashSet<C18090nN> hashSet = c18090nN2.LJIJI.get(c18090nN2.LIZ);
        if (hashSet != null) {
            Iterator<C18090nN> it = hashSet.iterator();
            while (it.hasNext()) {
                C18090nN next = it.next();
                EnumC18130nR enumC18130nR2 = EnumC18130nR.VISIBLE;
                next.getClass();
                o.LJIIIZ(enumC18130nR2, "<set-?>");
                next.LJIILL = enumC18130nR2;
                next.LJJIJ = SystemClock.elapsedRealtime();
            }
        }
        Iterator it2 = LJ().iterator();
        while (it2.hasNext()) {
            ((InterfaceC18060nK) it2.next()).LIZJ(C12460eI.LJIILIIL(c18090nN2));
        }
        if (c18090nN != null && ((c18090nN.LJIL || ((c18090nN2.LJJI && !TextUtils.equals(c18090nN.LJJIIJZLJL, c18090nN2.LJJIIJZLJL)) || c18090nN2.LJIL)) && c18090nN.LIZIZ > c18090nN2.LIZIZ)) {
            LIZ.getClass();
            LIZJ(c18090nN);
        }
        if (c18090nN2.LJIJJLI && !c18090nN2.LJJIIZI) {
            LJII(c18090nN2.LJIJ);
            LJIIL(LIZJ, c18090nN2.LJIJ);
        }
    }

    public static void LJIILIIL(C18090nN c18090nN, C18090nN c18090nN2, long j) {
        EnumC18130nR enumC18130nR = EnumC18130nR.VISIBLE;
        c18090nN2.getClass();
        o.LJIIIZ(enumC18130nR, "<set-?>");
        c18090nN2.LJIILL = enumC18130nR;
        c18090nN2.LJJIJ = j;
        c18090nN2.LIZLLL(c18090nN);
        if (c18090nN != null) {
            c18090nN.LJIJJ = c18090nN2;
        }
        for (Map.Entry<String, HashSet<C18090nN>> entry : c18090nN2.LJIJI.entrySet()) {
            for (C18090nN c18090nN3 : entry.getValue()) {
                C18090nN c18090nN4 = LJFF.get(entry.getKey());
                LIZ.getClass();
                LJIILIIL(c18090nN4, c18090nN3, j);
            }
        }
    }
}
