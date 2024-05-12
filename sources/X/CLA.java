package X;

import com.bytedance.android.livesdk.livesetting.rank.RankPreCreateSparkViewSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CLA {
    public static final boolean LIZ;

    static {
        o.LJIIIIZZ(UriProtector.parse("sslocal://lynxview").buildUpon().appendQueryParameter("url", "").appendQueryParameter("__live_platform__", "webcast").appendQueryParameter("target_handler", "webcast").appendQueryParameter("key_biz", "biz_glb_live_rank_cell_render_lynx").toString(), "parse(\"sslocal://lynxvie… BIZ)\n        .toString()");
        LIZ = RankPreCreateSparkViewSetting.INSTANCE.getValue();
    }
}
