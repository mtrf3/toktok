package X;

import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHB implements InterfaceC38716FHk {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZLLL;
    public static final FHB LJ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C38714FHi.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C38729FHx.LJLIL);
    public final FHJ LIZJ = new FHJ();

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(FHB.class), "libraConfigRepo", "getLibraConfigRepo()Lcom/bytedance/ies/abmock/datacenter/storage/IDataStorage;");
        C65352Pkq.LIZ.getClass();
        LIZLLL = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(FHB.class), "gson", "getGson()Lcom/google/gson/Gson;")};
        LJ = new FHB();
    }

    public final FHP LJIIIZ() {
        return (FHP) this.LIZ.getValue();
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
                if (FHJ.LIZIZ(str)) {
                    this.LIZJ.LIZ(str);
                }
                LJIIIZ().LIZ(str);
                return;
            }
            return;
        }
        if (FHJ.LIZIZ(str)) {
            this.LIZJ.LIZ(str);
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
            obj = ((Gson) this.LIZIZ.getValue()).LJII(LJIIIZ().getString(key, null), cls);
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

    public final void LJIIJ(String str, boolean z) {
        if (FHJ.LIZIZ(str)) {
            FHJ fhj = this.LIZJ;
            fhj.getClass();
            fhj.LIZ.LJIIIIZZ().LJI(str, z);
        }
        LJIIIZ().LJI(str, z);
    }

    public final void LJIIJJI(String str, int i) {
        if (FHJ.LIZIZ(str)) {
            FHJ fhj = this.LIZJ;
            fhj.getClass();
            fhj.LIZ.LJIIIIZZ().LIZLLL(str, i);
        }
        LJIIIZ().LIZLLL(str, i);
    }

    public final void LJIIL(String str, String[] strArr) {
        if (FHJ.LIZIZ(str)) {
            FHJ fhj = this.LIZJ;
            fhj.getClass();
            fhj.LIZ.LJIIIIZZ().LJIIIZ(str, strArr);
        }
        LJIIIZ().LJIIIZ(str, strArr);
    }

    public final void LJIILIIL(String str, String value) {
        if (FHJ.LIZIZ(str)) {
            FHJ fhj = this.LIZJ;
            fhj.getClass();
            o.LJIIJ(value, "value");
            fhj.LIZ.LJIIIIZZ().LIZIZ(str, value);
        }
        LJIIIZ().LIZIZ(str, value);
    }
}
