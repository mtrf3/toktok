package com.ss.android.ugc.aweme.commercialize.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface IAdTaskDepend {
    boolean LIZ(Context context, String str);

    void LIZIZ(String str);

    void LIZJ(Context context);

    void LIZLLL(Context context, String str, String str2, Bundle bundle);

    String LJ();

    void LJFF(Context context);

    boolean LJI(AwemeRawAd awemeRawAd);

    boolean LJII(int i, Context context);

    boolean LJIIIIZZ(Context context, String str);

    JSONObject LJIIIZ(Context context, Aweme aweme);

    boolean LJIIJ(Context context, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i);

    boolean LJIIJJI(String str, String str2, boolean z);

    Intent LJIIL(Context context);

    boolean LJIILIIL(Context context, AwemeRawAd awemeRawAd, String str);

    boolean LJIILJJIL(String str);

    boolean LJIILL();

    boolean LJIILLIIL(String str, String str2, String str3, String str4, Context context);

    boolean open(String str);
}
