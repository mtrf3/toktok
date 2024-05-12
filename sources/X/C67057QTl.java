package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.JsonName;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QTl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67057QTl {
    static {
        C16880lQ.LJLLILLLL(C67057QTl.class);
    }

    public static Object LIZ(Class cls, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object newInstance = cls.newInstance();
            for (Field field : cls.getFields()) {
                JsonName jsonName = (JsonName) field.getAnnotation(JsonName.class);
                if (jsonName != null) {
                    Object opt = jSONObject.opt(jsonName.value());
                    if (opt instanceof JSONObject) {
                        field.set(newInstance, LIZ(field.getType(), opt.toString()));
                    } else if (!(opt instanceof JSONArray)) {
                        field.set(newInstance, opt);
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Serializer: illegalAccessException error");
            LIZ.append(e.getLocalizedMessage());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            return null;
        } catch (InstantiationException e2) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Serializer: instantiationException error");
            LIZ2.append(e2.getLocalizedMessage());
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
            return null;
        } catch (JSONException e3) {
            C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Serializer: string parse json error");
            LIZ3.append(e3.getLocalizedMessage());
            X1D.LIZIZ(LIZ3);
            LJ3.getClass();
            return null;
        }
    }
}
