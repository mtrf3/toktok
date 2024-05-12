package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EaC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36664EaC implements InterfaceC65104Pgq {
    public static final java.util.Map<String, List<String>> LIZ;
    public static final List<String> LIZIZ;

    static {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        java.util.Map<String, List<String>> map = C27099AkJ.LIZ;
        java.util.Map<String, List<String>> map2 = (java.util.Map) LIZLLL.LJIIIIZZ("ec_debug_panel_path_to_pagename", java.util.Map.class, map);
        if (map2 != null) {
            map = map2;
        }
        LIZ = map;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        LIZIZ = arrayList;
    }

    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        String str;
        Object obj;
        RYH ryh;
        ProductInfoPackData productInfoPackData;
        List<ProductPackStruct> list;
        ProductPackStruct productPackStruct;
        String str2;
        TypedByteArray typedByteArray;
        String str3;
        C36910EeA c36910EeA;
        o.LJIIIZ(request, "request");
        String path = request.getPath();
        if (((ArrayList) LIZIZ).contains(path)) {
            try {
                List<String> list2 = LIZ.get(path);
                if (list2 != null) {
                    TypedInput typedInput = null;
                    if (c64797Pbt == null) {
                        str = null;
                    } else {
                        str = C51029K0z.LJJIII(c64797Pbt);
                    }
                    HashMap hashMap = new HashMap();
                    if (str != null) {
                        hashMap.put("log_id", str);
                    }
                    o.LJIIIIZZ(path, "path");
                    hashMap.put("path", path);
                    if (c64797Pbt == null) {
                        obj = null;
                    } else {
                        obj = c64797Pbt.LIZIZ;
                    }
                    hashMap.put("requestParams", V1B.LJJLL(request));
                    if (obj instanceof Response) {
                        hashMap.put("code", String.valueOf(((Response) obj).code));
                        hashMap.put("message", String.valueOf(((Response) obj).message));
                    } else if (obj instanceof BaseResponse) {
                        hashMap.put("code", String.valueOf(((BaseResponse) obj).error_code));
                        String str4 = ((BaseResponse) obj).message;
                        str4.toString();
                        hashMap.put("message", str4);
                    }
                    if (c64797Pbt != null && (c36910EeA = c64797Pbt.LIZ) != null) {
                        typedInput = c36910EeA.LJ;
                    }
                    if ((typedInput instanceof TypedByteArray) && (typedByteArray = (TypedByteArray) typedInput) != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            typedByteArray.writeTo(byteArrayOutputStream);
                            str3 = byteArrayOutputStream.toString();
                            o.LJIIIIZZ(str3, "{\n        typedByteArray…utStream.toString()\n    }");
                        } catch (Exception unused) {
                            str3 = "";
                        } catch (Throwable th2) {
                            byteArrayOutputStream.close();
                            throw th2;
                        }
                        byteArrayOutputStream.close();
                        hashMap.put("response", str3);
                    }
                    HashMap hashMap2 = new HashMap();
                    if (o.LJ(path, "/api/v1/shop/product_info/get") && (obj instanceof RYH) && (ryh = (RYH) obj) != null && (productInfoPackData = (ProductInfoPackData) ryh.data) != null && (list = productInfoPackData.productionInfoPack) != null && (productPackStruct = (ProductPackStruct) ORZ.LJLLLLLL(0, list)) != null && (str2 = productPackStruct.productId) != null) {
                        hashMap.put("product_id", str2);
                        hashMap2.put("product_id", str2);
                    }
                    PageMonitor.LIZ.LIZJ(hashMap, hashMap2, list2);
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th3) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th3));
            }
        }
    }
}
