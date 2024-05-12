package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wah, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82559Wah implements IFetchPanelInfoListener {
    public final /* synthetic */ C173166qu LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C82560Wai LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult e) {
        String str;
        o.LJIIIZ(e, "e");
        this.LIZ.LIZIZ(this.LIZIZ);
        this.LIZ.LIZ = 1;
        C42421Gkr.LIZ(e.getErrorCode(), e.getException(), false);
        this.LIZ.LIZIZ = e.getErrorCode();
        C173166qu c173166qu = this.LIZ;
        Exception exception = e.getException();
        if (exception == null || (str = exception.toString()) == null) {
            str = "";
        }
        c173166qu.LIZJ = str;
        C173156qt.LIZLLL(this.LIZ, C78855Ux9.LJLJL, false);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        List<Effect> effects;
        Effect effect;
        PanelInfoModel panelInfoModel2 = panelInfoModel;
        o.LJIIIZ(panelInfoModel2, "panelInfoModel");
        MvThemeData mvThemeData = null;
        C42421Gkr.LIZ(0, null, true);
        this.LIZ.LIZIZ(this.LIZIZ);
        C82560Wai c82560Wai = this.LIZJ;
        CategoryEffectModel categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
        if (categoryEffectModel != null && (effects = categoryEffectModel.getEffects()) != null && (effect = (Effect) ORZ.LJLLLL(effects)) != null) {
            mvThemeData = new MvThemeData();
            mvThemeData.urlPrefixList = panelInfoModel2.getUrlPrefix();
            mvThemeData.LJIILJJIL(effect);
        }
        c82560Wai.LIZJ(mvThemeData);
        C173156qt.LIZLLL(this.LIZ, C78855Ux9.LJLJL, false);
    }

    public C82559Wah(C173166qu c173166qu, long j, C82560Wai c82560Wai) {
        this.LIZ = c173166qu;
        this.LIZIZ = j;
        this.LIZJ = c82560Wai;
    }
}
