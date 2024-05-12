package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87953cl extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C87953cl LJLIL = new C87953cl();

    public C87953cl() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        View view;
        int i;
        UIAssem selectSubscribe = uIAssem;
        Boolean bool2 = bool;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.e2_);
            } else {
                view = null;
            }
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }
}
