package X;

import Y.ACallableS118S0100000_15;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes16.dex */
public final class YAL {
    public static YAM LIZ;

    static {
        C42625Go9.LIZIZ(new YAL());
    }

    public static void LIZJ() {
        YAM yam = LIZ;
        if (yam != null) {
            String aid = yam.LIZ;
            int i = yam.LIZIZ;
            String nid = yam.LIZJ;
            boolean z = yam.LIZLLL;
            long j = yam.LJ;
            long j2 = yam.LJFF;
            String str = yam.LJI;
            int i2 = yam.LJII;
            String str2 = yam.LJIIIIZZ;
            long j3 = yam.LJIIIZ;
            o.LJIIIZ(aid, "aid");
            o.LJIIIZ(nid, "nid");
            C10K.LIZJ(new ACallableS118S0100000_15(new YAM(aid, i, nid, z, j, j2, str, i2, str2, j3), 17));
            LIZ = null;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDetailAwemeEvent(C80153Cp event) {
        o.LJIIIZ(event, "event");
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(event, 272);
        YAM yam = LIZ;
        if (yam != null) {
            aqS181S0100000_15.invoke(yam);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDetailFirstFrameEvent(C2P1 event) {
        o.LJIIIZ(event, "event");
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(event, 273);
        YAM yam = LIZ;
        if (yam != null) {
            aqS181S0100000_15.invoke(yam);
        }
    }

    public static void LIZ(Integer num, String str, String str2) {
        int i;
        String str3;
        String str4 = str2;
        if (InboxSampleRate.LIZ(1.0f, "notice_enter_video_perf") && C78685UuP.LJJJZ(str)) {
            o.LJI(str);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (str4 == null) {
                str4 = "";
            }
            YAM yam = LIZ;
            if (yam != null) {
                str3 = yam.LIZ;
            } else {
                str3 = null;
            }
            YAM yam2 = new YAM(str, i, str4, o.LJ(str3, str), 0L, 0L, null, 0, null, 0L);
            yam2.LJ = SystemClock.uptimeMillis();
            LIZ = yam2;
        }
    }

    public static void LIZIZ(Integer num, String str, String str2) {
        if (str != null && s.LJJJLZIJ(str, "aweme://aweme/detail/", false)) {
            try {
                android.net.Uri parse = UriProtector.parse(str);
                String queryParameter = UriProtector.getQueryParameter(parse, "id");
                if (queryParameter == null || queryParameter.length() == 0) {
                    List<String> pathSegments = parse.getPathSegments();
                    if (pathSegments != null) {
                        queryParameter = (String) ListProtector.get(pathSegments, 1);
                    } else {
                        queryParameter = null;
                    }
                }
                LIZ(num, queryParameter, str2);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
