package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JSn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49197JSn implements JUA {
    public InterfaceC49148JQq LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C49198JSo.INSTANCE);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C49201JSr.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C49199JSp.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C49200JSq.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 714));

    public final ArrayList<InterfaceC49148JQq> LIZLLL() {
        return (ArrayList) this.LIZLLL.getValue();
    }

    public final ArrayList<InterfaceC49148JQq> LJ() {
        return (ArrayList) this.LJ.getValue();
    }

    public final void LJFF() {
        Iterator it = ((C49202JSs) this.LIZJ.getValue()).LIZ().iterator();
        while (it.hasNext()) {
            InterfaceC49148JQq interfaceC49148JQq = (InterfaceC49148JQq) it.next();
            if (!o.LJ(interfaceC49148JQq, this.LIZ)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("pause this ");
                LIZ.append(interfaceC49148JQq);
                X1D.LIZIZ(LIZ);
                interfaceC49148JQq.LLLLLIL();
            }
        }
    }

    @Override // X.JUA
    public final void pause() {
        InterfaceC49148JQq interfaceC49148JQq = this.LIZ;
        if (interfaceC49148JQq != null) {
            interfaceC49148JQq.LLLLLIL();
            interfaceC49148JQq.hashCode();
        }
        LJFF();
    }

    @Override // X.JUA
    public final void resume() {
        if (this.LIZ != null) {
            InterfaceC49148JQq interfaceC49148JQq = this.LIZ;
            if (interfaceC49148JQq != null) {
                interfaceC49148JQq.y(150L);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (!LJ().isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("re active pending data ");
            LIZ.append(this.LIZ);
            X1D.LIZIZ(LIZ);
            y0(LJ());
            LJ().clear();
        }
    }

    @Override // X.JUA
    public final void LIZIZ() {
        LIZJ();
        LJ().clear();
        this.LIZ = null;
    }

    public final void LIZJ() {
        Iterator<InterfaceC49148JQq> it = LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().z8((C49187JSd) this.LJFF.getValue());
        }
        LIZLLL().clear();
    }

    public final void LJII() {
        int i;
        int size = LIZLLL().size();
        UC7.LIZLLL("onPlay finish and play size is", size);
        if (size <= 1) {
            return;
        }
        int LJZ = ORZ.LJZ(this.LIZ, LIZLLL());
        if (LJZ == -1) {
            return;
        }
        if (LJZ < size - 1) {
            i = LJZ + 1;
        } else {
            i = 0;
        }
        Object obj = ListProtector.get(LIZLLL(), i);
        o.LJIIIIZZ(obj, "dataListToPlay[targetIndex]");
        InterfaceC49148JQq interfaceC49148JQq = (InterfaceC49148JQq) obj;
        if (interfaceC49148JQq.LLIIII()) {
            LJI(interfaceC49148JQq);
        }
    }

    @Override // X.JUA
    public final void LIZ(List<? extends InterfaceC49148JQq> list) {
        LJ().clear();
        LJ().addAll(list);
        LIZLLL().clear();
        this.LIZ = null;
    }

    public final void LJI(InterfaceC49148JQq interfaceC49148JQq) {
        int i;
        InterfaceC49148JQq interfaceC49148JQq2 = this.LIZ;
        if (interfaceC49148JQq2 != null && !o.LJ(interfaceC49148JQq, interfaceC49148JQq2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pause current first");
            InterfaceC49148JQq interfaceC49148JQq3 = this.LIZ;
            if (interfaceC49148JQq3 != null) {
                i = interfaceC49148JQq3.hashCode();
            } else {
                i = 0;
            }
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            InterfaceC49148JQq interfaceC49148JQq4 = this.LIZ;
            if (interfaceC49148JQq4 != null) {
                interfaceC49148JQq4.LLLLLIL();
                interfaceC49148JQq4.hashCode();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (interfaceC49148JQq instanceof InterfaceC48907JHj) {
            JLU.LJI((InterfaceC48907JHj) interfaceC49148JQq);
        }
        this.LIZ = interfaceC49148JQq;
        interfaceC49148JQq.y(150L);
        C49202JSs c49202JSs = (C49202JSs) this.LIZJ.getValue();
        if (c49202JSs.LIZ().size() >= c49202JSs.LIZ) {
            ListProtector.remove(c49202JSs.LIZ(), 0);
        }
        if (!c49202JSs.LIZ().contains(interfaceC49148JQq)) {
            c49202JSs.LIZ().add(interfaceC49148JQq);
        }
        System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("current playing is");
        LIZ2.append(this.LIZ);
        LIZ2.append(' ');
        X1D.LIZIZ(LIZ2);
        InterfaceC49148JQq interfaceC49148JQq5 = this.LIZ;
        if (interfaceC49148JQq5 != null) {
            interfaceC49148JQq5.hashCode();
        }
    }

    @Override // X.JUA
    public final void y0(List<? extends InterfaceC49148JQq> dataToPlay) {
        o.LJIIIZ(dataToPlay, "dataToPlay");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("and data size is ");
        LIZ.append(dataToPlay.size());
        X1D.LIZIZ(LIZ);
        LIZJ();
        Iterator<? extends InterfaceC49148JQq> it = dataToPlay.iterator();
        while (it.hasNext()) {
            it.next().x4((C49187JSd) this.LJFF.getValue());
        }
        if (dataToPlay.isEmpty()) {
            InterfaceC49148JQq interfaceC49148JQq = this.LIZ;
            if (interfaceC49148JQq != null) {
                interfaceC49148JQq.LLLLLIL();
                interfaceC49148JQq.hashCode();
            }
            LJFF();
            return;
        }
        LIZLLL().addAll(dataToPlay);
        LJI((InterfaceC49148JQq) ListProtector.get(dataToPlay, 0));
    }
}
