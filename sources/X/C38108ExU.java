package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ExU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38108ExU {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC38085Ex7 LIZ(EnumC38078Ex0 enumC38078Ex0) {
        int i = C38080Ex2.LIZ[enumC38078Ex0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC38085Ex7.SECURE;
                    }
                    throw new C162476Zf();
                }
                return EnumC38085Ex7.PUBLIC;
            }
            return EnumC38085Ex7.PROTECT;
        }
        return EnumC38085Ex7.PRIVATE;
    }

    public static C38111ExX LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz) {
        Context context;
        View view;
        C60737Nsb hybridContext;
        InterfaceC60710NsA interfaceC60710NsA;
        View LIZJ;
        C38111ExX c38111ExX = new C38111ExX(interfaceC60761Nsz);
        android.net.Uri uri = null;
        if (interfaceC60761Nsz != null && (LIZJ = interfaceC60761Nsz.LIZJ()) != null) {
            context = LIZJ.getContext();
        } else {
            context = null;
        }
        c38111ExX.LIZ = context;
        if (interfaceC60761Nsz != null) {
            view = interfaceC60761Nsz.LIZJ();
        } else {
            view = null;
        }
        c38111ExX.LJ = view;
        if (interfaceC60761Nsz != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null && (interfaceC60710NsA = hybridContext.hybridParams) != null) {
            uri = interfaceC60710NsA.LIZIZ();
        }
        c38111ExX.LIZIZ = String.valueOf(uri);
        return c38111ExX;
    }

    public static final Object LIZJ(String str, AbstractC38082Ex4<?, ?> target) {
        o.LJIIIZ(target, "target");
        Type genericSuperclass = target.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            o.LJIIIIZZ(actualTypeArguments, "type as ParameterizedType).actualTypeArguments");
            Type type = actualTypeArguments[0];
            o.LJIIIZ(type, "type");
            if (o.LJ(type, JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
                return new JSONObject(str);
            }
            return GsonProtectorUtils.fromJson(C65358Pkw.LIZ, str, type);
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
