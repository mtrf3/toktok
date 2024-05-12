package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ich, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47011Ich implements IXI {
    public final C62822Ol8 LIZ;
    public final /* synthetic */ C47010Icg LIZIZ;

    public C47011Ich(C47010Icg this$0) {
        o.LJIIIZ(this$0, "this$0");
        this.LIZIZ = this$0;
        this.LIZ = C221108m2.LIZIZ(C47019Icp.INSTANCE);
    }

    public final void LIZ(IX7 ix7, HandlerThread handlerThread) {
        ArrayList<C47007Icd> arrayList = this.LIZIZ.LJ;
        if (arrayList != null) {
            C65777Prh.LIZ(arrayList).remove(ix7);
            C47010Icg c47010Icg = this.LIZIZ;
            if (c47010Icg.LJII) {
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                this.LIZIZ.LIZLLL.clear();
                ((LinkedList) this.LIZIZ.LIZJ).clear();
                this.LIZIZ.LJ.clear();
                return;
            }
            Iterator<C47007Icd> it = c47010Icg.LJ.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().LIZLLL, handlerThread)) {
                    return;
                }
            }
            int size = ((LinkedList) this.LIZIZ.LIZJ).size();
            C47010Icg c47010Icg2 = this.LIZIZ;
            if (size < c47010Icg2.LIZIZ.LJ) {
                if (!((LinkedList) c47010Icg2.LIZJ).contains(handlerThread)) {
                    ((LinkedList) this.LIZIZ.LIZJ).add(handlerThread);
                }
                ArrayList<HandlerThread> arrayList2 = this.LIZIZ.LIZLLL;
                if (arrayList2 != null) {
                    C65777Prh.LIZ(arrayList2).remove(handlerThread);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            ArrayList<HandlerThread> arrayList3 = this.LIZIZ.LIZLLL;
            if (arrayList3 != null) {
                C65777Prh.LIZ(arrayList3).remove(handlerThread);
                ((LinkedList) this.LIZIZ.LIZJ).remove(handlerThread);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @Override // X.IXI
    public final void LJI(final IX7 ix7, final HandlerThread handlerThread) {
        if (IZ8.LJJIL().getConcurrentReleaseFix()) {
            final int i = 1;
            ((Handler) this.LIZ.getValue()).post(new Runnable() { // from class: X.0BT
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            Object obj = this;
                            InterfaceC262911l interfaceC262911l = (InterfaceC262911l) ix7;
                            Object obj2 = handlerThread;
                            obj.getClass();
                            interfaceC262911l.LIZIZ();
                            obj2.getClass();
                            throw null;
                        default:
                            C47011Ich this$0 = (C47011Ich) this;
                            IX7 ix72 = (IX7) ix7;
                            HandlerThread handlerThread2 = (HandlerThread) handlerThread;
                            o.LJIIIZ(this$0, "this$0");
                            this$0.LIZ(ix72, handlerThread2);
                            return;
                    }
                }
            });
            return;
        }
        LIZ(ix7, handlerThread);
    }
}
