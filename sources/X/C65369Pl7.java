package X;

import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;
import com.bytedance.pumbaa.monitor.adapter.api.IMonitorService;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.o;

/* renamed from: X.Pl7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65369Pl7 implements Observer {
    public final /* synthetic */ PumbaaTask LIZ;

    public C65369Pl7(PumbaaTask pumbaaTask) {
        this.LIZ = pumbaaTask;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        String str;
        String obj2;
        if (observable != null && obj != null && (observable instanceof C64707PaR)) {
            HashMap hashMap = (HashMap) obj;
            Object obj3 = hashMap.get("store_region");
            String str2 = null;
            if (obj3 != null && (obj2 = obj3.toString()) != null) {
                str = obj2.toLowerCase();
                o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
            } else {
                str = null;
            }
            Object obj4 = hashMap.get("region_source");
            if (obj4 != null) {
                str2 = obj4.toString();
            }
            IMonitorService LJIILIIL = MonitorServiceImpl.LJIILIIL();
            this.LIZ.getClass();
            C1HQ LJ = PumbaaTask.LJ();
            LJ.put("operation", "Switch Region");
            LJ.put("event_source", "TTNet");
            LJ.put("region_source", str2);
            if (str == null) {
                str = "";
            }
            LJ.put("region_code", str);
            LJIILIIL.LJ(LJ);
        }
    }
}
