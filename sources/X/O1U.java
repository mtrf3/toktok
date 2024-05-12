package X;

import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O1U extends O1L {
    public List<String> LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public int LJIJI;

    public O1U() {
        this("");
    }

    @Override // X.O1L
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("\n [fallbackDomains=");
        LIZ.append(this.LJIILL);
        LIZ.append(",shuffle = ");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(",cdnNoCache=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append("，maxAttempt=");
        LIZ.append(this.LJIJ);
        LIZ.append("，isRemote=");
        LIZ.append(false);
        LIZ.append(",useInteraction = ");
        return b0.LIZJ(LIZ, this.LJIJI, ']', LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1U(String accessKey) {
        super(accessKey);
        o.LJIIJ(accessKey, "accessKey");
        this.LJIILL = new ArrayList();
    }

    @Override // X.O1L
    public final void LIZ(O1L config) {
        o.LJIIJ(config, "config");
        if (config instanceof O1U) {
            O1U o1u = (O1U) config;
            this.LJIILL = o1u.LJIILL;
            this.LJIILLIIL = o1u.LJIILLIIL;
            this.LJIIZILJ = o1u.LJIIZILJ;
            this.LJIJ = o1u.LJIJ;
            this.LJIJI = o1u.LJIJI;
        }
        super.LIZ(config);
    }
}
