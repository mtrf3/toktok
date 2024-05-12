package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EXE implements Handler.Callback {
    public final /* synthetic */ Handler.Callback LJLIL;

    public EXE(Handler.Callback callback) {
        this.LJLIL = callback;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        String str;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 113) {
            try {
                Field declaredField = msg.obj.getClass().getDeclaredField("info");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(msg.obj);
                Field field = obj.getClass().getField("name");
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (String) obj2;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                PEH.LIZLLL(e, "ChildBroadcastReceiverHook.getClassName");
                str = "";
            }
            try {
                Field declaredField2 = msg.obj.getClass().getDeclaredField("intent");
                declaredField2.setAccessible(true);
                Object obj3 = declaredField2.get(msg.obj);
                o.LJII(obj3, "null cannot be cast to non-null type android.content.Intent");
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                PEH.LIZLLL(e2, "ChildBroadcastReceiverHook.getIntent");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EXH());
            arrayList.add(new EXG());
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((EXF) ListProtector.get(arrayList, i)).LIZ(str)) {
                        if (((EXF) ListProtector.get(arrayList, i)).LIZIZ(str)) {
                            Handler.Callback callback = this.LJLIL;
                            if (callback == null) {
                                return false;
                            }
                            return callback.handleMessage(msg);
                        }
                    } else {
                        i++;
                    }
                }
            }
            return true;
        }
        Handler.Callback callback2 = this.LJLIL;
        if (callback2 == null) {
            return false;
        }
        return callback2.handleMessage(msg);
    }
}
