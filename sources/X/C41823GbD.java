package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import ujb.o;

/* renamed from: X.GbD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41823GbD {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme, String str) {
        if (aweme != null && aweme.getVideo() != null && aweme.getVideo().isNeedSetCookie() && str != null && !TextUtils.isEmpty(str)) {
            if (aweme.getVideo().isNeedSetCookie() && o.LJJJLIIL(str, "http://", false)) {
                C4LD.LIZIZ.LJIIIZ(str);
                return str;
            }
            C64626PXy LJIIJJI = C64626PXy.LJIIJJI(str);
            if (LJIIJJI != null && LJIIJJI.LJIILL("ss_is_p_v_ss") == null) {
                C64627PXz LJIIJ = LJIIJJI.LJIIJ();
                LJIIJ.LJIIIIZZ("ss_is_p_v_ss", "1");
                return LJIIJ.toString();
            }
        }
        return str;
    }
}
