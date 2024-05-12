package X;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class M5R {
    public String LIZ = "";
    public boolean LIZIZ;

    public abstract OSZ<Boolean, String> LIZ(M5X m5x, HashMap<String, Object> hashMap);

    public static void LIZIZ(android.net.Uri uri, M5X m5x, HashMap appendedMap) {
        String queryParameter;
        String str;
        String str2;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(appendedMap, "appendedMap");
        Intent intent = m5x.LJLJI;
        C40372Fsu c40372Fsu = m5x.LJLJJLL;
        android.net.Uri uri2 = m5x.LJLILLLLZI;
        HashMap hashMap = new HashMap();
        String scheme = uri2.getScheme();
        String host = uri2.getHost();
        String str3 = "";
        if (scheme != null && host != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "from_token");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            hashMap.put("from_token", LLJJIJIIJIL);
            if (TextUtils.isEmpty(UriProtector.getQueryParameter(uri2, "enter_from"))) {
                if (TextUtils.equals("token", C16880lQ.LLJJIJIIJIL(intent, "enter_from"))) {
                    hashMap.put("enter_from", "token");
                } else {
                    Object obj = m5x.LJLJJL.get("is_from_notification");
                    if (obj != null && ((Boolean) obj).booleanValue()) {
                        str2 = "push";
                    } else {
                        str2 = "deeplink";
                    }
                    hashMap.put("enter_from", str2);
                }
            }
            if (intent != null) {
                if (!C38586FCk.LIZIZ() && !intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                    String queryParameter2 = UriProtector.getQueryParameter(uri2, "tab_index");
                    try {
                        o.LJI(queryParameter2);
                        Integer valueOf = CastIntegerProtector.valueOf(queryParameter2);
                        InterfaceC53762L8c.LIZ.getClass();
                        str = C53802L9q.LIZ(valueOf);
                    } catch (Exception unused) {
                        str = "";
                    }
                    if ((!o.LJ("aweme", host) || !o.LJ("click_push_newvideo", UriProtector.getQueryParameter(uri2, "gd_label")) || !TextUtils.equals(str, "DISCOVER")) && !TextUtils.isEmpty(str)) {
                        hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", str);
                    }
                    hashMap.put("is_from_push", 1);
                }
                if (UriProtector.getQueryParameter(uri2, "backurl") != null) {
                    hashMap.put("backurl", "backUrl");
                }
            }
            FWS.LIZ().LIZ = false;
            if (intent != null && (queryParameter = UriProtector.getQueryParameter(uri2, "trigger_by")) != null) {
                intent.putExtra("trigger_by", queryParameter);
            }
            String queryParameter3 = UriProtector.getQueryParameter(uri2, "gd_label");
            if (queryParameter3 != null && ujb.o.LJJJLIIL(queryParameter3, "click_wap", false)) {
                hashMap.put("ads_app_activity_by_wap_click", Boolean.TRUE);
            }
            appendedMap.putAll(hashMap);
        }
        Object obj2 = m5x.LJLJJL.get("is_from_notification");
        if (obj2 != null) {
            appendedMap.put("from_notification", obj2);
        }
        Object obj3 = m5x.LJLJJL.get("notification_id");
        if (obj3 != null) {
            appendedMap.put("from_notification_uuid", obj3);
        }
        Object obj4 = m5x.LJLJJL.get("rule_id");
        if (obj4 != null) {
            appendedMap.put("rule_id", obj4);
        }
        if (C16880lQ.LLJJIJIIJIL(intent, "share_url_user_id") != null) {
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "share_url_user_id");
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = "";
            }
            c40372Fsu.getClass();
            c40372Fsu.LJFF = LLJJIJIIJIL2;
        } else if (C16880lQ.LLJJIJIIJIL(intent, "share_sec_url_user_id") != null) {
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "share_sec_url_user_id");
            if (LLJJIJIIJIL3 == null) {
                LLJJIJIIJIL3 = "";
            }
            c40372Fsu.getClass();
            c40372Fsu.LJFF = LLJJIJIIJIL3;
        }
        if (C16880lQ.LLJJIJIIJIL(intent, "share_url_link_id") != null) {
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "share_url_link_id");
            if (LLJJIJIIJIL4 != null) {
                str3 = LLJJIJIIJIL4;
            }
            c40372Fsu.getClass();
            c40372Fsu.LJI = str3;
        }
        ComponentName component = intent.getComponent();
        o.LJI(component);
        String className = component.getClassName();
        o.LJIIIIZZ(className, "intent.component!!.className");
        C38586FCk.LIZLLL(uri, className);
    }
}
