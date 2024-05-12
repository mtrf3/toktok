package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.4ZI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZI {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        String string = Keva.getRepo("ies_im_core").getString("token", "");
        o.LJIIIIZZ(string, "repo.getString(KEY_TOKEN, \"\")");
        return string;
    }
}
