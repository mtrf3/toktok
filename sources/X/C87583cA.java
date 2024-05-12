package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3cA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87583cA extends AbstractC65781Prl implements InterfaceC88473Ynt<UIAssem, List<? extends InterfaceC57784Mm4>, Object, C76800UCe> {
    public static final C87583cA LJLIL = new C87583cA();

    public C87583cA() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(UIAssem uIAssem, List<? extends InterfaceC57784Mm4> list, Object obj) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        List<? extends InterfaceC57784Mm4> list2 = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(list2, "list");
        o.LJIIIZ(obj, "<anonymous parameter 1>");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.hqp);
        } else {
            view = null;
        }
        ((SYL) view).getState().LJIILLIIL(list2);
        return C76800UCe.LIZ;
    }
}
