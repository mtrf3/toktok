package X;

import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.LEt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC53935LEt<V> implements Callable {
    public static final CallableC53935LEt<V> LJLIL = new CallableC53935LEt<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        boolean z;
        C53940LEy.LIZIZ.LIZIZ(LFH.LIZIZ.LIZLLL().LJIIJ().LIZ());
        C53941LEz c53941LEz = C53941LEz.LIZIZ;
        if (c53941LEz.LIZ() == 0) {
            FFL.LJIIIZ().getClass();
            c53941LEz.LIZIZ((int) FFL.LJIIIIZZ(31744, "split_slide_angle", 2.0f));
        }
        if (LF2.LIZJ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        Npth.addTag("is_pad", str);
        C120954ot.LIZ(C54966Lhi.LIZJ() ? 1 : 0, "is_samsung_fold");
        int i = 1;
        if (C54966Lhi.LIZJ == null) {
            if (C54966Lhi.LIZ() && o.LJ(C54966Lhi.LIZLLL, "transsion")) {
                z = true;
            } else {
                z = false;
            }
            C54966Lhi.LIZJ = Boolean.valueOf(z);
        }
        C120954ot.LIZ(o.LJ(C54966Lhi.LIZJ, Boolean.TRUE) ? 1 : 0, "is_transsion_fold");
        C120954ot.LIZ(LEO.LIZ(null, null) ? 1 : 0, "comment_split");
        C120954ot.LIZ(LEN.LIZ() ? 1 : 0, "dm_split");
        if (LF2.LIZJ()) {
            for (Map.Entry entry : ((LinkedHashMap) C120954ot.LIZ).entrySet()) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("group", (String) entry.getKey());
                c188727au.LIZLLL(((Number) entry.getValue()).intValue(), "value");
                FMX.LJIIL("tablet_hero_feature_swith", c188727au.LIZ);
            }
        }
        LF1 lf1 = LF1.LIZIZ;
        if (!LF7.LIZ()) {
            i = 2;
        }
        lf1.LIZIZ(i);
        return C76800UCe.LIZ;
    }
}
