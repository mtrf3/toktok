package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.N5t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C58797N5t implements JMD {
    public final InterfaceC58801N5x LJLIL;
    public final InterfaceC49504Jbo LJLILLLLZI = C58784N5g.LIZIZ.LIZIZ();
    public final List<N6P> LJLJI = new ArrayList();
    public final N4S LJLJJI = new N4S(0);
    public Integer LJLJJL;
    public InterfaceC58799N5v LJLJJLL;

    @Override // X.InterfaceC58783N5f
    public final void LIZLLL() {
        this.LJLJJL = null;
    }

    public InterfaceC58801N5x LJ() {
        throw null;
    }

    public N6K LJFF() {
        throw null;
    }

    public String LJI() {
        throw null;
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.JGZ
    public void LIZJ() {
        java.util.Set<EnumC58794N5q> linkedHashSet;
        int i;
        LJI();
        N6K LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZJ(N6F.ENTER_DETAIL);
        }
        N4S n4s = this.LJLJJI;
        InterfaceC58799N5v interfaceC58799N5v = this.LJLJJLL;
        if (interfaceC58799N5v == null || (linkedHashSet = interfaceC58799N5v.D70()) == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        n4s.getClass();
        n4s.LJLJJI = linkedHashSet;
        InterfaceC58799N5v interfaceC58799N5v2 = this.LJLJJLL;
        if (interfaceC58799N5v2 != null) {
            i = interfaceC58799N5v2.d0();
        } else {
            i = 0;
        }
        n4s.LJLJI = i;
        LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("module beforeEnterDetailPage eventTrackedList = ");
        LIZ.append(this.LJLJJI.LJLJJI);
        LIZ.append(" playtims = ");
        LIZ.append(this.LJLJJI.LJLJI);
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.JK9
    public void LLLLZI() {
        LJI();
        InterfaceC49504Jbo interfaceC49504Jbo = this.LJLILLLLZI;
        if (interfaceC49504Jbo != null) {
            interfaceC49504Jbo.LJ(this);
        }
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            ((N6P) it.next()).LLLLZI();
        }
    }

    @Override // X.JK9
    public void onViewAttachedToWindow() {
        LJI();
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            ((N6P) it.next()).onViewAttachedToWindow();
        }
        InterfaceC58799N5v interfaceC58799N5v = this.LJLJJLL;
        if (interfaceC58799N5v != null) {
            interfaceC58799N5v.onViewAttachedToWindow();
        }
    }

    @Override // X.JK9
    public void onViewDetachedFromWindow() {
        C58786N5i LIZIZ;
        LJI();
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            ((N6P) it.next()).onViewDetachedFromWindow();
        }
        InterfaceC58799N5v interfaceC58799N5v = this.LJLJJLL;
        if (interfaceC58799N5v != null) {
            interfaceC58799N5v.onViewDetachedFromWindow();
        }
        O5Y.LJJJLIIL(this.LJLJJI);
        InterfaceC49504Jbo interfaceC49504Jbo = this.LJLILLLLZI;
        if (interfaceC49504Jbo != null && (LIZIZ = interfaceC49504Jbo.LIZIZ()) != null) {
            LIZIZ.LIZIZ(LJ().getAweme(), EnumC58785N5h.NOT_TRACK);
        }
    }

    @Override // X.InterfaceC58783N5f
    public final Integer LIZ() {
        return this.LJLJJL;
    }

    @Override // X.JGQ
    public final InterfaceC58799N5v LLLZIIL() {
        return this.LJLJJLL;
    }

    @Override // X.JGZ
    public final N4S getShareInfo() {
        return this.LJLJJI;
    }

    public C58797N5t(InterfaceC58801N5x interfaceC58801N5x) {
        this.LJLIL = interfaceC58801N5x;
    }

    public void Kn(C58798N5u c58798N5u) {
        ActivityC45651qj activityC45651qj;
        Context context;
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            N6P n6p = (N6P) it.next();
            n6p.getClass();
            Iterator it2 = ((ArrayList) n6p.LJLJI).iterator();
            while (it2.hasNext()) {
                ((N6Q) it2.next()).LIZIZ(c58798N5u);
            }
        }
        InterfaceC58801N5x LJ = LJ();
        if (LJ != null && (context = LJ.getContext()) != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        N6J.LIZIZ(c58798N5u, activityC45651qj, C113554cx.LJJL(new OSZ(N65.LIZ, new AqS160S0100000_10(this, 11)), new OSZ(N63.LIZ, N60.LJLIL)));
    }

    @Override // X.JGZ
    public void LIZIZ(String str) {
        java.util.Set<EnumC58794N5q> set;
        N7D LIZJ;
        N4S shareInfo;
        java.util.Set<EnumC58794N5q> D70;
        InterfaceC49504Jbo LIZIZ = C58784N5g.LIZIZ.LIZIZ();
        if (LIZIZ != null && (LIZJ = LIZIZ.LIZJ(LJ().getAweme())) != null && (shareInfo = LIZJ.getShareInfo()) != null) {
            O5Y.LJJLIIIJILLIZJL(this.LJLJJI, shareInfo);
            InterfaceC58799N5v interfaceC58799N5v = this.LJLJJLL;
            if (interfaceC58799N5v != null && (D70 = interfaceC58799N5v.D70()) != null) {
                D70.addAll(this.LJLJJI.LJLJJI);
            }
            InterfaceC58799N5v interfaceC58799N5v2 = this.LJLJJLL;
            if (interfaceC58799N5v2 != null) {
                interfaceC58799N5v2.Ud(shareInfo.LJLJI);
            }
        }
        N6K LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZJ(N6F.RETURN_FROM_DETAIL);
        }
        LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("module returnFromDetailPage eventTrackedList = ");
        InterfaceC58799N5v interfaceC58799N5v3 = this.LJLJJLL;
        Integer num = null;
        if (interfaceC58799N5v3 != null) {
            set = interfaceC58799N5v3.D70();
        } else {
            set = null;
        }
        LIZ.append(set);
        LIZ.append(" playtims = ");
        InterfaceC58799N5v interfaceC58799N5v4 = this.LJLJJLL;
        if (interfaceC58799N5v4 != null) {
            num = Integer.valueOf(interfaceC58799N5v4.d0());
        }
        LIZ.append(num);
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.JGQ
    public final InterfaceC58799N5v Z9(JGM jgm) {
        N6K n6k;
        LJI();
        C58798N5u LIZ = N55.LIZ(jgm);
        this.LJLJJLL = LIZ;
        N6K LJFF = LJFF();
        C58795N5r c58795N5r = new C58795N5r(C113554cx.LJJJLIIL(), EnumC124554uh.SEARCH_RESULT);
        LIZ.LJLILLLLZI = new C58802N5y(LJFF, c58795N5r);
        if (c58795N5r.LIZ) {
            C58791N5n c58791N5n = new C58791N5n(LIZ, c58795N5r);
            LIZ.LJLJJL = c58791N5n;
            N6J.LIZIZ(c58791N5n.LIZ, c58791N5n.LIZJ, C113554cx.LJJL(new OSZ(N65.LIZ, new AqS160S0100000_10(c58791N5n, 407)), new OSZ(N63.LIZ, new AqS160S0100000_10(c58791N5n, 408)), new OSZ(N61.LIZ, new AqS160S0100000_10(c58791N5n, 409)), new OSZ(N64.LIZ, new AqS160S0100000_10(c58791N5n, 410)), new OSZ(N66.LIZ, new AqS160S0100000_10(c58791N5n, 411))));
            C58802N5y q7 = c58791N5n.LIZ.q7();
            if (q7 != null && (n6k = q7.LIZ) != null) {
                n6k.LIZLLL(N6F.RETURN_FROM_DETAIL, new AqS160S0100000_10(c58791N5n, 412));
            }
        }
        Kn(LIZ);
        return LIZ;
    }
}
