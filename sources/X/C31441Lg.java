package X;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31441Lg implements C0SP {
    public final C0SM LIZ;
    public C10370av LIZIZ;
    public final EdgeEffect LIZJ;
    public final EdgeEffect LIZLLL;
    public final EdgeEffect LJ;
    public final EdgeEffect LJFF;
    public final List<EdgeEffect> LJI;
    public final EdgeEffect LJII;
    public final EdgeEffect LJIIIIZZ;
    public final EdgeEffect LJIIIZ;
    public final EdgeEffect LJIIJ;
    public final ParcelableSnapshotMutableState LJIIJJI;
    public final boolean LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public final ParcelableSnapshotMutableState LJIILL;
    public boolean LJIILLIIL;
    public C11O LJIIZILJ;
    public final InterfaceC07790Sh LJIJ;

    @Override // X.C0SP
    public final boolean LIZ() {
        List<EdgeEffect> list = this.LJI;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C0SN.LIZIZ((EdgeEffect) ListProtector.get(list, i)) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void LJI() {
        List<EdgeEffect> list = this.LJI;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) ListProtector.get(list, i);
            edgeEffect.onRelease();
            if (edgeEffect.isFinished() || z) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            LJIIJ();
        }
    }

    public final void LJIIJ() {
        if (this.LJIIL) {
            this.LJIIJJI.setValue(C76800UCe.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0SP
    public final boolean isEnabled() {
        return ((Boolean) this.LJIILL.getValue()).booleanValue();
    }

    @Override // X.C0SP
    public final InterfaceC07790Sh LIZIZ() {
        return this.LJIJ;
    }

    @Override // X.C0SP
    public final C23560wC LIZJ(long j) {
        float f;
        if (C10430b1.LJ(this.LJIILJJIL)) {
            return new C23560wC(C23560wC.LIZIZ);
        }
        float f2 = 0.0f;
        if (C23560wC.LIZIZ(j) <= 0.0f || C0SN.LIZIZ(this.LJ) == 0.0f) {
            if (C23560wC.LIZIZ(j) >= 0.0f || C0SN.LIZIZ(this.LJFF) == 0.0f) {
                f = 0.0f;
            } else {
                C0SN.LIZJ(this.LJFF, -O6R.LJJIIZ(C23560wC.LIZIZ(j)));
                f = C23560wC.LIZIZ(j);
            }
        } else {
            C0SN.LIZJ(this.LJ, O6R.LJJIIZ(C23560wC.LIZIZ(j)));
            f = C23560wC.LIZIZ(j);
        }
        if (C23560wC.LIZJ(j) <= 0.0f || C0SN.LIZIZ(this.LIZJ) == 0.0f) {
            if (C23560wC.LIZJ(j) < 0.0f && C0SN.LIZIZ(this.LIZLLL) != 0.0f) {
                C0SN.LIZJ(this.LIZLLL, -O6R.LJJIIZ(C23560wC.LIZJ(j)));
                f2 = C23560wC.LIZJ(j);
            }
        } else {
            C0SN.LIZJ(this.LIZJ, O6R.LJJIIZ(C23560wC.LIZJ(j)));
            f2 = C23560wC.LIZJ(j);
        }
        long LJFF = C78983UzD.LJFF(f, f2);
        if (LJFF != C23560wC.LIZIZ) {
            LJIIJ();
        }
        return new C23560wC(LJFF);
    }

    @Override // X.C0SP
    public final C76800UCe LIZLLL(long j) {
        if (C10430b1.LJ(this.LJIILJJIL)) {
            return C76800UCe.LIZ;
        }
        this.LJIILIIL = false;
        if (C23560wC.LIZIZ(j) > 0.0f) {
            C0SN.LIZJ(this.LJ, O6R.LJJIIZ(C23560wC.LIZIZ(j)));
        } else if (C23560wC.LIZIZ(j) < 0.0f) {
            C0SN.LIZJ(this.LJFF, -O6R.LJJIIZ(C23560wC.LIZIZ(j)));
        }
        if (C23560wC.LIZJ(j) > 0.0f) {
            C0SN.LIZJ(this.LIZJ, O6R.LJJIIZ(C23560wC.LIZJ(j)));
        } else if (C23560wC.LIZJ(j) < 0.0f) {
            C0SN.LIZJ(this.LIZLLL, -O6R.LJJIIZ(C23560wC.LIZJ(j)));
        }
        if (j != C23560wC.LIZIZ) {
            LJIIJ();
        }
        LJI();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    @Override // X.C0SP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJFF(long r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31441Lg.LJFF(long):long");
    }

    @Override // X.C0SP
    public final void setEnabled(boolean z) {
        boolean z2;
        if (this.LJIILLIIL != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIILL.setValue(Boolean.valueOf(z));
        this.LJIILLIIL = z;
        if (z2) {
            this.LJIILIIL = false;
            LJI();
        }
    }

    public C31441Lg(Context context, C0SM c0sm) {
        o.LJIIIZ(context, "context");
        this.LIZ = c0sm;
        EdgeEffect LIZ = C0SN.LIZ(context);
        this.LIZJ = LIZ;
        EdgeEffect LIZ2 = C0SN.LIZ(context);
        this.LIZLLL = LIZ2;
        EdgeEffect LIZ3 = C0SN.LIZ(context);
        this.LJ = LIZ3;
        EdgeEffect LIZ4 = C0SN.LIZ(context);
        this.LJFF = LIZ4;
        List<EdgeEffect> LJJIJIIJI = C47261Igj.LJJIJIIJI(LIZ3, LIZ, LIZ4, LIZ2);
        this.LJI = LJJIJIIJI;
        this.LJII = C0SN.LIZ(context);
        this.LJIIIIZZ = C0SN.LIZ(context);
        this.LJIIIZ = C0SN.LIZ(context);
        this.LJIIJ = C0SN.LIZ(context);
        int size = LJJIJIIJI.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) ListProtector.get(LJJIJIIJI, i)).setColor(C78897Uxp.LJJJZ(this.LIZ.LIZ));
        }
        C76800UCe c76800UCe = C76800UCe.LIZ;
        this.LJIIJJI = C78966Uyw.LJJJI(c76800UCe, C35831at.LIZ);
        this.LJIIL = true;
        this.LJIILJJIL = C10430b1.LIZIZ;
        this.LJIILL = C78966Uyw.LJJJIL(Boolean.FALSE);
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this, 159);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        InterfaceC07790Sh other = C0S9.LIZIZ;
        c1m1.getClass();
        o.LJIIIZ(other, "other");
        this.LJIJ = C77413UZt.LJJI(C11F.LIZIZ(other, c76800UCe, new C2CD(this, null)), iDqS416S0100000).LLLIIIL(new C49121wK(this));
    }

    public final float LJIIJJI(long j, long j2) {
        return C10430b1.LIZIZ(this.LJIILJJIL) * (-C0SN.LIZLLL(this.LIZLLL, -(C10370av.LJ(j) / C10430b1.LIZIZ(this.LJIILJJIL)), 1 - (C10370av.LIZLLL(j2) / C10430b1.LIZLLL(this.LJIILJJIL))));
    }

    public final float LJIIL(long j, long j2) {
        return C10430b1.LIZLLL(this.LJIILJJIL) * C0SN.LIZLLL(this.LJ, C10370av.LIZLLL(j) / C10430b1.LIZLLL(this.LJIILJJIL), 1 - (C10370av.LJ(j2) / C10430b1.LIZIZ(this.LJIILJJIL)));
    }

    public final float LJIILIIL(long j, long j2) {
        return C10430b1.LIZLLL(this.LJIILJJIL) * (-C0SN.LIZLLL(this.LJFF, -(C10370av.LIZLLL(j) / C10430b1.LIZLLL(this.LJIILJJIL)), C10370av.LJ(j2) / C10430b1.LIZIZ(this.LJIILJJIL)));
    }

    public final float LJIILJJIL(long j, long j2) {
        float LIZLLL = C10370av.LIZLLL(j2) / C10430b1.LIZLLL(this.LJIILJJIL);
        return C10430b1.LIZIZ(this.LJIILJJIL) * C0SN.LIZLLL(this.LIZJ, C10370av.LJ(j) / C10430b1.LIZIZ(this.LJIILJJIL), LIZLLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r5.LIZLLL.isFinished() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c4, code lost:
    
        if (r3 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
    
        if (r2 == false) goto L54;
     */
    @Override // X.C0SP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r6, long r7, long r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31441Lg.LJ(int, long, long):void");
    }

    public final boolean LJII(InterfaceC33691Tx interfaceC33691Tx, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C10430b1.LIZLLL(this.LJIILJJIL), (-C10430b1.LIZIZ(this.LJIILJJIL)) + interfaceC33691Tx.LJJJJIZL(this.LIZ.LIZIZ.LIZIZ()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean LJIIIIZZ(InterfaceC33691Tx interfaceC33691Tx, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C10430b1.LIZIZ(this.LJIILJJIL), interfaceC33691Tx.LJJJJIZL(this.LIZ.LIZIZ.LIZJ(interfaceC33691Tx.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean LJIIIZ(InterfaceC33691Tx interfaceC33691Tx, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int LJJIIZ = O6R.LJJIIZ(C10430b1.LIZLLL(this.LJIILJJIL));
        float LIZ = this.LIZ.LIZIZ.LIZ(interfaceC33691Tx.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, interfaceC33691Tx.LJJJJIZL(LIZ) + (-LJJIIZ));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
}
