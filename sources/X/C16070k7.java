package X;

import android.os.Build;
import com.google.gson.internal.i;
import com.google.gson.internal.j;

/* renamed from: X.0k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16070k7 {
    public static final InterfaceC16060k6 LIZ;

    static {
        InterfaceC16060k6 iVar;
        if (Build.VERSION.SDK_INT >= 24) {
            iVar = new j();
        } else {
            iVar = new i();
        }
        LIZ = iVar;
    }
}
