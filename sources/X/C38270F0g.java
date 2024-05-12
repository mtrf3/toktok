package X;

import android.text.TextUtils;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.F0g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38270F0g {
    public long LIZ;
    public final List<String> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();
    public final List<String> LIZLLL = new ArrayList();

    public static String LIZ(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        return a1.LJ(str, "_", str2);
    }
}
