package com.ss.android.ugc.aweme.fe.method;

import X.C03880Dg;
import X.C05L;
import X.C16880lQ;
import X.C38049EwX;
import X.C38352F3k;
import X.C39519Ff9;
import X.C40537FvZ;
import X.C64734Pas;
import X.C65300Pk0;
import X.C84261X5d;
import X.DialogC25756A8y;
import X.FX8;
import X.InterfaceC36488ETs;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenPDFMethod extends BaseCommonJavaMethod {
    public OpenPDFMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenPDFMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        Uri parse;
        String cookie;
        List<String> list = null;
        if (jSONObject == null || (str = jSONObject.optString("url")) == null) {
            str = "";
        }
        Context context = this.mContextRef.get();
        if (context != null && C16880lQ.LLLLL(context) != null) {
            StringBuilder LIZ = X1D.LIZ();
            String LIZJ = C38352F3k.LIZJ(str);
            o.LJIIIIZZ(LIZJ, "md5Hex(url)");
            String substring = LIZJ.substring(8, 24);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            LIZ.append(".pdf");
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLIIJLIL(context).getAbsolutePath());
            LIZ2.append("jsbdownload");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
            dialogC25756A8y.LIZIZ(R.string.h30);
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str) && (parse = UriProtector.parse(str)) != null && parse.getHost() != null) {
                String host = parse.getHost();
                o.LJI(host);
                String LIZLLL = FX8.LIZLLL(host);
                if (LIZLLL != null) {
                    try {
                        list = C64734Pas.LJIIIZ(C16880lQ.LLLLL(context)).LIZLLL(NetworkUtils.getShareCookieHost());
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    o.LJI(list);
                    if (list.contains(LIZLLL)) {
                        CookieManager cookieManager = CookieManager.getInstance();
                        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "2395923257504307780"));
                        if (LIZJ2.LIZ) {
                            cookie = (String) LIZJ2.LIZIZ;
                        } else {
                            cookie = cookieManager.getCookie(str);
                        }
                        arrayList.add(new HttpHeader("Cookie", cookie));
                    }
                }
            }
            DownloadTask with = C84261X5d.with(C16880lQ.LLLLL(context));
            with.extraHeaders(arrayList);
            with.url(str);
            with.name(LIZIZ);
            with.savePath(LIZIZ2);
            with.retryCount(0);
            with.mainThreadListener(new C40537FvZ(dialogC25756A8y, LIZIZ2, LIZIZ, context));
            with.download();
            return;
        }
        C05L.LIZLLL(context, R.string.rf3);
    }
}
