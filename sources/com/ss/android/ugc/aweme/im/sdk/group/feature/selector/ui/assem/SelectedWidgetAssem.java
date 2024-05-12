package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C84283Sm;
import X.C8VV;
import X.C8YN;
import X.C91633ih;
import X.C91683im;
import X.C99W;
import X.C9BE;
import X.EnumC91783iw;
import X.InterfaceC65350Pko;
import X.SY4;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SelectedWidgetAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public View LJLJI;
    public SY4 LJLJJI;

    public SelectedWidgetAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C91633ih.class, "init_config"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContactListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT), C91683im.INSTANCE, null);
    }

    public final void C3() {
        View view = this.LJLJI;
        if (view != null) {
            view.postDelayed(new ARunnableS37S0100000_1(this, 42), 50L);
            SY4 sy4 = this.LJLJJI;
            if (sy4 != null) {
                EnumC91783iw entry = v3().getEntry();
                ContactListViewModel x3 = x3();
                x3.getClass();
                C84283Sm c84283Sm = C84283Sm.LIZ;
                int size = x3.jv0().size();
                boolean contains = x3.jv0().contains(x3.LJLIL);
                c84283Sm.getClass();
                if (contains) {
                    size--;
                }
                sy4.setText(entry.sendBtnText(size));
                return;
            }
            o.LJIJI("button");
            throw null;
        }
        o.LJIJI("widget");
        throw null;
    }

    public final C91633ih v3() {
        return (C91633ih) this.LJLIL.getValue();
    }

    public final ContactListViewModel x3() {
        return (ContactListViewModel) this.LJLILLLLZI.getValue();
    }

    public final void A3(boolean z) {
        SY4 sy4 = this.LJLJJI;
        if (sy4 != null) {
            sy4.setLoading(z);
            x3().LJLILLLLZI = z;
        } else {
            o.LJIJI("button");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VV.LIZJ(this, new AqS167S0100000_1(this, 172));
        View findViewById = getContainerView().findViewById(R.id.ar5);
        o.LJIIIIZZ(findViewById, "containerView.bottom_selected_widget");
        this.LJLJI = findViewById;
        SY4 sy4 = (SY4) getContainerView().findViewById(R.id.jo1);
        if (C99W.LIZ) {
            sy4.getClass();
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 98));
        this.LJLJJI = sy4;
        C8YN.LJIILLIIL(this, x3(), null, new AqS183S0100000_1(this, 42), 3);
    }
}
