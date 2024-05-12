package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.UxC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78858UxC extends F9E implements Serializable {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final float LJLJJL;

    public static /* synthetic */ C78858UxC copy$default(C78858UxC c78858UxC, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c78858UxC.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i2 = c78858UxC.LJLILLLLZI;
        }
        return c78858UxC.copy(i, i2);
    }

    public final C78858UxC copy(int i, int i2) {
        return new C78858UxC(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)};
    }

    public final int getHeight() {
        return this.LJLILLLLZI;
    }

    public final int getMax() {
        return this.LJLJI;
    }

    public final int getMin() {
        return this.LJLJJI;
    }

    public final float getScale() {
        return this.LJLJJL;
    }

    public final int getWidth() {
        return this.LJLIL;
    }

    public final C78858UxC scaleMax(int i) {
        int i2 = (int) (i / this.LJLJJL);
        if (this.LJLIL > this.LJLILLLLZI) {
            return new C78858UxC(i, i2);
        }
        return new C78858UxC(i2, i);
    }

    public final C78858UxC scaleMin(int i) {
        int i2 = (int) (i * this.LJLJJL);
        if (this.LJLIL > this.LJLILLLLZI) {
            return new C78858UxC(i2, i);
        }
        return new C78858UxC(i, i2);
    }

    public C78858UxC(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        int max = Math.max(i, i2);
        this.LJLJI = max;
        int min = Math.min(i, i2);
        this.LJLJJI = min;
        this.LJLJJL = max / min;
    }

    public final boolean isLargeOrEqualThan(C78858UxC anotherOne, EnumC78860UxE mode) {
        o.LJIIIZ(anotherOne, "anotherOne");
        o.LJIIIZ(mode, "mode");
        int i = C78859UxD.LIZ[mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LJLJI < anotherOne.LJLJI && this.LJLJJI < anotherOne.LJLJJI) {
                    return false;
                }
            } else {
                throw new C162476Zf();
            }
        } else if (this.LJLJI < anotherOne.LJLJI || this.LJLJJI < anotherOne.LJLJJI) {
            return false;
        }
        return true;
    }

    public final C78858UxC scaleTo(C78858UxC target, EnumC78861UxF mode) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(mode, "mode");
        if (C78859UxD.LIZIZ[mode.ordinal()] == 1) {
            int i = this.LJLJI;
            int i2 = target.LJLJJI;
            int i3 = i * i2;
            int i4 = this.LJLJJI;
            int i5 = target.LJLJI;
            if (i3 >= i4 * i5) {
                return scaleMax(i5);
            }
            return scaleMin(i2);
        }
        throw new C162476Zf();
    }

    public static /* synthetic */ boolean isLargeOrEqualThan$default(C78858UxC c78858UxC, C78858UxC c78858UxC2, EnumC78860UxE enumC78860UxE, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC78860UxE = EnumC78860UxE.ALL_DIMENSION;
        }
        return c78858UxC.isLargeOrEqualThan(c78858UxC2, enumC78860UxE);
    }

    public static /* synthetic */ C78858UxC scaleTo$default(C78858UxC c78858UxC, C78858UxC c78858UxC2, EnumC78861UxF enumC78861UxF, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC78861UxF = EnumC78861UxF.FIT_CENTER;
        }
        return c78858UxC.scaleTo(c78858UxC2, enumC78861UxF);
    }
}
