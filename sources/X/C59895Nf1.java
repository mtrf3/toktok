package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;

/* renamed from: X.Nf1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C59895Nf1 implements InterfaceC58333Muv, InterfaceC48038ItG, RTU {
    @Override // X.InterfaceC58333Muv
    public java.util.Map LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", String.valueOf(EF7.LJIIIZ));
        return hashMap;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((IEffectService) CN1.LIZ(IEffectService.class)).convertStickerBean((Effect) obj);
    }

    public static StringBuilder LIZIZ(Exception exc, String str) {
        C16880lQ.LLLLIIL(exc);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return LIZ;
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return new C59764Ncu((ITpcConsentService) obj, (Activity) obj2);
    }

    public static void LIZLLL(Context context, String str, String str2, String str3) {
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
        buildRoute.withParam(str2, str3);
        buildRoute.open();
    }

    public static void LIZJ(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }
}
