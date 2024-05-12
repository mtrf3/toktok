package com.ss.android.ugc.aweme.poi_api.service;

import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.C113554cx;
import X.C15070iV;
import X.C29S;
import X.C72083SQt;
import X.C76800UCe;
import X.C7U3;
import X.C8R8;
import X.C8RJ;
import X.C8TX;
import X.EnumC54527Lad;
import X.InterfaceC211228Qs;
import X.InterfaceC211828Ta;
import X.InterfaceC224548ra;
import X.InterfaceC88472Yns;
import X.M3Z;
import X.S1I;
import X.S1U;
import X.V1B;
import X.VNU;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiServiceEmptyImpl implements IPoiService, IPoiTagService, IPoiAnchorService {
    public final /* synthetic */ C72083SQt LJLIL = new C72083SQt();
    public final /* synthetic */ V1B LJLILLLLZI = new V1B();

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final HashMap<String, C7U3> LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LIZLLL(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIIIIZZ(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJIIIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final IInterceptor LJIIJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJIIL(Bundle bundle, View view, FragmentManager fragmentManager) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC211828Ta LJIILIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map LJIJI(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJIJJ(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJIJJLI(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final float LJIL() {
        return 1.0f;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJ(PoiData poiData) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C15070iV<Class<?>, IAVPublishExtension<?>> LJJIFFI(AVPublishPageScene pageScene) {
        o.LJIIIZ(pageScene, "pageScene");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJII() {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIII(Context context, Number defaultTime, String str, Boolean bool, Boolean bool2, AqS146S0200000_15 aqS146S0200000_15, AqS165S0100000_15 aqS165S0100000_15) {
        o.LJIIIZ(defaultTime, "defaultTime");
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIIJ(C29S c29s) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJIJIIJI(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIJIIJIL(int i, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJIJIL(String address, int i, int i2, String str, String str2, String str3, String str4) {
        o.LJIIIZ(address, "address");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final AbstractC186347Ta LJJIJL(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJIJLIJ(Aweme aweme, HashMap params) {
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final AbstractC186377Td LJJIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final InterfaceC224548ra LJJJ(Fragment fragment) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJI(EnumC54527Lad scene, C8TX loadStrategy, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns3) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(loadStrategy, "loadStrategy");
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final LynxUI<?> LJJJJ(VNU context) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final HashMap<String, C7U3> LJJJJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJJIZL(PoiData poiData, Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final CreateAnchorInfo LJJJJJ(PoiData poiData) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJJL(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final C8RJ LJJJJLI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJJJLL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJJZI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJJLIIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJLL(String str, String str2, boolean z, String str3, boolean z2, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJLZIJ(Context context, Double d, Double d2, String str, String str2, Float f) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJJLI(Context context, Aweme aweme, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final String LJJLIIIIJ(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJLIIIJ(M3Z m3z) {
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLIIIJILLIZJL(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLIIIJJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final PoiData LJJLIIJ(InterfaceC88472Yns<? super Class<? extends Object>, ? extends Object> interfaceC88472Yns) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final View LJJLIL(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean LJJLJLI(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final void appendPoiTagParamsIfHave(String str, HashMap<String, String> params, Aweme aweme) {
        o.LJIIIZ(params, "params");
        this.LJLIL.getClass();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final VideoTagCategoryProtocol getPoiTagTrigger() {
        this.LJLIL.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final InterfaceC211228Qs getPoiTagView(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public final boolean isPoiTagShow(String str, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowCustomFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLILLLLZI.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService
    public final boolean shouldShowOldFeedSingleAnchor(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLILLLLZI.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map<String, Object> LJJJJZ() {
        return new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final S1U LJJLIIIJLJLI() {
        return new S1U() { // from class: X.8TH
            @Override // X.S1U
            public final String LIZJ() {
                return null;
            }

            @Override // X.S1U
            public final void LJIJI(Aweme aweme, String enterMethod, String enterFrom, boolean z, boolean z2, String trackInfo, C188727au c188727au) {
                o.LJIIIZ(aweme, "aweme");
                o.LJIIIZ(enterMethod, "enterMethod");
                o.LJIIIZ(enterFrom, "enterFrom");
                o.LJIIIZ(trackInfo, "trackInfo");
            }

            @Override // X.S1U
            public final void LJJI(Aweme aweme) {
                o.LJIIIZ(aweme, "aweme");
            }

            @Override // X.S1U
            public final void LJJIJ(Aweme aweme, String enterMethod, String enterFrom, boolean z, String trackInfo, C188727au c188727au) {
                o.LJIIIZ(aweme, "aweme");
                o.LJIIIZ(enterMethod, "enterMethod");
                o.LJIIIZ(enterFrom, "enterFrom");
                o.LJIIIZ(trackInfo, "trackInfo");
            }

            @Override // X.S1U
            public final void LJJJJZI(int i, int i2, int i3, int i4, int i5, int i6) {
            }

            @Override // X.S1U
            public final void LJJL(Context context, Aweme aweme, String enterMethod, String enterFrom, C188727au c188727au, boolean z, String trackInfo) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(aweme, "aweme");
                o.LJIIIZ(enterMethod, "enterMethod");
                o.LJIIIZ(enterFrom, "enterFrom");
                o.LJIIIZ(trackInfo, "trackInfo");
            }

            @Override // X.S1U
            public final boolean enable() {
                return PoiEnableExperiment.LIZIZ();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final S1I LJJLJ() {
        return new S1I() { // from class: X.8TI
            @Override // X.S1I
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                o.LJIIIZ(aweme, "aweme");
                return false;
            }

            @Override // X.S1I
            public final C8IM LIZIZ(Context context) {
                o.LJIIIZ(context, "context");
                return null;
            }

            @Override // X.S1I
            public final void LIZJ(Context context) {
                o.LJIIIZ(context, "context");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final Map LJIIJJI(Aweme aweme, String str) {
        return C113554cx.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IPoiService
    public final void LJJJZ(String str, C8R8 c8r8, AqS153S0100000_3 aqS153S0100000_3) {
        aqS153S0100000_3.invoke();
    }
}
