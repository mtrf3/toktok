package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Adt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26701Adt extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public static final C26701Adt LJLIL = new C26701Adt();

    public C26701Adt() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Integer num) {
        View findViewById;
        View findViewById2;
        UIAssem selectSubscribe = uIAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue < C27162AlK.LIZIZ) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null && (findViewById2 = containerView.findViewById(R.id.le_)) != null) {
                C45804HyK.LJJIJIIJIL(findViewById2);
            }
        } else {
            View containerView2 = selectSubscribe.getContainerView();
            if (containerView2 != null && (findViewById = containerView2.findViewById(R.id.le_)) != null) {
                C45804HyK.LJJLL(findViewById);
            }
        }
        return C76800UCe.LIZ;
    }
}
