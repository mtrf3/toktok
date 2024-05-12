package X;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FUy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39068FUy {
    public final void LIZ(Context context) {
        AtomicBoolean atomicBoolean = InitLegoInflate.LJLILLLLZI;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (this) {
            if (atomicBoolean.get()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 24 && context != null) {
                new FrameLayout(context);
            }
            atomicBoolean.set(true);
        }
    }
}
