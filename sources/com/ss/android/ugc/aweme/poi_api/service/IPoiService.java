package com.ss.android.ugc.aweme.poi_api.service;

import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.C15070iV;
import X.C29S;
import X.C76800UCe;
import X.C7U3;
import X.C8R8;
import X.C8RJ;
import X.C8TX;
import X.EnumC54527Lad;
import X.InterfaceC211828Ta;
import X.InterfaceC224548ra;
import X.InterfaceC88472Yns;
import X.M3Z;
import X.S1I;
import X.S1U;
import X.VNU;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes4.dex */
public interface IPoiService extends IPoiTagService, IPoiAnchorService {
    HashMap<String, C7U3> LIZ();

    boolean LIZLLL(Context context);

    boolean LJI();

    void LJII();

    void LJIIIIZZ(Context context, String str);

    String LJIIIZ();

    IInterceptor LJIIJ();

    Map LJIIJJI(Aweme aweme, String str);

    void LJIIL(Bundle bundle, View view, FragmentManager fragmentManager);

    InterfaceC211828Ta LJIILIIL();

    boolean LJIJ();

    Map LJIJI(String str, String str2);

    String LJIJJ(String str, String str2);

    String LJIJJLI(String str);

    float LJIL();

    boolean LJJ(PoiData poiData);

    C15070iV<Class<?>, IAVPublishExtension<?>> LJJIFFI(AVPublishPageScene aVPublishPageScene);

    void LJJII();

    void LJJIII(Context context, Number number, String str, Boolean bool, Boolean bool2, AqS146S0200000_15 aqS146S0200000_15, AqS165S0100000_15 aqS165S0100000_15);

    void LJJIIJ(C29S c29s);

    boolean LJJIIZ();

    boolean LJJIJ();

    String LJJIJIIJI(String str);

    void LJJIJIIJIL(int i, String str, boolean z);

    String LJJIJIL(String str, int i, int i2, String str2, String str3, String str4, String str5);

    AbstractC186347Ta LJJIJL(Context context);

    void LJJIJLIJ(Aweme aweme, HashMap hashMap);

    boolean LJJIL();

    AbstractC186377Td LJJIZ(Context context);

    InterfaceC224548ra LJJJ(Fragment fragment);

    void LJJJI(EnumC54527Lad enumC54527Lad, C8TX c8tx, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns3);

    boolean LJJJIL();

    LynxUI<?> LJJJJ(VNU vnu);

    HashMap<String, C7U3> LJJJJI();

    void LJJJJIZL(PoiData poiData, Map<String, String> map);

    CreateAnchorInfo LJJJJJ(PoiData poiData);

    boolean LJJJJL(Context context);

    C8RJ LJJJJLI();

    String LJJJJLL();

    Map<String, Object> LJJJJZ();

    boolean LJJJJZI();

    boolean LJJJLIIL();

    void LJJJLL(String str, String str2, boolean z, String str3, boolean z2, String str4);

    void LJJJLZIJ(Context context, Double d, Double d2, String str, String str2, Float f);

    void LJJJZ(String str, C8R8 c8r8, AqS153S0100000_3 aqS153S0100000_3);

    View LJJLI(Context context, Aweme aweme, String str);

    String LJJLIIIIJ(Aweme aweme);

    void LJJLIIIJ(M3Z m3z);

    boolean LJJLIIIJILLIZJL(Aweme aweme);

    boolean LJJLIIIJJI();

    S1U LJJLIIIJLJLI();

    PoiData LJJLIIJ(InterfaceC88472Yns<? super Class<? extends Object>, ? extends Object> interfaceC88472Yns);

    View LJJLIL(Context context, Aweme aweme);

    S1I LJJLJ();

    boolean LJJLJLI(Context context);

    boolean enable();
}
