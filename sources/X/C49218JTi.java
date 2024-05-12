package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import kotlin.jvm.internal.o;

/* renamed from: X.JTi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49218JTi {
    public static Taco LIZIZ(Fragment fragment) {
        C49219JTj c49219JTj;
        o.LJIIIZ(fragment, "fragment");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get by ");
        LIZ.append(fragment);
        X1D.LIZIZ(LIZ);
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(fragment, null), C49219JTj.class, "source_default_key");
        if (LIZLLL == null || (c49219JTj = (C49219JTj) LIZLLL.getSource()) == null) {
            return null;
        }
        return c49219JTj.LJLIL;
    }

    public static Taco LIZ(View view, boolean z) {
        C49219JTj c49219JTj;
        Fragment LJIIIZ;
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get by ");
        LIZ.append(view);
        X1D.LIZIZ(LIZ);
        if (z && ((LJIIIZ = C79234V7u.LJIIIZ(view)) == null || LJIIIZ.getFragmentManager() == null)) {
            return null;
        }
        try {
            InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LJ(view), C49219JTj.class, "source_default_key");
            if (LIZLLL == null || (c49219JTj = (C49219JTj) LIZLLL.getSource()) == null) {
                return null;
            }
            return c49219JTj.LJLIL;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Taco LIZJ(LifecycleOwner owner, String nikeName) {
        o.LJIIIZ(nikeName, "nikeName");
        o.LJIIIZ(owner, "owner");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(nikeName);
        LIZ.append(':');
        LIZ.append(owner.hashCode());
        X1D.LIZIZ(LIZ);
        return new Taco(owner);
    }
}
