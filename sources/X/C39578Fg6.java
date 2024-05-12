package X;

import java.io.File;

/* renamed from: X.Fg6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39578Fg6 implements InterfaceC37286EkE {
    public final InterfaceC46732IVs LIZ;

    @Override // X.InterfaceC37286EkE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC37286EkE
    public final String LJ() {
        return "CACHE";
    }

    @Override // X.InterfaceC37286EkE
    public final boolean LIZJ() {
        this.LIZ.clearCache();
        return true;
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        return this.LIZ.getCacheDir();
    }

    @Override // X.InterfaceC37286EkE
    public final long LIZIZ() {
        File LIZLLL = LIZLLL();
        if (LIZLLL == null || !LIZLLL.exists()) {
            return 0L;
        }
        return Math.max(C39579Fg7.LJIIIIZZ(LIZLLL.getAbsolutePath()), 0L);
    }

    public C39578Fg6(InterfaceC46732IVs interfaceC46732IVs) {
        this.LIZ = interfaceC46732IVs;
    }
}
