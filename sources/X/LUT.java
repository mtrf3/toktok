package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LUT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Context context) {
        ActivityC45651qj LJJIFFI;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        ActivityC45651qj LJJIFFI2;
        MainActivityScope LJJLIIIJJI2;
        HomeTabAbility LJIL2;
        try {
            if (ECommerceMallService.v3().LJJLI()) {
                if (context == null || (LJJIFFI2 = C45804HyK.LJJIFFI(context)) == null || (LJJLIIIJJI2 = C78866UxK.LJJLIIIJJI(LJJIFFI2)) == null || (LJIL2 = C87277YNd.LJIL(LJJLIIIJJI2)) == null || !LJIL2.jc()) {
                    return false;
                }
                return true;
            }
            if (!ECommerceMallService.v3().Q1() || context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI)) == null || (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) == null || !LJIL.is("Shop")) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZJ(Context context) {
        ActivityC45651qj LJJIFFI;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        try {
            if (!ECommerceMallService.v3().Q1() || context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI)) == null || (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) == null) {
                return false;
            }
            if (!LJIL.is("Shop")) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZLLL(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            String path = uri.getPath();
            if (!o.LJ("ec", uri.getHost())) {
                return false;
            }
            if (!o.LJ("/mall", path)) {
                if (!o.LJ("/fashion_mall", path)) {
                    return false;
                }
            }
            return true;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return false;
        }
    }

    public static boolean LJ(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return false;
        }
        try {
            return LIZLLL(UriProtector.parse(str));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return false;
        }
    }

    public static String LIZ(String str, String str2) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return "unknown";
        }
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            return str;
        }
        return C00F.LIZIZ(str, '_', str2);
    }
}
