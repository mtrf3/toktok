package X;

import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60937Nvp {
    public final CopyOnWriteArrayList<InterfaceC60949Nw1> LIZ = new CopyOnWriteArrayList<>();

    public final void LIZ(Fragment fragment, InterfaceC88471Ynr<? super InterfaceC60949Nw1, ? super SparkPopup, C76800UCe> interfaceC88471Ynr) {
        if (!(fragment instanceof SparkPopup) || fragment == null) {
            return;
        }
        Iterator<InterfaceC60949Nw1> it = this.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC60949Nw1 cb = it.next();
            o.LJFF(cb, "cb");
            interfaceC88471Ynr.invoke(cb, fragment);
        }
    }

    public final boolean LIZIZ(Fragment fragment, InterfaceC88471Ynr<? super InterfaceC60949Nw1, ? super SparkPopup, Boolean> interfaceC88471Ynr) {
        if (!(fragment instanceof SparkPopup) || fragment == null) {
            return false;
        }
        Iterator<InterfaceC60949Nw1> it = this.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC60949Nw1 cb = it.next();
            o.LJFF(cb, "cb");
            if (interfaceC88471Ynr.invoke(cb, fragment).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
