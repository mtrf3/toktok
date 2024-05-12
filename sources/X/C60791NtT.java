package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.NtT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60791NtT extends AbstractC60673NrZ {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public AbstractC60800Ntc LJLJI;
    public AbstractC60811Ntn LJLJJI;
    public InterfaceC60816Nts LJLJJL;
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJLL;
    public final /* synthetic */ SparkContext LJLJL;
    public final /* synthetic */ EnumC39924Flg LJLJLJ;
    public final /* synthetic */ InterfaceC60819Ntv LJLJLLL;
    public final /* synthetic */ String LJLL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJL() {
        AbstractC60800Ntc abstractC60800Ntc = this.LJLJI;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJL();
        }
        AbstractC60811Ntn abstractC60811Ntn = this.LJLJJI;
        if (abstractC60811Ntn == null) {
            return;
        }
        do {
            abstractC60811Ntn.LJJJJL();
            Object next = abstractC60811Ntn.next();
            if (next != null && (next instanceof AbstractC60811Ntn)) {
                abstractC60811Ntn = (AbstractC60811Ntn) next;
            } else {
                return;
            }
        } while (abstractC60811Ntn != null);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        C37682Eqc.LIZIZ(this.LJLJL, "SparkView", "onPreKitCreate");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLJI;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJLL();
        }
        AbstractC60811Ntn abstractC60811Ntn = this.LJLJJI;
        if (abstractC60811Ntn == null) {
            return;
        }
        do {
            abstractC60811Ntn.LJJJJLL();
            abstractC60811Ntn = abstractC60811Ntn.LJLIL;
        } while (abstractC60811Ntn != null);
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        C37682Eqc.LIZIZ(this.LJLJL, "SparkView", "onDestroy");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLJI;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.onDestroy();
        }
        AbstractC60811Ntn abstractC60811Ntn = this.LJLJJI;
        if (abstractC60811Ntn == null) {
            return;
        }
        do {
            abstractC60811Ntn.onDestroy();
            abstractC60811Ntn = abstractC60811Ntn.LJLIL;
        } while (abstractC60811Ntn != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        r0.LJJJJJ(r12);
        r0 = r0.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        r11.LJLJJLL.forceDowngradeWebView = false;
        r11.LJLIL = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        return;
     */
    @Override // X.AbstractC60673NrZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(X.InterfaceC60761Nsz r12) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60791NtT.LJJJJJ(X.Nsz):void");
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        C37682Eqc.LIZIZ(this.LJLJL, "SparkView", "onPostKitCreated");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLJI;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJLI(interfaceC60761Nsz);
        }
        AbstractC60811Ntn abstractC60811Ntn = this.LJLJJI;
        if (abstractC60811Ntn == null) {
            return;
        }
        do {
            abstractC60811Ntn.LJJJJLI(interfaceC60761Nsz);
            abstractC60811Ntn = abstractC60811Ntn.LJLIL;
        } while (abstractC60811Ntn != null);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIJ(kitType, "kitType");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLJI;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJZ(kitType);
        }
        AbstractC60811Ntn abstractC60811Ntn = this.LJLJJI;
        if (abstractC60811Ntn == null) {
            return;
        }
        do {
            abstractC60811Ntn.LJJJJZ(kitType);
            Object next = abstractC60811Ntn.next();
            if (next != null && (next instanceof AbstractC60811Ntn)) {
                abstractC60811Ntn = (AbstractC60811Ntn) next;
            } else {
                return;
            }
        } while (abstractC60811Ntn != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        if ((!kotlin.jvm.internal.o.LJ(android.os.Looper.myLooper(), X.C16880lQ.LLJJJJ())) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        r3.LJLJJLL.post(new Y.ARunnableS46S0100000_10(r3, r5, 13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        r3.LJLJJLL.LJIJJ(r3.LJLJL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006e, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0070, code lost:
    
        r0.LJJJJJL(r4, r5);
        r0 = r0.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0075, code lost:
    
        if (r0 == null) goto L15;
     */
    @Override // X.AbstractC60673NrZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(X.InterfaceC60761Nsz r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIJ(r4, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIJ(r5, r0)
            X.NtS r2 = r3.LJLJJLL
            com.bytedance.hybrid.spark.SparkContext r1 = r3.LJLJL
            java.lang.Class<X.Ntc> r0 = X.AbstractC60800Ntc.class
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.Ntc r0 = (X.AbstractC60800Ntc) r0
            r2.LJLJJLL = r0
            X.NtS r2 = r3.LJLJJLL
            com.bytedance.hybrid.spark.SparkContext r1 = r3.LJLJL
            java.lang.Class<X.Nts> r0 = X.InterfaceC60816Nts.class
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.Nts r0 = (X.InterfaceC60816Nts) r0
            r2.LJLJL = r0
            X.NtS r2 = r3.LJLJJLL
            com.bytedance.hybrid.spark.SparkContext r1 = r3.LJLJL
            java.lang.Class<X.Ntn> r0 = X.AbstractC60811Ntn.class
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.Ntn r0 = (X.AbstractC60811Ntn) r0
            r2.LJLJLJ = r0
            X.NtS r1 = r3.LJLJJLL
            X.Ntc r0 = r1.LJLJJLL
            r3.LJLJI = r0
            X.Ntn r0 = r1.LJLJLJ
            r3.LJLJJI = r0
            X.Nts r0 = r1.LJLJL
            r3.LJLJJL = r0
            X.Ntq r0 = r1.getStatusViewProvider()
            r1.LJLJLLL = r0
            X.NtS r1 = r3.LJLJJLL
            X.Nto r0 = r1.getLoadingProvider()
            r1.LJLL = r0
            super.LJJJJJL(r4, r5)
            java.lang.String r0 = "onLoadStart url:"
            java.lang.String r2 = defpackage.i0.LJFF(r0, r5)
            com.bytedance.hybrid.spark.SparkContext r1 = r3.LJLJL
            java.lang.String r0 = "SparkView"
            X.C37682Eqc.LIZIZ(r1, r0, r2)
            r0 = 0
            r3.LJLIL = r0
            r3.LJLILLLLZI = r0
            X.Ntc r0 = r3.LJLJI
            if (r0 == 0) goto L6c
            r0.LJJJJJL(r4, r5)
        L6c:
            X.Ntn r0 = r3.LJLJJI
            if (r0 == 0) goto L78
        L70:
            r0.LJJJJJL(r4, r5)
            X.Ntn r0 = r0.LJLIL
            if (r0 == 0) goto L78
            goto L70
        L78:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L95
            X.NtS r2 = r3.LJLJJLL
            Y.ARunnableS46S0100000_10 r1 = new Y.ARunnableS46S0100000_10
            r0 = 13
            r1.<init>(r3, r5, r0)
            r2.post(r1)
        L94:
            return
        L95:
            X.NtS r1 = r3.LJLJJLL
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LJLJL
            r1.LJIJJ(r0)
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60791NtT.LJJJJJL(X.Nsz, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0110, code lost:
    
        r0.LJJJJIZL(r9, r10, r11);
        r0 = r0.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0115, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        if ((!kotlin.jvm.internal.o.LJ(android.os.Looper.myLooper(), X.C16880lQ.LLJJJJ())) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
    
        r8.LJLJJLL.post(new Y.ARunnableS46S0100000_10(r8, 14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
    
        r2 = r8.LJLJJLL;
        r2.LJIJ(r8.LJLJL, r2.LJLLLLLL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    @Override // X.AbstractC60673NrZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(X.InterfaceC60761Nsz r9, java.lang.String r10, X.C60704Ns4 r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60791NtT.LJJJJIZL(X.Nsz, java.lang.String, X.Ns4):void");
    }

    public C60791NtT(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, SparkContext sparkContext, EnumC39924Flg enumC39924Flg, InterfaceC60819Ntv interfaceC60819Ntv, String str) {
        this.LJLJJLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLJL = sparkContext;
        this.LJLJLJ = enumC39924Flg;
        this.LJLJLLL = interfaceC60819Ntv;
        this.LJLL = str;
        this.LJLJI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLJJLL;
        this.LJLJJI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLJLJ;
        this.LJLJJL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLJL;
    }
}
