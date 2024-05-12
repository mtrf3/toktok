package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.791, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass791 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Object, C76800UCe> {
    public static final AnonymousClass791 LJLIL = new AnonymousClass791();

    public AnonymousClass791() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Object obj) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.hqp);
            } else {
                view = null;
            }
            PowerAdapter powerAdapter = ((SYL) view).LLLF;
            powerAdapter.getClass();
            powerAdapter.LLIILZL(new SI2(powerAdapter));
        }
        return C76800UCe.LIZ;
    }
}
