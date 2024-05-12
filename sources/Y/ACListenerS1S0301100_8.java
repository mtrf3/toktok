package Y;

import X.C113554cx;
import X.FMX;
import X.InterfaceC48685J8v;
import X.OSZ;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;

/* loaded from: classes9.dex */
public class ACListenerS1S0301100_8 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS1S0301100_8 aCListenerS1S0301100_8, View view) {
        ((TuxSheet) aCListenerS1S0301100_8.l0).dismiss();
        InterfaceC48685J8v interfaceC48685J8v = (InterfaceC48685J8v) aCListenerS1S0301100_8.l1;
        if (interfaceC48685J8v != null) {
            interfaceC48685J8v.LIZ(false);
        }
        long currentTimeMillis = System.currentTimeMillis() - aCListenerS1S0301100_8.j4;
        SpeedModeSettingImpl speedModeSettingImpl = (SpeedModeSettingImpl) aCListenerS1S0301100_8.l2;
        FMX.LJIIL(speedModeSettingImpl.LJIIIIZZ, C113554cx.LJJL(new OSZ(speedModeSettingImpl.LJI, String.valueOf(aCListenerS1S0301100_8.i3)), new OSZ(((SpeedModeSettingImpl) aCListenerS1S0301100_8.l2).LJIIIZ, String.valueOf(currentTimeMillis))));
    }

    public static final void onClick$1(ACListenerS1S0301100_8 aCListenerS1S0301100_8, View view) {
        ((TuxSheet) aCListenerS1S0301100_8.l0).dismiss();
        InterfaceC48685J8v interfaceC48685J8v = (InterfaceC48685J8v) aCListenerS1S0301100_8.l1;
        if (interfaceC48685J8v != null) {
            interfaceC48685J8v.LIZ(true);
        }
        long currentTimeMillis = System.currentTimeMillis() - aCListenerS1S0301100_8.j4;
        SpeedModeSettingImpl speedModeSettingImpl = (SpeedModeSettingImpl) aCListenerS1S0301100_8.l2;
        FMX.LJIIL(speedModeSettingImpl.LJII, C113554cx.LJJL(new OSZ(speedModeSettingImpl.LJI, String.valueOf(aCListenerS1S0301100_8.i3)), new OSZ(((SpeedModeSettingImpl) aCListenerS1S0301100_8.l2).LJIIIZ, String.valueOf(currentTimeMillis))));
    }

    public ACListenerS1S0301100_8(TuxSheet tuxSheet, InterfaceC48685J8v interfaceC48685J8v, long j, SpeedModeSettingImpl speedModeSettingImpl, int i, int i2) {
        this.$t = i2;
        this.l0 = tuxSheet;
        this.l1 = interfaceC48685J8v;
        this.j4 = j;
        this.l2 = speedModeSettingImpl;
        this.i3 = i;
    }
}
