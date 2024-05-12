package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9K extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final S9K LJLIL = new S9K();

    public S9K() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View llRow1 = null;
        if (booleanValue) {
            if (containerView != null) {
                llRow1 = containerView.findViewById(R.id.g15);
            }
            o.LJIIIIZZ(llRow1, "llRow1");
            OUP.LJJLIIIJ(llRow1);
        } else {
            if (containerView != null) {
                llRow1 = containerView.findViewById(R.id.g15);
            }
            o.LJIIIIZZ(llRow1, "llRow1");
            OUP.LJIJJLI(llRow1);
        }
        return C76800UCe.LIZ;
    }
}
