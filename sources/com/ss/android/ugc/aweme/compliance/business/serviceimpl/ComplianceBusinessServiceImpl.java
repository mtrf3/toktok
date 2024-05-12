package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.A7S;
import X.AKT;
import X.ASL;
import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C00F;
import X.C16880lQ;
import X.C182717Fb;
import X.C182747Fe;
import X.C19N;
import X.C213858aL;
import X.C221108m2;
import X.C247839o3;
import X.C26227ARb;
import X.C26252ASa;
import X.C279017q;
import X.C32151Nz;
import X.C32I;
import X.C35971E9v;
import X.C37999Evj;
import X.C40460FuK;
import X.C40464FuO;
import X.C45804HyK;
import X.C47261Igj;
import X.C52189Ke1;
import X.C52949KqH;
import X.C54840Lfg;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C62889OmD;
import X.C62891OmF;
import X.C62892OmG;
import X.C62893OmH;
import X.C62894OmI;
import X.C62895OmJ;
import X.C62902OmQ;
import X.C62904OmS;
import X.C62905OmT;
import X.C62907OmV;
import X.C62913Omb;
import X.C62914Omc;
import X.C62945On7;
import X.C63022OoM;
import X.C65352Pkq;
import X.C6FL;
import X.C76800UCe;
import X.C77883UhT;
import X.C77885UhV;
import X.C78685UuP;
import X.C84763XOl;
import X.C86034Xpe;
import X.C8BR;
import X.C8BS;
import X.C8W0;
import X.C9X3;
import X.EJ6;
import X.FMX;
import X.FTO;
import X.H7B;
import X.HG3;
import X.IIY;
import X.InterfaceC63015OoF;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC65943PuN;
import X.InterfaceC72642tA;
import X.InterfaceC85903XnX;
import X.M74;
import X.O6R;
import X.OP4;
import X.PYO;
import X.RBX;
import X.SC5;
import X.UC0;
import X.UPJ;
import X.X1D;
import Y.ACListenerS29S0300000_3;
import Y.ARunnableS42S0100000_6;
import Y.IDCListenerS283S0100000_7;
import Y.IDDListenerS144S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed.ManageFeedsPanelFragment;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.SearchPersonalizedPanelFragment;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS28S1300000_3;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ComplianceBusinessServiceImpl implements IComplianceBusinessService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C62893OmH.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C62894OmI.LJLIL);
    public boolean LIZJ;
    public ScheduledExecutorService LIZLLL;
    public int LJ;
    public boolean LJFF;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final InterfaceC65350Pko<? extends C8W0> LJIIJJI() {
        return C65352Pkq.LIZ(ComplianceBusinessActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJIIZILJ() {
        boolean z;
        M74 LJ = PopupManager.LJ();
        if (LJ == null) {
            return false;
        }
        List<InterfaceC65350Pko<?>> list = C40464FuO.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<InterfaceC65350Pko<?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(o.LJ(C65352Pkq.LIZ(LJ.getClass()), it.next())));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (((Boolean) next).booleanValue() || booleanValue) {
                    z = true;
                } else {
                    z = false;
                }
                next = Boolean.valueOf(z);
            }
            return ((Boolean) next).booleanValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Class<?> LJIJI() {
        return C40460FuK.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Fragment LJIJJ() {
        return C182717Fb.LIZ("new_user_journey");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int LJJI() {
        try {
            String LIZIZ = C9X3.LIZ.LIZIZ("tns_filter_keyword_count_self", CardStruct.IStatusCode.DEFAULT);
            o.LJIIIIZZ(LIZIZ, "instance().get(\"tns_filt…keyword_count_self\", \"0\")");
            return CastIntegerProtector.parseInt(LIZIZ);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Fragment LJJJJ() {
        return C182717Fb.LIZ("account_privacy_page");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJIIJI(C77885UhV.class, C77883UhT.class, FTO.class);
    }

    public static IComplianceBusinessService LJJJJIZL() {
        Object LIZ = C58096Mr6.LIZ(IComplianceBusinessService.class, false);
        if (LIZ != null) {
            return (IComplianceBusinessService) LIZ;
        }
        if (C58096Mr6.LLLZZIL == null) {
            synchronized (IComplianceBusinessService.class) {
                if (C58096Mr6.LLLZZIL == null) {
                    C58096Mr6.LLLZZIL = new ComplianceBusinessServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLZZIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Object LJII() {
        return new C62891OmF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int LJIIIZ() {
        return C00F.LIZ(31744, 0, "filter_videos_with_keywords", true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final String LJIJJLI() {
        String impressumUrl;
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ == null || (impressumUrl = LIZ.getImpressumUrl()) == null) {
            return "";
        }
        return impressumUrl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final String LJJIII() {
        String privacyHighlightsForTeensLink;
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ == null || (privacyHighlightsForTeensLink = LIZ.getPrivacyHighlightsForTeensLink()) == null) {
            return "";
        }
        return privacyHighlightsForTeensLink;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final InterfaceC65943PuN LJJIIJ() {
        return new PYO();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int LJJIJIIJI() {
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        Integer num = c62914Omc.LJ;
        if (num == null && (num = Integer.valueOf(c62914Omc.LIZIZ.getInt("remove_photo_sensitive_status", 0))) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIJLIJ() {
        return C19N.LJ("enable_aigc_switch", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJJJI() {
        Boolean bool = (Boolean) C62889OmD.LJI.getValue();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void LJJJJJ() {
        ActivityC45651qj activityC45651qj;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null) {
            PopupManager.LJIIL(new C213858aL(activityC45651qj));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final String[] LJI() {
        return C52189Ke1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJIIIIZZ() {
        return C62913Omb.LJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final int LJJIIJZLJL() {
        if (HG3.LJIILL().isLogin()) {
            return 2;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final MutableLiveData LJFF() {
        return C62889OmD.LJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Object LJIILL() {
        return C63022OoM.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final ViewModelProvider.Factory LJIILLIIL() {
        return C182747Fe.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final MutableLiveData LJJIZ() {
        return C62889OmD.LJI;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZ(String str) {
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            return LJIILIIL.LIZ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZIZ(String str) {
        IClientSecurityService LJIILIIL;
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        if ((localTestApi == null || !localTestApi.bypassUrlForWebViewIsolation(str)) && ((LJIILIIL = ClientSecurityServiceImpl.LJIILIIL()) == null || !LJIILIIL.LIZIZ(str))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZJ(String str) {
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            return LJIILIIL.LIZJ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LIZLLL(String url) {
        o.LJIIIZ(url, "url");
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            return LJIILIIL.LIZLLL(url);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJII(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return C62945On7.LIZIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return C62945On7.LIZIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIJIIJIL(Aweme aweme) {
        return OP4.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIJIL(Activity activity) {
        C62945On7.LIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJJIL(boolean z) {
        return C62889OmD.LIZJ(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIIL(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            AKT akt = new AKT(LJIJJ);
            akt.LJ(R.style.ux);
            akt.LIZ.LJLILLLLZI = 0;
            akt.LJFF(R.string.hn2);
            akt.LIZ.LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(72));
            if (OP4.LIZIZ(aweme)) {
                akt.LIZ.LJLJJI = 2;
                akt.LIZLLL(R.string.hn1);
                akt.LIZ.LJLJLJ = new ACListenerS29S0300000_3(akt, aweme, LJIJJ, 8);
            }
            akt.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Fragment LJIILJJIL(boolean z, C62895OmJ c62895OmJ) {
        if (!C35971E9v.LIZ()) {
            return null;
        }
        ManageFeedsPanelFragment manageFeedsPanelFragment = new ManageFeedsPanelFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_in_sheet", z);
        manageFeedsPanelFragment.setArguments(bundle);
        manageFeedsPanelFragment.LJLIL = c62895OmJ;
        manageFeedsPanelFragment.LJLILLLLZI = null;
        return manageFeedsPanelFragment;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final List<EJ6> LJIJ(WebView webView, String str) {
        HybridTrafficColoringInterceptor.LJLIL.getClass();
        return C37999Evj.LIZ(webView.getUrl(), str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIJ(int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i2;
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        Integer num = c62914Omc.LJ;
        if (num != null || (num = Integer.valueOf(c62914Omc.LIZIZ.getInt("remove_photo_sensitive_status", 0))) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        C62913Omb.LJFF(i);
        C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> providePushSettingChangePresenter = C86034Xpe.LIZIZ.providePushSettingChangePresenter();
        providePushSettingChangePresenter.LJJI(new C62892OmG(i2, interfaceC65784Pro));
        providePushSettingChangePresenter.LJIILL("photosensitive_videos_setting", Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final Spanned LJJJ(Context context, TextWithInlineLink textWithInlineLink) {
        return C54840Lfg.LJJLIIIJLLLLLLLZ(textWithInlineLink, context, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJJIL(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r2 = "webview://jsb/downloadMedia"
            X.Evj r0 = com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor.LJLIL
            r0.getClass()
            com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings$HybridTrafficColoringModel r1 = com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings.LIZ()
            boolean r0 = r1.enabled
            if (r0 == 0) goto L18
            boolean r0 = r1.queryModEnabled
            if (r0 == 0) goto L18
            r0 = 1
        L14:
            if (r0 == 0) goto L5f
            r3 = 0
            goto L1a
        L18:
            r0 = 0
            goto L14
        L1a:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L2b
            boolean r0 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L2b
            goto L2d
        L2b:
            r1 = r3
            goto L49
        L2d:
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "__hybrid_ua"
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "__hybrid_referer"
            java.lang.String r0 = r5.getUrl()     // Catch: java.lang.Throwable -> L4d
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)     // Catch: java.lang.Throwable -> L4d
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L4d
        L49:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L4d
            goto L55
        L4d:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L55:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L62
        L5b:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L60
        L5f:
            return r6
        L60:
            r6 = r3
            goto L5f
        L62:
            r3 = r1
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl.LJJJIL(android.webkit.WebView, java.lang.String):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIILIIL(Context context, InterfaceC72642tA<? extends IEvent> interfaceC72642tA, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        FMX.onEventV3("tns_video_delete_notice_popup_show");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.efc);
        c26227ARb.LIZ(R.string.efb);
        UC0.LIZJ(c26227ARb, new AqS132S0200000_1((InterfaceC72642tA) interfaceC72642tA, (InterfaceC72642tA<? extends IEvent>) aweme, (Aweme) 3));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJIL(final ActivityC45651qj activityC45651qj, Aweme aweme, Comment comment) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(comment, "comment");
        if (activityC45651qj == null || activityC45651qj.isFinishing()) {
            return;
        }
        final String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        final C247839o3 c247839o3 = C9X3.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("comment_filter_function_open_");
        Boolean LIZ2 = c247839o3.LIZ(Boolean.FALSE, UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ));
        o.LJIIIIZZ(LIZ2, "instance().get(COMMENT_F…e.get().curUserId, false)");
        if (!LIZ2.booleanValue() || !TextUtils.equals(aweme.getAuthorUid(), curUserId) || TextUtils.equals(comment.getUser().getUid(), curUserId)) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("settings_times_");
        LIZ3.append(curUserId);
        String LIZIZ = c247839o3.LIZIZ(X1D.LIZIZ(LIZ3), CardStruct.IStatusCode.DEFAULT);
        o.LJIIIIZZ(LIZIZ, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
        if (CastIntegerProtector.parseInt(LIZIZ) >= 1) {
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("not_now_times_");
        LIZ4.append(curUserId);
        String LIZIZ2 = c247839o3.LIZIZ(X1D.LIZIZ(LIZ4), CardStruct.IStatusCode.DEFAULT);
        o.LJIIIIZZ(LIZIZ2, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
        if (CastIntegerProtector.parseInt(LIZIZ2) > 1) {
            return;
        }
        C62905OmT c62905OmT = new C62905OmT(activityC45651qj);
        c62905OmT.LIZ(R.string.egf);
        c62905OmT.LJIIIIZZ = new C62907OmV(new DialogInterface.OnClickListener() { // from class: X.9o7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C247839o3 c247839o32 = C247839o3.this;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("settings_times_");
                LIZ5.append(curUserId);
                String LIZIZ3 = X1D.LIZIZ(LIZ5);
                C247839o3 c247839o33 = C247839o3.this;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("settings_times_");
                LIZ6.append(curUserId);
                String LIZIZ4 = c247839o33.LIZIZ(X1D.LIZIZ(LIZ6), CardStruct.IStatusCode.DEFAULT);
                o.LJIIIIZZ(LIZIZ4, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
                c247839o32.LJ(LIZIZ3, String.valueOf(CastIntegerProtector.parseInt(LIZIZ4) + 1));
                SmartRouter.buildRoute(activityC45651qj, "aweme://filtercomments").open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "comment_panel");
                FMX.LJIIL("enter_filter_comment", c188727au.LIZ);
            }
        }, activityC45651qj.getString(R.string.gs9), false);
        c62905OmT.LJIIIZ = new C62907OmV(new DialogInterface.OnClickListener() { // from class: X.9oF
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C247839o3 c247839o32 = C247839o3.this;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("not_now_times_");
                LIZ5.append(curUserId);
                String LIZIZ3 = X1D.LIZIZ(LIZ5);
                C247839o3 c247839o33 = C247839o3.this;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("not_now_times_");
                LIZ6.append(curUserId);
                String LIZIZ4 = c247839o33.LIZIZ(X1D.LIZIZ(LIZ6), CardStruct.IStatusCode.DEFAULT);
                o.LJIIIIZZ(LIZIZ4, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
                c247839o32.LJ(LIZIZ3, String.valueOf(CastIntegerProtector.parseInt(LIZIZ4) + 1));
                dialogInterface.dismiss();
            }
        }, activityC45651qj.getString(R.string.ivd), false);
        c62905OmT.LJII = false;
        C279017q.LIZLLL(c62905OmT);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final ViewGroup LJJ(Context context, Aweme aweme, AqS170S0100000_4 aqS170S0100000_4) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        return OP4.LIZJ(context, aweme, aqS170S0100000_4, true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIJL(ActivityC45651qj activityC45651qj, String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C26252ASa c26252ASa = new C26252ASa(activityC45651qj, str, enterFrom);
        if (activityC45651qj == null || !C35971E9v.LIZ()) {
            return;
        }
        ManageFeedsPanelFragment manageFeedsPanelFragment = new ManageFeedsPanelFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_in_sheet", true);
        manageFeedsPanelFragment.setArguments(bundle);
        manageFeedsPanelFragment.LJLIL = c26252ASa;
        manageFeedsPanelFragment.LJLILLLLZI = null;
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = manageFeedsPanelFragment;
        asl.LJI(0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        tuxSheet.LJLILLLLZI = new IDDListenerS144S0100000_4(c26252ASa, 2);
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "ManageFeedsSheet");
        c26252ASa.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final boolean LJ(WebView webView, String injectionKey, String injectTiming, String url) {
        o.LJIIIZ(injectionKey, "injectionKey");
        o.LJIIIZ(injectTiming, "injectTiming");
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(url, "url");
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            return LJIILIIL.LJ(webView, injectionKey, injectTiming, url);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJJI(String str, String str2, String str3, String str4) {
        if (!SC5.LIZIZ(str2, "previousStoreSecUid", str4, "currentStoreSecUid", str, str3) && o.LJ(str2, str4) && C78685UuP.LJJJZ(str4)) {
            if (IIY.LIZ) {
                ScheduledExecutorService LLLLZIL = C16880lQ.LLLLZIL(1);
                this.LIZLLL = LLLLZIL;
                this.LJ = 0;
                this.LJFF = false;
                LLLLZIL.scheduleAtFixedRate(new ARunnableS42S0100000_6(this, 72), 0L, 2L, TimeUnit.SECONDS);
                return;
            }
            LJJJJJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIFFI(Activity activity, String str, String enterFrom, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro onCancel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onCancel, "onCancel");
        C26227ARb c26227ARb = new C26227ARb(activity);
        if (str == null || str.length() == 0) {
            str = activity.getString(R.string.bl1);
        }
        c26227ARb.LJFF(str);
        c26227ARb.LIZIZ(activity.getString(R.string.bl0));
        UC0.LIZJ(c26227ARb, new AqS28S1300000_3(activity, (Activity) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) enterFrom, (String) onCancel, (InterfaceC65784Pro<C76800UCe>) 0));
        c26227ARb.LIZLLL(new AqS63S1100000_10(activity, enterFrom, 3));
        c26227ARb.LJ = new IDCListenerS283S0100000_7(new AqS173S0100000_7(onCancel, (InterfaceC65784Pro<C76800UCe>) 55), 6);
        c26227ARb.LIZJ(new AqS173S0100000_7(onCancel, (InterfaceC65784Pro<C76800UCe>) 56));
        c26227ARb.LJI().LIZLLL();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.9qR, X.A7S, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final void LJJIIZI(ActivityC45651qj activityC45651qj, final String str, final String str2, final View view, final InterfaceC65784Pro<C76800UCe> refreshPage) {
        o.LJIIIZ(refreshPage, "refreshPage");
        ?? r4 = new A7S() { // from class: X.9qR
            public boolean LIZ;
            public boolean LIZIZ;

            @Override // X.A7S
            public final void LIZ() {
            }

            @Override // X.A7S
            public final void LIZJ() {
            }

            @Override // X.A7S
            public final void LIZLLL() {
            }

            public final void LJFF() {
                String str3;
                if (o.LJ(C62889OmD.LJI.getValue(), Boolean.TRUE)) {
                    str3 = "off";
                } else {
                    str3 = "on";
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("switch_status", str3);
                c188727au.LJIIIZ("search_id", str2);
                FMX.LJIIL("manage_search_popup_show", c188727au.LIZ);
            }

            @Override // X.A7S
            public final void LIZIZ(String str3) {
                if (this.LIZIZ) {
                    return;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("button_type", "click_close");
                c188727au.LJIIIZ("search_id", str2);
                FMX.LJIIL("manage_search_popup_click", c188727au.LIZ);
                View view2 = view;
                if (view2 != null) {
                    C73K.LIZ(view2, Lifecycle.State.RESUMED);
                }
            }

            @Override // X.A7S
            public final void LJ(boolean z) {
                int i = 1;
                this.LIZIZ = true;
                boolean z2 = !this.LIZ;
                if (z2 != z) {
                    refreshPage.invoke();
                }
                if (z2) {
                    if (z) {
                        i = 4;
                    }
                } else if (z) {
                    i = 2;
                } else {
                    i = 3;
                }
                this.LIZ = z;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("button_type", "click_done");
                c188727au.LJIIIZ("search_id", str2);
                c188727au.LIZLLL(i, "switch_event");
                FMX.LJIIL("manage_search_popup_click", c188727au.LIZ);
                View view2 = view;
                if (view2 != null) {
                    C73K.LIZ(view2, Lifecycle.State.RESUMED);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                Boolean bool = (Boolean) C62889OmD.LJI.getValue();
                this.LIZ = (bool == null ? Boolean.FALSE : bool).booleanValue();
            }
        };
        if (activityC45651qj == null || !C52949KqH.LIZ()) {
            return;
        }
        SearchPersonalizedPanelFragment searchPersonalizedPanelFragment = new SearchPersonalizedPanelFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_in_sheet", true);
        searchPersonalizedPanelFragment.setArguments(bundle);
        searchPersonalizedPanelFragment.LJLIL = r4;
        searchPersonalizedPanelFragment.LJLILLLLZI = null;
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = searchPersonalizedPanelFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJLILLLLZI = new IDDListenerS144S0100000_4(r4, 3);
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "ManageSearchSheet");
        r4.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    public final C6FL LJIIJ(Context context, int i, String str, String str2, String str3, InterfaceC63015OoF interfaceC63015OoF) {
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFBVObserver called from ");
        LIZ.append(str2);
        H7B.LIZIZ("ComplianceBusinessServiceImpl", X1D.LIZIZ(LIZ));
        return new FBVNoticeObserver(context, i, (C62902OmQ) this.LIZ.getValue(), (C62904OmS) this.LIZIZ.getValue(), str, str2, str3, interfaceC63015OoF);
    }
}
