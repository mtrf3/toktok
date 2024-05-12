package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Uhn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77903Uhn {
    public final Object LIZ;
    public final Object LIZIZ;

    public C77903Uhn(int i) {
        String str;
        if (i != 2) {
            this.LIZ = new HashMap();
            HashMap hashMap = new HashMap();
            this.LIZIZ = hashMap;
            C28828BTc c28828BTc = C28828BTc.LIZIZ;
            hashMap.put("http", c28828BTc);
            hashMap.put("https", c28828BTc);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser != null) {
            str = currentUser.getNickname();
        } else {
            str = null;
        }
        LIZ.append(str);
        this.LIZ = X1D.LIZIZ(LIZ);
        BDDateFormat bDDateFormat = new BDDateFormat("M/D/YYYY");
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        this.LIZIZ = bDDateFormat.LIZIZ(currentTimeMillis, locale);
    }

    public final void LIZJ(BTZ absLiveSchemaHandler) {
        o.LJIIIZ(absLiveSchemaHandler, "absLiveSchemaHandler");
        Iterator<String> it = absLiveSchemaHandler.LIZIZ().iterator();
        while (it.hasNext()) {
            ((java.util.Map) this.LIZ).put(it.next(), absLiveSchemaHandler);
        }
    }

    public /* synthetic */ C77903Uhn(C40372Fsu c40372Fsu) {
        this.LIZIZ = "webview";
        this.LIZ = c40372Fsu;
    }

    public final void LIZLLL(Activity activity, android.net.Uri uri) {
        android.net.Uri parse;
        String queryParameter = UriProtector.getQueryParameter(uri, "gd_label");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "utm_source");
        String host = uri.getHost();
        if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.equals(host, "webview") && UriProtector.getQueryParameter(uri, "url") != null && (parse = UriProtector.parse(UriProtector.getQueryParameter(uri, "url"))) != null) {
            queryParameter = UriProtector.getQueryParameter(parse, "gd_label");
            queryParameter2 = UriProtector.getQueryParameter(parse, "utm_source");
        }
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra("al_applink_data")) {
            C40372Fsu c40372Fsu = (C40372Fsu) this.LIZ;
            c40372Fsu.getClass();
            c40372Fsu.LIZ = "link_direct";
            C40372Fsu c40372Fsu2 = (C40372Fsu) this.LIZ;
            c40372Fsu2.getClass();
            c40372Fsu2.LIZIZ = "fb";
            C40372Fsu c40372Fsu3 = (C40372Fsu) this.LIZ;
            c40372Fsu3.getClass();
            c40372Fsu3.LIZLLL = "facebook";
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            C40372Fsu c40372Fsu4 = (C40372Fsu) this.LIZ;
            c40372Fsu4.getClass();
            o.LJIIIZ(queryParameter, "<set-?>");
            c40372Fsu4.LIZ = queryParameter;
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            C40372Fsu c40372Fsu5 = (C40372Fsu) this.LIZ;
            c40372Fsu5.getClass();
            o.LJIIIZ(queryParameter2, "<set-?>");
            c40372Fsu5.LIZLLL = queryParameter2;
            return;
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "params_url");
        if (TextUtils.isEmpty(queryParameter3)) {
            return;
        }
        String queryParameter4 = UriProtector.getQueryParameter(UriProtector.parse(queryParameter3), "utm_source");
        if (TextUtils.isEmpty(queryParameter4)) {
            return;
        }
        C40372Fsu c40372Fsu6 = (C40372Fsu) this.LIZ;
        c40372Fsu6.getClass();
        o.LJIIIZ(queryParameter4, "<set-?>");
        c40372Fsu6.LIZLLL = queryParameter4;
    }

    public final boolean LIZIZ(Context context, android.net.Uri uri, boolean z, java.util.Map map) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uri, "uri");
        String host = uri.getHost();
        BTZ btz = (BTZ) ((java.util.Map) this.LIZ).get(host);
        if (btz != null && btz.LIZ(uri) && btz.LIZJ(context, C78949Uyf.LJJIJIIJI(btz, uri, map), map)) {
            C12500eM.LIZ(uri, "handler_path_live");
            return true;
        }
        if (z) {
            String scheme = uri.getScheme();
            BTZ btz2 = (BTZ) ((java.util.Map) this.LIZIZ).get(host);
            if ((btz2 != null || (btz2 = (BTZ) ((java.util.Map) this.LIZIZ).get(scheme)) != null) && btz2.LIZ(uri) && btz2.LIZJ(context, C78949Uyf.LJJIJIIJI(btz2, uri, map), map)) {
                C12500eM.LIZ(uri, "handler_path_live");
                return true;
            }
            if (((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(context, uri.toString(), new Bundle())) {
                return true;
            }
        }
        return false;
    }

    public static TextStickerData LIZ(Activity activity, String str, float f, float f2, float f3, Integer num) {
        TextStickerData textStickerData = new TextStickerData(str, 1, -1, 2, UYR.LIZ(2, false), null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
        textStickerData.setScale(f3);
        textStickerData.setX(f);
        textStickerData.setY(f2);
        textStickerData.setEditCenterPoint(new Point(C170576mj.LIZJ(activity) / 2, C170576mj.LIZIZ(activity) / 2));
        textStickerData.setTextWrapList(C47261Igj.LJJIJ(C68W.LIZJ(C68W.LJIILJJIL(textStickerData, activity))));
        if (num != null) {
            textStickerData.setFontSize(num.intValue());
        }
        return textStickerData;
    }
}
