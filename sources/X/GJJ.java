package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GJJ extends AbstractC188397aN {
    public final /* synthetic */ VideoPublishEditModel LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        VideoPublishEditModel model = this.LJLJJI;
        o.LJIIIZ(model, "model");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", model.getCreationId());
        c188727au.LJIIIZ("enter_from", model.enterFrom);
        c188727au.LJIIIZ("shoot_way", model.mShootWay);
        c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(model));
        FMX.LJIIL("click_post_template_learn_more", c188727au.LIZ);
        GJK.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("ugc_template_add_anchor_learn_more_h5", "https://feedback.tiktokv.com/falcon/tiktok/feedback/main/index.html?hide_nav_bar=1&entrance=UGC_Template&id=7241205725945485830&enter_from=&is_from_home=2#/list");
        o.LJIIIIZZ(LJI, "getInstance().getStringV…horLearnMore::class.java)");
        if (LJI.length() > 0) {
            str = C31461Li.LIZJ("ugc_template_add_anchor_learn_more_h5", "https://feedback.tiktokv.com/falcon/tiktok/feedback/main/index.html?hide_nav_bar=1&entrance=UGC_Template&id=7241205725945485830&enter_from=&is_from_home=2#/list", "{\n            SettingsMa…re::class.java)\n        }");
        } else {
            str = GJK.LIZIZ;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLJJL, "aweme://webview/");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("?use_spark=1");
        buildRoute.withParam("url", X1D.LIZIZ(LIZ));
        buildRoute.open();
    }

    @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GJJ(int i, int i2, VideoPublishEditModel videoPublishEditModel, ActivityC45651qj activityC45651qj) {
        super(i, i2);
        this.LJLJJI = videoPublishEditModel;
        this.LJLJJL = activityC45651qj;
    }
}
