package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JIH implements JIB {
    public final /* synthetic */ C49113JPh LIZ;

    @Override // X.JIB
    public final /* synthetic */ Fragment LIZ() {
        return null;
    }

    @Override // X.JIB
    public final boolean LIZIZ() {
        JIB jib = this.LIZ.LJLJJI;
        if (jib == null || !jib.LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.JIB
    public final InterfaceC47667InH LIZJ() {
        JIB jib = this.LIZ.LJLJJI;
        if (jib != null) {
            return jib.LIZJ();
        }
        return null;
    }

    @Override // X.JIB
    public final Context getContext() {
        Context context;
        JIB jib = this.LIZ.LJLJJI;
        if (jib == null || (context = jib.getContext()) == null) {
            Context context2 = this.LIZ.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            return context2;
        }
        return context;
    }

    @Override // X.JIB
    public final String getIdentifier() {
        String identifier;
        JIB jib = this.LIZ.LJLJJI;
        if (jib == null || (identifier = jib.getIdentifier()) == null) {
            return "";
        }
        return identifier;
    }

    @Override // X.JIB
    public final boolean isActive() {
        JIB jib = this.LIZ.LJLJJI;
        if (jib != null && jib.isActive() && this.LIZ.LJLJJLL) {
            return true;
        }
        return false;
    }

    public JIH(C49113JPh c49113JPh) {
        this.LIZ = c49113JPh;
    }
}
