package X;

import Y.IDRunnableS6S0101000;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.Iud, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48123Iud {
    public final SharedPreferences LIZ;
    public final Executor LJ;
    public final ArrayDeque<String> LIZLLL = new ArrayDeque<>();
    public final String LIZIZ = "topic_operation_queue";
    public final String LIZJ = ",";

    public final String LIZIZ() {
        String peek;
        synchronized (this.LIZLLL) {
            peek = this.LIZLLL.peek();
        }
        return peek;
    }

    public final boolean LIZJ(Object obj) {
        boolean remove;
        synchronized (this.LIZLLL) {
            remove = this.LIZLLL.remove(obj);
            if (remove) {
                this.LJ.execute(new IDRunnableS6S0101000(2, this, 23));
            }
        }
        return remove;
    }

    public C48123Iud(SharedPreferences sharedPreferences, Executor executor) {
        this.LIZ = sharedPreferences;
        this.LJ = executor;
    }

    public static C48123Iud LIZ(SharedPreferences sharedPreferences, Executor executor) {
        C48123Iud c48123Iud = new C48123Iud(sharedPreferences, executor);
        synchronized (c48123Iud.LIZLLL) {
            c48123Iud.LIZLLL.clear();
            String string = c48123Iud.LIZ.getString(c48123Iud.LIZIZ, "");
            if (!TextUtils.isEmpty(string) && string.contains(c48123Iud.LIZJ)) {
                String[] split = string.split(c48123Iud.LIZJ, -1);
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        c48123Iud.LIZLLL.add(str);
                    }
                }
            }
        }
        return c48123Iud;
    }
}
