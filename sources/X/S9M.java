package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9M extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final S9M LJLIL = new S9M();

    public S9M() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View llRow3 = null;
        if (booleanValue) {
            if (containerView != null) {
                llRow3 = containerView.findViewById(R.id.g17);
            }
            o.LJIIIIZZ(llRow3, "llRow3");
            OUP.LJJLIIIJ(llRow3);
        } else {
            if (containerView != null) {
                llRow3 = containerView.findViewById(R.id.g17);
            }
            o.LJIIIIZZ(llRow3, "llRow3");
            OUP.LJIJJLI(llRow3);
        }
        return C76800UCe.LIZ;
    }
}
