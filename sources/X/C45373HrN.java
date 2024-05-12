package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.HrN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45373HrN {
    public static String LIZLLL(UrlModel urlModel) {
        String str = null;
        if (urlModel != null && urlModel.getUrlList() != null) {
            Iterator<String> it = urlModel.getUrlList().iterator();
            while (it.hasNext()) {
                android.net.Uri parse = UriProtector.parse(it.next());
                o.LJIIIIZZ(parse, "parse(url)");
                if (!parse.isOpaque()) {
                    str = UriProtector.getQueryParameter(parse, "logo_name");
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(Aweme aweme, String str, String str2, String isLong, String str3, int i, int i2) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(isLong, "isLong");
        String aid = aweme.getAid();
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = str2;
        if (o.LJ("download", str2)) {
            c68322mC.element = "download";
            c68322mC2.element = null;
        } else {
            c68322mC.element = "share";
        }
        C10K.LIZJ(new CallableC45375HrP(aid, str, c68322mC, c68322mC2, isLong, str3, i, aweme, i2));
    }

    public static void LIZ(long j, UrlModel urlModel, Boolean bool, Integer num, Long l, String str, String str2, String str3, boolean z, boolean z2) {
        C10K.LIZJ(new CallableC45372HrM(j, urlModel, bool, num, l, str, str2, str3, z2, z));
    }
}
