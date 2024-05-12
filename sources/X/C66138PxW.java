package X;

import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.PxW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66138PxW implements InterfaceC66032Pvo {
    public static final C66138PxW LIZJ = new C66138PxW();
    public static C1HQ<String, InterfaceC66176Py8> LIZ = new C1HQ<>();
    public static final List<AbstractC66136PxU> LIZIZ = C47261Igj.LJJIJIL(new C66157Pxp(), new C66156Pxo(), new C66164Pxw(), new C66139PxX(), new C66140PxY());

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        o.LJIIIZ(newSettings, "newSettings");
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<String, InterfaceC66176Py8>> it = LIZ.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().LIZIZ();
        }
        C65929Pu9.LIZ(currentTimeMillis, "AnchorManager.onNewSettings", true);
    }

    public static final void LIZIZ(String id, InterfaceC66176Py8 checker) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(checker, "checker");
        synchronized (LIZJ) {
            C1HQ<String, InterfaceC66176Py8> c1hq = new C1HQ<>(LIZ);
            c1hq.put(id, checker);
            LIZ = c1hq;
        }
    }

    public static List LIZJ(AbstractC66136PxU abstractC66136PxU, Object obj) {
        List list;
        List<String> list2;
        boolean z;
        if (obj instanceof String) {
            list = C47261Igj.LJJIJ(obj);
        } else if (obj instanceof C66155Pxn) {
            list = ORZ.LLJI(((C66155Pxn) obj).LJLJI);
        } else {
            list = null;
        }
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<AnchorInfoModel> list3 = heliosEnvImpl.LJIIJ.anchorConfigs;
        ArrayList arrayList = new ArrayList();
        for (AnchorInfoModel anchorInfoModel : list3) {
            AnchorInfoModel anchorInfoModel2 = anchorInfoModel;
            String LIZIZ2 = abstractC66136PxU.LIZIZ();
            boolean LJ = o.LJ(anchorInfoModel2.anchorType, LIZIZ2);
            boolean LJ2 = o.LJ(LIZIZ2, "floating_view");
            if (!LJ || !LJ2) {
                boolean LJ3 = o.LJ(LIZIZ2, "fragment_cover");
                if (!LJ || !LJ3) {
                    if (o.LJ(LIZIZ2, "main_page")) {
                        list2 = anchorInfoModel2.anchorPages;
                    } else {
                        list2 = anchorInfoModel2.resourcePages;
                    }
                    if (list == null || (!ORZ.LJZI(list, list2).isEmpty())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (LJ && z) {
                    }
                }
            }
            arrayList.add(anchorInfoModel);
        }
        return arrayList;
    }

    public static final void LIZLLL(Object obj, String str) {
        for (AbstractC66136PxU abstractC66136PxU : LIZIZ) {
            List LIZJ2 = LIZJ(abstractC66136PxU, obj);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LIZJ2).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((AnchorInfoModel) next).anchorLifeCycles.contains(str)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AnchorInfoModel anchorInfoModel = (AnchorInfoModel) it2.next();
                abstractC66136PxU.LIZ(anchorInfoModel, obj, anchorInfoModel.resourcePages.toString());
            }
        }
        for (AbstractC66136PxU abstractC66136PxU2 : LIZIZ) {
            List LIZJ3 = LIZJ(abstractC66136PxU2, obj);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((ArrayList) LIZJ3).iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (((AnchorInfoModel) next2).removeAnchorLifecycles.contains(str)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                abstractC66136PxU2.LJI(((AnchorInfoModel) it4.next()).resourcePages.toString(), obj, C0F0.LIZLLL("stopAnchorCheck(", str, ')'));
            }
        }
    }
}
