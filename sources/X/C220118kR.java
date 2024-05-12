package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8kR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220118kR extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, List<? extends C219988kE>, C76800UCe> {
    public static final C220118kR LJLIL = new C220118kR();

    public C220118kR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, List<? extends C219988kE> list) {
        View view;
        View view2;
        View view3;
        View view4;
        UIAssem selectSubscribe = uIAssem;
        List<? extends C219988kE> list2 = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View containerView = selectSubscribe.getContainerView();
        if (containerView != null) {
            view = containerView.findViewById(R.id.ky7);
        } else {
            view = null;
        }
        ((C74053T4n) view).LJIIIZ();
        if (list2 != null) {
            for (C219988kE c219988kE : list2) {
                View containerView2 = selectSubscribe.getContainerView();
                if (containerView2 != null) {
                    view2 = containerView2.findViewById(R.id.ky7);
                } else {
                    view2 = null;
                }
                C74053T4n tabBar = (C74053T4n) view2;
                o.LJIIIIZZ(tabBar, "tabBar");
                View containerView3 = selectSubscribe.getContainerView();
                if (containerView3 != null) {
                    view3 = containerView3.findViewById(R.id.ky7);
                } else {
                    view3 = null;
                }
                KEI LJII = ((C74053T4n) view3).LJII();
                LJII.LIZ = c219988kE;
                View containerView4 = selectSubscribe.getContainerView();
                if (containerView4 != null) {
                    view4 = containerView4.findViewById(R.id.ky7);
                } else {
                    view4 = null;
                }
                LJII.LIZIZ(view4.getContext().getResources().getString(c219988kE.LJLILLLLZI, Integer.valueOf(c219988kE.LJLJJI.LIZIZ)));
                C74053T4n.LIZJ(tabBar, LJII, 0, c219988kE.LJLJI, 2);
            }
        }
        return C76800UCe.LIZ;
    }
}
