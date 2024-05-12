package X;

import android.content.SharedPreferences;
import java.util.HashSet;

/* renamed from: X.Ecn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36825Ecn {
    public final SharedPreferences.Editor LIZ;
    public final java.util.Set<String> LIZIZ;

    public C36825Ecn(C29S c29s, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("STICKER_RELATED");
        SharedPreferences LIZIZ = F9J.LIZIZ(c29s, 0, X1D.LIZIZ(LIZ));
        this.LIZ = LIZIZ.edit();
        this.LIZIZ = LIZIZ.getStringSet("remindedIds", new HashSet());
    }
}
