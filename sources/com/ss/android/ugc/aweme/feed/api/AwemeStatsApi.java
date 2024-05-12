package com.ss.android.ugc.aweme.feed.api;

import X.C2YJ;
import X.C62684Oiu;
import X.C76L;
import X.E8M;
import X.EFJ;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.UTU;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.Map;
import yq4.a;

/* loaded from: classes11.dex */
public final class AwemeStatsApi {
    public static final AwemeStatsService LIZ = (AwemeStatsService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(AwemeStatsService.class);

    /* loaded from: classes9.dex */
    public interface AwemeStatsService {
        @E8M("/aweme/v1/familiar/video/stats/")
        @InterfaceC195757mF
        C76L<BaseResponse> awemeFamiliarStatsReport(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("author_id") String str2, @InterfaceC64985Pev("follow_status") int i, @InterfaceC64985Pev("follower_status") int i2);

        @E8M("/aweme/v1/fast/stats/")
        @InterfaceC195757mF
        C76L<BaseResponse> awemeFastStatsReport(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("tab_type") int i, @InterfaceC64985Pev("aweme_type") int i2, @InterfaceC64985Pev("origin_item_id") String str2);

        @E8M("/aweme/v1/aweme/stats/")
        @InterfaceC195757mF
        C76L<BaseResponse> awemeStatsReport(@InterfaceC36229EJt Map<String, String> map);
    }

    public static void LIZ(C62684Oiu c62684Oiu) {
        if (UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        c62684Oiu.getClass();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(c62684Oiu.LIZ)) {
            hashMap.put("item_id", c62684Oiu.LIZ);
        }
        int i = c62684Oiu.LIZIZ;
        if (i > 0) {
            hashMap.put("share_delta", String.valueOf(i));
        }
        int i2 = c62684Oiu.LIZJ;
        if (i2 > 0) {
            hashMap.put("play_delta", String.valueOf(i2));
        }
        int i3 = c62684Oiu.LIZLLL;
        if (i3 > 0) {
            hashMap.put("download_delta", String.valueOf(i3));
        }
        int i4 = c62684Oiu.LJ;
        if (i4 > -1) {
            hashMap.put("aweme_type", String.valueOf(i4));
        }
        int i5 = c62684Oiu.LJFF;
        if (i5 > -1) {
            hashMap.put("tab_type", String.valueOf(i5));
        }
        int i6 = c62684Oiu.LJI;
        if (i6 > 0) {
            hashMap.put("item_type", String.valueOf(i6));
        }
        String str = c62684Oiu.LJII;
        if (str != null) {
            hashMap.put("stats_channel", str);
        }
        int i7 = c62684Oiu.LJIIIIZZ;
        if (i7 > -1) {
            hashMap.put("follow_status", String.valueOf(i7));
        }
        int i8 = c62684Oiu.LJIIIZ;
        if (i8 > -1) {
            hashMap.put("follower_status", String.valueOf(i8));
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJIIJ)) {
            hashMap.put("origin_item_id", c62684Oiu.LJIIJ);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJIIJJI)) {
            hashMap.put("origin_author_id", c62684Oiu.LJIIJJI);
        }
        int i9 = c62684Oiu.LJIIL;
        if (i9 > -1) {
            hashMap.put("origin_follow_status", String.valueOf(i9));
        }
        int i10 = c62684Oiu.LJIILIIL;
        if (i10 > -1) {
            hashMap.put("impr_order", String.valueOf(i10));
        }
        int i11 = c62684Oiu.LJIILJJIL;
        if (i11 > -1) {
            hashMap.put("last_impr_order", String.valueOf(i11));
        }
        String str2 = c62684Oiu.LJIILL;
        if (str2 != null) {
            hashMap.put("order", str2);
        }
        String str3 = c62684Oiu.LJIILLIIL;
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        long j = c62684Oiu.LJIIZILJ;
        if (j > -1) {
            hashMap.put("session_id", String.valueOf(j));
        }
        int i12 = c62684Oiu.LJIJ;
        if (i12 > -1) {
            hashMap.put("origin_follower_status", String.valueOf(i12));
        }
        hashMap.put("sync_origin", String.valueOf(c62684Oiu.LJIJI));
        hashMap.put("pre_item_id", c62684Oiu.LJIJJ);
        hashMap.put("pre_item_playtime", c62684Oiu.LJIJJLI);
        hashMap.put("pre_hot_sentence", c62684Oiu.LJIL);
        if (!TextUtils.isEmpty(c62684Oiu.LJJ)) {
            hashMap.put("creative_id", c62684Oiu.LJJ);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIFFI)) {
            hashMap.put("ad_id", c62684Oiu.LJJIFFI);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJI)) {
            hashMap.put("log_extra", c62684Oiu.LJJI);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJII)) {
            hashMap.put("user_agent", c62684Oiu.LJJII);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIII)) {
            hashMap.put("access", c62684Oiu.LJJIII);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIIJZLJL)) {
            hashMap.put("google_aid", c62684Oiu.LJJIIJZLJL);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIIJ)) {
            hashMap.put("package", c62684Oiu.LJJIIJ);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIIZ)) {
            hashMap.put("previous_page", c62684Oiu.LJJIIZ);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIIZI)) {
            hashMap.put("enter_from", c62684Oiu.LJJIIZI);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIJ)) {
            hashMap.put("duration", c62684Oiu.LJJIJ);
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIJIIJI)) {
            hashMap.put("play_order", c62684Oiu.LJJIJIIJI);
        }
        int i13 = c62684Oiu.LJJIJIIJIL;
        boolean z = true;
        if (i13 == 1) {
            hashMap.put("is_ba", String.valueOf(i13));
        }
        if (!TextUtils.isEmpty(c62684Oiu.LJJIJIL)) {
            hashMap.put("item_distribute_source", c62684Oiu.LJJIJIL);
        }
        hashMap.put("is_ad", String.valueOf(c62684Oiu.LJJIJL));
        int i14 = c62684Oiu.LJJIJLIJ;
        if (i14 > 0) {
            hashMap.put("item_source_category", String.valueOf(i14));
        }
        a.LIZ.getClass();
        if (!a.LIZJ().LIZIZ()) {
            z = false;
        }
        hashMap.put("user_algo_refresh_status", String.valueOf(z));
        hashMap.put("first_install_time", C2YJ.LIZIZ.LIZ.getFirstInstallTime().toString());
        hashMap.put("action_time", String.valueOf(System.currentTimeMillis() / 1000));
        LIZ.awemeStatsReport(hashMap).get();
    }
}
