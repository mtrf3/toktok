package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JXv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49335JXv extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC49333JXt LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        int i = 0;
        if (z) {
            ViewOnAttachStateChangeListenerC49333JXt viewOnAttachStateChangeListenerC49333JXt = this.LJLLILLLL;
            TuxTextView tuxTextView = viewOnAttachStateChangeListenerC49333JXt.LJLIL;
            Integer LIZIZ = C19N.LIZIZ(viewOnAttachStateChangeListenerC49333JXt.itemView, "itemView.context", R.attr.de);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            }
            tuxTextView.setBackgroundColor(i);
            return;
        }
        ViewOnAttachStateChangeListenerC49333JXt viewOnAttachStateChangeListenerC49333JXt2 = this.LJLLILLLL;
        TuxTextView tuxTextView2 = viewOnAttachStateChangeListenerC49333JXt2.LJLIL;
        Integer LIZIZ2 = C19N.LIZIZ(viewOnAttachStateChangeListenerC49333JXt2.itemView, "itemView.context", R.attr.cf);
        if (LIZIZ2 != null) {
            i = LIZIZ2.intValue();
        }
        tuxTextView2.setBackgroundColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49335JXv(ViewOnAttachStateChangeListenerC49333JXt viewOnAttachStateChangeListenerC49333JXt, Context context) {
        super(context);
        this.LJLLILLLL = viewOnAttachStateChangeListenerC49333JXt;
        o.LJIIIIZZ(context, "context");
    }
}
