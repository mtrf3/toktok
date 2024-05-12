package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JJl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48961JJl extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ View LJLLILLLL;
    public final /* synthetic */ JNU LJLLJ;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        ColorDrawable colorDrawable;
        int i;
        View view = this.LJLLILLLL;
        if (view == null) {
            return;
        }
        if (z) {
            Integer LIZIZ = C19N.LIZIZ(this.LJLLJ.itemView, "itemView.context", R.attr.de);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            } else {
                i = 0;
            }
            colorDrawable = new ColorDrawable(i);
        } else {
            colorDrawable = null;
        }
        view.setBackground(colorDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48961JJl(View view, JNU jnu, Context context) {
        super(context);
        this.LJLLILLLL = view;
        this.LJLLJ = jnu;
        o.LJIIIIZZ(context, "context");
    }
}
