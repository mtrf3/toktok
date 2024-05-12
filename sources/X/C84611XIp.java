package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XIp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84611XIp extends AbstractC84612XIq<InterfaceC55251LmJ<?>> implements InterfaceC55255LmN {
    public final java.util.Map<C55252LmK, java.util.Map<C55248LmG, InterfaceC55251LmJ<?>>> LJ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3C4, java.lang.Object] */
    @Override // X.InterfaceC55255LmN
    public final InterfaceC55251LmJ LIZIZ(C55248LmG c55248LmG, C55252LmK tree) {
        Object LIZ;
        o.LJIIIZ(tree, "tree");
        Object[] objArr = {tree, c55248LmG};
        InterfaceC55251LmJ interfaceC55251LmJ = null;
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            return null;
        }
        if (!this.LIZ) {
            this.LIZ = true;
            AbstractC84612XIq.LIZIZ.getClass();
            if (!AbstractC84612XIq.LIZLLL) {
                try {
                    C36381bm.LJIL.LIZLLL(new C84613XIr());
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m13isSuccessimpl(LIZ)) {
                    AbstractC84612XIq.LIZLLL = true;
                }
            }
            ((ArrayList) AbstractC84612XIq.LIZJ).add(this);
        }
        Object[] args = Arrays.copyOf(objArr, 2);
        o.LJIIIZ(args, "args");
        try {
            Object obj = args[0];
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.provider.VScopeTree");
            Object obj2 = args[1];
            o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.provider.SourceKey<*>");
            C55248LmG c55248LmG2 = (C55248LmG) obj2;
            java.util.Map map = (java.util.Map) ((LinkedHashMap) this.LJ).get((C55252LmK) obj);
            if (map == null) {
                return null;
            }
            interfaceC55251LmJ = (InterfaceC55251LmJ) map.get(c55248LmG2);
            return interfaceC55251LmJ;
        } catch (Throwable th2) {
            ?? LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
            if (!C3C5.m12isFailureimpl(LIZ2)) {
                interfaceC55251LmJ = LIZ2;
            }
            return interfaceC55251LmJ;
        }
    }

    @Override // X.InterfaceC55255LmN
    public final void LIZJ(C55252LmK tree, C55248LmG c55248LmG, InterfaceC55251LmJ<?> interfaceC55251LmJ) {
        o.LJIIIZ(tree, "tree");
        Object[] objArr = {tree, c55248LmG, interfaceC55251LmJ};
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            return;
        }
        Object[] args = Arrays.copyOf(objArr, 3);
        o.LJIIIZ(args, "args");
        try {
            Object obj = args[0];
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.provider.VScopeTree");
            C55252LmK c55252LmK = (C55252LmK) obj;
            Object obj2 = args[1];
            o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.provider.SourceKey<*>");
            C55248LmG c55248LmG2 = (C55248LmG) obj2;
            Object obj3 = args[2];
            o.LJII(obj3, "null cannot be cast to non-null type com.bytedance.provider.VProvider<*>");
            InterfaceC55251LmJ interfaceC55251LmJ2 = (InterfaceC55251LmJ) obj3;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJ;
            Object obj4 = linkedHashMap.get(c55252LmK);
            if (obj4 == null) {
                obj4 = new LinkedHashMap();
                linkedHashMap.put(c55252LmK, obj4);
            }
            C3C5.m7constructorimpl((InterfaceC55251LmJ) ((java.util.Map) obj4).put(c55248LmG2, interfaceC55251LmJ2));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
