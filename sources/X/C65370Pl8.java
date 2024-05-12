package X;

import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;
import com.bytedance.pumbaa.monitor.adapter.api.IMonitorService;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;

/* renamed from: X.Pl8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65370Pl8 implements F67 {
    public final /* synthetic */ PumbaaTask LJLIL;

    public C65370Pl8(PumbaaTask pumbaaTask) {
        this.LJLIL = pumbaaTask;
    }

    @Override // X.F67
    public final void onChanged() {
        IMonitorService LJIILIIL = MonitorServiceImpl.LJIILIIL();
        this.LJLIL.getClass();
        C1HQ LJ = PumbaaTask.LJ();
        PumbaaTask pumbaaTask = this.LJLIL;
        LJ.put("operation", "Settings Fetch");
        LJ.put("url", pumbaaTask.LJLIL);
        LJ.put("logid", pumbaaTask.LJLILLLLZI);
        LJIILIIL.LJ(LJ);
    }
}
