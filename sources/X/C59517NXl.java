package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget;

/* renamed from: X.NXl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59517NXl implements NYO {
    public final /* synthetic */ CommonWebPageWidget LIZ;

    @Override // X.NYO
    public final void LIZ() {
        if (CommonWebPageWidget.LJLLLLLL) {
            IWF.LJJLIIIIJ().LIZIZ();
            CommonWebPageWidget.LJLLLLLL = false;
        }
        CommonWebPageWidget commonWebPageWidget = this.LIZ;
        commonWebPageWidget.getClass();
        C2U8.LIZ(new KRH(false));
        DataCenter dataCenter = commonWebPageWidget.LJLJJI;
        if (dataCenter != null) {
            dataCenter.jv0(null, "on_ad_pop_up_web_page_hide");
        }
        long currentTimeMillis = System.currentTimeMillis() - commonWebPageWidget.LJLLILLLL;
        if (commonWebPageWidget.LJLLI == null) {
            return;
        }
        FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
    }

    @Override // X.NYO
    public final void onShow() {
        CommonWebPageWidget commonWebPageWidget = this.LIZ;
        commonWebPageWidget.getClass();
        C2U8.LIZ(new KRH(true));
        DataCenter dataCenter = commonWebPageWidget.LJLJJI;
        if (dataCenter != null) {
            dataCenter.jv0(null, "on_ad_pop_up_web_page_show");
        }
        commonWebPageWidget.LJLLILLLL = System.currentTimeMillis();
    }

    public C59517NXl(CommonWebPageWidget commonWebPageWidget) {
        this.LIZ = commonWebPageWidget;
    }
}
