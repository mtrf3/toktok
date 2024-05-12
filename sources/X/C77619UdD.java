package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UdD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77619UdD implements InterfaceC77693UeP {
    @Override // X.InterfaceC77693UeP
    public final boolean LIZIZ(long j, String chargeReason) {
        o.LJIIIZ(chargeReason, "chargeReason");
        return j > 0;
    }

    @Override // X.InterfaceC77693UeP
    public final void LIZ(C77667Udz c77667Udz, long j) {
        Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(j);
        if (findGiftById != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.num);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_recharge_gift)");
            c77667Udz.LIZLLL = ujb.o.LJJJJZ(LJIILJJIL, "{giftname}", findGiftById.name, false);
            ImageModel imageModel = findGiftById.image;
            if (imageModel != null) {
                c77667Udz.LIZ = imageModel;
            }
        }
    }
}
