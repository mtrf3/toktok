package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRR implements InterfaceC87394YRq {
    public final YRK LIZ;
    public final List<InterfaceC87394YRq> LIZIZ;

    @Override // X.YRT
    public final void LIZ() {
        Iterator<InterfaceC87394YRq> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // X.YRT
    public final void onDestroy() {
        Iterator<InterfaceC87394YRq> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
    }

    @Override // X.YRT
    public final void onRelease() {
        Iterator<InterfaceC87394YRq> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().onRelease();
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC87394YRq interfaceC87394YRq : this.LIZIZ) {
            if (interfaceC87394YRq instanceof YRF) {
                arrayList.add(interfaceC87394YRq);
            }
        }
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        ((CopyOnWriteArrayList) this.LIZIZ).addAll(arrayList);
    }

    @Override // X.YRT
    public final void onStart() {
        Iterator<InterfaceC87394YRq> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    @Override // X.YRT
    public final void startPrefetchMessage() {
        Iterator<InterfaceC87394YRq> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().startPrefetchMessage();
        }
    }

    public YRR(YRK portal) {
        o.LJIIIZ(portal, "portal");
        this.LIZ = portal;
        this.LIZIZ = new CopyOnWriteArrayList();
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        C35987EAl c35987EAl = configuration.LIZIZ;
        Iterator<Integer> it = c35987EAl.LIZLLL.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    List<InterfaceC87394YRq> list = this.LIZIZ;
                    YRJ yrj = c35987EAl.LIZJ;
                    o.LJI(yrj);
                    ((CopyOnWriteArrayList) list).add(new YRF(this, yrj));
                }
            } else {
                List<InterfaceC87394YRq> list2 = this.LIZIZ;
                YRJ yrj2 = c35987EAl.LIZJ;
                o.LJI(yrj2);
                ((CopyOnWriteArrayList) list2).add(new YRI(this, yrj2));
            }
        }
        Iterator<InterfaceC87394YRq> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(configuration);
        }
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Iterator<InterfaceC87394YRq> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(stopMessageConfig);
        }
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
        Iterator it = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ((YRT) it.next()).LJ(j, currentConfiguration);
        }
    }

    @Override // X.InterfaceC87394YRq
    public final void LIZIZ(long j, C64972Pei request, YMF callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        Iterator<InterfaceC87394YRq> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(j, request, callback);
        }
    }
}
