package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N8G extends QQE<C68922R3e> {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ JSONObject LJ;
    public final /* synthetic */ View LJFF;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJI;

    @Override // X.QQE
    public final void onResponse(C68922R3e c68922R3e) {
        int i;
        JSONArray names;
        String jSONArray;
        String str;
        int i2;
        String optString;
        int i3 = 0;
        String str2 = "2";
        String str3 = "";
        String str4 = "1";
        String str5 = null;
        if (this.LIZ) {
            if (!this.LIZIZ) {
                JSONObject jSONObject = NAW.LJI;
                if (jSONObject == null || (str = jSONObject.optString("cid")) == null) {
                    str = "";
                }
                JSONObject jSONObject2 = NAW.LJI;
                if (jSONObject2 != null && (optString = jSONObject2.optString("log_extra")) != null) {
                    str3 = optString;
                }
                C58655N0h LJ = C58704N2e.LJ("ad_wap_stat", "save_info_agree", str, str3, null);
                LJ.LIZJ("autofill", "refer");
                LJ.LIZIZ(NAW.LJFF, "url");
                if (this.LIZJ) {
                    str2 = "1";
                }
                LJ.LIZIZ(str2, "type");
                LJ.LIZIZ(this.LIZLLL, "autofill_fields");
                if (c68922R3e != null && c68922R3e.LIZIZ) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C0JU.LIZJ(i2, LJ, "save_status");
            }
            i = R.string.q_e;
        } else {
            if (!this.LIZIZ) {
                HashMap hashMap = new HashMap();
                if (this.LIZJ) {
                    str2 = "1";
                }
                hashMap.put("type", str2);
                JSONObject jSONObject3 = this.LJ;
                if (jSONObject3 != null && (names = jSONObject3.names()) != null && (jSONArray = names.toString()) != null) {
                    str3 = jSONArray;
                }
                hashMap.put("autofill_fields", str3);
                if (c68922R3e == null || !c68922R3e.LIZIZ) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("save_status", str4);
                FMX.LJIIL("save_info_agree_userinfo", hashMap);
            }
            if (this.LIZJ) {
                i = R.string.q8k;
            } else {
                i = R.string.efy;
            }
        }
        if (c68922R3e != null && c68922R3e.LIZIZ) {
            JSONObject jSONObject4 = this.LJ;
            if (jSONObject4 != null) {
                JSONObject LIZ = NAW.LIZ(jSONObject4);
                if (LIZ != null) {
                    str5 = LIZ.toString();
                }
                NAW.LJIILIIL(str5);
                if (!this.LIZ) {
                    N8D.LJFF = true;
                }
            }
            if (!this.LIZIZ) {
                C26045AKb c26045AKb = new C26045AKb(this.LJFF);
                c26045AKb.LJIIIIZZ(i);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIJ();
            }
        } else if (!this.LIZIZ) {
            C26045AKb c26045AKb2 = new C26045AKb(this.LJFF);
            c26045AKb2.LJIIIIZZ(R.string.q_d);
            c26045AKb2.LIZ(true);
            c26045AKb2.LJIIJ();
        }
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJI;
        if (interfaceC88472Yns != null) {
            if (c68922R3e != null && c68922R3e.LIZIZ) {
                i3 = 1;
            }
            interfaceC88472Yns.invoke(Integer.valueOf(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N8G(boolean z, boolean z2, boolean z3, String str, JSONObject jSONObject, View view, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = str;
        this.LJ = jSONObject;
        this.LJFF = view;
        this.LJI = interfaceC88472Yns;
    }
}
