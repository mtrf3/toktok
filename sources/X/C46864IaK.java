package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IaK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46864IaK extends AbstractC65781Prl implements InterfaceC88472Yns<SimVideoUrlModel, Long> {
    public final /* synthetic */ SimVideoUrlModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC47125IeX<SimVideoUrlModel, SimBitRate> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46864IaK(SimVideoUrlModel simVideoUrlModel, int i, InterfaceC47125IeX<SimVideoUrlModel, SimBitRate> interfaceC47125IeX, int i2) {
        super(1);
        this.LJLIL = simVideoUrlModel;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC47125IeX;
        this.LJLJJI = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long invoke(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r14) {
        /*
            r13 = this;
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r14 = (com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel) r14
            java.lang.String r0 = "video"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            double r7 = r14.getDuration()
            double r0 = r14.getDuration()
            long r3 = (long) r0
            X.IaQ r0 = X.C46868IaO.LIZJ
            X.Iay r12 = X.C46900Iau.LIZ(r14, r0)
            float r0 = r12.LJ()
            double r5 = (double) r0
            double r5 = r5 * r7
            long r1 = (long) r5
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r13.LJLIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r14, r0)
            r5 = 0
            if (r0 == 0) goto L30
            int r0 = r13.LJLILLLLZI
            long r7 = (long) r0
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r5, r1)
        L30:
            long r10 = r12.LIZIZ()
            r7 = 0
            r9 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 > 0) goto L61
            X.IeX<com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate> r0 = r13.LJLJI
            java.lang.Object r0 = r0.apply(r14)
            com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate r0 = (com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) r0
            if (r0 != 0) goto Lc9
        L44:
            com.ss.android.ugc.playerkit.model.PlayListWiseBitrateSelectConfig r11 = X.C46868IaO.LIZ
            long r5 = r11.maxReservedDurationMs
            long r9 = r3 - r1
            long r7 = (long) r7
            long r9 = r9 * r7
            int r0 = r13.LJLJJI
            long r7 = (long) r0
            long r9 = r9 / r7
            long r3 = r3 - r9
            long r7 = r11.safeCacheDurationMs
            long r1 = r1 - r7
            long r0 = java.lang.Math.min(r3, r1)
            long r0 = java.lang.Math.min(r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L61:
            java.lang.String r0 = r14.getDashVideoModelStr()
            if (r0 == 0) goto L93
            java.util.List r0 = r12.LIZJ()
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
        L70:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r6.next()
            X.Iay r0 = (X.InterfaceC46904Iay) r0
            java.lang.String r0 = r0.key()
            java.lang.Integer r0 = X.C46901Iav.LIZ(r0)
            if (r0 != 0) goto L89
            r0 = 0
        L87:
            int r5 = r5 + r0
            goto L70
        L89:
            int r0 = r0.intValue()
            goto L87
        L8e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto Ld1
        L93:
            java.util.List r0 = r14.getBitRate()
            if (r0 != 0) goto L9a
            goto L44
        L9a:
            java.util.Iterator r8 = r0.iterator()
        L9e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r6 = r8.next()
            r0 = r6
            com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate r0 = (com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) r0
            java.lang.String r5 = r0.getUrlKey()
            java.lang.String r0 = r12.key()
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 == 0) goto L9e
        Lb9:
            com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate r6 = (com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) r6
            if (r6 != 0) goto Lc0
            goto L44
        Lbe:
            r6 = r9
            goto Lb9
        Lc0:
            int r0 = r6.getBitRate()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Ld1
        Lc9:
            int r0 = r0.getBitRate()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Ld1:
            if (r0 != 0) goto Ld5
            goto L44
        Ld5:
            int r7 = r0.intValue()
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46864IaK.invoke(java.lang.Object):java.lang.Object");
    }
}
