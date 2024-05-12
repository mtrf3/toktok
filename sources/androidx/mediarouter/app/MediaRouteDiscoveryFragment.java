package androidx.mediarouter.app;

import X.C90101ZXt;
import X.C90580Zgm;
import X.ZY5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes29.dex */
public class MediaRouteDiscoveryFragment extends Fragment {
    public ZY5 LJLIL;
    public C90101ZXt LJLILLLLZI;
    public C90580Zgm LJLJI;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C90580Zgm c90580Zgm = this.LJLJI;
        if (c90580Zgm != null) {
            this.LJLIL.LJI(c90580Zgm);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C90580Zgm c90580Zgm = this.LJLJI;
        if (c90580Zgm != null) {
            this.LJLIL.LIZ(this.LJLILLLLZI, c90580Zgm, 0);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C90580Zgm c90580Zgm = this.LJLJI;
        if (c90580Zgm != null) {
            this.LJLIL.LIZ(this.LJLILLLLZI, c90580Zgm, 4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LJLILLLLZI == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.LJLILLLLZI = C90101ZXt.LIZIZ(arguments.getBundle("selector"));
            }
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = C90101ZXt.LIZJ;
            }
        }
        if (this.LJLIL == null) {
            this.LJLIL = ZY5.LIZJ(getContext());
        }
        C90580Zgm c90580Zgm = new C90580Zgm();
        this.LJLJI = c90580Zgm;
        this.LJLIL.LIZ(this.LJLILLLLZI, c90580Zgm, 0);
    }
}
