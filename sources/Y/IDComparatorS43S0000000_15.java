package Y;

import X.C66851QLn;
import X.C84234X4c;
import X.C86832Y6a;
import X.XG1;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.Comparator;

/* loaded from: classes16.dex */
public class IDComparatorS43S0000000_15 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS43S0000000_15(int i) {
        this.$t = i;
    }

    public static final int compare$0(IDComparatorS43S0000000_15 iDComparatorS43S0000000_15, Object obj, Object obj2) {
        return C66851QLn.LJFF(Integer.valueOf(((RecyclerView.ViewHolder) obj).getLayoutPosition()), Integer.valueOf(((RecyclerView.ViewHolder) obj2).getLayoutPosition()));
    }

    public static final int compare$1(IDComparatorS43S0000000_15 iDComparatorS43S0000000_15, Object obj, Object obj2) {
        long j = ((XG1) obj).LIZ;
        long j2 = ((XG1) obj2).LIZ;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return -1;
        }
        return 1;
    }

    public static final int compare$2(IDComparatorS43S0000000_15 iDComparatorS43S0000000_15, Object obj, Object obj2) {
        return (int) (((C84234X4c) obj).LIZ - ((C84234X4c) obj2).LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$3(Y.IDComparatorS43S0000000_15 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.YHo r3 = (X.InterfaceC87132YHo) r3
            boolean r0 = r3 instanceof X.C87127YHj
            r2 = 0
            if (r0 == 0) goto L2d
            X.YHj r3 = (X.C87127YHj) r3
            int r0 = r3.LIZJ
        Lb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lf:
            X.YHo r4 = (X.InterfaceC87132YHo) r4
            boolean r0 = r4 instanceof X.C87127YHj
            if (r0 == 0) goto L22
            X.YHj r4 = (X.C87127YHj) r4
            int r0 = r4.LIZJ
        L19:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1d:
            int r0 = X.C66851QLn.LJFF(r1, r2)
            return r0
        L22:
            boolean r0 = r4 instanceof X.C87126YHi
            if (r0 == 0) goto L1d
            X.YHi r4 = (X.C87126YHi) r4
            if (r4 == 0) goto L1d
            int r0 = r4.LIZ
            goto L19
        L2d:
            boolean r0 = r3 instanceof X.C87126YHi
            if (r0 == 0) goto L38
            X.YHi r3 = (X.C87126YHi) r3
            if (r3 == 0) goto L38
            int r0 = r3.LIZ
            goto Lb
        L38:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDComparatorS43S0000000_15.compare$3(Y.IDComparatorS43S0000000_15, java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$4(Y.IDComparatorS43S0000000_15 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.YHo r4 = (X.InterfaceC87132YHo) r4
            boolean r0 = r4 instanceof X.C87129YHl
            r2 = 0
            if (r0 == 0) goto L2d
            X.YHl r4 = (X.C87129YHl) r4
            int r0 = r4.LIZ
        Lb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lf:
            X.YHo r3 = (X.InterfaceC87132YHo) r3
            boolean r0 = r3 instanceof X.C87129YHl
            if (r0 == 0) goto L22
            X.YHl r3 = (X.C87129YHl) r3
            int r0 = r3.LIZ
        L19:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1d:
            int r0 = X.C66851QLn.LJFF(r1, r2)
            return r0
        L22:
            boolean r0 = r3 instanceof X.C87127YHj
            if (r0 == 0) goto L1d
            X.YHj r3 = (X.C87127YHj) r3
            if (r3 == 0) goto L1d
            int r0 = r3.LIZ
            goto L19
        L2d:
            boolean r0 = r4 instanceof X.C87127YHj
            if (r0 == 0) goto L38
            X.YHj r4 = (X.C87127YHj) r4
            if (r4 == 0) goto L38
            int r0 = r4.LIZ
            goto Lb
        L38:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDComparatorS43S0000000_15.compare$4(Y.IDComparatorS43S0000000_15, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$5(IDComparatorS43S0000000_15 iDComparatorS43S0000000_15, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C86832Y6a) obj).LJ), Long.valueOf(((C86832Y6a) obj2).LJ));
    }

    public static final int compare$6(IDComparatorS43S0000000_15 iDComparatorS43S0000000_15, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((PublishBehaviorModel) obj).timeStamp), Long.valueOf(((PublishBehaviorModel) obj2).timeStamp));
    }

    public static final int compare$7(IDComparatorS43S0000000_15 iDComparatorS43S0000000_15, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((PublishBehaviorModel) obj2).timeStamp), Long.valueOf(((PublishBehaviorModel) obj).timeStamp));
    }

    public static final int compare$8(IDComparatorS43S0000000_15 iDComparatorS43S0000000_15, Object obj, Object obj2) {
        return C66851QLn.LJFF(Long.valueOf(((C86832Y6a) obj2).LJ), Long.valueOf(((C86832Y6a) obj).LJ));
    }
}
