package com.bytedance.android.livesdk.module;

import X.AbstractC31219CNb;
import X.ActivityC45651qj;
import X.BNW;
import X.BNX;
import X.C16880lQ;
import X.C29261Be5;
import X.C29306Beo;
import X.C30882CAc;
import X.C30892CAm;
import X.C30893CAn;
import X.C30938CCg;
import X.C30939CCh;
import X.C30941CCj;
import X.C31239CNv;
import X.C72264SXs;
import X.CMH;
import X.CN1;
import X.CNV;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UserInfoMethod;
import com.bytedance.android.livesdk.chatroom.interaction.PopHalfWebDialogHelper;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;
import com.bytedance.android.livesdk.lynx.LiveLynxService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BrowserService implements IBrowserService {
    public final LiveLynxService LJLIL = new LiveLynxService();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final String fQ() {
        return C16880lQ.LJLLILLLL(HybridDialogFragment.class);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final C31239CNv kF() {
        return new C31239CNv();
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final C30882CAc Lu() {
        return C30882CAc.LIZJ();
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final C30939CCh To0() {
        return C30938CCg.LIZ;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final C30892CAm Yd0() {
        return C30893CAn.LIZ;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final PopupContainerFragment Mo(PopupConfig popupConfig) {
        return C30941CCj.LIZ(popupConfig);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final void Qd0(boolean z) {
        UserInfoMethod.LJLIL = z;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final TTLiveBrowserFragment u40(Bundle bundle) {
        C29261Be5.LIZ(bundle.getString("url", ""));
        TTLiveBrowserFragment tTLiveBrowserFragment = new TTLiveBrowserFragment();
        tTLiveBrowserFragment.setArguments(bundle);
        return tTLiveBrowserFragment;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final BNW K90(String str, String str2) {
        BNW bnw = new BNW(str, str2);
        BNX hybridType = BNX.LYNX;
        o.LJIIIZ(hybridType, "hybridType");
        bnw.LJIILJJIL = hybridType;
        return bnw;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final Fragment P(Context context, Bundle bundle) {
        return this.LJLIL.P(context, bundle);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final <T> T Wn(Context context, String str) {
        return (T) C72264SXs.LIZ(context).LIZLLL(str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final void kD(Context context, PopupConfig popupConfig) {
        PopupContainerFragment Mo = Mo(popupConfig);
        if (context != null) {
            if (!(context instanceof Activity)) {
                context = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
            }
            ActivityC45651qj LJIILL = g0.LJIILL(context);
            if (LJIILL != null) {
                BaseDialogFragment.wl(LJIILL, Mo);
            }
        }
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final <T> void zb(Context context, String str) {
        C72264SXs.LIZ(context).LJFF(str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final AbstractC31219CNb nb(Uri uri, String str, Context context) {
        Activity topActivity;
        if (C29306Beo.LIZIZ(context) != null) {
            topActivity = C29306Beo.LIZIZ(context);
        } else {
            topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
        }
        boolean hostInterceptSpark = ((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(uri.toString());
        if (topActivity != null) {
            if (hostInterceptSpark) {
                return new CMH(topActivity, uri.toString(), str);
            }
            return new CNV(topActivity, uri, str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final void qk0(Context context, Object obj, String str) {
        C72264SXs.LIZ(context).LJIIIIZZ(obj, str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final void dr(BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        new PopHalfWebDialogHelper(baseFragment, dataChannel, z, lifecycleOwner);
    }
}
