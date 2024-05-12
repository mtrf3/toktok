package X;

import com.bytedance.keva.Keva;

/* renamed from: X.QvF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68545QvF {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(boolean z) {
        Keva repo = Keva.getRepo("password_status");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(RBW.LJLLI.LIZJ());
        LIZ2.append("_password_set_status");
        repo.storeBoolean(X1D.LIZIZ(LIZ2), z);
    }
}
