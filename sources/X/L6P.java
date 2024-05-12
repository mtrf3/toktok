package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6P implements L6O {
    @Override // X.L6O
    public final String LIZLLL() {
        return null;
    }

    @Override // X.L6O
    public final void LJFF(LifecycleOwner lifecycleOwner, AqS62S1100000_9 aqS62S1100000_9) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
    }

    @Override // X.L6O
    public final void LJIIIIZZ(List<? extends User> list, EnumC53719L6l enumC53719L6l) {
    }

    @Override // X.L6O
    public final void LJIIJ(String str) {
    }

    @Override // X.L6O
    public final boolean LJIIJJI(EnumC53719L6l scene) {
        o.LJIIIZ(scene, "scene");
        return false;
    }

    @Override // X.L6O
    public final C53710L6c LJ() {
        return new C53710L6c(0, 7);
    }

    @Override // X.L6O
    public final InterfaceC53698L5q LJII() {
        return new L64();
    }

    @Override // X.L6O
    public final L6U LJIIIZ() {
        return new C47261Igj();
    }

    @Override // X.L6O
    public final C53710L6c LIZ(User user) {
        return new C53710L6c(0, 6);
    }

    @Override // X.L6O
    public final C53710L6c LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return new C53710L6c(-1, 6);
    }

    @Override // X.L6O
    public final void LJI(String tag) {
        o.LJIIIZ(tag, "tag");
    }

    @Override // X.L6O
    public final L6T LJIIL(EnumC53719L6l scene) {
        o.LJIIIZ(scene, "scene");
        return new L6S();
    }

    @Override // X.L6O
    public final void LIZJ(String tag, InterfaceC54403LWt listener) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(listener, "listener");
    }
}
