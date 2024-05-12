package X;

import android.text.TextUtils;
import java.util.Queue;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8W implements InterfaceC48038ItG, InterfaceC84511XEt {
    public static final O8W LJLIL = new O8W();

    @Override // X.InterfaceC84511XEt
    public boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC84511XEt
    public void LIZIZ(Queue queue) {
        o.LJIIIZ(queue, "queue");
    }

    @Override // X.InterfaceC84511XEt
    public void LJFF() {
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        return C73536StY.LJLIL;
    }

    public static Object LIZJ(String str, String str2, C14Q c14q) {
        long currentTimeMillis = System.currentTimeMillis();
        Object apply = c14q.apply(null);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str2, System.currentTimeMillis() - currentTimeMillis);
                O8O.LIZLLL().LJI(str, jSONObject, null);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return apply;
    }
}
