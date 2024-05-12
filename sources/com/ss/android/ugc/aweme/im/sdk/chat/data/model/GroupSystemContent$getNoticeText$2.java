package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.AbstractC65781Prl;
import X.C101283yG;
import X.C101313yJ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupSystemContent$getNoticeText$2 extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ boolean $needClickSpan;
    public final /* synthetic */ boolean $needTrackEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSystemContent$getNoticeText$2(boolean z, boolean z2) {
        super(1);
        this.$needClickSpan = z;
        this.$needTrackEvent = z2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        o.LJIIIZ(it, "it");
        if (this.$needClickSpan) {
            SmartRoute buildRoute = SmartRouter.buildRoute(it.getContext(), "aweme://webview");
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("suicide_help_url", "https://www.tiktok.com/web-inapp/suicide/help?enter_from=dm_group_name_popup");
            o.LJIIIIZZ(LJI, "getInstance().getStringV…pUrlSettings::class.java)");
            buildRoute.withParam(UriProtector.parse(LJI));
            buildRoute.open();
        }
        if (this.$needTrackEvent) {
            C101283yG.LIZ(C101313yJ.LIZJ);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(View view) {
        invoke2(view);
        return C76800UCe.LIZ;
    }
}
