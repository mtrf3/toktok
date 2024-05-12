package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213708a6 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C213708a6 LJLIL = new C213708a6();

    public C213708a6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        int i;
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (booleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        containerView.setVisibility(i);
        return C76800UCe.LIZ;
    }
}
