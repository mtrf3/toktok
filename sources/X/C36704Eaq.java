package X;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eaq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36704Eaq {
    public static ArrayList<String> LIZ;
    public static final HashMap<String, ArrayList<C36705Ear>> LIZIZ = new HashMap<>();

    static {
        List<String> list;
        LIZ = new ArrayList<>();
        try {
            list = C2YJ.LIZIZ.LIZ.getApiAlogWhiteList();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            list = null;
        }
        if (C79004UzY.LJJIFFI(list)) {
            ArrayList<String> arrayList = LIZ;
            String[] stringArray = EF7.LIZIZ().getResources().getStringArray(R.array.a6);
            o.LJIIIIZZ(stringArray, "AppContextManager.getApp…gacy_api_alog_white_list)");
            ORS.LJJLIIIJJIZ(arrayList, stringArray);
            return;
        }
        o.LJII(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        LIZ = (ArrayList) list;
    }

    public static void LIZIZ() {
        try {
            Iterator<Map.Entry<String, ArrayList<C36705Ear>>> it = LIZIZ.entrySet().iterator();
            while (it.hasNext()) {
                ArrayList<C36705Ear> value = it.next().getValue();
                if (!C79004UzY.LJJIFFI(value)) {
                    Iterator<C36705Ear> it2 = value.iterator();
                    while (it2.hasNext()) {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Network", it2.next().toString());
                    }
                }
            }
            LIZIZ.clear();
            new Handler().postDelayed(RunnableC38920FPg.LJLIL, 60000L);
            PKQ.LJIIIIZZ(true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", EUF.LIZ());
            C09900aA.LJI("rig_feedback", jSONObject, null, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String url, C64797Pbt res) {
        BaseResponse baseResponse;
        EJ6 ej6;
        String str;
        String str2;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(res, "res");
        android.net.Uri parse = UriProtector.parse(url);
        if (TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "device_id")) || TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "aid"))) {
            return;
        }
        String path = parse.getPath();
        T t = res.LIZIZ;
        Integer num = null;
        if (t instanceof BaseResponse) {
            baseResponse = (BaseResponse) t;
        } else {
            baseResponse = null;
        }
        List<EJ6> list = res.LIZ.LIZLLL;
        o.LJIIIIZZ(list, "res.headers()");
        Iterator<EJ6> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                ej6 = it.next();
                if (o.LJ(ej6.LIZ, "x-tt-logid")) {
                    break;
                }
            } else {
                ej6 = null;
                break;
            }
        }
        EJ6 ej62 = ej6;
        if (ej62 != null) {
            str = ej62.LIZIZ;
        } else {
            str = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("code=");
        LIZ2.append(res.LIZ.LIZIZ);
        LIZ2.append(" reason=");
        C36910EeA c36910EeA = res.LIZ;
        if (c36910EeA != null) {
            str2 = c36910EeA.LIZJ;
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        LIZ2.append(" status_code=");
        if (baseResponse != null) {
            num = Integer.valueOf(baseResponse.status_code);
        }
        LIZ2.append(num);
        LIZ2.append(" path=");
        LIZ2.append(path);
        LIZ2.append(" log_id=");
        LIZ2.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("API_URL_HEADER", X1D.LIZIZ(LIZ2));
    }
}
