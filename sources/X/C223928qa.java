package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS20S0500000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223928qa {
    public static final void LIZ(Context context, WikipediaInfo info, java.util.Map<String, String> params, java.util.Map<String, String> mobParams) {
        String keyword;
        Integer status;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(info, "info");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(mobParams, "mobParams");
        String lang = info.getLang();
        if (lang == null || lang.length() == 0 || (keyword = info.getKeyword()) == null || keyword.length() == 0) {
            return;
        }
        AqS20S0500000_3 aqS20S0500000_3 = new AqS20S0500000_3(info, (WikipediaInfo) params, (java.util.Map<String, String>) info, (WikipediaInfo) context, (Context) mobParams, (java.util.Map<String, String>) 5);
        WikipediaExtra extra = info.getExtra();
        if (extra == null || (status = extra.getStatus()) == null || status.intValue() == 0) {
            aqS20S0500000_3.invoke();
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(context);
        WikipediaExtra extra2 = info.getExtra();
        String str2 = null;
        if (extra2 != null) {
            str = extra2.getWarningMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = context.getString(R.string.txh);
        } else {
            WikipediaExtra extra3 = info.getExtra();
            if (extra3 != null) {
                str2 = extra3.getWarningMsg();
            }
        }
        c26227ARb.LIZIZ(str2);
        UC0.LIZJ(c26227ARb, new AqS169S0100000_3(aqS20S0500000_3, 774));
        c26227ARb.LJI().LIZLLL();
    }
}
