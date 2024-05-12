package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1Hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30471Hn extends C0NJ {
    public final C0NJ LJFF;
    public final C0NJ LJI;

    @Override // X.C0NJ
    public final Object LIZIZ() {
        return new JSONObject();
    }

    @Override // X.C0NJ
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final OSZ LIZ(Q9H q9h, java.util.Map definitionMap) {
        o.LJIIIZ(definitionMap, "definitionMap");
        long LIZJ = q9h.LIZJ();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int LJI = q9h.LJI();
            if (LJI == -1) {
                q9h.LJ(LIZJ);
                if (obj != null) {
                    if (obj2 != null) {
                        return new OSZ(obj, obj2);
                    }
                    o.LJIJI("value");
                    throw null;
                }
                o.LJIJI("key");
                throw null;
            }
            if (LJI != 1) {
                if (LJI == 2) {
                    obj2 = this.LJI.LIZ(q9h, definitionMap);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("unknown tag [");
                    LIZ.append(LJI);
                    LIZ.append("] for map");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    LIZIZ.toString();
                    throw new IllegalStateException(LIZIZ);
                }
            } else {
                obj = this.LJFF.LIZ(q9h, definitionMap);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30471Hn(String str, int i, boolean z, C0NJ keyType, C0NJ valueType) {
        super(str, i, 21, z);
        o.LJIIIZ(keyType, "keyType");
        o.LJIIIZ(valueType, "valueType");
        this.LJFF = keyType;
        this.LJI = valueType;
    }
}
