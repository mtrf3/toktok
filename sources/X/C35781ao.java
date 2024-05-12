package X;

import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35781ao implements InterfaceC24350xT {
    public final java.util.Set<InterfaceC24390xX> LIZ;
    public final List<InterfaceC24390xX> LIZIZ;
    public final List<InterfaceC24390xX> LIZJ;
    public final List<InterfaceC65784Pro<C76800UCe>> LIZLLL;

    public final void LIZLLL() {
        if (!this.LIZ.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator<InterfaceC24390xX> it = this.LIZ.iterator();
                while (it.hasNext()) {
                    InterfaceC24390xX next = it.next();
                    it.remove();
                    next.LIZIZ();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void LJ() {
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            Trace.beginSection("Compose:onForgotten");
            try {
                for (int size = ((ArrayList) this.LIZJ).size() - 1; -1 < size; size--) {
                    InterfaceC24390xX interfaceC24390xX = (InterfaceC24390xX) ((ArrayList) this.LIZJ).get(size);
                    if (!this.LIZ.contains(interfaceC24390xX)) {
                        interfaceC24390xX.LIZLLL();
                    }
                }
            } finally {
            }
        }
        if (!((ArrayList) this.LIZIZ).isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                ArrayList arrayList = (ArrayList) this.LIZIZ;
                int size2 = arrayList.size();
                for (int i = 0; i < size2; i++) {
                    InterfaceC24390xX interfaceC24390xX2 = (InterfaceC24390xX) arrayList.get(i);
                    this.LIZ.remove(interfaceC24390xX2);
                    interfaceC24390xX2.LIZJ();
                }
            } finally {
            }
        }
    }

    public final void LJFF() {
        if (!((ArrayList) this.LIZLLL).isEmpty()) {
            Trace.beginSection("Compose:sideeffects");
            try {
                ArrayList arrayList = (ArrayList) this.LIZLLL;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC65784Pro) arrayList.get(i)).invoke();
                }
                ((ArrayList) this.LIZLLL).clear();
            } finally {
                Trace.endSection();
            }
        }
    }

    public C35781ao(java.util.Set<InterfaceC24390xX> abandoning) {
        o.LJIIIZ(abandoning, "abandoning");
        this.LIZ = abandoning;
        this.LIZIZ = new ArrayList();
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
    }

    @Override // X.InterfaceC24350xT
    public final void LIZ(InterfaceC65784Pro<C76800UCe> effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZLLL.add(effect);
    }

    @Override // X.InterfaceC24350xT
    public final void LIZIZ(InterfaceC24390xX instance) {
        o.LJIIIZ(instance, "instance");
        int lastIndexOf = ((ArrayList) this.LIZIZ).lastIndexOf(instance);
        if (lastIndexOf >= 0) {
            ListProtector.remove(this.LIZIZ, lastIndexOf);
            this.LIZ.remove(instance);
        } else {
            ((ArrayList) this.LIZJ).add(instance);
        }
    }

    @Override // X.InterfaceC24350xT
    public final void LIZJ(InterfaceC24390xX instance) {
        o.LJIIIZ(instance, "instance");
        int lastIndexOf = ((ArrayList) this.LIZJ).lastIndexOf(instance);
        if (lastIndexOf >= 0) {
            ListProtector.remove(this.LIZJ, lastIndexOf);
            this.LIZ.remove(instance);
        } else {
            ((ArrayList) this.LIZIZ).add(instance);
        }
    }
}
