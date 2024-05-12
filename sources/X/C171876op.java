package X;

import android.content.Intent;
import android.os.IBinder;
import com.ss.android.ugc.cut_ui.IBinderWrapper;

/* renamed from: X.6op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171876op {
    public static AbstractBinderC172036p5 LIZ(Intent intent) {
        IBinder iBinder;
        IBinderWrapper iBinderWrapper = (IBinderWrapper) intent.getParcelableExtra("reporter");
        if (iBinderWrapper == null) {
            iBinder = null;
        } else {
            iBinder = iBinderWrapper.iBinder;
        }
        if (!(iBinder instanceof AbstractBinderC172036p5)) {
            return null;
        }
        return (AbstractBinderC172036p5) iBinder;
    }
}
