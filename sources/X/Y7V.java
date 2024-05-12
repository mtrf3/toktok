package X;

import com.bytedance.lynx.hybrid.settings.SettingsConfig;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y7V implements InterfaceC40042Fna {
    public final /* synthetic */ Y7W LIZ;

    public Y7V(Y7W y7w) {
        this.LIZ = y7w;
    }

    @Override // X.InterfaceC40042Fna
    public final void LIZ(String reason) {
        o.LJIIJ(reason, "reason");
        Iterator<InterfaceC86859Y7b> it = this.LIZ.LJFF.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZ(reason);
            } catch (Throwable th) {
                C39048FUe.LIZIZ.LIZ(C25620zW.LIZ("onFetchFailed callback failed ", th), EnumC39866Fkk.E, "HybridSettings");
            }
        }
        this.LIZ.LIZLLL.set(false);
        this.LIZ.LIZLLL(false);
    }

    @Override // X.InterfaceC40042Fna
    public final void LIZIZ(String str) {
        SettingsConfig settingsConfig = this.LIZ.LIZJ;
        if (settingsConfig != null) {
            C39867Fkl parseConfig = settingsConfig.parseConfig(str);
            if (parseConfig != null) {
                Y7R y7r = this.LIZ.LIZ;
                if (y7r != null) {
                    y7r.LIZLLL(parseConfig);
                    return;
                } else {
                    o.LJIJI("settingsData");
                    throw null;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("could not parse content: ");
            LIZ.append(str);
            LIZ(X1D.LIZIZ(LIZ));
        }
    }
}
