package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32491Ph implements InterfaceC10230ah {
    public final int LIZ;
    public final int LIZIZ;
    public final Object LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final List<C10170ab> LJIIIIZZ;
    public final C10240ai LJIIIZ;
    public final long LJIIJ;
    public final boolean LJIIJJI;

    public C32491Ph() {
        throw null;
    }

    @Override // X.InterfaceC10230ah
    public final int getIndex() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC10230ah
    public final int getOffset() {
        return this.LIZ;
    }

    public final C1J4<C23450w1> LIZ(int i) {
        Object obj = ((C10170ab) ListProtector.get(this.LJIIIIZZ, i)).LIZJ;
        if (obj instanceof C1J4) {
            return (C1J4) obj;
        }
        return null;
    }

    public final int LIZIZ(int i) {
        AbstractC39201gK abstractC39201gK = ((C10170ab) ListProtector.get(this.LJIIIIZZ, i)).LIZIZ;
        if (this.LJII) {
            return abstractC39201gK.LJLILLLLZI;
        }
        return abstractC39201gK.LJLIL;
    }

    public final long LIZJ(int i) {
        return ((C10170ab) ListProtector.get(this.LJIIIIZZ, i)).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(AbstractC274515x scope) {
        int i;
        long LIZJ;
        o.LJIIIZ(scope, "scope");
        int size = this.LJIIIIZZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC39201gK abstractC39201gK = ((C10170ab) ListProtector.get(this.LJIIIIZZ, i2)).LIZIZ;
            int i3 = this.LJFF;
            if (this.LJII) {
                i = abstractC39201gK.LJLILLLLZI;
            } else {
                i = abstractC39201gK.LJLIL;
            }
            int i4 = i3 - i;
            int i5 = this.LJI;
            if (LIZ(i2) != null) {
                C10240ai c10240ai = this.LJIIIZ;
                Object key = this.LIZJ;
                LIZJ = LIZJ(i2);
                c10240ai.getClass();
                o.LJIIIZ(key, "key");
                C10140aY c10140aY = (C10140aY) ((LinkedHashMap) c10240ai.LIZJ).get(key);
                if (c10140aY != null) {
                    C10310ap c10310ap = (C10310ap) ListProtector.get(c10140aY.LIZIZ, i2);
                    long j = c10310ap.LIZIZ.LIZJ().LIZ;
                    long j2 = c10140aY.LIZ;
                    LIZJ = C78939UyV.LIZ(((int) (j >> 32)) + ((int) (j2 >> 32)), C23450w1.LIZJ(j2) + C23450w1.LIZJ(j));
                    long j3 = c10310ap.LIZJ;
                    long j4 = c10140aY.LIZ;
                    long LIZ = C78939UyV.LIZ(((int) (j3 >> 32)) + ((int) (j4 >> 32)), C23450w1.LIZJ(j4) + C23450w1.LIZJ(j3));
                    if (((Boolean) c10310ap.LIZLLL.getValue()).booleanValue() && ((c10240ai.LIZJ(LIZ) < i4 && c10240ai.LIZJ(LIZJ) < i4) || (c10240ai.LIZJ(LIZ) > i5 && c10240ai.LIZJ(LIZJ) > i5))) {
                        XKX.LIZLLL(c10240ai.LIZ, null, null, new C54862Di(c10310ap, null), 3);
                    }
                }
            } else {
                LIZJ = LIZJ(i2);
            }
            if (this.LJII) {
                long j5 = this.LJIIJ;
                AbstractC274515x.LJIIJJI(scope, abstractC39201gK, C78939UyV.LIZ(((int) (LIZJ >> 32)) + ((int) (j5 >> 32)), C23450w1.LIZJ(j5) + C23450w1.LIZJ(LIZJ)));
            } else {
                long j6 = this.LJIIJ;
                AbstractC274515x.LJIIIIZZ(scope, abstractC39201gK, C78939UyV.LIZ(((int) (LIZJ >> 32)) + ((int) (j6 >> 32)), C23450w1.LIZJ(j6) + C23450w1.LIZJ(LIZJ)));
            }
        }
    }

    public C32491Ph(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List list, C10240ai c10240ai, long j) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = obj;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = z;
        this.LJIIIIZZ = list;
        this.LJIIIZ = c10240ai;
        this.LJIIJ = j;
        int size = list.size();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            if (LIZ(i7) != null) {
                z2 = true;
                break;
            }
            i7++;
        }
        this.LJIIJJI = z2;
    }
}
