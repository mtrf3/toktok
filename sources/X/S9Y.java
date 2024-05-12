package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9Y extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final S9Y LJLIL = new S9Y();

    public S9Y() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View llRow5 = null;
        if (booleanValue) {
            if (containerView != null) {
                llRow5 = containerView.findViewById(R.id.g19);
            }
            o.LJIIIIZZ(llRow5, "llRow5");
            OUP.LJJLIIIJ(llRow5);
        } else {
            if (containerView != null) {
                llRow5 = containerView.findViewById(R.id.g19);
            }
            o.LJIIIIZZ(llRow5, "llRow5");
            OUP.LJIJJLI(llRow5);
        }
        return C76800UCe.LIZ;
    }
}
