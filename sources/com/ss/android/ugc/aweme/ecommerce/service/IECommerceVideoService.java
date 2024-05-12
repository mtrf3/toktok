package com.ss.android.ugc.aweme.ecommerce.service;

import X.C42893GsT;
import X.C71353RzR;
import X.C76800UCe;
import X.InterfaceC55791Lv1;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88476Ynw;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.RouteIntent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes10.dex */
public interface IECommerceVideoService {
    List<String> LIZ();

    void LIZIZ(View view, ViewGroup viewGroup, String str);

    C71353RzR LIZJ(Context context, Aweme aweme, String str);

    boolean LIZLLL(Context context, RouteIntent routeIntent);

    void LJ(View view, Activity activity, InterfaceC55791Lv1 interfaceC55791Lv1, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    boolean LJFF();

    void LJI(TuxIconView tuxIconView, View view, String str, String str2, String str3, String str4, InterfaceC88472Yns interfaceC88472Yns, String str5, InterfaceC88476Ynw interfaceC88476Ynw);

    boolean LJII();

    boolean LJIIIIZZ();

    void LJIIIZ(Fragment fragment, LifecycleOwner lifecycleOwner, List list, C42893GsT c42893GsT);
}
