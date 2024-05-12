package androidx.mediarouter.app;

import X.C18Z;
import X.C90101ZXt;
import X.DialogC90859ZlH;
import X.ZXL;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes29.dex */
public class MediaRouteChooserDialogFragment extends DialogFragment {
    public C18Z LJLIL;
    public C90101ZXt LJLILLLLZI;

    public final void vl() {
        if (this.LJLILLLLZI == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.LJLILLLLZI = C90101ZXt.LIZIZ(arguments.getBundle("selector"));
            }
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = C90101ZXt.LIZJ;
            }
        }
    }

    public MediaRouteChooserDialogFragment() {
        setCancelable(true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C18Z c18z = this.LJLIL;
        if (c18z == null) {
            return;
        }
        c18z.getWindow().setLayout(ZXL.LIZ(c18z.getContext()), -2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        DialogC90859ZlH dialogC90859ZlH = new DialogC90859ZlH(getContext());
        this.LJLIL = dialogC90859ZlH;
        vl();
        dialogC90859ZlH.LJIJJLI(this.LJLILLLLZI);
        return this.LJLIL;
    }
}
