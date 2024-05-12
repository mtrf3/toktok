package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* renamed from: X.EoF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37535EoF implements InterfaceC37417EmL {
    @Override // X.InterfaceC37417EmL
    public final Object LIZ(String str, Object obj, Type type) {
        Object LIZ;
        if (str != null) {
            try {
                FHD.LIZLLL().getClass();
                Object LJIIJ = FHD.LJIIJ(str, true);
                Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
                o.LJII(LJIIJ, "null cannot be cast to non-null type kotlin.String");
                LIZ = LIZ2.LJII((String) LJIIJ, type);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                return obj;
            }
            return LIZ;
        }
        return obj;
    }
}
