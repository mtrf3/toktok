package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Uxm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78894Uxm implements C0K7, InterfaceC78775Uvr, InterfaceC48038ItG, InterfaceC1286253a, InterfaceC78896Uxo {
    public static Method LJLIL;
    public static boolean LJLILLLLZI;
    public static Field LJLJI;
    public static boolean LJLJJI;
    public static long LJLJJLL;
    public static final C78894Uxm LJLJJL = new C78894Uxm();
    public static final C78894Uxm LJLJL = new C78894Uxm();

    public static void LIZLLL(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7350045427200848320")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC78775Uvr
    public void LIZ() {
    }

    @Override // X.InterfaceC78775Uvr
    public void LIZJ() {
    }

    @Override // X.InterfaceC78896Uxo
    public V8O Xk() {
        return V8O.LJ.Xk();
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C221018lt.LIZJ("MiddleDataSource", "refresh shop error", it);
        return new OSZ(MPO.SHOP_IM, new NoticeListsResponse(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0));
    }

    public void LJII(int i, View view) {
        if (!LJLJJI) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                LJLJI = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            LJLJJI = true;
        }
        Field field = LJLJI;
        if (field != null) {
            try {
                LJLJI.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void LJ(String str, O5Z o5z, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        try {
            jSONObject.put("from", str);
        } catch (JSONException unused) {
        }
        InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
        if (interfaceC31203CMl != null) {
            interfaceC31203CMl.LJFF(currentTimeMillis, jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("live_container_type", "webview");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("duration", currentTimeMillis);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("platform", 0);
        } catch (JSONException e3) {
            C16880lQ.LLLLIIL(e3);
        }
        VMI.LJ.LJIILLIIL(o5z, null, "hybrid_container_init_duration", jSONObject2, jSONObject3, null, jSONObject4);
    }

    public static void LJFF(int i, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis() - LJLJJLL;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        try {
            jSONObject.put("from", str);
        } catch (JSONException unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        try {
            jSONObject.put("url", str2);
        } catch (JSONException unused2) {
        }
        if (i == 0) {
            C0K2.LJIIJ(i, currentTimeMillis, "ttlive_webview_offline_all", jSONObject);
        } else {
            C0K2.LJIIJJI(i, "ttlive_webview_offline_all", jSONObject);
        }
    }

    @Override // X.InterfaceC1286253a
    public void LIZIZ(View itemView, TextView textView, ImageView imageView, MotionEvent motionEvent) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(imageView, "imageView");
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return;
            }
            imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            return;
        }
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).start();
    }

    public void LJI(View view, int i, int i2, int i3, int i4) {
        if (!LJLILLLLZI) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                LJLIL = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            LJLILLLLZI = true;
        }
        Method method = LJLIL;
        if (method != null) {
            try {
                LIZLLL(view, method, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
