package X;

import android.content.IntentFilter;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* renamed from: X.IRt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46629IRt implements InterfaceC46631IRv {
    public long LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC46631IRv
    public final void LIZ(int i, long j, String str, boolean z) {
    }

    @Override // X.InterfaceC46631IRv
    public final /* synthetic */ int LIZIZ(String str, boolean z, long j, int i, String str2, float f, int i2, int i3) {
        return 1;
    }

    @Override // X.InterfaceC46631IRv
    public final /* synthetic */ IYQ LIZJ(SimVideoUrlModel simVideoUrlModel, List list, int i, boolean z, InterfaceC46630IRu interfaceC46630IRu) {
        return null;
    }

    @Override // X.InterfaceC46631IRv
    public final void LIZLLL() {
        ISimKitConfig config;
        ICommonConfig commonConfig;
        SuperResolutionStrategyConfig superResolutionStrategyConfig = null;
        try {
            config = C1DG.LIZ().getConfig();
        } catch (Throwable unused) {
        }
        if (config != null && (commonConfig = config.getCommonConfig()) != null) {
            superResolutionStrategyConfig = commonConfig.getSuperResolutionStrategyConfig();
            if (superResolutionStrategyConfig == null || superResolutionStrategyConfig.res540pPercent == 10) {
                return;
            }
            this.LIZIZ--;
        }
    }

    @Override // X.InterfaceC46631IRv
    public final int LJ(String str, long j) {
        return 4;
    }

    @Override // X.InterfaceC46631IRv
    public final void LJFF() {
        ICommonConfig commonConfig;
        try {
            ISimKitConfig config = C1DG.LIZ().getConfig();
            if (config != null && (commonConfig = config.getCommonConfig()) != null) {
                commonConfig.getSuperResolutionStrategyConfig();
            }
            if (System.currentTimeMillis() - this.LIZ >= LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                if (C16880lQ.LJJLIIIJ(C46982IcE.LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
                    Double valueOf = Double.valueOf(r3.getIntExtra("level", -1) / r3.getIntExtra("scale", -1));
                    if (valueOf != null) {
                        valueOf.doubleValue();
                    }
                }
                this.LIZ = System.currentTimeMillis();
            }
        } catch (Throwable unused) {
        }
    }
}
