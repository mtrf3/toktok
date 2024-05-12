package X;

import Y.IDeS358S0100000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.browser.IContainerService;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;
import com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UnR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78253UnR implements BTW, IHostStyleUIDepend, InterfaceC48038ItG, InterfaceC73592SuS {
    public static int LJLIL = 112;
    public static InterfaceC46786IXu LJLILLLLZI = null;
    public static int LJLJI = 116;
    public static final C78253UnR LJLJJI = new C78253UnR();
    public static final C78253UnR LJLJJL = new C78253UnR();

    public static boolean LJ() {
        if (C60903NvH.LJIIJJI().LJJIL().getDurationMode(true)) {
            C60903NvH.LJIIJJI().LJJIL().setDurationMode(false);
        }
        return C60903NvH.LJIIJJI().LJJIL().getDurationMode(true);
    }

    public static IapExternalService LJFF() {
        return PaymentServiceManager.get().getIapExternalService();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIJ(it, "it");
        return it;
    }

    @Override // X.BTW
    public boolean canHandle(android.net.Uri uri) {
        IContainerService iContainerService = (IContainerService) CN1.LIZ(IContainerService.class);
        if (iContainerService != null) {
            return iContainerService.t00(uri);
        }
        return false;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        return !it.isEmpty();
    }

    public static void LIZ(String str, String str2) {
        if (LJLILLLLZI != null && !TextUtils.isEmpty(str2)) {
            InterfaceC46786IXu interfaceC46786IXu = LJLILLLLZI;
            if (!TextUtils.isEmpty(str)) {
                str2 = C0ON.LIZJ("TTVideoEngine: tag = ", str, ";  ", str2);
            }
            ((C46809IYr) ((C46779IXn) interfaceC46786IXu).LIZ).LIZ.getConfig().getALog().d(str2);
        }
    }

    public static final void LIZIZ(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        IAccountService LJIJ = AccountService.LJIJ();
        if (!LJIJ.LJFF().isLogin()) {
            InterfaceC65895Ptb LJI = LJIJ.LJI();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = activityC45651qj;
            c78450Uqc.LJ = new IDeS358S0100000_13(interfaceC65784Pro, 2);
            C40925G4j.LIZ(c78450Uqc, LJI);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static void LIZLLL(String str, String str2) {
        if (((LJLJI >> 6) & 1) == 1) {
            LIZ(str, str2);
        }
    }

    public static void LJI(String str, String str2) {
        if (((LJLJI >> 2) & 1) == 1) {
            LIZ(str, str2);
        }
    }

    @Override // X.BTW
    public boolean handle(Context context, android.net.Uri uri) {
        IContainerService iContainerService = (IContainerService) CN1.LIZ(IContainerService.class);
        if (iContainerService != null) {
            return iContainerService.CM(context, uri);
        }
        return false;
    }

    @Override // X.BTW
    public boolean LIZJ(Context context, android.net.Uri uri, java.util.Map map) {
        return handle(context, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPageNaviStyle(X.InterfaceC38263Ezz r6, android.app.Activity r7, com.bytedance.sdk.xbridge.runtime.depend.PageTitleBar r8) {
        /*
            r5 = this;
            r2 = 0
            if (r6 == 0) goto L11
            java.lang.Class<X.Nsz> r0 = X.InterfaceC60761Nsz.class
            java.lang.Object r0 = r6.LJ(r0)
            X.Nsz r0 = (X.InterfaceC60761Nsz) r0
            if (r0 == 0) goto L11
            X.Nsb r2 = r0.getHybridContext()
        L11:
            r4 = 1
            if (r8 == 0) goto Lb6
            java.lang.Boolean r0 = r8.getHideNavBar()
            if (r0 == 0) goto L2f
            boolean r3 = r0.booleanValue()
            if (r2 == 0) goto L2f
            java.lang.Class<X.NuK> r0 = X.InterfaceC60844NuK.class
            java.lang.Object r1 = r2.LIZIZ(r0)
            X.NuK r1 = (X.InterfaceC60844NuK) r1
            if (r1 == 0) goto L2f
            r0 = r3 ^ 1
            r1.LJIJJ(r0)
        L2f:
            java.lang.String r1 = r8.getTitle()
            if (r1 == 0) goto L44
            if (r2 == 0) goto L44
            java.lang.Class<X.NuK> r0 = X.InterfaceC60844NuK.class
            java.lang.Object r0 = r2.LIZIZ(r0)
            X.NuK r0 = (X.InterfaceC60844NuK) r0
            if (r0 == 0) goto L44
            r0.LJJIII(r1)
        L44:
            java.lang.String r3 = r8.getTitleColor()
            if (r3 == 0) goto L5d
            if (r2 == 0) goto L5d
            java.lang.Class<X.NuK> r0 = X.InterfaceC60844NuK.class
            java.lang.Object r1 = r2.LIZIZ(r0)
            X.NuK r1 = (X.InterfaceC60844NuK) r1
            if (r1 == 0) goto L5d
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r3)
            r1.LJJIJIIJI(r0)
        L5d:
            java.lang.String r3 = r8.getNavBarColor()
            if (r3 == 0) goto L76
            if (r2 == 0) goto L76
            java.lang.Class<X.NuK> r0 = X.InterfaceC60844NuK.class
            java.lang.Object r1 = r2.LIZIZ(r0)
            X.NuK r1 = (X.InterfaceC60844NuK) r1
            if (r1 == 0) goto L76
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r3)
            r1.LJJIL(r0)
        L76:
            java.lang.Integer r0 = r8.getDisableNavBarBackButton()
            if (r0 == 0) goto L8c
            int r1 = r0.intValue()
            boolean r0 = r7 instanceof com.bytedance.hybrid.spark.page.SparkActivity
            if (r0 == 0) goto L8c
            com.bytedance.hybrid.spark.page.SparkActivity r7 = (com.bytedance.hybrid.spark.page.SparkActivity) r7
            if (r7 == 0) goto L8c
            if (r1 != r4) goto Lda
        L8a:
            r7.LJLLILLLL = r4
        L8c:
            java.lang.String r3 = r8.getNavBtnType()
            if (r3 == 0) goto Lb6
            int r1 = r3.hashCode()
            r0 = -934521548(0xffffffffc84c5534, float:-209236.81)
            if (r1 == r0) goto Lce
            r0 = 109400031(0x6854fdf, float:5.01464E-35)
            if (r1 == r0) goto Lc2
            r0 = 949444906(0x3897612a, float:7.218339E-5)
            if (r1 == r0) goto Lb7
        La5:
            X.Ni4 r1 = X.EnumC60084Ni4.TYPE_NONE
        La7:
            if (r2 == 0) goto Lb6
            java.lang.Class<X.NuK> r0 = X.InterfaceC60844NuK.class
            java.lang.Object r0 = r2.LIZIZ(r0)
            X.NuK r0 = (X.InterfaceC60844NuK) r0
            if (r0 == 0) goto Lb6
            r0.LJIIZILJ(r1)
        Lb6:
            return
        Lb7:
            java.lang.String r0 = "collect"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto La5
            X.Ni4 r1 = X.EnumC60084Ni4.TYPE_COLLECT
            goto La7
        Lc2:
            java.lang.String r0 = "share"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lcb
            goto La5
        Lcb:
            X.Ni4 r1 = X.EnumC60084Ni4.TYPE_SHARE
            goto La7
        Lce:
            java.lang.String r0 = "report"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Ld7
            goto La5
        Ld7:
            X.Ni4 r1 = X.EnumC60084Ni4.TYPE_REPORT
            goto La7
        Lda:
            r4 = 0
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78253UnR.setPageNaviStyle(X.Ezz, android.app.Activity, com.bytedance.sdk.xbridge.runtime.depend.PageTitleBar):void");
    }
}
