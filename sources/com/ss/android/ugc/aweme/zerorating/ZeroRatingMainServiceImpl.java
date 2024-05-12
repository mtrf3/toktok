package com.ss.android.ugc.aweme.zerorating;

import com.ss.android.ugc.aweme.api.IZeroRatingMainService;

/* loaded from: classes7.dex */
public final class ZeroRatingMainServiceImpl implements IZeroRatingMainService {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009e, code lost:
    
        if (r3 >= X.C36858EdK.LIZ().getLong("key_msisdn_expired_time", -1)) goto L9;
     */
    @Override // com.ss.android.ugc.aweme.api.IZeroRatingMainService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r13 = this;
            X.F7E r4 = X.F7E.LJI
            android.content.Context r5 = X.EF7.LIZIZ()
            X.ENt r3 = new X.ENt
            r3.<init>()
            X.F7F r2 = new X.F7F
            r2.<init>()
            X.F7D r1 = new X.F7D
            r1.<init>()
            X.E7f r0 = new X.E7f
            r0.<init>(r13)
            r4.getClass()
            X.F7E.LIZIZ = r3
            X.F7E.LIZJ = r2
            X.F7E.LJ = r1
            X.F7E.LJFF = r0
            X.Ol8 r0 = X.F7E.LIZLLL
            r9 = 0
            java.lang.Object r6 = r0.getValue()
            X.F7I r6 = (X.F7I) r6
            r6.getClass()
            java.lang.StringBuilder r8 = X.X1D.LIZ()
            java.lang.String r0 = "tryAssociateMsisdn isExpired:"
            r8.append(r0)
            long r11 = java.lang.System.currentTimeMillis()
            X.EdK r10 = X.C36858EdK.LIZJ
            r10.getClass()
            com.bytedance.keva.Keva r0 = X.C36858EdK.LIZ()
            java.lang.String r7 = "key_msisdn_expired_time"
            r1 = -1
            long r3 = r0.getLong(r7, r1)
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 < 0) goto Lc6
            r0 = 1
        L54:
            r8.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r8)
            java.lang.String r8 = "message"
            kotlin.jvm.internal.o.LJIIJ(r0, r8)
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "tryAssociateMsisdn is BindingSuccess:"
            r4.append(r0)
            r10.getClass()
            com.bytedance.keva.Keva r0 = X.C36858EdK.LIZ()
            java.lang.String r3 = "key_binding_msisdn_success"
            boolean r0 = r0.getBoolean(r3, r9)
            r4.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r4)
            kotlin.jvm.internal.o.LJIIJ(r0, r8)
            r10.getClass()
            com.bytedance.keva.Keva r0 = X.C36858EdK.LIZ()
            boolean r0 = r0.getBoolean(r3, r9)
            if (r0 == 0) goto La0
            long r3 = java.lang.System.currentTimeMillis()
            r10.getClass()
            com.bytedance.keva.Keva r0 = X.C36858EdK.LIZ()
            long r1 = r0.getLong(r7, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lab
        La0:
            Y.ACallableS35S1200000_6 r2 = new Y.ACallableS35S1200000_6
            java.lang.String r1 = "init"
            r0 = 2
            r2.<init>(r6, r5, r1, r0)
            X.C10K.LIZJ(r2)
        Lab:
            boolean r0 = X.F7D.LIZLLL()
            if (r0 == 0) goto Lc5
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r0 = "android.intent.action.SIM_STATE_CHANGED"
            r1.<init>(r0)
            java.lang.String r0 = "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED"
            r1.addAction(r0)
            X.F7C r0 = new X.F7C
            r0.<init>()
            X.C16880lQ.LJJLIIIJILLIZJL(r0, r5, r1)
        Lc5:
            return
        Lc6:
            r0 = 0
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.zerorating.ZeroRatingMainServiceImpl.LIZ():void");
    }
}
