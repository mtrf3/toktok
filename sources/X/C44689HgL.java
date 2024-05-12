package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.HgL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44689HgL {
    public static final int LIZ = SFS.LJI(56.0d);
    public static final int LIZIZ = SFS.LJI(60.0d);
    public static final int LIZJ = SFS.LJI(30.0d);
    public static final int LIZLLL = SFS.LJI(35.0d);

    public static final long LIZJ() {
        if (H7G.LIZIZ()) {
            return Math.min(C152345yQ.LIZ(), 900000L);
        }
        if (!C44690HgM.LIZ()) {
            C60903NvH.LJIIJJI().getBridgeService().getClass();
        }
        return C44531Hdn.LIZ();
    }

    public static final MediaModel LIZ(String path, CutMultiVideoViewModel cutMultiVideoViewModel) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        if (cutMultiVideoViewModel.LJLLILLLL) {
            MediaModel mediaModel = new MediaModel(-1L);
            mediaModel.fileLocalUriPath = path;
            mediaModel.width = 720;
            mediaModel.height = 1280;
            mediaModel.duration = cutMultiVideoViewModel.LJLLJ;
            return mediaModel;
        }
        return C46104I7o.LJII(path);
    }

    public static String LIZIZ(Activity activity, float f, boolean z) {
        boolean z2;
        if (!z && H7G.LIZIZ() && f > 60.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i = (int) f;
            StringBuilder LIZ2 = X1D.LIZ();
            String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            LIZ2.append(LLLZI);
            LIZ2.append(':');
            String LLLZI2 = C16880lQ.LLLZI(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i % 60)}, 1));
            o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
            LIZ2.append(LLLZI2);
            String string = activity.getString(R.string.hys, X1D.LIZIZ(LIZ2));
            o.LJIIIIZZ(string, "{\n            val time =…_time, timeStr)\n        }");
            return string;
        }
        String string2 = activity.getResources().getString(R.string.ia4, C63144OqK.LIZIZ(new Object[]{Float.valueOf(f)}, 1, Locale.getDefault(), "%.1f", "format(locale, format, *args)"));
        o.LJIIIIZZ(string2, "{\n            val timeSt…elect, timeStr)\n        }");
        return string2;
    }
}
