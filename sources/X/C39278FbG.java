package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.EcUgNewInstallService;
import com.ss.android.ugc.aweme.utils.AttributionInfoData;
import com.ss.android.ugc.aweme.utils.AttributionInfoResponse;
import com.ss.android.ugc.aweme.utils.UrlData;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.FbG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39278FbG implements InterfaceC116954iR<AttributionInfoResponse> {
    public final /* synthetic */ boolean LJLIL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    public C39278FbG(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.net.Uri] */
    @Override // X.InterfaceC116954iR
    public final void onNext(AttributionInfoResponse attributionInfoResponse) {
        String str;
        long j;
        String str2;
        UrlData urlData;
        AttributionInfoResponse attributionInfoResponse2 = attributionInfoResponse;
        o.LJIIIZ(attributionInfoResponse2, "attributionInfoResponse");
        int i = attributionInfoResponse2.errCode;
        AttributionInfoData attributionInfoData = attributionInfoResponse2.data;
        String str3 = "";
        if (attributionInfoData == null || (urlData = attributionInfoData.url) == null || (str = urlData.link) == null) {
            str = "";
        }
        long j2 = -1;
        if (attributionInfoData != null) {
            j = attributionInfoData.adsGroupId;
        } else {
            j = -1;
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("err_no", Integer.valueOf(i));
        c198517qh.LIZ.put("is_fallback", Boolean.valueOf(this.LJLIL));
        c198517qh.LIZ.put("url", str);
        if (i != 2) {
            j2 = j;
        }
        c198517qh.LIZ.put("adgroup_id", Long.valueOf(j2));
        FMX.LJIILJJIL("google_api_attribution_info", c198517qh.LJ());
        if (i != 2) {
            C39279FbH.LIZ = true;
            if (TextUtils.isEmpty(str)) {
                C39279FbH.LIZIZ(i, j, "", false);
                return;
            }
            C39279FbH.LIZIZ(i, j, str, true);
            EcUgNewInstallService.LIZLLL().LIZIZ(str);
            C68322mC c68322mC = new C68322mC();
            ?? parse = UriProtector.parse(str);
            c68322mC.element = parse;
            String scheme = parse.getScheme();
            String str4 = null;
            if (scheme != null) {
                Locale locale = Locale.US;
                str2 = C141415gn.LIZIZ(locale, "US", scheme, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (o.LJ("sslocal", str2) || o.LJ("localsdk", str2)) {
                String LJIILJJIL = M66.LIZIZ.LJIILJJIL(str);
                if (LJIILJJIL != null) {
                    str3 = LJIILJJIL;
                }
                str = str3;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ?? parse2 = UriProtector.parse(str);
            c68322mC.element = parse2;
            C39280FbI c39280FbI = C39276FbE.LIZ;
            c39280FbI.LIZIZ = parse2;
            c39280FbI.LIZJ = str2;
            c39280FbI.LIZLLL = false;
            if (!C38986FRu.LIZ().LIZ) {
                try {
                    str4 = UriProtector.getQueryParameter((android.net.Uri) c68322mC.element, "need_nuj_finish");
                } catch (Exception unused) {
                }
                if (o.LJ("1", str4)) {
                    c39280FbI.LJ = new C39277FbF(this, str2, c68322mC);
                    return;
                }
                C39281FbJ c39281FbJ = new C39281FbJ();
                c39281FbJ.LJLIL = c39280FbI.LIZ();
                C2U8.LIZ(c39281FbJ);
                return;
            }
            android.net.Uri uri = c39280FbI.LIZIZ;
            if (uri != null) {
                boolean equals = "normal".equals(UriProtector.getQueryParameter(uri, "awedp_require_login"));
                c39280FbI.LIZ = equals;
                if (equals) {
                    EventBus.LIZJ().LJIILJJIL(c39280FbI);
                    return;
                }
            }
            c39280FbI.LIZIZ();
            return;
        }
        C39279FbH.LIZIZ(i, j, "", false);
    }
}
