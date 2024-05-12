package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MNI implements OnActivityResultCallback {
    public final /* synthetic */ MNT LJLIL;

    public MNI(MNT mnt) {
        this.LJLIL = mnt;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1101) {
            if (i2 != 11) {
                if (i2 != 12) {
                    return;
                }
                MultiViewModel P = this.LJLIL.P();
                ActivityC45651qj requireActivity = this.LJLIL.getFragment().requireActivity();
                o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                P.ov0(2);
                MS5.LJ(new AqS151S0100000_1(requireActivity, 927));
                return;
            }
            this.LJLIL.P().ov0(2);
        }
    }
}
