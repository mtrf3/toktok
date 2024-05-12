package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.aHH, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92843aHH extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C92227a7L, C76800UCe> {
    public static final C92843aHH INSTANCE = new C92843aHH();

    public C92843aHH() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UIAssem subscribe, C92227a7L state) {
        View view;
        int i;
        View view2;
        View view3;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(state, "state");
        View containerView = subscribe.getContainerView();
        View view4 = null;
        if (containerView != null) {
            view = containerView.findViewById(R.id.d_);
        } else {
            view = null;
        }
        if (state.LJLJJL) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        DateFormat dateInstance = DateFormat.getDateInstance(1, C91925a2T.LIZIZ());
        View containerView2 = subscribe.getContainerView();
        if (containerView2 != null) {
            view2 = containerView2.findViewById(R.id.db);
        } else {
            view2 = null;
        }
        String string = subscribe.getContainerView().getContext().getString(R.string.jp8);
        o.LJIIIIZZ(string, "containerView.context.ge…tring.pipo_common_due_on)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{dateInstance.format(Long.valueOf(state.LJLJLLL))}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        ((TextView) view2).setText(LLLZ);
        View containerView3 = subscribe.getContainerView();
        if (containerView3 != null) {
            view3 = containerView3.findViewById(R.id.da);
        } else {
            view3 = null;
        }
        ((TextView) view3).setText(C91925a2T.LIZ(state.LJLJI, state.LJLJLJ));
        View containerView4 = subscribe.getContainerView();
        if (containerView4 != null) {
            view4 = containerView4.findViewById(R.id.de);
        }
        ((TextView) view4).setText(C91925a2T.LIZ(state.LJLJJI, state.LJLJLJ));
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(UIAssem uIAssem, C92227a7L c92227a7L) {
        invoke2(uIAssem, c92227a7L);
        return C76800UCe.LIZ;
    }
}
