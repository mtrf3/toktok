package com.ss.android.ugc.aweme.video.simplayer;

import X.C35127DqV;
import X.C36899Edz;
import X.C47300IhM;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import com.google.gson.j;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class PlayerSettingServiceImpl extends PlayerSettingService {
    @Override // com.ss.android.ugc.playerkit.exp.PlayerSettingService
    public Object get(String str, Type type, Object obj, boolean z, boolean z2) {
        Object obj2;
        Object obj3;
        Object obj4 = null;
        if (z && (obj3 = C36899Edz.LIZ.get(str)) != null) {
            if (obj3 == C36899Edz.LIZIZ) {
                return null;
            }
            return obj3;
        }
        if (z2 && C35127DqV.LIZ()) {
            return obj;
        }
        try {
            Class cls = Boolean.TYPE;
            if (type == cls || type == Short.TYPE || type == Integer.TYPE || type == Long.TYPE || type == Float.TYPE || type == Double.TYPE || type == Boolean.class || type == Short.class || type == Integer.class || type == Long.class || type == Float.class || type == Double.class || type == String.class) {
                C47300IhM.LIZ.getClass();
                Object LIZIZ = C47300IhM.LIZIZ(str, true);
                if (LIZIZ != null) {
                    obj4 = (type == cls || type == Boolean.class) ? Boolean.valueOf(Boolean.parseBoolean(LIZIZ.toString())) : (type == Short.TYPE || type == Short.class) ? Short.valueOf(CastShortProtector.parseShort(LIZIZ.toString())) : (type == Integer.TYPE || type == Integer.class) ? Integer.valueOf(CastIntegerProtector.parseInt(LIZIZ.toString())) : (type == Long.TYPE || type == Long.class) ? Long.valueOf(CastLongProtector.parseLong(LIZIZ.toString())) : (type == Float.TYPE || type == Float.class) ? Float.valueOf(CastFloatProtector.parseFloat(LIZIZ.toString())) : (type == Double.TYPE || type == Double.class) ? Double.valueOf(CastDoubleProtector.parseDouble(LIZIZ.toString())) : LIZIZ.toString();
                }
            } else {
                C47300IhM.LIZ.getClass();
                Object LIZIZ2 = C47300IhM.LIZIZ(str, false);
                if (LIZIZ2 != null) {
                    obj4 = LIZIZ2 instanceof j ? GsonHolder.LIZLLL().LIZ().LIZLLL((j) LIZIZ2, type) : GsonHolder.LIZLLL().LIZ().LJII(LIZIZ2.toString(), type);
                }
            }
        } catch (Throwable unused) {
        }
        if (obj4 != null) {
            obj = obj4;
        }
        if (!z) {
            return obj;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = C36899Edz.LIZ;
        if (obj == null) {
            obj2 = C36899Edz.LIZIZ;
        } else {
            obj2 = obj;
        }
        concurrentHashMap.put(str, obj2);
        return obj;
    }
}
