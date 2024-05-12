package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Fja, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39794Fja {
    public static String LIZ(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "https://www.tiktok.com/link/";
        }
        Uri.Builder appendQueryParameter = UriProtector.parse(str2).buildUpon().appendQueryParameter("aid", String.valueOf(EF7.LJIIIZ)).appendQueryParameter("target", str);
        C87093YGb c87093YGb = C43286Gyo.LIZ;
        EF7.LIZIZ();
        return appendQueryParameter.appendQueryParameter("lang", C87093YGb.LIZJ(c87093YGb.LIZIZ().getLocale())).appendQueryParameter(WM7.SCENE_SERVICE, "qrcode").build().toString();
    }
}
