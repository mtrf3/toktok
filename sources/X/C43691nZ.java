package X;

import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43691nZ implements InterfaceC34851Yj, InterfaceC22630uh {
    public final Path LIZ = new Path();
    public final C04740Go LIZIZ;
    public final C35151Zn LIZJ;
    public boolean LIZLLL;
    public C34861Yk LJ;
    public final C34821Yg LJFF;

    @Override // X.InterfaceC22630uh
    public final void LJI() {
        this.LIZLLL = false;
        this.LIZIZ.invalidateSelf();
    }

    @Override // X.InterfaceC34851Yj
    public final Path getPath() {
        C34821Yg c34821Yg;
        if (this.LIZLLL) {
            return this.LIZ;
        }
        this.LIZ.reset();
        this.LIZ.set(LJI());
        this.LIZ.setFillType(Path.FillType.EVEN_ODD);
        if (C03970Dp.LIZ && (c34821Yg = this.LJFF) != null) {
            c34821Yg.LJ(this.LIZ);
        } else {
            C06310Mp.LIZIZ(this.LIZ, this.LJ);
        }
        this.LIZLLL = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC20640rU
    public final void LIZLLL(List<InterfaceC20640rU> list, List<InterfaceC20640rU> list2) {
        C34821Yg c34821Yg;
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC20640rU interfaceC20640rU = (InterfaceC20640rU) ListProtector.get(list, i);
            if (interfaceC20640rU instanceof C34861Yk) {
                C34861Yk c34861Yk = (C34861Yk) interfaceC20640rU;
                if (c34861Yk.LIZIZ == AnonymousClass151.Simultaneously) {
                    if (C03970Dp.LIZ && (c34821Yg = this.LJFF) != null) {
                        ((List) c34821Yg.LIZ).add(c34861Yk);
                        c34861Yk.LIZIZ(this);
                    } else {
                        this.LJ = c34861Yk;
                        c34861Yk.LIZIZ(this);
                    }
                }
            }
        }
    }

    public C43691nZ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk, C38861fm c38861fm) {
        if (C03970Dp.LIZ) {
            this.LJFF = new C34821Yg(0, 0);
        }
        this.LIZIZ = c04740Go;
        AbstractC22650uj<C271914x, Path> LIZ = c38861fm.LIZJ.LIZ();
        this.LIZJ = (C35151Zn) LIZ;
        abstractC45041pk.LJFF(LIZ);
        LIZ.LIZ(this);
    }
}
