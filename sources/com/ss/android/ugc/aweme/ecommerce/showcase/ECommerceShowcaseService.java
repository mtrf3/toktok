package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.C141415gn;
import X.C27739Aud;
import X.C36620EYu;
import X.C52221KeX;
import X.C58096Mr6;
import X.C61845OOz;
import X.C78685UuP;
import X.OUP;
import X.PII;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabShowcaseFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.RestrictDialog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import ujb.o;

/* loaded from: classes11.dex */
public final class ECommerceShowcaseService implements IECommerceShowcaseService {
    public static IECommerceShowcaseService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IECommerceShowcaseService.class, false);
        if (LIZ != null) {
            return (IECommerceShowcaseService) LIZ;
        }
        if (C58096Mr6.Z == null) {
            synchronized (IECommerceShowcaseService.class) {
                if (C58096Mr6.Z == null) {
                    C58096Mr6.Z = new ECommerceShowcaseService();
                }
            }
        }
        return C58096Mr6.Z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final C36620EYu LJII() {
        if (C52221KeX.LIZ()) {
            return C36620EYu.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LIZIZ(FragmentManager fragmentManager) {
        Bundle LIZ = C141415gn.LIZ("height", -1);
        RestrictDialog restrictDialog = new RestrictDialog();
        restrictDialog.setArguments(LIZ);
        restrictDialog.show(fragmentManager, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final TabCommerceFragment LIZLLL(int i) {
        if (i == 14) {
            return new TabStoreFragment();
        }
        return new TabShowcaseFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[Catch: Exception -> 0x00d9, CancellationException -> 0x00db, all -> 0x00f5, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:12:0x008b, B:13:0x008e, B:15:0x0092, B:18:0x00ae, B:21:0x00b9, B:25:0x00c0, B:26:0x00c4, B:29:0x00d5, B:36:0x00df, B:38:0x00e5, B:53:0x00f4), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.Map r14, java.lang.String r15, X.InterfaceC67352kd r16) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService.LJFF(java.util.Map, java.lang.String, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final View LIZJ(View view, Integer num, String str, Integer num2, Boolean bool) {
        boolean z;
        if (num == null || num.intValue() != 2) {
            return null;
        }
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!kotlin.jvm.internal.o.LJ(bool, Boolean.TRUE)) {
                return null;
            }
            View LJIL = OUP.LJIL(R.layout.a85, view, false);
            LJIL.setBackgroundResource(R.drawable.agg);
            ((TuxIconView) LJIL.findViewById(R.id.inq)).setTintColorRes(R.attr.gp);
            ((TextView) LJIL.findViewById(R.id.inu)).setText("N/A");
            return LJIL;
        }
        View LJIL2 = OUP.LJIL(R.layout.a85, view, false);
        if (num2 != null && num2.intValue() >= 50) {
            LJIL2.setBackgroundResource(R.drawable.agf);
            ((TuxIconView) LJIL2.findViewById(R.id.inq)).setTintColorRes(R.attr.e9);
        } else {
            LJIL2.setBackgroundResource(R.drawable.age);
            ((TuxIconView) LJIL2.findViewById(R.id.inq)).setTintColorRes(R.attr.e7);
        }
        ((TextView) LJIL2.findViewById(R.id.inu)).setText(str);
        return LJIL2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LIZ(String str, String str2, String str3, String str4, Map params, boolean z) {
        String str5;
        kotlin.jvm.internal.o.LJIIIZ(params, "params");
        params.put("page_name", str2);
        if (str == null) {
            str = "";
        }
        params.put("shop_id", str);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        params.put("is_self", str5);
        params.put("traceparent", PII.LIZIZ());
        boolean z2 = true;
        if (str3 != null && !o.LJJJJJL(str3)) {
            params.put("entrance_info", str3);
        }
        if (str4 != null && !o.LJJJJJL(str4)) {
            z2 = false;
        }
        if (!z2) {
            params.put("source_page_type", str4);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) params;
        Object obj = linkedHashMap.get("origin_source_page");
        if (obj != null || (obj = linkedHashMap.get("source_page_type")) != null) {
            params.put("origin_source_page", obj);
        }
        C78685UuP.LJJLIIIJJIZ("tiktokec_shop_entrance_show", params);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.content.Context r11, java.lang.String r12, java.lang.String r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService.LJI(android.content.Context, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LJIIIIZZ(String enterFrom, String str, String str2, String str3, boolean z, Integer num, String str4, String str5, String str6, String str7, Map<String, ? extends Object> map) {
        String str8;
        kotlin.jvm.internal.o.LJIIIZ(enterFrom, "enterFrom");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            Object obj = map.get("interaction_content");
            if (obj != null) {
                linkedHashMap.put("interaction_content", obj);
            }
            Object obj2 = map.get("index");
            if (obj2 != null) {
                linkedHashMap.put("index", obj2);
            }
            Object obj3 = map.get("author_type");
            if (obj3 != null) {
                linkedHashMap.put("author_type", obj3);
            }
            Object obj4 = map.get("sales_num");
            if (obj4 != null) {
                linkedHashMap.put("sales_num", obj4);
            }
            Object obj5 = map.get("has_red_dot");
            if (obj5 != null) {
                linkedHashMap.put("has_red_dot", obj5);
            }
        }
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("enter_from", enterFrom);
        if (str2 != null && !o.LJJJJJL(str2)) {
            linkedHashMap.put("entrance_type", str2);
        }
        if (str3 != null && !o.LJJJJJL(str3)) {
            linkedHashMap.put("author_id", str3);
        }
        if (str6 != null && !o.LJJJJJL(str6)) {
            linkedHashMap.put("search_result_id", str6);
        }
        if (str7 != null && !o.LJJJJJL(str7)) {
            linkedHashMap.put("list_source_content_id", str7);
        }
        if (str4 != null && !o.LJJJJJL(str4)) {
            linkedHashMap.put("previous_page", str4);
        }
        if (str5 != null && !o.LJJJJJL(str5)) {
            linkedHashMap.put("search_id", str5);
        }
        if (z) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_self", str8);
        linkedHashMap.put("traceparent", PII.LIZIZ());
        if (num != null) {
            C61845OOz.LIZLLL(num, linkedHashMap, "follow_status");
        }
        C78685UuP.LJJLIIIJJIZ("tiktokec_showcase_entrance_show", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService
    public final void LJ(Context context, String link, String str, String enterFrom, String str2, String str3, boolean z, Integer num, String str4, String str5, String str6, String str7, Map<String, Object> trackParams) {
        kotlin.jvm.internal.o.LJIIIZ(link, "link");
        kotlin.jvm.internal.o.LJIIIZ(enterFrom, "enterFrom");
        kotlin.jvm.internal.o.LJIIIZ(trackParams, "trackParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = trackParams.get("interaction_content");
        if (obj != null) {
            linkedHashMap.put("interaction_content", obj);
        }
        Object obj2 = trackParams.get("index");
        if (obj2 != null) {
            linkedHashMap.put("index", obj2);
        }
        Object obj3 = trackParams.get("author_type");
        if (obj3 != null) {
            linkedHashMap.put("author_type", obj3);
        }
        Object obj4 = trackParams.get("sales_num");
        if (obj4 != null) {
            linkedHashMap.put("sales_num", obj4);
        }
        if (str != null && !o.LJJJJJL(str)) {
            linkedHashMap.put("author_id", str);
        }
        if (str4 != null && !o.LJJJJJL(str4)) {
            linkedHashMap.put("previous_page", str4);
        }
        if (str3 != null && !o.LJJJJJL(str3)) {
            linkedHashMap.put("entrance_type", str3);
        }
        linkedHashMap.put("is_self", Integer.valueOf(z ? 1 : 0));
        if (num != null) {
            C61845OOz.LIZLLL(num, linkedHashMap, "follow_status");
        }
        linkedHashMap.put("enter_from", enterFrom);
        trackParams.put("enter_from", enterFrom);
        linkedHashMap.put("page_name", str2);
        trackParams.put("source_previous_page", str2);
        if (str5 != null && !o.LJJJJJL(str5)) {
            linkedHashMap.put("search_id", str5);
            trackParams.put("search_id", str5);
        }
        if (str6 != null && !o.LJJJJJL(str6)) {
            linkedHashMap.put("search_result_id", str6);
            trackParams.put("search_result_id", str6);
        }
        if (str7 != null && !o.LJJJJJL(str7)) {
            linkedHashMap.put("list_source_content_id", str7);
            trackParams.put("list_source_content_id", str7);
        }
        C78685UuP.LJJLIIIJJIZ("tiktokec_showcase_entrance_click", linkedHashMap);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(link);
        LIZ.append("&is_self=");
        LIZ.append(z);
        LIZ.append("&trackParams=");
        LIZ.append(Uri.encode(C27739Aud.LJI(trackParams)));
        LIZ.append("&_ec_start_time=");
        LIZ.append(System.currentTimeMillis());
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ)).open();
    }
}
