package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SBq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71690SBq extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, List<? extends InterfaceC57784Mm4>, C76800UCe> {
    public static final C71690SBq LJLIL = new C71690SBq();

    public C71690SBq() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, List<? extends InterfaceC57784Mm4> list) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        List<? extends InterfaceC57784Mm4> it = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.hqp);
        } else {
            view = null;
        }
        ((SYL) view).getState().LJIILLIIL(it);
        return C76800UCe.LIZ;
    }
}
