package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes7.dex */
public final class G49 extends G4A {
    public final boolean LJIILL() {
        InterfaceC28616BKy interfaceC28616BKy;
        InterfaceC28616BKy interfaceC28616BKy2;
        Iterator<InterfaceC28616BKy> it = LJIILJJIL().LIZ().iterator();
        while (true) {
            interfaceC28616BKy = null;
            if (it.hasNext()) {
                interfaceC28616BKy2 = it.next();
                if (interfaceC28616BKy2 instanceof C40106Foc) {
                    break;
                }
            } else {
                interfaceC28616BKy2 = null;
                break;
            }
        }
        if (interfaceC28616BKy2 instanceof C40106Foc) {
            interfaceC28616BKy = interfaceC28616BKy2;
        }
        C40106Foc c40106Foc = (C40106Foc) interfaceC28616BKy;
        if (c40106Foc != null) {
            return c40106Foc.LJLIL;
        }
        return false;
    }

    @Override // X.G48, X.InterfaceC87439YTj
    public final void LJIIIIZZ(FragmentManager fm, BaseFragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.LJIIIIZZ(fm, f);
        EventBus LIZJ = EventBus.LIZJ();
        if (LJIILL() && LIZJ.LJI(f)) {
            LIZJ.LJIJ(f);
        }
    }

    @Override // X.G48, X.InterfaceC87439YTj
    public final void LJFF(FragmentManager fm, BaseFragment f, View v, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        super.LJFF(fm, f, v, bundle);
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(f) && LJIILL()) {
            LIZJ.LJIILJJIL(f);
        }
    }
}
