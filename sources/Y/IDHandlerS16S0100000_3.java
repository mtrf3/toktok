package Y;

import X.C7EL;
import X.InterfaceC178146yw;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDHandlerS16S0100000_3 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS16S0100000_3 iDHandlerS16S0100000_3, Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        InterfaceC178146yw interfaceC178146yw = ((C7EL) iDHandlerS16S0100000_3.l0).LJLJLLL;
        if (interfaceC178146yw != null) {
            interfaceC178146yw.y1(msg.arg1);
        }
    }

    public static final void handleMessage$1(IDHandlerS16S0100000_3 iDHandlerS16S0100000_3, Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        int i = msg.arg1;
        if (i == 1) {
            ((KeyboardInputV2Assem) iDHandlerS16S0100000_3.l0).Q3(true);
        } else {
            if (i != 2) {
                return;
            }
            ((KeyboardInputV2Assem) iDHandlerS16S0100000_3.l0).Q3(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS16S0100000_3(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
