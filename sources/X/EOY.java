package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EOY {
    public int LIZIZ;
    public final HashMap<EnumC35502DwY, HashSet<String>> LIZ = new HashMap<>();
    public final HashSet<String> LIZJ = new HashSet<>();

    public final void LIZIZ(String url, EnumC35502DwY reason) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(reason, "reason");
        this.LIZIZ++;
        if (!this.LIZ.containsKey(reason)) {
            this.LIZ.put(reason, C77275UUl.LIZLLL(url));
        }
        HashSet<String> hashSet = this.LIZ.get(reason);
        if (hashSet != null) {
            hashSet.add(url);
        }
    }

    public final void LIZ(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        int i2;
        int i3;
        C188727au c188727au = new C188727au();
        String str7 = null;
        if (str != null) {
            str5 = str.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("path", str5);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("action_type", lowerCase);
        if (str3 != null) {
            str6 = str3.toLowerCase(locale);
            o.LJIIIIZZ(str6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("enter_from", str6);
        if (str4 != null) {
            str7 = str4.toLowerCase(locale);
            o.LJIIIIZZ(str7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        c188727au.LJIIIZ("enter_method", str7);
        c188727au.LIZLLL(i, "download_num");
        c188727au.LIZLLL(this.LIZJ.size(), "image_in_cache_cnt");
        if (o.LJ(str2, "download_fail")) {
            c188727au.LIZLLL(this.LIZIZ, "failed_cnt");
            HashSet<String> hashSet = this.LIZ.get(EnumC35502DwY.FILE_DOWNLOAD);
            if (hashSet != null) {
                i2 = hashSet.size();
            } else {
                i2 = 0;
            }
            c188727au.LIZLLL(i2, "fail_download_error_cnt");
            HashSet<String> hashSet2 = this.LIZ.get(EnumC35502DwY.TOOLS_API);
            if (hashSet2 != null) {
                i3 = hashSet2.size();
            } else {
                i3 = 0;
            }
            c188727au.LIZLLL(i3, "tools_api_fail_cnt");
        }
        FMX.LJIIL("ai_avatar_choose_avatar_page", c188727au.LIZ);
        this.LIZJ.clear();
        this.LIZIZ = 0;
        this.LIZ.clear();
    }
}
