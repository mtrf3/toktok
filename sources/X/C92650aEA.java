package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aEA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92650aEA extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C92650aEA LJLIL = new C92650aEA();

    public C92650aEA() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Boolean bool) {
        View view;
        int i;
        int i2;
        UIAssem selectSubscribe = uIAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View view2 = null;
        if (containerView != null) {
            view = containerView.findViewById(R.id.c3);
        } else {
            view = null;
        }
        TuxIconView tuxIconView = (TuxIconView) view;
        C2068389v c2068389v = new C2068389v();
        if (booleanValue) {
            i = R.raw.icon_chevron_up_fill;
        } else {
            i = R.raw.icon_chevron_down_fill;
        }
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.gx);
        tuxIconView.setTuxIcon(c2068389v);
        View containerView2 = selectSubscribe.getContainerView();
        if (containerView2 != null) {
            view2 = containerView2.findViewById(R.id.hp);
        }
        if (booleanValue) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        return C76800UCe.LIZ;
    }
}
