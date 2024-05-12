package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RmL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70541RmL extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public static final C70541RmL LJLIL = new C70541RmL();

    public C70541RmL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Integer num) {
        View view;
        boolean z;
        UIAssem selectSubscribe = uIAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.e3b);
        } else {
            view = null;
        }
        C70540RmK c70540RmK = (C70540RmK) view;
        if (intValue != -1) {
            z = true;
        } else {
            z = false;
        }
        c70540RmK.setCloseStyle(z);
        return C76800UCe.LIZ;
    }
}
