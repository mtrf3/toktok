package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

/* renamed from: X.H6r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43533H6r implements IFetchEffectChannelListener {
    public final /* synthetic */ XJL<List<? extends Effect>> LIZ;
    public final /* synthetic */ AbstractC43539H6x LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        Exception exc;
        XJL<List<? extends Effect>> xjl = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request resource panel (");
        this.LIZIZ.getClass();
        LIZ.append("ttwatermark");
        LIZ.append(") failed");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (exceptionResult != null) {
            exc = exceptionResult.getException();
        } else {
            exc = null;
        }
        C3C4 LIZ2 = C141335gf.LIZ(new Throwable(LIZIZ, exc));
        C3C5.m7constructorimpl(LIZ2);
        xjl.resumeWith(LIZ2);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        List<Effect> allCategoryEffects;
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2 == null || (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) == null || allCategoryEffects.isEmpty()) {
            XJL<List<? extends Effect>> xjl = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resource panel (");
            this.LIZIZ.getClass();
            LIZ.append("ttwatermark");
            LIZ.append(") empty");
            C3C4 LIZ2 = C141335gf.LIZ(new Throwable(X1D.LIZIZ(LIZ)));
            C3C5.m7constructorimpl(LIZ2);
            xjl.resumeWith(LIZ2);
            return;
        }
        XJL<List<? extends Effect>> xjl2 = this.LIZ;
        C3C5.m7constructorimpl(allCategoryEffects);
        xjl2.resumeWith(allCategoryEffects);
    }

    public C43533H6r(XKS xks, C43534H6s c43534H6s) {
        this.LIZ = xks;
        this.LIZIZ = c43534H6s;
    }
}
