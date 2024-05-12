package X;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IO8 extends Handler {
    public static final /* synthetic */ int LIZJ = 0;
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public long LIZIZ;

    public final float LIZ() {
        Long valueOf = Long.valueOf(this.LIZIZ);
        if (valueOf.longValue() > 0) {
            valueOf.longValue();
            return ((float) (System.currentTimeMillis() - this.LIZIZ)) / 1000.0f;
        }
        return 0.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IO8(AqS163S0100000_13 dismissWidget) {
        super(C16880lQ.LLJJJJ());
        o.LJIIIZ(dismissWidget, "dismissWidget");
        this.LIZ = dismissWidget;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 101) {
            this.LIZ.invoke();
        }
    }
}
