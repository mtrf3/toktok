package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SBu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71694SBu extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C71694SBu LJLIL = new C71694SBu();

    public C71694SBu() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        Boolean bool2 = bool;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (bool2 != null) {
            bool2.booleanValue();
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.at8);
            } else {
                view = null;
            }
            ((SY4) view).setEnabled(bool2.booleanValue());
        }
        return C76800UCe.LIZ;
    }
}
