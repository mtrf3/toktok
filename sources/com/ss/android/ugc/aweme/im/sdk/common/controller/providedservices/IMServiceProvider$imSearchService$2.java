package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C112004aS;
import X.InterfaceC111984aQ;
import X.InterfaceC65784Pro;
import Y.IDTListenerS87S0200000_1;
import Y.IDrS11S0000000_1;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.im.sdk.search.ui.widget.IMSearchBarEntranceWidget;
import com.ss.android.ugc.aweme.im.service.search.IIMSearchEntranceWidget;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMServiceProvider$imSearchService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C112004aS> {
    public static final IMServiceProvider$imSearchService$2 INSTANCE = new IMServiceProvider$imSearchService$2();

    public IMServiceProvider$imSearchService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.4aS] */
    @Override // X.InterfaceC65784Pro
    public final C112004aS invoke() {
        return new InterfaceC111984aQ() { // from class: X.4aS
            @Override // X.InterfaceC111984aQ
            public final IMSearchBarEntranceWidget LIZ(InboxFragment fragment, LiveData parentWidgetState) {
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(parentWidgetState, "parentWidgetState");
                C53330KwQ.LIZ.getClass();
                if (C53330KwQ.LIZIZ() && ((RBX) HG3.LJIILL()).isLogin() && !C78966Uyw.LJJIJ().LIZIZ()) {
                    return new IMSearchBarEntranceWidget(fragment, parentWidgetState);
                }
                return null;
            }

            @Override // X.InterfaceC111984aQ
            public final void LIZJ(K2B k2b, IIMSearchEntranceWidget iIMSearchEntranceWidget) {
                k2b.setOnTouchListener(new IDTListenerS87S0200000_1(iIMSearchEntranceWidget, k2b, 4));
                k2b.LJIIJJI(new IDrS11S0000000_1(1));
            }

            @Override // X.InterfaceC111984aQ
            public final void LIZIZ(Context context, boolean z, Integer num, Integer num2) {
                boolean z2;
                int i;
                InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
                Bundle bundle = new Bundle();
                C05060Hu c05060Hu = C05060Hu.LIZJ;
                LIZIZ.LJIILIIL(new C05060Hu[]{c05060Hu}, bundle);
                float f = bundle.getFloat(c05060Hu.LIZ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("overall score ");
                LIZ.append(f);
                C34B.LIZIZ("IMSearchService", X1D.LIZIZ(LIZ));
                if (f < 9.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean booleanValue = ((Boolean) C112034aV.LIZ.getValue()).booleanValue();
                if (z) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(context, "//im/search/");
                    buildRoute.withParam("enter_method", EnumC112014aT.SEARCH_BUTTON.getValue());
                    buildRoute.withParam("is_animation_enable", booleanValue);
                    buildRoute.withParam("is_low_end_device", z2);
                    buildRoute.withParam("search_page_start_timestamp", NetworkUtils.getServerTimeMills());
                    buildRoute.open();
                    return;
                }
                if (z2 || !booleanValue) {
                    SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "//im/search/");
                    buildRoute2.withParam("enter_method", EnumC112014aT.SEARCH_BAR.getValue());
                    buildRoute2.withParam("is_animation_enable", booleanValue);
                    buildRoute2.withParam("is_low_end_device", z2);
                    buildRoute2.withParam("search_page_start_timestamp", NetworkUtils.getServerTimeMills());
                    buildRoute2.open();
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("enter_method", EnumC112014aT.SEARCH_BAR.getValue());
                int i2 = -1;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                bundle2.putInt("search_bar_entrance_raw_x", i);
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                bundle2.putInt("searchbar_entrance_raw_y", i2);
                bundle2.putBoolean("is_animation_enable", true);
                bundle2.putBoolean("is_low_end_device", false);
                bundle2.putLong("search_page_start_timestamp", NetworkUtils.getServerTimeMills());
                SmartRoute buildRoute3 = SmartRouter.buildRoute(context, "//im/search/animation");
                buildRoute3.withParam("search_bar_entrance", bundle2);
                buildRoute3.open();
            }
        };
    }
}
