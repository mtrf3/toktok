package X;

import X.C55247LmF;
import X.C85855Xml;
import X.C85857Xmn;
import X.C85858Xmo;
import X.GGC;
import X.InterfaceC55260LmS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.Xmm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85856Xmm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ C85858Xmo LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85856Xmm(LifecycleOwner lifecycleOwner, C85858Xmo c85858Xmo, int i) {
        super(0);
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = c85858Xmo;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        final C85858Xmo c85858Xmo = this.LJLILLLLZI;
        final int i = this.LJLJI;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.track.TrackerChain$attachBTM$1$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (GGC.LIZ[event.ordinal()] == 1) {
                    C85858Xmo c85858Xmo2 = C85858Xmo.this;
                    int i2 = i;
                    ReentrantLock reentrantLock = C85855Xml.LIZ;
                    reentrantLock.lock();
                    try {
                        C85858Xmo c85858Xmo3 = c85858Xmo2.LIZIZ;
                        if (c85858Xmo3 == null) {
                            c85858Xmo3 = C85857Xmn.LIZLLL;
                        }
                        C85858Xmo c85858Xmo4 = c85858Xmo2.LIZJ;
                        c85858Xmo3.LIZJ = c85858Xmo4;
                        if (c85858Xmo4 != null) {
                            c85858Xmo4.LIZIZ = c85858Xmo3;
                        }
                        C55247LmF.LIZJ(c85858Xmo2.LIZ);
                        if (o.LJ(c85858Xmo2, C85855Xml.LIZIZ)) {
                            C85855Xml.LIZIZ = c85858Xmo3;
                        }
                        C85855Xml.LIZJ.remove(Integer.valueOf(i2));
                        CopyOnWriteArrayList<InterfaceC55260LmS<?>> remove = C85855Xml.LIZLLL.remove(c85858Xmo2);
                        if (remove != null) {
                            Iterator<InterfaceC55260LmS<?>> it = remove.iterator();
                            while (it.hasNext()) {
                                C85855Xml.LJ.remove(it.next());
                            }
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }
        });
        return C76800UCe.LIZ;
    }
}
