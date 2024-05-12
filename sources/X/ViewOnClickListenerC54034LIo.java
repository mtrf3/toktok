package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;

/* renamed from: X.LIo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC54034LIo implements View.OnClickListener {
    public final /* synthetic */ UnloginSignUpFragment LJLIL;

    public ViewOnClickListenerC54034LIo(UnloginSignUpFragment unloginSignUpFragment) {
        this.LJLIL = unloginSignUpFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "RootNode");
            bundle.putBoolean("isSmoothScroll", true);
            C54030LIk.LIZIZ = LJF.GOBACK_ICON.getValue();
            com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).Cv0(bundle, "page_feed");
        }
    }
}
