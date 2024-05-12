package X;

import android.os.Build;
import android.os.Bundle;
import java.io.PrintStream;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.FoQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40094FoQ extends G46 {
    public final String LIZJ = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    public final void LJIILL(Bundle bundle) {
        java.util.Set<String> keySet;
        Bundle bundle2;
        if (Build.VERSION.SDK_INT == 29 && bundle != null && ((Boolean) C40095FoR.LIZ.getValue()).booleanValue()) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bundle's classloader:");
            LIZ.append(bundle.getClassLoader());
            LIZ.append(",now set it to ");
            LIZ.append(C40094FoQ.class.getClassLoader());
            printStream.println(X1D.LIZIZ(LIZ));
            bundle.setClassLoader(C40094FoQ.class.getClassLoader());
            Bundle bundle3 = bundle.getBundle(this.LIZJ);
            if (bundle3 != null && (keySet = bundle3.keySet()) != null) {
                Iterator<String> it = keySet.iterator();
                while (it.hasNext()) {
                    Object LLJJIII = C16880lQ.LLJJIII(bundle3, it.next());
                    if ((LLJJIII instanceof Bundle) && (bundle2 = (Bundle) LLJJIII) != null) {
                        bundle2.setClassLoader(C40094FoQ.class.getClassLoader());
                    }
                }
            }
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onPreRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        LJIILL(savedInstanceState);
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityPreCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        LJIILL(bundle);
    }
}
