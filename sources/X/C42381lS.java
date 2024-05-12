package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1lS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42381lS implements InterfaceC32651Px {
    public final C32671Pz LIZ;

    @Override // X.InterfaceC10880bk
    public final EnumC10900bm LJFF() {
        this.LIZ.getClass();
        return EnumC10900bm.SP;
    }

    @Override // X.InterfaceC32651Px
    public final void clear() {
        this.LIZ.LJFF.clear();
        this.LIZ.LJII();
    }

    @Override // X.InterfaceC10880bk
    public final String getRepoName() {
        return this.LIZ.LIZ;
    }

    @Override // X.InterfaceC10880bk
    public final C17920n6 getUri() {
        return this.LIZ.getUri();
    }

    @Override // X.InterfaceC32651Px
    public final void LIZ(String key) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        c32671Pz.LJFF.remove(key);
        c32671Pz.LJII();
    }

    @Override // X.InterfaceC32651Px
    public final boolean contains(String key) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        return c32671Pz.LJ.contains(key);
    }

    @Override // X.InterfaceC32651Px
    public final void LIZIZ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        c32671Pz.LJFF.putString(key, value);
        c32671Pz.LJII();
    }

    @Override // X.InterfaceC32651Px
    public final void LIZJ(String key, long j) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        c32671Pz.LJFF.putLong(key, j);
        c32671Pz.LJII();
    }

    @Override // X.InterfaceC32651Px
    public final void LIZLLL(String key, int i) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        c32671Pz.LJFF.putInt(key, i);
        c32671Pz.LJII();
    }

    @Override // X.InterfaceC32651Px
    public final void LJ(String key, double d) {
        o.LJIIIZ(key, "key");
        throw new IllegalAccessError("sp no implement storeDouble method");
    }

    @Override // X.InterfaceC32651Px
    public final void LJI(String key, boolean z) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        c32671Pz.LJFF.putBoolean(key, z);
        c32671Pz.LJII();
    }

    @Override // X.InterfaceC32651Px
    public final boolean getBoolean(String key, boolean z) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        return c32671Pz.LJ.getBoolean(key, z);
    }

    @Override // X.InterfaceC32651Px
    public final double getDouble(String key, double d) {
        o.LJIIIZ(key, "key");
        throw new IllegalAccessError("sp no implement getDouble  method");
    }

    @Override // X.InterfaceC32651Px
    public final int getInt(String key, int i) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        return c32671Pz.LJ.getInt(key, i);
    }

    @Override // X.InterfaceC32651Px
    public final long getLong(String key, long j) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        return c32671Pz.LJ.getLong(key, j);
    }

    @Override // X.InterfaceC32651Px
    public final String getString(String key, String str) {
        o.LJIIIZ(key, "key");
        C32671Pz c32671Pz = this.LIZ;
        c32671Pz.getClass();
        return c32671Pz.LJ.getString(key, str);
    }

    public C42381lS(int i, C09170Xp c09170Xp, String repoName, String str) {
        o.LJIIIZ(repoName, "repoName");
        this.LIZ = new C32671Pz(i, c09170Xp, repoName, str);
    }
}
