package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9L extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final S9L LJLIL = new S9L();

    public S9L() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View llRow2 = null;
        if (booleanValue) {
            if (containerView != null) {
                llRow2 = containerView.findViewById(R.id.g16);
            }
            o.LJIIIIZZ(llRow2, "llRow2");
            OUP.LJJLIIIJ(llRow2);
        } else {
            if (containerView != null) {
                llRow2 = containerView.findViewById(R.id.g16);
            }
            o.LJIIIIZZ(llRow2, "llRow2");
            OUP.LJIJJLI(llRow2);
        }
        return C76800UCe.LIZ;
    }
}
