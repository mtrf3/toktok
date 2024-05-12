package X;

import X.C47183IfT;
import X.IWH;
import X.InterfaceC46330IGg;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.IfT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47183IfT extends C46331IGh {
    public C47183IfT(JGI jgi, JGI jgi2) {
        super(jgi, jgi2);
        final ActivityC45651qj LIZ = C48966JJq.LIZ(jgi);
        if (LIZ != null) {
            LIZ.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.search.autoplay.utils.opt.NonLeakPlayVideoHelper$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public void onDestroy() {
                    LIZ.getLifecycle().removeObserver(this);
                    InterfaceC46330IGg interfaceC46330IGg = C47183IfT.this.LJI;
                    if (interfaceC46330IGg != null) {
                        interfaceC46330IGg.setSurface(null);
                        interfaceC46330IGg.LJJJLL(null);
                        IWH LJJIJIL = interfaceC46330IGg.LJJIJIL();
                        if (LJJIJIL != null) {
                            LJJIJIL.LIZLLL().LJ(null);
                        }
                    }
                }
            });
        }
    }
}
