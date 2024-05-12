package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NPi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59306NPi implements InterfaceC38952FQm {
    public final Context LIZ;

    public C59306NPi(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.InterfaceC38952FQm
    public final android.net.Uri LIZ(Bundle bundle, String originUrl) {
        String str;
        android.net.Uri uri;
        o.LJIIIZ(originUrl, "originUrl");
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            str = AbstractC57425MgH.LIZ(C63081OpJ.LJJJJLI(this.LIZ), originUrl);
        } else {
            str = null;
        }
        try {
            uri = UriProtector.parse(str);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Splicing with status bar height url failed: ");
            LIZ.append(str);
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            uri = UriProtector.parse(originUrl);
        }
        if (bundle == null) {
            o.LJIIIIZZ(uri, "uri");
            return uri;
        }
        boolean z = false;
        if (TextUtils.equals("1", UriProtector.getQueryParameter(uri, "append_common_params")) || TextUtils.equals("1", bundle.getString("add_common"))) {
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            StringBuilder sb = new StringBuilder(str);
            IAppLogDepend LIZ2 = C59835Ne3.LIZ();
            if (LIZ2 != null) {
                LIZ2.appendCommonParams(sb, false);
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "strBuilder.toString()");
            uri = UriProtector.parse(s.LJZI(sb2).toString());
        }
        if (bundle.getBoolean("safeTemplate", false) && uri.isHierarchical()) {
            String decode = android.net.Uri.decode(UriProtector.getQueryParameter(uri, "target"));
            if (!TextUtils.isEmpty(decode)) {
                Uri.Builder buildUpon = uri.buildUpon();
                android.net.Uri parse = UriProtector.parse(decode);
                java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
                if (queryParameterNames != null && (!queryParameterNames.isEmpty())) {
                    z = true;
                }
                if (z) {
                    for (String str2 : queryParameterNames) {
                        if (!o.LJ("target", str2)) {
                            buildUpon.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
                        }
                    }
                }
                uri = UriProtector.parse(buildUpon.build().toString());
            }
        }
        if (uri.isHierarchical() && TextUtils.equals("1", UriProtector.getQueryParameter(uri, "auto_play_bgm"))) {
            bundle.putBoolean("bundle_auto_play_audio", true);
        }
        bundle.putString("bundle_origin_url", uri.toString());
        return uri;
    }
}
