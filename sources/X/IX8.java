package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IX8 {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ IX8() {
        this.LIZ = new ArrayList();
        this.LIZIZ = new ArrayList();
    }

    public IX8(Looper looper) {
        Object value = IZ8.k.getValue();
        o.LJIIIIZZ(value, "<get-enableUseCustomOrderlyHandler>(...)");
        if (((Boolean) value).booleanValue()) {
            this.LIZIZ = IXE.LIZ;
        } else {
            this.LIZ = new HandlerC46761IWv(looper);
        }
    }

    public final void LIZ(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        Object obj = this.LIZIZ;
        if (obj != null) {
            ((HandlerC46799IYh) obj).LIZ(runnable);
        } else {
            ((Handler) this.LIZ).post(runnable);
        }
    }

    public final synchronized void LIZIZ(C37631Epn c37631Epn, InterfaceC66095Pwp interfaceC66095Pwp) {
        ((ArrayList) this.LIZ).add(c37631Epn);
        ((ArrayList) this.LIZIZ).add(interfaceC66095Pwp);
    }

    public final synchronized void LIZJ(C37631Epn c37631Epn, C66098Pws c66098Pws) {
        int indexOf = ((ArrayList) this.LIZ).indexOf(c37631Epn);
        if (indexOf >= 0 && c66098Pws == ListProtector.get((ArrayList) this.LIZIZ, indexOf)) {
            ListProtector.remove((ArrayList) this.LIZ, indexOf);
            ListProtector.remove((ArrayList) this.LIZIZ, indexOf);
        }
    }
}
