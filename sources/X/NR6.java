package X;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NR6 extends NR7 {
    public NRF LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NR6(NSR base) {
        super(base);
        o.LJIIIZ(base, "base");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r9) {
        /*
            r8 = this;
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = r9.hashCode()
            r3 = 0
            switch(r0) {
                case -1036064766: goto Ld;
                case -934426579: goto L16;
                case -697335956: goto L1f;
                case -599445191: goto L28;
                case -524537143: goto L31;
                case 106440182: goto L3a;
                case 1859771635: goto La7;
                case 1928770270: goto Lb5;
                case 2147444528: goto L43;
                default: goto Lc;
            }
        Lc:
            return
        Ld:
            java.lang.String r0 = "bufferStart"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L4b
            goto Lc
        L16:
            java.lang.String r0 = "resume"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lb1
            goto Lc
        L1f:
            java.lang.String r0 = "sessionStart"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lbf
            goto Lc
        L28:
            java.lang.String r0 = "complete"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L4b
            goto Lc
        L31:
            java.lang.String r0 = "sessionFinish"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L4b
            goto Lc
        L3a:
            java.lang.String r0 = "pause"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L4b
            goto Lc
        L43:
            java.lang.String r0 = "skipped"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lc
        L4b:
            boolean r0 = r8.LIZJ
            if (r0 == 0) goto L57
        L4f:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.LIZLLL = r0
            goto Lc
        L57:
            long r4 = r8.LIZLLL
            long r1 = r1 - r4
            double r4 = (double) r1
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L4f
            r8.LIZJ = r2
            X.NRF r1 = r8.LIZIZ
            if (r1 == 0) goto L4f
            boolean r0 = r1.LIZ
            if (r0 != r2) goto L4f
            r2 = 0
            if (r1 == 0) goto L4f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.LJIIIIZZ
            if (r0 == 0) goto L4f
            X.NSR r0 = r8.LIZ
            X.NIc r0 = r0.LIZ()
            if (r0 == 0) goto L93
            X.Pro r0 = r0.getTracker()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r0.invoke()
            X.NGp r0 = (X.C59079NGp) r0
            if (r0 == 0) goto L93
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L95
        L93:
            java.lang.String r1 = "draw_ad"
        L95:
            X.NRF r0 = r8.LIZIZ
            if (r0 == 0) goto L9b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.LJIIIIZZ
        L9b:
            java.lang.String r0 = "viewable_2s"
            X.N0h r1 = X.C58704N2e.LIZLLL(r1, r0, r2)
            java.lang.String r0 = "is_piv"
            X.C0JU.LIZJ(r3, r1, r0)
            goto L4f
        La7:
            java.lang.String r0 = "bufferFinish"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lb1
            goto Lc
        Lb1:
            r8.LIZLLL = r1
            goto Lc
        Lb5:
            java.lang.String r0 = "mediaStart"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lbf
            goto Lc
        Lbf:
            r8.LIZLLL = r1
            r8.LIZJ = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR6.LJIILIIL(java.lang.String):void");
    }

    @Override // X.NR7, X.NRC
    public final void LJIIIIZZ(Context context, NRF nrf) {
        o.LJIIIZ(context, "context");
        super.LJIIIIZZ(context, nrf);
        LJIILIIL("sessionFinish");
    }

    @Override // X.NR7, X.NRC
    public final void LIZJ(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        super.LIZJ(nrf, context, i);
        if (i == 0) {
            LJIILIIL("resume");
        }
    }

    @Override // X.NR7, X.NRC
    public final void LJFF(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        super.LJFF(nrf, context, i);
        if (i == 1) {
            LJIILIIL("complete");
        }
    }

    @Override // X.NR7, X.NRC
    public final void LJI(NRF nrf, Context context, int i) {
        o.LJIIIZ(context, "context");
        super.LJI(nrf, context, i);
        if (i == 0) {
            LJIILIIL("pause");
        }
    }

    @Override // X.NR7, X.NRC
    public final void LJIIIZ(NRF nrf, View view, List friendlyObstructions) {
        o.LJIIIZ(friendlyObstructions, "friendlyObstructions");
        super.LJIIIZ(nrf, view, friendlyObstructions);
        this.LIZIZ = nrf;
        LJIILIIL("sessionStart");
    }

    @Override // X.NR7, X.NRC
    public final void LJIIJ(NRF nrf, Context context, int i, View view) {
        super.LJIIJ(nrf, context, i, view);
        if (i != 0) {
            return;
        }
        this.LIZIZ = nrf;
        LJIILIIL("mediaStart");
    }
}
