package com.ss.android.ugc.aweme.ui;

import X.ActivityC45651qj;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C45804HyK;
import X.C47959Irz;
import X.C54485LZx;
import X.C54563LbD;
import X.C54565LbF;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7MY;
import X.C9BE;
import X.FMX;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.LJ5;
import X.LJE;
import X.QD3;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.vm.NearbySkylightViewModel;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class NearbyCurrentRegionAssem extends NearbySkylightBaseAssem implements INearbyCurrentRegionAbility, InterfaceC55102Lju {
    public View LLFF;
    public TuxTextView LLFFF;
    public TuxTextView LLFII;
    public TuxIconView LLFZ;
    public final C62822Ol8 LLI;
    public final C214298b3 LLIFFJFJJ;

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem
    public final void K3() {
        L3(false);
    }

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem
    public final boolean O3() {
        return false;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -310872369) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bw2;
    }

    public NearbyCurrentRegionAssem() {
        new LinkedHashMap();
        this.LLI = C221108m2.LIZIZ(C54563LbD.LJLIL);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbySkylightViewModel.class);
        this.LLIFFJFJJ = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 683), C54565LbF.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem
    public final int N3() {
        return C7MY.LIZIZ(16);
    }

    public final boolean R3() {
        return ((Boolean) this.LLI.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null && LocationServiceImpl.LJIJJ().LJIILLIIL(0, context)) {
            TuxTextView tuxTextView = this.LLFII;
            if (tuxTextView != null) {
                if (tuxTextView.getVisibility() == 0 && R3()) {
                    float H3 = H3();
                    TuxTextView tuxTextView2 = this.LLFII;
                    if (tuxTextView2 != null) {
                        int LIZJ = C47959Irz.LIZJ(12, tuxTextView2.getHeight());
                        TuxTextView tuxTextView3 = this.LLFII;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setVisibility(8);
                            ((NearbySkylightViewModel) this.LLIFFJFJJ.getValue()).LJLIL = true;
                            this.LJLJLLL = true;
                            getContainerView().setVisibility(0);
                            C54485LZx.LIZ(true);
                            P3(H3, H3 - LIZJ, true, null);
                            return;
                        }
                        o.LJIJI("tvTurnOnLocation");
                        throw null;
                    }
                    o.LJIJI("tvTurnOnLocation");
                    throw null;
                }
                return;
            }
            o.LJIJI("tvTurnOnLocation");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyCurrentRegionAbility
    public final boolean Q5() {
        return this.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem
    public final void I3(InterfaceC65784Pro interfaceC65784Pro) {
        ActivityC45651qj LJJIFFI;
        super.I3(new AqS156S0200000_9(this, (NearbyCurrentRegionAssem) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 48));
        Context context = getContext();
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        LJ5.LJIIJJI(LJJIFFI);
    }

    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem
    public final void L3(boolean z) {
        Context context;
        ActivityC45651qj LJJIFFI;
        if (this.LJLJLLL) {
            return;
        }
        super.L3(z);
        if ((z && !LJE.LIZIZ()) || (context = getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        LJ5.LJ(LJJIFFI);
        if (R3()) {
            if (LocationServiceImpl.LJIJJ().LJIILLIIL(0, LJJIFFI)) {
                TuxTextView tuxTextView = this.LLFII;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                } else {
                    o.LJIJI("tvTurnOnLocation");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView2 = this.LLFII;
                if (tuxTextView2 != null) {
                    if (tuxTextView2.getVisibility() == 0) {
                        LJE.LJFF();
                        FMX.onEventV3("turn_on_location_banner_show");
                    }
                } else {
                    o.LJIJI("tvTurnOnLocation");
                    throw null;
                }
            }
        }
        FMX.onEventV3("city_banner_show");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRegionChange(RoamingLocationInfo event) {
        o.LJIIIZ(event, "event");
        TuxTextView tuxTextView = this.LLFFF;
        if (tuxTextView != null) {
            tuxTextView.setText(event.getManualRegionName());
        } else {
            o.LJIJI("tvCurRegion");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L31;
     */
    @Override // com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.NearbyCurrentRegionAssem.onViewCreated(android.view.View):void");
    }
}
