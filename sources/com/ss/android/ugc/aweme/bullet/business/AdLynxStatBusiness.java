package com.ss.android.ugc.aweme.bullet.business;

import X.C0JU;
import X.C113504cs;
import X.C58655N0h;
import X.C58687N1n;
import X.C58704N2e;
import X.C58764N4m;
import X.C58766N4o;
import X.C59284NOm;
import X.C59297NOz;
import X.C59472NVs;
import X.C59478NVy;
import X.C60726NsQ;
import X.C78685UuP;
import X.N5S;
import X.NAW;
import X.NOV;
import X.NOY;
import android.app.Activity;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.survey.AdLandPageSurveyServiceImpl;
import com.ss.android.ugc.aweme.log.AdLynxEventLoger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdLynxStatBusiness extends BulletBusinessService.Business {
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public long LJFF;
    public final List<String> LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public C60726NsQ LJIIL;

    public final void LIZJ() {
        C59297NOz c59297NOz;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LJ = false;
        this.LJIIJ = 0L;
        this.LJIIJJI = System.currentTimeMillis();
        ((ArrayList) this.LJI).clear();
        this.LJII = false;
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LJFF = System.currentTimeMillis();
        NOY LIZ = LIZ();
        if (LIZ != null && (c59297NOz = LIZ.LJJLIIJ) != null) {
            o.LJ(c59297NOz.getValue(), Boolean.TRUE);
        }
    }

    public final NOY LIZ() {
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (c59472NVs instanceof NOY) {
            return (NOY) c59472NVs;
        }
        return null;
    }

    public final void LIZIZ() {
        C59297NOz c59297NOz;
        boolean z;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AutofillModel autofillModel;
        String str;
        C59478NVy c59478NVy;
        NOY LIZ = LIZ();
        if (LIZ == null || (c59297NOz = LIZ.LJJLIIJ) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            return;
        }
        this.LIZIZ = true;
        if (C78685UuP.LJJJZ(this.LIZLLL)) {
            NOV nov = this.LIZ.LIZJ;
            if (nov != null && (c59478NVy = nov.LJLJI) != null) {
                str = c59478NVy.toString();
            } else {
                str = null;
            }
            this.LIZLLL = str;
            this.LIZJ = false;
        }
        LJI("load_finish");
        C59284NOm LIZ2 = C113504cs.LIZ();
        if (LIZ2 != null && (aweme = LIZ2.LJIIL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (autofillModel = awemeRawAd.getAutofillModel()) != null) {
            z = autofillModel.getEnable();
        } else {
            z = false;
        }
        NAW.LJII(z);
        AdLandPageSurveyServiceImpl.LJI().LIZJ(false);
    }

    public final void LIZLLL() {
        C59297NOz c59297NOz;
        NOY LIZ = LIZ();
        if (LIZ == null || (c59297NOz = LIZ.LJJLIIJ) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            return;
        }
        this.LJIIJJI = System.currentTimeMillis();
    }

    public final void LJ() {
        C59297NOz c59297NOz;
        NOY LIZ = LIZ();
        if (LIZ == null || (c59297NOz = LIZ.LJJLIIJ) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            return;
        }
        this.LJIIJ = (System.currentTimeMillis() - this.LJIIJJI) + this.LJIIJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLynxStatBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LJFF = System.currentTimeMillis();
        this.LJI = new ArrayList();
        this.LJIIJJI = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(String str) {
        Object obj;
        int i;
        NOV nov = this.LIZ.LIZJ;
        if (nov == null) {
            return;
        }
        LinkedHashMap LIZ = C0JU.LIZ("render_type", "lynx");
        if (o.LJ("load_finish", str)) {
            LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - this.LJFF));
        } else if (o.LJ("stay_page", str)) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJIIIIZZ;
            this.LJIIIIZZ = 0L;
            if (currentTimeMillis <= 0) {
                return;
            }
            LIZ.put("stay_time", Long.valueOf(currentTimeMillis));
            this.LJII = true;
        }
        NOY LIZ2 = LIZ();
        String str2 = "";
        if (LIZ2 != null) {
            obj = LIZ2.LJJLIL.getValue();
            if (obj == null) {
                obj = "";
            }
        } else {
            obj = null;
        }
        LIZ.put("channel_name", obj);
        Object value = nov.LJLJI.getValue();
        if (value != 0) {
            str2 = value;
        }
        LIZ.put("page_id", str2);
        LIZ.put("first_page", 1);
        Integer value2 = nov.LJLJL.getValue();
        if (value2 != null) {
            i = value2.intValue();
        } else {
            i = 0;
        }
        LIZ.put("landing_page_style", Integer.valueOf(i));
        C58764N4m LIZ3 = C58766N4o.LIZ();
        LIZ3.LIZ = "ad_wap_stat";
        LIZ3.LIZIZ = str;
        LIZ3.LIZJ(Long.valueOf(nov.LIZLLL()));
        LIZ3.LJFF(nov.LJFF());
        LIZ3.LIZLLL = nov.LJ();
        LIZ3.LIZ(LIZ);
        LIZ3.LJIIIIZZ();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : LIZ.entrySet()) {
            Object value3 = entry.getValue();
            if (value3 != null) {
                hashMap.put(entry.getKey(), value3);
            }
        }
        C58655N0h LJ = C58704N2e.LJ("ad_wap_stat", str, String.valueOf(nov.LIZLLL()), nov.LJFF(), nov.LJ());
        LJ.LIZ(hashMap);
        LJ.LJII();
    }

    public final void LJII(boolean z) {
        C59297NOz c59297NOz;
        Object obj;
        C59478NVy c59478NVy;
        Object value;
        C59297NOz c59297NOz2;
        NOV nov;
        NOY LIZ = LIZ();
        if (LIZ == null || (c59297NOz = LIZ.LJJLIIJ) == null || !o.LJ(c59297NOz.getValue(), Boolean.TRUE)) {
            return;
        }
        Activity activity = this.LIZ.getActivity();
        if (!this.LJII) {
            LJI("stay_page");
        }
        if (z) {
            NOY LIZ2 = LIZ();
            if (LIZ2 != null && (c59297NOz2 = LIZ2.LJJLIIJ) != null && o.LJ(c59297NOz2.getValue(), Boolean.TRUE) && (nov = this.LIZ.LIZJ) != null) {
                AdLynxEventLoger adLynxEventLoger = new AdLynxEventLoger(new Object[]{nov});
                C58687N1n.LIZ.getClass();
                adLynxEventLoger.LIZJ(C58687N1n.LIZJ, String.valueOf(nov.LIZLLL()), nov.LJFF(), null, new AqS176S0100000_10(this, 144));
            }
            if (this.LJIIL != null) {
                JSONObject jSONObject = new JSONObject();
                NOY LIZ3 = LIZ();
                Object obj2 = "";
                if (LIZ3 == null || (obj = LIZ3.LJJLIL.getValue()) == null) {
                    obj = "";
                }
                jSONObject.put("channel_name", obj);
                NOV nov2 = this.LIZ.LIZJ;
                if (nov2 != null && (c59478NVy = nov2.LJLJI) != null && (value = c59478NVy.getValue()) != null) {
                    obj2 = value;
                }
                jSONObject.put("page_id", obj2);
                C60726NsQ c60726NsQ = this.LJIIL;
                if (c60726NsQ != null) {
                    c60726NsQ.LJIIIZ("ad_lynx_close", jSONObject);
                }
            }
        } else if (activity == null || !activity.isFinishing()) {
            return;
        }
        if (!this.LIZIZ) {
            LJI("load");
        } else {
            if (!this.LJ) {
                return;
            }
            LJFF("load_fail", this.LJI.toString());
        }
    }

    public final void LJFF(String str, String str2) {
        Object obj;
        int i;
        NOV nov = this.LIZ.LIZJ;
        if (nov == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NOY LIZ = LIZ();
        if (LIZ != null) {
            obj = LIZ.LJJLIL.getValue();
            if (obj == null) {
                obj = "";
            }
        } else {
            obj = null;
        }
        linkedHashMap.put("channel_name", obj);
        linkedHashMap.put("status", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("message", str2);
        Integer value = nov.LJLJL.getValue();
        if (value != null) {
            i = value.intValue();
        } else {
            i = 0;
        }
        linkedHashMap.put("landing_page_style", Integer.valueOf(i));
        C58764N4m LIZ2 = C58766N4o.LIZ();
        LIZ2.LIZ = "lynx_landing_page";
        LIZ2.LIZIZ = "fallback";
        LIZ2.LIZJ(Long.valueOf(nov.LIZLLL()));
        LIZ2.LJFF(nov.LJFF());
        LIZ2.LIZLLL = nov.LJ();
        LIZ2.LIZ(linkedHashMap);
        LIZ2.LJIIIIZZ();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value2 = entry.getValue();
            if (value2 != null) {
                hashMap.put(entry.getKey(), value2);
            }
        }
        C58655N0h LJ = C58704N2e.LJ("lynx_landing_page", "fallback", String.valueOf(nov.LIZLLL()), nov.LJFF(), nov.LJ());
        LJ.LIZ(hashMap);
        LJ.LJII();
    }
}
