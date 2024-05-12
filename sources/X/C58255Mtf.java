package X;

import com.ss.android.ugc.aweme.accountxbridge.AccountBDXBridgeService;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopBDXBridgeServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.ECommerceXBridgeService;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.i18n.xbridge.IECommerceXBridgeService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.SearchBDXBridgeServiceImpl;
import com.ss.android.ugc.aweme.services.CommerceXBridgetServiceImpl;
import com.ss.android.ugc.aweme.services.MainXBridgeServiceImpl;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.jsb.CreativeToolXBridgeService;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Mtf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58255Mtf {
    public static final void LIZ() {
        IECommerceXBridgeService iECommerceXBridgeService;
        C37831Et1.LIZIZ(C86603Xyp.class, null, 6);
        C37831Et1.LIZIZ(C39354FcU.class, null, 6);
        C37831Et1.LIZIZ(FTG.class, null, 6);
        C37831Et1.LIZIZ(C39369Fcj.class, null, 6);
        C37831Et1.LIZIZ(N7Z.class, null, 6);
        C37831Et1.LIZIZ(K0V.class, null, 6);
        C37831Et1.LIZIZ(C86277XtZ.class, null, 6);
        C37831Et1.LIZIZ(C86284Xtg.class, null, 6);
        C37831Et1.LIZIZ(C71814SGk.class, null, 6);
        C37831Et1.LIZIZ(C71826SGw.class, null, 6);
        C37831Et1.LIZIZ(C39190FZq.class, null, 6);
        C37831Et1.LIZIZ(C39191FZr.class, null, 6);
        if (C19N.LJ("BDXBridge_Bridge_IDL_Migration", false)) {
            C37831Et1.LIZIZ(C58841N7l.class, null, 6);
            Boolean bool = Boolean.TRUE;
            if (bool != null) {
                C37936Eui.LJII.put("BDXBridge_bridge_idl_migration", bool);
            }
        } else {
            Boolean bool2 = Boolean.FALSE;
            if (bool2 != null) {
                C37936Eui.LJII.put("BDXBridge_bridge_idl_migration", bool2);
            }
        }
        C37831Et1.LIZIZ(C37549EoT.class, null, 6);
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            C37831Et1.LIZIZ(PNN.class, null, 6);
        }
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it = MainXBridgeServiceImpl.createIMainXBridgetServicebyMonsterPlugin(false).provideXBridgetIDLMethodList().iterator();
        while (it.hasNext()) {
            C37831Et1.LIZIZ(it.next(), null, 6);
        }
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it2 = CommerceXBridgetServiceImpl.createICommerceXBridgetServicebyMonsterPlugin(false).provideXBridgetIDLMethodList().iterator();
        while (it2.hasNext()) {
            C37831Et1.LIZIZ(it2.next(), null, 6);
        }
        Object LIZ = C58096Mr6.LIZ(IECommerceXBridgeService.class, false);
        if (LIZ != null) {
            iECommerceXBridgeService = (IECommerceXBridgeService) LIZ;
        } else {
            if (C58096Mr6.F == null) {
                synchronized (IECommerceXBridgeService.class) {
                    if (C58096Mr6.F == null) {
                        C58096Mr6.F = new ECommerceXBridgeService();
                    }
                }
            }
            iECommerceXBridgeService = C58096Mr6.F;
        }
        Iterator<Class<? extends InterfaceC37666EqM>> it3 = iECommerceXBridgeService.LIZ().iterator();
        while (it3.hasNext()) {
            C37831Et1.LIZIZ(it3.next(), null, 6);
        }
        Iterator<Class<? extends InterfaceC37666EqM>> it4 = CreativeToolXBridgeService.LIZ().provideXBridgetIDLMethodList().iterator();
        while (it4.hasNext()) {
            C37831Et1.LIZIZ(it4.next(), null, 6);
        }
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it5 = SearchBDXBridgeServiceImpl.LIZ().provideXBridgetIDLMethodList().iterator();
        while (it5.hasNext()) {
            C37831Et1.LIZIZ(it5.next(), null, 6);
        }
        Iterator<Class<? extends InterfaceC37666EqM>> it6 = AccountBDXBridgeService.LIZ().provideXBridgetIDLMethodList().iterator();
        while (it6.hasNext()) {
            C37831Et1.LIZIZ(it6.next(), null, 6);
        }
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it7 = IMService.createIIMServicebyMonsterPlugin(false).getImXBridgeProviderService().LIZ().iterator();
        while (it7.hasNext()) {
            C37831Et1.LIZIZ(it7.next(), null, 6);
        }
        a.LIZ.getClass();
        List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList = a.LJIIIIZZ().provideXBridgetIDLMethodList();
        if (provideXBridgetIDLMethodList != null) {
            Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it8 = provideXBridgetIDLMethodList.iterator();
            while (it8.hasNext()) {
                C37831Et1.LIZIZ(it8.next(), null, 6);
            }
        }
        List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList2 = a.LJFF().provideXBridgetIDLMethodList();
        if (provideXBridgetIDLMethodList2 != null) {
            Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it9 = provideXBridgetIDLMethodList2.iterator();
            while (it9.hasNext()) {
                C37831Et1.LIZIZ(it9.next(), null, 6);
            }
        }
        List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList3 = a.LJIILIIL().provideXBridgetIDLMethodList();
        if (provideXBridgetIDLMethodList3 != null) {
            Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it10 = provideXBridgetIDLMethodList3.iterator();
            while (it10.hasNext()) {
                C37831Et1.LIZIZ(it10.next(), null, 6);
            }
        }
        LiveOuterService.LJJJLL().LJIJJLI();
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it11 = C58257Mth.LIZ.provideXBridgetIDLMethodList().iterator();
        while (it11.hasNext()) {
            C37831Et1.LIZIZ(it11.next(), null, 6);
        }
        Iterator<Class<? extends InterfaceC37666EqM>> it12 = VopBDXBridgeServiceImpl.LIZ().provideXBridgetIDLMethodList().iterator();
        while (it12.hasNext()) {
            C37831Et1.LIZIZ(it12.next(), null, 6);
        }
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it13 = FavoriteServiceImpl.LJIJJLI().provideXBridgetIDLMethodList().iterator();
        while (it13.hasNext()) {
            C37831Et1.LIZIZ(it13.next(), null, 6);
        }
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it14 = ShareExtServiceImpl.LJJLIIJ().provideXBridgetIDLMethodList().iterator();
        while (it14.hasNext()) {
            C37831Et1.LIZIZ(it14.next(), null, 6);
        }
        Iterator<Class<? extends AbstractC37594EpC<?, ?>>> it15 = LocationServiceImpl.LJIJJ().LIZIZ().iterator();
        while (it15.hasNext()) {
            C37831Et1.LIZIZ(it15.next(), EnumC37844EtE.WEB, 4);
        }
        C37831Et1.LIZIZ(C43046Guw.class, null, 6);
        C37936Eui.LJII.put("BDXBridgeStarter_finish", "true");
    }
}
