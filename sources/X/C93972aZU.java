package X;

import com.bytedance.ugc.effectcreator.main.MainImpl;

/* renamed from: X.aZU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93972aZU {
    public static void LIZ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDraftUpgrade = ");
        LIZ.append(z);
        C94034aaU.LIZ("Draft::", X1D.LIZIZ(LIZ));
        if (z) {
            MainImpl LIZ2 = C93932aYq.LIZ();
            if (LIZ2 != null) {
                LIZ2.onFireEvent(new C94247adv(1));
                return;
            }
            return;
        }
        MainImpl LIZ3 = C93932aYq.LIZ();
        if (LIZ3 == null) {
            return;
        }
        LIZ3.onFireEvent(new C94247adv(256));
    }
}
