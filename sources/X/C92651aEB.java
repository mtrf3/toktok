package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aEB, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92651aEB extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, String, C76800UCe> {
    public static final C92651aEB LJLIL = new C92651aEB();

    public C92651aEB() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, String str) {
        TextView textView;
        UIAssem selectSubscribe = uIAssem;
        String it = str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it.length() > 0) {
            String string = selectSubscribe.getContainerView().getContext().getString(R.string.jpa);
            o.LJIIIIZZ(string, "containerView.context.ge…common_statement_details)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(it);
            LIZ.append(' ');
            LIZ.append(string);
            String LIZIZ = X1D.LIZIZ(LIZ);
            View containerView = selectSubscribe.getContainerView();
            View view = null;
            if (containerView != null) {
                view = containerView.findViewById(R.id.la4);
            }
            View LJI = ((C252709vu) view).LJI("billDetailTitleTag");
            if ((LJI instanceof TuxTextView) && (textView = (TextView) LJI) != null) {
                textView.setText(LIZIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
