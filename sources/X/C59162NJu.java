package X;

import com.bytedance.keva.Keva;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NJu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59162NJu extends AbstractC43055Gv5 {
    public static final /* synthetic */ int LIZIZ = 0;

    @Override // X.AbstractC43055Gv5, X.InterfaceC37286EkE
    public final File LIZLLL() {
        return null;
    }

    @Override // X.AbstractC43055Gv5
    public final boolean LJFF() {
        try {
            LJII(C61511OCd.LIZIZ(true, System.currentTimeMillis() - (C23780wY.LIZ * 86400000), C59159NJr.LIZ(), 5, false, 96), "manual_clean_gecko");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.AbstractC43055Gv5
    public final String LJI() {
        return "GECKO";
    }

    @Override // X.AbstractC43055Gv5
    public final long LJIIIIZZ() {
        try {
            return C61511OCd.LIZIZ(false, System.currentTimeMillis() - (C23780wY.LIZ * 86400000), C59159NJr.LIZ(), 5, false, 96);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static long LJIIIZ() {
        long currentTimeMillis;
        int i;
        C62822Ol8 c62822Ol8 = C23840we.LIZ;
        if ((((Number) c62822Ol8.getValue()).intValue() & 1) == 1) {
            if ((((Number) c62822Ol8.getValue()).intValue() & 2) == 2) {
                String[] stringArray = ((Keva) C22710up.LIZ.getValue()).getStringArray("session_manager_active_days", new String[0]);
                o.LJIIIIZZ(stringArray, "keva.getStringArray(SESS…N_ACTIVE_DAYS, arrayOf())");
                ArrayList arrayList = new ArrayList(stringArray.length);
                for (String it : stringArray) {
                    o.LJIIIIZZ(it, "it");
                    arrayList.add(C38350F3i.LJJIZ(it));
                }
                List LJLL = ORZ.LJLL(arrayList);
                if (((ArrayList) LJLL).size() == ((Number) C22700uo.LIZ.getValue()).intValue()) {
                    return ((Number) ORZ.LJLLJ(LJLL)).longValue();
                }
                return 0L;
            }
            currentTimeMillis = System.currentTimeMillis();
            i = ((Number) C22700uo.LIZ.getValue()).intValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            i = C23890wj.LIZ;
        }
        return currentTimeMillis - (i * 86400000);
    }

    @Override // X.AbstractC43055Gv5, X.InterfaceC37286EkE
    public final boolean LIZ() {
        try {
            LJII(C61511OCd.LIZIZ(true, LJIIIZ(), C59159NJr.LIZ(), 4, false, 96), "auto_clean_gecko");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
