package X;

import com.bytedance.gift.render.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UmP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78189UmP implements InterfaceC78233Un7 {
    @Override // X.InterfaceC78233Un7
    public final boolean support() {
        return true;
    }

    @Override // X.InterfaceC78233Un7
    public final EnumC78220Umu getType() {
        return EnumC78220Umu.COMBINATION;
    }

    @Override // X.InterfaceC78233Un7
    public final boolean canRender(C32449CoP request) {
        InterfaceC78190UmQ interfaceC78190UmQ;
        List<Effect> list;
        Effect effect;
        o.LJIIIZ(request, "request");
        C32437CoD c32437CoD = request.LJ;
        if (c32437CoD == null || c32437CoD.LIZIZ == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C32437CoD c32437CoD2 = request.LJ;
        if (c32437CoD2 != null && (effect = c32437CoD2.LIZIZ) != null) {
            arrayList.add(effect);
        }
        C32437CoD c32437CoD3 = request.LJ;
        if (c32437CoD3 != null && (list = c32437CoD3.LIZ) != null) {
            arrayList.addAll(list);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Effect effect2 = (Effect) it.next();
                C32438CoE c32438CoE = new C32438CoE();
                c32438CoE.LIZJ = effect2;
                C32449CoP LIZ = c32438CoE.LIZ();
                if (LIZ == null || (interfaceC78190UmQ = (InterfaceC78190UmQ) C32260ClM.LIZ(InterfaceC78190UmQ.class)) == null || !interfaceC78190UmQ.canRender(LIZ)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC78233Un7
    public final InterfaceC32440CoG create(C32449CoP request) {
        o.LJIIIZ(request, "request");
        if (!canRender(request)) {
            return null;
        }
        return new C78192UmS(request);
    }

    @Override // X.InterfaceC78233Un7
    public final InterfaceC37074Ego createDowngradeDecisionMaker(C32449CoP request) {
        o.LJIIIZ(request, "request");
        return new C37075Egp();
    }
}
