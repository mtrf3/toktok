package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.DMAlbumParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HOe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43988HOe {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C43991HOh.LJLIL);

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static boolean LIZLLL() {
        if (!C92363js.LIZ()) {
            return true;
        }
        if (C43992HOi.LIZ) {
            if (LIZIZ().getInt("keva_key_display_album_tns_flag_new", 0) < H5J.LIZ().getAlbumConfig().getShowSafetyNoticeTime()) {
                return true;
            }
            return false;
        }
        if (LIZIZ().getInt("keva_key_display_album_tns_flag_new", 0) > 0) {
            return true;
        }
        return false;
    }

    public static DMAlbumParams LIZ(int i, String sessionId, boolean z) {
        int i2;
        o.LJIIIZ(sessionId, "sessionId");
        int maxSelectCount = H5J.LIZ().getAlbumConfig().getMaxSelectCount();
        int maxVideoDuration = H5J.LIZ().getAlbumConfig().getMaxVideoDuration();
        if (C43992HOi.LIZ) {
            if (C92363js.LIZ()) {
                i2 = R.string.emu;
            } else {
                i2 = R.string.emw;
            }
        } else {
            i2 = R.string.emv;
        }
        return new DMAlbumParams(sessionId, i, maxSelectCount, maxVideoDuration, R.string.emq, i2, z);
    }

    public static void LIZJ(int i, Activity activity, String sessionId, String str, String str2, String str3) {
        o.LJIIIZ(sessionId, "sessionId");
        AVExternalServiceImpl.LIZ().asyncService(activity, "dm_camera_record", new C43987HOd(i, activity, str2, str3, str, sessionId));
    }
}
