package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Method;

/* renamed from: X.Fip, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC39747Fip extends Handler {
    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8258896676496487593")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public HandlerC39747Fip(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what != 1001) {
            return;
        }
        try {
            int i = message.arg1;
            LIZ(C39746Fio.LJII, C39746Fio.LJFF, new Object[]{Integer.valueOf(i)});
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("force remove lost barrier for:");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            C39749Fir.LIZIZ(EnumC39748Fiq.WARNING);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("delete barrier message throwable !!!");
            LIZ2.append(e);
            X1D.LIZIZ(LIZ2);
            C39749Fir.LIZIZ(EnumC39748Fiq.WARNING);
            C16880lQ.LLLLIIL(e);
        }
    }
}
