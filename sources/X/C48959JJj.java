package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JJj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48959JJj extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ AbstractC48958JJi LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (z) {
            AbstractC48958JJi abstractC48958JJi = this.LJLLILLLL;
            if (abstractC48958JJi.LJLJJLL) {
                i = R.attr.de;
            } else {
                i = R.attr.df;
            }
            View view = abstractC48958JJi.itemView;
            Integer LIZIZ = C19N.LIZIZ(this.LJLLILLLL.itemView, "itemView.context", i);
            if (LIZIZ != null) {
                i2 = LIZIZ.intValue();
            } else {
                i2 = 0;
            }
            view.setForeground(new ColorDrawable(i2));
            return;
        }
        this.LJLLILLLL.itemView.setForeground(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48959JJj(AbstractC48958JJi abstractC48958JJi, Context context) {
        super(context);
        this.LJLLILLLL = abstractC48958JJi;
        o.LJIIIIZZ(context, "context");
    }
}
