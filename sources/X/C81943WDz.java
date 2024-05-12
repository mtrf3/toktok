package X;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* renamed from: X.WDz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81943WDz implements WE2 {
    public static final Class<?> LJII = C81943WDz.class;
    public final int LIZ;
    public final W4P<File> LIZIZ;
    public final String LIZJ;
    public final W4P<File> LIZLLL;
    public final String LJ;
    public final InterfaceC79254V8o LJFF;
    public volatile WE6 LJI = new WE6(null, null);

    public final synchronized WE2 LJIIJJI() {
        WE2 we2;
        File file;
        WE6 we6 = this.LJI;
        if (we6.LIZ == null || (file = we6.LIZIZ) == null || !file.exists()) {
            if (this.LJI.LIZ != null && this.LJI.LIZIZ != null) {
                V1B.LJJLIIIJJIZ(this.LJI.LIZIZ);
            }
            LJIIJ();
        }
        we2 = this.LJI.LIZ;
        we2.getClass();
        return we2;
    }

    public final void LJIIJ() {
        File file = new File(this.LIZIZ.get(), this.LIZJ);
        File file2 = new File(this.LIZLLL.get(), this.LJ);
        try {
            WEC.LIZ(file);
            Class<?> cls = LJII;
            W58.LIZIZ("Created cache directory %s", file.getAbsolutePath());
            try {
                WEC.LIZ(file2);
            } catch (WEH unused) {
                W58.LJFF(cls, "create config directory %s failed", file2.getAbsoluteFile());
            }
            W58.LIZIZ("Created config directory %s", file2.getAbsolutePath());
            this.LJI = new WE6(file, new WEA(file, file2, this.LIZ, this.LJFF));
        } catch (WEH e) {
            this.LJFF.getClass();
            throw e;
        }
    }

    @Override // X.WE2
    public final void LIZIZ() {
        try {
            LJIIJJI().LIZIZ();
        } catch (IOException e) {
            W58.LJ(LJII, "purgeUnexpectedResources", e);
        }
    }

    @Override // X.WE2
    public final Collection<WE9> LJFF() {
        return LJIIJJI().LJFF();
    }

    @Override // X.WE2
    public final List<WE9> LJI() {
        return LJIIJJI().LJI();
    }

    @Override // X.WE2
    public final Collection<WE9> LJIIIIZZ() {
        return LJIIJJI().LJIIIIZZ();
    }

    @Override // X.WE2
    public final void clearAll() {
        LJIIJJI().clearAll();
    }

    @Override // X.WE2
    public final boolean isExternal() {
        try {
            return LJIIJJI().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // X.WE2
    public final long LIZJ(WE9 we9) {
        return LJIIJJI().LIZJ(we9);
    }

    @Override // X.WE2
    public final long LJ(String str) {
        return LJIIJJI().LJ(str);
    }

    @Override // X.WE2
    public final long remove(String str) {
        return LJIIJJI().remove(str);
    }

    @Override // X.WE2
    public final WEK LIZ(Object obj, String str) {
        return LJIIJJI().LIZ(obj, str);
    }

    @Override // X.WE2
    public final boolean LIZLLL(Object obj, String str) {
        return LJIIJJI().LIZLLL(obj, str);
    }

    @Override // X.WE2
    public final WEL LJII(Object obj, String str) {
        return LJIIJJI().LJII(obj, str);
    }

    @Override // X.WE2
    public final java.util.Map LJIIIZ(Object obj, String str) {
        return LJIIJJI().LJIIIZ(obj, str);
    }

    public C81943WDz(int i, W4P w4p, String str, W4P w4p2, String str2, WBD wbd) {
        this.LIZ = i;
        this.LJFF = wbd;
        this.LIZIZ = w4p;
        this.LIZJ = str;
        this.LIZLLL = w4p2;
        this.LJ = str2;
    }
}
