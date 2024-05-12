package com.ss.android.ugc.aweme.account.login.twostep;

import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C85166Xbe;
import X.C85200XcC;
import X.C85444Xg8;
import X.C85445Xg9;
import X.C85465XgT;
import X.C85466XgU;
import X.C85467XgV;
import X.C86036Xpg;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.SY4;
import X.TBT;
import X.YE1;
import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RecentDevicesItemCell extends PowerCell<C85166Xbe> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public RecommendDevice LJLJLJ;

    public RecentDevicesItemCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecentDevicesFragmentViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 96);
        C85200XcC c85200XcC = C85200XcC.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85466XgU.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 97), new AqS165S0100000_15((InterfaceC93923mO) this, 98), C85445Xg9.INSTANCE, c85200XcC, new AqS165S0100000_15((InterfaceC93923mO) this, 99), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85467XgV.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 100), new AqS165S0100000_15((InterfaceC93923mO) this, 91), C85444Xg8.INSTANCE, c85200XcC, new AqS165S0100000_15((InterfaceC93923mO) this, 92), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85465XgT.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 93), new AqS165S0100000_15((InterfaceC93923mO) this, 94), new AqS165S0100000_15((InterfaceC93923mO) this, 95), c85200XcC, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 101));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 85));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 89));
        this.LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 87));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 86));
        this.LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 88));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
        super.onCreate();
        ((AssemViewModel) this.LJLIL.getValue()).asyncSubscribe(new TBT() { // from class: X.Xbu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85168Xbg) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS181S0100000_15(this, 27), new AqS165S0100000_15(this, 90), new AqS181S0100000_15(this, 28));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C85166Xbe c85166Xbe) {
        Context context;
        String string;
        long j;
        C85166Xbe RecentDeviceItem = c85166Xbe;
        o.LJIIIZ(RecentDeviceItem, "RecentDeviceItem");
        RecommendDevice recommendDevice = RecentDeviceItem.LJLIL;
        this.LJLJLJ = recommendDevice;
        if (recommendDevice != null) {
            String os = recommendDevice.getOs();
            if (os == null) {
                os = "";
            }
            String location = recommendDevice.getLocation();
            int i = 0;
            if ((location != null && location.length() != 0) || (context = getContext()) == null || (string = context.getString(R.string.t9h)) == null) {
                string = recommendDevice.getLocation();
            }
            recommendDevice.getLastUseTime();
            ((TextView) this.LJLILLLLZI.getValue()).setText(recommendDevice.getDeviceName());
            ((TextView) this.LJLJJL.getValue()).setText(os);
            ((TextView) this.LJLJJLL.getValue()).setText(string);
            Long lastUseTimestamp = recommendDevice.getLastUseTimestamp();
            if (lastUseTimestamp != null) {
                j = lastUseTimestamp.longValue();
            } else {
                j = 0;
            }
            ((TextView) this.LJLJL.getValue()).setText(C86036Xpg.LIZ(j * 1000, "MMM D, YYYY h:mm A"));
            View isCurrentDevice = (View) this.LJLJJI.getValue();
            o.LJIIIIZZ(isCurrentDevice, "isCurrentDevice");
            if (!o.LJ(recommendDevice.isLocalDevice(), Boolean.TRUE)) {
                i = 8;
            }
            isCurrentDevice.setVisibility(i);
            SY4 sy4 = (SY4) this.LJLJI.getValue();
            sy4.getClass();
            C16880lQ.LJJIZ(sy4, new ACListenerS35S0100000_15(this, LiveCoverMinSizeSetting.DEFAULT));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.nz, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return LLLLIILL;
    }
}
