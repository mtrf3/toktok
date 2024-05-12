package X;

import Y.ARunnableS42S0100000_6;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EeG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36916EeG {
    public static C36916EeG LJFF;
    public static InterfaceC36914EeE LJI;
    public final Context LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public final C36915EeF LIZ() {
        Context context = this.LIZ;
        if (C36912EeC.LIZJ == null) {
            synchronized (C36912EeC.class) {
                if (C36912EeC.LIZJ == null) {
                    C36912EeC.LIZJ = new C36912EeC(context);
                }
            }
        }
        List<C36915EeF> LIZ = C36912EeC.LIZJ.LIZ();
        Logger.debug();
        if (!LIZ.isEmpty()) {
            return (C36915EeF) ListProtector.get(LIZ, 0);
        }
        return null;
    }

    public final boolean LIZJ() {
        Context context;
        if (!this.LIZJ || (context = this.LIZ) == null) {
            return false;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C16880lQ.LLILL(context, "appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = C16880lQ.LLLLL(context).getPackageName();
            int i = applicationInfo.uid;
            Reflect on = Reflect.on(appOpsManager);
            Class<?> cls = Integer.TYPE;
            if (((Integer) on.call("checkOpNoThrow", new Class[]{cls, cls, String.class}, Integer.valueOf(((Integer) on.field("OP_POST_NOTIFICATION", cls).get()).intValue()), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                return false;
            }
        } catch (Throwable unused) {
            if (-1 != 0) {
                return false;
            }
        }
        return true;
    }

    public final void LIZLLL() {
        boolean z;
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            try {
                JSONObject jSONObject = new JSONObject(this.LIZIZ);
                boolean z2 = false;
                if (jSONObject.optInt("is_show", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.LIZJ = z;
                if (jSONObject.optInt("is_cache_message", 1) == 1) {
                    z2 = true;
                }
                this.LJ = z2;
                jSONObject.optInt("show_time_mill", 5000);
                jSONObject.optInt("is_auto_dismiss", 1);
                this.LIZLLL = jSONObject.optInt("cache_size", 2);
                jSONObject.optInt("type", 2005);
                jSONObject.optInt("flag", 1160);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public C36916EeG(Context context) {
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.LIZJ = false;
        this.LIZLLL = 2;
        this.LIZ = C16880lQ.LLLLL(context);
        C16880lQ.LLILL(context, "window");
        handler.postDelayed(new ARunnableS42S0100000_6(this, 26), 10000L);
    }

    public static synchronized C36916EeG LIZIZ(Context context) {
        C36916EeG c36916EeG;
        synchronized (C36916EeG.class) {
            if (LJI != null) {
                if (LJFF == null) {
                    LJFF = new C36916EeG(context);
                }
                c36916EeG = LJFF;
            } else {
                throw new RuntimeException("should call init(context, pushWindowDepend) in Application");
            }
        }
        return c36916EeG;
    }
}
