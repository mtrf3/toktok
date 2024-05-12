package X;

import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;

/* renamed from: X.1sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46681sO extends AbstractC65781Prl implements InterfaceC65784Pro<IPitayaCore> {
    public static final C46681sO LJLIL = new C46681sO();

    public C46681sO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IPitayaCore invoke() {
        IPitayaCore Cx = ((ILiveClientAIService) CN1.LIZ(ILiveClientAIService.class)).Cx();
        if (Cx == null) {
            return PitayaCoreFactory.getCore("1728");
        }
        return Cx;
    }
}
