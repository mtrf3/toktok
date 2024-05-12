package X;

import android.app.Application;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import kotlin.jvm.internal.o;

/* renamed from: X.6m8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170206m8 {
    public Object LIZ;

    public C170206m8(int i) {
        if (i != 2) {
            return;
        }
        this.LIZ = new C245589kQ(20);
    }

    public final void LIZ(IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (this.LIZ == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            this.LIZ = C84488XDw.LIZ(application, null);
        }
        InterfaceC84498XEg interfaceC84498XEg = (InterfaceC84498XEg) this.LIZ;
        if (interfaceC84498XEg != null) {
            interfaceC84498XEg.LJI("editingeffect", false, iFetchEffectChannelListener);
        }
    }
}
