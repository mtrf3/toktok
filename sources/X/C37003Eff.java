package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Eff, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37003Eff extends C60379Nmp implements InterfaceC60260Nku {
    public final HashSet<android.net.Uri> LJLJI;
    public final InterfaceC37002Efe LJLJJI;
    public final String LJLJJL;

    public C37003Eff(AbstractC36987EfP prefetchProcessor) {
        o.LJIIJ(prefetchProcessor, "prefetchProcessor");
        this.LJLJJI = prefetchProcessor;
        this.LJLJJL = "__prefetch";
        this.LJLJI = new HashSet<>();
    }

    @Override // X.InterfaceC60260Nku
    public final void LJIILL(android.net.Uri schema) {
        o.LJIIJ(schema, "schema");
        this.LJLJI.add(schema);
        LJJIJIIJIL(schema);
    }

    @Override // X.InterfaceC60260Nku
    public final void LJIJJLI(android.net.Uri schema) {
        o.LJIIJ(schema, "schema");
        if (this.LJLJI.remove(schema)) {
            return;
        }
        LJJIJIIJIL(schema);
    }

    @Override // X.InterfaceC60260Nku
    public final JSONObject LJJIIJ(android.net.Uri url) {
        o.LJIIJ(url, "url");
        if (ujb.o.LJJJJIZL(url.getScheme(), "lynxview", false)) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("lynxview").authority("prefetch").path(o.LJIILLIIL(url.getPath(), url.getAuthority()));
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(url);
            o.LJFF(queryParameterNames, "url.queryParameterNames");
            for (String str : queryParameterNames) {
                builder.appendQueryParameter(str, UriProtector.getQueryParameter(url, str));
            }
            String builder2 = builder.toString();
            o.LJFF(builder2, "Uri.Builder().apply {\n  …   }\n        }.toString()");
            List<C36760Ebk> LIZ = this.LJLJJI.LIZ(builder2);
            if (LIZ != null) {
                JSONObject jSONObject = null;
                for (C36760Ebk c36760Ebk : LIZ) {
                    if (c36760Ebk.LJFF != null) {
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String str2 = c36760Ebk.LJII.LIZLLL;
                        C36754Ebe c36754Ebe = c36760Ebk.LJFF;
                        if (c36754Ebe != null) {
                            jSONObject.put(str2, JSONObjectProtectorUtils.getJSONObject(c36754Ebe.LIZIZ(), "raw"));
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                }
                if (jSONObject != null) {
                    return jSONObject;
                }
            }
        }
        String.valueOf(url);
        return null;
    }

    public final void LJJIJIIJIL(android.net.Uri schema) {
        String authority;
        String builder;
        String queryParameter;
        o.LJIIJ(schema, "schema");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String authority2 = schema.getAuthority();
            if (authority2 == null || (authority = (String) ORZ.LJLLLL(s.LJLJJL(authority2, new String[]{"_"}, 0, 6))) == null) {
                authority = schema.getAuthority();
            }
            if (authority == null) {
                return;
            }
            int hashCode = authority.hashCode();
            if (hashCode != -1772600516) {
                if (hashCode != -1377934078) {
                    if (hashCode == 1224424441 && authority.equals("webview") && (queryParameter = UriProtector.getQueryParameter(schema, "url")) != null) {
                        Uri.Builder buildUpon = UriProtector.parse(queryParameter).buildUpon();
                        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(schema);
                        o.LJFF(queryParameterNames, "schema.queryParameterNames");
                        for (String str : queryParameterNames) {
                            if (!o.LJ(str, "url")) {
                                buildUpon.appendQueryParameter(str, UriProtector.getQueryParameter(schema, str));
                            }
                        }
                        builder = buildUpon.toString();
                    }
                    return;
                }
                if (authority.equals("bullet") && (builder = UriProtector.getQueryParameter(schema, "url")) != null) {
                    if (ujb.o.LJJJLIIL(builder, "lynxview", false)) {
                        android.net.Uri uri = UriProtector.parse(builder);
                        o.LJFF(uri, "uri");
                        String path = uri.getPath();
                        if (path == null || path.length() == 0) {
                            Uri.Builder buildUpon2 = UriProtector.parse(UriProtector.getQueryParameter(uri, "surl")).buildUpon();
                            java.util.Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(uri);
                            o.LJFF(queryParameterNames2, "uri.queryParameterNames");
                            for (String str2 : queryParameterNames2) {
                                if (!o.LJ(str2, "surl")) {
                                    buildUpon2.appendQueryParameter(str2, UriProtector.getQueryParameter(uri, str2));
                                }
                            }
                            builder = buildUpon2.toString();
                        } else {
                            Uri.Builder buildUpon3 = uri.buildUpon();
                            buildUpon3.authority("prefetch").path(o.LJIILLIIL(uri.getPath(), uri.getHost()));
                            builder = buildUpon3.toString();
                        }
                    } else {
                        if (!ujb.o.LJJJLIIL(builder, "http", false) && !ujb.o.LJJJLIIL(builder, "https", false)) {
                            return;
                        }
                        this.LJLJJI.LIZJ(builder);
                        C39973FmT.LIZIZ(this, "start prefetch:" + builder + ", with time cost:" + (System.currentTimeMillis() - currentTimeMillis), null, null, 6);
                    }
                }
                return;
            }
            if (!authority.equals("lynxview")) {
                return;
            }
            String queryParameter2 = UriProtector.getQueryParameter(schema, "channel");
            String queryParameter3 = UriProtector.getQueryParameter(schema, "bundle");
            if ((queryParameter2 == null || queryParameter2.length() == 0) && (queryParameter3 == null || queryParameter3.length() == 0)) {
                Uri.Builder buildUpon4 = UriProtector.parse(UriProtector.getQueryParameter(schema, "surl")).buildUpon();
                java.util.Set<String> queryParameterNames3 = UriProtector.getQueryParameterNames(schema);
                o.LJFF(queryParameterNames3, "schema.queryParameterNames");
                for (String str3 : queryParameterNames3) {
                    if (!o.LJ(str3, "surl")) {
                        buildUpon4.appendQueryParameter(str3, UriProtector.getQueryParameter(schema, str3));
                    }
                }
                builder = buildUpon4.toString();
            } else {
                Uri.Builder builder2 = new Uri.Builder();
                Uri.Builder authority3 = builder2.scheme("lynxview").authority("prefetch");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(queryParameter2);
                LIZ.append('/');
                LIZ.append(queryParameter3);
                authority3.path(X1D.LIZIZ(LIZ));
                java.util.Set<String> queryParameterNames4 = UriProtector.getQueryParameterNames(schema);
                o.LJFF(queryParameterNames4, "schema.queryParameterNames");
                for (String str4 : queryParameterNames4) {
                    if ((!o.LJ(str4, "channel")) && (!o.LJ(str4, "bundle"))) {
                        builder2.appendQueryParameter(str4, UriProtector.getQueryParameter(schema, str4));
                    }
                }
                builder = builder2.toString();
            }
            if (builder == null) {
                return;
            }
            this.LJLJJI.LIZJ(builder);
            C39973FmT.LIZIZ(this, "start prefetch:" + builder + ", with time cost:" + (System.currentTimeMillis() - currentTimeMillis), null, null, 6);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC60260Nku
    public final C37017Eft LJJII(F3T providerFactory, String str) {
        o.LJIIJ(providerFactory, "providerFactory");
        if (str == null) {
            str = this.LJLJJL;
        }
        return new C37017Eft(str, this, providerFactory, this.LJLJJI);
    }
}
