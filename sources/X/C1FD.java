package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* renamed from: X.1FD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FD extends AbstractC04850Gz {
    public volatile int LIZ;
    public final String LIZIZ;
    public final Handler LIZJ;
    public volatile C0D1 LIZLLL;
    public Context LJ;
    public volatile InterfaceC40594FwU LJFF;
    public volatile C0HA LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public ExecutorService LJJ;

    public final boolean LJ() {
        return (this.LIZ != 2 || this.LJFF == null || this.LJI == null) ? false : true;
    }

    public final C0HE LJIIJ() {
        if (this.LIZ == 0 || this.LIZ == 3) {
            return C0HD.LJIIJJI;
        }
        return C0HD.LJIIIZ;
    }

    public final Handler LJIIIIZZ() {
        if (Looper.myLooper() == null) {
            return this.LIZJ;
        }
        return new Handler(Looper.myLooper());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0066, code lost:
    
        if (r2.equals("eee") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        if (r1.LJIIZILJ == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        return X.C0HD.LJIIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return X.C0HD.LJIIZILJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0081, code lost:
    
        if (r2.equals("ccc") != false) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0HE LIZLLL(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = r1.LJ()
            if (r0 != 0) goto L9
            X.0HE r0 = X.C0HD.LJIIJJI
            return r0
        L9:
            int r0 = r2.hashCode()
            switch(r0) {
                case -422092961: goto Lb1;
                case 96321: goto L9f;
                case 97314: goto L8d;
                case 98307: goto L7b;
                case 99300: goto L69;
                case 100293: goto L60;
                case 101286: goto L4e;
                case 102279: goto L3c;
                case 207616302: goto L2a;
                case 1987365622: goto L18;
                default: goto L10;
            }
        L10:
            java.lang.String r0 = "Unsupported feature: "
            r0.concat(r2)
            X.0HE r0 = X.C0HD.LJIJJLI
            return r0
        L18:
            java.lang.String r0 = "subscriptions"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJII
            if (r0 == 0) goto L27
            X.0HE r0 = X.C0HD.LJIIJ
        L26:
            return r0
        L27:
            X.0HE r0 = X.C0HD.LJIILIIL
            goto L26
        L2a:
            java.lang.String r0 = "priceChangeConfirmation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJIIJJI
            if (r0 == 0) goto L39
            X.0HE r0 = X.C0HD.LJIIJ
        L38:
            return r0
        L39:
            X.0HE r0 = X.C0HD.LJIILL
            goto L38
        L3c:
            java.lang.String r0 = "ggg"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJIJI
            if (r0 == 0) goto L4b
            X.0HE r0 = X.C0HD.LJIIJ
        L4a:
            return r0
        L4b:
            X.0HE r0 = X.C0HD.LJIL
            goto L4a
        L4e:
            java.lang.String r0 = "fff"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJIJ
            if (r0 == 0) goto L5d
            X.0HE r0 = X.C0HD.LJIIJ
        L5c:
            return r0
        L5d:
            X.0HE r0 = X.C0HD.LJIJI
            goto L5c
        L60:
            java.lang.String r0 = "eee"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            goto L83
        L69:
            java.lang.String r0 = "ddd"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJIILL
            if (r0 == 0) goto L78
            X.0HE r0 = X.C0HD.LJIIJ
        L77:
            return r0
        L78:
            X.0HE r0 = X.C0HD.LJIJ
            goto L77
        L7b:
            java.lang.String r0 = "ccc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
        L83:
            boolean r0 = r1.LJIIZILJ
            if (r0 == 0) goto L8a
            X.0HE r0 = X.C0HD.LJIIJ
        L89:
            return r0
        L8a:
            X.0HE r0 = X.C0HD.LJIIZILJ
            goto L89
        L8d:
            java.lang.String r0 = "bbb"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJIILJJIL
            if (r0 == 0) goto L9c
            X.0HE r0 = X.C0HD.LJIIJ
        L9b:
            return r0
        L9c:
            X.0HE r0 = X.C0HD.LJIJJ
            goto L9b
        L9f:
            java.lang.String r0 = "aaa"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJIILLIIL
            if (r0 == 0) goto Lae
            X.0HE r0 = X.C0HD.LJIIJ
        Lad:
            return r0
        Lae:
            X.0HE r0 = X.C0HD.LJIILLIIL
            goto Lad
        Lb1:
            java.lang.String r0 = "subscriptionsUpdate"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            boolean r0 = r1.LJIIIIZZ
            if (r0 == 0) goto Lc0
            X.0HE r0 = X.C0HD.LJIIJ
        Lbf:
            return r0
        Lc0:
            X.0HE r0 = X.C0HD.LJIILJJIL
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1FD.LIZLLL(java.lang.String):X.0HE");
    }

    public final void LJII(C0H4 c0h4) {
        ServiceInfo serviceInfo;
        if (LJ()) {
            C36864EdQ.LJFF("BillingClient", "Service connection is valid. No need to re-initialize.");
            c0h4.onBillingSetupFinished(C0HD.LJIIJ);
            return;
        }
        if (this.LIZ == 1) {
            c0h4.onBillingSetupFinished(C0HD.LIZLLL);
            return;
        }
        if (this.LIZ == 3) {
            c0h4.onBillingSetupFinished(C0HD.LJIIJJI);
            return;
        }
        this.LIZ = 1;
        C0D1 c0d1 = this.LIZLLL;
        c0d1.getClass();
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        C0HP c0hp = (C0HP) c0d1.LIZIZ;
        Context context = (Context) c0d1.LIZ;
        if (!c0hp.LIZIZ) {
            C16880lQ.LJJLIIIJILLIZJL((BroadcastReceiver) c0hp.LIZJ.LIZIZ, context, intentFilter);
            c0hp.LIZIZ = true;
        }
        C36864EdQ.LJFF("BillingClient", "Starting in-app billing setup.");
        this.LJI = new C0HA(this, c0h4);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = this.LJ.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = ((ResolveInfo) ListProtector.get(queryIntentServices, 0)).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null) {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.LIZIZ);
                if (C16880lQ.LLLJL(this.LJ, intent2, this.LJI, 1)) {
                    C36864EdQ.LJFF("BillingClient", "Service was bonded successfully.");
                    return;
                }
            }
        }
        this.LIZ = 0;
        C36864EdQ.LJFF("BillingClient", "Billing service unavailable on device.");
        c0h4.onBillingSetupFinished(C0HD.LIZJ);
    }

    public final void LJIIIZ(final C0HE c0he) {
        if (Thread.interrupted()) {
            return;
        }
        this.LIZJ.post(new Runnable() { // from class: X.0Gv
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C1FD c1fd = C1FD.this;
                    C0HE c0he2 = c0he;
                    if (((C0HP) c1fd.LIZLLL.LIZIZ).LIZ != null) {
                        ((C0HP) c1fd.LIZLLL.LIZIZ).LIZ.onPurchasesUpdated(c0he2, null);
                    } else {
                        ((C0HP) c1fd.LIZLLL.LIZIZ).getClass();
                    }
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public C1FD(boolean z, Context context) {
        String str;
        this.LIZJ = new Handler(C16880lQ.LLJJJJ());
        this.LJIIIZ = 0;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "5.2.0-alternate-eap";
        }
        this.LIZIZ = str;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJ = LLLLL;
        this.LIZLLL = new C0D1(LLLLL);
        this.LJIJJ = z;
    }

    @Override // X.AbstractC04850Gz
    public final void LIZ(C04920Hg c04920Hg, final InterfaceC04930Hh interfaceC04930Hh) {
        if (!LJ()) {
            interfaceC04930Hh.onSkuDetailsResponse(C0HD.LJIIJJI, null);
            return;
        }
        final String str = c04920Hg.LIZ;
        List<String> list = c04920Hg.LIZIZ;
        List list2 = c04920Hg.LIZJ;
        if (TextUtils.isEmpty(str)) {
            interfaceC04930Hh.onSkuDetailsResponse(C0HD.LJFF, null);
            return;
        }
        if (this.LJIILL || list2 == null) {
            if (list != null || list2 != null) {
                final ArrayList arrayList = new ArrayList();
                if (list2 != null) {
                    arrayList.addAll(list2);
                } else {
                    for (String str2 : list) {
                        C04940Hi c04940Hi = new C04940Hi();
                        c04940Hi.LIZ = str2;
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList.add(new C04950Hj(c04940Hi.LIZ));
                        } else {
                            throw new IllegalArgumentException("SKU must be set.");
                        }
                    }
                }
                if (LJIIJJI(new Callable() { // from class: X.0HR
                    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
                    
                        if (r1 != 0) goto L39;
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 235
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0HR.call():java.lang.Object");
                    }
                }, 30000L, new Runnable() { // from class: X.0Hk
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            InterfaceC04930Hh.this.onSkuDetailsResponse(C0HD.LJIIL, null);
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, LJIIIIZZ()) == null) {
                    interfaceC04930Hh.onSkuDetailsResponse(LJIIJ(), null);
                    return;
                }
                return;
            }
            interfaceC04930Hh.onSkuDetailsResponse(C0HD.LJ, null);
            return;
        }
        interfaceC04930Hh.onSkuDetailsResponse(C0HD.LJIJ, null);
    }

    public final void LIZIZ(final C04800Gu c04800Gu, final InterfaceC04820Gw interfaceC04820Gw) {
        if (!LJ()) {
            interfaceC04820Gw.LIZJ(C0HD.LJIIJJI);
            return;
        }
        if (TextUtils.isEmpty(c04800Gu.LIZ)) {
            interfaceC04820Gw.LIZJ(C0HD.LJIIIIZZ);
        } else if (!this.LJIIL) {
            interfaceC04820Gw.LIZJ(C0HD.LIZIZ);
        } else if (LJIIJJI(new Callable() { // from class: X.0Hl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1FD c1fd = C1FD.this;
                C04800Gu c04800Gu2 = c04800Gu;
                InterfaceC04820Gw interfaceC04820Gw2 = interfaceC04820Gw;
                c1fd.getClass();
                try {
                    InterfaceC40594FwU interfaceC40594FwU = c1fd.LJFF;
                    String packageName = c1fd.LJ.getPackageName();
                    String str = c04800Gu2.LIZ;
                    String str2 = c1fd.LIZIZ;
                    Bundle bundle = new Bundle();
                    bundle.putString("playBillingLibraryVersion", str2);
                    Bundle u = interfaceC40594FwU.u(packageName, str, bundle);
                    int LIZ = C36864EdQ.LIZ(u, "BillingClient");
                    String LJ = C36864EdQ.LJ(u, "BillingClient");
                    C0HC c0hc = new C0HC();
                    c0hc.LIZ = LIZ;
                    c0hc.LIZIZ = LJ;
                    interfaceC04820Gw2.LIZJ(c0hc.LIZ());
                    return null;
                } catch (Exception unused) {
                    interfaceC04820Gw2.LIZJ(C0HD.LJIIJJI);
                    return null;
                }
            }
        }, 30000L, new RunnableC04980Hm(interfaceC04820Gw), LJIIIIZZ()) == null) {
            interfaceC04820Gw.LIZJ(LJIIJ());
        }
    }

    public final void LIZJ(final C0HH c0hh, final C0HJ c0hj) {
        if (!LJ()) {
            c0hj.LIZ(C0HD.LJIIJJI, c0hh.LIZ);
        } else if (LJIIJJI(new Callable() { // from class: X.0Ha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int LJJIIZ;
                String str;
                C1FD c1fd = C1FD.this;
                C0HH c0hh2 = c0hh;
                C0HJ c0hj2 = c0hj;
                c1fd.getClass();
                String str2 = c0hh2.LIZ;
                try {
                    C36864EdQ.LJFF("BillingClient", "Consuming purchase with token: " + str2);
                    if (c1fd.LJIIL) {
                        InterfaceC40594FwU interfaceC40594FwU = c1fd.LJFF;
                        String packageName = c1fd.LJ.getPackageName();
                        boolean z = c1fd.LJIIL;
                        String str3 = c1fd.LIZIZ;
                        Bundle bundle = new Bundle();
                        if (z) {
                            bundle.putString("playBillingLibraryVersion", str3);
                        }
                        Bundle M = interfaceC40594FwU.M(packageName, str2, bundle);
                        LJJIIZ = M.getInt("RESPONSE_CODE");
                        str = C36864EdQ.LJ(M, "BillingClient");
                    } else {
                        LJJIIZ = c1fd.LJFF.LJJIIZ(c1fd.LJ.getPackageName(), str2);
                        str = "";
                    }
                    C0HC c0hc = new C0HC();
                    c0hc.LIZ = LJJIIZ;
                    c0hc.LIZIZ = str;
                    C0HE LIZ = c0hc.LIZ();
                    if (LJJIIZ == 0) {
                        C36864EdQ.LJFF("BillingClient", "Successfully consumed purchase.");
                        c0hj2.LIZ(LIZ, str2);
                        return null;
                    }
                    c0hj2.LIZ(LIZ, str2);
                    return null;
                } catch (Exception unused) {
                    c0hj2.LIZ(C0HD.LJIIJJI, str2);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: X.0Hd
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    c0hj.LIZ(C0HD.LJIIL, c0hh.LIZ);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, LJIIIIZZ()) == null) {
            c0hj.LIZ(LJIIJ(), c0hh.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0HE LJFF(android.app.Activity r35, final X.C0HB r36) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1FD.LJFF(android.app.Activity, X.0HB):X.0HE");
    }

    public final void LJI(final C04870Hb c04870Hb, final C0HS c0hs) {
        if (!LJ()) {
            c0hs.LIZ(C0HD.LJIIJJI, new ArrayList());
        } else if (!this.LJIJ) {
            c0hs.LIZ(C0HD.LJIJI, new ArrayList());
        } else if (LJIIJJI(new Callable() { // from class: X.0HT
            /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
            
                if (r5 != 0) goto L20;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r16 = this;
                    r0 = r16
                    X.1FD r8 = X.C1FD.this
                    X.0Hb r1 = r2
                    X.0HS r7 = r3
                    r8.getClass()
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    X.Pry r0 = r1.LIZ
                    r5 = 0
                    java.lang.Object r0 = r0.get(r5)
                    X.0HZ r0 = (X.C0HZ) r0
                    java.lang.String r13 = r0.LIZIZ
                    X.Pry r4 = r1.LIZ
                    int r3 = r4.size()
                    r1 = 0
                L22:
                    if (r1 >= r3) goto L76
                    int r2 = r1 + 20
                    if (r2 <= r3) goto L74
                    r0 = r3
                L29:
                    java.util.ArrayList r9 = new java.util.ArrayList
                    java.util.List r0 = r4.subList(r1, r0)
                    r9.<init>(r0)
                    java.util.ArrayList r11 = new java.util.ArrayList
                    r11.<init>()
                    int r10 = r9.size()
                    r1 = 0
                L3c:
                    if (r1 >= r10) goto L4c
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r1)
                    X.0HZ r0 = (X.C0HZ) r0
                    java.lang.String r0 = r0.LIZ
                    r11.add(r0)
                    int r1 = r1 + 1
                    goto L3c
                L4c:
                    android.os.Bundle r14 = new android.os.Bundle
                    r14.<init>()
                    java.lang.String r0 = "ITEM_ID_LIST"
                    r14.putStringArrayList(r0, r11)
                    java.lang.String r1 = r8.LIZIZ
                    java.lang.String r0 = "playBillingLibraryVersion"
                    r14.putString(r0, r1)
                    X.FwU r10 = r8.LJFF     // Catch: java.lang.Exception -> Ld1
                    android.content.Context r0 = r8.LJ     // Catch: java.lang.Exception -> Ld1
                    java.lang.String r12 = r0.getPackageName()     // Catch: java.lang.Exception -> Ld1
                    java.lang.String r0 = r8.LIZIZ     // Catch: java.lang.Exception -> Ld1
                    android.os.Bundle r15 = X.C36864EdQ.LIZJ(r0, r9)     // Catch: java.lang.Exception -> Ld1
                    r11 = 17
                    android.os.Bundle r9 = r10.LLLLJI(r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> Ld1
                    if (r9 != 0) goto L79
                    goto La5
                L74:
                    r0 = r2
                    goto L29
                L76:
                    java.lang.String r1 = ""
                    goto L8d
                L79:
                    java.lang.String r1 = "DETAILS_LIST"
                    boolean r0 = r9.containsKey(r1)
                    java.lang.String r12 = "BillingClient"
                    if (r0 != 0) goto L9f
                    int r5 = X.C36864EdQ.LIZ(r9, r12)
                    java.lang.String r1 = X.C36864EdQ.LJ(r9, r12)
                    if (r5 == 0) goto Ld3
                L8d:
                    X.0HC r0 = new X.0HC
                    r0.<init>()
                    r0.LIZ = r5
                    r0.LIZIZ = r1
                    X.0HE r0 = r0.LIZ()
                    r7.LIZ(r0, r6)
                    r0 = 0
                    return r0
                L9f:
                    java.util.ArrayList r11 = r9.getStringArrayList(r1)
                    if (r11 != 0) goto La9
                La5:
                    java.lang.String r1 = "Item is unavailable for purchase."
                    r5 = 4
                    goto L8d
                La9:
                    r10 = 0
                Laa:
                    int r0 = r11.size()
                    if (r10 >= r0) goto Ld5
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r11, r10)
                    java.lang.String r0 = (java.lang.String) r0
                    X.0HQ r9 = new X.0HQ     // Catch: org.json.JSONException -> Lce
                    r9.<init>(r0)     // Catch: org.json.JSONException -> Lce
                    java.lang.String r1 = r9.toString()
                    java.lang.String r0 = "Got product details: "
                    java.lang.String r0 = r0.concat(r1)
                    X.C36864EdQ.LJFF(r12, r0)
                    r6.add(r9)
                    int r10 = r10 + 1
                    goto Laa
                Lce:
                    java.lang.String r1 = "Error trying to decode SkuDetails."
                    goto Ld3
                Ld1:
                    java.lang.String r1 = "An internal error occurred."
                Ld3:
                    r5 = 6
                    goto L8d
                Ld5:
                    r1 = r2
                    goto L22
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0HT.call():java.lang.Object");
            }
        }, 30000L, new C0HV(c0hs), LJIIIIZZ()) == null) {
            c0hs.LIZ(LJIIJ(), new ArrayList());
        }
    }

    public final void LJIIL(final String str, final C0HU c0hu) {
        if (!LJ()) {
            c0hu.LIZIZ(C0HD.LJIIJJI, AbstractC65794Pry.zzl());
        } else if (TextUtils.isEmpty(str)) {
            c0hu.LIZIZ(C0HD.LJI, AbstractC65794Pry.zzl());
        } else if (LJIIJJI(new Callable() { // from class: X.0Gy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C0HK c0hk;
                Bundle LLZZLLIL;
                C1FD c1fd = C1FD.this;
                String str2 = str;
                C36864EdQ.LJFF("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str2)));
                ArrayList arrayList = new ArrayList();
                boolean z = c1fd.LJIIL;
                boolean z2 = c1fd.LJIJJ;
                boolean z3 = c1fd.LJIJJLI;
                Bundle LIZ = C0H1.LIZ("playBillingLibraryVersion", c1fd.LIZIZ);
                int i = 1;
                if (z) {
                    if (z2) {
                        LIZ.putBoolean("enablePendingPurchases", true);
                    }
                    if (z3) {
                        LIZ.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                }
                String str3 = null;
                while (true) {
                    try {
                        if (c1fd.LJIIL) {
                            LLZZLLIL = c1fd.LJFF.k0(LIZ, c1fd.LJ.getPackageName(), str2, str3);
                        } else {
                            LLZZLLIL = c1fd.LJFF.LLZZLLIL(c1fd.LJ.getPackageName(), str2, str3);
                        }
                        C0HE c0he = C0HD.LJIIIZ;
                        if (LLZZLLIL == null) {
                            Object[] objArr = new Object[i];
                            objArr[0] = "getPurchase()";
                            C16880lQ.LLLZ("%s got null owned items list", objArr);
                        } else {
                            int LIZ2 = C36864EdQ.LIZ(LLZZLLIL, "BillingClient");
                            String LJ = C36864EdQ.LJ(LLZZLLIL, "BillingClient");
                            C0HC c0hc = new C0HC();
                            c0hc.LIZ = LIZ2;
                            c0hc.LIZIZ = LJ;
                            C0HE LIZ3 = c0hc.LIZ();
                            if (LIZ2 != 0) {
                                C16880lQ.LLLZ("%s failed. Response code: %s", new Object[]{"getPurchase()", Integer.valueOf(LIZ2)});
                                c0he = LIZ3;
                            } else if (!LLZZLLIL.containsKey("INAPP_PURCHASE_ITEM_LIST") || !LLZZLLIL.containsKey("INAPP_PURCHASE_DATA_LIST") || !LLZZLLIL.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                C16880lQ.LLLZ("Bundle returned from %s doesn't contain required fields.", new Object[]{"getPurchase()"});
                            } else {
                                ArrayList<String> stringArrayList = LLZZLLIL.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList2 = LLZZLLIL.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList3 = LLZZLLIL.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                if (stringArrayList == null) {
                                    C16880lQ.LLLZ("Bundle returned from %s contains null SKUs list.", new Object[]{"getPurchase()"});
                                } else if (stringArrayList2 == null) {
                                    C16880lQ.LLLZ("Bundle returned from %s contains null purchases list.", new Object[]{"getPurchase()"});
                                } else if (stringArrayList3 == null) {
                                    C16880lQ.LLLZ("Bundle returned from %s contains null signatures list.", new Object[]{"getPurchase()"});
                                } else {
                                    c0he = C0HD.LJIIJ;
                                }
                            }
                        }
                        if (c0he != C0HD.LJIIJ) {
                            c0hk = new C0HK(c0he, (List) null);
                            break;
                        }
                        ArrayList<String> stringArrayList4 = LLZZLLIL.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList5 = LLZZLLIL.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList6 = LLZZLLIL.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        for (int i2 = 0; i2 < stringArrayList5.size(); i2++) {
                            String str4 = (String) ListProtector.get(stringArrayList5, i2);
                            String str5 = (String) ListProtector.get(stringArrayList6, i2);
                            C36864EdQ.LJFF("BillingClient", "Sku is owned: ".concat(String.valueOf(ListProtector.get(stringArrayList4, i2))));
                            try {
                                Purchase purchase = new Purchase(str4, str5);
                                TextUtils.isEmpty(purchase.LIZLLL());
                                arrayList.add(purchase);
                            } catch (JSONException unused) {
                                c0hk = new C0HK(C0HD.LJIIIZ, (List) null);
                            }
                        }
                        str3 = LLZZLLIL.getString("INAPP_CONTINUATION_TOKEN");
                        C36864EdQ.LJFF("BillingClient", "Continuation token: ".concat(String.valueOf(str3)));
                        if (TextUtils.isEmpty(str3)) {
                            c0hk = new C0HK(C0HD.LJIIJ, arrayList);
                            break;
                        }
                        i = 1;
                    } catch (Exception unused2) {
                        c0hk = new C0HK(C0HD.LJIIJJI, (List) null);
                    }
                }
                List<Purchase> list = (List) c0hk.LIZ;
                if (list != null) {
                    c0hu.LIZIZ((C0HE) c0hk.LIZIZ, list);
                    return null;
                }
                c0hu.LIZIZ((C0HE) c0hk.LIZIZ, AbstractC65794Pry.zzl());
                return null;
            }
        }, 30000L, new Runnable() { // from class: X.0Gr
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C0HU.this.LIZIZ(C0HD.LJIIL, AbstractC65794Pry.zzl());
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, LJIIIIZZ()) == null) {
            c0hu.LIZIZ(LJIIJ(), AbstractC65794Pry.zzl());
        }
    }

    public C1FD(boolean z, Context context, C0HW c0hw) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "5.2.0-alternate-eap";
        }
        this.LIZJ = new Handler(C16880lQ.LLJJJJ());
        this.LJIIIZ = 0;
        this.LIZIZ = str;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJ = LLLLL;
        this.LIZLLL = new C0D1(LLLLL, c0hw);
        this.LJIJJ = z;
        this.LJIJJLI = false;
        this.LJIL = false;
    }

    public final Future LJIIJJI(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.LJJ == null) {
            this.LJJ = C16880lQ.LLLLZI(C36864EdQ.LIZ, new ThreadFactory() { // from class: X.0H0
                public final ThreadFactory LJLIL = Executors.defaultThreadFactory();
                public final AtomicInteger LJLILLLLZI = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable2) {
                    Thread newThread = this.LJLIL.newThread(runnable2);
                    int andIncrement = this.LJLILLLLZI.getAndIncrement();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PlayBillingLibrary-");
                    LIZ.append(andIncrement);
                    newThread.setName(X1D.LIZIZ(LIZ));
                    return newThread;
                }
            });
        }
        try {
            final Future submit = this.LJJ.submit(callable);
            handler.postDelayed(new Runnable() { // from class: X.0Gt
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        Future future = submit;
                        Runnable runnable2 = runnable;
                        if (!future.isDone() && !future.isCancelled()) {
                            future.cancel(true);
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception unused) {
            return null;
        }
    }
}
