package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS15S0500000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS52S0400000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Nka, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60240Nka implements InterfaceC40516FvE, InterfaceC60323Nlv {
    public final List<String> LJLIL;
    public android.net.Uri LJLILLLLZI;
    public InterfaceC60246Nkg LJLJI;
    public InterfaceC60282NlG LJLJJI;
    public InterfaceC60281NlF LJLJJL;
    public FCR LJLJJLL;
    public final List<InterfaceC60282NlG> LJLJL;
    public final List<InterfaceC60281NlF> LJLJLJ;
    public final List<FCR> LJLJLLL;
    public C38934FPu LJLL;
    public AbstractC59475NVv LJLLI;
    public final List<AbstractC59475NVv> LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final List<InterfaceC88472Yns<Throwable, C76800UCe>> LJLLLL;
    public C60549NpZ LJLLLLLL;
    public final List<C39435Fdn> LJLZ;
    public final C5H3 LJZ;
    public final C62822Ol8 LJZI;
    public final C5H3 LJZL;
    public final InterfaceC60250Nkk<?, ?, ?, ?> LL;
    public final F21 LLD;
    public final F3T LLF;

    @Override // X.InterfaceC40516FvE
    public final void B9() {
        this.LJLLL = true;
        LJIILJJIL(this.LJLIL, this.LJLJI);
        LJIIIZ();
        Iterator<FCR> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZLLL(this);
            } catch (FCQ unused) {
            }
        }
        FCR fcr = this.LJLJJLL;
        if (fcr != null) {
            try {
                fcr.LIZLLL(this);
            } catch (FCQ unused2) {
            }
        }
    }

    public abstract void LJFF(android.net.Uri uri, InterfaceC88472Yns interfaceC88472Yns);

    public abstract void LJII();

    public abstract void LJIIIIZZ(android.net.Uri uri, AqS137S0200000_6 aqS137S0200000_6, InterfaceC88472Yns interfaceC88472Yns);

    public abstract void LJIIIZ();

    public abstract void LJIIJ(List list, C60251Nkl c60251Nkl);

    public void LJIIJJI() {
    }

    public abstract void LJIIL(boolean z, android.net.Uri uri);

    @Override // X.InterfaceC40516FvE
    public void LLJILJIL() {
    }

    @Override // X.InterfaceC60323Nlv
    public final InterfaceC60302Nla Zf() {
        return (InterfaceC60302Nla) this.LJZ.getValue();
    }

    @Override // X.InterfaceC40516FvE
    public void g() {
    }

    @Override // X.InterfaceC60323Nlv
    public final String getBid() {
        return (String) this.LJZI.getValue();
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJZL.getValue();
    }

    @Override // X.InterfaceC40516FvE
    public abstract /* synthetic */ void onEvent(F22 f22);

    @Override // X.InterfaceC40516FvE
    public final F0S LLLIZZ() {
        return this.LL.LLLIZZ();
    }

    @Override // X.InterfaceC40516FvE
    public final F21 LLLLLLJ() {
        return this.LLD;
    }

    @Override // X.InterfaceC40516FvE
    public final boolean S1() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC40516FvE
    public final F3T getProviderFactory() {
        return this.LLF;
    }

    @Override // X.InterfaceC40516FvE
    public final AbstractC59475NVv h6() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC40516FvE
    public final android.net.Uri te() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC40516FvE
    public final List<String> v1() {
        return this.LJLIL;
    }

    public final void LJI(InterfaceC60262Nkw factory) {
        o.LJIIJ(factory, "factory");
        List list = (List) factory.LIZJ().invoke(this.LLF);
        AqS176S0100000_10 LIZ = factory.LIZ();
        F3T f3t = this.LLF;
        try {
            factory.LIZIZ().invoke(this.LLF);
        } catch (FCQ unused) {
        }
        C38934FPu c38934FPu = new C38934FPu(list, LIZ, f3t, null);
        C38934FPu c38934FPu2 = this.LJLL;
        if (c38934FPu2 == null) {
            this.LJLL = c38934FPu;
        } else {
            c38934FPu2.LIZLLL(c38934FPu);
        }
    }

    @Override // X.InterfaceC60323Nlv
    public final <T> T LLLIIL(Class<T> cls) {
        return (T) Zf().LLLIIL(cls);
    }

    @Override // X.InterfaceC40516FvE
    public void be(Throwable th) {
        this.LJLLL = false;
        EnumC39434Fdm enumC39434Fdm = EnumC39434Fdm.Closed;
        List<C39435Fdn> list = this.LJLZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((C39435Fdn) next).LJLILLLLZI, enumC39434Fdm.getActionType())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C39435Fdn) it2.next()).onEvent(this.LJLL);
        }
        ((ArrayList) this.LJLZ).clear();
        C38934FPu c38934FPu = this.LJLL;
        if (c38934FPu != null) {
            c38934FPu.release();
        }
        LJIIJJI();
        Iterator it3 = ((ArrayList) this.LJLJLLL).iterator();
        while (it3.hasNext()) {
            try {
                ((FCR) it3.next()).LIZ(this, th);
            } catch (FCQ unused) {
            }
        }
        FCR fcr = this.LJLJJLL;
        if (fcr != null) {
            try {
                fcr.LIZ(this, th);
            } catch (FCQ unused2) {
            }
        }
    }

    @Override // X.InterfaceC60323Nlv
    public final <T extends InterfaceC60387Nmx> T getService(Class<T> cls) {
        return (T) C60299NlX.LIZ(this, cls);
    }

    @Override // X.InterfaceC40516FvE
    public final <T extends InterfaceC60387Nmx> T mb(Class<T> cls) {
        return (T) C60373Nmj.LIZIZ().LIZJ(cls, getBid());
    }

    @Override // X.InterfaceC40516FvE
    public final <T extends AbstractC59475NVv> T tf(Class<T> cls) {
        Object obj;
        Iterator it = ORZ.LLJI(this.LJLLILLLL).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (cls.isAssignableFrom(obj.getClass())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        T t = (T) obj;
        if (t == null) {
            return null;
        }
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.NlG] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.NlF] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.NlF] */
    public void LJIILJJIL(List<String> packageNames, InterfaceC60246Nkg kitPackageRegistryBundle) {
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(kitPackageRegistryBundle, "kitPackageRegistryBundle");
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(packageNames);
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = null;
        InterfaceC60253Nkn<?, ?> LJ = kitPackageRegistryBundle.LJ();
        if (LJ != null) {
            ?? LIZIZ = LJ.LIZIZ(this.LLF);
            if (LIZIZ != 0) {
                this.LJLJJI = LIZIZ;
            }
            ?? LIZ = LJ.LIZ(this.LLF);
            if (LIZ != 0) {
                this.LJLJJL = LIZ;
                FCR LJIIIIZZ = LIZ.LJIIIIZZ(this.LLF);
                if (LJIIIIZZ != null) {
                    this.LJLJJLL = LJIIIIZZ;
                }
            }
        }
        ((ArrayList) this.LJLZ).clear();
        ((ArrayList) this.LJLJL).clear();
        ((ArrayList) this.LJLJLJ).clear();
        ((ArrayList) this.LJLJLLL).clear();
        for (InterfaceC60253Nkn<?, ?> interfaceC60253Nkn : kitPackageRegistryBundle.LIZLLL()) {
            Object LIZIZ2 = interfaceC60253Nkn.LIZIZ(this.LLF);
            if (LIZIZ2 != null) {
                ((ArrayList) this.LJLJL).add(LIZIZ2);
            }
            ?? LIZ2 = interfaceC60253Nkn.LIZ(this.LLF);
            if (LIZ2 != 0) {
                ((ArrayList) this.LJLJLJ).add(LIZ2);
                FCR LJIIIIZZ2 = LIZ2.LJIIIIZZ(this.LLF);
                if (LJIIIIZZ2 != null) {
                    ((ArrayList) this.LJLJLLL).add(LJIIIIZZ2);
                }
            }
        }
        LJII();
        C38934FPu c38934FPu = this.LJLL;
        if (c38934FPu != null) {
            c38934FPu.release();
        }
        this.LJLL = null;
        Iterator<InterfaceC60262Nkw> it = kitPackageRegistryBundle.LIZIZ().iterator();
        while (it.hasNext()) {
            LJI(it.next());
        }
        InterfaceC60262Nkw LIZJ = kitPackageRegistryBundle.LIZJ();
        if (LIZJ != null) {
            LJI(LIZJ);
        }
        this.LJLJI = kitPackageRegistryBundle;
    }

    @Override // X.InterfaceC40516FvE
    public final void kf(List newPackageNames, C60251Nkl c60251Nkl) {
        o.LJIIJ(newPackageNames, "newPackageNames");
        this.LJLLJ = false;
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(newPackageNames);
        LJIIJ(newPackageNames, c60251Nkl);
        LJIILJJIL(newPackageNames, c60251Nkl);
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    public final void LJIILIIL(android.net.Uri uri, InterfaceC88472Yns<? super android.net.Uri, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        AbstractC59475NVv abstractC59475NVv;
        Object LIZIZ;
        C60225NkL c60225NkL;
        android.net.Uri uri2;
        C60549NpZ c60549NpZ = new C60549NpZ(uri);
        String str = this.LLD.LJLIL;
        o.LJIIJ(str, "<set-?>");
        c60549NpZ.LIZ = str;
        this.LJLLLLLL = c60549NpZ;
        C60203Njz c60203Njz = (C60203Njz) this.LLF.LIZJ(C60203Njz.class);
        Object obj = null;
        if (c60203Njz != null && (c60225NkL = c60203Njz.LIZJ) != null && (uri2 = c60225NkL.LIZ) != null) {
            this.LJLLLLLL = new C60549NpZ(uri2);
        }
        Zf().LLLIILIL(AbstractC60548NpY.class, this.LJLLLLLL);
        F3T f3t = this.LLF;
        C60549NpZ c60549NpZ2 = this.LJLLLLLL;
        f3t.getClass();
        f3t.LJ(AbstractC60548NpY.class, new F25(c60549NpZ2));
        F3T f3t2 = this.LLF;
        InterfaceC60387Nmx LIZ = C60299NlX.LIZ(this, InterfaceC60276NlA.class);
        f3t2.getClass();
        f3t2.LJ(InterfaceC60276NlA.class, new F25(LIZ));
        InterfaceC60259Nkt interfaceC60259Nkt = (InterfaceC60259Nkt) this.LLF.LIZJ(InterfaceC60259Nkt.class);
        InterfaceC60282NlG interfaceC60282NlG = (InterfaceC60282NlG) ORZ.LJLLLL(this.LJLJL);
        if ((interfaceC60282NlG != null || (interfaceC60282NlG = this.LJLJJI) != null) && (abstractC59475NVv = interfaceC60282NlG.LJ(this.LLF)) != null) {
            EA7 parserInterceptor = EA7.LJLIL;
            o.LJIIJ(parserInterceptor, "parserInterceptor");
            abstractC59475NVv.LIZ.put(android.net.Uri.class, parserInterceptor);
        } else {
            abstractC59475NVv = null;
        }
        this.LJLLI = abstractC59475NVv;
        ((ArrayList) this.LJLLILLLL).clear();
        Iterator<InterfaceC88472Yns<F3T, List<AbstractC59475NVv>>> it = this.LJLJI.LIZ().iterator();
        while (it.hasNext()) {
            ((ArrayList) this.LJLLILLLL).addAll(it.next().invoke(this.LLF));
        }
        if (interfaceC60259Nkt != null && (LIZIZ = interfaceC60259Nkt.LIZIZ()) != null && (LIZIZ instanceof Bundle)) {
            obj = LIZIZ;
        }
        InterfaceC48224IwG interfaceC48224IwG = (InterfaceC48224IwG) this.LLF.LIZJ(InterfaceC48224IwG.class);
        AbstractC59475NVv abstractC59475NVv2 = this.LJLLI;
        if (abstractC59475NVv2 != null) {
            if (obj != null) {
                abstractC59475NVv2.LIZJ(Bundle.class, obj, interfaceC48224IwG);
            }
            abstractC59475NVv2.LIZJ(android.net.Uri.class, uri, interfaceC48224IwG);
        }
        Iterator it2 = ((ArrayList) this.LJLLILLLL).iterator();
        while (it2.hasNext()) {
            AbstractC59475NVv abstractC59475NVv3 = (AbstractC59475NVv) it2.next();
            if (obj != null) {
                abstractC59475NVv3.LIZJ(Bundle.class, obj, interfaceC48224IwG);
            }
            abstractC59475NVv3.LIZJ(android.net.Uri.class, uri, interfaceC48224IwG);
        }
        if (this.LJLLI == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("params not found");
            printReject(illegalArgumentException, "");
            interfaceC88472Yns2.invoke(illegalArgumentException);
        } else {
            LJFF(uri, interfaceC88472Yns2);
            AbstractC59475NVv abstractC59475NVv4 = this.LJLLI;
            if (abstractC59475NVv4 != null && interfaceC60259Nkt != null) {
                interfaceC60259Nkt.LIZ(this, uri, abstractC59475NVv4);
            }
            LJIIIIZZ(uri, new AqS137S0200000_6(this, interfaceC88472Yns, 31), interfaceC88472Yns2);
        }
    }

    @Override // X.InterfaceC40516FvE
    public final void Ua(android.net.Uri input, C60220NkG c60220NkG, AqS15S0500000_10 aqS15S0500000_10) {
        o.LJIIJ(input, "input");
        this.LJLILLLLZI = input;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJLJLLL);
        FCR fcr = this.LJLJJLL;
        if (fcr != null) {
            arrayList.add(fcr);
        }
        if (arrayList.isEmpty()) {
            LJIILIIL(input, c60220NkG, aqS15S0500000_10);
            return;
        }
        C60254Nko c60254Nko = new C60254Nko(this, arrayList);
        AqS110S0300000_6 aqS110S0300000_6 = new AqS110S0300000_6(this, c60220NkG, aqS15S0500000_10, 5);
        Iterator<FCR> it = c60254Nko.LIZIZ.iterator();
        if (!it.hasNext()) {
            aqS15S0500000_10.invoke(new Throwable(C43588H8u.LIZ("None of IKitInstanceApiLifecycleDelegate processor for uri ", input)));
            return;
        }
        try {
            it.next().LIZJ(c60254Nko.LIZ, input, new AqS52S0400000_6(c60254Nko, it, aqS110S0300000_6, aqS15S0500000_10, 4), aqS15S0500000_10);
        } catch (Exception e) {
            aqS15S0500000_10.invoke(e);
        }
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39431Fdj.LIZ(this, msg, logLevel, subModule);
    }

    public AbstractC60240Nka(InterfaceC60250Nkk kitApi, F21 sessionInfo, List packageNames, C60251Nkl c60251Nkl, F3T providerFactory) {
        o.LJIIJ(kitApi, "kitApi");
        o.LJIIJ(sessionInfo, "sessionInfo");
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(providerFactory, "providerFactory");
        this.LL = kitApi;
        this.LLD = sessionInfo;
        this.LLF = providerFactory;
        ArrayList arrayList = new ArrayList();
        this.LJLIL = arrayList;
        this.LJLJL = new ArrayList();
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = new ArrayList();
        this.LJLLILLLL = new ArrayList();
        this.LJLLJ = true;
        this.LJLLLL = new ArrayList();
        this.LJLZ = new ArrayList();
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        this.LJZ = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 482));
        this.LJZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 480));
        arrayList.clear();
        arrayList.addAll(packageNames);
        this.LJLJI = c60251Nkl;
        providerFactory.LJ(InterfaceC40516FvE.class, new F26(this));
        providerFactory.LJ(InterfaceC60276NlA.class, new F25(C60299NlX.LIZ(this, InterfaceC60276NlA.class)));
        this.LJZL = C221108m2.LIZ(enumC221088m0, new AqS160S0100000_10(this, 481));
    }
}
