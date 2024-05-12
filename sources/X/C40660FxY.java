package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.FxY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40660FxY implements InterfaceC153055zZ {
    public Object LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    public /* synthetic */ C40660FxY(C40646FxK c40646FxK, InterfaceC153055zZ interfaceC153055zZ, InterfaceC153055zZ interfaceC153055zZ2) {
        this.LJLIL = c40646FxK;
        this.LJLILLLLZI = interfaceC153055zZ;
        this.LJLJI = interfaceC153055zZ2;
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Context context = ((C40646FxK) ((InterfaceC153055zZ) this.LJLIL)).LJLIL.LIZ;
        C40654FxS.LJI(context);
        return new C40542Fve(context, (File) ((InterfaceC153055zZ) this.LJLILLLLZI).a(), (C37109EhN) ((InterfaceC153055zZ) this.LJLJI).a());
    }

    public /* synthetic */ C40660FxY(IWH iwh) {
        C47251IgZ c47251IgZ = new C47251IgZ(iwh);
        this.LJLJI = c47251IgZ;
        this.LJLILLLLZI = new IZ3(iwh);
        this.LJLIL = c47251IgZ;
    }
}
