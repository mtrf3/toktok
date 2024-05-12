package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JLU {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(JLV.LJLIL);
    public static WeakReference<InterfaceC48907JHj> LIZIZ;

    public static void LIZ() {
        InterfaceC48907JHj interfaceC48907JHj;
        WeakReference<InterfaceC48907JHj> weakReference = LIZIZ;
        if (weakReference != null && (interfaceC48907JHj = weakReference.get()) != null) {
            interfaceC48907JHj.LLLLLJLJLL();
        }
    }

    public static void LIZIZ() {
        InterfaceC48907JHj interfaceC48907JHj;
        WeakReference<InterfaceC48907JHj> weakReference = LIZIZ;
        if (weakReference != null && (interfaceC48907JHj = weakReference.get()) != null) {
            interfaceC48907JHj.LLLJIL();
        }
    }

    public static InterfaceC48907JHj LIZLLL() {
        WeakReference<InterfaceC48907JHj> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static JLT LJ() {
        return (JLT) LIZ.getValue();
    }

    public static void LJFF() {
        Iterator it = ((ArrayList) LJ().LIZ()).iterator();
        while (it.hasNext()) {
            InterfaceC48907JHj interfaceC48907JHj = (InterfaceC48907JHj) ((Reference) it.next()).get();
            if (interfaceC48907JHj != null) {
                interfaceC48907JHj.LLLLLJLJLL();
            }
        }
    }

    public static void LIZJ(InterfaceC48907JHj item) {
        o.LJIIIZ(item, "item");
        LIZIZ = new WeakReference<>(item);
    }

    public static void LJI(InterfaceC48907JHj interfaceC48907JHj) {
        Iterator it = ((ArrayList) LJ().LIZ()).iterator();
        while (it.hasNext()) {
            InterfaceC48907JHj interfaceC48907JHj2 = (InterfaceC48907JHj) ((Reference) it.next()).get();
            if (!o.LJ(interfaceC48907JHj2, interfaceC48907JHj) && interfaceC48907JHj2 != null) {
                interfaceC48907JHj2.LLLLLJLJLL();
            }
        }
    }

    public static void LJII(InterfaceC48907JHj videoView) {
        o.LJIIIZ(videoView, "videoView");
        Iterator it = ((ArrayList) LJ().LIZ()).iterator();
        while (it.hasNext()) {
            if (o.LJ(((Reference) it.next()).get(), videoView)) {
                return;
            }
        }
        JLT LJ = LJ();
        WeakReference weakReference = new WeakReference(videoView);
        synchronized (LJ) {
            LJ.LIZIZ = true;
            ((ArrayList) LJ.LIZ).add(weakReference);
        }
    }

    public static void LJIIIIZZ(InterfaceC48907JHj videoView) {
        Reference reference;
        o.LJIIIZ(videoView, "videoView");
        Iterator it = ((ArrayList) LJ().LIZ()).iterator();
        while (true) {
            if (it.hasNext()) {
                reference = (Reference) it.next();
                if (o.LJ(reference.get(), videoView)) {
                    break;
                }
            } else {
                reference = null;
                break;
            }
        }
        JLT LJ = LJ();
        synchronized (LJ) {
            LJ.LIZIZ = true;
            ((ArrayList) LJ.LIZ).remove(reference);
        }
    }
}
