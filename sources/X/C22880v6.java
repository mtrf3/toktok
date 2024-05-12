package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.0v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22880v6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C47061t0 c47061t0, Room room) {
        o.LJIIIZ(room, "room");
        if (c47061t0 == null) {
            return;
        }
        if (room.background != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                c47061t0.setForeground(null);
            }
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C78720Uuy LJII = C15650jR.LIZ().LJII(R.drawable.cbc);
                LJII.LJIIIZ(room.background);
                LJII.LJIIJJI(c47061t0);
                return;
            }
            C15620jO.LIZJ(c47061t0, room.background, C15380j0.LIZLLL().getResources().getDrawable(R.drawable.cbc), null, null, false);
            return;
        }
        String LJIIIZ = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1"), "ttlive_bg_broadcast_fragment.png");
        if (TextUtils.isEmpty(LJIIIZ)) {
            return;
        }
        C78720Uuy url = C15650jR.LIZ().setUrl(LJIIIZ);
        url.LJIIIIZZ = R.drawable.cbc;
        url.LJIJ = true;
        url.LJIJI = Boolean.FALSE;
        url.LJIIJJI(c47061t0);
    }
}
