package X;

import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Fx1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40627Fx1 implements InterfaceC32497CpB, InterfaceC48038ItG {
    public static long LJLIL = -1;
    public static long LJLILLLLZI = -1;
    public static final C40627Fx1 LJLJI = new C40627Fx1();

    @Override // X.InterfaceC32497CpB
    public void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    @Override // X.InterfaceC32497CpB
    public void LIZJ(SendGiftResult sendGiftResult) {
    }

    public static float LIZ() {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(C38891fp.LJIJJLI(), "window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            return defaultDisplay.getRefreshRate();
        }
        return 60;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return Boolean.TRUE;
    }
}
