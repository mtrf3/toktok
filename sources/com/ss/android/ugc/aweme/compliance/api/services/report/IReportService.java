package com.ss.android.ugc.aweme.compliance.api.services.report;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes11.dex */
public interface IReportService {
    void LIZ(String str, String str2, String str3, String str4, String str5, String str6);

    void LIZIZ(Activity activity, Uri.Builder builder);

    void LIZJ(Activity activity, Uri.Builder builder);

    String LIZLLL(Aweme aweme);

    void LJ(Activity activity, Aweme aweme);

    void LJFF(Activity activity, Uri.Builder builder, Bundle bundle);

    void LJI(Map<String, String> map);

    void LJII(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, String str8, String str9, Context context, String str10, int i);

    String LJIIIIZZ(String str);
}
