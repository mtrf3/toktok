package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43131mf implements InterfaceC32651Px {
    public InterfaceC32651Px LIZ;

    @Override // X.InterfaceC10880bk
    public EnumC10900bm LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC32651Px
    public void clear() {
        this.LIZ.clear();
    }

    @Override // X.InterfaceC10880bk
    public String getRepoName() {
        return this.LIZ.getRepoName();
    }

    @Override // X.InterfaceC10880bk
    public C17920n6 getUri() {
        return this.LIZ.getUri();
    }

    public AbstractC43131mf(InterfaceC32651Px delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LIZ = delegate;
    }

    @Override // X.InterfaceC32651Px
    public void LIZ(String key) {
        o.LJIIIZ(key, "key");
        this.LIZ.LIZ(key);
    }

    @Override // X.InterfaceC32651Px
    public boolean contains(String key) {
        o.LJIIIZ(key, "key");
        return this.LIZ.contains(key);
    }

    @Override // X.InterfaceC32651Px
    public void LIZIZ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.LIZ.LIZIZ(key, value);
    }

    @Override // X.InterfaceC32651Px
    public void LIZJ(String key, long j) {
        o.LJIIIZ(key, "key");
        this.LIZ.LIZJ(key, j);
    }

    @Override // X.InterfaceC32651Px
    public void LIZLLL(String key, int i) {
        o.LJIIIZ(key, "key");
        this.LIZ.LIZLLL(key, i);
    }

    @Override // X.InterfaceC32651Px
    public void LJ(String key, double d) {
        o.LJIIIZ(key, "key");
        this.LIZ.LJ(key, d);
    }

    @Override // X.InterfaceC32651Px
    public void LJI(String key, boolean z) {
        o.LJIIIZ(key, "key");
        this.LIZ.LJI(key, z);
    }

    @Override // X.InterfaceC32651Px
    public boolean getBoolean(String key, boolean z) {
        o.LJIIIZ(key, "key");
        return this.LIZ.getBoolean(key, z);
    }

    @Override // X.InterfaceC32651Px
    public double getDouble(String key, double d) {
        o.LJIIIZ(key, "key");
        return this.LIZ.getDouble(key, d);
    }

    @Override // X.InterfaceC32651Px
    public int getInt(String key, int i) {
        o.LJIIIZ(key, "key");
        return this.LIZ.getInt(key, i);
    }

    @Override // X.InterfaceC32651Px
    public long getLong(String key, long j) {
        o.LJIIIZ(key, "key");
        return this.LIZ.getLong(key, j);
    }

    @Override // X.InterfaceC32651Px
    public String getString(String key, String str) {
        o.LJIIIZ(key, "key");
        return this.LIZ.getString(key, str);
    }
}
