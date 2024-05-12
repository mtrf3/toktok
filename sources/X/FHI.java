package X;

import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHI implements F67, InterfaceC38730FHy {
    public static volatile boolean LJLILLLLZI;
    public static final FHI LJLIL = new FHI();
    public static volatile java.util.Map<String, j> LJLJI = new LinkedHashMap();

    @Override // X.F67
    public final void onChanged() {
        LJLILLLLZI = true;
        FI5.LIZ.getClass();
        C38995FSd.LIZIZ().execute(FHH.LJLIL);
    }

    @Override // X.InterfaceC38730FHy
    public final java.util.Map<String, j> LIZ() {
        if (!LJLILLLLZI) {
            onChanged();
        }
        return LJLJI;
    }

    public static m LIZIZ(m mVar, String str) {
        m LJJIJIL;
        j LJJIJ = mVar.LJJIJ(str);
        if (LJJIJ instanceof m) {
            m mVar2 = (m) LJJIJ;
            if (mVar2.LJJIJLIJ("val") && (LJJIJIL = mVar2.LJJIJIL("val")) != null) {
                return LJJIJIL;
            }
            return mVar2;
        }
        if ((LJJIJ instanceof p) && (((p) LJJIJ).LJLIL instanceof String)) {
            try {
                return (m) FHE.LIZLLL.LJIIJ().LJI(((p) LJJIJ).LJJIFFI(), m.class);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean LIZJ(m mVar, String str) {
        j LJJIJ = mVar.LJJIJ(str);
        if (LJJIJ instanceof m) {
            m getBoolean = (m) LJJIJ;
            o.LJIIJ(getBoolean, "$this$getBoolean");
            Boolean bool = (Boolean) U4A.LJ(getBoolean, "val", E8E.LJLIL, C35432DvQ.LJLIL);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        Boolean bool2 = (Boolean) U4A.LJ(mVar, str, E8E.LJLIL, C35432DvQ.LJLIL);
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }
}
