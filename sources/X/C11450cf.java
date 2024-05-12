package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.0cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11450cf {
    public final int LIZ;
    public final Object LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final EnumC23500w6 LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final List<AbstractC39201gK> LJIIIZ;
    public final C11370cX LJIIJ;
    public final long LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;

    public C11450cf() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1QL LIZ(int r28, int r29, int r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11450cf.LIZ(int, int, int, int, int, int, int):X.1QL");
    }

    public C11450cf(int i, Object obj, boolean z, int i2, int i3, boolean z2, EnumC23500w6 enumC23500w6, int i4, int i5, List list, C11370cX c11370cX, long j) {
        int i6;
        this.LIZ = i;
        this.LIZIZ = obj;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = z2;
        this.LJI = enumC23500w6;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = list;
        this.LJIIJ = c11370cX;
        this.LJIIJJI = j;
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC39201gK abstractC39201gK = (AbstractC39201gK) ListProtector.get(list, i8);
            if (this.LIZJ) {
                i6 = abstractC39201gK.LJLILLLLZI;
            } else {
                i6 = abstractC39201gK.LJLIL;
            }
            i7 = Math.max(i7, i6);
        }
        this.LJIIL = i7;
        int i9 = i7 + this.LJ;
        this.LJIILIIL = i9 >= 0 ? i9 : 0;
    }
}
