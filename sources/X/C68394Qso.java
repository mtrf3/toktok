package X;

import com.google.android.play.core.assetpacks.p2;
import com.google.android.play.core.assetpacks.q;
import com.google.android.play.core.assetpacks.q0;

/* renamed from: X.Qso, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68394Qso implements InterfaceC68405Qsz, InterfaceC153055zZ, ITR {
    public final Object LJLIL;
    public final Object LJLILLLLZI;

    @Override // X.ITR
    public final synchronized void LIZJ() {
        ((C79000UzU) this.LJLIL).getClass();
        C47187IfX.LIZIZ(null, (String) this.LJLILLLLZI, true);
        throw null;
    }

    @Override // X.ITR
    public final synchronized void LIZLLL() {
        LIZJ();
        throw null;
    }

    @Override // X.ITR
    public final synchronized void LJ() {
        C79000UzU c79000UzU = (C79000UzU) this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.LJLILLLLZI);
        LIZ.append("-end");
        c79000UzU.LIZIZ(X1D.LIZIZ(LIZ));
        throw null;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        return new q(((p2) ((InterfaceC153055zZ) this.LJLIL)).a(), (q0) ((InterfaceC153055zZ) this.LJLILLLLZI).a());
    }

    @Override // X.ITR
    public final synchronized void end() {
        ((C79000UzU) this.LJLIL).getClass();
        C47187IfX.LIZIZ(null, (String) this.LJLILLLLZI, false);
        throw null;
    }

    @Override // X.InterfaceC68405Qsz
    public final C68377QsX LIZ(InterfaceC68379QsZ interfaceC68379QsZ) {
        ((C68377QsX) this.LJLIL).LJ((String) this.LJLILLLLZI, interfaceC68379QsZ);
        return (C68377QsX) this.LJLIL;
    }

    public /* synthetic */ C68394Qso(Object obj, Object obj2) {
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
    }
}
