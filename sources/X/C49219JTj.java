package X;

import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.JTj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49219JTj extends F9E implements InterfaceC80653En {
    public final Taco LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C49219JTj(Taco taco) {
        o.LJIIIZ(taco, "taco");
        this.LJLIL = taco;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }
}
