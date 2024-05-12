package X;

import android.content.Intent;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS114S0101000_6;

/* loaded from: classes7.dex */
public final class G4L extends G46 {
    public final <T> T LJIILL(T t, InterfaceC88471Ynr<? super G4N, ? super T, ? extends T> interfaceC88471Ynr) {
        List<InterfaceC28616BKy> LIZ = LJIILJJIL().LIZ();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC28616BKy interfaceC28616BKy : LIZ) {
            if (interfaceC28616BKy instanceof G4N) {
                arrayList.add(interfaceC28616BKy);
            }
        }
        Iterator it = ORZ.LLIILII(arrayList).iterator();
        while (it.hasNext()) {
            t = interfaceC88471Ynr.invoke(it.next(), t);
        }
        return t;
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityReenter(int i, Intent intent) {
        LJIILL(null, new AqS114S0101000_6(i, intent, 0));
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Boolean bool = (Boolean) LJIILL(Boolean.FALSE, new AqS114S0101000_6(i, keyEvent, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
