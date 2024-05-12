package com.kakao.sdk.network;

import X.AbstractC65015PfP;
import X.C58314Muc;
import X.C65018PfS;
import X.C65379PlH;
import X.C65429Pm5;
import X.C71313Ryn;
import X.InterfaceC65017PfR;
import X.OKG;
import X.ORZ;
import com.kakao.sdk.common.json.IntDate;
import com.kakao.sdk.common.json.MapToQuery;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.Utility;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KakaoRetrofitConverterFactory extends AbstractC65015PfP {
    /* renamed from: stringConverter$lambda-0 */
    public static final String m98stringConverter$lambda0(Enum r2) {
        o.LJIIIZ(r2, "enum");
        return C58314Muc.LIZIZ(KakaoJson.INSTANCE.toJson(r2), 1, 1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
    }

    /* renamed from: stringConverter$lambda-2$lambda-1 */
    public static final String m99stringConverter$lambda2$lambda1(Date value) {
        o.LJIIIZ(value, "value");
        return String.valueOf(value.getTime() / 1000);
    }

    /* renamed from: stringConverter$lambda-4$lambda-3 */
    public static final String m100stringConverter$lambda4$lambda3(Map map) {
        o.LJIIIZ(map, "map");
        return Utility.INSTANCE.buildQuery(map);
    }

    /* renamed from: stringConverter$lambda-5 */
    public static final String m101stringConverter$lambda5(Object value) {
        o.LJIIIZ(value, "value");
        return KakaoJson.INSTANCE.toJson(value);
    }

    @Override // X.AbstractC65015PfP
    public InterfaceC65017PfR<?, String> stringConverter(Type type, Annotation[] annotationArr, C65018PfS c65018PfS) {
        if (o.LJ(type, String.class)) {
            return null;
        }
        if ((type instanceof Class) && ((Class) type).isEnum()) {
            return new C65429Pm5();
        }
        if (o.LJ(type, Date.class) && annotationArr != null) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof IntDate) {
                    arrayList.add(annotation);
                }
            }
            if (ORZ.LJLLLL(arrayList) != null) {
                return new C65379PlH();
            }
        }
        if ((type instanceof ParameterizedType) && o.LJ(((ParameterizedType) type).getRawType(), Map.class) && annotationArr != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation2 : annotationArr) {
                if (annotation2 instanceof MapToQuery) {
                    arrayList2.add(annotation2);
                }
            }
            if (ORZ.LJLLLL(arrayList2) != null) {
                return new C71313Ryn();
            }
        }
        return new OKG();
    }
}
