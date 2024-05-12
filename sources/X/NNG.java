package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNG implements IAdRouterHandlerDepend {
    public static final NNG LIZIZ = new NNG();
    public final /* synthetic */ IAdRouterHandlerDepend LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LIZ(Context context, String str) {
        return this.LIZ.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LIZIZ(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        this.LIZ.LIZIZ(openUrl);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final String LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LIZLLL(String str, String str2, String str3) {
        this.LIZ.LIZLLL(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final NNJ LJ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        return this.LIZ.LJ(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final NNJ LJFF(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        return this.LIZ.LJFF(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final NNJ LJI(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        return this.LIZ.LJI(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJII(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ.LJII(interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIIIZZ(ActivityC45651qj activityC45651qj, String url) {
        o.LJIIIZ(url, "url");
        return this.LIZ.LJIIIIZZ(activityC45651qj, url);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIIZ(Context context, String str, android.net.Uri uri, NNR nnr) {
        return this.LIZ.LJIIIZ(context, str, uri, nnr);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean open(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        return this.LIZ.open(openUrl);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void pendingDeepLinkLog(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ.pendingDeepLinkLog(interfaceC88472Yns);
    }

    public NNG() {
        IAdRouterHandlerDepend iAdRouterHandlerDepend;
        Object LIZ = C58096Mr6.LIZ(IAdRouterHandlerDepend.class, false);
        if (LIZ != null) {
            iAdRouterHandlerDepend = (IAdRouterHandlerDepend) LIZ;
        } else {
            if (C58096Mr6.LLLLII == null) {
                synchronized (IAdRouterHandlerDepend.class) {
                    if (C58096Mr6.LLLLII == null) {
                        C58096Mr6.LLLLII = new AdRouterHandlerDependImpl();
                    }
                }
            }
            iAdRouterHandlerDepend = C58096Mr6.LLLLII;
        }
        this.LIZ = iAdRouterHandlerDepend;
    }
}
