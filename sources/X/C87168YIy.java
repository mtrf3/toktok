package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.YIy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87168YIy<T> implements YIU<T> {
    public final YIZ LIZ;
    public final YJA<?, ?> LIZIZ;
    public final boolean LIZJ;
    public final YJ7<?> LIZLLL;

    @Override // X.YIU
    public final int LJ(T t) {
        YJA<?, ?> yja = this.LIZIZ;
        int LIZLLL = yja.LIZLLL(yja.LIZJ(t));
        if (this.LIZJ) {
            C87165YIv<?> LIZLLL2 = this.LIZLLL.LIZLLL(t);
            int i = 0;
            for (int i2 = 0; i2 < LIZLLL2.LIZ.LIZLLL(); i2++) {
                i += C87165YIv.LJIIIIZZ(LIZLLL2.LIZ.LJIIIIZZ(i2));
            }
            Iterator<T> it = LIZLLL2.LIZ.LJ().iterator();
            while (it.hasNext()) {
                i += C87165YIv.LJIIIIZZ((Map.Entry) it.next());
            }
            return LIZLLL + i;
        }
        return LIZLLL;
    }

    @Override // X.YIU
    public final boolean LJI(T t) {
        return this.LIZLLL.LIZLLL(t).LIZ();
    }

    @Override // X.YIU
    public final int LJII(T t) {
        int hashCode = this.LIZIZ.LIZJ(t).hashCode();
        if (this.LIZJ) {
            return (hashCode * 53) + this.LIZLLL.LIZLLL(t).hashCode();
        }
        return hashCode;
    }

    @Override // X.YIU
    public final void LJIIIIZZ(YIO yio) {
        this.LIZIZ.LJII(yio);
        this.LIZLLL.LJFF(yio);
    }

    @Override // X.YIU
    public final void LIZLLL(T t, T t2) {
        YJA<?, ?> yja = this.LIZIZ;
        yja.LJFF(t, yja.LJI(yja.LIZJ(t), yja.LIZJ(t2)));
        if (this.LIZJ) {
            C87163YIt.LIZLLL(this.LIZLLL, t, t2);
        }
    }

    @Override // X.YIU
    public final boolean LJFF(T t, T t2) {
        if (!this.LIZIZ.LIZJ(t).equals(this.LIZIZ.LIZJ(t2))) {
            return false;
        }
        if (this.LIZJ) {
            return this.LIZLLL.LIZLLL(t).equals(this.LIZLLL.LIZLLL(t2));
        }
        return true;
    }

    @Override // X.YIU
    public final void LJIIIZ(Object obj, YJ8 yj8) {
        Iterator<Map.Entry<?, Object>> LIZIZ = this.LIZLLL.LIZLLL(obj).LIZIZ();
        while (LIZIZ.hasNext()) {
            Map.Entry<?, Object> next = LIZIZ.next();
            YJB yjb = (YJB) next.getKey();
            if (yjb.LLLLLLLZIL() == YPP.MESSAGE && !yjb.LLLLLLIL() && !yjb.LLLLLZ()) {
                if (next instanceof XRP) {
                    yj8.LIZJ(yjb.zzac(), ((XRP) next).LJLIL.getValue().LIZ());
                } else {
                    yj8.LIZJ(yjb.zzac(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        YJA<?, ?> yja = this.LIZIZ;
        yja.LJ(yja.LIZJ(obj), yj8);
    }

    public C87168YIy(YJA<?, ?> yja, YJ7<?> yj7, YIZ yiz) {
        this.LIZIZ = yja;
        this.LIZJ = yj7.LIZJ(yiz);
        this.LIZLLL = yj7;
        this.LIZ = yiz;
    }
}
