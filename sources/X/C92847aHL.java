package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aHL, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92847aHL extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C92847aHL LJLIL = new C92847aHL();

    public C92847aHL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        View view;
        int i;
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.d0);
        } else {
            view = null;
        }
        if (booleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        return C76800UCe.LIZ;
    }
}
