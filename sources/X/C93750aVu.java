package X;

import android.os.Handler;
import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.aVu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93750aVu {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public static final ConcurrentHashMap<Integer, Boolean> LIZJ = new ConcurrentHashMap<>();

    public static void LIZIZ(View view, InterfaceC88472Yns interfaceC88472Yns) {
        C16880lQ.LJIIJ(new ViewOnClickListenerC93753aVx(500L, interfaceC88472Yns), view);
    }

    public static void LIZ(View onClick, long j, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(onClick, "$this$onClick");
        C16880lQ.LJIIJ(new ViewOnClickListenerC93749aVt(onClick.hashCode(), j, interfaceC88472Yns), onClick);
    }
}
