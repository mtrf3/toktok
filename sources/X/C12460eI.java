package X;

import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12460eI {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LJFF() {
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = C18080nM.LIZJ;
        if (c18090nN != null) {
            return c18090nN.LIZ();
        }
        return null;
    }

    public static final C12410eD LJI() {
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = C18080nM.LIZJ;
        if (c18090nN != null) {
            return c18090nN.LIZJ();
        }
        return null;
    }

    public static void LIZ(ViewGroup group) {
        o.LJIIIZ(group, "group");
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            if (group.getContext() instanceof Activity) {
                Iterator it = C13930gf.LJ(C13930gf.LJII()).entrySet().iterator();
                while (it.hasNext()) {
                    Integer num = ((C15210ij) ((Map.Entry) it.next()).getValue()).LJII;
                    int hashCode = group.hashCode();
                    if (num != null && num.intValue() == hashCode) {
                        it.remove();
                    }
                }
                return;
            }
            return;
        }
        throw new Exception("clearCustomGroup must run on the main thread");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.C12450eH r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12460eI.LJII(X.0eH):void");
    }

    public static final void LJIIIZ(InterfaceC34451Wv popupPage) {
        ConcurrentHashMap<String, C18090nN> concurrentHashMap;
        C18090nN c18090nN;
        o.LJIIIZ(popupPage, "popupPage");
        C18080nM.LIZ.getClass();
        String LLZIL = popupPage.LLZIL();
        if (LLZIL == null || (c18090nN = (concurrentHashMap = C18080nM.LJI).get(LLZIL)) == null) {
            return;
        }
        C18090nN c18090nN2 = c18090nN.LJIILLIIL;
        if (o.LJ(C18080nM.LIZJ, c18090nN)) {
            if (popupPage.Wi()) {
                if (c18090nN2 != null) {
                    C18080nM.LJIIL(c18090nN, c18090nN2);
                }
                C18090nN c18090nN3 = C18080nM.LIZJ;
                if (c18090nN3 != null) {
                    C18080nM.LIZ(c18090nN3, c18090nN);
                }
            } else {
                C18080nM.LIZJ = c18090nN2;
            }
        } else {
            C18090nN c18090nN4 = C18080nM.LIZJ;
            while (true) {
                if (c18090nN4 != null) {
                    if (o.LJ(c18090nN4.LJIILLIIL, c18090nN)) {
                        C18080nM.LJIIJ(c18090nN);
                        C18090nN c18090nN5 = C18080nM.LIZJ;
                        while (true) {
                            if (c18090nN5 == null) {
                                break;
                            }
                            if (o.LJ(c18090nN5.LJIILLIIL, c18090nN)) {
                                c18090nN5.LIZLLL(c18090nN2);
                                break;
                            }
                            c18090nN5 = c18090nN5.LJIILLIIL;
                        }
                    } else {
                        c18090nN4 = c18090nN4.LJIILLIIL;
                    }
                } else {
                    C18080nM.LJIIJ(c18090nN);
                    break;
                }
            }
        }
        c18090nN.LIZLLL(null);
        concurrentHashMap.remove(LLZIL);
        C18080nM.LJFF.remove(LLZIL);
        C18080nM.LJIIIZ(c18090nN);
    }

    public static final void LJIIJ(InterfaceC34451Wv popupPage) {
        o.LJIIIZ(popupPage, "popupPage");
        C12420eE c12420eE = new C12420eE();
        c12420eE.LIZ(popupPage.LLZIL());
        String btmPageCode = popupPage.getBtmPageCode();
        o.LJIIIZ(btmPageCode, "<set-?>");
        c12420eE.LIZJ = btmPageCode;
        c12420eE.LJIIJJI = popupPage.x3();
        c12420eE.LJIIL = popupPage.Wi();
        c12420eE.LIZIZ(EnumC12440eG.DIALOG);
        Object LJJIII = popupPage.LJJIII();
        if (LJJIII != null) {
            c12420eE.LJII = new WeakReference<>(LJJIII);
        }
        LJII(new C12450eH(c12420eE));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJJI(java.lang.String r5) {
        /*
            X.0eE r2 = new X.0eE
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.C16880lQ.LLJIJIL(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.LIZ(r0)
            r2.LIZJ = r5
            X.0eG r1 = X.EnumC12440eG.VIRTUAL
            r2.LIZIZ(r1)
            X.0eH r5 = new X.0eH
            r5.<init>(r2)
            X.0nM r0 = X.C18080nM.LIZ
            r0.getClass()
            X.0eG r0 = r5.LIZLLL
            if (r0 == r1) goto L2a
        L29:
            return
        L2a:
            X.0nN r3 = new X.0nN
            java.lang.String r1 = r5.LIZ
            r0 = -1
            r3.<init>(r1, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.LJJIJ = r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = X.C18080nM.LIZIZ
            r1.append(r0)
            r4 = 46
            r1.append(r4)
            java.lang.String r0 = r5.LIZJ
            r1.append(r0)
            java.lang.String r2 = ".c0.d0"
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            r3.LIZLLL = r0
            X.0nQ r0 = X.EnumC18120nQ.VIRTUAL
            java.lang.String r0 = r0.getValue()
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            r3.LJJIJIIJIL = r0
            X.0nN r1 = X.C18080nM.LIZJ
            if (r1 != 0) goto Lc1
            X.0nN r1 = X.C18080nM.LJ
        L6c:
            r3.LIZLLL(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C18080nM.LIZIZ
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r5.LIZJ
            java.lang.String r1 = X.AnonymousClass073.LIZIZ(r1, r0, r2)
            r3.LJII = r1
            java.lang.String r0 = r3.LJ
            r3.LJIIIIZZ = r0
            X.0nN r0 = r3.LJIILLIIL
            if (r0 != 0) goto Lbc
        L8c:
            X.0nN r0 = X.C18080nM.LIZJ
            if (r0 != 0) goto L92
            X.C18080nM.LJ = r3
        L92:
            if (r1 == 0) goto La4
            X.ORV<java.lang.String> r2 = X.C19500pe.LIZ
            r2.addLast(r1)
            int r1 = r2.size()
            r0 = 30
            if (r1 <= r0) goto La4
            r2.removeFirst()
        La4:
            java.util.Map r3 = r3.LJ()
            X.C19500pe.LIZ(r3)
            java.util.concurrent.ExecutorService r2 = X.C38995FSd.LIZLLL()
            Y.IDRunnableS85S0100000 r1 = new Y.IDRunnableS85S0100000
            r0 = 93
            r1.<init>(r3, r0)
            r2.submit(r1)
            goto L29
        Lbc:
            r0.LJIIIZ = r3
            goto L8c
        Lbf:
            if (r1 == 0) goto L6c
        Lc1:
            X.0nN r0 = r1.LJIIIZ
            if (r0 == 0) goto L6c
            X.0nN r1 = r1.LJIIIZ
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12460eI.LJIIJJI(java.lang.String):void");
    }

    public static C32781Qk LJIILIIL(C18090nN c18090nN) {
        o.LJIIIZ(c18090nN, "<this>");
        return new C32781Qk(c18090nN);
    }

    public static void LIZIZ(View view, AbstractC13940gg abstractC13940gg) {
        if (TextUtils.isEmpty(abstractC13940gg.LIZJ().invoke())) {
            abstractC13940gg.LJIIJJI(new IDqS420S0100000(view, 109));
        }
        C13930gf.LIZ(view, abstractC13940gg);
    }

    public static void LIZJ(View view, AbstractC13940gg provider) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(provider, "provider");
        C13930gf.LIZ(view, provider);
    }

    public static void LIZLLL(View view, AbstractC13940gg abstractC13940gg) {
        o.LJIIIZ(view, "view");
        if (TextUtils.isEmpty(abstractC13940gg.LIZJ().invoke())) {
            abstractC13940gg.LJIIJJI(new IDqS420S0100000(view, 110));
        }
        C13930gf.LIZ(view, abstractC13940gg);
    }

    public static void LJ(View view, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(view, "<this>");
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            WeakReference weakReference = new WeakReference(view);
            final C13900gc c13900gc = new C13900gc();
            interfaceC88472Yns.invoke(c13900gc);
            C13930gf.LJIIJ(new C17040lg(weakReference, new AbstractC13940gg(c13900gc) { // from class: X.1TM
                public InterfaceC65784Pro<String> LJ;
                public final C1TL LJFF;
                public final C1TN LJI;
                public final int LJII;
                public final float LJIIIIZZ;
                public final boolean LJIIIZ;
                public final boolean LJIIJ;
                public final EnumC13960gi LJIIJJI;

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZ() {
                    return null;
                }

                @Override // X.AbstractC13940gg
                public final java.util.Map<String, String> LJFF() {
                    return null;
                }

                @Override // X.AbstractC13940gg
                public final int LIZIZ() {
                    return this.LJII;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC19520pg LIZLLL() {
                    return this.LJI;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC19530ph LJ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC13940gg
                public final boolean LJI() {
                    return this.LJIIIZ;
                }

                @Override // X.AbstractC13940gg
                public final boolean LJII() {
                    return this.LJIIJ;
                }

                @Override // X.AbstractC13940gg
                public final EnumC13960gi LJIIIIZZ() {
                    return this.LJIIJJI;
                }

                @Override // X.AbstractC13940gg
                public final float LJIIIZ() {
                    return this.LJIIIIZZ;
                }

                {
                    this.LJ = c13900gc.LIZ;
                    this.LJFF = c13900gc.LIZIZ;
                    this.LJI = c13900gc.LIZJ;
                    this.LJII = c13900gc.LJI;
                    this.LJIIIIZZ = c13900gc.LJFF;
                    this.LJIIIZ = c13900gc.LIZLLL;
                    this.LJIIJ = c13900gc.LJ;
                    this.LJIIJJI = c13900gc.LJII;
                }

                @Override // X.AbstractC13940gg
                public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                    this.LJ = interfaceC65784Pro;
                }
            }));
            return;
        }
        throw new Exception("Add exposure view must run on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIIIZZ(InterfaceC18010nF page, Activity activity) {
        o.LJIIIZ(page, "page");
        C12420eE c12420eE = new C12420eE();
        c12420eE.LIZ(page.LLZIL());
        String btmPageCode = page.getBtmPageCode();
        o.LJIIIZ(btmPageCode, "<set-?>");
        c12420eE.LIZJ = btmPageCode;
        c12420eE.LJIIJJI = page.x3();
        if (page instanceof Activity) {
            c12420eE.LIZIZ(EnumC12440eG.ACTIVITY);
            c12420eE.LJI = new WeakReference<>(page);
        } else if (page instanceof Fragment) {
            c12420eE.LIZIZ(EnumC12440eG.FRAGMENT);
            c12420eE.LJFF = new WeakReference<>(page);
            ActivityC45651qj mo49getActivity = ((Fragment) page).mo49getActivity();
            if (mo49getActivity != null) {
                c12420eE.LJI = new WeakReference<>(mo49getActivity);
            } else if (activity != null) {
                c12420eE.LJI = new WeakReference<>(activity);
            }
            if (page instanceof InterfaceC34471Wx) {
                c12420eE.LJIIIZ = true;
                String xi = ((InterfaceC34471Wx) page).xi();
                o.LJIIIZ(xi, "<set-?>");
                c12420eE.LJIIJ = xi;
            }
        }
        LJII(new C12450eH(c12420eE));
    }

    public static void LJIIL(InterfaceC34461Ww subpage, boolean z) {
        o.LJIIIZ(subpage, "subpage");
        C12420eE c12420eE = new C12420eE();
        c12420eE.LIZ(subpage.LLZIL());
        C18080nM c18080nM = C18080nM.LIZ;
        String K3 = subpage.K3();
        c18080nM.getClass();
        c12420eE.LIZIZ = C18080nM.LJI(K3);
        String btmPageCode = subpage.getBtmPageCode();
        o.LJIIIZ(btmPageCode, "<set-?>");
        c12420eE.LIZJ = btmPageCode;
        c12420eE.LJIIJJI = subpage.x3();
        c12420eE.LIZIZ(EnumC12440eG.SUBPAGE);
        c12420eE.LJ = z;
        subpage.LJJIII();
        c12420eE.LJIIIIZZ = new WeakReference<>(subpage);
        LJII(new C12450eH(c12420eE));
    }

    public static final java.util.Map<String, Object> LJIILJJIL(View view, String btmC, String btmD, java.util.Map<String, String> map, InterfaceC34451Wv interfaceC34451Wv) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(btmC, "btmC");
        o.LJIIIZ(btmD, "btmD");
        C18080nM.LIZ.getClass();
        C18090nN LIZLLL = C18080nM.LIZLLL(view, interfaceC34451Wv);
        if (LIZLLL != null || (LIZLLL = C18080nM.LIZJ) != null) {
            C17980nC c17980nC = new C17980nC(LIZLLL, btmC, btmD, map);
            LIZLLL.LJJIJLIJ = c17980nC;
            String str = c17980nC.LIZ;
            LIZLLL.LJII = str;
            return C113554cx.LJJLIIIIJ(new OSZ("btm", str), new OSZ("btm_pre", c17980nC.LIZIZ), new OSZ("btm_ppre", c17980nC.LIZJ), new OSZ("jump", false), new OSZ("params", c17980nC.LIZLLL));
        }
        return null;
    }
}
