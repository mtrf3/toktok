package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.QsX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68377QsX {
    public final C68377QsX LIZ;
    public final C68387Qsh LIZIZ;
    public final java.util.Map LIZJ = new HashMap();
    public final java.util.Map LIZLLL = new HashMap();

    public final C68377QsX LIZ() {
        return new C68377QsX(this, this.LIZIZ);
    }

    public final InterfaceC68379QsZ LIZIZ(InterfaceC68379QsZ interfaceC68379QsZ) {
        return this.LIZIZ.LIZIZ(this, interfaceC68379QsZ);
    }

    public final InterfaceC68379QsZ LIZJ(C68375QsV c68375QsV) {
        InterfaceC68379QsZ interfaceC68379QsZ = InterfaceC68379QsZ.LJIIJ;
        Iterator LJIJJLI = c68375QsV.LJIJJLI();
        while (LJIJJLI.hasNext()) {
            interfaceC68379QsZ = this.LIZIZ.LIZIZ(this, c68375QsV.LJIIZILJ(((Integer) LJIJJLI.next()).intValue()));
            if (interfaceC68379QsZ instanceof C68381Qsb) {
                break;
            }
        }
        return interfaceC68379QsZ;
    }

    public final InterfaceC68379QsZ LIZLLL(String str) {
        if (((HashMap) this.LIZJ).containsKey(str)) {
            return (InterfaceC68379QsZ) ((HashMap) this.LIZJ).get(str);
        }
        C68377QsX c68377QsX = this.LIZ;
        if (c68377QsX != null) {
            return c68377QsX.LIZLLL(str);
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("%s is not defined", new Object[]{str}));
    }

    public final boolean LJI(String str) {
        if (((HashMap) this.LIZJ).containsKey(str)) {
            return true;
        }
        C68377QsX c68377QsX = this.LIZ;
        if (c68377QsX != null) {
            return c68377QsX.LJI(str);
        }
        return false;
    }

    public C68377QsX(C68377QsX c68377QsX, C68387Qsh c68387Qsh) {
        this.LIZ = c68377QsX;
        this.LIZIZ = c68387Qsh;
    }

    public final void LJ(String str, InterfaceC68379QsZ interfaceC68379QsZ) {
        if (((HashMap) this.LIZLLL).containsKey(str)) {
            return;
        }
        if (interfaceC68379QsZ == null) {
            ((HashMap) this.LIZJ).remove(str);
        } else {
            ((HashMap) this.LIZJ).put(str, interfaceC68379QsZ);
        }
    }

    public final void LJFF(String str, InterfaceC68379QsZ interfaceC68379QsZ) {
        C68377QsX c68377QsX;
        if (((HashMap) this.LIZJ).containsKey(str) || (c68377QsX = this.LIZ) == null || !c68377QsX.LJI(str)) {
            if (((HashMap) this.LIZLLL).containsKey(str)) {
                return;
            }
            if (interfaceC68379QsZ == null) {
                ((HashMap) this.LIZJ).remove(str);
                return;
            } else {
                ((HashMap) this.LIZJ).put(str, interfaceC68379QsZ);
                return;
            }
        }
        this.LIZ.LJFF(str, interfaceC68379QsZ);
    }
}
