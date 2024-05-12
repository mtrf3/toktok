package com.ss.android.ugc.aweme.ecommerce.service;

import X.C76800UCe;
import X.C9JN;
import X.C9JO;
import X.InterfaceC43002GuE;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface IECommerceService {
    public static final C9JO LIZ = C9JO.LIZ;

    void appendAdTrackParam(Aweme aweme, Uri.Builder builder);

    Fragment createWishListFragment(String str, String str2);

    PowerViewPagerFragmentItem<?> createWishListFragmentData(String str, String str2);

    void doNewCartAnimation(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, boolean z, View view, ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    String generateAdLynxLogExtra(Aweme aweme, String str);

    String generateAdLynxLogExtraAll(Aweme aweme, String str);

    String generateTrackId(Aweme aweme);

    List<IInterceptor> getEComPipeRouterInterceptors();

    List<IInterceptor> getECommerceRouterInterceptors();

    Map<String, Class<?>> getJSMethodClass();

    InterfaceC43002GuE inboxService();

    boolean isECADVideo(Aweme aweme);

    boolean isLiveCreatorBCToggleAvailable();

    boolean isLowLevelDevice();

    boolean isMiddleLevelDevice();

    String modifySchemaOfNotice(String str, String str2, String str3);

    void onBootFinish();

    void onEnterEcommerceLiveRoom(Fragment fragment);

    C9JN orderCenterService();

    void postEvent(String str, JSONObject jSONObject);

    void prefetchPdp(String str, Context context);

    void prefetchPdp(String str, Context context, int i, InterfaceC88472Yns<? super ProductBaseEpt, C76800UCe> interfaceC88472Yns);

    String prefetchPdpEnterLiveRoom(String str);

    void prefetchSchema(String str, Context context);

    void reportAdVideoLog(Aweme aweme, boolean z, int i, String str);

    void reportVerticalSearchApiLog(String str, JSONObject jSONObject);

    void setCurrentRoomId(Long l);

    void setIsDeeplinkOpenECMallSearchFlag(boolean z);

    void setSearchResultTabNameFlag(String str);
}
