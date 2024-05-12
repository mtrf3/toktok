package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.3ZG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZG {
    public static final C3ZG LIZ = new C3ZG();
    public static Keva LIZIZ;

    public final synchronized Keva LIZ() {
        Keva keva;
        keva = LIZIZ;
        if (keva == null) {
            keva = KevaImpl.getRepo("im_contact_repo", 1);
            LIZIZ = keva;
            o.LJIIIIZZ(keva, "getRepo(KEVA_REPO, KevaC…OCESS).also { repo = it }");
        }
        return keva;
    }
}
