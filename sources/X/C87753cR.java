package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3cR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87753cR extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C87753cR LJLIL = new C87753cR();

    public C87753cR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.j91);
        } else {
            view = null;
        }
        SY4 sy4 = (SY4) view;
        if (sy4 != null) {
            sy4.setEnabled(booleanValue);
        }
        return C76800UCe.LIZ;
    }
}
