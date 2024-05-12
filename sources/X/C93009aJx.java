package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aJx, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93009aJx extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, EnumC91916a2K, C76800UCe> {
    public static final C93009aJx LJLIL = new C93009aJx();

    public C93009aJx() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, EnumC91916a2K enumC91916a2K) {
        UIAssem selectSubscribe = uIAssem;
        EnumC91916a2K enumC91916a2K2 = enumC91916a2K;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (enumC91916a2K2 != null) {
            int i = C92091a59.LIZ[enumC91916a2K2.ordinal()];
            View view = null;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    View containerView = selectSubscribe.getContainerView();
                    if (containerView != null) {
                        view = containerView.findViewById(R.id.gf);
                    }
                    ((SY4) view).setLoading(false);
                }
            } else {
                View containerView2 = selectSubscribe.getContainerView();
                if (containerView2 != null) {
                    view = containerView2.findViewById(R.id.gf);
                }
                ((SY4) view).setLoading(true);
            }
        }
        return C76800UCe.LIZ;
    }
}
