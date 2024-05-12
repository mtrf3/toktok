package X;

import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* loaded from: classes11.dex */
public final class OH4 implements InterfaceC74078T5m {
    @Override // X.InterfaceC74078T5m
    public final boolean LIZJ(String str) {
        return C61200O0e.LIZLLL().LJII(str);
    }

    @Override // X.InterfaceC74078T5m
    public final boolean LIZLLL(String str) {
        return AVExternalServiceImpl.LIZ().infoService().stickerInfo().idUnlocked(str);
    }

    @Override // X.InterfaceC74078T5m
    public final boolean isScanUnLockType(String str) {
        return AVExternalServiceImpl.LIZ().infoService().stickerInfo().isScanUnLockType(str);
    }

    @Override // X.InterfaceC74078T5m
    public final boolean LIZ(Context context, String str) {
        return NO5.LJI(context, str, false);
    }

    @Override // X.InterfaceC74078T5m
    public final void LIZIZ(Context context, String str) {
        NO5.LJII(context, str, "");
    }

    @Override // X.InterfaceC74078T5m
    public final void LJ(Context context, String str, String str2, String str3) {
        if (!NO5.LJI(context, str, false)) {
            NO5.LJII(context, str2, str3);
        }
    }
}
