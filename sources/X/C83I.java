package X;

import android.content.Context;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.83I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83I extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C83I LJLIL = new C83I();

    public C83I() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends C76800UCe> c43i) {
        String str;
        UIAssem selectSubscribe = uIAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            C26045AKb c26045AKb = new C26045AKb(selectSubscribe.getContainerView());
            Context context = selectSubscribe.getContext();
            if (context != null) {
                str = context.getString(R.string.g7t);
            } else {
                str = null;
            }
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
