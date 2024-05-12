package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7FU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7FU extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C7FU LJLIL = new C7FU();

    public C7FU() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Boolean> c43i) {
        View view;
        int i;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.nh8);
            } else {
                view = null;
            }
            C8IC c8ic = (C8IC) view;
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            c8ic.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }
}
