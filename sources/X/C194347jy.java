package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nows.feed.ui.userrow.NowPostUserRowAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194347jy extends AbstractC65781Prl implements InterfaceC88471Ynr<NowPostUserRowAssem, Integer, C76800UCe> {
    public static final C194347jy LJLIL = new C194347jy();

    public C194347jy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowPostUserRowAssem nowPostUserRowAssem, Integer num) {
        NowPostUserRowAssem selectSubscribe = nowPostUserRowAssem;
        Integer num2 = num;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (num2 != null) {
            View containerView = selectSubscribe.getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = num2.intValue();
                containerView.setLayoutParams(layoutParams);
                selectSubscribe.getContainerView().setPadding(0, 0, 0, 0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return C76800UCe.LIZ;
    }
}
