package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: X.IOl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46543IOl {
    public final Object LIZ = new Object();
    public final Object LIZIZ = new Object();
    public final LinkedList<Pair<String, JSONObject>> LIZJ = new LinkedList<>();
    public final LinkedList<Pair<String, java.util.Map<String, Object>>> LIZLLL = new LinkedList<>();

    public final JSONObject LIZ(String str) {
        try {
            synchronized (this.LIZ) {
                if (!TextUtils.isEmpty(str) && !this.LIZJ.isEmpty()) {
                    Iterator<Pair<String, JSONObject>> it = this.LIZJ.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (TextUtils.equals(str, (CharSequence) it.next().first)) {
                            return (JSONObject) this.LIZJ.get(i).second;
                        }
                        i++;
                    }
                }
                return null;
            }
        } catch (Exception e) {
            if (C46982IcE.LIZIZ() == null || !C46982IcE.LIZIZ().isDebug()) {
                return null;
            }
            throw new RuntimeException(e);
        }
    }

    public final void LIZIZ(String str, java.util.Map map) {
        try {
            synchronized (this.LIZIZ) {
                if (!TextUtils.isEmpty(str) && map != null) {
                    if (this.LIZLLL.size() > 5) {
                        this.LIZLLL.remove(0);
                    }
                    this.LIZLLL.add(new Pair<>(str, map));
                }
            }
        } catch (Exception e) {
            if (C46982IcE.LIZIZ() == null || !C46982IcE.LIZIZ().isDebug()) {
            } else {
                throw new RuntimeException(e);
            }
        }
    }
}
