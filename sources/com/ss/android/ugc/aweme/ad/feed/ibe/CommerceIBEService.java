package com.ss.android.ugc.aweme.ad.feed.ibe;

import X.C199797sl;
import X.C1DF;
import X.C2058786d;
import X.C30581Hy;
import X.C36636EZk;
import X.C42486Glu;
import X.C48841JEv;
import X.C58096Mr6;
import X.C58628Mzg;
import X.C58993NDh;
import X.C59002NDq;
import X.C59004NDs;
import X.C59005NDt;
import X.C59119NId;
import X.C76800UCe;
import X.C79146V4k;
import X.C84763XOl;
import X.EnumC59048NFk;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.NDX;
import X.NDZ;
import X.ORZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceIBEService implements ICommerceIBEService {
    public static ICommerceIBEService LJFF() {
        Object LIZ = C58096Mr6.LIZ(ICommerceIBEService.class, false);
        if (LIZ != null) {
            return (ICommerceIBEService) LIZ;
        }
        if (C58096Mr6.LJLZ == null) {
            synchronized (ICommerceIBEService.class) {
                if (C58096Mr6.LJLZ == null) {
                    C58096Mr6.LJLZ = new CommerceIBEService();
                }
            }
        }
        return C58096Mr6.LJLZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final NDX LIZIZ(C59119NId c59119NId) {
        return new NDX(c59119NId);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final boolean LIZJ(String schema) {
        o.LJIIIZ(schema, "schema");
        C59005NDt.LIZ.getClass();
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(schema), "channel");
        if (queryParameter != null) {
            return C59005NDt.LIZJ(queryParameter);
        }
        throw new C59002NDq();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final Object LIZ(IBEInfo iBEInfo, C58628Mzg c58628Mzg, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return C59005NDt.LIZ.LIZ(iBEInfo, c58628Mzg, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final void LJ(List<? extends Aweme> list, EnumC59048NFk preloadScene, Integer num) {
        Object[] array;
        Activity LJIIIIZZ;
        CommercialVideoInfo LJIIZILJ;
        List<IBEInfo> ibeInfos;
        IBEInfo iBEInfo;
        o.LJIIIZ(preloadScene, "preloadScene");
        if (list == null || (array = list.toArray(new Aweme[0])) == null || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
            return;
        }
        C199797sl c199797sl = new C199797sl(C30581Hy.LJJIIJZLJL(array));
        while (c199797sl.hasNext()) {
            C2058786d c2058786d = (C2058786d) c199797sl.next();
            int i = c2058786d.LIZ;
            Aweme aweme = (Aweme) c2058786d.LIZIZ;
            if (aweme != null && (LJIIZILJ = C1DF.LJIIZILJ(aweme)) != null && (ibeInfos = LJIIZILJ.getIbeInfos()) != null && (iBEInfo = (IBEInfo) ORZ.LLFII(ibeInfos)) != null) {
                C58993NDh c58993NDh = NDZ.LIZ;
                C42486Glu c42486Glu = new C42486Glu(this, iBEInfo, LJIIIIZZ, i, aweme, num, preloadScene);
                c58993NDh.getClass();
                Boolean bool = c58993NDh.LIZIZ.get(aweme.getAid());
                Boolean bool2 = Boolean.TRUE;
                if (!o.LJ(bool, bool2)) {
                    c58993NDh.LIZIZ.put(aweme.getAid(), bool2);
                    c42486Glu.invoke();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService
    public final void LIZLLL(IBEInfo ibeInfo, Context context, C58628Mzg c58628Mzg, InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> onReady, InterfaceC65784Pro<C76800UCe> onFail) {
        o.LJIIIZ(ibeInfo, "ibeInfo");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(onReady, "onReady");
        o.LJIIIZ(onFail, "onFail");
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ.plus(C79146V4k.LJIILIIL())), null, null, new C59004NDs(ibeInfo, this, c58628Mzg, context, onReady, onFail, null), 3);
    }
}
