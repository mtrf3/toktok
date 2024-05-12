package com.ss.android.ugc.aweme.external.router;

import X.C16880lQ;
import X.C32I;
import X.C42890GsQ;
import X.C45804HyK;
import X.C62712d9;
import X.C73282uC;
import X.C780334l;
import X.EnumC36116EFk;
import X.HE5;
import X.HE6;
import X.HE7;
import X.HE8;
import X.HE9;
import X.HMK;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OpenVideoEditInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "openVideoEdit");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        boolean z;
        List assetList;
        ArrayList arrayList;
        List<String> list;
        List<String> list2;
        String str;
        CreativeInitialModel creativeInitialModel;
        boolean z2;
        Activity LJIJJ;
        Map map;
        if (routeIntent == null || context == null) {
            return false;
        }
        boolean booleanExtra = routeIntent.getExtra().getBooleanExtra("from_jsb", false);
        boolean booleanExtra2 = routeIntent.getExtra().getBooleanExtra("from_deeplink", false);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "media_path");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "upload_type");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "assets");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "shoot_way");
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "anchors");
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "challenge_id");
        String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "challenge_name");
        String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "creation_id");
        Gson gson = new Gson();
        if (LLJJIJIIJIL3 == null || ujb.o.LJJJJJL(LLJJIJIIJIL3)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            assetList = (List) GsonProtectorUtils.fromJson(gson, LLJJIJIIJIL3, new HE6().getType());
        } else {
            assetList = null;
        }
        if (LLJJIJIIJIL5 == null || ujb.o.LJJJJJL(LLJJIJIIJIL5)) {
            arrayList = null;
        } else {
            Object fromJson = GsonProtectorUtils.fromJson(gson, LLJJIJIIJIL5, new HE5().getType());
            o.LJIIIIZZ(fromJson, "gson.fromJson(anchorsStr…teAnchorInfo>>() {}.type)");
            List<CreateAnchorInfo> list3 = (List) fromJson;
            arrayList = new ArrayList(C32I.LJJL(list3, 10));
            for (CreateAnchorInfo createAnchorInfo : list3) {
                AnchorTransData.Companion.getClass();
                arrayList.add(C42890GsQ.LIZ(createAnchorInfo));
            }
        }
        if (LLJJIJIIJIL6 == null || ujb.o.LJJJJJL(LLJJIJIIJIL6)) {
            list = null;
        } else {
            list = (List) GsonProtectorUtils.fromJson(gson, LLJJIJIIJIL6, new HE7().getType());
        }
        if (LLJJIJIIJIL7 == null || ujb.o.LJJJJJL(LLJJIJIIJIL7)) {
            list2 = null;
        } else {
            list2 = (List) GsonProtectorUtils.fromJson(gson, LLJJIJIIJIL7, new HE8().getType());
        }
        String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "extra");
        if (LLJJIJIIJIL9 != null && (map = (Map) GsonProtectorUtils.fromJson(gson, LLJJIJIIJIL9, new HE9().getType())) != null) {
            str = (String) map.get("mlbb_open_platform_extra");
        } else {
            str = null;
        }
        try {
            creativeInitialModel = (CreativeInitialModel) gson.LJI(C16880lQ.LLJJIJIIJIL(routeIntent.getExtra(), "creative_initial_model"), CreativeInitialModel.class);
        } catch (Exception unused) {
            creativeInitialModel = null;
        }
        EditConfig.Builder builder = new EditConfig.Builder();
        builder.creationId(LLJJIJIIJIL8);
        builder.shootWay(LLJJIJIIJIL4);
        builder.challengeId(list);
        builder.challengeNames(list2);
        builder.anchors(arrayList);
        if (booleanExtra || booleanExtra2) {
            z2 = true;
        } else {
            z2 = false;
        }
        builder.isFromJsbOrDeeplink(z2);
        builder.openPlatformExtra(str);
        builder.initialInputModel(creativeInitialModel);
        EditConfig build = builder.build();
        if (booleanExtra2) {
            build.setOnEnterEditListener(new AqS157S0100000_7(context, 113));
        }
        AqS96S0300000_7 aqS96S0300000_7 = new AqS96S0300000_7(creativeInitialModel, context, build, 2);
        if (!o.LJ(LLJJIJIIJIL2, EnumC36116EFk.DEFAULT.getValue()) || assetList == null || assetList.isEmpty()) {
            if ((LLJJIJIIJIL2 != null && LLJJIJIIJIL2.length() != 0) || LLJJIJIIJIL == null || LLJJIJIIJIL.length() == 0) {
                if (booleanExtra2 && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                    LJIJJ.finish();
                    return false;
                }
                return false;
            }
            build.setMediaInfo(new VideoMedia(LLJJIJIIJIL));
            aqS96S0300000_7.invoke();
            return true;
        }
        AqS138S0200000_7 aqS138S0200000_7 = new AqS138S0200000_7(build, aqS96S0300000_7, 14);
        o.LJIIIZ(assetList, "assetList");
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C73282uC(assetList, new HMK(context), aqS138S0200000_7, null), 3);
        return true;
    }
}
