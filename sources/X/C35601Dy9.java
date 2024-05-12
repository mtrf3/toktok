package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Dy9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35601Dy9 {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final LinkedList<RunnableC35602DyA> LIZIZ = new LinkedList<>();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(true);
    public static final C35603DyB LIZLLL = C35603DyB.LJLIL;
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C33918DSw.LJLIL);

    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            interfaceC65784Pro.invoke();
        } else {
            LIZ.post(new ARunnableS42S0100000_6(interfaceC65784Pro, 160));
        }
    }

    public static final void LIZIZ(View view) {
        AtomicBoolean atomicBoolean = LIZJ;
        if (atomicBoolean.get()) {
            LIZ(new AqS156S0100000_6(view, 155));
            return;
        }
        if (view == null) {
            return;
        }
        LinkedList<RunnableC35602DyA> linkedList = LIZIZ;
        synchronized (linkedList) {
            if (atomicBoolean.get()) {
                LIZIZ(view);
            } else {
                linkedList.add(new RunnableC35602DyA(view));
                Handler handler = LIZ;
                C35603DyB c35603DyB = LIZLLL;
                handler.removeCallbacks(new IOG(c35603DyB));
                handler.postDelayed(new IOG(c35603DyB), 10000L);
            }
        }
    }
}
