package X;

import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHG implements InterfaceC38716FHk {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZJ;
    public static final FHG LIZLLL;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C38713FHh.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C38728FHw.LJLIL);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(FHG.class), "launchConfigRepo", "getLaunchConfigRepo()Lcom/bytedance/ies/abmock/datacenter/storage/IDataStorage;");
        C65352Pkq.LIZ.getClass();
        LIZJ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(FHG.class), "gson", "getGson()Lcom/google/gson/Gson;")};
        LIZLLL = new FHG();
    }

    public final FHP LJIIIIZZ() {
        return (FHP) this.LIZ.getValue();
    }

    @Override // X.InterfaceC38716FHk
    public final String[] LIZLLL(String str) {
        return LJIIIIZZ().LJIIIIZZ(str, null);
    }

    @Override // X.InterfaceC38716FHk
    public final int LIZ(String str, int i) {
        return LJIIIIZZ().getInt(str, i);
    }

    @Override // X.InterfaceC38716FHk
    public final Object LIZIZ(String key, Class<?> cls) {
        o.LJIIJ(key, "key");
        Object obj = null;
        try {
            obj = ((Gson) this.LIZIZ.getValue()).LJII(LJIIIIZZ().getString(key, null), cls);
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
        return LJIIIIZZ().getLong(str, j);
    }

    @Override // X.InterfaceC38716FHk
    public final float LJ(String str, float f) {
        return LJIIIIZZ().getFloat(str, f);
    }

    @Override // X.InterfaceC38716FHk
    public final double LJFF(String str, double d) {
        return LJIIIIZZ().getDouble(str, d);
    }

    @Override // X.InterfaceC38716FHk
    public final String LJI(String str, String str2) {
        return LJIIIIZZ().getString(str, str2);
    }

    @Override // X.InterfaceC38716FHk
    public final boolean LJII(String str, boolean z) {
        return LJIIIIZZ().getBoolean(str, z);
    }
}
