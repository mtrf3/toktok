package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7BS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BS extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends C7BY>, C76800UCe> {
    public static final C7BS LJLIL = new C7BS();

    public C7BS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends C7BY> c43i) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends C7BY> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ != 0) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.bfc);
            } else {
                view = null;
            }
            view.performClick();
        }
        return C76800UCe.LIZ;
    }
}
