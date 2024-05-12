package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wtv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83751Wtv implements IFetchPanelInfoListener {
    public final String LIZ;
    public final IFetchPanelInfoListener LIZIZ;
    public final C44428Hc8 LIZJ = C44428Hc8.LIZ();

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        String LJJLIL;
        String str;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.LIZIZ;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onFail(exceptionResult);
        }
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        if (TextUtils.equals(this.LIZ, "default")) {
            LJJLIL = "effect_panel_info";
        } else {
            LJJLIL = C78880UxY.LJJLIL(this.LIZ);
        }
        c145995oB.LJI("api_type", LJJLIL);
        c145995oB.LIZIZ(LIZIZ, "duration");
        c145995oB.LIZ(1, "status");
        c145995oB.LIZJ(ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0), "error_domain");
        Integer num = null;
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        }
        c145995oB.LIZJ(num, "error_code");
        if (exceptionResult == null || (str = exceptionResult.getMsg()) == null) {
            str = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZ(0, "count");
        GXR.LIZ("tool_performance_api", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        String LJJLIL;
        List<EffectCategoryModel> categoryList;
        PanelInfoModel panelInfoModel2 = panelInfoModel;
        long LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.LIZIZ;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onSuccess(panelInfoModel2);
        }
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        if (TextUtils.equals(this.LIZ, "default")) {
            LJJLIL = "effect_panel_info";
        } else {
            LJJLIL = C78880UxY.LJJLIL(this.LIZ);
        }
        c145995oB.LJI("api_type", LJJLIL);
        c145995oB.LIZIZ(LIZIZ, "duration");
        int i = 0;
        c145995oB.LIZ(0, "status");
        if (panelInfoModel2 != null && (categoryList = panelInfoModel2.getCategoryList()) != null) {
            i = categoryList.size();
        }
        c145995oB.LIZ(i, "count");
        GXR.LIZ("tool_performance_api", c145995oB.LIZ);
    }

    public C83751Wtv(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.LIZ = str;
        this.LIZIZ = iFetchPanelInfoListener;
    }
}
