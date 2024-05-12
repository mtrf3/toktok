package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class EQ6 {
    public static volatile EQ6 LIZJ;
    public static SharedPreferences LIZLLL;
    public List<String> LIZ;
    public final Gson LIZIZ = C60903NvH.LJIIJJI().LIZ();

    public static EQ6 LIZIZ() {
        if (LIZJ == null) {
            synchronized (EQ6.class) {
                LIZLLL = F9J.LIZIZ(C60903NvH.LJ, 0, "commerce_sticker_unlock");
                LIZJ = new EQ6();
            }
        }
        return LIZJ;
    }

    public final List<String> LIZ() {
        List list;
        if (this.LIZ == null) {
            ArrayList arrayList = new ArrayList();
            try {
                String string = LIZLLL.getString("sticker_id_info", null);
                if (!TextUtils.isEmpty(string) && (list = (List) this.LIZIZ.LJII(string, new TypeToken<List<String>>() { // from class: X.2ZF
                }.getType())) != null) {
                    arrayList.addAll(list);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.LIZ = arrayList;
        }
        return this.LIZ;
    }
}
