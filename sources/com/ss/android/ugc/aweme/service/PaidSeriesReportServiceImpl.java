package com.ss.android.ugc.aweme.service;

import X.C188727au;
import X.FMX;
import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes2.dex */
public final class PaidSeriesReportServiceImpl implements IPaidSeriesReportService {
    @Override // com.ss.android.ugc.aweme.service.IPaidSeriesReportService
    public final void LIZ(Activity activity, Long l, String str, String str2, String str3) {
        o.LJIIIZ(activity, "activity");
        a.LJIILLIIL().LIZIZ(activity, new Uri.Builder().appendQueryParameter("report_type", "paid_video_collection").appendQueryParameter("object_id", String.valueOf(l)).appendQueryParameter("owner_id", str).appendQueryParameter("enter_from", str2));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", str);
        c188727au.LJIIIZ("object_id", String.valueOf(l));
        c188727au.LJIIIZ("object_type", "paid_video_collection");
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LIZLLL(1, "is_collection_item");
        FMX.LJIIL("click_report", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("author_id", str);
        c188727au2.LJIIIZ("enter_from", str2);
        c188727au2.LJIIIZ("group_id", String.valueOf(l));
        c188727au2.LJIIIZ("panel_source", str3);
        c188727au2.LJIIIZ("enter_method", str3);
        c188727au2.LIZLLL(1, "is_collection_item");
        FMX.LJIIL("report", c188727au2.LIZ);
    }
}
