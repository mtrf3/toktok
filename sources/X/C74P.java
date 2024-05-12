package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: X.74P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C74P {
    public static void LIZ(C62846OlW c62846OlW, UrlModel urlModel, KS7 ks7) {
        if (C79004UzY.LJJIFFI(urlModel.getUrlList()) && TextUtils.isEmpty(urlModel.getUri())) {
            return;
        }
        KS5 ks5 = new KS5(c62846OlW, urlModel, ks7);
        ks5.LJIIIZ = true;
        ks5.LIZ();
    }
}
