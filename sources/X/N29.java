package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteManager;
import com.bytedance.router.util.Util;
import com.ss.android.ugc.aweme.shortcut.ShortcutRouteAction;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class N29 {
    public final N2A LIZ;
    public final ShortcutInfo LIZIZ = null;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;

    public final int hashCode() {
        return ((String) this.LIZLLL.getValue()).hashCode();
    }

    public N29(N2A n2a) {
        this.LIZ = n2a;
        if (n2a != null) {
            this.LIZJ = C221108m2.LIZIZ(new C58614MzS(this));
            C221108m2.LIZIZ(new AqS160S0100000_10(this, 603));
            this.LIZLLL = C221108m2.LIZIZ(new C58613MzR(this));
            return;
        }
        throw new IllegalArgumentException("shortcut == null && shortcutInfo == null");
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(N29.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortcut.ShortcutWrap");
        if (o.LJ(this.LIZLLL.getValue(), ((N29) obj).LIZLLL.getValue())) {
            return true;
        }
        return false;
    }

    public final ShortcutInfo LIZ(Context context, Integer num) {
        boolean z;
        Object LIZ;
        String str;
        String str2;
        N2A n2a = this.LIZ;
        if (n2a != null) {
            ShortcutRouteAction.Companion.getClass();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(context.getPackageName());
            List<String> list = n2a.LIZLLL;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "";
            } else {
                try {
                    LIZ = android.net.Uri.encode(new JSONArray((Collection) n2a.LIZLLL).toString());
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                    LIZ = "";
                }
                str = (String) LIZ;
            }
            String str3 = n2a.LJII;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = n2a.LIZIZ;
            Uri.Builder appendQueryParameter = UriProtector.parse(Util.completeUrl(RouteManager.getInstance().getRoutesConfig().getScheme(), "//shortcut/proxy")).buildUpon().appendQueryParameter("shortcutRouteUrl", str).appendQueryParameter("SHORTCUT_ROUTE_ACTION", str3).appendQueryParameter("SHORTCUT_SINGLE", "");
            if (n2a.LJFF) {
                str2 = "SHORTCUT_NEED_LOGIN_YES";
            } else {
                str2 = "SHORTCUT_NEED_LOGIN_NO";
            }
            intent.setData(appendQueryParameter.appendQueryParameter("SHORTCUT_NEED_LOGIN", str2).appendQueryParameter("SHORTCUT_ID", str4).build());
            String str5 = this.LIZ.LIZ;
            ShortcutInfo.Builder intent2 = new ShortcutInfo.Builder(context, this.LIZ.LIZIZ).setShortLabel(str5).setLongLabel(str5).setIcon(this.LIZ.LIZJ).setIntent(intent);
            o.LJIIIIZZ(intent2, "Builder(context, shortcu…       .setIntent(intent)");
            if (num != null) {
                intent2.setRank(num.intValue());
            }
            ShortcutInfo build = intent2.build();
            o.LJIIIIZZ(build, "shortcutInfoBuilder.build()");
            return build;
        }
        ShortcutInfo shortcutInfo = this.LIZIZ;
        if (shortcutInfo != null) {
            return shortcutInfo;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
