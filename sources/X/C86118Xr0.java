package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Xr0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86118Xr0 implements KL3 {
    public WeakReference<ActivityC86117Xqz> LJLIL;

    public final void LIZ(int i, String str) {
        ActivityC86117Xqz activityC86117Xqz;
        WeakReference<ActivityC86117Xqz> weakReference = this.LJLIL;
        if (weakReference == null || (activityC86117Xqz = weakReference.get()) == null || !V1B.LJLI(activityC86117Xqz)) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activityC86117Xqz);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // X.KL3
    public final void showCustomLongToast(int i, String str) {
        LIZ(i, str);
    }

    @Override // X.KL3
    public final void showCustomToast(int i, String str, int i2, int i3) {
        LIZ(i, str);
    }
}
