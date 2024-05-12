package com.ss.android.ugc.aweme.account.login.twostep;

import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C85194Xc6;
import X.C9BE;
import X.DialogC25756A8y;
import X.SY4;
import X.SYL;
import X.TBT;
import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TrustedDevicesFragmentAssem extends UIListContentAssem<TrustedDevicesFragmentViewModel> {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C214298b3 LJLJL;

    public TrustedDevicesFragmentAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 108));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 113));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 109));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 106));
        this.LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 114));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 107));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TrustedDevicesFragmentViewModel.class);
        this.LJLJL = C78926UyI.LJ(this, LIZ, c9be, new AqS165S0100000_15(LIZ, 112), C85194Xc6.INSTANCE, null);
    }

    public final SY4 C3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-addButton>(...)");
        return (SY4) value;
    }

    public final DialogC25756A8y E3() {
        return (DialogC25756A8y) this.LJLJI.getValue();
    }

    public final C73305Spp F3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public final TrustedDevicesFragmentViewModel A3() {
        return (TrustedDevicesFragmentViewModel) this.LJLJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        return new C57939MoZ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        E3().dismiss();
    }

    public final void I3(AuthDeviceResponse authDeviceResponse) {
        boolean z;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        AuthDeviceResponse.Data data;
        List<Device> auth_device;
        E3().hide();
        if (authDeviceResponse != null && (data = authDeviceResponse.getData()) != null && (auth_device = data.getAuth_device()) != null) {
            z = auth_device.isEmpty();
        } else {
            z = true;
        }
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-trustedDeviceListContainer>(...)");
        View view = (View) value;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        Object value2 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value2, "<get-emptyListContainer>(...)");
        View view2 = (View) value2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        C3().setVisibility(0);
        F3().setVisibility(8);
        SY4 C3 = C3();
        Context context = C3.getContext();
        if (context == null || (str = context.getString(R.string.t95)) == null) {
            str = "";
        }
        C3.setText(str);
        if (z) {
            i3 = 67;
            i4 = 200;
        } else {
            i3 = 32;
            i4 = 50;
        }
        C26338AVi.LJI(C3, Integer.valueOf(i3), 0, Integer.valueOf(i3), Integer.valueOf(i4), false, 16);
        C16880lQ.LJJIZ(C3, new ACListenerS35S0100000_15(this, 34));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        getContainerView().getContext();
        v3.setLayoutManager(new LinearLayoutManager());
        A3().asyncSubscribe(new TBT() { // from class: X.Xbq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85169Xbh) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS181S0100000_15(this, 30), new AqS165S0100000_15(this, 110), new AqS181S0100000_15(this, 31));
        A3().asyncSubscribe(new TBT() { // from class: X.Xbr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85169Xbh) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS181S0100000_15(this, 32), new AqS165S0100000_15(this, 111), new AqS181S0100000_15(this, 33));
        C3();
        A3().gv0(true);
    }
}
