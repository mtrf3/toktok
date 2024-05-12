package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import kotlin.jvm.internal.o;

/* renamed from: X.0xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24160xA {
    public static final C24160xA LIZ = new C24160xA();

    public static final void LIZ(Context context, java.util.Map<String, String> map, boolean z) {
        String str;
        if (z) {
            str = C24170xB.LIZ.userGameDetailLandscape;
        } else {
            str = C24170xB.LIZ.userGameDetail;
        }
        if (str.length() == 0) {
            return;
        }
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        int min = (int) Math.min(C15380j0.LJIJ(C15380j0.LJIIL()), C15380j0.LJIJ(C15380j0.LJIIJJI()));
        BY3 by3 = BY3.DP;
        LIZ2.LJIILL(min, by3);
        C29682Bks.LJIIZILJ(LIZ2, min);
        LIZ2.LJIL(min, by3);
        LIZ2.LJIILJJIL("end");
        LIZ2.LJJIFFI(map);
        LIZ2.LJJI("click_time", String.valueOf(System.currentTimeMillis()));
        if (z) {
            LIZ2.LJIILLIIL("end");
            InterfaceC06390Mx LIZ3 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ3, "getService(IHybridContainerService::class.java)");
            String uri = LIZ2.LIZ().toString();
            o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
            ((IHybridContainerService) LIZ3).Vs0(context, uri, null);
            return;
        }
        LIZ2.LJIJJ("bottom");
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
        String uri2 = LIZ2.LIZ().toString();
        o.LJIIIIZZ(uri2, "sparkPopupSchemaBuilder.build().toString()");
        iGamePartnershipService.ri0(context, uri2, map);
    }
}
