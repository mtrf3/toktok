package X;

import android.os.Bundle;
import android.os.IBinder;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;

/* loaded from: classes8.dex */
public final class HR8 {
    public static AbstractBinderC44127HTn LIZ(Bundle bundle, String str) {
        IBinder iBinder;
        if (bundle == null) {
            return null;
        }
        IBinderWrapper iBinderWrapper = (IBinderWrapper) bundle.getParcelable(str);
        if (iBinderWrapper != null) {
            iBinder = iBinderWrapper.iBinder;
        } else {
            iBinder = null;
        }
        if (!(iBinder instanceof AbstractBinderC44127HTn)) {
            return null;
        }
        return (AbstractBinderC44127HTn) iBinder;
    }
}
