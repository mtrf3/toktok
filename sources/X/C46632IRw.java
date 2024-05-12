package X;

import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* renamed from: X.IRw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46632IRw implements InterfaceC46631IRv {
    public final InterfaceC46631IRv LIZ;

    @Override // X.InterfaceC46631IRv
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC46631IRv
    public final void LJFF() {
        InterfaceC46631IRv interfaceC46631IRv = this.LIZ;
        if (interfaceC46631IRv == null) {
            return;
        }
        interfaceC46631IRv.LJFF();
    }

    public C46632IRw() {
        SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2 = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategyConfigV2();
        if (superResolutionStrategyConfigV2 != null && superResolutionStrategyConfigV2.batteryPercentThreshold <= 1.0f) {
            this.LIZ = new IVD();
        } else {
            if (C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategyConfig() == null) {
                return;
            }
            this.LIZ = new C46629IRt();
        }
    }

    @Override // X.InterfaceC46631IRv
    public final int LJ(String str, long j) {
        InterfaceC46631IRv interfaceC46631IRv = this.LIZ;
        if (interfaceC46631IRv == null) {
            return 1;
        }
        return interfaceC46631IRv.LJ(str, j);
    }

    @Override // X.InterfaceC46631IRv
    public final void LIZ(int i, long j, String str, boolean z) {
        InterfaceC46631IRv interfaceC46631IRv = this.LIZ;
        if (interfaceC46631IRv == null) {
            return;
        }
        interfaceC46631IRv.LIZ(i, j, str, z);
    }

    @Override // X.InterfaceC46631IRv
    public final IYQ LIZJ(SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, int i, boolean z, InterfaceC46630IRu interfaceC46630IRu) {
        InterfaceC46631IRv interfaceC46631IRv = this.LIZ;
        if (interfaceC46631IRv == null) {
            return null;
        }
        return interfaceC46631IRv.LIZJ(simVideoUrlModel, list, i, z, interfaceC46630IRu);
    }

    @Override // X.InterfaceC46631IRv
    public final int LIZIZ(String str, boolean z, long j, int i, String str2, float f, int i2, int i3) {
        InterfaceC46631IRv interfaceC46631IRv = this.LIZ;
        if (interfaceC46631IRv == null) {
            return 1;
        }
        return interfaceC46631IRv.LIZIZ(str, z, j, i, str2, f, i2, i3);
    }
}
