package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Btc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30224Btc {
    public final DataChannel LIZ;
    public final ViewGroup LIZIZ;
    public final List<EnumC30204BtI> LIZJ;
    public final EnumC30226Bte LIZLLL;
    public final ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> LJ;
    public final List<EnumC30204BtI> LJFF;
    public final java.util.Map<EnumC30204BtI, InterfaceC30237Btp> LJI;
    public final LinkedList<EnumC30204BtI> LJII;
    public final java.util.Map<EnumC30204BtI, Boolean> LJIIIIZZ;

    public final void LJ() {
        ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = this.LJ;
        if (concurrentHashMap != null) {
            for (Map.Entry<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> entry : concurrentHashMap.entrySet()) {
                LJI(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void LJII() {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        Iterator<EnumC30204BtI> it = this.LJII.iterator();
        while (it.hasNext()) {
            EnumC30204BtI next = it.next();
            InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) this.LJI).get(next);
            if (interfaceC30237Btp != null) {
                ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = this.LJ;
                if (concurrentHashMap != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(next)) != null) {
                    interfaceViewOnClickListenerC30227Btf.Q4(interfaceC30237Btp, this.LIZ);
                }
                C16880lQ.LJLLL(interfaceC30237Btp.LJFF(), this.LIZIZ);
                ((EnumMap) this.LJI).remove(next);
            }
        }
        this.LJII.clear();
    }

    public final void LIZIZ(EnumC30204BtI button) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        o.LJIIIZ(button, "button");
        ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = this.LJ;
        if (concurrentHashMap != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(button)) != null) {
            interfaceViewOnClickListenerC30227Btf.ei();
        }
        ((EnumMap) this.LJIIIIZZ).put((EnumMap) button, (EnumC30204BtI) Boolean.TRUE);
    }

    public final void LIZJ(EnumC30204BtI button) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        o.LJIIIZ(button, "button");
        ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = this.LJ;
        if (concurrentHashMap != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(button)) != null) {
            interfaceViewOnClickListenerC30227Btf.F();
        }
        ((EnumMap) this.LJIIIIZZ).put((EnumMap) button, (EnumC30204BtI) Boolean.FALSE);
    }

    public final void LIZLLL(EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        for (Map.Entry entry : ((EnumMap) this.LJI).entrySet()) {
            Object key = entry.getKey();
            InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) entry.getValue();
            if (button == key) {
                interfaceC30237Btp.setVisibility(8);
                return;
            }
        }
    }

    public final boolean LJFF(EnumC30204BtI button) {
        View LIZ;
        o.LJIIIZ(button, "button");
        InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) this.LJI).get(button);
        if (interfaceC30237Btp == null || (LIZ = interfaceC30237Btp.LIZ(R.id.ldl)) == null || LIZ.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean LJIIJ(EnumC30204BtI button) {
        o.LJIIIZ(button, "button");
        for (Map.Entry entry : ((EnumMap) this.LJI).entrySet()) {
            Object key = entry.getKey();
            InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) entry.getValue();
            if (button == key) {
                if (interfaceC30237Btp.LJI()) {
                    interfaceC30237Btp.setVisibility(0);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJIIJJI(EnumC30204BtI button) {
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        o.LJIIIZ(button, "button");
        InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) this.LJI).get(button);
        if (interfaceC30237Btp == null) {
            return;
        }
        ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap = this.LJ;
        if (concurrentHashMap != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(button)) != null) {
            interfaceViewOnClickListenerC30227Btf.Q4(interfaceC30237Btp, this.LIZ);
        }
        interfaceC30237Btp.la();
        C16880lQ.LJLLL(interfaceC30237Btp.LJFF(), this.LIZIZ);
        this.LJII.remove(button);
        ((EnumMap) this.LJI).remove(button);
    }

    public final void LIZ(View view, Integer num) {
        Room LJIILL;
        if (num != null) {
            int intValue = num.intValue();
            EnumC12540eQ.Companion.getClass();
            if (C12530eP.LIZ(intValue) == EnumC12540eQ.OFF && (LJIILL = C1DH.LJIILL(this.LIZ)) != null && LJIILL.cppVersion == 2) {
                ImageView imageView = (ImageView) view.findViewById(R.id.lcy);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.lcz);
                ImageView imageView3 = (ImageView) view.findViewById(R.id.ld0);
                if (imageView != null) {
                    C15490jB.LIZJ(imageView, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v1.png"));
                    imageView.setVisibility(0);
                }
                if (imageView2 != null) {
                    C15490jB.LIZJ(imageView2, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v2.png"));
                    imageView2.setVisibility(0);
                }
                if (imageView3 != null) {
                    C15490jB.LIZJ(imageView3, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v3.png"));
                    imageView3.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x0180. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.EnumC30204BtI r21, X.InterfaceViewOnClickListenerC30227Btf r22) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30224Btc.LJI(X.BtI, X.Btf):void");
    }

    public final void LJIIIIZZ(EnumC30204BtI button, boolean z) {
        o.LJIIIZ(button, "button");
        for (Map.Entry entry : ((EnumMap) this.LJI).entrySet()) {
            Object key = entry.getKey();
            InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) entry.getValue();
            if (button == key) {
                interfaceC30237Btp.LIZJ(z);
            }
        }
    }

    public final void LJIIIZ(EnumC30204BtI button, boolean z) {
        View LIZ;
        ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap;
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf;
        o.LJIIIZ(button, "button");
        InterfaceC30237Btp interfaceC30237Btp = (InterfaceC30237Btp) ((EnumMap) this.LJI).get(button);
        if (interfaceC30237Btp != null && (LIZ = interfaceC30237Btp.LIZ(R.id.ldl)) != null) {
            C29306Beo.LJJLIIIJJI(LIZ, z);
            if (C76800UCe.LIZ != null && (concurrentHashMap = this.LJ) != null && (interfaceViewOnClickListenerC30227Btf = concurrentHashMap.get(button)) != null) {
                interfaceViewOnClickListenerC30227Btf.Ea(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C30224Btc(DataChannel dataChannel, ViewGroup container, List<? extends EnumC30204BtI> originConfigList, EnumC30226Bte style, ConcurrentHashMap<EnumC30204BtI, InterfaceViewOnClickListenerC30227Btf> concurrentHashMap) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(originConfigList, "originConfigList");
        o.LJIIIZ(style, "style");
        this.LIZ = dataChannel;
        this.LIZIZ = container;
        this.LIZJ = originConfigList;
        this.LIZLLL = style;
        this.LJ = concurrentHashMap;
        this.LJFF = ORZ.LLJILJILJ(originConfigList);
        this.LJI = new EnumMap(EnumC30204BtI.class);
        this.LJII = new LinkedList<>();
        this.LJIIIIZZ = new EnumMap(EnumC30204BtI.class);
    }
}
