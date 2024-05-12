package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.05M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05M {
    public static final java.util.Map<Context, InterfaceC71762rk<Float>> LIZ = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r13v0, types: [X.05J] */
    public static final InterfaceC71762rk LIZ(Context context) {
        InterfaceC71762rk interfaceC71762rk;
        java.util.Map<Context, InterfaceC71762rk<Float>> map = LIZ;
        synchronized (map) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                android.net.Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                final XK4 LIZJ = C78934UyQ.LIZJ(-1, null, 6);
                final Handler LIZ2 = C10640bM.LIZ(C16880lQ.LLJJJJ());
                C3C3 c3c3 = new C3C3(new C537429a(contentResolver, uriFor, new ContentObserver(LIZ2) { // from class: X.05J
                    @Override // android.database.ContentObserver
                    public final void onChange(boolean z, android.net.Uri uri) {
                        LIZJ.LJIILLIIL(C76800UCe.LIZ);
                    }
                }, LIZJ, context, null));
                C64962gm LIZIZ = C48841JEv.LIZIZ();
                C3BD.LIZ.getClass();
                obj = V1M.LJJJJLI(c3c3, LIZIZ, new C3BO(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            interfaceC71762rk = (InterfaceC71762rk) obj;
        }
        return interfaceC71762rk;
    }

    public static final AbstractC24810yD LIZIZ(View view) {
        o.LJIIIZ(view, "<this>");
        Object tag = view.getTag(R.id.a4z);
        if (tag instanceof AbstractC24810yD) {
            return (AbstractC24810yD) tag;
        }
        return null;
    }
}
