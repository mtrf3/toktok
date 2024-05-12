package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.Fsp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40367Fsp implements InterfaceC40375Fsx {
    public static final C40367Fsp LIZ = new C40367Fsp();

    @Override // X.InterfaceC40375Fsx
    public final void LIZ(boolean z) {
    }

    @Override // X.InterfaceC40375Fsx
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC40375Fsx
    public final void LIZJ() {
    }

    @Override // X.InterfaceC40375Fsx
    public final void LIZLLL(android.net.Uri uri, boolean z, long j, boolean z2) {
        o.LJIIIZ(uri, "uri");
    }

    @Override // X.InterfaceC40375Fsx
    public final void LJ(android.net.Uri uri, boolean z, C40372Fsu launchDataBoat, boolean z2, long j, boolean z3) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(launchDataBoat, "launchDataBoat");
    }

    @Override // X.InterfaceC40375Fsx
    public final void LJFF(String str, Application application) {
    }

    @Override // X.InterfaceC40375Fsx
    public final void LJI(EnumC40361Fsj launchType, String str) {
        o.LJIIIZ(launchType, "launchType");
    }
}
