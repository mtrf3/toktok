package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nlf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60307Nlf extends C60379Nmp implements InterfaceC60184Njg {
    public final ConcurrentHashMap<InterfaceC59504NWy, C60325Nlx> LJLJI;

    public C60307Nlf(C60331Nm3 c60331Nm3) {
        C60263Nkx LIZ;
        ConcurrentHashMap<InterfaceC59504NWy, C60325Nlx> concurrentHashMap = new ConcurrentHashMap<>();
        this.LJLJI = concurrentHashMap;
        String bid = this.LJLIL;
        o.LJIIJ(bid, "bid");
        InterfaceC60361NmX interfaceC60361NmX = C58233MtJ.LIZ.get(bid);
        if (interfaceC60361NmX != null && (LIZ = interfaceC60361NmX.LIZ()) != null && concurrentHashMap.get(LIZ) == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create pool kit on bid: ");
            LIZ2.append(this.LJLIL);
            C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ2), null, null, 6);
            concurrentHashMap.put(LIZ, new C60325Nlx(c60331Nm3, this.LJLIL));
        }
    }

    @Override // X.InterfaceC60184Njg
    public final EnumC46537IOf LJIL(android.net.Uri schema, C60193Njp reUsedView) {
        C60263Nkx LIZ;
        C60325Nlx c60325Nlx;
        EnumC46537IOf enumC46537IOf;
        o.LJIIJ(schema, "schema");
        o.LJIIJ(reUsedView, "reUsedView");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start to reUse on schema: ");
        LIZ2.append(schema);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ2), null, null, 6);
        String bid = this.LJLIL;
        o.LJIIJ(bid, "bid");
        InterfaceC60361NmX interfaceC60361NmX = C58233MtJ.LIZ.get(bid);
        if (interfaceC60361NmX == null || (LIZ = interfaceC60361NmX.LIZ()) == null || (c60325Nlx = this.LJLJI.get(LIZ)) == null) {
            return EnumC46537IOf.FAIL_INVALID;
        }
        c60325Nlx.LJLJI.LIZ(schema);
        C30897CAr c30897CAr = new C30897CAr(schema, schema, reUsedView, EnumC53636L3g.REUSE);
        C60356NmS c60356NmS = c60325Nlx.LJLILLLLZI;
        c60356NmS.getClass();
        C60354NmQ c60354NmQ = c60356NmS.LIZ;
        android.net.Uri uniqueSchema = c30897CAr.LJLILLLLZI;
        c60354NmQ.getClass();
        o.LJIIJ(uniqueSchema, "uniqueSchema");
        if (c60354NmQ.LIZ.get(uniqueSchema) != null) {
            enumC46537IOf = EnumC46537IOf.FAIL_EXISTS;
        } else {
            C60193Njp LIZLLL = C28791BRr.LIZLLL(c30897CAr.LJLJI);
            if (LIZLLL == null || LIZLLL.LJZL.get() == EnumC60200Njw.SUCCESS.ordinal()) {
                C60354NmQ c60354NmQ2 = c60356NmS.LIZ;
                android.net.Uri uniqueSchema2 = c30897CAr.LJLILLLLZI;
                c60354NmQ2.getClass();
                o.LJIIJ(uniqueSchema2, "uniqueSchema");
                c60354NmQ2.LIZ.put(uniqueSchema2, c30897CAr);
                enumC46537IOf = EnumC46537IOf.SUCCESS;
            } else {
                enumC46537IOf = EnumC46537IOf.FAIL_LOAD_ERROR;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("reUse result: ");
        LIZ3.append(enumC46537IOf);
        LIZ3.append(" on originSchema: ");
        LIZ3.append(c30897CAr.LJLIL);
        LIZ3.append(", ");
        LIZ3.append("uniqueSchema: ");
        LIZ3.append(c30897CAr.LJLILLLLZI);
        LIZ3.append(')');
        C39973FmT.LIZIZ(c60325Nlx, X1D.LIZIZ(LIZ3), null, null, 6);
        if (enumC46537IOf != EnumC46537IOf.SUCCESS) {
            return enumC46537IOf;
        }
        c60325Nlx.LJLJJI.LIZIZ(C28791BRr.LJ(c30897CAr));
        return enumC46537IOf;
    }

    @Override // X.InterfaceC60184Njg
    public final C30897CAr LJJIIZ(android.net.Uri schema, boolean z, boolean z2, C60193Njp originView) {
        C60263Nkx LIZ;
        C60325Nlx c60325Nlx;
        C30897CAr LJIJI;
        boolean z3;
        C60193Njp LIZLLL;
        boolean z4;
        o.LJIIJ(schema, "schema");
        o.LJIIJ(originView, "originView");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start to fetch on schema: ");
        LIZ2.append(schema);
        LIZ2.append(", openPreRender: ");
        LIZ2.append(z);
        LIZ2.append(", openReUse: ");
        LIZ2.append(z2);
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ2), null, null, 6);
        String bid = this.LJLIL;
        o.LJIIJ(bid, "bid");
        InterfaceC60361NmX interfaceC60361NmX = C58233MtJ.LIZ.get(bid);
        if (interfaceC60361NmX == null || (LIZ = interfaceC60361NmX.LIZ()) == null || (c60325Nlx = this.LJLJI.get(LIZ)) == null) {
            return null;
        }
        c60325Nlx.LJLJI.LIZ(schema);
        if (z) {
            C60355NmR c60355NmR = c60325Nlx.LJLIL;
            c60355NmR.getClass();
            LJIJI = C17N.LJIJI(c60355NmR.LIZ, schema);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("fetchPreRendered success: ");
            if (LJIJI != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            LIZ3.append(z4);
            LIZ3.append(" with uniqueSchema:");
            LIZ3.append(schema);
            C39973FmT.LIZIZ(c60325Nlx, X1D.LIZIZ(LIZ3), null, null, 6);
            if (LJIJI != null) {
                c60325Nlx.LJLJJI.LIZ(C28791BRr.LJ(LJIJI));
                LIZLLL = C28791BRr.LIZLLL(LJIJI.LJLJI);
                C60193Njp LIZLLL2 = C28791BRr.LIZLLL(originView);
                if (LIZLLL == null && LIZLLL2 != null) {
                    F3T providerFactory = LIZLLL.getProviderFactory();
                    Context context = originView.getContext();
                    providerFactory.getClass();
                    providerFactory.LJ(Context.class, new F25(context));
                    Context context2 = originView.getContext();
                    o.LJFF(context2, "originView.context");
                    Context context3 = LIZLLL.getContext();
                    if (context3 != null && (context3 instanceof MutableContextWrapper)) {
                        ((MutableContextWrapper) context3).setBaseContext(context2);
                    }
                    LIZLLL2.release();
                    C28791BRr.LJFF(LIZLLL, new AqS176S0100000_10(LIZLLL, 198));
                    C28791BRr.LJFF(LIZLLL2, new AqS139S0200000_8(LIZLLL2, LIZLLL, 37));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("fetch pool cache item success on item: ");
                    LIZ4.append(LJIJI);
                    C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ4), null, null, 6);
                    return LJIJI;
                }
            }
        }
        if (z2) {
            C60356NmS c60356NmS = c60325Nlx.LJLILLLLZI;
            c60356NmS.getClass();
            LJIJI = C17N.LJIJI(c60356NmS.LIZ, schema);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("fetchReUsed success: ");
            if (LJIJI != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            LIZ5.append(z3);
            LIZ5.append(" uniqueSchema:");
            LIZ5.append(schema);
            C39973FmT.LIZIZ(c60325Nlx, X1D.LIZIZ(LIZ5), null, null, 6);
            if (LJIJI != null) {
                c60325Nlx.LJLJJI.LIZ(C28791BRr.LJ(LJIJI));
                LIZLLL = C28791BRr.LIZLLL(LJIJI.LJLJI);
                C60193Njp LIZLLL22 = C28791BRr.LIZLLL(originView);
                return LIZLLL == null ? null : null;
            }
        }
        c60325Nlx.LJLJJI.LIZ(new C81053Gb(schema, schema, EnumC53636L3g.NONE));
        return null;
    }
}
