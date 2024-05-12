package Y;

import androidx.lifecycle.Observer;

/* loaded from: classes2.dex */
public class AObserverS46S0201000_1 implements Observer {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.OUP.LJJII(r4, null, null, 3) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$0(Y.AObserverS46S0201000_1 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.im.service.model.ActivityStatus r4 = (com.ss.android.ugc.aweme.im.service.model.ActivityStatus) r4
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMContact r2 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r2
            if (r4 == 0) goto L20
            r1 = 3
            r0 = 0
            boolean r1 = X.OUP.LJJII(r4, r0, r0, r1)
            r0 = 1
            if (r1 != r0) goto L20
        L13:
            r2.setOnline(r0)
            java.lang.Object r1 = r3.l1
            X.4Pq r1 = (X.C109024Pq) r1
            int r0 = r3.i2
            r1.notifyItemChanged(r0)
            return
        L20:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS46S0201000_1.onChanged$0(Y.AObserverS46S0201000_1, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.OUP.LJJII(r4, null, null, 3) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS46S0201000_1 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.im.service.model.ActivityStatus r4 = (com.ss.android.ugc.aweme.im.service.model.ActivityStatus) r4
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMContact r2 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r2
            if (r4 == 0) goto L20
            r1 = 3
            r0 = 0
            boolean r1 = X.OUP.LJJII(r4, r0, r0, r1)
            r0 = 1
            if (r1 != r0) goto L20
        L13:
            r2.setOnline(r0)
            java.lang.Object r1 = r3.l1
            X.4Pp r1 = (X.C109014Pp) r1
            int r0 = r3.i2
            r1.notifyItemChanged(r0)
            return
        L20:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS46S0201000_1.onChanged$1(Y.AObserverS46S0201000_1, java.lang.Object):void");
    }

    public AObserverS46S0201000_1(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
