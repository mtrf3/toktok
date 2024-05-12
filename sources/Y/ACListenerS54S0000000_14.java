package Y;

import X.InterfaceC81043VrL;
import android.view.View;

/* loaded from: classes15.dex */
public class ACListenerS54S0000000_14 implements View.OnClickListener {
    public final int $t;

    public static final void onClick$0(ACListenerS54S0000000_14 aCListenerS54S0000000_14, View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public ACListenerS54S0000000_14(int i) {
        this.$t = i;
    }

    public static final void onClick$1(ACListenerS54S0000000_14 aCListenerS54S0000000_14, View view) {
        if (view.getContext() instanceof InterfaceC81043VrL) {
            ((InterfaceC81043VrL) view.getContext()).LJIL();
        }
    }
}
