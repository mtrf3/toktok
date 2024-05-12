package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AqS73S1100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.EdH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36855EdH implements HM5 {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZIZ;
    public final C62822Ol8 LIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C36855EdH.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;");
        C65352Pkq.LIZ.getClass();
        LIZIZ = new InterfaceC74236TBo[]{tbt};
    }

    public final Keva LJIIIIZZ() {
        return (Keva) this.LIZ.getValue();
    }

    @Override // X.HM5
    public final void remove(String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().erase(key);
    }

    public C36855EdH(Context context, String repoName) {
        o.LJIIJ(context, "context");
        o.LJIIJ(repoName, "repoName");
        this.LIZ = C221108m2.LIZIZ(new AqS73S1100000_6(context, repoName, 3));
    }

    @Override // X.HM5
    public final void LIZ(long j, String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().storeLong(key, j);
    }

    @Override // X.HM5
    public final void LIZIZ(String key, boolean z) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().storeBoolean(key, z);
    }

    @Override // X.HM5
    public final void LIZJ(String key, String str) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().storeString(key, str);
    }

    @Override // X.HM5
    public final void LIZLLL(String key, java.util.Set<String> set) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().storeStringSet(key, set);
    }

    @Override // X.HM5
    public final void LJ(int i, String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().storeInt(key, i);
    }

    @Override // X.HM5
    public final void LJFF(String key, byte[] bArr) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().storeBytes(key, bArr);
    }

    @Override // X.HL7
    public final byte[] LJI(String key, byte[] bArr) {
        o.LJIIJ(key, "key");
        return LJIIIIZZ().getBytes(key, bArr);
    }

    @Override // X.HM5
    public final void LJII(float f, String key) {
        o.LJIIJ(key, "key");
        LJIIIIZZ().storeFloat(key, f);
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
