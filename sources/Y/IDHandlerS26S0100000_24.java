package Y;

import X.C90442ZeY;
import X.DialogC90859ZlH;
import X.DialogC90860ZlI;
import X.DialogC90863ZlL;
import X.ZY4;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes29.dex */
public class IDHandlerS26S0100000_24 extends Handler {
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
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public IDHandlerS26S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void handleMessage$0(IDHandlerS26S0100000_24 iDHandlerS26S0100000_24, Message message) {
        if (message.what != 1) {
            return;
        }
        DialogC90859ZlH dialogC90859ZlH = (DialogC90859ZlH) iDHandlerS26S0100000_24.l0;
        Collection<? extends ZY4> collection = (Collection) message.obj;
        dialogC90859ZlH.getClass();
        dialogC90859ZlH.LJLLI = SystemClock.uptimeMillis();
        dialogC90859ZlH.LJLJL.clear();
        dialogC90859ZlH.LJLJL.addAll(collection);
        dialogC90859ZlH.LJLJLJ.notifyDataSetChanged();
    }

    public static final void handleMessage$1(IDHandlerS26S0100000_24 iDHandlerS26S0100000_24, Message message) {
        if (message.what != 1) {
            return;
        }
        DialogC90860ZlI dialogC90860ZlI = (DialogC90860ZlI) iDHandlerS26S0100000_24.l0;
        Collection collection = (Collection) message.obj;
        dialogC90860ZlI.getClass();
        dialogC90860ZlI.LJLLJ = SystemClock.uptimeMillis();
        ((ArrayList) dialogC90860ZlI.LJLJL).clear();
        ((ArrayList) dialogC90860ZlI.LJLJL).addAll(collection);
        dialogC90860ZlI.LJLJLJ.LJLLLLLL();
    }

    public static final void handleMessage$2(IDHandlerS26S0100000_24 iDHandlerS26S0100000_24, Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            DialogC90863ZlL dialogC90863ZlL = (DialogC90863ZlL) iDHandlerS26S0100000_24.l0;
            if (dialogC90863ZlL.LJZL == null) {
                return;
            }
            dialogC90863ZlL.LJZL = null;
            dialogC90863ZlL.LJJIIJ();
            return;
        }
        ((DialogC90863ZlL) iDHandlerS26S0100000_24.l0).LJJIII();
    }

    public static final void handleMessage$3(IDHandlerS26S0100000_24 iDHandlerS26S0100000_24, Message message) {
        if (message.what == 1) {
            synchronized (((C90442ZeY) iDHandlerS26S0100000_24.l0).LJIJI) {
                ((C90442ZeY) iDHandlerS26S0100000_24.l0).LJIJ = null;
            }
        }
        super.handleMessage(message);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS26S0100000_24(C90442ZeY c90442ZeY, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = c90442ZeY;
    }
}
