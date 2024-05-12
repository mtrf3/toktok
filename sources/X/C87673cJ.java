package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87673cJ extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C87673cJ LJLIL = new C87673cJ();

    public C87673cJ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View view = null;
        if (!booleanValue) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.ky7);
            }
            C17N.LJJIIJZLJL(view);
        } else {
            View containerView2 = selectSubscribe.getContainerView();
            if (containerView2 != null) {
                view = containerView2.findViewById(R.id.ky7);
            }
            C17N.LJJLIIIJJI(view);
        }
        return C76800UCe.LIZ;
    }
}
