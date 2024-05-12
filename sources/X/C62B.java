package X;

import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.62B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62B implements InterfaceC45863HzH {
    public final Activity LJLIL;

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        if (((Boolean) HXY.LIZ.getValue()).booleanValue()) {
            WeakReference weakReference = new WeakReference(this.LJLIL);
            if (C1537361p.LIZ != null) {
                Activity activity = (Activity) weakReference.get();
                if (activity != null && !activity.isFinishing()) {
                    int i = 0;
                    do {
                        ((ArrayList) C1537361p.LIZIZ).add(new C1536261e(activity));
                        i++;
                    } while (i < 11);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("preLoadEditToolBarItem: ");
                LIZ.append(((ArrayList) C1537361p.LIZIZ).size());
                LIZ.append(" items.");
                H7B.LIZIZ("EditorPreloadViewManager", X1D.LIZIZ(LIZ));
            }
        }
        if (C165126dw.LIZ()) {
            ExecutorC149205tM.LJLILLLLZI.execute(new ARunnableS38S0100000_2(this, UserLevelGeckoUpdateSetting.DEFAULT));
        }
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P1;
    }

    public C62B(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
    }
}
