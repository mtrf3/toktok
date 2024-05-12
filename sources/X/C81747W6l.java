package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.W6l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81747W6l implements InterfaceC81739W6d {
    @Override // X.InterfaceC81739W6d
    public final double LIZ(EnumC81745W6j enumC81745W6j) {
        int i = C81746W6k.LIZ[enumC81745W6j.ordinal()];
        if (i == 1) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (i != 2 && i != 3 && i != 4 && i != 5) {
            W58.LJIJI("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", enumC81745W6j);
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return 1.0d;
    }
}
