package X;

import android.app.Activity;

/* renamed from: X.FeI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39466FeI implements InterfaceC61208O0m {
    public final InterfaceC39467FeJ LJLIL = C38342F3a.LJLIL;

    @Override // X.InterfaceC61208O0m
    public final boolean open(String str) {
        String LIZ;
        if (str == null) {
            LIZ = null;
        } else {
            LIZ = this.LJLIL.LIZ(str);
        }
        if (LIZ == null || LIZ.length() == 0) {
            return false;
        }
        return C61200O0e.LIZLLL().LJII(LIZ);
    }

    @Override // X.InterfaceC61208O0m
    public final boolean LIZ(Activity activity, String str) {
        String LIZ;
        if (str == null) {
            LIZ = null;
        } else {
            LIZ = this.LJLIL.LIZ(str);
        }
        if (LIZ == null || LIZ.length() == 0) {
            return false;
        }
        return C61200O0e.LIZLLL().LJI(activity, LIZ);
    }
}
