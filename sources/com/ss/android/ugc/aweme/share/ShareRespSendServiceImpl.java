package com.ss.android.ugc.aweme.share;

import X.C16880lQ;
import X.C43722HDy;
import X.C43723HDz;
import X.C45828Hyi;
import X.C58096Mr6;
import X.EF7;
import X.GTL;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.openshare.Share$Request;
import com.ss.android.ugc.aweme.openshare.Share$Response;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShareRespSendServiceImpl implements IShareRespSendService {
    public static IShareRespSendService LJ() {
        Object LIZ = C58096Mr6.LIZ(IShareRespSendService.class, false);
        if (LIZ != null) {
            return (IShareRespSendService) LIZ;
        }
        if (C58096Mr6.N6 == null) {
            synchronized (IShareRespSendService.class) {
                if (C58096Mr6.N6 == null) {
                    C58096Mr6.N6 = new ShareRespSendServiceImpl();
                }
            }
        }
        return C58096Mr6.N6;
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final GTL LIZLLL() {
        return new GTL();
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LIZ(Activity activity, C43722HDy context) {
        Share$Request LIZLLL;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(context, "context");
        if (TextUtils.isEmpty(context.mClientKey) || (LIZLLL = C43723HDz.LIZLLL(context.getShareRequestBundle())) == null) {
            return;
        }
        Share$Response share$Response = new Share$Response();
        C45828Hyi c45828Hyi = C45828Hyi.LJ;
        share$Response.errorCode = c45828Hyi.LIZ;
        share$Response.setState(LIZLLL.getMState());
        share$Response.setSubErrorCode(c45828Hyi.LIZIZ);
        LJFF(activity, LIZLLL, share$Response);
    }

    public static void LJFF(Activity activity, Share$Request share$Request, Share$Response share$Response) {
        String callerPackage = share$Request.getCallerPackage();
        String packageName = EF7.LIZIZ().getPackageName();
        if (callerPackage == null || TextUtils.equals(packageName, callerPackage)) {
            return;
        }
        String callerLocalEntry = share$Request.getCallerLocalEntry();
        if (callerPackage.length() == 0 || callerLocalEntry == null || callerLocalEntry.length() == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        share$Response.toBundle(bundle);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(callerPackage, callerLocalEntry));
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier("third_party_app_identifier");
        }
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        try {
            C16880lQ.LIZIZ(activity, intent);
            ICreativeSAAService LIZ = SAAService.LIZ();
            if (LIZ == null) {
                return;
            }
            LIZ.finishCurrentPage(activity);
        } catch (Exception unused) {
            ICreativeSAAService LIZ2 = SAAService.LIZ();
            if (LIZ2 == null) {
                return;
            }
            LIZ2.finishCurrentPage(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LIZJ(Activity activity, C43722HDy context, C45828Hyi errorStatus) {
        Share$Request LIZLLL;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(errorStatus, "errorStatus");
        if (TextUtils.isEmpty(context.mClientKey) || (LIZLLL = C43723HDz.LIZLLL(context.getShareRequestBundle())) == null) {
            return;
        }
        Share$Response share$Response = new Share$Response();
        share$Response.setSubErrorCode(errorStatus.LIZIZ);
        share$Response.errorCode = errorStatus.LIZ;
        share$Response.setState(LIZLLL.getMState());
        share$Response.errorMsg = errorStatus.LIZJ;
        LJFF(activity, LIZLLL, share$Response);
    }

    @Override // com.ss.android.ugc.aweme.openshare.IShareRespSendService
    public final void LIZIZ(Activity activity, C43722HDy c43722HDy, Share$Request share$Request, Share$Response share$Response) {
        o.LJIIIZ(activity, "activity");
        if (TextUtils.isEmpty(c43722HDy.mClientKey) || C43723HDz.LIZLLL(c43722HDy.getShareRequestBundle()) == null) {
            return;
        }
        LJFF(activity, share$Request, share$Response);
    }
}
