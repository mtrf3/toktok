package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.a4k, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92066a4k {
    public static final void LIZ(boolean z, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        C35931b3 LJIL = interfaceC24520xk.LJIL(1183281883);
        if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if (((i2 & 11) ^ 2) != 0 || !LJIL.LIZ()) {
            boolean z2 = C91671ZyN.LIZ;
            if (z) {
                if (z2) {
                    i3 = R.drawable.is;
                } else {
                    i3 = R.drawable.it;
                }
            } else {
                i3 = R.drawable.ix;
            }
            C0SR.LIZ(C79081V1x.LJJIIZ(i3, LJIL), null, C09290Yb.LJIIJJI(InterfaceC07790Sh.LJJJI, 24), null, null, 0.0f, null, LJIL, 440, LiveTryModeCountDownThresholdSetting.DEFAULT);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C93003aJr(z, i);
    }
}