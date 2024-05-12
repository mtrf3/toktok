package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.component.music.MusicService;
import ujb.o;

/* renamed from: X.Nv4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60890Nv4 {
    public static final String LIZ() {
        int LJIJ;
        String LIZJ = C31461Li.LIZJ("music_recommend_url", "", "getInstance().getStringV…ndUrlSetting::class.java)");
        if (TextUtils.isEmpty(LIZJ) || !o.LJJJLIIL(LIZJ, "aweme://lynxview/", false) || !MusicService.LJJLIIIJJI().LJJJLL() || (LJIJ = MusicService.LJJLIIIJJI().LJIJ()) <= 0) {
            return "";
        }
        return YE1.LIZIZ(LIZJ, "&limit=", LJIJ);
    }
}
