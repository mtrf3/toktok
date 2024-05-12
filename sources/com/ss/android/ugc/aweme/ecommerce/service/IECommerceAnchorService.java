package com.ss.android.ugc.aweme.ecommerce.service;

import X.ActivityC45651qj;
import X.C188727au;
import X.C71362Rza;
import X.C71387Rzz;
import X.S0P;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.RouteIntent;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorFetchListTask;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public interface IECommerceAnchorService {
    S0P LIZ();

    void LIZIZ(Bundle bundle, Aweme aweme);

    Map<String, Object> LIZJ(Aweme aweme);

    boolean LIZLLL();

    void LJ(C188727au c188727au, Aweme aweme);

    boolean LJFF(Aweme aweme);

    String LJI(Aweme aweme, boolean z);

    int LJII();

    boolean LJIIIIZZ(Aweme aweme);

    C71387Rzz LJIIIZ();

    void LJIIJ(String str, String str2, Integer num, String str3, String str4);

    m LJIIJJI(String str, String str2);

    String LJIIL();

    void LJIILIIL(ProductListModel productListModel);

    void LJIILJJIL(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6);

    void LJIILL(ActivityC45651qj activityC45651qj, RouteIntent routeIntent);

    void LJIILLIIL(Activity activity, View view, boolean z, boolean z2);

    void LJIIZILJ(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9);

    void LJIJ(Context context, String str);

    String LJIJI(String str, PanelOpenInfo panelOpenInfo);

    int LJIJJ();

    AnchorFetchListTask LJIJJLI();

    List<String> LJIL(boolean z, boolean z2);

    boolean LJJ();

    String LJJI();

    boolean LJJIFFI(Aweme aweme);

    boolean LJJII();

    AnchorPdpPreloadModel LJJIII();

    void LJJIIJ(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, Integer num);

    void LJJIIJZLJL(Integer num, Map map);

    void LJJIIZ(Integer num, String str, Map<String, Object> map);

    boolean LJJIIZI();

    C71362Rza LJJIJ();

    boolean LJJIJIIJI();

    void LJJIJIIJIL(Aweme aweme, Integer num, String str);

    boolean LJJIJIL();

    int LJJIJL();

    void LJJIJLIJ(Integer num, String str, boolean z, Map map);

    RelatedProductInfo LJJIL(String str, String str2);

    void LJJIZ(Aweme aweme, Integer num, String str);

    boolean LJJJ(Aweme aweme);

    void LJJJI(Integer num, String str, Map<String, Object> map);

    void LJJJIL(String str);

    int LJJJJ();
}
