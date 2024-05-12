package X;

import android.content.Context;
import java.io.File;
import java.util.HashSet;

/* renamed from: X.Imb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47625Imb {
    public static volatile C47625Imb LIZJ;
    public static boolean LIZLLL;
    public final File LIZ;
    public final java.util.Set<String> LIZIZ = new HashSet();

    public C47625Imb(Context context) {
        this.LIZ = new File(C16880lQ.LLIIIL(context), "saved_events");
    }
}
