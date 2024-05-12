package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0yA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24780yA {
    public static final C531226q LIZ = C531226q.LJLIL;
    public static final C531426s LIZIZ = C531426s.LJLIL;
    public static final C531126p LIZJ = C531126p.LJLIL;
    public static final C531526t LIZLLL = C531526t.LJLIL;
    public static final C531326r LJ = C531326r.LJLIL;
    public static final C35861aw LJFF = new C35861aw("provider");
    public static final C35861aw LJI = new C35861aw("provider");
    public static final C35861aw LJII = new C35861aw("compositionLocalMap");
    public static final C35861aw LJIIIIZZ = new C35861aw("providerValues");
    public static final C35861aw LJIIIZ = new C35861aw("providers");
    public static final C35861aw LJIIJ = new C35861aw("reference");

    public static final void LIZJ(String message) {
        o.LJIIIZ(message, "message");
        final String LJ2 = a1.LJ("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", message, "). Please report to Google or use https://goo.gle/compose-feedback");
        throw new IllegalStateException(LJ2) { // from class: X.0xg
            public final String LJLIL;

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.LJLIL;
            }

            {
                o.LJIIIZ(LJ2, "message");
                this.LJLIL = LJ2;
            }
        };
    }

    public static final void LJFF(boolean z) {
        if (z) {
            return;
        }
        "Check failed".toString();
        LIZJ("Check failed");
        throw null;
    }

    public static final int LIZLLL(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int LJIIJJI = o.LJIIJJI(((C24670xz) ListProtector.get(list, i3)).LIZIZ, i);
            if (LJIIJJI < 0) {
                i2 = i3 + 1;
            } else if (LJIIJJI > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final void LJ(C24570xp c24570xp, InterfaceC24350xT rememberManager) {
        C35991b9 c35991b9;
        C43991o3 c43991o3;
        o.LJIIIZ(c24570xp, "<this>");
        o.LJIIIZ(rememberManager, "rememberManager");
        int LJI2 = c24570xp.LJI(c24570xp.LJIILJJIL(c24570xp.LJIIZILJ), c24570xp.LIZIZ);
        int[] iArr = c24570xp.LIZIZ;
        int i = c24570xp.LJIIZILJ;
        C35951b5 c35951b5 = new C35951b5(LJI2, c24570xp.LJI(c24570xp.LJIILJJIL(c24570xp.LJIILL(i) + i), iArr), c24570xp);
        while (c35951b5.hasNext()) {
            Object next = c35951b5.next();
            if (next instanceof InterfaceC24390xX) {
                rememberManager.LIZIZ((InterfaceC24390xX) next);
            } else if ((next instanceof C35991b9) && (c43991o3 = (c35991b9 = (C35991b9) next).LIZIZ) != null) {
                c43991o3.LJLLL = true;
                c35991b9.LIZIZ = null;
                c35991b9.LJFF = null;
                c35991b9.LJI = null;
            }
        }
        c24570xp.LJJIIZI();
    }

    public static final void LIZ(int i, int i2, List list) {
        int LIZLLL2 = LIZLLL(i, list);
        if (LIZLLL2 < 0) {
            LIZLLL2 = -(LIZLLL2 + 1);
        }
        while (LIZLLL2 < ((ArrayList) list).size() && ((C24670xz) ListProtector.get(list, LIZLLL2)).LIZIZ < i2) {
            ListProtector.remove(list, LIZLLL2);
        }
    }

    public static final void LIZIZ(C24450xd c24450xd, List<Object> list, int i) {
        if (c24450xd.LJIIIIZZ(i)) {
            ((ArrayList) list).add(c24450xd.LJIIIZ(i));
            return;
        }
        int i2 = i + 1;
        int LJII2 = c24450xd.LJII(i) + i;
        while (i2 < LJII2) {
            LIZIZ(c24450xd, list, i2);
            i2 += c24450xd.LJII(i2);
        }
    }
}
