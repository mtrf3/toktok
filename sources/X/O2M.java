package X;

import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2M extends AbstractC61537ODd {
    public final /* synthetic */ O2H LIZ;
    public final /* synthetic */ O1M LIZIZ;
    public final /* synthetic */ InterfaceC61273O2z LIZJ;
    public final /* synthetic */ List LIZLLL;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
        if (interfaceC61273O2z != null) {
            List list = this.LIZLLL;
            String channel = localPackageModel.getChannel();
            if (channel == null) {
                channel = this.LIZIZ.LJFF;
            }
            LJIILLIIL(channel);
            interfaceC61273O2z.LIZIZ(list);
        }
    }

    public final String LJIILLIIL(String str) {
        return this.LIZ.LIZJ(C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(this.LIZ.LIZIZ), this.LIZIZ.LJIILLIIL).getOfflineDir(), this.LIZIZ.LJIILLIIL, str);
    }

    @Override // X.AbstractC61537ODd
    public final void LIZ(UpdatePackage updatePackage, Throwable th) {
        InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
        if (interfaceC61273O2z != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61273O2z.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
        if (interfaceC61273O2z != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61273O2z.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        List<UpdatePackage> list;
        List list2 = this.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (map2 != null && (list = map2.get(this.LIZIZ.LJIILLIIL)) != null) {
                Iterator<UpdatePackage> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    UpdatePackage next = it.next();
                    if (o.LJ(next.getChannel(), obj)) {
                        if (next != null) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
            if (interfaceC61273O2z != null) {
                List list3 = this.LIZLLL;
                LJIILLIIL(str);
                interfaceC61273O2z.LIZIZ(list3);
            }
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable th) {
        InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
        if (interfaceC61273O2z != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61273O2z.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJJI(String str, Throwable th) {
        InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
        if (interfaceC61273O2z != null) {
            List list = this.LIZLLL;
            if (th == null) {
                th = new Throwable("geckox update failed");
            }
            interfaceC61273O2z.LIZ(th, list);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILJJIL(long j, String channel) {
        o.LJIIJ(channel, "channel");
        C39048FUe.LIZIZ.LIZ("onUpdateSuccess", EnumC39866Fkk.I, "GeckoXResLoadStrategy");
        LJIILLIIL(channel);
        InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
        if (interfaceC61273O2z != null) {
            interfaceC61273O2z.LIZIZ(this.LIZLLL);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        InterfaceC61273O2z interfaceC61273O2z = this.LIZJ;
        if (interfaceC61273O2z != null) {
            interfaceC61273O2z.LIZ(th, this.LIZLLL);
        }
    }

    public O2M(O2H o2h, O1M o1m, InterfaceC61273O2z interfaceC61273O2z, List list) {
        this.LIZ = o2h;
        this.LIZIZ = o1m;
        this.LIZJ = interfaceC61273O2z;
        this.LIZLLL = list;
    }
}
