package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GKX {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZ(String desc, String str, String str2, AwemeRawAd awemeRawAd, Long l, TuxSheet tuxSheet) {
        o.LJIIIZ(desc, "desc");
        boolean z = false;
        int LJJLIIIJL = s.LJJLIIIJL(desc, str, 0, false, 6);
        if (LJJLIIIJL == -1) {
            return new SpannableStringBuilder(desc);
        }
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            z = true;
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(desc);
            spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(desc);
        spannableStringBuilder2.setSpan(new C43263GyR(tuxSheet, awemeRawAd, l, str2), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        spannableStringBuilder2.setSpan(new StyleSpan(1), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        return spannableStringBuilder2;
    }
}
