package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8jH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219398jH extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, AddYoursTopic, C76800UCe> {
    public static final C219398jH LJLIL = new C219398jH();

    public C219398jH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, AddYoursTopic addYoursTopic) {
        int i;
        View view;
        UIAssem selectSubscribe = uIAssem;
        AddYoursTopic addYoursTopic2 = addYoursTopic;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        boolean z = false;
        if (addYoursTopic2 != null && addYoursTopic2.getCollectStatus() == 1) {
            i = R.raw.icon_bookmark_fill;
        } else {
            i = R.raw.icon_bookmark;
        }
        if (addYoursTopic2 == null || addYoursTopic2.getCollectStatus() == -1) {
            z = true;
        }
        View view2 = null;
        if (z) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view2 = containerView.findViewById(R.id.bgy);
            }
            C17N.LJJIIJZLJL(view2);
        } else {
            View containerView2 = selectSubscribe.getContainerView();
            if (containerView2 != null) {
                view = containerView2.findViewById(R.id.bgy);
            } else {
                view = null;
            }
            ((TuxIconView) view).setIconRes(i);
            View containerView3 = selectSubscribe.getContainerView();
            if (containerView3 != null) {
                view2 = containerView3.findViewById(R.id.bgy);
            }
            C17N.LJJLIIIJJI(view2);
        }
        return C76800UCe.LIZ;
    }
}
