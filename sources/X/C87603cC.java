package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3cC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87603cC extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, List<? extends InterfaceC57784Mm4>, C76800UCe> {
    public static final C87603cC LJLIL = new C87603cC();

    public C87603cC() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, List<? extends InterfaceC57784Mm4> list) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        List<? extends InterfaceC57784Mm4> list2 = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (list2 != null) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.hqp);
            } else {
                view = null;
            }
            ((SYL) view).getState().LJIILLIIL(list2);
        }
        return C76800UCe.LIZ;
    }
}
