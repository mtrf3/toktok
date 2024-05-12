package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.HpC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45238HpC {
    public static AlertDialogC45239HpD LIZ(Context context, InterfaceC45240HpE loadingListener) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(loadingListener, "loadingListener");
        AlertDialogC45239HpD alertDialogC45239HpD = new AlertDialogC45239HpD(context);
        alertDialogC45239HpD.LJLJLLL = loadingListener;
        alertDialogC45239HpD.setCancelable(false);
        return alertDialogC45239HpD;
    }
}
