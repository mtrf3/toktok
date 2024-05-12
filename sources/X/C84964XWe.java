package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XWe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84964XWe {
    public static final /* synthetic */ int LIZ = 0;

    public static final C73306Spq LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        C73306Spq c73306Spq = new C73306Spq();
        String string = fragment.getString(R.string.ij0);
        o.LJIIIIZZ(string, "fragment.getString(R.string.music_tab_local)");
        c73306Spq.LJFF = string;
        String string2 = fragment.getString(R.string.hvt);
        o.LJIIIIZZ(string2, "fragment.getString(R.str…ocal_music_empty_content)");
        c73306Spq.LJI = string2;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_music_note;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        return c73306Spq;
    }

    public static final void LIZIZ(Activity activity, String str) {
        MusicService.LJJLIIIJJI().LJ();
        J9P.LIZIZ(activity, str, "click_favorite_music", null, null);
    }
}
