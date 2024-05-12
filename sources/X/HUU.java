package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class HUU implements IFetchEffectChannelListener {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<Effect, C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC84498XEg LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZJ.invoke(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r8) {
        /*
            r7 = this;
            com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate r8 = (com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate) r8
            int r0 = r7.LIZ
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            int r0 = r7.LIZIZ
            float r0 = (float) r0
            float r1 = r1 / r0
            double r5 = (double) r1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L6c
            boolean r0 = X.HWY.LIZ()
            if (r0 == 0) goto L6c
            if (r8 == 0) goto L47
            java.util.List r0 = r8.getAllCategoryEffects()
            if (r0 == 0) goto L47
            java.util.Iterator r3 = r0.iterator()
        L26:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean r0 = X.EHI.LIZIZ(r0)
            if (r0 == 0) goto L68
            java.lang.String r1 = r0.name
        L3b:
            java.lang.String r0 = "horizontal"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L26
        L43:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
        L45:
            if (r2 != 0) goto L4d
        L47:
            X.Yns<com.ss.android.ugc.effectmanager.effect.model.Effect, X.UCe> r0 = r7.LIZJ
            r0.invoke(r4)
        L4c:
            return
        L4d:
            X.XEg r0 = r7.LIZLLL
            boolean r0 = r0.LJJIJLIJ(r2)
            if (r0 == 0) goto L5b
            X.Yns<com.ss.android.ugc.effectmanager.effect.model.Effect, X.UCe> r0 = r7.LIZJ
            r0.invoke(r2)
            goto L4c
        L5b:
            X.XEg r3 = r7.LIZLLL
            X.5ZN r1 = new X.5ZN
            X.Yns<com.ss.android.ugc.effectmanager.effect.model.Effect, X.UCe> r0 = r7.LIZJ
            r1.<init>()
            r3.LJJIIZI(r2, r1)
            goto L4c
        L68:
            r1 = r4
            goto L3b
        L6a:
            r2 = r4
            goto L43
        L6c:
            if (r8 == 0) goto L47
            java.util.List r0 = r8.getAllCategoryEffects()
            if (r0 == 0) goto L47
            java.util.Iterator r3 = r0.iterator()
        L78:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean r0 = X.EHI.LIZIZ(r0)
            if (r0 == 0) goto L98
            java.lang.String r1 = r0.name
        L8d:
            java.lang.String r0 = "vertical"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L78
        L95:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
            goto L45
        L98:
            r1 = r4
            goto L8d
        L9a:
            r2 = r4
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HUU.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HUU(int i, int i2, InterfaceC88472Yns<? super Effect, C76800UCe> interfaceC88472Yns, InterfaceC84498XEg interfaceC84498XEg) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC84498XEg;
    }
}
