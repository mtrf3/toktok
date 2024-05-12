package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.detail.filter.component.cell.FilterContentMaskComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242009ee extends AbstractC65781Prl implements InterfaceC88471Ynr<FilterContentMaskComponent, C43I<? extends String>, C76800UCe> {
    public static final C242009ee LJLIL = new C242009ee();

    public C242009ee() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FilterContentMaskComponent filterContentMaskComponent, C43I<? extends String> c43i) {
        View view;
        FilterContentMaskComponent selectSubscribe = filterContentMaskComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.LLI == null) {
            Object parent = selectSubscribe.getContainerView().getParent();
            View view2 = null;
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                view2 = view.findViewById(R.id.cover);
            }
            selectSubscribe.LLI = view2;
        }
        View view3 = selectSubscribe.LLI;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        selectSubscribe.Y3().animate().alpha(0.0f).setDuration(150L).start();
        return C76800UCe.LIZ;
    }
}
