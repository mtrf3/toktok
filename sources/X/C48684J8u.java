package X;

import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;

/* renamed from: X.J8u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48684J8u implements InterfaceC48685J8v {
    public final /* synthetic */ SpeedModeServiceImpl LIZ;

    public C48684J8u(SpeedModeServiceImpl speedModeServiceImpl) {
        this.LIZ = speedModeServiceImpl;
    }

    @Override // X.InterfaceC48685J8v
    public final void LIZ(boolean z) {
        EnumC48682J8s enumC48682J8s;
        ISpeedModeSetting LJFF = SpeedModeSettingImpl.LJFF();
        if (z) {
            enumC48682J8s = EnumC48682J8s.ALLOW;
        } else {
            enumC48682J8s = EnumC48682J8s.NOT_ALLOW;
        }
        LJFF.LIZIZ(enumC48682J8s);
        this.LIZ.LIZIZ(z);
    }
}
