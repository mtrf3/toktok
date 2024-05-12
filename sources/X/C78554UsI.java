package X;

import com.ss.android.ugc.aweme.port.in.IToolsCPUDataService;
import com.ss.android.ugc.aweme.services.ToolsCPUDataServiceImpl;
import java.util.HashMap;

/* renamed from: X.UsI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78554UsI implements IToolsCPUDataService {
    public static final C78554UsI LIZIZ = new C78554UsI();
    public final /* synthetic */ IToolsCPUDataService LIZ = ToolsCPUDataServiceImpl.createIToolsCPUDataServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final void end() {
        this.LIZ.end();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final HashMap<String, Double> getCpuData() {
        return this.LIZ.getCpuData();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final HashMap<String, String> getThermalData() {
        return this.LIZ.getThermalData();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final void init() {
        this.LIZ.init();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public final int isSavePowerEnable() {
        return this.LIZ.isSavePowerEnable();
    }
}
