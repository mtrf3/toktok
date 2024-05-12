package X;

import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.O1e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61226O1e extends AbstractC61537ODd {
    public final /* synthetic */ C61227O1f LIZ;
    public final /* synthetic */ O1L LIZIZ;
    public final /* synthetic */ InterfaceC61240O1s LIZJ;
    public final /* synthetic */ List LIZLLL;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
        if (interfaceC61240O1s != null) {
            List list = this.LIZLLL;
            String channel = localPackageModel.getChannel();
            if (channel == null) {
                channel = this.LIZIZ.LJ;
            }
            LJIILLIIL(channel);
            interfaceC61240O1s.LIZIZ(list);
        }
    }

    public final String LJIILLIIL(String str) {
        return this.LIZ.LIZJ(O1F.LIZIZ(C61238O1q.LIZ.LIZ(this.LIZ.LIZIZ), this.LIZIZ.LJIILJJIL).getOfflineDir(), this.LIZIZ.LJIILJJIL, str);
    }

    @Override // X.AbstractC61537ODd
    public final void LIZ(UpdatePackage updatePackage, Throwable th) {
        InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
        if (interfaceC61240O1s != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61240O1s.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
        if (interfaceC61240O1s != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61240O1s.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        boolean z;
        List<Pair<String, Long>> list;
        if (map2 == null || map2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List list2 = this.LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (map != null && (list = map.get(this.LIZIZ.LJIILJJIL)) != null) {
                    Iterator<Pair<String, Long>> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Pair<String, Long> next = it.next();
                        if (o.LJ(obj, next.first)) {
                            if (next == null) {
                            }
                        }
                    }
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next();
                InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
                if (interfaceC61240O1s != null) {
                    interfaceC61240O1s.LIZ(new Throwable("invalid channel"), this.LIZLLL);
                }
            }
            return;
        }
        List list3 = this.LIZLLL;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            List<UpdatePackage> list4 = map2.get(this.LIZIZ.LJIILJJIL);
            if (list4 != null) {
                Iterator<UpdatePackage> it3 = list4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    UpdatePackage next2 = it3.next();
                    if (o.LJ(next2.getChannel(), obj2)) {
                        if (next2 != null) {
                        }
                    }
                }
            }
            arrayList2.add(obj2);
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            String str = (String) it4.next();
            InterfaceC61240O1s interfaceC61240O1s2 = this.LIZJ;
            if (interfaceC61240O1s2 != null) {
                List list5 = this.LIZLLL;
                LJIILLIIL(str);
                interfaceC61240O1s2.LIZIZ(list5);
            }
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable th) {
        InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
        if (interfaceC61240O1s != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61240O1s.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJJI(String str, Throwable th) {
        InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
        if (interfaceC61240O1s != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61240O1s.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILJJIL(long j, String channel) {
        o.LJIIJ(channel, "channel");
        LJIILLIIL(channel);
        InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
        if (interfaceC61240O1s != null) {
            interfaceC61240O1s.LIZIZ(this.LIZLLL);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        InterfaceC61240O1s interfaceC61240O1s = this.LIZJ;
        if (interfaceC61240O1s != null) {
            interfaceC61240O1s.LIZ(th, this.LIZLLL);
        }
    }

    public C61226O1e(C61227O1f c61227O1f, O1L o1l, InterfaceC61240O1s interfaceC61240O1s, List list) {
        this.LIZ = c61227O1f;
        this.LIZIZ = o1l;
        this.LIZJ = interfaceC61240O1s;
        this.LIZLLL = list;
    }
}
