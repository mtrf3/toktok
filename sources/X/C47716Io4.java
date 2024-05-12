package X;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Io4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47716Io4 {
    public static volatile String LIZ;
    public static volatile C0M6<String, List<Object>> LIZIZ = new C0M6<>(4);

    public static void LIZ(String str) {
        if (!TextUtils.isEmpty(str) && LIZIZ.LIZIZ(str) == null) {
            LIZIZ.LIZJ(str, new CopyOnWriteArrayList());
        }
    }
}
