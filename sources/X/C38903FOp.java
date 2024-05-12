package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS69S0201000_6;
import kotlin.jvm.internal.AqS95S0300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FOp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38903FOp extends AbstractC38902FOo {
    public final void LIZIZ() {
        synchronized (this.LJLILLLLZI) {
            if (this.LJLJI.size() > 0) {
                String remove = this.LJLJI.remove(0);
                o.LJFF(remove, "inflateList.removeAt(0)");
                String str = remove;
                ArrayList<InterfaceC65784Pro<C76800UCe>> arrayList = this.LJLILLLLZI.get(str);
                if (arrayList != null) {
                    if (arrayList.size() > 0) {
                        InterfaceC65784Pro<C76800UCe> remove2 = arrayList.remove(0);
                        o.LJFF(remove2, "inflateTasks!!.removeAt(0)");
                        remove2.invoke();
                    } else {
                        this.LJLILLLLZI.remove(str);
                    }
                }
                if (this.LJLILLLLZI.size() > 0 && !this.LJLIL.hasMessages(1)) {
                    Message obtainMessage = this.LJLIL.obtainMessage();
                    obtainMessage.what = 1;
                    obtainMessage.obj = null;
                    this.LJLIL.removeMessages(1);
                    this.LJLIL.sendMessageDelayed(obtainMessage, 5000L);
                }
            }
        }
    }

    public C38903FOp() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 23) {
            Looper LLJJJJ = C16880lQ.LLJJJJ();
            o.LJFF(LLJJJJ, "Looper.getMainLooper()");
            C16880lQ.LJLI(LLJJJJ.getQueue(), new C38904FOq(this));
            return;
        }
        Handler handler = this.LJLIL;
        try {
            if (C1PH.LJLJI == null) {
                C1PH.LJLJI = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            }
            Field field = (Field) C1PH.LJIIJJI(handler.getClass(), C1PH.LJLJI, new Object[]{"mQueue"});
            field.setAccessible(true);
            obj = field.get(handler);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            obj = null;
        }
        MessageQueue messageQueue = (MessageQueue) obj;
        if (messageQueue != null) {
            C16880lQ.LJLI(messageQueue, new C38905FOr(this));
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(this, 144));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIJ(msg, "msg");
        LIZIZ();
        return true;
    }

    @Override // X.InterfaceC38906FOs
    public final void LIZ(int i, Context context, InterfaceC39061FUr interfaceC39061FUr) {
        synchronized (this.LJLILLLLZI) {
            if (this.LJLILLLLZI.get(interfaceC39061FUr.LJII()) == null) {
                this.LJLILLLLZI.put(interfaceC39061FUr.LJII(), new ArrayList<>());
            }
            ArrayList<InterfaceC65784Pro<C76800UCe>> arrayList = this.LJLILLLLZI.get(interfaceC39061FUr.LJII());
            if (arrayList != null) {
                arrayList.add(new AqS95S0300000_6(context, interfaceC39061FUr, new AqS69S0201000_6(i, context, interfaceC39061FUr, 1), 0));
                this.LJLJI.add(interfaceC39061FUr.LJII());
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        if (this.LJLILLLLZI.size() != 0 && !this.LJLIL.hasMessages(1)) {
            Message obtainMessage = this.LJLIL.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = null;
            this.LJLIL.removeMessages(1);
            this.LJLIL.sendMessageDelayed(obtainMessage, 5000L);
        }
    }
}
