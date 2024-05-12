package X;

import android.content.Context;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.LwS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnClickListenerC55880LwS implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public DialogInterfaceOnClickListenerC55880LwS(Context context, int i) {
        this.LJLIL = context;
        this.LJLILLLLZI = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ViewOnClickListenerC226978vV viewOnClickListenerC226978vV;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        Context context = this.LJLIL;
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIZ(context, "context");
        C38776FJs.LJIIL().LJIIIZ(context, "key_cross_push_notification_guide", currentTimeMillis);
        Context context2 = this.LJLIL;
        o.LJIIIZ(context2, "context");
        long LIZIZ = C38776FJs.LJIIL().LIZIZ(context2, "key_times_push_notification_guide") + 1;
        Context context3 = this.LJLIL;
        o.LJIIIZ(context3, "context");
        C38776FJs.LJIIL().LJIIIZ(context3, "key_times_push_notification_guide", LIZIZ);
        WeakReference<ViewOnClickListenerC226978vV> weakReference = C55879LwR.LIZLLL;
        if (weakReference != null && (viewOnClickListenerC226978vV = weakReference.get()) != null && viewOnClickListenerC226978vV.getVisibility() == 0) {
            viewOnClickListenerC226978vV.setVisibility(8);
        }
        int i2 = this.LJLILLLLZI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("scene_id", "1001");
        c188727au.LJIIIZ("trigger_method", C55879LwR.LIZIZ(i2));
        FMX.LJIIL("push_pre_permission_deny", c188727au.LIZ);
    }
}
