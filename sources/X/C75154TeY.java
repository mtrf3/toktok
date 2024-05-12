package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TeY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75154TeY {
    public final C75525TkX LIZ;
    public final C75150TeU LIZIZ;
    public final List<Long> LIZJ;
    public int LIZLLL;

    public final boolean LIZIZ() {
        C75150TeU c75150TeU = this.LIZIZ;
        if (c75150TeU.LJLJJLL || !c75150TeU.LJLJL) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canLinkCrossRoom = ");
        LIZ.append(this.LIZ.LLIIIILZ);
        LIZ.append(" canLinkInRoom = ");
        LIZ.append(LIZIZ());
        C0NB.LJIIIZ("FindCrashLog#NewToolbarInteractBehavior#onBundleLoaded", X1D.LIZIZ(LIZ));
        if (this.LIZ.LLIIIILZ && LIZIZ()) {
            LJFF(0, 17);
            return;
        }
        if (this.LIZ.LLIIIILZ && !LIZIZ()) {
            LJFF(0, 1);
        } else {
            if (!LIZIZ() || this.LIZ.LLIIIILZ) {
                return;
            }
            LJFF(0, 16);
        }
    }

    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on bundle load failed. canLInkCrossRoom");
        LIZ.append(this.LIZ.LLIIIILZ);
        LIZ.append(" canLinkInRoom");
        LIZ.append(LIZIZ());
        TVY.LIZIZ(X1D.LIZIZ(LIZ));
        if (this.LIZ.LLIIIILZ && LIZIZ()) {
            LJFF(0, 17);
            return;
        }
        if (this.LIZ.LLIIIILZ && !LIZIZ()) {
            LJFF(0, 1);
        } else {
            if (!LIZIZ() || this.LIZ.LLIIIILZ) {
                return;
            }
            LJFF(0, 16);
        }
    }

    public final void LJ(int i) {
        this.LIZIZ.LJ(i, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set reservationWidget visible: ");
        LIZ.append(i);
        C0NB.LIZIZ("ToolbarInteractDelegate", X1D.LIZIZ(LIZ));
    }

    public C75154TeY(InterfaceC75523TkV onInteractClickListener, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(onInteractClickListener, "onInteractClickListener");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C35598Dy6 c35598Dy6 = new C35598Dy6(0);
        this.LIZ = new C75525TkX(onInteractClickListener, lifecycleOwner, c35598Dy6);
        this.LIZIZ = new C75150TeU(onInteractClickListener, lifecycleOwner, c35598Dy6);
        this.LIZJ = new ArrayList();
    }

    public final void LIZ(int i, int i2) {
        C012403c.LJ("changeMultiGuestIconRedNumForApply: ", i, "ToolbarInteractDelegate");
        this.LIZLLL = i2;
        boolean z = false;
        if (((ArrayList) this.LIZJ).size() + i2 > 0) {
            this.LIZIZ.LJII(false);
            this.LIZIZ.LJI(((ArrayList) this.LIZJ).size() + this.LIZLLL);
            return;
        }
        this.LIZIZ.LJI(0);
        C75150TeU c75150TeU = this.LIZIZ;
        if (i > 0) {
            z = true;
        }
        c75150TeU.LJII(z);
    }

    public final void LJFF(int i, int i2) {
        if ((i2 & 1) == 1) {
            this.LIZ.LJIILL(i);
        }
        if ((i2 & 16) == 16) {
            this.LIZIZ.LJ(i, false);
        }
    }
}
