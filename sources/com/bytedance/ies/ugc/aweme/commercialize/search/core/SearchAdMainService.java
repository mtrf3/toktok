package com.bytedance.ies.ugc.aweme.commercialize.search.core;

import X.C48145Iuz;
import X.C58096Mr6;
import X.C59076NGm;
import X.C59077NGn;
import X.C61878OQg;
import X.C84763XOl;
import X.C86393XvR;
import X.IVK;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.JMB;
import X.JMC;
import X.N50;
import X.N53;
import X.N69;
import X.NBG;
import X.NBH;
import X.NIP;
import X.NIW;
import X.NQL;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.omsdk.IAdOmSdkManagerProvider;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commerce.omid.AdOmSdkManagerProvider;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SearchAdMainService implements ISearchAdMainService {
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZ() {
        return C48145Iuz.LIZ().LIZLLL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZLLL() {
        return C48145Iuz.LIZ().LJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LJ() {
        return C48145Iuz.LIZ().LJFF;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final NIP LJIIIIZZ() {
        return C48145Iuz.LIZ();
    }

    public static ISearchAdMainService LJIIJJI() {
        Object LIZ = C58096Mr6.LIZ(ISearchAdMainService.class, false);
        if (LIZ != null) {
            return (ISearchAdMainService) LIZ;
        }
        return new SearchAdMainService();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final NIW LJII() {
        return N50.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final JMC LIZIZ(JMB jmb) {
        return new N53(jmb);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final boolean LIZJ(Context context) {
        Activity LJIIIIZZ;
        o.LJIIIZ(context, "context");
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        if (context instanceof Activity) {
            LJIIIIZZ = (Activity) context;
        } else {
            if (context instanceof ContextThemeWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext() instanceof Activity) {
                    Context baseContext = contextWrapper.getBaseContext();
                    o.LJII(baseContext, "null cannot be cast to non-null type android.app.Activity");
                    LJIIIIZZ = (Activity) baseContext;
                }
            }
            LJIIIIZZ = C84763XOl.LJIIIIZZ();
        }
        return LLLZI.LJIL(LJIIIIZZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJIIIZ(Context context) {
        IAdOmSdkManagerProvider adOmSdkManagerProvider;
        if (context == null) {
            return;
        }
        Object LIZ = C58096Mr6.LIZ(IAdOmSdkManagerProvider.class, false);
        if (LIZ != null) {
            adOmSdkManagerProvider = (IAdOmSdkManagerProvider) LIZ;
        } else {
            adOmSdkManagerProvider = new AdOmSdkManagerProvider();
        }
        NQL LIZ2 = adOmSdkManagerProvider.LIZ();
        if (LIZ2.LJIJ != null && LIZ2.LJFF() != null) {
            LIZ2.LJIILL = false;
            LIZ2.LIZ(context, LIZ2.LJFF(), LIZ2.LJIJ, false);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final N69 LJIIJ(NBG nbg) {
        return new NBH(nbg);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJFF(String str, String str2, InterfaceC64592gB<NewLiveRoomStruct> interfaceC64592gB, InterfaceC64592gB<Throwable> interfaceC64592gB2) {
        long j;
        C86393XvR LJJIJIL;
        try {
            j = CastLongProtector.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            LJJIJIL.LJZL(j, str2).LJJJLIIL(interfaceC64592gB, interfaceC64592gB2);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService
    public final void LJI(View adview, Context context, Aweme aweme, InterfaceC65784Pro<Long> interfaceC65784Pro, InterfaceC65784Pro<Long> interfaceC65784Pro2, boolean z) {
        o.LJIIIZ(adview, "adview");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        IVK LIZJ = MeasurementServiceImpl.LJ().LIZJ();
        if (LIZJ != null) {
            LIZJ.LJIILLIIL(interfaceC65784Pro);
            LIZJ.LJIIIIZZ(interfaceC65784Pro2);
            if (z) {
                LIZJ.setTracker(C59076NGm.LJLIL);
            } else {
                LIZJ.setTracker(C59077NGn.LJLIL);
            }
            LIZJ.LJI(adview, context, aweme, LIZJ, C61878OQg.INSTANCE);
        }
    }
}
