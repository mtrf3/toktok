package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountTipsViewDelegate;
import com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G3P implements IPrivateAccountTipsView {
    public static final G3P LIZIZ = new G3P();
    public final /* synthetic */ IPrivateAccountTipsView LIZ;

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final View LIZ(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return this.LIZ.LIZ(inflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void LIZIZ(View view, InterfaceC239229aA interfaceC239229aA) {
        o.LJIIIZ(view, "view");
        this.LIZ.LIZIZ(view, interfaceC239229aA);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onCreate(Bundle bundle) {
        this.LIZ.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onDestroyView() {
        this.LIZ.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onResume() {
        this.LIZ.onResume();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onStop() {
        this.LIZ.onStop();
    }

    public G3P() {
        IPrivateAccountTipsView iPrivateAccountTipsView;
        Object LIZ = C58096Mr6.LIZ(IPrivateAccountTipsView.class, false);
        if (LIZ != null) {
            iPrivateAccountTipsView = (IPrivateAccountTipsView) LIZ;
        } else {
            if (C58096Mr6.LJLJJI == null) {
                synchronized (IPrivateAccountTipsView.class) {
                    if (C58096Mr6.LJLJJI == null) {
                        C58096Mr6.LJLJJI = new PrivateAccountTipsViewDelegate();
                    }
                }
            }
            iPrivateAccountTipsView = C58096Mr6.LJLJJI;
        }
        this.LIZ = iPrivateAccountTipsView;
    }
}
