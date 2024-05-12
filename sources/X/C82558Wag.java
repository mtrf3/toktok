package X;

import android.os.SystemClock;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* renamed from: X.Wag, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82558Wag implements IFetchPanelInfoListener {
    public final /* synthetic */ C173166qu LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C82552Waa LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        String msg;
        C82552Waa c82552Waa = this.LIZJ;
        c82552Waa.LJLJJL.LJJJJL("mv", new C82556Wae(c82552Waa, c82552Waa.LJLLJ.LIZ(), SystemClock.elapsedRealtime()));
        this.LIZ.LIZIZ(this.LIZIZ);
        this.LIZ.LIZ = 1;
        if (exceptionResult == null) {
            C42421Gkr.LIZ(1, null, false);
        } else {
            C42421Gkr.LIZ(exceptionResult.getErrorCode(), exceptionResult.getException(), false);
            this.LIZ.LIZIZ = exceptionResult.getErrorCode();
            C173166qu c173166qu = this.LIZ;
            if (exceptionResult.getMsg() == null) {
                msg = "";
            } else {
                msg = exceptionResult.getMsg();
            }
            c173166qu.LIZJ = msg;
        }
        C173156qt.LIZLLL(this.LIZ, C78855Ux9.LJLJL, false);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        PanelInfoModel panelInfoModel2 = panelInfoModel;
        if (panelInfoModel2 == null || panelInfoModel2.getCategoryEffectModel() == null || C77413UZt.LJIILL(panelInfoModel2.getCategoryEffectModel().getEffects()) || !this.LIZJ.LJII(panelInfoModel2.getCategoryEffectModel().getEffects(), panelInfoModel2.getUrlPrefix())) {
            C82552Waa c82552Waa = this.LIZJ;
            c82552Waa.LJLJJL.LJJJJL("mv", new C82556Wae(c82552Waa, c82552Waa.LJLLJ.LIZ(), SystemClock.elapsedRealtime()));
        }
        C42421Gkr.LIZ(0, null, true);
        this.LIZ.LIZIZ(this.LIZIZ);
        C173156qt.LIZLLL(this.LIZ, C78855Ux9.LJLJL, false);
    }

    public C82558Wag(C82552Waa c82552Waa, C173166qu c173166qu, long j) {
        this.LIZJ = c82552Waa;
        this.LIZ = c173166qu;
        this.LIZIZ = j;
    }
}
