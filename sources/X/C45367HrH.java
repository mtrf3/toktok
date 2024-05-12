package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HrH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45367HrH {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, Aweme aweme, String downloadMethod) {
        String string;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        if (C44938HkM.LIZIZ()) {
            if (aweme == null) {
                return false;
            }
            if (C62364Odk.LIZIZ.LJI()) {
                string = context.getString(R.string.tjy);
            } else if (C44938HkM.LIZ() && !o.LJ(downloadMethod, "download_to_share")) {
                string = context.getString(R.string.ge2);
            } else {
                string = context.getString(R.string.ge1);
            }
            o.LJIIIIZZ(string, "if (PhotoDownloadService…rvideo)\n                }");
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                C31811Ce7.LIZIZ(LJIIIIZZ, string);
            }
            return false;
        }
        if (C2NU.LIZ.LIZIZ()) {
            if (!C39579Fg7.LJIILL()) {
                C05L.LIZLLL(context, R.string.qb6);
            } else {
                if (C39579Fg7.LJIILIIL() >= 20971520) {
                    return true;
                }
                C05L.LIZLLL(context, R.string.qb7);
            }
            C45347Hqx.LIZIZ(EnumC45368HrI.SDCARD, aweme);
            return false;
        }
        C05L.LIZLLL(context, R.string.img);
        C45347Hqx.LIZIZ(EnumC45368HrI.NETWORK, aweme);
        return false;
    }
}
