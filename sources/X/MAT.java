package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import ujb.o;

/* loaded from: classes10.dex */
public final class MAT extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        String str;
        Serializable serializable;
        String str2;
        C35767E1z c35767E1z;
        java.util.Map<String, String> map;
        String str3 = "";
        if (intent == null || (str = C16880lQ.LLJJIJIIJIL(intent, "report_event_name")) == null) {
            str = "";
        }
        if (intent != null) {
            serializable = intent.getSerializableExtra("report_event_data");
        } else {
            serializable = null;
        }
        if (o.LJJJJJL(str) || serializable == null) {
            return;
        }
        int i = -1;
        if (intent != null) {
            i = intent.getIntExtra("widgetId", -1);
        }
        if (context != null) {
            str2 = C40683Fxv.LIZIZ(i, context);
        } else {
            str2 = null;
        }
        if (!(serializable instanceof C35767E1z) || (c35767E1z = (C35767E1z) serializable) == null || (map = c35767E1z.getMap()) == null || map.isEmpty()) {
            return;
        }
        if (str2 != null) {
            str3 = str2;
        }
        map.put("widget_added_position", str3);
        if (kotlin.jvm.internal.o.LJ(str, "trending_show")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("search_position", "search_widget");
            c188727au.LJIIIZ("words_source", "widget_recom_search");
            c188727au.LJIIIZ("widget_type", "recom_word_with_default");
            c188727au.LJIIIZ("add_widget_type", MA8.LIZ("recom_word_with_default"));
            c188727au.LJIIIIZZ(map);
            FMX.LJIIL("trending_show", c188727au.LIZ);
            return;
        }
        if (!kotlin.jvm.internal.o.LJ(str, "trending_words_show")) {
            return;
        }
        MAC.LJIIIIZZ(null, "recom_word_with_default", "widget_recom_search", map);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
