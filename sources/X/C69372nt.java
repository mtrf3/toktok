package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69372nt {
    public final HashMap<String, String> LIZ;
    public final Uri.Builder LIZIZ;

    public final android.net.Uri LIZIZ() {
        for (Map.Entry<String, String> entry : this.LIZ.entrySet()) {
            this.LIZIZ.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        android.net.Uri build = this.LIZIZ.build();
        o.LJIIIIZZ(build, "uriBuilder.build()");
        return build;
    }

    public C69372nt(HashMap<String, String> hashMap, Uri.Builder builder) {
        this.LIZ = hashMap;
        this.LIZIZ = builder;
    }

    public final void LIZ(String str, String value) {
        o.LJIIIZ(value, "value");
        if (!TextUtils.isEmpty(this.LIZ.get("rn_schema"))) {
            String str2 = this.LIZ.get("rn_schema");
            HashMap<String, String> hashMap = this.LIZ;
            String uri = UriProtector.parse(str2).buildUpon().appendQueryParameter(str, value).build().toString();
            o.LJIIIIZZ(uri, "parse(rnScheme).buildUpo…              .toString()");
            hashMap.put("rn_schema", uri);
        }
        if (!TextUtils.isEmpty(this.LIZ.get("url"))) {
            String str3 = this.LIZ.get("url");
            HashMap<String, String> hashMap2 = this.LIZ;
            String uri2 = UriProtector.parse(str3).buildUpon().appendQueryParameter(str, value).build().toString();
            o.LJIIIIZZ(uri2, "parse(urlParam).buildUpo…              .toString()");
            hashMap2.put("url", uri2);
        }
    }
}
