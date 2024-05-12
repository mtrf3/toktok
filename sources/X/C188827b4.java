package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188827b4 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C188827b4 LJLIL = new C188827b4();

    public C188827b4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View view = null;
        if (booleanValue) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.hoy);
            }
            C82A c82a = (C82A) view;
            if (c82a != null) {
                C1DH.LJIIIZ(c82a, 0L, 3);
            }
        } else {
            View containerView2 = selectSubscribe.getContainerView();
            if (containerView2 != null) {
                view = containerView2.findViewById(R.id.hoy);
            }
            C82A c82a2 = (C82A) view;
            if (c82a2 != null) {
                C1DH.LJIIJ(c82a2);
            }
        }
        return C76800UCe.LIZ;
    }
}
