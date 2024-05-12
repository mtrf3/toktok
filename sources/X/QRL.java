package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.push.settings.PushOnlineSettings;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QRL implements QQS {
    public final /* synthetic */ C60016Ngy LJLIL;
    public final /* synthetic */ QRR LJLILLLLZI;
    public final /* synthetic */ C66970QQc LJLJI;

    @Override // X.QQS
    public final void LJII() {
    }

    @Override // X.QQS
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.QQS
    public final boolean LJ() {
        Application application = this.LJLILLLLZI.LIZ;
        if (C36929EeT.LJFF(application)) {
            if (((PushOnlineSettings) PT6.LIZ(this.LJLILLLLZI.LIZ, PushOnlineSettings.class)).LJJII()) {
                return true;
            }
            if (!((PushOnlineSettings) PT6.LIZ(this.LJLILLLLZI.LIZ, PushOnlineSettings.class)).LJ() || !PCH.LIZJ()) {
                return false;
            }
            return true;
        }
        SharedPreferences LIZIZ = F9J.LIZIZ(application, 0, "push_multi_process_config");
        if (LIZIZ.getBoolean("remove_auto_boot_v2", false)) {
            return true;
        }
        if (!LIZIZ.getBoolean("need_control_miui_flares_v2", true) || !PCH.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // X.QQS
    public final java.util.Map<String, String> LJIJJ() {
        return this.LJLJI.LIZ();
    }

    @Override // X.QQS
    public final boolean LJJJJJL() {
        QS5 LIZIZ = QRT.LIZJ(this.LJLILLLLZI.LIZ).LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.LIZLLL();
        }
        return true;
    }

    @Override // X.QQS
    public final String LJJJ() {
        return C16880lQ.LLIIIILZ();
    }

    @Override // X.QQS
    public final C60016Ngy LJIL() {
        return this.LJLIL;
    }

    @Override // X.QQS
    public final void LJIIIIZZ(Bundle bundle) {
        if (TextUtils.isEmpty("red_badge_show")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                jSONObject.put(str, C16880lQ.LLJJIII(bundle, str));
            }
        } catch (Throwable unused) {
        }
        if (this.LJLILLLLZI.LJIIJJI != null) {
            R39.LIZJ("red_badge_show", jSONObject);
        }
    }

    public QRL(QRR qrr, C60016Ngy c60016Ngy, C66970QQc c66970QQc) {
        this.LJLIL = c60016Ngy;
        this.LJLILLLLZI = qrr;
        this.LJLJI = c66970QQc;
    }

    @Override // X.QQS
    public final void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String jSONObject2;
        if (this.LJLILLLLZI.LJIIJJI != null) {
            if (QSB.LIZ()) {
                StringBuilder LIZLLL = C06540Nm.LIZLLL("onEvent: ", str, ", tag: ", str2, ", label: ");
                LIZLLL.append(str3);
                LIZLLL.append(", params: ");
                LIZLLL.append(jSONObject);
                X1D.LIZIZ(LIZLLL);
            }
            C73040SlY.LJIIIIZZ(context, str, str2, str3, j, j2, jSONObject);
            C40670Fxi c40670Fxi = new C40670Fxi();
            ((HashMap) c40670Fxi.LJLIL).put("count", String.valueOf(j));
            JSONObject LIZ = c40670Fxi.LIZ();
            if (LIZ == null) {
                LIZ = new JSONObject();
            }
            try {
                if (!TextUtils.isEmpty("show")) {
                    LIZ.put("service", "show");
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C09900aA.LJ("log_red_badge", LIZ);
            if (TextUtils.equals(str2, "red_badge") && j > 0) {
                MobClick LIZLLL2 = C1I1.LIZLLL("red_badge", "show");
                LIZLLL2.setValue(String.valueOf(j));
                FMX.onEvent(LIZLLL2);
                C38776FJs.LJIIL().LJIIIZ(context, "red_point_count", j);
            }
            try {
                if (TextUtils.equals(str2, "red_badge")) {
                    C40670Fxi c40670Fxi2 = new C40670Fxi();
                    ((HashMap) c40670Fxi2.LJLIL).put("label", str3);
                    ((HashMap) c40670Fxi2.LJLIL).put("category", str);
                    ((HashMap) c40670Fxi2.LJLIL).put("value", Long.valueOf(j));
                    ((HashMap) c40670Fxi2.LJLIL).put("ext_value", Long.valueOf(j2));
                    if (jSONObject == null) {
                        jSONObject2 = "";
                    } else {
                        jSONObject2 = jSONObject.toString();
                    }
                    ((HashMap) c40670Fxi2.LJLIL).put("ext_json", jSONObject2);
                    FUA.LIZJ(str2, c40670Fxi2.LIZ());
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }
}
