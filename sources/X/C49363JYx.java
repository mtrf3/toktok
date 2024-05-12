package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JYx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49363JYx extends AbstractViewOnTouchListenerC49364JYy {
    public final /* synthetic */ Integer LJLLI;
    public final /* synthetic */ View LJLLILLLL;
    public final /* synthetic */ Integer LJLLJ;

    @Override // X.AbstractViewOnTouchListenerC49364JYy
    public final void LIZ(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (z) {
                if (this.LJLLI != null) {
                    View view = this.LJLLILLLL;
                    view.setForeground(view.getContext().getDrawable(this.LJLLI.intValue()));
                    return;
                } else {
                    this.LJLLILLLL.setForeground(null);
                    return;
                }
            }
            if (this.LJLLJ != null) {
                View view2 = this.LJLLILLLL;
                view2.setForeground(view2.getContext().getDrawable(this.LJLLJ.intValue()));
            } else {
                this.LJLLILLLL.setForeground(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49363JYx(Integer num, View view, Integer num2, Context context) {
        super(context);
        this.LJLLI = num;
        this.LJLLILLLL = view;
        this.LJLLJ = num2;
        o.LJIIIIZZ(context, "context");
    }
}
