package X;

import java.io.File;
import org.json.JSONObject;

/* renamed from: X.Lfl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54845Lfl implements InterfaceC54848Lfo, InterfaceC39656FhM {
    @Override // X.InterfaceC39656FhM
    public final void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        C54840Lfg.LJIJI(classLoader, set);
    }

    @Override // X.InterfaceC54848Lfo
    public final void LJ(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC39656FhM
    public final boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return C54840Lfg.LJIJJ(classLoader, file, file2, z, new C46104I7o(), "zip", new C61576OEq());
    }
}
