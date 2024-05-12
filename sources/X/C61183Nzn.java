package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.Nzn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61183Nzn extends C62005OVd {
    @Override // X.C62005OVd, X.InterfaceC61185Nzp
    public final int LIZ(Context context) {
        return C04330Ez.LIZ(context, "android.permission.RECORD_AUDIO");
    }

    @Override // X.C62005OVd, X.InterfaceC61185Nzp
    public final int LIZIZ(Context context) {
        return C04330Ez.LIZ(context, "android.permission.CAMERA");
    }

    @Override // X.C62005OVd, X.InterfaceC61185Nzp
    public final int LIZJ(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C04330Ez.LIZ(context, "android.permission.READ_MEDIA_VIDEO");
        }
        return C04330Ez.LIZ(context, "android.permission.READ_EXTERNAL_STORAGE");
    }

    @Override // X.C62005OVd, X.InterfaceC61185Nzp
    public final int LIZLLL(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C04330Ez.LIZ(context, "android.permission.READ_MEDIA_IMAGES");
        }
        return C04330Ez.LIZ(context, "android.permission.READ_EXTERNAL_STORAGE");
    }

    @Override // X.C62005OVd, X.InterfaceC61185Nzp
    public final int LJ(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C04330Ez.LIZ(context, "android.permission.READ_MEDIA_AUDIO");
        }
        return C04330Ez.LIZ(context, "android.permission.READ_EXTERNAL_STORAGE");
    }

    @Override // X.C62005OVd, X.InterfaceC61185Nzp
    public final int LJFF(Context context) {
        return C04330Ez.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
