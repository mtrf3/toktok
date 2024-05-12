package com.ss.android.ugc.aweme;

import X.C242549fW;
import X.C58096Mr6;
import X.EnumC242959gB;
import X.INV;
import X.NC7;
import X.NCA;
import X.NGY;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleServiceImpl implements IAnoleService {
    public static IAnoleService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAnoleService.class, false);
        if (LIZ != null) {
            return (IAnoleService) LIZ;
        }
        if (C58096Mr6.LJJJLL == null) {
            synchronized (IAnoleService.class) {
                if (C58096Mr6.LJJJLL == null) {
                    C58096Mr6.LJJJLL = new AnoleServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJJLL;
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final void LIZ(Aweme aweme) {
        String str;
        String str2;
        Integer num;
        boolean z;
        Long creativeId;
        o.LJIIIZ(aweme, "aweme");
        C242549fW.LIZ("preload gecko");
        IAdHybridContainerManager LIZLLL = AdHybridContainerManager.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "get().getService(IAdHybr…ainerManager::class.java)");
        EnumC242959gB enumC242959gB = EnumC242959gB.ANOLE_DATA_RESPONSE;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        Integer num2 = null;
        if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str = String.valueOf(creativeId);
        } else {
            str = null;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            str2 = awemeRawAd2.getLogExtra();
        } else {
            str2 = null;
        }
        String groupId = aweme.getGroupId();
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            num = Integer.valueOf(awemeRawAd3.getChargeType());
        } else {
            num = null;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            num2 = Integer.valueOf(awemeRawAd4.getSystemOrigin());
        }
        if (aweme.getAwemeRawAd() != null) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL.LIZ(enumC242959gB, aweme, new NGY(str, str2, groupId, num, num2, Boolean.valueOf(z)));
    }

    @Override // com.ss.android.ugc.aweme.IAnoleService
    public final NC7 LIZIZ(Context context, Aweme aweme, NCA anoleBusinessDelegate, INV inv) {
        AnoleModel anoleModel;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anoleBusinessDelegate, "anoleBusinessDelegate");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (anoleModel = awemeRawAd.getAnoleModel()) == null) {
            return null;
        }
        return new NC7(context, aweme, anoleModel, anoleBusinessDelegate, inv);
    }
}
