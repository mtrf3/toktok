package X;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Q0g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66298Q0g implements Handler.Callback {
    public static final C66298Q0g LJLIL = new C66298Q0g();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message it) {
        o.LJIIJ(it, "it");
        try {
            if (it.what == 1) {
                Object obj = it.obj;
                if (obj instanceof C66297Q0f) {
                    if (obj != null) {
                        C66297Q0f c66297Q0f = (C66297Q0f) obj;
                        C66297Q0f LIZ = c66297Q0f.LIZ();
                        c66297Q0f.LIZIZ();
                        Iterator<InterfaceC66315Q0x> it2 = Q0Z.LIZ.iterator();
                        while (it2.hasNext()) {
                            try {
                                it2.next().onEvent(LIZ);
                            } catch (Throwable unused) {
                            }
                        }
                        java.util.Set set = (java.util.Set) ((LinkedHashMap) Q0Z.LIZIZ).get(LIZ.LIZIZ);
                        if (set != null) {
                            Iterator it3 = set.iterator();
                            while (it3.hasNext()) {
                                ((InterfaceC66315Q0x) it3.next()).onEvent(LIZ);
                            }
                        }
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.bpea.core.event.Event");
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return true;
    }
}
