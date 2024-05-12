package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: X.Fio, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39746Fio {
    public static final C39746Fio LJ = new C39746Fio();
    public static Method LJFF;
    public static Object LJI;
    public static MessageQueue LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public static Field LJIIJ;
    public static Field LJIIJJI;
    public static Field LJIIL;
    public int LIZ;
    public int LIZIZ = -1;
    public HandlerC39747Fip LIZJ;
    public Method LIZLLL;

    public static void LIZIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8258896676496487593")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public final void LIZJ() {
        try {
            if (LJII == null || LJIIIIZZ == null || LJIIIZ == null || LJI == null || LJIIJ == null || LJIIJJI == null || LJIIL == null) {
                LJII = (MessageQueue) C78934UyQ.LJIIL(Looper.class, "mQueue").get(C16880lQ.LLJJJJ());
                LJIIIIZZ = C78934UyQ.LJIIL(MessageQueue.class, "mMessages");
                LJIIIZ = C78934UyQ.LJIIL(MessageQueue.class, "mNextBarrierToken");
                Object LIZIZ = EW7.LIZIZ(Class.forName("android.view.WindowManagerGlobal"), "getInstance", new Object[0]);
                LJI = LIZIZ;
                LJIIJ = C78934UyQ.LJIIL(LIZIZ.getClass(), "mRoots");
                LJIIJJI = C78934UyQ.LJIIL(Class.forName("android.view.ViewRootImpl"), "mTraversalBarrier");
                LJIIL = C78934UyQ.LJIIL(Message.class, "next");
                C39749Fir.LIZIZ(EnumC39748Fiq.INFO);
            }
            if (LJFF == null) {
                LJFF = C78934UyQ.LJIILIIL(MessageQueue.class, "removeSyncBarrier", Integer.TYPE);
            }
            if (this.LIZJ == null) {
                this.LIZJ = new HandlerC39747Fip(C16880lQ.LLJJJJ());
            }
        } catch (Throwable unused) {
        }
    }

    public static int LIZ(int i) {
        Object obj = LJIIJ.get(LJI);
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj2 = ListProtector.get(arrayList, i2);
                if (((Integer) LJIIJJI.get(obj2)).intValue() == i) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("mTraversalBarrier == token : for viewRoot:");
                    LIZ.append(obj2);
                    X1D.LIZIZ(LIZ);
                    C39749Fir.LIZIZ(EnumC39748Fiq.DEBUG);
                    return -1;
                }
            }
            return 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" mRoots type is:");
        LIZ2.append(obj);
        X1D.LIZIZ(LIZ2);
        C39749Fir.LIZ();
        return -1;
    }

    public final int LIZLLL(WeakReference<Message> weakReference) {
        try {
            Message message = weakReference.get();
            ArrayList arrayList = new ArrayList();
            Message message2 = message;
            int i = -1;
            for (int i2 = 0; message2 != null && i2 < 5 && message2.getTarget() == null; i2++) {
                int i3 = message2.arg1;
                if (i3 < 0) {
                    break;
                }
                if (i3 > 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("barrier message:");
                    LIZ.append(message2);
                    LIZ.append(" getWhen:");
                    LIZ.append(message2.getWhen());
                    X1D.LIZIZ(LIZ);
                    C39749Fir.LIZIZ(EnumC39748Fiq.DEBUG);
                }
                i = message2.arg1;
                arrayList.add(Integer.valueOf(i));
                message2 = (Message) LJIIL.get(message2);
            }
            int size = arrayList.size();
            if (size <= 0) {
                return -1;
            }
            int i4 = 0;
            while (LIZ(((Integer) ListProtector.get(arrayList, i4)).intValue()) >= 0) {
                i4++;
                if (i4 >= size) {
                    if (this.LIZIZ != i) {
                        this.LIZ = 0;
                        this.LIZIZ = i;
                    }
                    int intValue = ((Integer) LJIIIZ.get(LJII)).intValue();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("last barrier message token:");
                    LIZ2.append(i);
                    LIZ2.append(" MessageQueue::mNextBarrierToken:");
                    LIZ2.append(intValue);
                    X1D.LIZIZ(LIZ2);
                    EnumC39748Fiq enumC39748Fiq = EnumC39748Fiq.INFO;
                    C39749Fir.LIZIZ(enumC39748Fiq);
                    if (i < intValue) {
                        this.LIZ++;
                    }
                    if (this.LIZ < 2) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("token < mNextBarrierToken try again,mCheckTime:");
                        LIZ3.append(this.LIZ);
                        X1D.LIZIZ(LIZ3);
                        C39749Fir.LIZIZ(enumC39748Fiq);
                        return -1;
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("firstMsg:");
                    LIZ4.append(message);
                    X1D.LIZIZ(LIZ4);
                    C39749Fir.LIZIZ(EnumC39748Fiq.WARNING);
                    this.LIZJ.removeMessages(1001);
                    int i5 = 0;
                    int i6 = -1;
                    do {
                        int intValue2 = ((Integer) ListProtector.get(arrayList, i5)).intValue();
                        if (intValue2 < intValue) {
                            Message obtainMessage = this.LIZJ.obtainMessage(1001, intValue2, 0);
                            if (Build.VERSION.SDK_INT >= 22) {
                                obtainMessage.setAsynchronous(true);
                            } else {
                                if (this.LIZLLL == null) {
                                    this.LIZLLL = EW7.LIZ(Message.class, "setAsynchronous", Boolean.TYPE);
                                }
                                try {
                                    LIZIZ(obtainMessage, this.LIZLLL, new Object[]{Boolean.TRUE});
                                } catch (Throwable unused) {
                                }
                            }
                            this.LIZJ.sendMessage(obtainMessage);
                            i6 = intValue2;
                        }
                        i5++;
                    } while (i5 < size);
                    this.LIZ = 0;
                    this.LIZIZ = -1;
                    return i6;
                }
            }
            return -1;
        } catch (Throwable unused2) {
            C39749Fir.LIZIZ(EnumC39748Fiq.WARNING);
            return -1;
        }
    }
}
