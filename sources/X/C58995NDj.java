package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NDj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58995NDj extends AbstractC60811Ntn {
    public boolean LJLILLLLZI = true;
    public final /* synthetic */ C58993NDh LJLJI;

    public C58995NDj(C58993NDh c58993NDh) {
        this.LJLJI = c58993NDh;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        Object obj;
        o.LJIIIZ(view, "view");
        if (this.LJLILLLLZI) {
            ConcurrentHashMap<String, List<C58991NDf>> concurrentHashMap = this.LJLJI.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<C58991NDf>>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it.next().getValue(), arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                SparkContext sparkContext = ((C58991NDf) next).LIZ.getSparkContext();
                if (sparkContext != null) {
                    obj = sparkContext.containerId;
                }
                if (o.LJ(obj, view.getHybridContext().containerId)) {
                    obj = next;
                    break;
                }
            }
            C58991NDf c58991NDf = (C58991NDf) obj;
            if (c58991NDf == null) {
                return;
            }
            synchronized (c58991NDf) {
                if (c58991NDf.LJFF == EnumC58992NDg.NOT_READY) {
                    c58991NDf.LJFF = EnumC58992NDg.WAIT_FOR_JSB_READY;
                }
                c58991NDf.LJI = Long.valueOf(SystemClock.elapsedRealtime());
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        LJJJJ(view, url);
        C58993NDh c58993NDh = this.LJLJI;
        String str2 = view.getHybridContext().containerId;
        if (str == null) {
            str = "onLoadFail without reason";
        }
        c58993NDh.LIZIZ(str2, str);
        this.LJLILLLLZI = false;
    }
}
