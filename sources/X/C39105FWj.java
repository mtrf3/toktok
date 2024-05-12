package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.FWj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39105FWj {
    public static final Object LJFF = new Object();
    public static volatile C39105FWj LJI;
    public final ThreadLocal<Handler> LIZ = new ThreadLocal<>();
    public final ThreadLocal<List<InterfaceC39114FWs>> LIZIZ = new ThreadLocal<>();
    public final ThreadLocal<InterfaceC39773FjF> LIZJ = new ThreadLocal<>();
    public final ThreadLocal<Queue<Message>> LIZLLL = new ThreadLocal<>();
    public Handler LJ;

    public final void LIZ(InterfaceC39114FWs interfaceC39114FWs) {
        List<InterfaceC39114FWs> list = this.LIZIZ.get();
        if (list == null) {
            list = new ArrayList<>();
            this.LIZIZ.set(list);
        }
        list.add(interfaceC39114FWs);
    }

    public final void LIZIZ(InterfaceC39114FWs interfaceC39114FWs) {
        List<InterfaceC39114FWs> list;
        if (interfaceC39114FWs != null && (list = this.LIZIZ.get()) != null) {
            list.remove(interfaceC39114FWs);
        }
    }
}
