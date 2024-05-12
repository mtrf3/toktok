package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdFollowButtonFollowActionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxCardStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxStickerStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxSuperLikeStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdMakePhoneCallMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseAdLynxHalfLoadingPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseLynxFeedMaskMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.ClosePopUpWindow;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CollapseAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidGetGameCodeClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidSelectScoreMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidSelectVoteCardOptionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdReadyMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdViewSizeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.ExpandAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetNativeSiteCustomDataMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdLandPageLinksMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenLightLandingPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.RegisterProgressObserverMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.ShakeEggBridge;
import com.ss.android.ugc.aweme.bullet.bridge.ad.StorySelectionReplayMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.SwipeUpVideoMethod;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;
import com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FuY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40474FuY extends C40489Fun implements InterfaceC40491Fup {
    @Override // X.InterfaceC60280NlE
    public final InterfaceC60179Njb LIZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C59437NUj(providerFactory, new N5S());
    }

    @Override // X.InterfaceC60261Nkv
    public final List<AbstractC59475NVv> LIZJ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return C47261Igj.LJJIJ(new NOV());
    }

    @Override // X.InterfaceC40491Fup
    public final InterfaceC39446Fdy LJ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C40477Fub();
    }

    @Override // X.InterfaceC60269Nl3
    public final InterfaceC60244Nke LJII(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C40478Fuc();
    }

    @Override // X.InterfaceC40491Fup
    public final InterfaceC60304Nlc LJIIIIZZ(F3T providerFactory) {
        BaseCommonBizRootContainer baseCommonBizRootContainer;
        o.LJIIIZ(providerFactory, "providerFactory");
        Object LIZJ = providerFactory.LIZJ(InterfaceC60179Njb.class);
        if (!(LIZJ instanceof C59451NUx) || (baseCommonBizRootContainer = (BaseCommonBizRootContainer) LIZJ) == null) {
            return null;
        }
        return new C40476Fua(baseCommonBizRootContainer.LJLILLLLZI);
    }

    @Override // X.InterfaceC60266Nl0
    public final List<InterfaceC38186Eyk> createBridges(F3T providerFactory) {
        ILiveOuterService LJJJLL;
        C86393XvR LJJIJIL;
        java.util.Map<String, InterfaceC38012Evw> liveWalletJSB;
        java.util.Set<Map.Entry<String, InterfaceC38012Evw>> entrySet;
        BulletMethodAdapter$javaMethodToBullet$1 LIZ;
        o.LJIIIZ(providerFactory, "providerFactory");
        ArrayList arrayList = new ArrayList();
        C38049EwX c38049EwX = (C38049EwX) providerFactory.LIZJ(C38049EwX.class);
        Object LIZJ = providerFactory.LIZJ(Context.class);
        if (c38049EwX != null && LIZJ != null && (LJJJLL = LiveOuterService.LJJJLL()) != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (liveWalletJSB = LJJIJIL.getLiveWalletJSB(new WeakReference<>(LIZJ), c38049EwX)) != null && (entrySet = liveWalletJSB.entrySet()) != null && (r3 = entrySet.iterator()) != null) {
            for (Map.Entry<String, InterfaceC38012Evw> entry : entrySet) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    String key = entry.getKey();
                    o.LJIIIIZZ(key, "entry.key");
                    InterfaceC38012Evw value = entry.getValue();
                    o.LJIIIIZZ(value, "entry.value");
                    LIZ = C40225FqX.LIZ(EnumC38014Evy.PRIVATE, providerFactory, value, key);
                    arrayList.add(LIZ);
                }
            }
        }
        List LLIIIZ = ORZ.LLIIIZ(C47261Igj.LJJIJIIJI(new GetWebViewInfo(providerFactory), new AdInfoMethod(providerFactory), new OpenAdLandPageLinksMethod(providerFactory), new DownloadAppClickMethod(providerFactory), new GetNativeSiteCustomDataMethod(providerFactory), new SwipeUpVideoMethod(providerFactory), new CloseLynxFeedMaskMethod(providerFactory), new StorySelectionReplayMethod(providerFactory), new DidGetGameCodeClickMethod(providerFactory), new DidSelectVoteCardOptionMethod(providerFactory), new OpenLightLandingPageMethod(providerFactory), new ShakeEggBridge(providerFactory), new DidSelectScoreMethod(providerFactory), new DynamicAdViewSizeMethod(providerFactory), new DynamicAdReadyMethod(providerFactory), new DynamicAdStatusMethod(providerFactory), new AdLynxSuperLikeStatusMethod(providerFactory), new AdMakePhoneCallMethod(providerFactory), new CloseAdLynxHalfLoadingPageMethod(providerFactory), new AdFollowButtonFollowActionMethod(providerFactory), new ClosePopUpWindow(providerFactory), new RegisterProgressObserverMethod(providerFactory), new AdLynxStickerStatusMethod(providerFactory)), arrayList);
        Iterable arrayList2 = new ArrayList();
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            arrayList2 = NTF.LJIIZILJ(providerFactory);
        }
        List LLIIIZ2 = ORZ.LLIIIZ(arrayList2, LLIIIZ);
        Iterable arrayList3 = new ArrayList();
        if (NH3.LIZ() != null) {
            arrayList3 = NTF.LJIJ(providerFactory);
        }
        List LLIIIZ3 = ORZ.LLIIIZ(arrayList3, LLIIIZ2);
        Iterable arrayList4 = new ArrayList();
        if (NH3.LIZ() != null) {
            arrayList4 = NTF.LJIJI(providerFactory);
        }
        return ORZ.LLIIIZ(C47261Igj.LJJIJIL(new CloseAdLynxCardMethod(providerFactory), new AdLynxCardStatusMethod(providerFactory), new ExpandAdLynxCardMethod(providerFactory), new CollapseAdLynxCardMethod(providerFactory)), ORZ.LLIIIZ(new ArrayList(), ORZ.LLIIIZ(arrayList4, LLIIIZ3)));
    }
}
