package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208138Ev implements InterfaceC74147T8d {
    public final Context LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC74147T8d
    public final void LIZJ(RelativeLayout rootView) {
        o.LJIIIZ(rootView, "rootView");
    }

    @Override // X.InterfaceC74147T8d
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC74147T8d
    public final T6Y LIZ(ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        return new C74092T6a(this.LIZ, viewGroup);
    }

    @Override // X.InterfaceC74147T8d
    public final void LIZIZ(RelativeLayout rootView) {
        o.LJIIIZ(rootView, "rootView");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), R.layout.akj, rootView, false);
        C78765Uvh.LIZ((C62846OlW) LLLLIILL.findViewById(R.id.kdh), this.LIZIZ);
        float f = 96;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) KL2.LIZJ(EF7.LIZIZ(), f), (int) KL2.LIZJ(EF7.LIZIZ(), f));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        layoutParams.bottomMargin = (int) KL2.LIZJ(EF7.LIZIZ(), 8);
        rootView.addView(LLLLIILL, layoutParams);
    }

    public C208138Ev(Context context, int i) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = i;
    }
}
