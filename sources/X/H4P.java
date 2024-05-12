package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H4P extends AbstractC44475Hct {
    public final WaterMarkBuilder LJ;
    public XKQ LJFF;
    public C133765Mu LJI;

    @Override // X.InterfaceC44470Hco
    public final void LIZIZ() {
        this.LIZJ = true;
        HOW how = this.LIZLLL;
        if (how != null) {
            how.reset();
        }
        WaterMarkListener waterMarkListener = this.LIZ.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onCancel();
        }
        XKQ xkq = this.LJFF;
        if (xkq != null && !xkq.isCancelled()) {
            XKQ xkq2 = this.LJFF;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            this.LJFF = null;
        }
        C10K.LIZJ(new ACallableS110S0100000_7(this, 42));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4P(WaterMarkBuilder watermarkBuilder) {
        super(watermarkBuilder);
        o.LJIIIZ(watermarkBuilder, "watermarkBuilder");
        this.LJ = watermarkBuilder;
    }

    public static void LJI(String str) {
        I9A.LIZJ("effect-watermark", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C43323GzP
            if (r0 == 0) goto L1e
            r3 = r8
            X.GzP r3 = (X.C43323GzP) r3
            int r2 = r3.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r3.LJLJI = r2
        L12:
            java.lang.Object r4 = r3.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJI
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L24
            goto L5e
        L1e:
            X.GzP r3 = new X.GzP
            r3.<init>(r7, r8)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r4)
            com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r0 = r7.LJ     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo r0 = r0.getEffectInfo()     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = r0.getEffectId()     // Catch: java.lang.Exception -> L75
            r3.LJLJI = r1     // Catch: java.lang.Exception -> L75
            X.XKS r4 = new X.XKS     // Catch: java.lang.Exception -> L75
            X.2kd r0 = X.C78555UsJ.LJJII(r3)     // Catch: java.lang.Exception -> L75
            r4.<init>(r1, r0)     // Catch: java.lang.Exception -> L75
            r4.LJIIL()     // Catch: java.lang.Exception -> L75
            X.XIA r0 = X.C150985wE.LIZIZ     // Catch: java.lang.Exception -> L75
            X.2gm r3 = X.C48841JEv.LIZ(r0)     // Catch: java.lang.Exception -> L75
            X.GzO r2 = new X.GzO     // Catch: java.lang.Exception -> L75
            r1 = 0
            r2.<init>(r7, r5, r4, r1)     // Catch: java.lang.Exception -> L75
            r0 = 3
            X.XKX.LIZLLL(r3, r1, r1, r2, r0)     // Catch: java.lang.Exception -> L75
            java.lang.Object r4 = r4.LJIIJJI()     // Catch: java.lang.Exception -> L75
            if (r4 != r6) goto L61
            return r6
        L5e:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L75
        L61:
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r4     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo r3 = new com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo     // Catch: java.lang.Exception -> L75
            java.lang.String r2 = r4.getEffectId()     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = r4.getName()     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r4.getIconUrl()     // Catch: java.lang.Exception -> L75
            r3.<init>(r2, r1, r0)     // Catch: java.lang.Exception -> L75
            return r3
        L75:
            r3 = move-exception
            X.2sx r0 = new X.2sx
            r1 = 10086(0x2766, float:1.4133E-41)
            r2 = 0
            r4 = 2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4P.LJFF(X.2kd):java.lang.Object");
    }
}
