package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JXo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49328JXo extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC49329JXp LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        int i = 0;
        if (z) {
            ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp = this.LJLLILLLL;
            TuxTextView tuxTextView = viewOnAttachStateChangeListenerC49329JXp.LJLIL;
            Integer LIZIZ = C19N.LIZIZ(viewOnAttachStateChangeListenerC49329JXp.itemView, "itemView.context", R.attr.de);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            }
            tuxTextView.setBackgroundColor(i);
            return;
        }
        ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp2 = this.LJLLILLLL;
        TuxTextView tuxTextView2 = viewOnAttachStateChangeListenerC49329JXp2.LJLIL;
        Integer LIZIZ2 = C19N.LIZIZ(viewOnAttachStateChangeListenerC49329JXp2.itemView, "itemView.context", R.attr.cf);
        if (LIZIZ2 != null) {
            i = LIZIZ2.intValue();
        }
        tuxTextView2.setBackgroundColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49328JXo(ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp, Context context) {
        super(context);
        this.LJLLILLLL = viewOnAttachStateChangeListenerC49329JXp;
        o.LJIIIIZZ(context, "context");
    }
}
