package X;

import com.bytedance.provider.impl.GScope;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LmK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55252LmK {
    public final InterfaceC55235Lm3 LIZ;
    public final java.util.Map LIZIZ;
    public InterfaceC55235Lm3 LIZJ;

    public void LIZJ() {
    }

    static {
        new ConcurrentHashMap();
    }

    public void LJ() {
        InterfaceC55235Lm3 vScope = this.LIZJ;
        o.LJIIIZ(vScope, "vScope");
        this.LIZJ = GScope.LJLIL;
    }

    public final void LJI() {
        Iterator it = ((ConcurrentHashMap) this.LIZIZ).entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC55251LmJ) ((Map.Entry) it.next()).getValue()).destroy();
        }
        ((ConcurrentHashMap) this.LIZIZ).clear();
    }

    public void LIZLLL() {
        LJI();
    }

    public C55252LmK(InterfaceC55235Lm3 vScope) {
        o.LJIIIZ(vScope, "vScope");
        this.LIZ = vScope;
        this.LIZIZ = new ConcurrentHashMap();
        this.LIZJ = GScope.LJLIL;
    }

    public final InterfaceC55251LmJ LJFF(C55248LmG c55248LmG) {
        InterfaceC55251LmJ interfaceC55251LmJ;
        if (!((ConcurrentHashMap) this.LIZIZ).containsKey(c55248LmG) && !o.LJ(this, C55254LmM.LIZLLL)) {
            C55249LmH.LIZ("vprovider_provide", new AqS156S0200000_9(c55248LmG, this, 64));
            return this.LIZJ.getTree().LJFF(c55248LmG);
        }
        Object obj = ((ConcurrentHashMap) this.LIZIZ).get(c55248LmG);
        if (!(obj instanceof InterfaceC55251LmJ) || (interfaceC55251LmJ = (InterfaceC55251LmJ) obj) == null) {
            return null;
        }
        C55249LmH.LIZ("vprovider_provide", new AqS156S0200000_9(c55248LmG, this, 65));
        InterfaceC55255LmN interfaceC55255LmN = C55249LmH.LIZIZ;
        if (interfaceC55255LmN != null) {
            interfaceC55255LmN.LIZJ(this, c55248LmG, interfaceC55251LmJ);
        }
        return interfaceC55251LmJ;
    }

    public void LIZ(InterfaceC55235Lm3 parentScope, C55232Lm0 c55232Lm0) {
        C55252LmK tree;
        o.LJIIIZ(parentScope, "parentScope");
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LIZJ;
        if (interfaceC55235Lm3 != null && (!o.LJ(interfaceC55235Lm3, parentScope))) {
            if ((!o.LJ(interfaceC55235Lm3, GScope.LJLIL)) && (tree = interfaceC55235Lm3.getTree()) != null) {
                tree.LJ();
            }
            this.LIZJ = parentScope;
            if (C55249LmH.LJI) {
                for (InterfaceC55235Lm3 interfaceC55235Lm32 = parentScope.getTree().LIZJ; !o.LJ(interfaceC55235Lm32, GScope.LJLIL); interfaceC55235Lm32 = interfaceC55235Lm32.getTree().LIZJ) {
                    if (!(!o.LJ(interfaceC55235Lm32.getTree(), this))) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("encounter circular scope attachment : ");
                        LIZ.append(this.LIZ);
                        LIZ.append(" => ");
                        LIZ.append(interfaceC55235Lm32);
                        LIZ.append(" => ");
                        LIZ.append(this.LIZ);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                }
            }
            if (!o.LJ(parentScope, GScope.LJLIL)) {
                parentScope.getTree().LIZJ();
            }
        }
    }

    public final InterfaceC55251LmJ LJII(Class clz, String str) {
        InterfaceC55251LmJ interfaceC55251LmJ;
        o.LJIIIZ(clz, "clz");
        C55248LmG c55248LmG = new C55248LmG(clz, str);
        InterfaceC55255LmN interfaceC55255LmN = C55249LmH.LIZIZ;
        if (interfaceC55255LmN != null) {
            interfaceC55251LmJ = interfaceC55255LmN.LIZIZ(c55248LmG, this);
        } else {
            interfaceC55251LmJ = null;
        }
        if (interfaceC55251LmJ != null) {
            C55249LmH.LIZ("vprovider_provide", new AqS156S0200000_9(this, (C55252LmK) interfaceC55251LmJ, (InterfaceC55251LmJ<?>) 66));
            return interfaceC55251LmJ;
        }
        C55249LmH.LIZ("vprovider_provide", new AqS156S0200000_9(c55248LmG, this, 67));
        return LJFF(c55248LmG);
    }

    public final <T extends InterfaceC80653En> void LIZIZ(String str, T data, Class<T> clz) {
        InterfaceC55251LmJ interfaceC55251LmJ;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(clz, "clz");
        C55248LmG c55248LmG = new C55248LmG(clz, str);
        Object obj = ((ConcurrentHashMap) this.LIZIZ).get(c55248LmG);
        if ((obj instanceof InterfaceC55251LmJ) && (interfaceC55251LmJ = (InterfaceC55251LmJ) obj) != null) {
            interfaceC55251LmJ.LIZ(new AqS175S0100000_9(data, 414));
            return;
        }
        C55249LmH.LIZ("vprovider_bind", new AqS69S0400000_9(this, (C55252LmK) c55248LmG, (C55248LmG) data, clz, (Class<Class<T>>) 3));
        C55253LmL c55253LmL = new C55253LmL(data);
        ((ConcurrentHashMap) this.LIZIZ).put(c55248LmG, c55253LmL);
        c55253LmL.LIZ(new AqS175S0100000_9(data, 415));
    }
}
