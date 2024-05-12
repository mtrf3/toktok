package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aIb, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92925aIb extends AbstractC65781Prl implements InterfaceC88473Ynt<UIAssem, EnumC91916a2K, Boolean, C76800UCe> {
    public static final C92925aIb LJLIL = new C92925aIb();

    public C92925aIb() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(UIAssem uIAssem, EnumC91916a2K status, Boolean bool) {
        View view;
        boolean z;
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.eo);
        } else {
            view = null;
        }
        SY4 sy4 = (SY4) view;
        if (status == EnumC91916a2K.LOADING && booleanValue) {
            z = true;
        } else {
            z = false;
        }
        sy4.setLoading(z);
        return C76800UCe.LIZ;
    }
}
