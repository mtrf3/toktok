package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.HcD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44433HcD implements C15X {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public C44433HcD(C29S c29s, ViewGroup viewGroup) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = c29s;
    }

    @Override // X.C15X
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        o.LJIIIZ(view, "view");
        Context context = this.LJLILLLLZI;
        if (AnonymousClass668.LIZ()) {
            C157226Fa c157226Fa = C157226Fa.LIZ;
            c157226Fa.LJIIL();
            C44432HcC.LIZJ(context, view);
            C44432HcC.LIZIZ(view, c157226Fa.LJIILIIL());
        } else {
            switch (C157236Fb.LIZ.LJIIIZ()) {
                case 1:
                case 4:
                    C44432HcC.LIZJ(context, view);
                    C44432HcC.LIZIZ(view, true);
                    break;
                case 2:
                case 5:
                    C44432HcC.LIZJ(context, view);
                    C44432HcC.LIZIZ(view, true);
                    break;
                case 3:
                case 6:
                    C44432HcC.LIZJ(context, view);
                    C44432HcC.LIZIZ(view, false);
                    break;
                default:
                    C44432HcC.LIZJ(context, view);
                    C44432HcC.LIZIZ(view, false);
                    break;
            }
        }
        if (C44432HcC.LJLIL) {
            this.LJLIL.addView(view);
        }
    }
}
