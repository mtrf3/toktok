package X;

import com.bytedance.helios.api.config.AnchorInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PxU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66136PxU {
    public final java.util.Map<String, RunnableC66122PxG> LIZ = new LinkedHashMap();

    public abstract String LIZIZ();

    public abstract boolean LIZJ(AnchorInfoModel anchorInfoModel, Object obj);

    public abstract boolean LJ();

    public void LIZ(AnchorInfoModel anchorInfoModel, Object obj, String key) {
        o.LJIIIZ(key, "key");
        LJI(key, obj, "addAnchorRunnable");
        if (LJFF(anchorInfoModel, obj, "Add")) {
            return;
        }
        LJII(key, anchorInfoModel, obj, anchorInfoModel.resourceIds);
    }

    public List<C66120PxE> LIZLLL(List<C66120PxE> list, AnchorInfoModel model, Object obj) {
        o.LJIIIZ(model, "model");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (model.resourcePages.contains(((C66120PxE) next).LJLLI) || (LJ() && model.resourcePages.isEmpty())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean LJFF(AnchorInfoModel model, Object obj, String str) {
        boolean z;
        o.LJIIIZ(model, "model");
        CopyOnWriteArrayList<C66155Pxn> copyOnWriteArrayList = C66137PxV.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<C66155Pxn> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().LJLJI, arrayList);
        }
        java.util.Set LLJJ = ORZ.LLJJ(arrayList);
        boolean contains = model.skipAnchorActions.contains("floating_window_view");
        boolean z2 = true;
        boolean z3 = !ORZ.LJZI(LLJJ, model.resourcePages).isEmpty();
        if (LJ() && (!LLJJ.isEmpty()) && model.resourcePages.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!contains || (!z3 && !z)) {
            z2 = false;
        }
        if (z2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("anchorType=");
            LIZ.append(LIZIZ());
            LIZ.append(" needSkipAddOrRunAnchorCheck tag=");
            LIZ.append(str);
            LIZ.append(" needSkipByFloatingView=");
            LIZ.append(z2);
            LIZ.append(" model=");
            LIZ.append(model);
            C66063PwJ.LIZIZ("Helios-Detection-Task", X1D.LIZIZ(LIZ));
        } else {
            z2 = LIZJ(model, obj);
            if (z2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("anchorType=");
                LIZ2.append(LIZIZ());
                LIZ2.append(" needSkipAddOrRunAnchorCheck tag=");
                LIZ2.append(str);
                LIZ2.append(" needCustomSkipAddOrRunAnchorCheck=");
                LIZ2.append(z2);
                LIZ2.append(" model=");
                LIZ2.append(model);
                C66063PwJ.LIZIZ("Helios-Detection-Task", X1D.LIZIZ(LIZ2));
            }
        }
        return z2;
    }

    public void LJI(String key, Object obj, String tag) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(tag, "tag");
        RunnableC66122PxG runnableC66122PxG = (RunnableC66122PxG) ((LinkedHashMap) this.LIZ).get(key);
        if (runnableC66122PxG != null) {
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.removeCallbacks(runnableC66122PxG);
            this.LIZ.remove(key);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("anchorType=");
            LIZ.append(LIZIZ());
            LIZ.append(" removeAnchorRunnable key=");
            LIZ.append(key);
            LIZ.append(" tag=");
            LIZ.append(tag);
            C66063PwJ.LIZIZ("Helios-Detection-Task", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJII(String key, AnchorInfoModel model, Object obj, List<String> checkResourceIds) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(checkResourceIds, "checkResourceIds");
        RunnableC66122PxG runnableC66122PxG = new RunnableC66122PxG(this, model, obj, checkResourceIds);
        this.LIZ.put(key, runnableC66122PxG);
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.postDelayed(runnableC66122PxG, model.anchorTimeDelay);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchorType=");
        LIZ.append(LIZIZ());
        LIZ.append(" addAnchorRunnable key=");
        LIZ.append(key);
        LIZ.append(" resourceIds=");
        LIZ.append(checkResourceIds);
        LIZ.append(" model=");
        LIZ.append(model);
        C66063PwJ.LIZIZ("Helios-Detection-Task", X1D.LIZIZ(LIZ));
    }
}
