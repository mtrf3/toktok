package X;

import android.os.Handler;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.EbC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnAttachStateChangeListenerC36726EbC implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C36725EbB LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        try {
            Object obj = this.LJLILLLLZI.LJLIL.get(this.LJLIL);
            C36725EbB c36725EbB = this.LJLILLLLZI;
            if (c36725EbB.LJLILLLLZI == null) {
                c36725EbB.LJLILLLLZI = EWF.LIZ(obj.getClass(), "mHandler");
            }
            Handler handler = (Handler) this.LJLILLLLZI.LJLILLLLZI.get(obj);
            Field LIZ = EWF.LIZ(Handler.class, "mCallback");
            Handler.Callback callback = (Handler.Callback) LIZ.get(handler);
            if (callback != null && callback.getClass().getName().equals(C36727EbD.class.getName())) {
                F8X.LIZ();
            } else {
                LIZ.set(handler, new C36727EbD(handler));
                F8X.LIZ();
            }
        } catch (Throwable unused) {
        }
    }

    public ViewOnAttachStateChangeListenerC36726EbC(C36725EbB c36725EbB, View view) {
        this.LJLILLLLZI = c36725EbB;
        this.LJLIL = view;
    }
}
