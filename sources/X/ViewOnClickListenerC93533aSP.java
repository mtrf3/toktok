package X;

import android.view.View;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: X.aSP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93533aSP implements View.OnClickListener {
    public final /* synthetic */ InstallActivity LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public ViewOnClickListenerC93533aSP(InstallActivity installActivity) {
        this.LJLIL = installActivity;
    }

    public ViewOnClickListenerC93533aSP(InstallActivity installActivity, int i) {
        this.LJLILLLLZI = 1;
        this.LJLIL = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLILLLLZI != 0) {
            this.LJLIL.finishWithFailure(new UnavailableUserDeclinedInstallationException());
        } else {
            this.LJLIL.animateToSpinner();
            this.LJLIL.startInstaller();
        }
    }
}
