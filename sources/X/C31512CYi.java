package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.rank.RankListPageFpsOptSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.CYi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31512CYi {
    public static long LIZ;
    public static final boolean LIZIZ = RankListPageFpsOptSetting.INSTANCE.getValue();

    public static String LIZ(String str) {
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        if (!TextUtils.isEmpty(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()))) {
            buildUpon.appendQueryParameter("userId", valueOf);
        }
        buildUpon.appendQueryParameter("use_simple_user", "true");
        buildUpon.appendQueryParameter("enable_code_cache", "1");
        buildUpon.appendQueryParameter("thread_strategy", "2");
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "urlBuilder.toString()");
        return builder;
    }
}
