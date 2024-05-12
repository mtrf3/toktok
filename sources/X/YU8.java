package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;

/* loaded from: classes16.dex */
public final class YU8 implements YU5<Object> {
    public volatile C62191Oax LJLIL;
    public final Object LJLILLLLZI = new Object();
    public final Fragment LJLJI;

    public final Object LIZ() {
        if (this.LJLJI.getHost() != null) {
            C78866UxK.LJIL("Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.LJLJI.getHost() instanceof YU5, this.LJLJI.getHost().getClass());
            C253109wY LJIIL = ((YUB) ((YU5) this.LJLJI.getHost()).generatedComponent()).LJIIL();
            Fragment fragment = this.LJLJI;
            LJIIL.getClass();
            fragment.getClass();
            LJIIL.getClass();
            return new C62191Oax(LJIIL.LIZ, LJIIL.LIZIZ, LJIIL.LIZJ);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLIL == null) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLIL == null) {
                    this.LJLIL = (C62191Oax) LIZ();
                }
            }
        }
        return this.LJLIL;
    }

    public YU8(Fragment fragment) {
        this.LJLJI = fragment;
    }

    public static final Context LIZIZ(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
