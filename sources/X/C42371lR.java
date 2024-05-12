package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42371lR implements InterfaceC32651Px {
    public final String LIZ;
    public final String LIZIZ;
    public final C09170Xp LIZJ;
    public final C62822Ol8 LIZLLL;
    public final Keva LJ;

    @Override // X.InterfaceC32651Px
    public final void clear() {
        this.LJ.clear();
    }

    @Override // X.InterfaceC10880bk
    public final C17920n6 getUri() {
        return (C17920n6) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC10880bk
    public final EnumC10900bm LJFF() {
        return EnumC10900bm.KEVA;
    }

    @Override // X.InterfaceC10880bk
    public final String getRepoName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC32651Px
    public final void LIZ(String key) {
        o.LJIIIZ(key, "key");
        this.LJ.erase(key);
    }

    @Override // X.InterfaceC32651Px
    public final boolean contains(String key) {
        o.LJIIIZ(key, "key");
        return this.LJ.contains(key);
    }

    @Override // X.InterfaceC32651Px
    public final void LIZIZ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.LJ.storeString(key, value);
    }

    @Override // X.InterfaceC32651Px
    public final void LIZJ(String key, long j) {
        o.LJIIIZ(key, "key");
        this.LJ.storeLong(key, j);
    }

    @Override // X.InterfaceC32651Px
    public final void LIZLLL(String key, int i) {
        o.LJIIIZ(key, "key");
        this.LJ.storeInt(key, i);
    }

    @Override // X.InterfaceC32651Px
    public final void LJ(String key, double d) {
        o.LJIIIZ(key, "key");
        this.LJ.storeDouble(key, d);
    }

    @Override // X.InterfaceC32651Px
    public final void LJI(String key, boolean z) {
        o.LJIIIZ(key, "key");
        this.LJ.storeBoolean(key, z);
    }

    @Override // X.InterfaceC32651Px
    public final boolean getBoolean(String key, boolean z) {
        o.LJIIIZ(key, "key");
        return this.LJ.getBoolean(key, z);
    }

    @Override // X.InterfaceC32651Px
    public final double getDouble(String key, double d) {
        o.LJIIIZ(key, "key");
        return this.LJ.getDouble(key, d);
    }

    @Override // X.InterfaceC32651Px
    public final int getInt(String key, int i) {
        o.LJIIIZ(key, "key");
        return this.LJ.getInt(key, i);
    }

    @Override // X.InterfaceC32651Px
    public final long getLong(String key, long j) {
        o.LJIIIZ(key, "key");
        return this.LJ.getLong(key, j);
    }

    @Override // X.InterfaceC32651Px
    public final String getString(String key, String str) {
        o.LJIIIZ(key, "key");
        return this.LJ.getString(key, str);
    }

    public C42371lR(int i, C09170Xp c09170Xp, String repoName, String str) {
        Keva repo;
        o.LJIIIZ(repoName, "repoName");
        this.LIZ = repoName;
        this.LIZIZ = str;
        this.LIZJ = c09170Xp;
        this.LIZLLL = C221108m2.LIZIZ(new IDqS420S0100000(this, 104));
        String LIZIZ = C19460pa.LIZIZ(str, c09170Xp, EnumC10900bm.KEVA, repoName);
        if (!TextUtils.isEmpty(LIZIZ)) {
            repo = Keva.getRepoWithPath(repoName, LIZIZ, i, false);
        } else {
            repo = Keva.getRepo(repoName, i);
        }
        this.LJ = repo;
    }
}
