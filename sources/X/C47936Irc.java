package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.Irc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47936Irc {
    public final java.util.Map<String, Integer> LIZ = new HashMap();
    public final java.util.Map<String, String> LIZIZ = new HashMap();
    public final /* synthetic */ C47935Irb LIZJ;

    public C47936Irc(C47935Irb c47935Irb) {
        this.LIZJ = c47935Irb;
    }

    public final synchronized boolean LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ((HashMap) this.LIZ).containsKey(str);
        }
        return false;
    }
}
