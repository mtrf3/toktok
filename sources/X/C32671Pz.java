package X;

import android.content.SharedPreferences;
import com.aweme.kvstorage.spi.ISharedPreferencesProvider;
import com.ss.android.ugc.aweme.kvstorage.SharedPreferencesProvider;

/* renamed from: X.1Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32671Pz implements InterfaceC10880bk {
    public static final ISharedPreferencesProvider LJI;
    public final String LIZ;
    public final String LIZIZ;
    public final C09170Xp LIZJ;
    public final C62822Ol8 LIZLLL;
    public final SharedPreferences LJ;
    public final SharedPreferences.Editor LJFF;

    static {
        ISharedPreferencesProvider iSharedPreferencesProvider;
        Object LIZ = C58096Mr6.LIZ(ISharedPreferencesProvider.class, false);
        if (LIZ != null) {
            iSharedPreferencesProvider = (ISharedPreferencesProvider) LIZ;
        } else {
            if (C58096Mr6.R1 == null) {
                synchronized (ISharedPreferencesProvider.class) {
                    if (C58096Mr6.R1 == null) {
                        C58096Mr6.R1 = new SharedPreferencesProvider();
                    }
                }
            }
            iSharedPreferencesProvider = C58096Mr6.R1;
        }
        LJI = iSharedPreferencesProvider;
    }

    public final C32671Pz LJII() {
        this.LJFF.apply();
        return this;
    }

    @Override // X.InterfaceC10880bk
    public final C17920n6 getUri() {
        return (C17920n6) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC10880bk
    public final EnumC10900bm LJFF() {
        return EnumC10900bm.SP;
    }

    @Override // X.InterfaceC10880bk
    public final String getRepoName() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32671Pz(int r5, X.C09170Xp r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.String r0 = "repoName"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r4.<init>()
            r4.LIZ = r7
            r4.LIZIZ = r8
            r4.LIZJ = r6
            kotlin.jvm.internal.IDqS420S0100000 r1 = new kotlin.jvm.internal.IDqS420S0100000
            r0 = 105(0x69, float:1.47E-43)
            r1.<init>(r4, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r4.LIZLLL = r0
            X.0bm r0 = X.EnumC10900bm.SP
            java.lang.String r0 = X.C19460pa.LIZIZ(r8, r6, r0, r7)
            if (r0 != 0) goto L4a
        L23:
            com.aweme.kvstorage.spi.ISharedPreferencesProvider r1 = X.C32671Pz.LJI
            r3 = 0
            java.lang.String r2 = "kvStorageContext"
            if (r1 == 0) goto L34
            android.content.Context r0 = X.C09190Xr.LIZ
            if (r0 == 0) goto L50
            android.content.SharedPreferences r1 = r1.LIZ(r0, r5, r7)
            if (r1 != 0) goto L41
        L34:
            android.content.Context r0 = X.C09190Xr.LIZ
            if (r0 == 0) goto L4c
            android.content.SharedPreferences r1 = X.F9J.LIZIZ(r0, r5, r7)
            java.lang.String r0 = "kvStorageContext.getSharedPreferences(name, mode)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L41:
            r4.LJ = r1
            android.content.SharedPreferences$Editor r0 = r1.edit()
            r4.LJFF = r0
            return
        L4a:
            r7 = r0
            goto L23
        L4c:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        L50:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32671Pz.<init>(int, X.0Xp, java.lang.String, java.lang.String):void");
    }
}
