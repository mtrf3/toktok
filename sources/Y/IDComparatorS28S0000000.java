package Y;

import X.C026208k;
import X.C03140Ak;
import X.C08410Ur;
import X.C0C1;
import X.C12380eA;
import X.C12930f3;
import X.C13W;
import X.C24670xz;
import X.C25240yu;
import X.C270014e;
import X.C29321Dc;
import X.C66851QLn;
import X.OSZ;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDComparatorS28S0000000 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case 9:
                return compare$9(this, obj, obj2);
            case 10:
                return compare$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return compare$11(this, obj, obj2);
            case 12:
                return compare$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return compare$16(this, obj, obj2);
            case 17:
                return compare$17(this, obj, obj2);
            case 18:
                return compare$18(this, obj, obj2);
            case 19:
                return compare$19(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS28S0000000(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return ((C026208k) obj2).LIZ - ((C026208k) obj).LIZ;
    }

    public static final int compare$1(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return ((C026208k) obj2).LIZ - ((C026208k) obj).LIZ;
    }

    public static final int compare$10(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public static final int compare$11(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C12380eA.LIZIZ((Field) obj).compareTo(C12380eA.LIZIZ((Field) obj2));
    }

    public static final int compare$12(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C12930f3) obj).LJ), Long.valueOf(((C12930f3) obj2).LJ));
    }

    public static final int compare$13(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C12930f3) obj).LJ), Long.valueOf(((C12930f3) obj2).LJ));
    }

    public static final int compare$14(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C12930f3) obj).LJ), Long.valueOf(((C12930f3) obj2).LJ));
    }

    public static final int compare$15(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C12930f3) obj).LJ), Long.valueOf(((C12930f3) obj2).LJ));
    }

    public static final int compare$16(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C24670xz) obj).LIZIZ), Integer.valueOf(((C24670xz) obj2).LIZIZ));
    }

    public static final int compare$17(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C25240yu) obj).LIZ.priority), Integer.valueOf(((C25240yu) obj2).LIZ.priority));
    }

    public static final int compare$18(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return Integer.compare(((C13W) obj).LIZ, ((C13W) obj2).LIZ);
    }

    public static final int compare$19(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return ((C270014e) obj).LIZJ - ((C270014e) obj2).LIZJ;
    }

    public static final int compare$2(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return ((C03140Ak) obj).LIZ - ((C03140Ak) obj2).LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r4 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$3(Y.IDComparatorS28S0000000 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            X.0Ay r5 = (X.C03280Ay) r5
            X.0Ay r6 = (X.C03280Ay) r6
            androidx.recyclerview.widget.RecyclerView r4 = r5.LIZLLL
            r3 = 1
            r2 = 0
            if (r4 != 0) goto L34
            r1 = 1
        Lb:
            androidx.recyclerview.widget.RecyclerView r0 = r6.LIZLLL
            if (r0 != 0) goto L32
            r0 = 1
        L10:
            if (r1 == r0) goto L16
            if (r4 != 0) goto L1e
        L14:
            r2 = r3
        L15:
            return r2
        L16:
            boolean r1 = r5.LIZ
            boolean r0 = r6.LIZ
            if (r1 == r0) goto L20
            if (r1 == 0) goto L14
        L1e:
            r3 = -1
            goto L14
        L20:
            int r1 = r6.LIZIZ
            int r0 = r5.LIZIZ
            int r1 = r1 - r0
            if (r1 == 0) goto L29
            r2 = r1
            goto L15
        L29:
            int r1 = r5.LIZJ
            int r0 = r6.LIZJ
            int r1 = r1 - r0
            if (r1 == 0) goto L15
            r2 = r1
            goto L15
        L32:
            r0 = 0
            goto L10
        L34:
            r1 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDComparatorS28S0000000.compare$3(Y.IDComparatorS28S0000000, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$4(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return ((C0C1) obj).LIZIZ - ((C0C1) obj2).LIZIZ;
    }

    public static final int compare$5(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return ((int[]) obj)[0] - ((int[]) obj2)[0];
    }

    public static final int compare$6(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        C29321Dc l1 = (C29321Dc) obj;
        C29321Dc l2 = (C29321Dc) obj2;
        o.LJIIIZ(l1, "l1");
        o.LJIIIZ(l2, "l2");
        int LJIIJJI = o.LJIIJJI(l1.LJLJLLL, l2.LJLJLLL);
        if (LJIIJJI != 0) {
            return LJIIJJI;
        }
        return o.LJIIJJI(l1.hashCode(), l2.hashCode());
    }

    public static final int compare$7(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((C08410Ur) obj).LIZIZ), Integer.valueOf(((C08410Ur) obj2).LIZIZ));
    }

    public static final int compare$8(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        OSZ osz = (OSZ) obj;
        OSZ osz2 = (OSZ) obj2;
        return (((Number) osz.getSecond()).intValue() - ((Number) osz.getFirst()).intValue()) - (((Number) osz2.getSecond()).intValue() - ((Number) osz2.getFirst()).intValue());
    }

    public static final int compare$9(IDComparatorS28S0000000 iDComparatorS28S0000000, Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}
