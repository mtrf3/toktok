package androidx.mediarouter.app;

import X.C18Z;
import X.C90101ZXt;
import X.DialogC90914ZmA;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes29.dex */
public class MediaRouteControllerDialogFragment extends DialogFragment {
    public C18Z LJLIL;
    public C90101ZXt LJLILLLLZI;

    public MediaRouteControllerDialogFragment() {
        setCancelable(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C18Z c18z = this.LJLIL;
        if (c18z != null) {
            ((DialogC90914ZmA) c18z).LJJ(false);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C18Z c18z = this.LJLIL;
        if (c18z != null) {
            ((DialogC90914ZmA) c18z).LJJIIZ();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        this.LJLIL = new DialogC90914ZmA(getContext());
        return this.LJLIL;
    }
}
