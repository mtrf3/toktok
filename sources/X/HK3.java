package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HK3 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public static final HK3 LJLIL = new HK3();

    public HK3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Integer num) {
        View view;
        boolean z;
        UIAssem selectSubscribe = uIAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.j8y);
        } else {
            view = null;
        }
        SY4 sy4 = (SY4) view;
        if (sy4 != null) {
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            sy4.setEnabled(z);
        }
        return C76800UCe.LIZ;
    }
}
