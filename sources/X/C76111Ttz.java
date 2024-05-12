package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ttz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76111Ttz implements InterfaceC75871Tq7 {
    public final /* synthetic */ C76110Tty LIZ;

    @Override // X.InterfaceC75871Tq7
    public final long LIZ() {
        if (this.LIZ.LJLLI == EnumC31946CgI.MULTI_ARCH.getType()) {
            return this.LIZ.LJLJLLL;
        }
        return this.LIZ.LJLLILLLL;
    }

    @Override // X.InterfaceC75871Tq7
    public final long LIZIZ() {
        Long l;
        C75794Tos c75794Tos = this.LIZ.LJLJJLL;
        if (c75794Tos != null && (l = c75794Tos.LIZIZ) != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.InterfaceC75871Tq7
    public final long LIZJ() {
        Long l;
        C75794Tos c75794Tos = this.LIZ.LJLJJLL;
        if (c75794Tos != null && (l = c75794Tos.LIZ) != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.InterfaceC75871Tq7
    public final List<C75989Ts1> LIZLLL() {
        Enumeration<C75989Ts1> elements = this.LIZ.LJZL.elements();
        o.LJIIIIZZ(elements, "linkUserMap.elements()");
        ArrayList list = Collections.list(elements);
        o.LJIIIIZZ(list, "list(this)");
        return list;
    }

    @Override // X.InterfaceC75871Tq7
    public final C75989Ts1 LJFF() {
        C76110Tty c76110Tty = this.LIZ;
        ConcurrentHashMap<String, C75989Ts1> concurrentHashMap = c76110Tty.LJZL;
        String str = c76110Tty.LJLL;
        if (str == null) {
            str = "";
        }
        return concurrentHashMap.get(str);
    }

    @Override // X.InterfaceC75871Tq7
    public final DataChannel LJIIL() {
        LiveWidget liveWidget;
        C75794Tos c75794Tos = this.LIZ.LJLJJLL;
        if (c75794Tos != null && (liveWidget = c75794Tos.LJII) != null) {
            return liveWidget.dataChannel;
        }
        return null;
    }

    @Override // X.InterfaceC75871Tq7
    public final C75989Ts1 LJ() {
        C75989Ts1 c75989Ts1;
        Iterator<C75989Ts1> it = LIZLLL().iterator();
        while (true) {
            if (it.hasNext()) {
                c75989Ts1 = it.next();
                C75989Ts1 c75989Ts12 = c75989Ts1;
                C75989Ts1 LJFF = LJFF();
                if (LJFF == null || c75989Ts12.LIZIZ != LJFF.LIZIZ) {
                    break;
                }
            } else {
                c75989Ts1 = null;
                break;
            }
        }
        return c75989Ts1;
    }

    public C76111Ttz(C76110Tty c76110Tty) {
        this.LIZ = c76110Tty;
    }

    @Override // X.InterfaceC75871Tq7
    public final C75989Ts1 LJI(String str) {
        return this.LIZ.LJZL.get(str);
    }
}
