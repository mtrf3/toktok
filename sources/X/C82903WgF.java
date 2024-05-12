package X;

import com.google.gson.Gson;
import com.google.gson.e;

/* renamed from: X.WgF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82903WgF extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final C82903WgF LJLIL = new C82903WgF();

    public C82903WgF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        Gson LIZ;
        InterfaceC82904WgG interfaceC82904WgG = C82891Wg3.LJII;
        if (interfaceC82904WgG != null && (LIZ = interfaceC82904WgG.LIZ()) != null) {
            return LIZ;
        }
        return new e().LIZ();
    }
}
