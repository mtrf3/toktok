package com.ss.android.ugc.aweme.commercialize.profile.talent;

import X.C1B8;
import X.C42398GkU;
import X.C55509LqT;
import X.C55514LqY;
import X.C55699LtX;
import X.C55704Ltc;
import X.C55705Ltd;
import X.C55707Ltf;
import X.C58096Mr6;
import X.C58655N0h;
import X.C58704N2e;
import X.C58776N4y;
import X.C76L;
import X.C78983UzD;
import X.ExecutorC142245i8;
import X.IO4;
import X.InterfaceC55510LqU;
import X.ORZ;
import X.Q7K;
import X.RunnableC65751PrH;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.commercialize.profile.talent.model.ProfileTalentShareAdResult;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class TalentAdRevenueShareServiceImpl implements ITalentAdRevenueShareService {
    public int LIZIZ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII;
    public C55514LqY LJIIIIZZ;
    public final ArrayList<String> LIZ = new ArrayList<>();
    public int LIZJ = -1;
    public int LIZLLL = -1;

    public static ITalentAdRevenueShareService LJIIJJI() {
        Object LIZ = C58096Mr6.LIZ(ITalentAdRevenueShareService.class, false);
        if (LIZ != null) {
            return (ITalentAdRevenueShareService) LIZ;
        }
        if (C58096Mr6.LLLLZ == null) {
            synchronized (ITalentAdRevenueShareService.class) {
                if (C58096Mr6.LLLLZ == null) {
                    C58096Mr6.LLLLZ = new TalentAdRevenueShareServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final int LIZJ() {
        int LIZIZ = Q7K.LIZIZ("creator_monetization_ad_upload_item_threshold", 5);
        if (LIZIZ < 0) {
            return 0;
        }
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LL() {
        this.LIZ.clear();
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = false;
        this.LJFF = false;
        this.LJII = null;
        C55509LqT.LIZ.LIZIZ(this.LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final boolean LJI() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final List<String> LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LIZLLL(String str) {
        if (str != null && !this.LIZ.isEmpty() && o.LJ(ORZ.LLFF(this.LIZ), str)) {
            this.LIZ.remove(str);
            this.LJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJFF(AwemeRawAd awemeRawAd) {
        if (!this.LJFF) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_extra_data", C1B8.LIZIZ("filter_words", "not interested", "unified_dislike", 1));
        C55707Ltf c55707Ltf = new C55707Ltf();
        c55707Ltf.LIZ = awemeRawAd;
        c55707Ltf.LIZLLL = jSONObject;
        C58776N4y.LIZ("draw_ad", "dislike", c55707Ltf.LIZ(), awemeRawAd);
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "dislike", awemeRawAd);
        LIZLLL.LIZIZ("not interested", "filter_words");
        LIZLLL.LIZIZ(1, "unified_dislike");
        LIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final boolean LJII(int i) {
        int i2;
        int i3 = this.LIZIZ;
        if (i3 <= 0) {
            return false;
        }
        int i4 = this.LIZJ;
        if (i4 < 0) {
            return true;
        }
        if (i <= i4) {
            return false;
        }
        if (i4 == this.LIZLLL && !this.LJI) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i - i4 < i3 + i2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LIZ(AwemeRawAd awemeRawAd, String refer) {
        o.LJIIIZ(refer, "refer");
        C55707Ltf c55707Ltf = new C55707Ltf();
        c55707Ltf.LIZ = awemeRawAd;
        c55707Ltf.LIZIZ = refer;
        C58776N4y.LIZ("draw_ad", "otherclick", c55707Ltf.LIZ(), awemeRawAd);
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", awemeRawAd);
        LIZLLL.LIZJ(refer, "refer");
        LIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LIZIZ(String str, boolean z) {
        this.LJFF = z;
        this.LJII = str;
        C55514LqY c55514LqY = new C55514LqY(this);
        this.LJIIIIZZ = c55514LqY;
        synchronized (C55509LqT.LIZ) {
            List<InterfaceC55510LqU> list = C55509LqT.LIZIZ;
            if (!((ArrayList) list).contains(c55514LqY)) {
                ((ArrayList) list).add(c55514LqY);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJ(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (str != null && jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(this.LJII) && this.LIZ.contains(str)) {
                    String optString = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject2 = new JSONObject();
                    } else {
                        jSONObject2 = new JSONObject(optString);
                    }
                    jSONObject2.put("creator_uid", this.LJII);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                }
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJIIIZ(AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        int i;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(awemeRawAd, "awemeRawAd");
        if (awemeRawAd.getCreativeIdStr() != null && o.LJ(awemeRawAd.getCreativeIdStr(), ORZ.LLFF(this.LIZ))) {
            if (jSONObject.opt("reason_id") != null) {
                i = jSONObject.optInt("reason_id");
            } else {
                i = 0;
            }
            String str4 = "";
            if (jSONObject.opt("report_from") == null) {
                str = "";
            } else {
                str = jSONObject.optString("report_from");
                o.LJIIIIZZ(str, "jsJson.optString(TAG_REPORT_FROM)");
            }
            if (jSONObject.opt("screenshot_uri") == null) {
                str2 = "";
            } else {
                str2 = jSONObject.optString("screenshot_uri");
                o.LJIIIIZZ(str2, "jsJson.optString(KEY_SCREEN_SHOT_URI)");
            }
            if (jSONObject.opt("description") == null) {
                str3 = "";
            } else {
                str3 = jSONObject.optString("description");
                o.LJIIIIZZ(str3, "jsJson.optString(TAG_DESCRIPTION)");
            }
            int hashCode = str.hashCode();
            if (hashCode != -1755408457) {
                if (hashCode != -326696768) {
                    if (hashCode == 1820422063 && str.equals("creative")) {
                        str4 = "share_ad";
                    }
                } else if (str.equals("long_press")) {
                    str4 = "draw_ad";
                }
            } else if (str.equals("landing_page")) {
                str4 = "landing_ad";
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reason_id", i);
            jSONObject3.put("screenshot_url", str2);
            jSONObject3.put("description", str3);
            jSONObject2.put("ad_extra_data", jSONObject3);
            C55707Ltf c55707Ltf = new C55707Ltf();
            c55707Ltf.LIZ = awemeRawAd;
            c55707Ltf.LIZLLL = jSONObject2;
            C58776N4y.LIZ(str4, "report", c55707Ltf.LIZ(), awemeRawAd);
            C58655N0h LIZLLL = C58704N2e.LIZLLL(str4, "report", awemeRawAd);
            LIZLLL.LIZIZ(Integer.valueOf(i), "reason_id");
            LIZLLL.LIZIZ(str2, "screenshot_url");
            LIZLLL.LIZIZ(str3, "description");
            LIZLLL.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJIIJ(String secUid, List list, int i, IO4 requestSource, C55699LtX c55699LtX) {
        Integer num;
        int i2;
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(requestSource, "requestSource");
        if (this.LJ) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        String str = "[";
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!o.LJ(str, "[")) {
                str = C42398GkU.LIZIZ(str, ',');
            }
            if (!TextUtils.isEmpty(str2)) {
                str = i0.LJFF(str, str2);
            }
        }
        String LIZIZ = C42398GkU.LIZIZ(str, ']');
        if (requestSource == IO4.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE && (i2 = this.LIZLLL) >= 0) {
            num = Integer.valueOf(i - i2);
        } else {
            num = null;
        }
        this.LJ = true;
        this.LJI = false;
        ProfileAdTalentShareApi.LIZ.getClass();
        C76L<ProfileTalentShareAdResult> talentProfileAd = ((ProfileAdTalentShareApi) RetrofitFactory.LIZLLL().LIZ(C55705Ltd.LIZIZ).LJFF().LIZ.LIZ(ProfileAdTalentShareApi.class)).getTalentProfileAd(secUid, LIZIZ, i, requestSource.getSOURCE(), num);
        talentProfileAd.LJFF(new RunnableC65751PrH(talentProfileAd, new C55704Ltc(this, c55699LtX, i)), ExecutorC142245i8.LJLILLLLZI);
    }
}
