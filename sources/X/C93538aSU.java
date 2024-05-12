package X;

import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.google.ar.core.k;

/* renamed from: X.aSU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93538aSU {
    public boolean LIZ;
    public final /* synthetic */ InstallActivity LIZIZ;

    public C93538aSU(InstallActivity installActivity) {
        this.LIZIZ = installActivity;
    }

    public final void LIZ(EnumC93540aSW enumC93540aSW) {
        synchronized (this.LIZIZ) {
            if (this.LIZ) {
                return;
            }
            InstallActivity.access$402(this.LIZIZ, enumC93540aSW);
            int ordinal = enumC93540aSW.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (!this.LIZIZ.waitingForCompletion && k.a().b) {
                            this.LIZIZ.closeInstaller();
                        }
                        this.LIZIZ.finishWithFailure(null);
                    }
                } else {
                    this.LIZIZ.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                }
                this.LIZ = true;
            }
        }
    }

    public final void LIZIZ(Exception exc) {
        synchronized (this.LIZIZ) {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            InstallActivity.access$402(this.LIZIZ, EnumC93540aSW.CANCELLED);
            this.LIZIZ.finishWithFailure(exc);
        }
    }
}
