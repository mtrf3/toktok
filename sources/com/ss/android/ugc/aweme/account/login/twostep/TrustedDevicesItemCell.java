package com.ss.android.ugc.aweme.account.login.twostep;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C85173Xbl;
import X.C85209XcL;
import X.C85446XgA;
import X.C85447XgB;
import X.C85468XgW;
import X.C85469XgX;
import X.C85470XgY;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.YE1;
import Y.ACListenerS35S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TrustedDevicesItemCell extends PowerCell<C85173Xbl> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public Device LJLJJL;

    public TrustedDevicesItemCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TrustedDevicesFragmentViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 123);
        C85209XcL c85209XcL = C85209XcL.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85469XgX.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 124), new AqS165S0100000_15((InterfaceC93923mO) this, 125), C85447XgB.INSTANCE, c85209XcL, new AqS165S0100000_15((InterfaceC93923mO) this, 126), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85470XgY.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 127), new AqS165S0100000_15((InterfaceC93923mO) this, 118), C85446XgA.INSTANCE, c85209XcL, new AqS165S0100000_15((InterfaceC93923mO) this, 119), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85468XgW.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, LiveTryModeCountDownThresholdSetting.DEFAULT), new AqS165S0100000_15((InterfaceC93923mO) this, 121), new AqS165S0100000_15((InterfaceC93923mO) this, 122), c85209XcL, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 128));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 117));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 129));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C85173Xbl c85173Xbl) {
        int i;
        C85173Xbl trustedDeviceItem = c85173Xbl;
        o.LJIIIZ(trustedDeviceItem, "trustedDeviceItem");
        this.LJLJJL = trustedDeviceItem.LJLIL;
        ((TextView) this.LJLILLLLZI.getValue()).setText(trustedDeviceItem.LJLIL.getDevice_name());
        View isCurrentDevice = (View) this.LJLJI.getValue();
        o.LJIIIIZZ(isCurrentDevice, "isCurrentDevice");
        if (o.LJ(String.valueOf(trustedDeviceItem.LJLIL.getDevice_id()), DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            i = 0;
        } else {
            i = 8;
        }
        isCurrentDevice.setVisibility(i);
        C16880lQ.LJJJ((TuxIconView) this.LJLJJI.getValue(), new ACListenerS35S0100000_15(this, 252));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.o7, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return LLLLIILL;
    }
}
