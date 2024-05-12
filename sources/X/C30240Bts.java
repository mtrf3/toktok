package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS10S0010000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bts, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30240Bts implements InterfaceC30205BtJ {
    public final C30242Btu LIZ;
    public final ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> LIZIZ = new ConcurrentHashMap<>();
    public final java.util.Map<EnumC30206BtK, C30224Btc> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC30205BtJ
    public final void LIZIZ(DataChannel dataChannel, EnumC30204BtI toolbarButton, EnumC30206BtK toolbarLocation) {
        o.LJIIIZ(toolbarButton, "toolbarButton");
        o.LJIIIZ(toolbarLocation, "toolbarLocation");
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIJ(EnumC30208BtM function, DataChannel dataChannel) {
        o.LJIIIZ(function, "function");
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIILIIL(DataChannel dataChannel, EnumC30204BtI toolbarButton, EnumC30206BtK toolbarLocation) {
        o.LJIIIZ(toolbarButton, "toolbarButton");
        o.LJIIIZ(toolbarLocation, "toolbarLocation");
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIJI(EnumC30208BtM function, DataChannel dataChannel) {
        o.LJIIIZ(function, "function");
    }

    @Override // X.InterfaceC30205BtJ
    public final void releaseAll() {
        N0(null);
    }

    public C30240Bts(C30242Btu c30242Btu) {
        this.LIZ = c30242Btu;
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LJFF(EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            return ((InterfaceC30266BuI) this.LIZ.LIZLLL.getValue()).LIZ(LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final void N0(DataChannel dataChannel) {
        this.LIZ.LIZ(null);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZJ;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LJII();
        }
        linkedHashMap.clear();
        this.LIZIZ.clear();
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LIZLLL(DataChannel dataChannel, EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            return ((InterfaceC30266BuI) this.LIZ.LIZLLL.getValue()).LIZ(LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LJ(DataChannel dataChannel, EnumC30204BtI button) {
        EnumC30255Bu7 enumC30255Bu7;
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            TBViewModel LIZLLL = this.LIZ.LIZLLL(LIZ);
            if (LIZLLL != null) {
                enumC30255Bu7 = LIZLLL.LJLL.getValue();
            } else {
                enumC30255Bu7 = null;
            }
            if (enumC30255Bu7 == EnumC30255Bu7.REDDOT) {
                return true;
            }
            return false;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            if (((C30224Btc) it.next()).LJFF(button)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJII(DataChannel dataChannel, EnumC30204BtI button) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            TBViewModel LIZLLL = this.LIZ.LIZLLL(LIZ);
            if (LIZLLL != null && (mutableLiveData = LIZLLL.LJLJLLL) != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
            C30228Btg c30228Btg = (C30228Btg) this.LIZ.LIZIZ(LIZ);
            if (c30228Btg != null && (interfaceViewOnClickListenerC30227Btf = c30228Btg.LJLIL) != null) {
                interfaceViewOnClickListenerC30227Btf.ei();
                return;
            }
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LIZIZ(button);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIIIZZ(EnumC30206BtK toolbarLocation, DataChannel dataChannel) {
        o.LJIIIZ(toolbarLocation, "toolbarLocation");
        this.LIZ.LIZ(toolbarLocation);
        C30224Btc c30224Btc = (C30224Btc) ((LinkedHashMap) this.LIZJ).get(toolbarLocation);
        if (c30224Btc != null) {
            c30224Btc.LJII();
        }
        this.LIZJ.remove(toolbarLocation);
        if (this.LIZ.LIZ.isEmpty() && this.LIZJ.isEmpty()) {
            this.LIZIZ.clear();
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final View LJIIL(DataChannel dataChannel, EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        if (C30256Bu8.LIZIZ(button)) {
            EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
            if (LIZ == null) {
                return null;
            }
            C30242Btu c30242Btu = this.LIZ;
            c30242Btu.getClass();
            for (C30239Btr c30239Btr : ((LinkedHashMap) c30242Btu.LIZ).values()) {
                c30239Btr.getClass();
                InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) c30239Btr.LJFF).get(LIZ);
                if (interfaceC30237Btp != null) {
                    return interfaceC30237Btp.LJFF();
                }
            }
            return null;
        }
        for (C30224Btc c30224Btc : ((LinkedHashMap) this.LIZJ).values()) {
            c30224Btc.getClass();
            InterfaceC30237Btp interfaceC30237Btp2 = (InterfaceC30237Btp) ((EnumMap) c30224Btc.LJI).get(button);
            if (interfaceC30237Btp2 != null) {
                return interfaceC30237Btp2.LJFF();
            }
        }
        return null;
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LJIILJJIL(DataChannel dataChannel, EnumC30204BtI button) {
        MutableLiveData<C30268BuK> mutableLiveData;
        C30268BuK value;
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            TBViewModel LIZLLL = this.LIZ.LIZLLL(LIZ);
            if (LIZLLL != null && (mutableLiveData = LIZLLL.LJLJL) != null && (value = mutableLiveData.getValue()) != null && value.LIZ) {
                return true;
            }
            return false;
        }
        for (C30224Btc c30224Btc : ((LinkedHashMap) this.LIZJ).values()) {
            c30224Btc.getClass();
            InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) c30224Btc.LJI).get(button);
            if (interfaceC30237Btp != null && interfaceC30237Btp.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIILL(DataChannel dataChannel, EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        if (C30256Bu8.LIZIZ(button)) {
            EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
            if (LIZ != null) {
                this.LIZ.LJFF(LIZ);
            }
            if (button == EnumC30204BtI.INTERACTION_FEATURES || button == EnumC30204BtI.SHARE) {
                this.LIZIZ.remove(button);
                return;
            }
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LJIIJJI(button);
        }
        this.LIZIZ.remove(button);
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIILLIIL(DataChannel dataChannel, EnumC30204BtI button) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            TBViewModel LIZLLL = this.LIZ.LIZLLL(LIZ);
            if (LIZLLL != null && (mutableLiveData = LIZLLL.LJLJLLL) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            C30228Btg c30228Btg = (C30228Btg) this.LIZ.LIZIZ(LIZ);
            if (c30228Btg != null && (interfaceViewOnClickListenerC30227Btf = c30228Btg.LJLIL) != null) {
                interfaceViewOnClickListenerC30227Btf.F();
                return;
            }
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LIZJ(button);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LIZ(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        TBViewModel LIZLLL;
        MutableLiveData<C30268BuK> mutableLiveData;
        C30268BuK value;
        C30228Btg c30228Btg;
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        if (C30256Bu8.LIZIZ(button)) {
            EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
            if (LIZ != null && (LIZLLL = this.LIZ.LIZLLL(LIZ)) != null) {
                MutableLiveData<C30268BuK> mutableLiveData2 = LIZLLL.LJLJL;
                if (mutableLiveData2 != null) {
                    mutableLiveData2.setValue(new C30268BuK(false, true));
                }
                if (LIZLLL != null && (mutableLiveData = LIZLLL.LJLJL) != null && (value = mutableLiveData.getValue()) != null && value.LIZ && (c30228Btg = (C30228Btg) this.LIZ.LIZIZ(LIZ)) != null && (interfaceViewOnClickListenerC30227Btf = c30228Btg.LJLIL) != null) {
                    interfaceViewOnClickListenerC30227Btf.onHide();
                    return;
                }
                return;
            }
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LIZLLL(button);
        }
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf2 = this.LIZIZ.get(button);
        if (interfaceViewOnClickListenerC30227Btf2 == null) {
            return;
        }
        interfaceViewOnClickListenerC30227Btf2.onHide();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        if (r0 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x030e, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0300, code lost:
    
        if (r0 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x030a, code lost:
    
        if (r0 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0183, code lost:
    
        if (r10 != 5) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.List] */
    @Override // X.InterfaceC30205BtJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.bytedance.ies.sdk.datachannel.DataChannel r20, X.EnumC30206BtK r21, android.view.ViewGroup r22) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30240Bts.LJIIIZ(com.bytedance.ies.sdk.datachannel.DataChannel, X.BtK, android.view.ViewGroup):void");
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIJJI(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        MutableLiveData<C30268BuK> mutableLiveData;
        C30268BuK value;
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        if (C30256Bu8.LIZIZ(button)) {
            EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
            if (LIZ != null) {
                TBViewModel LIZLLL = this.LIZ.LIZLLL(LIZ);
                if (LIZLLL != null) {
                    MutableLiveData<C30268BuK> mutableLiveData2 = LIZLLL.LJLJL;
                    if (mutableLiveData2 != null) {
                        mutableLiveData2.setValue(new C30268BuK(true, true));
                    }
                    if (LIZLLL != null && (mutableLiveData = LIZLLL.LJLJL) != null && (value = mutableLiveData.getValue()) != null && value.LIZ) {
                        return;
                    }
                }
                C30228Btg c30228Btg = (C30228Btg) this.LIZ.LIZIZ(LIZ);
                if (c30228Btg == null || (interfaceViewOnClickListenerC30227Btf = c30228Btg.LJLIL) == null) {
                    return;
                }
                interfaceViewOnClickListenerC30227Btf.onShow();
                return;
            }
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            if (((C30224Btc) it.next()).LJIIJ(button)) {
                InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf2 = this.LIZIZ.get(button);
                if (interfaceViewOnClickListenerC30227Btf2 == null) {
                    return;
                }
                interfaceViewOnClickListenerC30227Btf2.onShow();
                return;
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIZILJ(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        EnumC30255Bu7 enumC30255Bu7;
        o.LJIIIZ(button, "button");
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            TBViewModel LIZLLL = this.LIZ.LIZLLL(LIZ);
            if (LIZLLL != null) {
                if (z) {
                    enumC30255Bu7 = EnumC30255Bu7.REDDOT;
                } else {
                    enumC30255Bu7 = EnumC30255Bu7.NONE;
                }
                LIZLLL.LJLL.setValue(enumC30255Bu7);
                LIZLLL.LJLLI.setValue(null);
                LIZLLL.LJLLILLLL.setValue(null);
            }
            C30228Btg c30228Btg = (C30228Btg) this.LIZ.LIZIZ(LIZ);
            if (c30228Btg != null && (interfaceViewOnClickListenerC30227Btf = c30228Btg.LJLIL) != null) {
                interfaceViewOnClickListenerC30227Btf.Ea(z);
                return;
            }
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LJIIIZ(button, z);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIJ(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(button, "button");
        button.isEnableClick = z;
        EnumC30241Btt.Companion.getClass();
        EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
        if (LIZ != null) {
            TBViewModel LIZLLL = this.LIZ.LIZLLL(LIZ);
            if (LIZLLL == null || (mutableLiveData = LIZLLL.LJLJLLL) == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.valueOf(z));
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LJIIIIZZ(button, z);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LIZJ(EnumC30204BtI button, DataChannel dataChannel, InterfaceViewOnClickListenerC30227Btf behavior, boolean z) {
        o.LJIIIZ(button, "button");
        o.LJIIIZ(behavior, "behavior");
        EnumC30241Btt.Companion.getClass();
        if (C30256Bu8.LIZIZ(button)) {
            EnumC30241Btt LIZ = C30256Bu8.LIZ(button);
            if (LIZ != null) {
                this.LIZ.LJ(LIZ, new C30228Btg(behavior), new AqS10S0010000_5(z, 0));
            }
            if (button == EnumC30204BtI.INTERACTION_FEATURES || button == EnumC30204BtI.SHARE) {
                this.LIZIZ.put(button, behavior);
                return;
            }
            return;
        }
        Iterator it = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it.hasNext()) {
            ((C30224Btc) it.next()).LJI(button, behavior);
        }
        this.LIZIZ.put(button, behavior);
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJI(DataChannel dataChannel, View container, List<? extends EnumC30204BtI> toolbarList, EnumC30226Bte style, EnumC30206BtK location) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(toolbarList, "toolbarList");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(location, "location");
        C30224Btc c30224Btc = new C30224Btc(dataChannel, (ViewGroup) container, toolbarList, style, this.LIZIZ);
        this.LIZJ.put(location, c30224Btc);
        c30224Btc.LJ();
    }
}
