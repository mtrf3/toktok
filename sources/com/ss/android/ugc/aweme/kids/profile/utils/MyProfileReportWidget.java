package com.ss.android.ugc.aweme.kids.profile.utils;

import X.AFQ;
import X.InterfaceC227078vf;
import X.ViewOnClickListenerC227068ve;
import Y.ARunnableS23S0200000_4;
import android.animation.AnimatorSet;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class MyProfileReportWidget extends Widget {
    public View LJLIL;
    public AnimatorSet LJLILLLLZI;

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        Integer userPeriod;
        super.onCreate();
        AFQ LJFF = KidsAccountServiceImpl.LJIIIIZZ().LJFF();
        if (LJFF == null || (userPeriod = LJFF.getUserPeriod()) == null || userPeriod.intValue() != 1) {
            return;
        }
        long j = Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0L);
        if (j != 0 && System.currentTimeMillis() - j > TimeUnit.DAYS.toMillis(30L)) {
            return;
        }
        if (System.currentTimeMillis() - Keva.getRepo("ftc_report").getLong("ftc_report_last_show_time", 0L) <= TimeUnit.DAYS.toMillis(1L)) {
            return;
        }
        View view = this.contentView;
        o.LJI(view);
        final ViewOnClickListenerC227068ve viewOnClickListenerC227068ve = (ViewOnClickListenerC227068ve) view.findViewById(R.id.nao);
        o.LJI(viewOnClickListenerC227068ve);
        viewOnClickListenerC227068ve.setTitleText(R.string.ic4);
        viewOnClickListenerC227068ve.setOnInternalClickListener(new InterfaceC227078vf() { // from class: X.9uF
            @Override // X.InterfaceC227078vf
            public final void LIZ() {
                ViewOnClickListenerC227068ve.this.setVisibility(8);
                Keva.getRepo("ftc_report").storeLong("ftc_report_last_show_time", System.currentTimeMillis());
                if (Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0L) == 0) {
                    Keva.getRepo("ftc_report").storeLong("ftc_report_first_show_time", System.currentTimeMillis());
                }
            }

            @Override // X.InterfaceC227078vf
            public final void LIZIZ() {
                ViewOnClickListenerC227068ve.this.setVisibility(8);
                SmartRouter.buildRoute(EF7.LIZIZ(), new Uri.Builder().scheme("aweme://webview/").appendQueryParameter("url", "https://www.tiktok.com/aweme/inapp/v2/c_feedback").appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_spark", "1").build().toString()).open();
                Keva.getRepo("ftc_report").storeLong("ftc_report_last_show_time", System.currentTimeMillis());
                if (Keva.getRepo("ftc_report").getLong("ftc_report_first_show_time", 0L) == 0) {
                    Keva.getRepo("ftc_report").storeLong("ftc_report_first_show_time", System.currentTimeMillis());
                }
            }
        });
        this.LJLIL = viewOnClickListenerC227068ve;
        viewOnClickListenerC227068ve.post(new ARunnableS23S0200000_4(this, viewOnClickListenerC227068ve, 24));
    }

    public MyProfileReportWidget(ViewGroup content) {
        o.LJIIIZ(content, "content");
        this.contentView = content;
    }
}
