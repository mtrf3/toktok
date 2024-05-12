package X;

import android.app.Activity;
import java.io.File;

/* renamed from: X.F5b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38395F5b implements InterfaceC38394F5a {
    public final InterfaceC38408F5o<C40555Fvr> LIZ;
    public final InterfaceC38408F5o<C40542Fve> LIZIZ;
    public final InterfaceC38408F5o<File> LIZJ;

    public C38395F5b(InterfaceC38408F5o<C40555Fvr> interfaceC38408F5o, InterfaceC38408F5o<C40542Fve> interfaceC38408F5o2, InterfaceC38408F5o<File> interfaceC38408F5o3) {
        this.LIZ = interfaceC38408F5o;
        this.LIZIZ = interfaceC38408F5o2;
        this.LIZJ = interfaceC38408F5o3;
    }

    @Override // X.InterfaceC38394F5a
    public final void LIZ() {
        LJFF().LIZ();
    }

    @Override // X.InterfaceC38394F5a
    public final C40561Fvx LIZIZ(int i) {
        return LJFF().LIZIZ(i);
    }

    @Override // X.InterfaceC38394F5a
    public final C40561Fvx LIZJ(C38398F5e c38398F5e) {
        return LJFF().LIZJ(c38398F5e);
    }

    @Override // X.InterfaceC38394F5a
    public final boolean LIZLLL(AbstractC40550Fvm abstractC40550Fvm, Activity activity, int i) {
        return LJFF().LIZLLL(abstractC40550Fvm, activity, i);
    }

    @Override // X.InterfaceC38394F5a
    public final java.util.Set<String> LJ() {
        return LJFF().LJ();
    }

    public final InterfaceC38394F5a LJFF() {
        return (InterfaceC38394F5a) (this.LIZJ.a() == null ? this.LIZ : this.LIZIZ).a();
    }

    @Override // X.InterfaceC38394F5a
    public final java.util.Set<String> getInstalledModules() {
        return LJFF().getInstalledModules();
    }
}
