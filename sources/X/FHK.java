package X;

import com.google.gson.Gson;

/* loaded from: classes7.dex */
public final class FHK implements InterfaceC38716FHk {
    public static final FHK LIZJ = new FHK();
    public final FHP LIZ = C38731FHz.LIZIZ.LIZ.LJI();
    public Gson LIZIZ;

    @Override // X.InterfaceC38716FHk
    public final String[] LIZLLL(String str) {
        return this.LIZ.LJIIIIZZ(str, null);
    }

    @Override // X.InterfaceC38716FHk
    public final int LIZ(String str, int i) {
        return this.LIZ.getInt(str, i);
    }

    @Override // X.InterfaceC38716FHk
    public final Object LIZIZ(String str, Class cls) {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = new Gson();
            }
            return this.LIZIZ.LJI(this.LIZ.getString(str, null), cls);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("throwable");
            LIZ.append(th);
            LIZ.append("  , key = ");
            LIZ.append(str);
            PEH.LIZIZ(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    @Override // X.InterfaceC38716FHk
    public final long LIZJ(String str, long j) {
        return this.LIZ.getLong(str, j);
    }

    @Override // X.InterfaceC38716FHk
    public final float LJ(String str, float f) {
        return this.LIZ.getFloat(str, f);
    }

    @Override // X.InterfaceC38716FHk
    public final double LJFF(String str, double d) {
        return this.LIZ.getDouble(str, d);
    }

    @Override // X.InterfaceC38716FHk
    public final String LJI(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    @Override // X.InterfaceC38716FHk
    public final boolean LJII(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }
}
