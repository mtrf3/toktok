package com.ss.android.ugc.aweme.search.ecommerce;

import X.ActivityC45651qj;
import X.C208398Fv;
import X.C3C8;
import X.C51163K6d;
import X.C51385KEr;
import X.C76800UCe;
import X.EnumC51280KAq;
import X.EnumC51281KAr;
import X.EnumC61742ba;
import X.EnumC61762bc;
import X.InterfaceC34451Wv;
import X.InterfaceC65784Pro;
import X.InterfaceC70514Rlu;
import X.K05;
import X.K0D;
import X.K5P;
import X.K5R;
import X.K7G;
import X.KBF;
import X.KE2;
import X.KEK;
import X.KEP;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.GeneralSearchAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;

/* loaded from: classes9.dex */
public interface IEcomSearchService {
    void LIZ(Uri uri, SearchResultParam searchResultParam, String str);

    void LIZIZ();

    boolean LIZJ(Uri uri);

    Intent LIZLLL(Activity activity, Uri uri);

    void LJ(String str, String str2);

    SmartRoute LJFF(Context context);

    boolean LJI(ECSearchEntranceData eCSearchEntranceData);

    String LJII();

    String LJIIIIZZ(String str);

    boolean LJIIIZ(ECSearchEntranceData eCSearchEntranceData);

    ECSearchEntranceData LJIIJ(Uri uri);

    boolean LJIIJJI();

    void LJIIL(View view, String str, String str2, Map<String, String> map, InterfaceC34451Wv interfaceC34451Wv);

    boolean LJIILIIL();

    boolean LJIILJJIL(String str, boolean z);

    boolean LJIILL(ECSearchEntranceData eCSearchEntranceData);

    void LJIILLIIL(Uri uri, EnumC51281KAr enumC51281KAr, ECSearchEntranceData eCSearchEntranceData);

    K7G LJIIZILJ();

    void LJIJ(SearchResultParam searchResultParam, boolean z, int i, int i2);

    void LJIJI(KE2 ke2, ActivityC45651qj activityC45651qj);

    String LJIJJ();

    boolean LJIJJLI();

    boolean LJIL(ActivityC45651qj activityC45651qj);

    boolean LJJ(boolean z);

    C51385KEr LJJI(long j, Context context, Aweme aweme, String str, String str2, boolean z, boolean z2);

    GeneralSearchAdapter LJJIFFI(KEP kep);

    void LJJII(Bundle bundle, K5R k5r);

    void LJJIII(Context context, ActivityC45651qj activityC45651qj);

    EnumC61742ba LJJIIJ(ECSearchEntranceData eCSearchEntranceData);

    Uri LJJIIJZLJL(Uri uri, KBF kbf);

    boolean LJJIIZ(ActivityC45651qj activityC45651qj, String str, String str2);

    ReusedUISlotAssem<? extends C3C8> LJJIIZI(boolean z);

    String LJJIJ();

    KBF LJJIJIIJI(Uri uri);

    boolean LJJIJIIJIL(ActivityC45651qj activityC45651qj);

    void LJJIJIL(C208398Fv c208398Fv, EditText editText, ImageView imageView, boolean z);

    List<IInterceptor> LJJIJL();

    boolean LJJIJLIJ(EnumC51280KAq enumC51280KAq);

    void LJJIL(Uri uri, String str);

    void LJJIZ(Bundle bundle, K05 k05, K0D k0d, String str);

    boolean LJJJ(Context context, C208398Fv c208398Fv, EditText editText, ImageView imageView, AqS190S0100000_8 aqS190S0100000_8, AqS174S0100000_8 aqS174S0100000_8);

    void LJJJI(Uri uri, KBF kbf, K5P k5p, SearchResultParam searchResultParam);

    void LJJJIL(C51163K6d c51163K6d, Context context, ViewGroup viewGroup, TextView textView, boolean z);

    boolean LJJJJ(ECSearchEntranceData eCSearchEntranceData);

    DynamicSearchShopFragment LJJJJI(KEP kep);

    void LJJJJIZL(Context context, Uri uri, Bundle bundle, Object obj);

    boolean LJJJJJ(ECSearchEntranceData eCSearchEntranceData);

    boolean LJJJJJL(ECSearchEntranceData eCSearchEntranceData);

    InterfaceC70514Rlu LJJJJL(Context context, EnumC51280KAq enumC51280KAq, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    int LJJJJLI();

    EnumC61762bc LJJJJLL(ECSearchEntranceData eCSearchEntranceData);

    boolean LJJJJZ(ECSearchEntranceData eCSearchEntranceData);
}
