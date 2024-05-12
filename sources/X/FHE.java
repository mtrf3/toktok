package X;

import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHE implements InterfaceC38716FHk {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZJ;
    public static final FHE LIZLLL;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C38712FHg.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C38727FHv.LJLIL);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(FHE.class), "configRepo", "getConfigRepo()Lcom/bytedance/ies/abmock/datacenter/storage/IDataStorage;");
        C65352Pkq.LIZ.getClass();
        LIZJ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(FHE.class), "gson", "getGson()Lcom/google/gson/Gson;")};
        LIZLLL = new FHE();
    }

    public final FHP LJIIIZ() {
        return (FHP) this.LIZ.getValue();
    }

    public final Gson LJIIJ() {
        return (Gson) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC38716FHk
    public final String[] LIZLLL(String str) {
        return LJIIIZ().LJIIIIZZ(str, null);
    }

    public final void LJIIIIZZ(String str) {
        FHC LIZIZ = FHC.LIZIZ();
        o.LJFF(LIZIZ, "DataProvider.getInstance()");
        InterfaceC38688FGi interfaceC38688FGi = LIZIZ.LIZLLL;
        if (interfaceC38688FGi != null && interfaceC38688FGi.LJ()) {
            if (LJIIIZ().contains(str)) {
                LJIIIZ().LIZ(str);
                return;
            }
            return;
        }
        LJIIIZ().LIZ(str);
    }

    @Override // X.InterfaceC38716FHk
    public final int LIZ(String str, int i) {
        return LJIIIZ().getInt(str, i);
    }

    @Override // X.InterfaceC38716FHk
    public final Object LIZIZ(String key, Class<?> cls) {
        o.LJIIJ(key, "key");
        Object obj = null;
        try {
            obj = LJIIJ().LJII(LJIIIZ().getString(key, null), cls);
            return obj;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("throwable");
            LIZ.append(th);
            LIZ.append("  , key = ");
            LIZ.append(key);
            PEH.LIZIZ(X1D.LIZIZ(LIZ));
            return obj;
        }
    }

    @Override // X.InterfaceC38716FHk
    public final long LIZJ(String str, long j) {
        return LJIIIZ().getLong(str, j);
    }

    @Override // X.InterfaceC38716FHk
    public final float LJ(String str, float f) {
        return LJIIIZ().getFloat(str, f);
    }

    @Override // X.InterfaceC38716FHk
    public final double LJFF(String str, double d) {
        return LJIIIZ().getDouble(str, d);
    }

    @Override // X.InterfaceC38716FHk
    public final String LJI(String str, String str2) {
        return LJIIIZ().getString(str, str2);
    }

    @Override // X.InterfaceC38716FHk
    public final boolean LJII(String str, boolean z) {
        return LJIIIZ().getBoolean(str, z);
    }

    public final void LJIIJJI(String str, boolean z) {
        LJIIIZ().LJI(str, z);
    }

    public final void LJIIL(String str, String str2) {
        LJIIIZ().LIZIZ(str, str2);
    }
}
