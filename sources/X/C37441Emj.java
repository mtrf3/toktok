package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Settings;
import com.google.gson.m;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Emj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37441Emj {
    public C37463En5 LIZJ;
    public InterfaceC37599EpH LIZLLL;
    public BQ6<m> LJ;
    public boolean LJFF;
    public java.util.Map<String, ?> LJIIIIZZ;
    public String LIZ = "";
    public String LIZIZ = "";
    public boolean LJI = true;
    public String LJII = "";

    public final C37561Eof LIZ() {
        android.net.Uri uri;
        android.net.Uri parse;
        String scheme;
        String encodedAuthority;
        List<String> list;
        String str;
        if (!Settings.LIZ().isWorkerEnabled || TextUtils.isEmpty(this.LIZIZ)) {
            return null;
        }
        if (!TextUtils.isEmpty(this.LIZ)) {
            uri = UriProtector.parse(this.LIZ);
        } else {
            uri = this.LIZJ.LJ;
        }
        if (!this.LIZIZ.startsWith("javascript:")) {
            String str2 = this.LIZIZ;
            if (str2 != null && (parse = UriProtector.parse(str2)) != null) {
                List<String> it = parse.getPathSegments();
                o.LJFF(it, "it");
                if ((!it.isEmpty()) && (((scheme = parse.getScheme()) != null || (uri != null && (scheme = uri.getScheme()) != null)) && ((encodedAuthority = parse.getEncodedAuthority()) != null || (uri != null && (encodedAuthority = uri.getEncodedAuthority()) != null)))) {
                    if (o.LJ(ORZ.LJLLJ(it), ".")) {
                        if (uri == null || (list = uri.getPathSegments()) == null) {
                            list = C61878OQg.INSTANCE;
                        }
                        if (uri == null || (str = uri.getPath()) == null) {
                            str = "";
                        }
                        if (!s.LJJL(str, '/')) {
                            list = ORZ.LJLJL(1, list);
                        }
                        it = ORZ.LLIIIZ(ORZ.LJLJJLL(it, 1), list);
                    }
                    String LLD = ORZ.LLD(it, "/", null, null, null, 62);
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme(scheme);
                    builder.encodedAuthority(encodedAuthority);
                    builder.encodedQuery(parse.getEncodedQuery());
                    builder.path(LLD);
                    android.net.Uri build = builder.build();
                    if (build != null) {
                        this.LIZIZ = build.toString();
                    }
                }
            }
            return null;
        }
        C37463En5 c37463En5 = this.LIZJ;
        if (c37463En5 == null) {
            return null;
        }
        InterfaceC37599EpH interfaceC37599EpH = this.LIZLLL;
        if (interfaceC37599EpH == null) {
            interfaceC37599EpH = c37463En5.LJIIIIZZ;
        }
        C37449Emr c37449Emr = new C37449Emr(EnumC37404Em8.Worker, c37463En5, c37463En5.LJI);
        C37463En5 c37463En52 = this.LIZJ;
        try {
            return new C37561Eof(c37463En52, this.LJII, this.LIZIZ, uri, interfaceC37599EpH, c37449Emr, c37463En52.LJIIIZ, this.LJ, this.LJFF, this.LJI, this.LJIIIIZZ);
        } catch (Throwable unused) {
            return null;
        }
    }
}
