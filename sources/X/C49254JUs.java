package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JUs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49254JUs extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC49251JUp LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            if (z) {
                ConstraintLayout constraintLayout = this.LJLLILLLL.LJLLLLLL;
                if (constraintLayout != null) {
                    Context context = this.LJLLILLLL.LJLILLLLZI;
                    o.LJIIIIZZ(context, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.df, context);
                    if (LJI != null) {
                        i = LJI.intValue();
                    } else {
                        i = 0;
                    }
                    constraintLayout.setForeground(new ColorDrawable(i));
                    return;
                }
                o.LJIJI("videoMediaGroup");
                throw null;
            }
            ConstraintLayout constraintLayout2 = this.LJLLILLLL.LJLLLLLL;
            if (constraintLayout2 != null) {
                constraintLayout2.setForeground(null);
            } else {
                o.LJIJI("videoMediaGroup");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49254JUs(ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp, ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        this.LJLLILLLL = viewOnAttachStateChangeListenerC49251JUp;
    }
}
