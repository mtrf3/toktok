package com.ss.android.ugc.aweme.deeplink;

import X.CU2;
import X.M5X;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;

/* loaded from: classes10.dex */
public interface IDeepLinkService {
    Class<? extends Activity> LIZIZ();

    boolean LIZJ(String str);

    boolean LIZLLL(Context context);

    boolean LJ(Activity activity, String str, String str2);

    String LJFF(Context context);

    boolean LJI(String str);

    void LJII();

    String LJIIIIZZ(Uri uri);

    String LJIIIZ();

    Class<? extends Activity> LJIIJ();

    boolean LJIIJJI();

    Class<? extends Activity> LJIIL();

    boolean LJIILIIL(String str, String str2);

    String LJIILJJIL(String str);

    String LJIILL();

    String LJIILLIIL();

    Class<? extends Activity> LJIIZILJ();

    boolean LJIJ(Uri uri);

    void LJIJI(Activity activity, String str);

    String LJIJJ();

    String LJIJJLI(String str);

    void LJIL(String str, String str2, boolean z);

    void LJJ(String str, String str2);

    long LJJI();

    boolean LJJIFFI(Activity activity, String str, boolean z);

    void LJJII(M5X m5x, CU2 cu2);

    String getCustomScheme();

    boolean isDeepLinkHandlerActivity(Context context);
}
