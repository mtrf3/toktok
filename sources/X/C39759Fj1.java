package X;

import android.os.Build;
import android.os.Message;
import java.lang.reflect.Method;

/* renamed from: X.Fj1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39759Fj1 extends W8S {
    public HandlerC39765Fj7 LJLJI;
    public Method LJLJJI;

    public static void LJI(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7508182549973899296")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public final void LJII() {
        Message obtainMessage = this.LJLJI.obtainMessage(101);
        if (Build.VERSION.SDK_INT >= 22) {
            obtainMessage.setAsynchronous(true);
        } else {
            if (this.LJLJJI == null) {
                this.LJLJJI = EW7.LIZ(Message.class, "setAsynchronous", Boolean.TYPE);
            }
            try {
                LJI(obtainMessage, this.LJLJJI, new Object[]{Boolean.TRUE});
            } catch (Throwable unused) {
            }
        }
        this.LJLJI.sendMessageDelayed(obtainMessage, 3000L);
    }

    public C39759Fj1(C77119UOl c77119UOl) {
        super("TimerInMessageQueue", c77119UOl);
    }
}
