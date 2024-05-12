package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.62r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1540162r {
    public final Keva LIZ;

    public final boolean LIZ() {
        return this.LIZ.getBoolean("last_selected_apply_to_all", true);
    }

    public C1540162r() {
        Keva repo = Keva.getRepo("caption_sticker");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }
}
