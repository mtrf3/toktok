package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.otis.ultimate.inflater.compat.lifecycle.AndroidXLifecycleOwner;

/* loaded from: classes7.dex */
public final class FEP implements FEI {
    @Override // X.FEI
    public final AndroidXLifecycleOwner LIZ(Activity activity) {
        if (activity instanceof LifecycleOwner) {
            return new AndroidXLifecycleOwner(activity);
        }
        return null;
    }
}
