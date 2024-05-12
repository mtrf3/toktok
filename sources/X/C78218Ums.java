package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ums, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78218Ums implements InterfaceC32440CoG, InterfaceC78244UnI {
    public final C32449CoP LIZ;
    public final InterfaceC32440CoG LIZIZ;
    public final EnumC78220Umu LIZJ;
    public final InterfaceC37074Ego LIZLLL;
    public final InterfaceC78234Un8 LJ;
    public C32448CoO LJFF;
    public InterfaceC78213Umn LJI;
    public final List<InterfaceC78188UmO> LJII;
    public InterfaceC78188UmO LJIIIIZZ;

    @Override // X.InterfaceC32440CoG
    public final void stop() {
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13(this, 545));
    }

    @Override // X.InterfaceC32440CoG
    public final void LIZIZ(InterfaceC78213Umn renderView, C32448CoO c32448CoO) {
        o.LJIIIZ(renderView, "renderView");
        C32257ClJ.LJIIIIZZ(new AqS102S0300000_13(this, renderView, c32448CoO, 26));
    }

    @Override // X.InterfaceC78244UnI
    public final boolean LIZ(EnumC78220Umu fromType, int i, String downgradeReason, boolean z) {
        InterfaceC32440CoG LIZJ;
        o.LJIIIZ(fromType, "fromType");
        o.LJIIIZ(downgradeReason, "downgradeReason");
        if (this.LJ.LIZIZ(this.LIZ) && (LIZJ = this.LJ.LIZJ(this.LIZ)) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LJII);
            InterfaceC78188UmO interfaceC78188UmO = this.LJIIIIZZ;
            if (interfaceC78188UmO != null) {
                arrayList.add(interfaceC78188UmO);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC78188UmO interfaceC78188UmO2 = (InterfaceC78188UmO) it.next();
                C78166Um2 c78166Um2 = new C78166Um2();
                c78166Um2.LIZ = i;
                c78166Um2.LIZIZ = downgradeReason;
                c78166Um2.LIZJ = fromType.getTypeString();
                c78166Um2.LIZLLL = this.LJ.LIZ(this.LIZ).getTypeString();
                c78166Um2.LJ = z;
                interfaceC78188UmO2.LJI(c78166Um2);
            }
            this.LIZ.LJIIJ = true;
            InterfaceC78213Umn interfaceC78213Umn = this.LJI;
            if (interfaceC78213Umn != null) {
                LIZJ.LIZIZ(interfaceC78213Umn, this.LJFF);
                return true;
            }
        }
        return false;
    }

    public C78218Ums(C32449CoP request, InterfaceC32440CoG interfaceC32440CoG, EnumC78220Umu originEngine, InterfaceC37074Ego downgradeDecisionMaker, InterfaceC78234Un8 interfaceC78234Un8) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(originEngine, "originEngine");
        o.LJIIIZ(downgradeDecisionMaker, "downgradeDecisionMaker");
        this.LIZ = request;
        this.LIZIZ = interfaceC32440CoG;
        this.LIZJ = originEngine;
        this.LIZLLL = downgradeDecisionMaker;
        this.LJ = interfaceC78234Un8;
        this.LJII = new ArrayList();
        if (interfaceC32440CoG instanceof InterfaceC78243UnH) {
            ((InterfaceC78243UnH) interfaceC32440CoG).LIZ(this, request.LJIIIZ);
        }
    }
}
