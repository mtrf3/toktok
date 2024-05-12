package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8jI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219408jI extends AbstractC65781Prl implements InterfaceC88473Ynt<UIAssem, AddYoursTopic, Float, C76800UCe> {
    public static final C219408jI LJLIL = new C219408jI();

    public C219408jI() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(UIAssem uIAssem, AddYoursTopic addYoursTopic, Float f) {
        View view;
        String str;
        UIAssem selectSubscribe = uIAssem;
        AddYoursTopic addYoursTopic2 = addYoursTopic;
        float floatValue = f.floatValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        View view2 = null;
        if (containerView != null) {
            view = containerView.findViewById(R.id.lan);
        } else {
            view = null;
        }
        TextView textView = (TextView) view;
        if (addYoursTopic2 != null) {
            str = addYoursTopic2.getText();
        } else {
            str = null;
        }
        textView.setText(str);
        View containerView2 = selectSubscribe.getContainerView();
        if (containerView2 != null) {
            view2 = containerView2.findViewById(R.id.lan);
        }
        view2.setAlpha(floatValue);
        return C76800UCe.LIZ;
    }
}
