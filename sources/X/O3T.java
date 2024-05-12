package X;

import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O3T implements InterfaceC79289V9x {
    public final C61295O3v LIZ;

    @Override // X.InterfaceC79289V9x
    public final InputStream LIZ() {
        return this.LIZ.U();
    }

    @Override // X.InterfaceC79289V9x
    public final Boolean LIZIZ() {
        return Boolean.valueOf(this.LIZ.LJZL);
    }

    @Override // X.InterfaceC79289V9x
    public final String LIZJ() {
        return this.LIZ.LL.toString();
    }

    @Override // X.InterfaceC79289V9x
    public final byte[] LIZLLL() {
        return this.LIZ.S();
    }

    @Override // X.InterfaceC79289V9x
    public final Object LJ() {
        return this.LIZ.O();
    }

    @Override // X.InterfaceC79289V9x
    public final Integer getErrorCode() {
        return Integer.valueOf(this.LIZ.LL.LIZIZ);
    }

    @Override // X.InterfaceC79289V9x
    public final String getFilePath() {
        return this.LIZ.getFilePath();
    }

    public O3T(C61295O3v response) {
        o.LJIIJ(response, "response");
        this.LIZ = response;
    }
}
