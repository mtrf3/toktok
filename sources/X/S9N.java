package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9N extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final S9N LJLIL = new S9N();

    public S9N() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View llRow4 = null;
        if (booleanValue) {
            if (containerView != null) {
                llRow4 = containerView.findViewById(R.id.g18);
            }
            o.LJIIIIZZ(llRow4, "llRow4");
            OUP.LJJLIIIJ(llRow4);
        } else {
            if (containerView != null) {
                llRow4 = containerView.findViewById(R.id.g18);
            }
            o.LJIIIIZZ(llRow4, "llRow4");
            OUP.LJIJJLI(llRow4);
        }
        return C76800UCe.LIZ;
    }
}
