package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LEG extends AbstractC65781Prl implements InterfaceC88472Yns<LOX, C76800UCe> {
    public static final LEG LJLIL = new LEG();

    public LEG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LOX lox) {
        LOX updateAllTabsWithAction = lox;
        o.LJIIIZ(updateAllTabsWithAction, "$this$updateAllTabsWithAction");
        TextView customTextView = updateAllTabsWithAction.getCustomTextView();
        if (customTextView != null) {
            customTextView.setTextColor(updateAllTabsWithAction.getContext().getResources().getColor(R.color.bc));
        }
        return C76800UCe.LIZ;
    }
}
