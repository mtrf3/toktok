package com.lynx.tasm.image;

import X.C79697VPp;
import X.EnumC79692VPk;
import X.InterfaceC79664VOi;
import Y.ARunnableS0S0114000_10;
import android.os.Handler;
import android.os.Looper;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* loaded from: classes15.dex */
public class AutoSizeImage extends ShadowNode implements InterfaceC79664VOi {
    public boolean LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public Handler LJJ;
    public ARunnableS0S0114000_10 LJJI;
    public boolean LJIL = true;
    public final Object LJJIFFI = new Object();

    public AutoSizeImage() {
        LJIIJJI(this);
    }

    @Override // X.InterfaceC79664VOi
    public final long LIZJ(LayoutNode layoutNode, float f, EnumC79692VPk enumC79692VPk, float f2, EnumC79692VPk enumC79692VPk2) {
        boolean z;
        synchronized (this.LJJIFFI) {
            if (this.LJJ == null) {
                Handler handler = new Handler(Looper.myLooper());
                this.LJJ = handler;
                ARunnableS0S0114000_10 aRunnableS0S0114000_10 = this.LJJI;
                if (aRunnableS0S0114000_10 != null) {
                    handler.post(aRunnableS0S0114000_10);
                    this.LJJI = null;
                }
            }
        }
        EnumC79692VPk enumC79692VPk3 = EnumC79692VPk.EXACTLY;
        boolean z2 = false;
        if (enumC79692VPk == enumC79692VPk3 && enumC79692VPk2 == enumC79692VPk3) {
            z = true;
        } else {
            z = false;
        }
        this.LJIL = z;
        if (z) {
            return C79697VPp.LIZ(f, f2);
        }
        int i = this.LJIJJ;
        int i2 = this.LJIJJLI;
        if ((f == 0.0f && enumC79692VPk != EnumC79692VPk.UNDEFINED) || (f2 == 0.0f && enumC79692VPk2 != EnumC79692VPk.UNDEFINED)) {
            z2 = true;
        }
        this.LJIL = z2;
        if (!this.LJIJI || i <= 0 || i2 <= 0 || z2) {
            if (enumC79692VPk != enumC79692VPk3) {
                f = 0.0f;
            }
            if (enumC79692VPk2 != enumC79692VPk3) {
                f2 = 0.0f;
            }
            return C79697VPp.LIZ(f, f2);
        }
        if (enumC79692VPk == enumC79692VPk3) {
            float f3 = (i2 / i) * f;
            if (enumC79692VPk2 != EnumC79692VPk.AT_MOST ? enumC79692VPk2 == EnumC79692VPk.UNDEFINED : f2 > f3) {
                f2 = f3;
            }
        } else {
            EnumC79692VPk enumC79692VPk4 = EnumC79692VPk.UNDEFINED;
            if (enumC79692VPk == enumC79692VPk4) {
                f = 65535;
            }
            if (enumC79692VPk2 == enumC79692VPk4) {
                f2 = 65535;
            }
            if (enumC79692VPk2 == enumC79692VPk3) {
                float f4 = (i / i2) * f2;
                if (f > f4) {
                    f = f4;
                }
            } else {
                float f5 = i;
                if (f5 <= f) {
                    float f6 = i2;
                    if (f6 <= f2) {
                        f = f5;
                        f2 = f6;
                    }
                }
                float f7 = i2 / f5;
                if (f2 / f < f7) {
                    f = f2 / f7;
                } else {
                    f2 = f7 * f;
                }
            }
        }
        return C79697VPp.LIZ(f, f2);
    }

    public final void LJJIII(int i, int i2, int i3, int i4, boolean z) {
        boolean z2 = this.LJIJI;
        this.LJIJI = z;
        this.LJIJJ = i;
        this.LJIJJLI = i2;
        if (z2 != z) {
            LJIIIIZZ();
            return;
        }
        if (!this.LJIL && z && i > 0 && i2 > 0) {
            if (i3 == 0 || i4 == 0 || Math.abs((i3 / i4) - (i / i2)) > 0.05d) {
                LJIIIIZZ();
            }
        }
    }
}
