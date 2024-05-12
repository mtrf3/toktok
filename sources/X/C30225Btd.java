package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastToolbarCollapseSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Btd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30225Btd implements InterfaceC30205BtJ {
    public static final C30225Btd LIZ = new C30225Btd();
    public static final HashMap<DataChannel, ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf>> LIZIZ = new HashMap<>(8);
    public static final HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> LIZJ = new HashMap<>(3);
    public static final java.util.Map<DataChannel, C30209BtN> LIZLLL = new LinkedHashMap();

    @Override // X.InterfaceC30205BtJ
    public final void LJIIIZ(DataChannel dataChannel, EnumC30206BtK location, ViewGroup viewGroup) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(location, "location");
    }

    @Override // X.InterfaceC30205BtJ
    public final void releaseAll() {
        Iterator LJ = C06540Nm.LJ(LIZJ, "mChannelViewHolderMap.values");
        while (LJ.hasNext()) {
            Iterator it = ((java.util.Map) LJ.next()).values().iterator();
            while (it.hasNext()) {
                ((C30224Btc) it.next()).LJII();
            }
        }
        LIZIZ.clear();
        LIZJ.clear();
        ((LinkedHashMap) LIZLLL).clear();
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LJFF(EnumC30204BtI button) {
        EnumC30204BtI enumC30204BtI;
        o.LJIIIZ(button, "button");
        if (C30230Bti.LIZLLL && C29306Beo.LJIIJ(C30230Bti.LIZJ)) {
            LiveBroadcastToolbarCollapseSetting liveBroadcastToolbarCollapseSetting = LiveBroadcastToolbarCollapseSetting.INSTANCE;
            if (liveBroadcastToolbarCollapseSetting.collapseShare()) {
                enumC30204BtI = EnumC30204BtI.SHARE;
            } else if (liveBroadcastToolbarCollapseSetting.collapseInteract()) {
                enumC30204BtI = EnumC30204BtI.INTERACTION_FEATURES;
            } else {
                enumC30204BtI = null;
            }
            if (enumC30204BtI == button || ((ArrayList) C30230Bti.LIZIZ).contains(button)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final void N0(DataChannel dataChannel) {
        Collection<C30224Btc> values;
        if (dataChannel != null) {
            java.util.Map<EnumC30206BtK, C30224Btc> map = LIZJ.get(dataChannel);
            if (map != null && (values = map.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    it.next().LJII();
                }
            }
            LIZJ.remove(dataChannel);
            LIZIZ.remove(dataChannel);
            LIZLLL.remove(dataChannel);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LIZLLL(DataChannel dataChannel, EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        C30209BtN c30209BtN = (C30209BtN) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c30209BtN != null) {
            if (ORZ.LJLJJI(C30209BtN.LJIIIIZZ.get(button), c30209BtN.LJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LJ(DataChannel dataChannel, EnumC30204BtI button) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        if (dataChannel != null) {
            HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
            if (hashMap.get(dataChannel) != null && (map = hashMap.get(dataChannel)) != null && (values = map.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    if (it.next().LJFF(button)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJII(DataChannel dataChannel, EnumC30204BtI button) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        if (dataChannel != null) {
            HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
            if (hashMap.get(dataChannel) != null && (map = hashMap.get(dataChannel)) != null && (values = map.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ(button);
                }
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIIIZZ(EnumC30206BtK toolbarLocation, DataChannel dataChannel) {
        C30224Btc c30224Btc;
        o.LJIIIZ(toolbarLocation, "toolbarLocation");
        if (dataChannel != null) {
            HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
            java.util.Map<EnumC30206BtK, C30224Btc> map = hashMap.get(dataChannel);
            if (map != null && (c30224Btc = map.get(toolbarLocation)) != null) {
                c30224Btc.LJII();
            }
            java.util.Map<EnumC30206BtK, C30224Btc> map2 = hashMap.get(dataChannel);
            if (map2 != null) {
                map2.remove(toolbarLocation);
            }
            LIZLLL.remove(dataChannel);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIJ(EnumC30208BtM function, DataChannel dataChannel) {
        o.LJIIIZ(function, "function");
        C30209BtN c30209BtN = (C30209BtN) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c30209BtN != null) {
            c30209BtN.LIZLLL(function);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final View LJIIL(DataChannel dataChannel, EnumC30204BtI button) {
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        java.util.Map<EnumC30206BtK, C30224Btc> map = LIZJ.get(dataChannel);
        if (map != null && (values = map.values()) != null) {
            for (C30224Btc c30224Btc : values) {
                c30224Btc.getClass();
                InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) c30224Btc.LJI).get(button);
                if (interfaceC30237Btp != null) {
                    return interfaceC30237Btp.LJFF();
                }
            }
        }
        Iterator LJ = C06540Nm.LJ(LIZJ, "mChannelViewHolderMap.values");
        while (LJ.hasNext()) {
            for (C30224Btc c30224Btc2 : ((java.util.Map) LJ.next()).values()) {
                c30224Btc2.getClass();
                InterfaceC30237Btp interfaceC30237Btp2 = (InterfaceC30237Btp) ((EnumMap) c30224Btc2.LJI).get(button);
                if (interfaceC30237Btp2 != null) {
                    return interfaceC30237Btp2.LJFF();
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC30205BtJ
    public final boolean LJIILJJIL(DataChannel dataChannel, EnumC30204BtI button) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        if (dataChannel != null) {
            HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
            if (hashMap.get(dataChannel) != null && (map = hashMap.get(dataChannel)) != null && (values = map.values()) != null) {
                for (C30224Btc c30224Btc : values) {
                    c30224Btc.getClass();
                    InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) c30224Btc.LJI).get(button);
                    if (interfaceC30237Btp != null && interfaceC30237Btp.getVisibility() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIILL(DataChannel dataChannel, EnumC30204BtI button) {
        Collection<C30224Btc> values;
        ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap;
        o.LJIIIZ(button, "button");
        if (dataChannel != null) {
            java.util.Map<EnumC30206BtK, C30224Btc> map = LIZJ.get(dataChannel);
            if (map != null && (values = map.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    it.next().LJIIJJI(button);
                    HashMap<DataChannel, ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf>> hashMap = LIZIZ;
                    if (hashMap != null && (concurrentHashMap = hashMap.get(dataChannel)) != null) {
                        concurrentHashMap.remove(button);
                    }
                }
            }
            LIZ.LJIJJLI(dataChannel, button);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIILLIIL(DataChannel dataChannel, EnumC30204BtI button) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        if (dataChannel != null) {
            HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
            if (hashMap.get(dataChannel) != null && (map = hashMap.get(dataChannel)) != null && (values = map.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    it.next().LIZJ(button);
                }
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIJI(EnumC30208BtM function, DataChannel dataChannel) {
        o.LJIIIZ(function, "function");
        C30209BtN c30209BtN = (C30209BtN) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c30209BtN != null) {
            c30209BtN.LIZ(function);
        }
    }

    public final void LJIJJ(DataChannel dataChannel, EnumC30204BtI button) {
        EnumC30208BtM enumC30208BtM;
        o.LJIIIZ(button, "button");
        C30209BtN c30209BtN = (C30209BtN) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c30209BtN != null && (enumC30208BtM = C30209BtN.LJIIIIZZ.get(button)) != null) {
            c30209BtN.LJI.put(enumC30208BtM, button);
            c30209BtN.LIZ(enumC30208BtM);
        }
    }

    public final void LJIJJLI(DataChannel dataChannel, EnumC30204BtI button) {
        EnumC30208BtM enumC30208BtM;
        o.LJIIIZ(button, "button");
        C30209BtN c30209BtN = (C30209BtN) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c30209BtN != null && (enumC30208BtM = C30209BtN.LJIIIIZZ.get(button)) != null) {
            c30209BtN.LIZLLL(enumC30208BtM);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LIZ(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        if (dataChannel != null) {
            java.util.Map<EnumC30206BtK, C30224Btc> map = LIZJ.get(dataChannel);
            if (map != null && (values = map.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    it.next().LIZLLL(button);
                }
            }
            ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = LIZIZ.get(dataChannel);
            if (concurrentHashMap != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(button)) != null) {
                interfaceViewOnClickListenerC30227Btf.onHide();
            }
            if (!z) {
                LIZ.LJIJJLI(dataChannel, button);
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LIZIZ(DataChannel dataChannel, EnumC30204BtI toolbarButton, EnumC30206BtK toolbarLocation) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        C30224Btc c30224Btc;
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        o.LJIIIZ(toolbarButton, "toolbarButton");
        o.LJIIIZ(toolbarLocation, "toolbarLocation");
        if (dataChannel != null && (map = LIZJ.get(dataChannel)) != null && (c30224Btc = map.get(toolbarLocation)) != null) {
            Iterator it = ((ArrayList) c30224Btc.LJFF).iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (c30224Btc.LIZJ.indexOf(it.next()) > c30224Btc.LIZJ.indexOf(toolbarButton)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            ListProtector.add(c30224Btc.LJFF, i, toolbarButton);
            ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = c30224Btc.LJ;
            if (concurrentHashMap != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(toolbarButton)) != null) {
                c30224Btc.LJI(toolbarButton, interfaceViewOnClickListenerC30227Btf);
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIJJI(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        Collection<C30224Btc> values;
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        o.LJIIIZ(button, "button");
        if (dataChannel != null && (map = LIZJ.get(dataChannel)) != null && (values = map.values()) != null) {
            Iterator<C30224Btc> it = values.iterator();
            while (it.hasNext()) {
                if (it.next().LJIIJ(button)) {
                    if (!z) {
                        LIZ.LJIJJ(dataChannel, button);
                    }
                    ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = LIZIZ.get(dataChannel);
                    if (concurrentHashMap != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(button)) != null) {
                        interfaceViewOnClickListenerC30227Btf.onShow();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIILIIL(DataChannel dataChannel, EnumC30204BtI toolbarButton, EnumC30206BtK toolbarLocation) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        C30224Btc c30224Btc;
        o.LJIIIZ(toolbarButton, "toolbarButton");
        o.LJIIIZ(toolbarLocation, "toolbarLocation");
        if (dataChannel != null && (map = LIZJ.get(dataChannel)) != null && (c30224Btc = map.get(toolbarLocation)) != null) {
            ((ArrayList) c30224Btc.LJFF).remove(toolbarButton);
            c30224Btc.LJIIJJI(toolbarButton);
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIIZILJ(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        if (dataChannel != null) {
            HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
            if (hashMap.get(dataChannel) != null) {
                java.util.Map<EnumC30206BtK, C30224Btc> map = hashMap.get(dataChannel);
                if (map != null && (values = map.values()) != null) {
                    Iterator<C30224Btc> it = values.iterator();
                    while (it.hasNext()) {
                        it.next().LJIIIZ(button, z);
                    }
                    return;
                }
                return;
            }
        }
        button.isRedDotVisible = z;
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJIJ(EnumC30204BtI button, DataChannel dataChannel, boolean z) {
        java.util.Map<EnumC30206BtK, C30224Btc> map;
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        button.isEnableClick = z;
        if (dataChannel != null) {
            HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
            if (hashMap.get(dataChannel) != null && (map = hashMap.get(dataChannel)) != null && (values = map.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    it.next().LJIIIIZZ(button, z);
                }
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LIZJ(EnumC30204BtI button, DataChannel dataChannel, InterfaceViewOnClickListenerC30227Btf behavior, boolean z) {
        Collection<C30224Btc> values;
        o.LJIIIZ(button, "button");
        o.LJIIIZ(behavior, "behavior");
        if (dataChannel != null) {
            if (C29306Beo.LJJIFFI((Boolean) dataChannel.kv0(BCW.class)) && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.FALSE)) {
                java.util.Map<DataChannel, C30209BtN> map = LIZLLL;
                if (!map.containsKey(dataChannel)) {
                    map.put(dataChannel, new C30209BtN(dataChannel));
                }
            }
            java.util.Map<EnumC30206BtK, C30224Btc> map2 = LIZJ.get(dataChannel);
            if (map2 != null && (values = map2.values()) != null) {
                Iterator<C30224Btc> it = values.iterator();
                while (it.hasNext()) {
                    it.next().LJI(button, behavior);
                }
            }
            HashMap<DataChannel, ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf>> hashMap = LIZIZ;
            if (hashMap.get(dataChannel) == null) {
                hashMap.put(dataChannel, new ConcurrentHashMap<>(8));
            }
            LIZ.LJIJJ(dataChannel, button);
            ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = hashMap.get(dataChannel);
            if (concurrentHashMap != null) {
                concurrentHashMap.put(button, behavior);
            }
        }
    }

    @Override // X.InterfaceC30205BtJ
    public final void LJI(DataChannel dataChannel, View container, List<? extends EnumC30204BtI> toolbarList, EnumC30226Bte style, EnumC30206BtK location) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(toolbarList, "toolbarList");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(location, "location");
        C30224Btc c30224Btc = new C30224Btc(dataChannel, (ViewGroup) container, toolbarList, style, LIZIZ.get(dataChannel));
        HashMap<DataChannel, java.util.Map<EnumC30206BtK, C30224Btc>> hashMap = LIZJ;
        if (hashMap.get(dataChannel) == null) {
            o.LJI(dataChannel);
            hashMap.put(dataChannel, new HashMap(3));
        }
        java.util.Map<EnumC30206BtK, C30224Btc> map = hashMap.get(dataChannel);
        if (map != null) {
            map.put(location, c30224Btc);
        }
        c30224Btc.LJ();
    }
}
