package X;

import kotlin.jvm.internal.IDqS0S2100000;
import kotlin.jvm.internal.o;

/* renamed from: X.22K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22K extends AbstractC43131mf {
    public final InterfaceC16890lR LIZIZ;

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void clear() {
        String LJII = this.LIZIZ.LJII(this.LIZ);
        super.clear();
        this.LIZIZ.LIZJ(LJII);
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZ(String key) {
        o.LJIIIZ(key, "key");
        String LJI = this.LIZIZ.LJI(this.LIZ, key);
        super.LIZ(key);
        this.LIZIZ.LIZIZ(this.LIZ, LJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22K(InterfaceC32651Px delegate, InterfaceC16890lR monitor) {
        super(delegate);
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(monitor, "monitor");
        this.LIZIZ = monitor;
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZIZ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        C16910lT.LIZIZ(this.LIZIZ, this.LIZ, key, "String", value, value.length(), new IDqS0S2100000(this, key, value, 2));
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZJ(String key, long j) {
        o.LJIIIZ(key, "key");
        C16910lT.LIZIZ(this.LIZIZ, this.LIZ, key, "Long", Long.valueOf(j), -1, new C22J(this, key, j));
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZLLL(String key, int i) {
        o.LJIIIZ(key, "key");
        C16910lT.LIZIZ(this.LIZIZ, this.LIZ, key, "Int", Integer.valueOf(i), -1, new C22I(this, key, i));
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LJ(String key, double d) {
        o.LJIIIZ(key, "key");
        C16910lT.LIZIZ(this.LIZIZ, this.LIZ, key, "Double", Double.valueOf(d), -1, new C22H(this, key, d));
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LJI(String key, boolean z) {
        o.LJIIIZ(key, "key");
        C16910lT.LIZIZ(this.LIZIZ, this.LIZ, key, "Boolean", Boolean.valueOf(z), -1, new C22G(this, key, z));
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final boolean getBoolean(String key, boolean z) {
        o.LJIIIZ(key, "key");
        Boolean bool = (Boolean) C16910lT.LIZ(this.LIZIZ, this.LIZ, key, "Boolean", new C22C(this, key, z));
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final double getDouble(String key, double d) {
        o.LJIIIZ(key, "key");
        Double d2 = (Double) C16910lT.LIZ(this.LIZIZ, this.LIZ, key, "Double", new C22D(this, key, d));
        if (d2 != null) {
            return d2.doubleValue();
        }
        return d;
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final int getInt(String key, int i) {
        o.LJIIIZ(key, "key");
        Integer num = (Integer) C16910lT.LIZ(this.LIZIZ, this.LIZ, key, "Int", new C22E(this, key, i));
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final long getLong(String key, long j) {
        o.LJIIIZ(key, "key");
        Long l = (Long) C16910lT.LIZ(this.LIZIZ, this.LIZ, key, "Long", new C22F(this, key, j));
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final String getString(String key, String str) {
        o.LJIIIZ(key, "key");
        return (String) C16910lT.LIZ(this.LIZIZ, this.LIZ, key, "String", new IDqS0S2100000(this, key, str, 1));
    }
}
