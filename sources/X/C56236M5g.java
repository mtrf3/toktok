package X;

import Y.AfS54S0200000_5;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.api.IDeepLinkApi;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.M5g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56236M5g extends M6P {
    public android.net.Uri LIZ;
    public String LIZIZ;
    public final boolean LIZJ;
    public final Context LIZLLL;

    @Override // X.M6P
    public final android.net.Uri LIZ(android.net.Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        String LIZIZ = C025908h.LIZIZ(LIZ, "musically", "://", "shortlink", LIZ);
        int i = 0;
        if (C38588FCm.LIZIZ(uri)) {
            InterfaceC40375Fsx LJIILL = UgCommonServiceImpl.LJIJ().LJIILL();
            C56235M5f.LIZJ = System.currentTimeMillis();
            String shorUrl = uri.toString();
            o.LJIIIZ(shorUrl, "shorUrl");
            E7L.LIZ.transUrl(shorUrl).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C31129CJp(this, LJIILL, uri, i), new AfS54S0200000_5(LJIILL, uri, 72));
        } else {
            C56235M5f.LIZJ = System.currentTimeMillis();
            C48153Iv7 c48153Iv7 = new C48153Iv7();
            c48153Iv7.LJIILIIL = false;
            c48153Iv7.LJIIIZ = true;
            ((IDeepLinkApi) RetrofitFactory.LIZLLL().create(uri.toString()).create(IDeepLinkApi.class)).fetchLongUrl(uri.toString(), c48153Iv7).enqueue(new C40377Fsz(this, UgCommonServiceImpl.LJIJ().LJIILL(), uri));
        }
        return UriProtector.parse(LIZIZ);
    }

    public C56236M5g(Context context, boolean z) {
        this.LIZLLL = context;
        this.LIZJ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.net.Uri r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56236M5g.LIZJ(android.net.Uri, java.lang.String):void");
    }

    public final void LIZLLL(android.net.Uri uri, String str) {
        try {
            String queryParameter = UriProtector.getQueryParameter(uri, "backurl");
            android.net.Uri parse = UriProtector.parse(str);
            this.LIZIZ = UriProtector.getQueryParameter(parse, "user_id");
            Uri.Builder buildUpon = UriProtector.parse(parse.toString()).buildUpon();
            int i = 0;
            buildUpon.appendQueryParameter("convert_url", str.split("\\?")[0]);
            if (!TextUtils.isEmpty(queryParameter)) {
                buildUpon.appendQueryParameter("backurl", queryParameter);
            }
            android.net.Uri build = buildUpon.build();
            String[] LIZ = M5L.LIZ();
            while (true) {
                if (i >= LIZ.length) {
                    break;
                }
                if (LIZ[i].equals(build.getHost())) {
                    this.LIZ = new M6N().LIZ(build);
                    break;
                }
                i++;
            }
            if (this.LIZ == null) {
                this.LIZ = new OZ0().LIZ(build);
            }
        } catch (Exception e) {
            C56235M5f.LIZLLL(2004, uri, "short_2_long");
            C16880lQ.LLLLIIL(e);
        }
    }
}
