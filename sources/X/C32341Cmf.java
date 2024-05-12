package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;

/* renamed from: X.Cmf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32341Cmf {
    public static final /* synthetic */ int LIZ = 0;

    public static final AssetsModel LIZ(long j) {
        C32221Ckj.LIZIZ().getClass();
        return C32366Cn4.LIZJ(j);
    }

    public static final AssetsModel LIZIZ(long j) {
        C32221Ckj.LIZIZ().getClass();
        return C32366Cn4.LIZJ(j);
    }

    public static Gift LIZLLL(long j) {
        return GiftManager.inst().findGiftById(j);
    }

    public static final boolean LJ(Long l) {
        long j;
        C32405Cnh LIZIZ = C32221Ckj.LIZIZ();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        LIZIZ.getClass();
        return C32366Cn4.LJFF().LIZ(LIZ(j));
    }

    public static final String LIZJ(long j, boolean z) {
        C32221Ckj.LIZIZ().getClass();
        return PU0.LJI().LJFF(C32366Cn4.LJFF().LIZJ(C32366Cn4.LIZJ(j), 0), Boolean.valueOf(z));
    }

    public static final C73411SrX LJFF(int i, long j, ArrayList arrayList, InterfaceC32013ChN interfaceC32013ChN) {
        C32221Ckj.LIZIZ().getClass();
        return C32366Cn4.LIZ.LJIIIZ(i, Long.valueOf(j), false, arrayList, interfaceC32013ChN);
    }
}
