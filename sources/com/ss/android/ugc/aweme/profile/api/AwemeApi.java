package com.ss.android.ugc.aweme.profile.api;

import X.C10K;
import X.C16880lQ;
import X.C176946x0;
import X.C176956x1;
import X.C26380AWy;
import X.C2YJ;
import X.C38281F0r;
import X.C56484MEu;
import X.C76L;
import X.C87030YDq;
import X.CallableC26219AQt;
import X.E4Q;
import X.E4T;
import X.EFJ;
import X.F30;
import X.FMX;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC61858OPm;
import X.InterfaceC64989Pez;
import X.InterfaceC64992Pf2;
import X.JBR;
import X.Q7K;
import X.QJY;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.services.RetrofitService;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AwemeApi {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final RealApi LJFF;

    /* loaded from: classes5.dex */
    public interface RealApi {
        @E4Q("/aweme/v2/douplus/item/check/")
        C76L<AwemeAdStatus> checkItemAdStatus(@InterfaceC64989Pez("item_id") String str, @InterfaceC64989Pez("from_source") int i);

        @InterfaceC195787mI
        @E4T("/aweme/v1/commit/dislike/item/")
        InterfaceC37276Ek4<BaseResponse> disLikeAweme(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64992Pf2 Map<String, String> map);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        String str = EFJ.LIZJ;
        LIZ = JBR.LJFF(LIZ2, str, "/aweme/v1/aweme/post/", LIZ2);
        LIZIZ = i0.LJFF(str, "/aweme/v1/aweme/favorite/");
        LIZJ = i0.LJFF(str, "/aweme/v1/aweme/listcollection/");
        LIZLLL = i0.LJFF(str, "/aweme/v1/private/aweme/");
        LJ = i0.LJFF(str, "/aweme/v1/post/locate/");
        LJFF = (RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(RealApi.class);
    }

    public static String LIZIZ(Aweme aweme, LinkData linkData) {
        if (linkData == null || aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String str = linkData.creativeId;
        String str2 = linkData.logExtra;
        String aid = aweme.getAid();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("creative_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("log_extra", str2);
        }
        QJY.LJI(hashMap, true);
        LJFF.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    public static void LIZJ(String str, Map<String, String> map) {
        try {
            LJFF.disLikeAweme(str, map).execute();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJI(FeedItemList feedItemList, F30 f30) {
        if (feedItemList == null) {
            return;
        }
        if (!TextUtils.isEmpty("X-TT-LOGID")) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ((ArrayList) f30.LJLIL).size(); i++) {
                InterfaceC61858OPm interfaceC61858OPm = (InterfaceC61858OPm) ListProtector.get(f30.LJLIL, i);
                if (interfaceC61858OPm.getName().equalsIgnoreCase("X-TT-LOGID")) {
                    arrayList.add(interfaceC61858OPm);
                }
            }
            InterfaceC61858OPm[] interfaceC61858OPmArr = (InterfaceC61858OPm[]) arrayList.toArray(new InterfaceC61858OPm[arrayList.size()]);
            if (interfaceC61858OPmArr != null) {
                for (InterfaceC61858OPm interfaceC61858OPm2 : interfaceC61858OPmArr) {
                    if ("X-TT-LOGID".equalsIgnoreCase(interfaceC61858OPm2.getName())) {
                        feedItemList.setRequestId(interfaceC61858OPm2.getValue());
                        return;
                    }
                }
            }
        }
        LogPbBean logPbBean = feedItemList.logPb;
        if (logPbBean != null) {
            feedItemList.setRequestId(logPbBean.getImprId());
        }
    }

    public static String LIZ(Aweme aweme, int i, String str) {
        String str2;
        String str3;
        String str4;
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String aid = aweme.getAid();
        if (!aweme.isAd()) {
            str2 = "";
            str3 = "";
            str4 = "";
        } else {
            str3 = String.valueOf(aweme.getAwemeRawAd().getAdId());
            str4 = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
            str2 = aweme.getAwemeRawAd().getLogExtra();
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("ad_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("creative_id", str4);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("ad_category", "");
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("log_extra", str2);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("dislike_source", "");
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("commit_type", str);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append("");
        hashMap.put("channel_id", X1D.LIZIZ(LIZ2));
        QJY.LJI(hashMap, true);
        LJFF.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    public static FeedItemList LJFF(boolean z, String str, String str2, int i, long j, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        F30 f30 = new F30();
        C38281F0r c38281F0r = new C38281F0r(LIZIZ);
        c38281F0r.LIZ(i3, "invalid_item_count");
        c38281F0r.LIZ(i4, "is_hiding_invalid_item");
        c38281F0r.LIZIZ(j, "max_cursor");
        if ((TextUtils.isEmpty(str2) || C2YJ.LIZIZ.LIZ.getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
            c38281F0r.LIZLLL("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c38281F0r.LIZLLL("sec_user_id", str2);
        }
        c38281F0r.LIZ(i2, "count");
        C87030YDq c87030YDq = C87030YDq.LIZIZ;
        if (z) {
            i5 = 60;
        } else {
            i5 = 0;
        }
        String LJ2 = c38281F0r.LJ();
        if (j <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) c87030YDq.apiExecuteGetJSONObject(i5, LJ2, FeedItemList.class, null, f30, z2, null);
        LJI(feedItemList, f30);
        C10K.LIZIZ(new CallableC26219AQt(i, str, feedItemList), FMX.LIZIZ(), null);
        return feedItemList;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r10, java.lang.String r11, int r12, long r13, int r15, int r16, int r17, java.lang.Integer r18, boolean r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.api.AwemeApi.LIZLLL(java.lang.String, java.lang.String, int, long, int, int, int, java.lang.Integer, boolean, java.lang.String):java.lang.String");
    }

    public static FeedItemList LJ(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4, Integer num, F30 f30, boolean z2, String str4) {
        int i5;
        boolean z3;
        int i6 = i2;
        if (str3 == null && j == 0 && ((Number) C26380AWy.LIZ.getValue()).intValue() > 0 && num.intValue() == 2000) {
            i6 = Q7K.LIZIZ("profile_aweme_post_refresh_count_setting", 9);
        }
        String LIZLLL2 = LIZLLL(str, str2, i, j, i6, i3, i4, num, z2, str4);
        C176956x1 c176956x1 = C56484MEu.LIZ;
        if (c176956x1 != null) {
            C176946x0 c176946x0 = c176956x1.LIZ;
            if (c176946x0 != null) {
                c176946x0.LIZLLL = System.currentTimeMillis();
            }
            C176946x0 c176946x02 = c176956x1.LIZ;
            if (c176946x02 != null) {
                c176946x02.LJI = true;
            }
        }
        C87030YDq c87030YDq = C87030YDq.LIZIZ;
        if (z) {
            i5 = 60;
        } else {
            i5 = 0;
        }
        if (j <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        FeedItemList feedItemList = (FeedItemList) c87030YDq.apiExecuteGetJSONObject(i5, LIZLLL2, FeedItemList.class, null, f30, z3, str3);
        LJI(feedItemList, f30);
        C10K.LIZIZ(new CallableC26219AQt(i, str, feedItemList), FMX.LIZIZ(), null);
        return feedItemList;
    }
}
