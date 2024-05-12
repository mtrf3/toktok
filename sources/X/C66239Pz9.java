package X;

import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;
import com.bytedance.pumbaa.monitor.adapter.api.IMonitorService;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Pz9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66239Pz9 implements InterfaceC66269Pzd {
    public final /* synthetic */ PumbaaTask LIZ;

    public C66239Pz9(PumbaaTask pumbaaTask) {
        this.LIZ = pumbaaTask;
    }

    @Override // X.InterfaceC66269Pzd
    public final void LIZ(C66240PzA previousStoreRegionInfo, C66240PzA currentStoreRegionInfo) {
        o.LJIIIZ(previousStoreRegionInfo, "previousStoreRegionInfo");
        o.LJIIIZ(currentStoreRegionInfo, "currentStoreRegionInfo");
        IMonitorService LJIILIIL = MonitorServiceImpl.LJIILIIL();
        this.LIZ.getClass();
        C1HQ LJ = PumbaaTask.LJ();
        LJ.put("operation", "Switch Region");
        LJ.put("event_source", "Region SDK");
        String name = currentStoreRegionInfo.LJLJI.name();
        Locale ROOT = Locale.ROOT;
        o.LJIIIIZZ(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        LJ.put("region_source", lowerCase);
        String lowerCase2 = currentStoreRegionInfo.LJLILLLLZI.toLowerCase(ROOT);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        LJ.put("region_code", lowerCase2);
        LJ.put("previous_uid", previousStoreRegionInfo.LJLJJI.LJLILLLLZI);
        LJ.put("current_uid", currentStoreRegionInfo.LJLJJI.LJLILLLLZI);
        LJ.put("current_extra_logid", currentStoreRegionInfo.LJLJJI.LJLJI);
        LJ.put("previous_region_source", previousStoreRegionInfo.LJLJI.name());
        LJIILIIL.LJ(LJ);
    }
}
