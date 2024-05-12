package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS15S0500000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS1S0800000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NkF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60219NkF implements InterfaceC60196Njs, InterfaceC39974FmU {
    public java.util.Map<String, Object> LJLIL;
    public Object LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final java.util.Set<InterfaceC60205Nk1> LJLJJI;
    public final F3T LJLJJL;
    public final InterfaceC60228NkO LJLJJLL;
    public final List<InterfaceC60250Nkk<?, ?, ?, ?>> LJLJL;
    public final java.util.Map<Class<InterfaceC60250Nkk<?, ?, ?, ?>>, InterfaceC60224NkK<?>> LJLJLJ;
    public final InterfaceC60247Nkh LJLJLLL;
    public final java.util.Map<String, InterfaceC60247Nkh> LJLL;
    public final List<C60221NkH> LJLLI;

    public C60219NkF() {
        throw null;
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC60196Njs
    public final List<InterfaceC60250Nkk<?, ?, ?, ?>> m3() {
        return ORZ.LLJI(this.LJLJL);
    }

    @Override // X.InterfaceC60196Njs
    public final F3T LLIIIILZ() {
        return this.LJLJJL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000d. Please report as an issue. */
    public static F0S LIZLLL(android.net.Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            switch (scheme.hashCode()) {
                case -1772600516:
                    if (scheme.equals("lynxview")) {
                        return F0S.LYNX;
                    }
                    break;
                case 3213448:
                    if (scheme.equals("http")) {
                        return F0S.WEB;
                    }
                    break;
                case 99617003:
                    if (scheme.equals("https")) {
                        return F0S.WEB;
                    }
                    break;
                case 828638245:
                    if (scheme.equals("react-native")) {
                        return F0S.RN;
                    }
                    break;
            }
        }
        return F0S.NONE;
    }

    @Override // X.InterfaceC60196Njs
    public final InterfaceC60250Nkk<?, ?, ?, ?> F5(F0S kitType) {
        InterfaceC60250Nkk<?, ?, ?, ?> interfaceC60250Nkk;
        o.LJIIJ(kitType, "kitType");
        Iterator<InterfaceC60250Nkk<?, ?, ?, ?>> it = m3().iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC60250Nkk = it.next();
                if (interfaceC60250Nkk.LLLIZZ() == kitType) {
                    break;
                }
            } else {
                interfaceC60250Nkk = null;
                break;
            }
        }
        return interfaceC60250Nkk;
    }

    @Override // X.InterfaceC60205Nk1
    public final InterfaceC40516FvE a0(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        Iterator<InterfaceC60205Nk1> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            InterfaceC40516FvE a0 = it.next().a0(sessionId);
            if (a0 != null) {
                return a0;
            }
        }
        return null;
    }

    @Override // X.InterfaceC60196Njs
    public final void a4(C60197Njt instancesHolder) {
        o.LJIIJ(instancesHolder, "instancesHolder");
        this.LJLJJI.add(instancesHolder);
    }

    @Override // X.InterfaceC60196Njs
    public final void db(C60197Njt instancesHolder) {
        o.LJIIJ(instancesHolder, "instancesHolder");
        this.LJLJJI.remove(instancesHolder);
    }

    public final C60251Nkl LIZ(InterfaceC60250Nkk interfaceC60250Nkk, List list) {
        InterfaceC60253Nkn interfaceC60253Nkn;
        InterfaceC60262Nkw interfaceC60262Nkw;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        InterfaceC60247Nkh interfaceC60247Nkh = this.LJLJLLL;
        if (interfaceC60247Nkh != null) {
            interfaceC60253Nkn = interfaceC60247Nkh.LIZIZ(interfaceC60250Nkk.getClass());
            interfaceC60262Nkw = interfaceC60247Nkh.LIZ();
            arrayList3.add(interfaceC60247Nkh.LIZJ());
        } else {
            interfaceC60253Nkn = null;
            interfaceC60262Nkw = null;
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList4.add(this.LJLL.get(it.next()));
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            InterfaceC60247Nkh interfaceC60247Nkh2 = (InterfaceC60247Nkh) it2.next();
            if (interfaceC60247Nkh2 != null) {
                InterfaceC60253Nkn LIZIZ = interfaceC60247Nkh2.LIZIZ(interfaceC60250Nkk.getClass());
                if (LIZIZ != null) {
                    arrayList.add(LIZIZ);
                }
                arrayList2.add(interfaceC60247Nkh2.LIZ());
                arrayList3.add(interfaceC60247Nkh2.LIZJ());
            }
        }
        return new C60251Nkl(interfaceC60250Nkk, interfaceC60253Nkn, arrayList, interfaceC60262Nkw, arrayList2, arrayList3);
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    public C60219NkF(F3T f3t, C60218NkE c60218NkE, List list, java.util.Map map, InterfaceC60247Nkh interfaceC60247Nkh, java.util.Map map2, List list2) {
        Object obj;
        String str;
        this.LJLJJL = f3t;
        this.LJLJJLL = null;
        this.LJLJL = list;
        this.LJLJLJ = map;
        this.LJLJLLL = interfaceC60247Nkh;
        this.LJLL = map2;
        this.LJLLI = list2;
        f3t.getClass();
        f3t.LJ(InterfaceC60196Njs.class, new F26(this));
        f3t.LJ(C60218NkE.class, new F26(c60218NkE));
        f3t.LJ(InterfaceC60228NkO.class, new F26(null));
        InterfaceC60387Nmx LIZJ = C60373Nmj.LIZIZ().LIZJ(InterfaceC39975FmV.class, (c60218NkE == null || (str = c60218NkE.LIZ) == null) ? "default_bid" : str);
        if (LIZJ != null) {
            f3t.LJ(InterfaceC39975FmV.class, new F25(LIZJ));
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            InterfaceC60250Nkk interfaceC60250Nkk = (InterfaceC60250Nkk) it.next();
            if (interfaceC60250Nkk != null) {
                try {
                    InterfaceC60224NkK<?> interfaceC60224NkK = this.LJLJLJ.get(interfaceC60250Nkk.getClass());
                    if (interfaceC60224NkK != null) {
                        obj = interfaceC60224NkK.LIZ(this.LJLJJL);
                    } else {
                        obj = null;
                    }
                    interfaceC60250Nkk.LLLL(obj, this.LJLJJL);
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    C39973FmT.LIZIZ(this, C03090Af.LIZJ(LIZ, "RNKit Error: ", th, LIZ), null, null, 6);
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
                break;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            C39973FmT.LIZIZ(this, C03090Af.LIZJ(LIZ2, "RNKit Error: ", th, LIZ2), null, null, 6);
        }
        this.LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 454));
        this.LJLJJI = new LinkedHashSet();
    }

    @Override // X.InterfaceC60196Njs
    public final void F2(C60197Njt instancesHolder, F21 f21, android.net.Uri uri, List packageNames, F3T providerFactory, C60210Nk6 c60210Nk6, AqS141S0200000_10 aqS141S0200000_10) {
        InterfaceC60250Nkk<?, ?, ?, ?> interfaceC60250Nkk;
        InterfaceC60250Nkk<?, ?, ?, ?> interfaceC60250Nkk2;
        o.LJIIJ(instancesHolder, "instancesHolder");
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(providerFactory, "providerFactory");
        if (!this.LJLLI.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C60221NkH c60221NkH : this.LJLLI) {
                AqS114S0300000_10 aqS114S0300000_10 = new AqS114S0300000_10(c60221NkH, this, arrayList, 15);
                Class<? extends C60265Nkz> cls = c60221NkH.LIZIZ;
                String str = c60221NkH.LIZJ;
                Iterator<InterfaceC60250Nkk<?, ?, ?, ?>> it = this.LJLJL.iterator();
                while (true) {
                    interfaceC60250Nkk = null;
                    if (it.hasNext()) {
                        interfaceC60250Nkk2 = it.next();
                        if (o.LJ(interfaceC60250Nkk2.getClass().getName(), str)) {
                            break;
                        }
                    } else {
                        interfaceC60250Nkk2 = null;
                        break;
                    }
                }
                Iterator<InterfaceC60250Nkk<?, ?, ?, ?>> it2 = this.LJLJL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC60250Nkk<?, ?, ?, ?> next = it2.next();
                    if (cls.isInstance(next)) {
                        interfaceC60250Nkk = next;
                        break;
                    }
                }
                if (interfaceC60250Nkk2 == null && interfaceC60250Nkk == null) {
                    aqS114S0300000_10.invoke(-1);
                }
            }
            this.LJLLI.removeAll(arrayList);
        }
        if (this.LJLJL.size() == 0) {
            aqS141S0200000_10.invoke(new IllegalStateException(C43588H8u.LIZ("No kitApi found for uri ", uri)));
        } else {
            LIZJ(instancesHolder, f21, uri, packageNames, providerFactory, c60210Nk6, aqS141S0200000_10);
        }
    }

    public final void LIZJ(InterfaceC60201Njx interfaceC60201Njx, F21 f21, android.net.Uri uri, List<String> list, F3T f3t, InterfaceC88473Ynt<? super InterfaceC40516FvE, ? super android.net.Uri, ? super Boolean, C76800UCe> interfaceC88473Ynt, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        boolean z;
        String queryParameter;
        F0S LIZLLL = LIZLLL(uri);
        if (LIZLLL == F0S.NONE) {
            interfaceC88472Yns.invoke(new IllegalStateException(C43588H8u.LIZ("No kitApi matches the uri ", uri)));
            return;
        }
        InterfaceC60250Nkk<?, ?, ?, ?> F5 = F5(LIZLLL);
        if (F5 == null || (F5 instanceof C60265Nkz)) {
            if (F0U.LIZ[LIZLLL.ordinal()] != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("KitType ");
                LIZ.append(LIZLLL);
                LIZ.append(" is disable for the uri ");
                LIZ.append(uri);
                LIZIZ(new Throwable(X1D.LIZIZ(LIZ)), uri, f3t, interfaceC60201Njx, f21, list, interfaceC88473Ynt, interfaceC88472Yns);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("KitType ");
            LIZ2.append(LIZLLL);
            LIZ2.append(" not found for the uri ");
            LIZ2.append(uri);
            interfaceC88472Yns.invoke(new IllegalStateException(X1D.LIZIZ(LIZ2)));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Found KitType(");
        LIZ3.append(LIZLLL);
        LIZ3.append(") and KitApi(");
        LIZ3.append(F5);
        LIZ3.append(") for the uri ");
        LIZ3.append(uri);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ3), null, null, 6);
        f3t.LIZIZ(this.LJLJJL);
        C60222NkI c60222NkI = new C60222NkI(uri, f3t);
        AqS1S0800000_10 aqS1S0800000_10 = new AqS1S0800000_10(this, uri, f3t, interfaceC60201Njx, f21, list, interfaceC88473Ynt, interfaceC88472Yns, 0);
        AqS1S0800000_10 aqS1S0800000_102 = new AqS1S0800000_10(this, uri, f3t, interfaceC60201Njx, f21, list, interfaceC88473Ynt, interfaceC88472Yns, 1);
        InterfaceC40516FvE Lk = interfaceC60201Njx.Lk(F5.getClass());
        if (F5.LLLLIILL() || Lk == null || !Lk.S1() || Lk.S1()) {
            z = true;
        } else {
            z = false;
        }
        C39973FmT.LIZIZ(this, Q7L.LIZJ("create new instance api, isNewInstance: ", z), null, null, 6);
        if (z) {
            Lk = F5.LLLJL(f21, list, LIZ(F5, list), c60222NkI.LJLILLLLZI);
        }
        if (Lk != null) {
            if (Lk instanceof InterfaceC60323Nlv) {
                InterfaceC60323Nlv interfaceC60323Nlv = (InterfaceC60323Nlv) Lk;
                android.net.Uri uri2 = c60222NkI.LJLIL;
                if (uri2.isHierarchical() && (queryParameter = UriProtector.getQueryParameter(uri2, "prefix")) != null && (!TextUtils.isEmpty(queryParameter))) {
                    interfaceC60323Nlv.Zf().LLLIILIL(C60226NkM.class, new C60226NkM(queryParameter));
                }
            }
            if (z) {
                interfaceC60201Njx.release();
                interfaceC60201Njx.R1(F5.getClass(), Lk);
                F5.LLLLII(Lk);
                Lk.B9();
            } else {
                Lk.getProviderFactory().LIZIZ(c60222NkI.LJLILLLLZI);
                if (Lk instanceof AbstractC60240Nka) {
                    ((ArrayList) ((AbstractC60240Nka) Lk).LJLLLL).clear();
                }
                if (!o.LJ(Lk.v1(), list)) {
                    Lk.kf(list, LIZ(F5, list));
                }
            }
            Lk.Ua(c60222NkI.LJLIL, new C60220NkG(Lk, c60222NkI, z, interfaceC60201Njx, F5, list, aqS1S0800000_10, aqS1S0800000_102), new AqS15S0500000_10(Lk, interfaceC60201Njx, F5, list, aqS1S0800000_10, aqS1S0800000_102, 1));
        }
    }

    public final void LIZIZ(Throwable th, android.net.Uri uri, F3T f3t, InterfaceC60201Njx interfaceC60201Njx, F21 f21, List<String> list, InterfaceC88473Ynt<? super InterfaceC40516FvE, ? super android.net.Uri, ? super Boolean, C76800UCe> interfaceC88473Ynt, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        F0S prevKitType;
        C60203Njz c60203Njz = (C60203Njz) f3t.LIZJ(C60203Njz.class);
        if (c60203Njz != null) {
            c60203Njz.LJII = th.getMessage();
        }
        if (LIZLLL(uri) != F0S.WEB && 1 != 0) {
            C59474NVu c59474NVu = new C59474NVu();
            c59474NVu.LIZJ(android.net.Uri.class, uri, null);
            android.net.Uri uri2 = (android.net.Uri) c59474NVu.LIZJ.getValue();
            if (uri2 != null) {
                InterfaceC40516FvE interfaceC40516FvE = (InterfaceC40516FvE) f3t.LIZJ(InterfaceC40516FvE.class);
                if (interfaceC40516FvE == null || (prevKitType = interfaceC40516FvE.LLLIZZ()) == null) {
                    prevKitType = F0S.NONE;
                }
                Uri.Builder buildUpon = uri2.buildUpon();
                o.LJFF(buildUpon, "it.buildUpon()");
                C39437Fdp c39437Fdp = new C39437Fdp(buildUpon);
                android.net.Uri build = uri.buildUpon().clearQuery().build();
                o.LJFF(build, "uri.buildUpon().clearQuery().build()");
                c39437Fdp.LIZIZ.LIZJ.LIZLLL(build);
                o.LJIIJ(prevKitType, "prevKitType");
                c39437Fdp.LIZIZ.LIZLLL.LIZLLL(prevKitType.name());
                android.net.Uri build2 = c39437Fdp.LIZ().build();
                if (build2 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Fallback now, from ");
                    LIZ.append(uri);
                    LIZ.append(" to ");
                    LIZ.append(build2);
                    C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
                    String th2 = th.toString();
                    C60203Njz c60203Njz2 = (C60203Njz) f3t.LIZJ(C60203Njz.class);
                    if (c60203Njz2 != null) {
                        C60225NkL c60225NkL = new C60225NkL();
                        c60225NkL.LIZ = uri;
                        c60225NkL.LIZIZ = th2;
                        c60203Njz2.LIZJ = c60225NkL;
                    }
                    f3t.LIZJ(AbstractC60208Nk4.class);
                    LIZJ(interfaceC60201Njx, f21, build2, list, f3t, interfaceC88473Ynt, interfaceC88472Yns);
                    return;
                }
            }
        }
        interfaceC88472Yns.invoke(th);
    }
}
