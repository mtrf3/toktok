package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JJI extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ C48948JIy LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        ColorDrawable colorDrawable;
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            View view = this.LJLLILLLL.LJLLL;
            if (z) {
                Integer LJI = C79045V0n.LJI(R.attr.df, this.LJLLILLLL.getContext());
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                colorDrawable = new ColorDrawable(i);
            } else {
                colorDrawable = null;
            }
            view.setForeground(colorDrawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JJI(C48948JIy c48948JIy, Context context) {
        super(context);
        this.LJLLILLLL = c48948JIy;
        o.LJIIIIZZ(context, "context");
    }
}
