package com.ss.android.ugc.aweme.deeplink;

import X.C36910EeA;
import X.C38354F3m;
import X.C38586FCk;
import X.C38588FCm;
import X.C38758FJa;
import X.C39176FZc;
import X.C43288Gyq;
import X.C48153Iv7;
import X.C56235M5f;
import X.C56237M5h;
import X.C56243M5n;
import X.C56244M5o;
import X.C56246M5q;
import X.C56249M5t;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C64797Pbt;
import X.C73411SrX;
import X.C78847Ux1;
import X.CU2;
import X.E7L;
import X.EJ6;
import X.InterfaceC37276Ek4;
import X.M5K;
import X.M5X;
import X.M63;
import X.M6A;
import X.M6Y;
import Y.AfS61S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.api.IDeepLinkApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DeepLinkServiceImpl implements IDeepLinkService {
    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LIZIZ() {
        return DeepLinkHandlerActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJII() {
        C56246M5q.LIZ = null;
        C56246M5q.LIZIZ = false;
        C56246M5q.LJ = null;
        C73411SrX c73411SrX = C56246M5q.LIZJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIJ() {
        return AppLinkHandler.class;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIL() {
        return AppLinkHandlerV2.class;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJIIZILJ() {
        return DeepLinkActivityV2.class;
    }

    public static IDeepLinkService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IDeepLinkService.class, false);
        if (LIZ != null) {
            return (IDeepLinkService) LIZ;
        }
        if (C58096Mr6.q == null) {
            synchronized (IDeepLinkService.class) {
                if (C58096Mr6.q == null) {
                    C58096Mr6.q = new DeepLinkServiceImpl();
                }
            }
        }
        return C58096Mr6.q;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIIIZ() {
        return AppLinkHandlerV2.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILL() {
        return DeepLinkActivityV2.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIJJ() {
        return DeepLinkHandlerActivity.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIIJJI() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("deeplink_webview_back_to_main_page", true);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String getCustomScheme() {
        return C56243M5n.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILLIIL() {
        return "snssdk";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final long LJJI() {
        return C56235M5f.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LIZJ(String scheme) {
        o.LJIIIZ(scheme, "scheme");
        if (!C38354F3m.LJ(scheme)) {
            if (!o.LJ("sslocal", scheme)) {
                String LIZ = C56243M5n.LIZ();
                if (C38354F3m.LJ(LIZ) || !o.LJ(LIZ, scheme)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return context instanceof DeepLinkActivityV2;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJFF(Context context) {
        o.LJIIIZ(context, "context");
        if (context instanceof DeepLinkHandlerActivity) {
            String str = ((DeepLinkHandlerActivity) context).LJLJJL;
            o.LJIIIIZZ(str, "context.mFromNotificationId");
            return str;
        }
        if (context instanceof DeepLinkActivityV2) {
            DeepLinkActivityV2 deepLinkActivityV2 = (DeepLinkActivityV2) context;
            if (deepLinkActivityV2.LLFII().LJLJJL.get("notification_id") instanceof String) {
                Object obj = deepLinkActivityV2.LLFII().LJLJJL.get("notification_id");
                o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                return (String) obj;
            }
            return "";
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJI(String str) {
        return C56243M5n.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIIIIZZ(Uri uri) {
        o.LJIIIZ(uri, "uri");
        return C38758FJa.LIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIILJJIL(String url) {
        o.LJIIIZ(url, "url");
        if (C38354F3m.LJ(url)) {
            return url;
        }
        try {
            String scheme = UriProtector.parse(url).getScheme();
            String LIZ = C56243M5n.LIZ();
            if (!o.LJ("sslocal", scheme) && !o.LJ("localsdk", scheme)) {
                return url;
            }
            url = ujb.o.LJJJJZ(url, scheme, LIZ, false);
            return url;
        } catch (Exception unused) {
            return url;
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIJ(Uri uri) {
        return C38586FCk.LIZJ(uri);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:5:0x0067). Please report as a decompilation issue!!! */
    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJIJJLI(String url) {
        String str;
        C36910EeA c36910EeA;
        int i;
        o.LJIIIZ(url, "url");
        Uri parse = UriProtector.parse(url);
        o.LJIIIIZZ(parse, "parse(url)");
        if (C38588FCm.LIZIZ(parse)) {
            str = E7L.LIZ.transUrlCall(url).execute().LIZIZ.longUrl;
        } else {
            C48153Iv7 c48153Iv7 = new C48153Iv7();
            c48153Iv7.LJIILIIL = false;
            c48153Iv7.LJIIIZ = true;
            InterfaceC37276Ek4<TypedInput> fetchLongUrl = ((IDeepLinkApi) RetrofitFactory.LIZLLL().create(url).create(IDeepLinkApi.class)).fetchLongUrl(url, c48153Iv7);
            C64797Pbt<TypedInput> execute = fetchLongUrl.execute();
            if (execute != null && (i = (c36910EeA = execute.LIZ).LIZIZ) >= 300 && i < 400) {
                List<EJ6> list = c36910EeA.LIZLLL;
                o.LJIIIIZZ(list, "response.headers()");
                str = C38588FCm.LIZ(list);
                try {
                    fetchLongUrl.cancel();
                } catch (Throwable unused) {
                }
            }
            str = "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean isDeepLinkHandlerActivity(Context context) {
        o.LJIIIZ(context, "context");
        return context instanceof DeepLinkHandlerActivity;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJIILIIL(String str, String str2) {
        return M5K.LJIIIIZZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJIJI(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        C39176FZc.LIZIZ(activity, str, true);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJ(String tag, String extraResult) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(extraResult, "extraResult");
        M6A.LIZ.onNext(new M63(tag, extraResult));
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJII(M5X m5x, CU2 config) {
        C56249M5t c56249M5t;
        o.LJIIIZ(config, "config");
        C56246M5q.LIZLLL = config;
        C56246M5q.LJ = m5x;
        if (!C56246M5q.LIZIZ) {
            C62822Ol8 c62822Ol8 = C56246M5q.LJFF;
            ((M6Y) c62822Ol8.getValue()).LIZIZ("before_init_process_link_node");
            if (C56246M5q.LIZ == null) {
                C56246M5q.LIZ = new C56237M5h(C56246M5q.LIZLLL);
                C56246M5q.LIZIZ = true;
            }
            C56244M5o action = C56244M5o.LJLIL;
            o.LJIIIZ(action, "action");
            C56246M5q.LIZJ = (C73411SrX) M6A.LIZ.LJJJJZI(new AfS61S0100000_9(action, 81));
            ((M6Y) c62822Ol8.getValue()).LIZIZ("after_init_process_link_node");
        }
        C56237M5h c56237M5h = C56246M5q.LIZ;
        if (c56237M5h != null && (c56249M5t = (C56249M5t) c56237M5h.LIZIZ) != null) {
            c56249M5t.LIZIZ(m5x, c56249M5t);
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJ(Activity activity, String minAppVersion, String uriToGo) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(minAppVersion, "minAppVersion");
        o.LJIIIZ(uriToGo, "uriToGo");
        C43288Gyq.LIZ().getClass();
        return C43288Gyq.LIZIZ(activity, minAppVersion, uriToGo);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJIL(String str, String str2, boolean z) {
        C78847Ux1.LJJJJLL(str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIFFI(Activity activity, String str, boolean z) {
        Uri uri;
        o.LJIIIZ(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (C39176FZc.LIZ(uri)) {
            C39176FZc.LIZIZ(activity, str, z);
            return true;
        }
        return false;
    }
}
