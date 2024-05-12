package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.W6h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81743W6h implements InterfaceC81739W6d {
    @Override // X.InterfaceC81739W6d
    public final double LIZ(EnumC81745W6j enumC81745W6j) {
        int i = C81744W6i.LIZ[enumC81745W6j.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                W58.LJIJI("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", enumC81745W6j);
                return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            return 1.0d;
        }
        return EnumC81745W6j.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
    }
}
