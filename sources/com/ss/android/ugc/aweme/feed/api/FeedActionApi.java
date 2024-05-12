package com.ss.android.ugc.aweme.feed.api;

import X.C15070iV;
import X.C176616wT;
import X.C46104I7o;
import X.C64920Pds;
import X.C76L;
import X.E4Q;
import X.EF7;
import X.EFJ;
import X.InterfaceC64989Pez;
import X.InterfaceC64997Pf7;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* loaded from: classes4.dex */
public final class FeedActionApi {
    public static final C176616wT LIZ = new C176616wT();
    public static final RetrofitApi LIZIZ = (RetrofitApi) C46104I7o.LJIIZILJ(EFJ.LIZJ, RetrofitApi.class);

    /* loaded from: classes4.dex */
    public interface RetrofitApi {
        @E4Q("/aweme/v1/aweme/delete/")
        C76L<BaseResponse> deleteItem(@InterfaceC64989Pez("aweme_id") String str);

        @E4Q("/aweme/v1/schedule/aweme/delete/")
        C76L<BaseResponse> deleteScheduleItem(@InterfaceC64989Pez("aweme_id") String str);

        @E4Q("/aweme/v1/commit/item/digg/")
        C76L<BaseResponse> diggItem(@InterfaceC64997Pf7 Map<String, String> map);
    }

    public static void LIZ(String str) {
        LIZIZ.deleteItem(str).get();
    }

    public static void LIZIZ(String str) {
        LIZIZ.deleteScheduleItem(str).get();
    }

    public static C15070iV<String, Integer> LIZJ(Map<String, String> map) {
        C176616wT c176616wT = LIZ;
        c176616wT.LJ();
        c176616wT.LIZLLL = "ttk_aweme_digg_api_monitor";
        String str = map.get("enter_from");
        if (!TextUtils.isEmpty(str) && str != null) {
            c176616wT.LIZ.put("enter_from", str);
        }
        String str2 = map.get("type");
        if (!TextUtils.isEmpty(str2) && str2 != null) {
            c176616wT.LIZ.put("digg_type", str2);
        }
        try {
            BaseResponse baseResponse = LIZIZ.diggItem(map).get();
            c176616wT.LIZ();
            c176616wT.LIZLLL(baseResponse);
            c176616wT.LJFF();
            return new C15070iV<>(map.get("aweme_id"), Integer.valueOf(CastIntegerProtector.parseInt(map.get("type"))));
        } catch (Throwable th) {
            LIZ.LJI(C64920Pds.LIZ(EF7.LIZIZ(), th));
            throw th;
        }
    }
}
