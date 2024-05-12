package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMultithreadedEventTrackingSetting;

/* renamed from: X.2gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65032gt {
    public static void LIZ(Runnable runnable) {
        if (LiveGiftMultithreadedEventTrackingSetting.INSTANCE.getValue()) {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZ, null, new C65022gs(runnable, null), 2);
        } else {
            runnable.run();
        }
    }
}
