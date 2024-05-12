package X;

import android.content.SharedPreferences;
import com.google.gson.Gson;

/* renamed from: X.FvU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40532FvU {
    public final Gson LIZ = new Gson();
    public final SharedPreferences LIZIZ;

    public C40532FvU() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_user");
        this.LIZIZ = LIZIZ;
        LIZIZ.edit();
    }
}
