package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.AqS73S1100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Eci, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36820Eci implements HM5 {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZIZ;
    public final C62822Ol8 LIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C36820Eci.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;");
        C65352Pkq.LIZ.getClass();
        LIZIZ = new InterfaceC74236TBo[]{tbt};
    }

    public final SharedPreferences LJIIIIZZ() {
        return (SharedPreferences) this.LIZ.getValue();
    }

    @Override // X.HM5
    public final void remove(String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().edit().remove(key).apply();
    }

    public C36820Eci(Context context, String spName) {
        o.LJIIJ(context, "context");
        o.LJIIJ(spName, "spName");
        this.LIZ = C221108m2.LIZIZ(new AqS73S1100000_6(context, spName, 4));
    }

    @Override // X.HM5
    public final void LIZ(long j, String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().edit().putLong(key, j).apply();
    }

    @Override // X.HM5
    public final void LIZIZ(String key, boolean z) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().edit().putBoolean(key, z).apply();
    }

    @Override // X.HM5
    public final void LIZJ(String key, String str) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().edit().putString(key, str).apply();
    }

    @Override // X.HM5
    public final void LIZLLL(String key, java.util.Set<String> set) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().edit().putStringSet(key, set).apply();
    }

    @Override // X.HM5
    public final void LJ(int i, String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().edit().putInt(key, i).apply();
    }

    @Override // X.HM5
    public final void LJFF(String key, byte[] bArr) {
        String str;
        o.LJIIJ(key, "key");
        SharedPreferences.Editor edit = LJIIIIZZ().edit();
        if (bArr != null) {
            Charset charset = StandardCharsets.ISO_8859_1;
            o.LJFF(charset, "StandardCharsets.ISO_8859_1");
            str = new String(bArr, charset);
        } else {
            str = null;
        }
        edit.putString(key, str).apply();
    }

    @Override // X.HL7
    public final byte[] LJI(String key, byte[] bArr) {
        o.LJIIJ(key, "key");
        String string = LJIIIIZZ().getString(key, null);
        if (string != null) {
            Charset charset = StandardCharsets.ISO_8859_1;
            o.LJFF(charset, "StandardCharsets.ISO_8859_1");
            byte[] bytes = string.getBytes(charset);
            o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        return bArr;
    }

    @Override // X.HM5
    public final void LJII(float f, String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().edit().putFloat(key, f).apply();
    }

    @Override // X.HL7
    public final boolean getBoolean(String key, boolean z) {
        o.LJIIJ(key, "key");
        return LJIIIIZZ().getBoolean(key, z);
    }

    @Override // X.HL7
    public final float getFloat(String key, float f) {
        o.LJIIJ(key, "key");
        return LJIIIIZZ().getFloat(key, f);
    }

    @Override // X.HL7
    public final int getInt(String key, int i) {
        o.LJIIJ(key, "key");
        return LJIIIIZZ().getInt(key, i);
    }

    @Override // X.HL7
    public final long getLong(String key, long j) {
        o.LJIIJ(key, "key");
        return LJIIIIZZ().getLong(key, j);
    }

    @Override // X.HL7
    public final String getString(String key, String str) {
        o.LJIIJ(key, "key");
        return LJIIIIZZ().getString(key, str);
    }

    @Override // X.HL7
    public final java.util.Set<String> getStringSet(String key, java.util.Set<String> set) {
        o.LJIIJ(key, "key");
        return LJIIIIZZ().getStringSet(key, set);
    }
}
