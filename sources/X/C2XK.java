package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.jato.gfx.DoFrameController;
import kotlin.jvm.internal.o;

/* renamed from: X.2XK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2XK extends AbstractC65781Prl implements InterfaceC65784Pro<C2XM> {
    public static final C2XK LJLIL = new C2XK();

    public C2XK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C2XM invoke() {
        final Handler handler = DoFrameController.LIZLLL;
        if (handler == null) {
            return new C2XM() { // from class: X.2XI
                {
                    new Handler() { // from class: X.2XH
                        {
                            C16880lQ.LLJJJJ();
                        }

                        @Override // android.os.Handler
                        public final void dispatchMessage(Message msg) {
                            boolean booleanValue;
                            o.LJIIIZ(msg, "msg");
                            try {
                                super.dispatchMessage(msg);
                            } finally {
                                if (booleanValue) {
                                }
                            }
                        }
                    };
                }
            };
        }
        return new C2XM(handler) { // from class: X.2XJ
        };
    }
}
