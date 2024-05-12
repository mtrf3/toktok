package X;

import com.bytedance.gift.render.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Un0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78226Un0 implements InterfaceC78190UmQ {
    public final C78228Un2 LIZ;

    public C78226Un0(C32224Ckm c32224Ckm) {
        this.LIZ = new C78228Un2(c32224Ckm);
    }

    @Override // X.InterfaceC78190UmQ
    public final InterfaceC78233Un7 LIZ(EnumC78220Umu engine) {
        Object obj;
        o.LJIIIZ(engine, "engine");
        C78228Un2 c78228Un2 = this.LIZ;
        c78228Un2.getClass();
        Iterator it = ((List) c78228Un2.LIZIZ.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C78230Un4) obj).LIZ == engine) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C78230Un4 c78230Un4 = (C78230Un4) obj;
        if (c78230Un4 == null) {
            return null;
        }
        return c78230Un4.LIZIZ;
    }

    @Override // X.InterfaceC78190UmQ
    public final boolean canRender(C32449CoP c32449CoP) {
        return !((ArrayList) this.LIZ.LIZ(c32449CoP)).isEmpty();
    }

    @Override // X.InterfaceC78190UmQ
    public final InterfaceC32440CoG create(C32449CoP request) {
        InterfaceC78235Un9 c78236UnA;
        InterfaceC32440CoG create;
        InterfaceC37074Ego createDowngradeDecisionMaker;
        o.LJIIIZ(request, "request");
        List<InterfaceC78233Un7> LIZ = this.LIZ.LIZ(request);
        if (request.LJ != null) {
            c78236UnA = new C78229Un3(LIZ, request);
        } else if (request.LIZ != null) {
            c78236UnA = new C78227Un1(LIZ, request);
        } else {
            c78236UnA = new C78236UnA();
        }
        InterfaceC78233Un7 LIZ2 = c78236UnA.LIZ();
        if (LIZ2 == null || (create = LIZ2.create(request)) == null) {
            InterfaceC78234Un8 LIZIZ = c78236UnA.LIZIZ();
            Long l = null;
            if (LIZIZ == null) {
                return null;
            }
            EnumC78220Umu enumC78220Umu = EnumC78220Umu.NONE;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("type not support: ");
            Effect effect = request.LIZ;
            if (effect != null) {
                l = Long.valueOf(effect.giftId);
            }
            LIZ3.append(l);
            C78218Ums c78218Ums = new C78218Ums(request, null, enumC78220Umu, new C37073Egn(10004, X1D.LIZIZ(LIZ3)), LIZIZ);
            ((ArrayList) c78218Ums.LJII).add(new C78162Uly(request));
            return c78218Ums;
        }
        int i = request.LJIIIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    createDowngradeDecisionMaker = LIZ2.createDowngradeDecisionMaker(request);
                } else {
                    createDowngradeDecisionMaker = new C37073Egn(10001, "force downgraded by render mode");
                }
            } else {
                createDowngradeDecisionMaker = new C37075Egp();
            }
        } else {
            createDowngradeDecisionMaker = LIZ2.createDowngradeDecisionMaker(request);
        }
        InterfaceC78234Un8 LIZIZ2 = c78236UnA.LIZIZ();
        if (LIZIZ2 != null) {
            C78218Ums c78218Ums2 = new C78218Ums(request, create, LIZ2.getType(), createDowngradeDecisionMaker, LIZIZ2);
            ((ArrayList) c78218Ums2.LJII).add(new C78162Uly(request));
            return c78218Ums2;
        }
        return create;
    }
}
