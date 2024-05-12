package X;

import android.app.Activity;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Fvr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40555Fvr implements InterfaceC38394F5a {
    public final C40571Fw7 LIZ;
    public final C40551Fvn LIZIZ;
    public final C37109EhN LIZJ;
    public final C40556Fvs LIZLLL;
    public final Handler LJ = new Handler(C16880lQ.LLJJJJ());

    public C40555Fvr(C40571Fw7 c40571Fw7, C40551Fvn c40551Fvn, C37109EhN c37109EhN, C40556Fvs c40556Fvs) {
        this.LIZ = c40571Fw7;
        this.LIZIZ = c40551Fvn;
        this.LIZJ = c37109EhN;
        this.LIZLLL = c40556Fvs;
    }

    public static List<String> LJFF(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Locale> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toLanguageTag());
        }
        return arrayList;
    }

    @Override // X.InterfaceC38394F5a
    public final java.util.Set<String> LJ() {
        java.util.Set<String> LIZIZ = this.LIZJ.LIZIZ();
        return LIZIZ == null ? Collections.emptySet() : LIZIZ;
    }

    @Override // X.InterfaceC38394F5a
    public final synchronized void LIZ() {
        C37102EhG c37102EhG = C37102EhG.LIZ;
        synchronized (this) {
            this.LIZIZ.LIZLLL(c37102EhG);
        }
    }

    @Override // X.InterfaceC38394F5a
    public final java.util.Set getInstalledModules() {
        if (((Boolean) EPE.LIZIZ.getValue()).booleanValue()) {
            EPE.LIZ();
        }
        return this.LIZJ.LIZ();
    }

    @Override // X.InterfaceC38394F5a
    public final C40561Fvx LIZIZ(int i) {
        C40571Fw7 c40571Fw7 = this.LIZ;
        if (c40571Fw7.LIZIZ == null) {
            return C40571Fw7.LIZ();
        }
        C40571Fw7.LIZJ.LIZJ("cancelInstall(%d)", 4, new Object[]{Integer.valueOf(i)});
        C40579FwF c40579FwF = new C40579FwF(1);
        c40571Fw7.LIZIZ.LIZ(new C40575FwB(c40571Fw7, c40579FwF, i, c40579FwF));
        return (C40561Fvx) c40579FwF.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r3.containsAll(r2) != false) goto L4;
     */
    @Override // X.InterfaceC38394F5a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C40561Fvx LIZJ(X.C38398F5e r12) {
        /*
            r11 = this;
            java.util.List<java.util.Locale> r0 = r12.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.isEmpty()
            java.util.List<java.util.Locale> r1 = r12.LIZIZ
            X.EhN r0 = r11.LIZJ
            java.util.Set r3 = r0.LIZIZ()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L25
        L13:
            java.util.List<java.lang.String> r1 = r12.LIZ
            java.util.Set r0 = r11.getInstalledModules()
            boolean r0 = r0.containsAll(r1)
            if (r0 == 0) goto L88
            java.util.List<java.lang.String> r6 = r12.LIZ
            X.Fvs r3 = r11.LIZLLL
            monitor-enter(r3)
            goto L4b
        L25:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r0 = r0.getLanguage()
            r2.add(r0)
            goto L30
        L44:
            boolean r0 = r3.containsAll(r2)
            if (r0 == 0) goto L88
            goto L13
        L4b:
            android.content.Context r1 = r3.LIZ     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L85
            java.lang.String r0 = "playcore_split_install_internal"
            android.content.SharedPreferences r2 = X.F9J.LIZIZ(r1, r5, r0)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L85
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L85
            java.lang.String r0 = "deferred_uninstall_module_list"
            java.util.Set r0 = r2.getStringSet(r0, r1)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L85
            if (r0 != 0) goto L6b
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L85
            goto L6b
        L66:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
        L6b:
            monitor-exit(r3)
            boolean r0 = java.util.Collections.disjoint(r6, r0)
            if (r0 == 0) goto L88
            android.os.Handler r1 = r11.LJ
            X.Qjf r0 = new X.Qjf
            r0.<init>(r4, r11, r12)
            r1.post(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.Fvx r0 = X.C40560Fvw.LIZ(r0)
            return r0
        L85:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L88:
            X.Fw7 r6 = r11.LIZ
            java.util.List<java.lang.String> r8 = r12.LIZ
            java.util.List<java.util.Locale> r0 = r12.LIZIZ
            java.util.List r9 = LJFF(r0)
            X.Qfl<X.FwC> r0 = r6.LIZIZ
            if (r0 != 0) goto L9b
            X.Fvx r0 = X.C40571Fw7.LIZ()
        L9a:
            return r0
        L9b:
            X.13T r3 = X.C40571Fw7.LIZJ
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r5] = r8
            r2[r4] = r9
            r1 = 4
            java.lang.String r0 = "startInstall(%s,%s)"
            r3.LIZJ(r0, r1, r2)
            X.FwF r7 = new X.FwF
            r7.<init>(r4)
            X.Qfl<X.FwC> r0 = r6.LIZIZ
            X.FwA r5 = new X.FwA
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            r0.LIZ(r5)
            java.lang.Object r0 = r7.LIZ
            X.Fvx r0 = (X.C40561Fvx) r0
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40555Fvr.LIZJ(X.F5e):X.Fvx");
    }

    @Override // X.InterfaceC38394F5a
    public final boolean LIZLLL(AbstractC40550Fvm abstractC40550Fvm, Activity activity, int i) {
        if (abstractC40550Fvm.LJIIJJI() != 8 || abstractC40550Fvm.LJIIIZ() == null) {
            return false;
        }
        activity.startIntentSenderForResult(abstractC40550Fvm.LJIIIZ().getIntentSender(), i, null, 0, 0, 0);
        return true;
    }
}
