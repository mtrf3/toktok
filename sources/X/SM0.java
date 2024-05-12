package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.videoviews.VideoViewHistorySettingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SM0 extends AbstractC71980SMu {
    public final VideoViewHistorySettingViewModel LJLLILLLL;
    public final boolean LJLLJ;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "video_view_history";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (1 == r0.intValue()) goto L7;
     */
    @Override // X.AbstractC71980SMu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIII() {
        /*
            r5 = this;
            X.SPd r0 = X.C72041SPd.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r1 = X.C72041SPd.LJI()
            if (r1 == 0) goto L13
            java.lang.String r0 = "video_view_history"
            java.lang.Integer r0 = r1.M(r0)
            if (r0 != 0) goto L47
        L13:
            r4 = 0
        L14:
            X.SKb r0 = X.C71909SKb.LIZ
            X.SOq r3 = X.C0N3.LIZ(r0)
            X.SMj r2 = new X.SMj
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "privacy_and_safety_settings"
            r2.LIZIZ(r1, r0)
            if (r4 == 0) goto L44
            java.lang.String r1 = "1"
        L2a:
            java.lang.String r0 = "video_views_status"
            r2.LIZIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.LIZ
            java.lang.String r1 = "EventMapBuilder()\n      …               .builder()"
            java.lang.String r0 = "enter_video_views_permission"
            X.C07250Qf.LIZLLL(r2, r1, r3, r0, r2)
            android.content.Context r1 = r5.LJLIL
            java.lang.String r0 = "aweme://privacy/setting/page?target=video_view_history"
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            r0.open()
            return
        L44:
            java.lang.String r1 = "0"
            goto L2a
        L47:
            int r0 = r0.intValue()
            r4 = 1
            if (r4 != r0) goto L13
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SM0.LLIIII():void");
    }

    @Override // X.AbstractC71980SMu, X.SLJ
    public final boolean LL() {
        if (super.LL() && this.LJLLJ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SM0(VideoViewHistorySettingViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        Bundle bundle = configs.extraData;
        this.LJLLJ = bundle != null ? bundle.getBoolean("isVideoViewersEnable", false) : false;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new SM1(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.tp1);
        sk9.LIZIZ(R.raw.icon_play_fill);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 42));
    }
}
