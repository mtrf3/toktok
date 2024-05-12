package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188227a6 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, List<? extends C188067Zq>, C76800UCe> {
    public static final C188227a6 LJLIL = new C188227a6();

    public C188227a6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, List<? extends C188067Zq> list) {
        boolean z;
        View view;
        UIAssem selectSubscribe = uIAssem;
        List<? extends C188067Zq> list2 = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.gwg);
        } else {
            view = null;
        }
        ((C252709vu) view).LJIJ("nav_bar_end_btn", new AqS8S0010000_3(z, 19));
        return C76800UCe.LIZ;
    }
}
