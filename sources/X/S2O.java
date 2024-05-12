package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2O extends S2R<ConstraintLayout, List<AtmosphereTag>> {
    public AtmosphereTag LIZLLL;
    public int LJ;
    public S3R LJFF;
    public final PriorityQueue<AbstractC71456S2q> LJI;
    public final SparseArray<AbstractC71456S2q> LJII;
    public boolean LJIIIIZZ;
    public float LJIIIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2O(ConstraintLayout innerContainerView) {
        super(innerContainerView);
        o.LJIIIZ(innerContainerView, "innerContainerView");
        this.LJFF = new L3T();
        this.LJI = new PriorityQueue<>(3, C71449S2j.LJLIL);
        this.LJII = new SparseArray<>();
        this.LJIIIZ = C32151Nz.LJIIZILJ(82);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZLLL(X.S2O r4) {
        /*
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag r0 = r4.LIZLLL
            if (r0 == 0) goto L32
            int r0 = r0.tagType
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r3 != 0) goto L36
        L11:
            java.lang.String r1 = ""
        L13:
            java.lang.String r0 = "label_type"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag r0 = r4.LIZLLL
            if (r0 == 0) goto L33
            long r0 = r0.count
        L1e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "label_number"
            r2.put(r0, r1)
            int r0 = r4.LJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "label_order"
            r2.put(r0, r1)
        L32:
            return r2
        L33:
            r0 = 0
            goto L1e
        L36:
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto L40
            java.lang.String r1 = "hot"
            goto L13
        L40:
            int r1 = r3.intValue()
            r0 = 2
            if (r1 != r0) goto L4a
            java.lang.String r1 = "onlyleft"
            goto L13
        L4a:
            int r1 = r3.intValue()
            r0 = 3
            if (r1 != r0) goto L11
            java.lang.String r1 = "top_sales"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2O.LIZLLL(X.S2O):java.util.Map");
    }

    public final AbstractC71456S2q LJ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                S3N s3n = new S3N((ViewGroup) this.LIZ, i);
                s3n.LJIIIZ = this.LJIIIZ;
                this.LJII.put(3, s3n);
                this.LJI.add(s3n);
                S3R style = this.LJFF;
                o.LJIIIZ(style, "style");
                s3n.LJIIJ = style;
                return s3n;
            }
            S3M s3m = new S3M((ViewGroup) this.LIZ, i);
            s3m.LJIIIZ = this.LJIIIZ;
            this.LJII.put(2, s3m);
            this.LJI.add(s3m);
            S3R style2 = this.LJFF;
            o.LJIIIZ(style2, "style");
            s3m.LJIIJ = style2;
            return s3m;
        }
        S3O s3o = new S3O((ViewGroup) this.LIZ, i);
        s3o.LJIIIZ = this.LJIIIZ;
        this.LJII.put(1, s3o);
        this.LJI.add(s3o);
        S3R style3 = this.LJFF;
        o.LJIIIZ(style3, "style");
        s3o.LJIIJ = style3;
        return s3o;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "eventMap"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag r0 = r3.LIZLLL
            if (r0 == 0) goto L32
            int r0 = r0.tagType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 != 0) goto L36
        L11:
            java.lang.String r1 = ""
        L13:
            java.lang.String r0 = "label_type"
            r4.put(r0, r1)
            com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag r0 = r3.LIZLLL
            if (r0 == 0) goto L33
            long r0 = r0.count
        L1e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "label_number"
            r4.put(r0, r1)
            int r0 = r3.LJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "label_order"
            r4.put(r0, r1)
        L32:
            return
        L33:
            r0 = 0
            goto L1e
        L36:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L40
            java.lang.String r1 = "hot"
            goto L13
        L40:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L4a
            java.lang.String r1 = "onlyleft"
            goto L13
        L4a:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L11
            java.lang.String r1 = "top_sales"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2O.LJFF(java.util.Map):void");
    }
}
