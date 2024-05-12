package X;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Qh1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67663Qh1 extends LifecycleCallback {
    public final List<WeakReference<InterfaceC67662Qh0<?>>> LJLILLLLZI;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJIIIIZZ() {
        synchronized (this.LJLILLLLZI) {
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                InterfaceC67662Qh0 interfaceC67662Qh0 = (InterfaceC67662Qh0) ((WeakReference) it.next()).get();
                if (interfaceC67662Qh0 != null) {
                    interfaceC67662Qh0.cancel();
                }
            }
            ((ArrayList) this.LJLILLLLZI).clear();
        }
    }

    public C67663Qh1(InterfaceC67296Qb6 interfaceC67296Qb6) {
        super(interfaceC67296Qb6);
        this.LJLILLLLZI = new ArrayList();
        interfaceC67296Qb6.lg("TaskOnStopCallback", this);
    }

    public static C67663Qh1 LJIIIZ(ActivityC45651qj activityC45651qj) {
        InterfaceC67296Qb6 LIZJ = LifecycleCallback.LIZJ(new C67674QhC(activityC45651qj));
        C67663Qh1 c67663Qh1 = (C67663Qh1) LIZJ.U(C67663Qh1.class, "TaskOnStopCallback");
        if (c67663Qh1 == null) {
            return new C67663Qh1(LIZJ);
        }
        return c67663Qh1;
    }

    public final <T> void LJIIJ(InterfaceC67662Qh0<T> interfaceC67662Qh0) {
        synchronized (this.LJLILLLLZI) {
            ((ArrayList) this.LJLILLLLZI).add(new WeakReference(interfaceC67662Qh0));
        }
    }
}
