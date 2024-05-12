package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C164906da;
import X.C76800UCe;
import X.C85258Xd8;
import X.E8H;
import X.InterfaceC54674Ld0;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bdlocation.init.LocationInitConfig;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public interface ILocationBaseServiceForMT {
    void bindAccuracyFetcher();

    void doAfterRequestPermissions(List<C164906da> list);

    View getGpsBannerHeaderConvertedView(Context context, ViewGroup viewGroup, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    View getGpsBannerHeaderView(Context context, ViewGroup viewGroup, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2);

    Class<? extends PowerCell<?>> getLocationAccuracySettingCell();

    InterfaceC57784Mm4 getLocationAccuracySettingItem();

    Map<String, String> getLocationCommonParamsIfHave();

    String getPermissionPopupHintViewTitle(Context context);

    boolean inAppPreciseUnknown();

    void initPermissionAccuracyAndGPSProvider(LocationInitConfig.Builder builder);

    void injectMobParams(Context context, Map<String, String> map);

    boolean isInAppPrecise();

    boolean isSupportedPreciseGps();

    boolean isSystemPrecise(Context context);

    List<String> locationPermissions();

    void mobLocationStatus(boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    boolean needShowAccuracySettingCell(Context context);

    void requestInAppConversionPopup(String str, String str2, ActivityC45651qj activityC45651qj, E8H e8h, Cert cert, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, String str3);

    void requestSystemConversionPopup(String str, String str2, Cert cert, ActivityC45651qj activityC45651qj, C85258Xd8 c85258Xd8, InterfaceC54674Ld0 interfaceC54674Ld0, boolean z, boolean z2);

    AbstractC73672Svk<String> searchPoi(String str, String str2, String str3, PoiSearchRequestBody poiSearchRequestBody);

    void updateInAppPrecise(boolean z);

    void uploadInAppPreciseStatusAfterAppLaunch();
}
