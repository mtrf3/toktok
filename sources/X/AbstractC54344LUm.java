package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.LUm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54344LUm implements OpenResultCallback {
    public static final C54345LUn Companion = new C54345LUn();

    public void onActionIntercept() {
    }

    public void onActionPreHandleFinish() {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
    }

    public void onActionStart() {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onEmpty() {
        C113134cH.LIZ(this);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onOpen(Intent intent) {
        C113134cH.LIZIZ(this, intent);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
    }

    public final String getActionName() {
        return getClass().getName();
    }

    public boolean doRealOpen(Context context, String routePrefix, HashMap<String, Object> params, ArrayList<Integer> arrayList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routePrefix, "routePrefix");
        o.LJIIIZ(params, "params");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, routePrefix);
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Integer) {
                String key = entry.getKey();
                Object value2 = entry.getValue();
                o.LJII(value2, "null cannot be cast to non-null type kotlin.Int");
                buildRoute.withParam(key, ((Integer) value2).intValue());
            } else if (value instanceof Long) {
                String key2 = entry.getKey();
                Object value3 = entry.getValue();
                o.LJII(value3, "null cannot be cast to non-null type kotlin.Long");
                buildRoute.withParam(key2, ((Long) value3).longValue());
            } else if (value instanceof Float) {
                String key3 = entry.getKey();
                Object value4 = entry.getValue();
                o.LJII(value4, "null cannot be cast to non-null type kotlin.Float");
                buildRoute.withParam(key3, ((Float) value4).floatValue());
            } else if (value instanceof Double) {
                String key4 = entry.getKey();
                Object value5 = entry.getValue();
                o.LJII(value5, "null cannot be cast to non-null type kotlin.Double");
                buildRoute.withParam(key4, ((Double) value5).doubleValue());
            } else if (value instanceof Boolean) {
                String key5 = entry.getKey();
                Object value6 = entry.getValue();
                o.LJII(value6, "null cannot be cast to non-null type kotlin.Boolean");
                buildRoute.withParam(key5, ((Boolean) value6).booleanValue());
            } else if (value instanceof String) {
                String key6 = entry.getKey();
                Object value7 = entry.getValue();
                o.LJII(value7, "null cannot be cast to non-null type kotlin.String");
                buildRoute.withParam(key6, (String) value7);
            } else if (value instanceof Serializable) {
                String key7 = entry.getKey();
                Object value8 = entry.getValue();
                o.LJII(value8, "null cannot be cast to non-null type java.io.Serializable");
                buildRoute.withParam(key7, (Serializable) value8);
            }
        }
        if (arrayList != null) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                Integer flag = it.next();
                o.LJIIIIZZ(flag, "flag");
                buildRoute.addFlags(flag.intValue());
            }
        }
        buildRoute.withCallback(this);
        buildRoute.open();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean doRealOpen$default(AbstractC54344LUm abstractC54344LUm, Context context, String str, HashMap hashMap, ArrayList arrayList, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                arrayList = null;
            }
            return abstractC54344LUm.doRealOpen(context, str, hashMap, arrayList);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRealOpen");
    }
}
