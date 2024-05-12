package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.792, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass792 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Object, C76800UCe> {
    public static final AnonymousClass792 LJLIL = new AnonymousClass792();

    public AnonymousClass792() {
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
