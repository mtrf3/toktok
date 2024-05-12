package com.ss.android.ugc.aweme.commercialize.depend;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C224488rU;
import X.C38544FAu;
import X.C57422MgE;
import X.C59244NMy;
import X.C61200O0e;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.N2W;
import X.NNJ;
import X.NNR;
import X.NO0;
import X.NO1;
import X.NO5;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdRouterHandlerDependImpl implements IAdRouterHandlerDepend {
    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final String LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("snssdk");
        LIZ.append(C38544FAu.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LIZIZ(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        C224488rU.LIZJ(openUrl);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final NNJ LJ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        return new NO0(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final NNJ LJFF(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        return new C59244NMy(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final NNJ LJI(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        return new NO1(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJII(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        NO5.LJIJJ(new N2W(interfaceC88472Yns));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean open(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        return C61200O0e.LIZLLL().LJII(openUrl);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void pendingDeepLinkLog(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        NO5.LJIJI(new N2W(interfaceC88472Yns));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LIZ(Context context, String str) {
        return C57422MgE.LIZIZ(context, str, null, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIIIZZ(ActivityC45651qj activityC45651qj, String url) {
        o.LJIIIZ(url, "url");
        return C61200O0e.LIZLLL().LJI(activityC45651qj, url);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LIZLLL(String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIIZ(Context context, String str, Uri uri, NNR nnr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("【filterUrl】 = ");
        LIZ.append(str);
        LIZ.append(" 【market】 special handle");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("commerce_jump", X1D.LIZIZ(LIZ));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        C16880lQ.LIZJ(context, intent);
        return true;
    }
}
