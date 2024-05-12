package X;

import Y.ARunnableS12S1000000_6;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EMi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36296EMi {
    public static ArrayList<InterfaceC36298EMk> LIZ;
    public static volatile JSONObject LIZIZ;
    public static boolean LIZJ;
    public static final boolean LIZLLL = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);

    public static void LIZJ() {
        LIZJ = true;
        ArrayList<InterfaceC36298EMk> arrayList = LIZ;
        if (arrayList != null) {
            Iterator<InterfaceC36298EMk> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onFailed(new Exception("no data to show"));
            }
        }
        LIZ = null;
    }

    public static void LIZ() {
        String settingResponse = Keva.getRepo("TTSettingData").getString("settingData", "");
        if (TextUtils.isEmpty(settingResponse)) {
            LIZJ();
        } else {
            o.LJIIIIZZ(settingResponse, "settingResponse");
            C38995FSd.LIZIZ().submit(new ARunnableS12S1000000_6(settingResponse, 9));
        }
    }

    public static void LIZLLL() {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        ArrayList<InterfaceC36298EMk> arrayList = LIZ;
        if (arrayList != null) {
            Iterator<InterfaceC36298EMk> it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC36298EMk next = it.next();
                JSONObject jSONObject2 = LIZIZ;
                if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("data")) != null) {
                    jSONObject = optJSONObject.optJSONObject("app");
                } else {
                    jSONObject = null;
                }
                next.LIZIZ(jSONObject);
            }
        }
        LIZ = null;
    }

    public static void LJ(InterfaceC36298EMk interfaceC36298EMk) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = LIZIZ;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
            if (optJSONObject != null) {
                jSONObject = optJSONObject.optJSONObject("app");
            } else {
                jSONObject = null;
            }
            interfaceC36298EMk.LIZIZ(jSONObject);
            return;
        }
        if (LIZJ) {
            interfaceC36298EMk.onFailed(new Exception("no data to show"));
            return;
        }
        ArrayList<InterfaceC36298EMk> arrayList = LIZ;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        LIZ = arrayList;
        arrayList.add(interfaceC36298EMk);
    }

    public static void LIZIZ(TTSettingDataResponse tTSettingDataResponse, String str) {
        tTSettingDataResponse.getTtSettingData();
        LIZIZ = tTSettingDataResponse.getTtSettingDataJSONObject();
        Keva repo = Keva.getRepo("TTSettingData");
        if (!TextUtils.isEmpty(str)) {
            repo.storeString("settingData", str);
            repo.storeLong("last_get_setting_time", System.currentTimeMillis());
            LIZLLL();
        } else {
            String settingResponseFromKeva = repo.getString("settingData", "");
            if (TextUtils.isEmpty(settingResponseFromKeva)) {
                LIZJ();
            } else {
                o.LJIIIIZZ(settingResponseFromKeva, "settingResponseFromKeva");
                C38995FSd.LIZIZ().submit(new ARunnableS12S1000000_6(settingResponseFromKeva, 9));
            }
        }
    }
}
