package X;

import com.bytedance.keva.Keva;

/* renamed from: X.39g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C792839g implements FHP {
    public final Keva LIZ;

    @Override // X.FHP
    public final java.util.Map<String, ?> getAll() {
        return this.LIZ.getAll();
    }

    @Override // X.FHP
    public final void load() {
        this.LIZ.name();
    }

    public C792839g(Keva keva) {
        this.LIZ = keva;
    }

    @Override // X.FHP
    public final void LIZ(String str) {
        this.LIZ.erase(str);
    }

    @Override // X.FHP
    public final boolean LJFF(String str) {
        return !contains(str);
    }

    @Override // X.FHP
    public final boolean contains(String str) {
        return this.LIZ.contains(str);
    }

    @Override // X.FHP
    public final void LIZIZ(String str, String str2) {
        this.LIZ.storeString(str, str2);
    }

    @Override // X.FHP
    public final void LIZJ(String str, long j) {
        this.LIZ.storeLong(str, j);
    }

    @Override // X.FHP
    public final void LIZLLL(String str, int i) {
        this.LIZ.storeInt(str, i);
    }

    @Override // X.FHP
    public final void LJ(String str, double d) {
        this.LIZ.storeDouble(str, d);
    }

    @Override // X.FHP
    public final void LJI(String str, boolean z) {
        this.LIZ.storeBoolean(str, z);
    }

    @Override // X.FHP
    public final void LJII(String str, float f) {
        this.LIZ.storeFloat(str, f);
    }

    @Override // X.FHP
    public final String[] LJIIIIZZ(String str, String[] strArr) {
        return this.LIZ.getStringArray(str, strArr);
    }

    @Override // X.FHP
    public final void LJIIIZ(String str, String[] strArr) {
        this.LIZ.storeStringArray(str, strArr);
    }

    @Override // X.FHP
    public final boolean getBoolean(String str, boolean z) {
        return this.LIZ.getBoolean(str, z);
    }

    @Override // X.FHP
    public final double getDouble(String str, double d) {
        return this.LIZ.getDouble(str, d);
    }

    @Override // X.FHP
    public final float getFloat(String str, float f) {
        return this.LIZ.getFloat(str, f);
    }

    @Override // X.FHP
    public final int getInt(String str, int i) {
        return this.LIZ.getInt(str, i);
    }

    @Override // X.FHP
    public final long getLong(String str, long j) {
        return this.LIZ.getLong(str, j);
    }

    @Override // X.FHP
    public final String getString(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }
}
