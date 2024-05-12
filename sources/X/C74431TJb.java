package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.List;

/* renamed from: X.TJb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74431TJb implements IFetchEffectListByIdsListener {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ Effect LIZIZ;
    public final /* synthetic */ TJZ LIZJ;
    public final /* synthetic */ FetchFavoriteListResponse LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.remove(this.LIZIZ);
        this.LIZJ.LLLLZIL(this.LIZLLL, this.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r2 = r5.LIZIZ;
     */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r6) {
        /*
            r5 = this;
            com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate r6 = (com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate) r6
            if (r6 == 0) goto L11
            java.util.List r0 = r6.getData()
            r4 = 0
            if (r0 == 0) goto L11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
        L11:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r5.LIZIZ
        L13:
            java.util.List r0 = r5.LIZ
            r0.remove(r2)
            X.TJZ r2 = r5.LIZJ
            com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse r1 = r5.LIZLLL
            java.util.List r0 = r5.LIZ
            r2.LLLLZIL(r1, r0)
            return
        L22:
            java.util.List r0 = r5.LIZ
            java.util.Iterator r3 = r0.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate r0 = (com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate) r0
            java.lang.String r1 = r0.getEffectId()
            kotlin.jvm.internal.o.LJI(r6)
            java.util.List r0 = r6.getData()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate r0 = (com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate) r0
            java.lang.String r0 = r0.getEffectId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L28
            if (r2 == 0) goto L53
            goto L13
        L53:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r5.LIZIZ
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74431TJb.onSuccess(java.lang.Object):void");
    }

    public C74431TJb(List list, Effect effect, TJZ tjz, FetchFavoriteListResponse fetchFavoriteListResponse) {
        this.LIZ = list;
        this.LIZIZ = effect;
        this.LIZJ = tjz;
        this.LIZLLL = fetchFavoriteListResponse;
    }
}
