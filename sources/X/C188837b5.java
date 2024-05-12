package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188837b5 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public static final C188837b5 LJLIL = new C188837b5();

    public C188837b5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Integer num) {
        View view;
        UIAssem selectSubscribe = uIAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.hoy);
        } else {
            view = null;
        }
        C82A c82a = (C82A) view;
        if (c82a != null) {
            c82a.setCurrentNum(intValue + 1);
        }
        return C76800UCe.LIZ;
    }
}
